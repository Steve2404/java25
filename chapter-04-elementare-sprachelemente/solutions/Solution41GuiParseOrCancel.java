/**
 * Corrige de l'exercice 41.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise41GuiParseOrCancel.java.
 */
import javax.swing.*;

void main() {
    String text = JOptionPane.showInputDialog(
            null,
            "Inventar-ID:",
            "Inventar",
            JOptionPane.QUESTION_MESSAGE
    );

    if (text == null) {
        IO.println("Abgebrochen");
        return;
    }

    long id = Long.parseLong(text);
    IO.println("ID: " + id);
}
