/**
 * Corrige de l'exercice 40.
 *
 * A ne consulter qu'apres avoir essaye par vous-meme dans
 * exercises/Exercise40JOptionPaneConfig.java.
 */
import javax.swing.*;

void main() {
    JOptionPane.showMessageDialog(
            null,
            "Konfiguration startet",
            "Info",
            JOptionPane.INFORMATION_MESSAGE
    );

    String name = JOptionPane.showInputDialog(
            null,
            "Rechnername:",
            "Name",
            JOptionPane.QUESTION_MESSAGE
    );

    int result = JOptionPane.showConfirmDialog(
            null,
            "Name uebernehmen: " + name + "?",
            "Bestaetigen",
            JOptionPane.YES_NO_OPTION
    );

    if (result == JOptionPane.YES_OPTION) {
        IO.println("Uebernommen: " + name);
    }
}
