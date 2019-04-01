package cn.hdu.learn.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 描述：
 *
 * @author guaner
 * @date 2019/3/30
 */


@SpringBootApplication
@MapperScan(basePackages = {
        "cn.hdu.learn.miaosha.dao"
})
@ComponentScan(basePackages = {
        "cn.hdu.learn.miaosha",
})
@ImportResource(value = {"classpath:spring/dubbo-consumer.xml", "classpath:spring/dubbo-provider.xml"})
@EnableTransactionManagement
@EnableScheduling
public class  MiaoshaApplication {

    /**
     * 启动SpringBoot程序
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
        System.out.println("CenterApplication start success...");
    }


}
