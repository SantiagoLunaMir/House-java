public class DiningRoom {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;
    public void setTv(boolean tv){
        this.tv=tv;
    }
    public boolean getTv(){
        return tv;
    }
    public void setChairsCapacity(int chairsCapacity){
        this.chairsCapacity=chairsCapacity;
    }
    public int getHomeTeather(){
        return chairsCapacity;
    }

    public void setWindows(int windows){
        this.windows=windows;
    }
    public int getWindows(){
        return windows;
    }

    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
