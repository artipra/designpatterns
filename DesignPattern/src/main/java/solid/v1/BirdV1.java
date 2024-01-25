package solid.v1;

import solid.BeakType;

public class BirdV1 {

    private int weight;
    private String color;
    private String size;
    private String type;
    private BeakType beakType;

    public void fly(String type){
        if(type.equals("eagle")){
            flyLikeEagle();
        }else if (type.equals("penguin")){
            flyLikePenguin();
        }
        else if (type.equals("parrot")){
            flyLikeParrot();
        }
        else{
            defaultFly();
        }
    }

    private void flyLikePenguin() {
        System.out.println("penguin");
    }

    private void defaultFly() {
        System.out.println("default fly");
    }

    private void flyLikeParrot() {
        System.out.println("parrot");
    }

    private void flyLikeEagle() {
        System.out.println("eagle");
    }

    public void eat(){}

    public void makesound(){}


}
