package behavioural.strategy;

import lombok.AllArgsConstructor;

//step 3 Adding reference to context class
@AllArgsConstructor
public class Navigator {
    private NavigationStrategy strategy;

    public Double navigate(String from, String to){
        return strategy.navigate(from,to);
    }



}
