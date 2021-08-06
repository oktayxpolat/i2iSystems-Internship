package springKafka.springKafkadocker;


import org.apache.kafka.common.internals.Topic;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "math",groupId = "math_id")
public void getMessage(String msg){
        FibPrime check=new FibPrime();
        String[] arr=msg.split(",");
        if(arr.length>=2){
            int operand=Integer.parseInt(arr[0]);
            String operation=arr[1];
            check.evaluate(operand,operation);
        }
        else
            System.out.println("Invalid input!");
    }
}
