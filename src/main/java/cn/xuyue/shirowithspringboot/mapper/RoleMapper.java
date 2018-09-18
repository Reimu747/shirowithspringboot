package cn.xuyue.shirowithspringboot.mapper;

import cn.xuyue.shirowithspringboot.pojo.Role;
import cn.xuyue.shirowithspringboot.pojo.RoleExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface RoleMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	List<Role> selectByExample(RoleExample example);

	Role selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}