/**
 * EXERCICE 41 - GUI-Eingabe abbrechen oder Zahl parsen
 * ===================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Desktop-Tool fragt eine Inventar-ID als Text ab. Bei Abbrechen soll die Methode sauber enden. Bei Text soll dieser erst danach zu `long` geparst werden.
 *
 * Notions du cours :
 * `null`, `showInputDialog`, `Long.parseLong`, `return`, moegliche `NumberFormatException`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Behandle `null` vor dem Parsing und parse nur den normalen Erfolgsweg.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Wenn der Benutzer auf Abbrechen drueckt, gibt es gar keinen Textzettel. Du darfst dann nicht versuchen, diesen nicht vorhandenen Zettel in eine Zahl umzuwandeln.
 *
 * -- Essayons a la main --
 * Abbrechen -> text=null -> return. Eingabe `12345` -> parseLong -> 12345L.
 *
 * -- Le plan --
 * 1. Hole den String aus dem Dialog.
 * 2. Pruefe sofort `text == null`.
 * 3. Bei null: gib Abbruchmeldung aus und `return`.
 * 4. Sonst parse mit `Long.parseLong`.
 * 5. Gib die ID aus und erklaere den noch offenen Fehlerweg fuer `abc`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Der fruehe `return` macht den Abbruchpfad gerade besonders klar.
 *
 * Exemples a verifier :
 * - Abbrechen -> kein Parsing
 * - `12345` -> long 12345
 * - `abc` -> spaeter NumberFormatException, noch ohne try/catch
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - `null` ist nicht dasselbe wie `""`.
 * - Exception-Behandlung mit try/catch gehoert noch nicht in diese Aufgabe.
 */
import javax.swing.*;

void main() {
    // TODO 1
    // Ecris ton code ici.
}
