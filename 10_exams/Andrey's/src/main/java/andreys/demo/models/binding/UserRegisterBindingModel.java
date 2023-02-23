package andreys.demo.models.binding;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class UserRegisterBindingModel {

    @Length(min = 2, message = "Username length must be more than two characters")
    private String username;
    @Email(message = "Enter valid email!")
    private String email;
    @DecimalMin(value = "0", message = "Budget must be positive number!")
    private BigDecimal budget;
    @Length(min = 2, message = "Password length must be more than two characters")
    private String password;
    private String confirmPassword;
}
