package cn.xuyue.shirowithspringboot.mapper;

import cn.xuyue.shirowithspringboot.pojo.Permission;
import cn.xuyue.shirowithspringboot.pojo.PermissionExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PermissionMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Permission record);

	int insertSelective(Permission record);

	List<Permission> selectByExample(PermissionExample example);

	Permission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Permission record);

	int updateByPrimaryKey(Permission record);
}