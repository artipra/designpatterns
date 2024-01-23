package creational.abstractfactory;

public class DarkRadio extends Radio{


    public DarkRadio(Double border) {
        super(border);
    }

    @Override
    public void render() {
        System.out.println("dark radio rendered");
    }

    @Override
    public void onSelect() {
        System.out.println("dark radio select ");
    }
}
