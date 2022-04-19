package top.xiaorang.mapper;

import top.xiaorang.entity.User;

/**
 * @author liulei
 */
public interface UserMapper {
    /**
     * 保存用户信息
     *
     * @param user 用户信息
     */
    void save(User user);
}
