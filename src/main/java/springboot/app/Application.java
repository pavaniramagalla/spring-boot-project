package springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import springboot.app.model.Assets;
import springboot.app.model.Employee;
import springboot.app.repository.AssetsRepository;
import springboot.app.repository.EmployeeRepository;
import springboot.app.repository.OrganizationRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(Application.class, args);
        OrganizationRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
        OrganizationRepository asstesRepository = configurableApplicationContext.getBean(AssetsRepository.class);

        Employee emp = new Employee("Pavani", "A1490876");
        Assets assetsObj = new Assets("Laptop", "DELL");

        employeeRepository.save(emp);
        asstesRepository.save(assetsObj);

//        tankRepository.delete(myTank);
//        truckRepository.delete(myTruck);
    }

}
