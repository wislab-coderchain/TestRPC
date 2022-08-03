package order.controller;


import lombok.extern.slf4j.Slf4j;
import order.entity.EmployeeEntity;
import order.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Class:
 * @author:track
 * @time: 2022/7/811:12
 * @Description: EmployeeController
 */
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/{id}")
    public EmployeeEntity getByID(@PathVariable int id ){
        log.info("用户输入的ID是{}",id);
        System.out.println(id);
        EmployeeEntity employeeEntity = employeeService.getById(id);
        if (employeeEntity != null ){
            return employeeEntity;
        }
        return employeeEntity;
    }

}
