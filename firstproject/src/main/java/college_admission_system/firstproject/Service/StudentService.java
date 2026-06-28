package college_admission_system.firstproject.Service;


import college_admission_system.firstproject.Repository.StudentRepository;
import college_admission_system.firstproject.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
   private StudentRepository studentRepository;

    public StudentEntity saveStudent(StudentEntity student){
        return studentRepository.save(student);
    }

}
