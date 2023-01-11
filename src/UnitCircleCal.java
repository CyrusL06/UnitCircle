
import javax.swing.JOptionPane;


/*
* UnitCircleCal - description 
*
* @author Cyrus Lorenzo
* @since 28-Sep-2022
 */
public class UnitCircleCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(
                null,
                "Mr.Wachs is preparing to teach the unit 'circle'\n"
                + "in grade 10 mathematics, and as usual, he has no\n"
                + "idea what he's doing! You need to help him out and\n"
                + " write a program to calculate the circumference of \n"
                + "a circle, the area of a circle, and the volume of\n"
                + "sphere based on radius",
                "Unit Circle Calculator",
                JOptionPane.INFORMATION_MESSAGE
                //Front GReating for the user
                
        );

        String x = JOptionPane.showInputDialog(
                null,
                "Enter the radius of circle",
                "Unit Circle Calculator",
                JOptionPane.QUESTION_MESSAGE
                //takes  the word the user input and it into string
        );

        double radius = Double.parseDouble(x);
        // turns the string into double 
        double circum = 1;

        JOptionPane.showMessageDialog(
                null,
                "Thanks for using Unit Circle Calculator",
                "Unit Circle Calculator",
                JOptionPane.INFORMATION_MESSAGE
                // Greating after completing on top
        );

//     double radius = 3;
        //formula to calculate area of circle
        double area = Math.PI * (radius * radius);
        //formula to calculate circumference of circle
        double circumference = Math.PI * 2 * radius;
        double volume = (4 * Math.PI / 3) * radius * radius * radius;
        //formula to calculate Volume of circle

        JOptionPane.showMessageDialog(null,
                "The circumfurence: " + circumference
                + "\nThe area of circle: " + area
                + "\nThe volume of circle: " + volume,
                "Unit Circle Calculator",
                JOptionPane.INFORMATION_MESSAGE);
        // output all of it 
    }

}
