package exercise.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class GuestCreateDTO {
    @NotBlank
    @NotNull
    private String name;

    @Email
    private String email;

    @Pattern(regexp = "^\\+\\d{11,13}$")
    private String phoneNumber;

    @Size(min = 4, max = 4)
    private String clubCard;

    @Future
    private LocalDate cardValidUntil;
}
// END
