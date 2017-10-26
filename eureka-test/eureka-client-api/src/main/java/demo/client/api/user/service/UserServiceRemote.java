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

// Feign不支持多个对象情况，Feign是基于http请求方式，一个请求只能有一个body，而对象不指定为@RequestParam，Feign会把它当做一个body
// 当你把封装对象指定为@RequestParam时，Feign传输时会toString，最后传输的是内存地址，服务端无法正常获取到参数
// 也就是说Feign只支持传一个封装类对象，有其他需要做特殊处理，比如转成json字符串传输
// 这点从使用上是与dubbo最大的区别，dubbo没有这个限制，参数可以像本地方法一样随意定义
//    @RequestMapping(value = "createUser2")
//    String createUser(Integer id, UserDTO userDTO, UserAddrDTO userAddrDTO);

    @RequestMapping("getUserName")
    String getUserName(@RequestParam("id") Integer id);

    @RequestMapping("getUser")
    UserDTO getUser();
}
