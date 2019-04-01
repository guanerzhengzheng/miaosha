package cn.hdu.learn.miaosha.autoconfig;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @desc: 分页插件配置类
 * @author: limo
 * @since: 17/7/19 19:56
 */
@Slf4j
@Configuration
public class PageHelperConfiguration {

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = confProperties();
        pageHelper.setProperties(properties);
        return pageHelper;
    }


    @Bean
    public PageInterceptor pageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        pageInterceptor.setProperties(confProperties());
        return pageInterceptor;
    }

    private Properties confProperties() {
        Properties p = new Properties();

        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        //通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
        p.setProperty("pageSizeZero", "true");

        p.setProperty("closeConn", "true");
        return p;
    }

}
