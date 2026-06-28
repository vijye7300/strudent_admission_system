package college_admission_system.firstproject.Controller;

import college_admission_system.firstproject.Service.EmailService;
import college_admission_system.firstproject.Service.StudentService;
import college_admission_system.firstproject.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdmissionController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private EmailService emailService;

        @GetMapping("from")
        public String showfrom(){
        return "admission-form";

    }




    @PostMapping("/submit")
    public String register(StudentEntity student){

        studentService.saveStudent(student);

        // emailService.sendEmail(student.getEmail(), "Hello", "Test");

        return "admission-form";
    }



}
