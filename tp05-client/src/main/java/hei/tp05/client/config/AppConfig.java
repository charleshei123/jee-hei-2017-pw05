package hei.tp05.client.config;

import hei.tp05.contract.facade.ClientWS;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ClientWS clientWebService(){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(ClientWS.class);
        factoryBean.setAddress("http://localhost:8081/tp05-server/services/client");
        return (ClientWS) factoryBean.create();
    }

}
