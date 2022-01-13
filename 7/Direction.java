public enum Direction{
    LEFT(-1,0),
    RIGHT(1,0),
    UP(0,1),
    DOWN(0,-1);

    private int x;
    private int y;

    Direction(int x1, int y1){
        this.x=x1; this.y=y1;
    }

    int getX(){return x;}
    int getY(){return y;}

    public String toString(){
        return " ["+getX()+", "+getY()+"]";
    }

}