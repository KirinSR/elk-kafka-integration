package zaggle.xpns.elk.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @Autowired
    KafkaUserService kafkaUserService;

    //todo:  kafka listener for consuming data from topic
    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(Object object ){
        LOGGER.info(String.format("Json message recieved -> %s", object.toString()));
        try {
            //saveUser saves user data to elasticsearch
            kafkaUserService.saveObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
