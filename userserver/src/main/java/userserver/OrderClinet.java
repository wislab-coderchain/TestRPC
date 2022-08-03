package userserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Class:
 * @author:track
 * @time: 2022/8/315:27
 * @Description: TODO
 */
@FeignClient("orderserver")
public interface OrderClinet {
    @GetMapping("/employee/{id}")
    EmployeeEntity findById(@PathVariable("id") Long id);
}
