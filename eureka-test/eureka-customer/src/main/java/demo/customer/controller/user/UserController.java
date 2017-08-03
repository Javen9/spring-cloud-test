package demo.customer.controller.user;

import demo.client.api.user.dto.UserDTO;
import demo.client.api.user.service.UserServiceRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by javen on 2017/7/22.
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceRemote userService;

    @RequestMapping("/createUser")
    public int createUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(120);
        userDTO.setName("黃javen");
        return userService.createUser(userDTO);
    }

//    @RequestMapping("/createUser2")
//    public String createUser2() {
//        UserDTO userDTO = new UserDTO();
//        userDTO.setId(8);
//        userDTO.setName("黃javen8");
//
//        UserAddrDTO userAddrDTO = new UserAddrDTO();
//        userAddrDTO.setId(9);
//        userAddrDTO.setName("黃javen9");
//        return userService.createUser(7, userDTO, userAddrDTO);
//    }

    @RequestMapping("/getUserName")
    public String getUserName() {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < 100; index++) {
            result.append(userService.getUserName(1) + "\r\n");
        }
        return result.toString();
    }

    @RequestMapping("/getUser")
    public UserDTO getUser() {
        UserDTO userDTO = userService.getUser();
        System.out.println(userDTO.getName());
        return userDTO;
    }

}
