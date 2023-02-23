package andreys.demo.models.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class UserServiceModel extends BaseServiceModel {

    private String username;
    private String password;
    private String email;
    private BigDecimal budget;
}
