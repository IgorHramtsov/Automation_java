package hometask_3.hometask2_task3;

public class Body {

    private double heightOfBody;
    private String colourOfBody;

    public Body(double heightOfBody, String colourOfBody) {
        this.heightOfBody = heightOfBody;
        this.colourOfBody = colourOfBody;
    }

    public void setHeightOfBody(double heightOfBody) {
        this.heightOfBody = heightOfBody;
    }

    public double getHeightOfBody() {
        return heightOfBody;
    }

    public double changeHeightOfBody() {
        return heightOfBody*1.5;
    }

    public String getColourOfBody() {
        return colourOfBody;
    }

    public void setColourOfBody(String colourOfBody) {
        this.colourOfBody = colourOfBody;
    }

    @Override
    public String toString() {
        return "Body{" +
                "heightOfBody=" + heightOfBody +
                ", colourOfBody='" + colourOfBody + '\'' +
                '}';
    }
}

