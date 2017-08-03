package demo.client.api.user.service;

import demo.client.api.user.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by javen on 2017/7/22.
 */
@RequestMapping("user")
@FeignClient(value = "eureka-client")
public interface UserServiceRemote {

    @RequestMapping(value = "createUser")
    int createUser(UserDTO userDTO);

//不支持多个对象传输，暂时没有找到解决方法(无法像dubbo一样可以想本地方法一样定义接口)
//    @RequestMapping(value = "createUser2")
//    String createUser(Integer id, UserDTO userDTO, UserAddrDTO userAddrDTO);

    @RequestMapping("getUserName")
    String getUserName(@RequestParam("id") Integer id);

    @RequestMapping("getUser")
    UserDTO getUser();
}
