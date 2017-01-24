package hei.tp05.client;

import hei.tp05.client.config.AppConfig;
import hei.tp05.contract.dto.ClientDTO;
import hei.tp05.contract.facade.ClientWS;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ApplicationCliente {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final ClientWS clientWS = context.getBean(ClientWS.class);
        final List<ClientDTO> allClients = clientWS.getAllClients();
        allClients.forEach(System.out::println);
    }
}
