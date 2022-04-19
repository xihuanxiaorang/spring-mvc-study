package top.xiaorang.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.xiaorang.entity.User;
import top.xiaorang.mapper.UserMapper;

/**
 * @author liulei
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void register(User user) {
        userMapper.save(user);
    }
}
