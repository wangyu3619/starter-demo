package properteis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyu
 * 2019/04/24 20:44
 */
@Configuration
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperteis {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}