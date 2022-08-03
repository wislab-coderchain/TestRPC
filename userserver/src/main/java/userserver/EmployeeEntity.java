package userserver;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @Class:
 * @author:track
 * @time: 2022/7/810:48
 * @Description: Employee实体类
 */
@Data
@TableName("employee")
public class EmployeeEntity extends Base{
    private Long id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String sex;
    private String idNumber;
    private Integer status;
}
