package shoplist.shoppinglist.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import shoplist.shoppinglist.model.entity.User;
import shoplist.shoppinglist.model.service.UserServiceModel;
import shoplist.shoppinglist.repository.UserRepository;
import shoplist.shoppinglist.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void register(UserServiceModel userServiceModel) {
        userRepository
                .save(modelMapper.map(userServiceModel, User.class));
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {
        return userRepository
                .findByUsernameAndPassword(username, password)
                .map(user -> modelMapper.map(user, UserServiceModel.class))
                .orElse(null);
    }
}
