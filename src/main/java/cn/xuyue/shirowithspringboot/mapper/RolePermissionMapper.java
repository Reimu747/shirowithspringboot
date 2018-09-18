package cn.xuyue.shirowithspringboot.mapper;

import cn.xuyue.shirowithspringboot.pojo.RolePermission;
import cn.xuyue.shirowithspringboot.pojo.RolePermissionExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface RolePermissionMapper {
	int deleteByPrimaryKey(Long id);

	int insert(RolePermission record);

	int insertSelective(RolePermission record);

	List<RolePermission> selectByExample(RolePermissionExample example);

	RolePermission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(RolePermission record);

	int updateByPrimaryKey(RolePermission record);
}