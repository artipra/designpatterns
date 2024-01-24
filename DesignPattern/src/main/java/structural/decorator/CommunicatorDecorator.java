package structural.decorator;

import lombok.AllArgsConstructor;
// step 3 base decorator
@AllArgsConstructor
public abstract class CommunicatorDecorator implements Communicator{
    protected Communicator communicator;
}
