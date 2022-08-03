package order.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import order.entity.EmployeeEntity;
import order.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
 * @Class:
 * @author:track
 * @time: 2022/7/811:09
 * @Description: TODO
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, EmployeeEntity> implements EmployeeService{
}
