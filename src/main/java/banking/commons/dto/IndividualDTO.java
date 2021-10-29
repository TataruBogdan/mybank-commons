package banking.commons.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class IndividualDTO {

    @NotNull
    private Integer id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String address;
    private Date birthDate;
    private String phoneNumber;

    @NotNull
    @Email(regexp = ".+@.+\\..+", message = "Please provide a valid email address")
    private String emailAddress;

    @NotNull
    @Pattern(regexp = "^[0-9]{13}$", message = "Please provide 13 cyphers")
    private String cnp;
    private String employerName;
    private String occupation;
}
