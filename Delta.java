import edu.princeton.cs.introcs.Picture;
import edu.princeton.cs.introcs.StdOut;

import java.awt.*;

public class Delta {
    public static void main(String[] args){
        Picture pic1 = new Picture("C://Users//sshumeyko//IdeaProjects//Delta//src//pic1.jpg");
        Picture pic2 = new Picture("C://Users//sshumeyko//IdeaProjects//Delta//src//pic2.jpg");
        for(int i = 0; i < pic1.width(); i++){
            for(int j = 0; j < pic1.height(); j++){
                Color color1 = pic1.get(i,j);
                Color color2 = pic2.get(i,j);
                if(!(color1.equals(color2))){
                    StdOut.println("( "+i +" "+ j + "(" + color1.getRed() +" ,"+ color1.getGreen() + "," + color1.getBlue() +")"
                            + "(" + color2.getRed() +" ,"+ color2.getGreen() + "," + color2.getBlue() +")" );
                    pic1.set(i,j, Color.red);

                }
            }
        }
        pic1.show();
    }
}
