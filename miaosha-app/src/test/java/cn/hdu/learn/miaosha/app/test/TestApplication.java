package cn.hdu.learn.miaosha.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 单元测试用例
 * @author xumin
 */
@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的Application启动类
//@SpringApplicationConfiguration(classes = LoanApplication.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class TestApplication {


    /** 启动单元测试 **/
    @Test
    public void test() {
        System.out.println("CenterTestApplication start success...");
    }

    /** 启动单元测试 **/
    @Test
    public void test1() {

    }



}
