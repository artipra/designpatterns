package creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;


//step 1 create common product interface
@AllArgsConstructor
@Getter
public abstract class Radio {

    private Double border;

    public  abstract void render();
    public abstract void onSelect();


}
