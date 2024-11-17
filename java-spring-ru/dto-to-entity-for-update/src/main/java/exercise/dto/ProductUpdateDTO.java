package exercise.dto;

import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class ProductUpdateDTO {
    private long id;

    private String title;

    private int price;
}
// END
