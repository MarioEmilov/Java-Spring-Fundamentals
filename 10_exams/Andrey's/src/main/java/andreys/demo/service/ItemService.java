package andreys.demo.service;

import andreys.demo.models.service.ItemServiceModel;
import andreys.demo.models.view.ItemViewModel;

import java.util.List;

public interface ItemService {
    void addItem(ItemServiceModel map);

    List<ItemViewModel> findAllItems();

    ItemViewModel findById(String id);

    void delete(String id);

    ItemServiceModel findByName(String name);
}
