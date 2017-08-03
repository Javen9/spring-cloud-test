package demo.client.user.service;

import demo.client.api.user.dto.UserAddrDTO;
import demo.client.api.user.dto.UserDTO;
import demo.client.api.user.service.UserServiceRemote;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by javen on 2017/7/22.
 */
@RestController
public class UserService implements UserServiceRemote {

    public int createUser(@RequestBody UserDTO userDTO) {
        return 520;
    }

//    public String createUser(Integer id, UserDTO userDTO, UserAddrDTO userAddrDTO) {
//        return id + ":" + userDTO.getId() + ":" + userAddrDTO.getId();
//    }

    public String getUserName(Integer id) {
        return id + ":name + two";
    }

    public UserDTO getUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(120);
        userDTO.setName("黄javen");
        return userDTO;
    }
}
