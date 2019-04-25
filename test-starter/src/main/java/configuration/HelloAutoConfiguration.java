package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import properteis.HelloServiceProperteis;
import service.HelloService;

/**
 * @author wangyu
 * 2019/04/24 20:51
 */
@Configuration
@EnableConfigurationProperties(value = HelloServiceProperteis.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
public class HelloAutoConfiguration {

    @Autowired
    private HelloServiceProperteis helloServiceProperteis;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperteis.getMsg());
        return helloService;
    }
}