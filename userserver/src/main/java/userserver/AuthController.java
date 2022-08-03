package userserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Class:
 * @author:track
 * @time: 2022/8/315:11
 * @Description: TODO
 */
@RestController
@RequestMapping("/order")
@RefreshScope
public class AuthController {



    @Autowired
    private OrderClinet orderClinet;

    @Value("${pattern.test}")
    private String dataformat;

    @GetMapping("/naocosconfig")
    public String naocosconfig(){
        return dataformat;
    }



    @GetMapping("/test")
    public EmployeeEntity queryOrderById(){
        EmployeeEntity byId = orderClinet.findById(1L);

//        String url = "http://localhost:8085/employee/1";
//        EmployeeEntity forObject = restTemplate.getForObject(url, EmployeeEntity.class);
        return  byId;

    }
}
