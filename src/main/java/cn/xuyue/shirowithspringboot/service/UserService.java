package cn.xuyue.shirowithspringboot.service;

import java.util.List;
import cn.xuyue.shirowithspringboot.pojo.User;

public interface UserService {
	public String getPassword(String name);

	public User getByName(String name);

	public List<User> list();

	public void add(User user);

	public void delete(Long id);

	public User get(Long id);

	public void update(User user);
}