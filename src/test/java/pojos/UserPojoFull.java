package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPojoFull {
    private int id;
    private String avatar;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String email;

    public String getLastName() {return  lastName; }
    public int getId() {return  id; }
    public String getAvatar() {return  avatar; }
    public String getFirstname() {return  firstName; }
    public String getEmail() {return  email; }

}
