package EmployeController;



import Service.EmployeService;
import com.MDspringBackend.app.MikeDemSpringBootbackend.Model.Employe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmpController {

    private EmployeService employeService;

    public EmpController(EmployeService employeService) {
        super();
        this.employeService = employeService;
    }

    //create employe REST API
    @PostMapping()
    public ResponseEntity<Employe> saveEmployee(@RequestBody Employe employe)
    {
        return new ResponseEntity< Employe>(employeService.saveEmployee(employe), HttpStatus.CREATED);
    }

}
