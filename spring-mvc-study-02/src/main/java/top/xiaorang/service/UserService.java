package top.xiaorang.service;

import top.xiaorang.entity.User;

/**
 * @author liulei
 */
public interface UserService {
    /**
     * 注册用户
     *
     * @param user 用户信息
     */
    void register(User user);
}
