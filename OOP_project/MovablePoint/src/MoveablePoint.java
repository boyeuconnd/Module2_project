public class MoveablePoint extends Point {
    private float xSpeed =0.0f, ySpeed = 0.0f;
    MoveablePoint(){}
    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(float x,float y,float xSpeed, float ySpeed){
        super.setX(x);
        super.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        float[] array = {this.getxSpeed(),this.getySpeed()};
        return array;
    }
    @Override
    public String toString(){
        String result = super.toString()+" speed: ("+getxSpeed()+","+getySpeed()+")";
        return result;
    }
    public void move(int time){
        super.setX(super.getX()+time*this.getxSpeed());
        super.setY(super.getY()+time*this.getySpeed());
    }
}
