package college_admission_system.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "students")
public class StudentEntity {

    @Id
    private String id;

    private String firstName;
    private String middleName;
    private String lastName;

    private String fatherName;
    private String motherName;

    private String email;
    private String mobileNumber;

    private Double tenthPercentage;
    private Double twelfthPercentage;

    private String course;

}
