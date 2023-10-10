package br.com.joao.consumer.rabbitmq.consumers;

import br.com.joao.consumer.dtos.ProductDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ProductConsumer {

    @RabbitListener(queues = {"product.log"})
    public void consumerLog(String message){
        log.info("Received message" + message);
    }
}
