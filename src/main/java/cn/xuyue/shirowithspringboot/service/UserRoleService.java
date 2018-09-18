package cn.xuyue.shirowithspringboot.service;

import cn.xuyue.shirowithspringboot.pojo.User;

public interface UserRoleService {

    public void setRoles(User user, long[] roleIds);

    public void deleteByUser(long userId);

    public void deleteByRole(long roleId);

}