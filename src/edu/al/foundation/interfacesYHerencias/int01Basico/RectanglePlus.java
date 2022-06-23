package edu.al.foundation.interfacesYHerencias.int01Basico;

import org.w3c.dom.css.Rect;

public class RectanglePlus implements Relatable{

    private int width = 0;
    private int height = 0;

    public RectanglePlus(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect =
            (RectanglePlus) other; 
        if (this.getHeight() < otherRect.getHeight()){
            return -1;
        }else 
            if (this.getHeight() > otherRect.getHeight()){
                return 1;
            }else{
                return 0;
        }    
    }    

    public static void main(String[] args) {
        RectanglePlus rect1 = new RectanglePlus(2, 2);
        RectanglePlus rect2 = new RectanglePlus(3, 3);
        System.out.println("isLargerThan: " + rect1.isLargerThan(rect2));
    }
    
}
