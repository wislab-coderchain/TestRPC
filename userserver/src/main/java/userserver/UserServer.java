package userserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Class:
 * @author:track
 * @time: 2022/8/213:38
 * @Description: TODO
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class UserServer {
    public static void main(String[] args) {
        SpringApplication.run(UserServer.class, args);
    }




//    http://localhost:3001/oauth/authorize?client_id=client1&response_type=code&scope=scope1&redirect_uri=http://www.baidu.com
}
