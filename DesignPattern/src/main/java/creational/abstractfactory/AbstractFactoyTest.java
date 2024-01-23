package creational.abstractfactory;

public class AbstractFactoyTest {

    public static void main(String[] args) {
        darkThemeTest();
        LightThemeTest();
    }

    static void darkThemeTest(){
    ThemeFactory darkThemeFactory = new DarkThemeFactory();
    Button button  = darkThemeFactory.createButton(10.0,2.0,3.0);
        button.render();
    Radio radio = darkThemeFactory.createRadio(10);
    radio.render();
    }

    static void LightThemeTest(){
        ThemeFactory light = new LightThemeFactory();
        Button button  = light.createButton(220.0,2.0,3.9);
        button.render();
        Radio radio = light.createRadio(10);
        radio.render();
    }

}
