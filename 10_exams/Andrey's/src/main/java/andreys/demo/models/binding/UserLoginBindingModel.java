package andreys.demo.models.binding;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@Getter
@Setter
public class UserLoginBindingModel {

    @Length(min = 2, message = "Username length must be more than two characters")
    private String username;
    @Length(min = 2, message = "Password length must be more than two characters")
    private String password;
}
