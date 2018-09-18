package cn.xuyue.shirowithspringboot.mapper;

import cn.xuyue.shirowithspringboot.pojo.User;
import cn.xuyue.shirowithspringboot.pojo.UserExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserMapper {
	int deleteByPrimaryKey(Long id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}