package practice.fileUpload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    /*
    {
    "id": 0,
    "name": "string"
  }
     */
    private int id;
    private String name;

}
