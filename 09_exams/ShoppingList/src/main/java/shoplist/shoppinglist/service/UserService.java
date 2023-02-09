package shoplist.shoppinglist.service;

import shoplist.shoppinglist.model.service.UserServiceModel;

public interface UserService {
    boolean register(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);
}
