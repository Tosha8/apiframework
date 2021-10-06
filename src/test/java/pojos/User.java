package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;

@Data
@JsonIgnoreProperties
public class User {
    private int id;
    private String name;
    private  String email;
    private String gender;
    private String status;
}
