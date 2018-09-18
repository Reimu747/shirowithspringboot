package cn.xuyue.shirowithspringboot.mapper;

import cn.xuyue.shirowithspringboot.pojo.UserRole;
import cn.xuyue.shirowithspringboot.pojo.UserRoleExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserRoleMapper {
	int deleteByPrimaryKey(Long id);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	List<UserRole> selectByExample(UserRoleExample example);

	UserRole selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserRole record);

	int updateByPrimaryKey(UserRole record);
}