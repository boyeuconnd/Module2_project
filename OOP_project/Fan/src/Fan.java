public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = 1;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getStatus(){
        return this.isOn;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public int setSpeed(int value){
        return this.speed = value;
    }
    public boolean setStatus(){
        return this.isOn=!this.isOn;
    }
    public double setRadius(double value){
        return this.radius = value;
    }
    public String setColor (String value){
        return this.color = value;
    }
    public void toStringFan(){
        if(this.isOn){
            System.out.println("Fan is on. Speed: " + speed +" Radius: "+radius+" Color: "+color);
        }else {
            System.out.println("Fan is off. Radius: "+radius+" Color: "+color);
        }

    }

}
