/**
 * EXERCICE 03 - Swing-Benachrichtigung ohne Namenschaos
 * ====================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Desktop-Tool soll dieselbe Statusmeldung einmal mit importiertem Kurznamen und einmal mit voll qualifiziertem Klassennamen anzeigen.
 *
 * Notions du cours :
 * `import`, voll qualifizierter Name, `JOptionPane.showMessageDialog()`.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Zeige zweimal die Meldung `Backup fertig`, ohne eine eigene JOptionPane-Klasse zu bauen.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Eine Person kann einen kurzen Spitznamen oder ihren kompletten Namen haben. Beides meint dieselbe Person. Ein Import erlaubt den kurzen Namen.
 *
 * -- Essayons a la main --
 * Kurzer Name: `JOptionPane`. Voller Name: `javax.swing.JOptionPane`.
 *
 * -- Le plan --
 * 1. Importiere Swing fuer den kurzen Namen.
 * 2. Zeige die erste Meldung mit `JOptionPane`.
 * 3. Zeige die zweite Meldung mit `javax.swing.JOptionPane`.
 * 4. Verwende in beiden Faellen denselben Text.
 * 5. Erklaere dir selbst: der Import erzeugt kein Objekt.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Hier wird nur die Namensaufloesung derselben API verglichen.
 *
 * Exemples a verifier :
 * - Beide Dialoge enthalten `Backup fertig`.
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Import: `import javax.swing.*;`.
 * - Der voll qualifizierte Name darf auch trotz Import verwendet werden.
 */
import javax.swing.*;

void main() {
    String message = "Backup fertig";
    
    // TODO 1
    // Ecris ton code ici.
}
