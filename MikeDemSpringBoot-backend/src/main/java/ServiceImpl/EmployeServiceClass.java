package ServiceImpl;

import Repository.EmployeRepository;
import com.MDspringBackend.app.MikeDemSpringBootbackend.Model.Employe;
import org.springframework.stereotype.Service;
import Service.EmployeService;

@Service
public class EmployeServiceClass implements EmployeService {


    private EmployeRepository employeRepository;

    public EmployeServiceClass(EmployeRepository employeRepdsitory)
    {
        super();
        this.employeRepository = employeRepdsitory;
    }

    @Override
    public Employe saveEmployee(Employe employe)
    {
        return employeRepository.save(employe);
    }



}
