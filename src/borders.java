import static javax.swing.JOptionPane.*;
import javax.swing.ImageIcon;
import static java.lang.Math.random;

public class borders {
    public static void main(String[] args) {
        String[] _borders = {"Spinning_Sidle.png", "Hop.png", "Jump.png", "Sidle.png", "Spinning_Hop.png", "Spinning_Jump.png", "Step.png"};
        String[] __borders = {"Spinning Sidle", "Hop", "Jump", "Sidle", "Spinning Hop", "Spinning Jump", "Step"};

        while (true) {
            int rnd = (int) (7 * random());
            ImageIcon img = new ImageIcon(borders.class.getClassLoader().getResource(_borders[rnd]));

            String border = (String) showInputDialog(null, img, "Determine the border!", QUESTION_MESSAGE, null, __borders, __borders[0]);
            if (border == __borders[rnd]) {
                showMessageDialog(null, "Correct!", "Borders", INFORMATION_MESSAGE);
            } else if (border != null) {
                showMessageDialog(null, "Incorrect! The answer is " + __borders[rnd], "", ERROR_MESSAGE);
            } else {
                break;
            }
        }
    }
}
