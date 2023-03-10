package andreys.demo.service;

import andreys.demo.models.entities.Item;
import andreys.demo.models.service.ItemServiceModel;
import andreys.demo.models.view.ItemViewModel;
import andreys.demo.repositories.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    private final ModelMapper modelMapper;
    private final CategoryService categoryService;

    public ItemServiceImpl(ItemRepository itemRepository, ModelMapper modelMapper, CategoryService categoryService) {
        this.itemRepository = itemRepository;
        this.modelMapper = modelMapper;
        this.categoryService = categoryService;
    }

    @Override
    public void addItem(ItemServiceModel itemServiceModel) {
        Item item = this.modelMapper
                .map(itemServiceModel, Item.class);
        item.setCategory(this.categoryService.find(itemServiceModel.getCategory().getCategoryName()));
        this.itemRepository.saveAndFlush(item);
    }

    @Override
    public List<ItemViewModel> findAllItems() {
        return this.itemRepository.findAll()
                .stream()
                .map(item -> {
                    ItemViewModel itemViewModel = this.modelMapper
                            .map(item, ItemViewModel.class);
                    itemViewModel.setImageUrl(String.format
                            ("/img/%s-%s.jpg", item.getGender(),
                                    item.getCategory().getName().name()));
                    return itemViewModel;
                }).collect(Collectors.toList());
    }

    @Override
    public ItemViewModel findById(String id) {
        return this.itemRepository.findById(id)
                .map(item -> {
                    ItemViewModel itemViewModel = this.modelMapper
                            .map(item, ItemViewModel.class);
                    itemViewModel.setImageUrl(String.format
                            ("/img/%s-%s.jpg", item.getGender(),
                                    item.getCategory().getName().name()));
                    return itemViewModel;
                }).orElse(null);
    }

    @Override
    public void delete(String id) {
        this.itemRepository.deleteById(id);
    }

    @Override
    public ItemServiceModel findByName(String name) {

        return this.itemRepository.findByName(name)
                .map(item -> {
                    ItemServiceModel itemServiceModel =
                            this.modelMapper.map(item, ItemServiceModel.class);
                    return itemServiceModel;
                }).orElse(null);
    }
}
