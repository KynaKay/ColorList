package sg.edu.rp.c346.colorlist;

// Step 2
public class Color {

    // this depends on the output i want
    // Step 2a add attribute
    private String color;

    // Step 2b generate constructor and methods by selecting code > generate > getter setter
    public Color(String color) { // constructor
        this.color = color;
    }

    public String getColor() { // getter
        return color;
    }

    public void setColor(String color) { // setter
        this.color = color;
    }

}
