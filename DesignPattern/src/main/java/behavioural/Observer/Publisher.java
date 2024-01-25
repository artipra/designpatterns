package behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

//step 1 create oberverable + registry
public abstract class Publisher {

    List<Consumer> consumerRegistry = new ArrayList<>();

    public void publish(Double price){
       consumerRegistry.forEach(consumer -> consumer.consume(price));
    }

    public void addConsumer(Consumer consumer){
        consumerRegistry.add(consumer);
    }

    public void removeConsumer(Consumer consumer){
        consumerRegistry.remove(consumer);
    }

}
