package order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import order.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Class:
 * @author:track
 * @time: 2022/7/811:05
 * @Description: Employee Mapper
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<EmployeeEntity> {
}
