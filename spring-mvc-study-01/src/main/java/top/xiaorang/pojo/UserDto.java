package top.xiaorang.pojo;

import java.util.List;

/**
 * @author liulei
 */
public class UserDto {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "users=" + users +
                '}';
    }
}
