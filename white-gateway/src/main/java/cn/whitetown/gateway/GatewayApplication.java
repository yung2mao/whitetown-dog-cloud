package cn.whitetown.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author taixian
 * @date 2020/09/08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main( String[] args ) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
