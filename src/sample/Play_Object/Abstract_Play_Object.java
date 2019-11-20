package sample.Play_Object;

import javafx.scene.image.Image;

public abstract class Abstract_Play_Object implements Play_Object{
    private Image image;
    private double posX;
    private double posY;
    private double size;

    protected Abstract_Play_Object(double posX, double posY)
    {
        this.posX=posX;
        this.posY=posY;
    }

    public void update()
    {setPosX(getPosX()+1);}


    @Override
    public final double getPosX() { return posX; }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    @Override
    public final double getPosY() { return posY; }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    @Override
    public final double getSize() { return size; }

    public void setSize(double width) {
        this.size = width;
    }

    @Override
    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }

}
