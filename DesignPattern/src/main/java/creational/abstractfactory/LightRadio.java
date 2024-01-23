package creational.abstractfactory;

public class LightRadio extends Radio{

    public LightRadio(Double border) {
        super(border);
    }

    @Override
    public void render() {
        System.out.println("light radio rendered");
    }

    @Override
    public void onSelect() {
        System.out.println("light radio select ");
    }
}
