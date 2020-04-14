public class Point {
    private float x =0.0f,y=0.0f;
    Point(){

    }
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.setX(x);
        this.setY(y);
    }
    public float[] getXY(){
        float[] array = {this.x,this.y};
        return array;
    }
    @Override
    public String toString(){
        String result = this.x +","+this.y;
        return "("+result+")";
    }

}
