package andreys.demo.service;

import andreys.demo.models.service.UserServiceModel;

public interface UserService {
    void register(UserServiceModel userServiceModel);

    UserServiceModel findByUsername(String username);
}
