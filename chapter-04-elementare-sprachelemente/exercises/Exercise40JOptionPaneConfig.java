/**
 * EXERCICE 40 - JOptionPane-Konfigurationsdialog bauen
 * ===================================================
 *
 * Niveau : moyen -> difficile
 *
 * Histoire :
 * Ein kleines Desktop-Tool soll zuerst informieren, dann einen Rechnernamen abfragen und anschliessend bestaetigen, ob dieser Name uebernommen werden soll.
 *
 * Notions du cours :
 * `showMessageDialog`, `showInputDialog`, `showConfirmDialog`, `YES_NO_OPTION`, `YES_OPTION`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Verbinde die drei Dialogarten zu einem kleinen Konfigurationsablauf.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Erst sagt das Programm etwas, dann fragt es nach einem Text, danach fragt es `Bist du sicher?`. Jede Dialogart hat eine andere Aufgabe und teilweise einen anderen Rueckgabewert.
 *
 * -- Essayons a la main --
 * Info zeigt nur Text. Input liefert String. Confirm liefert int-Code. `YES_NO_OPTION` konfiguriert Buttons, `YES_OPTION` beschreibt die Antwort.
 *
 * -- Le plan --
 * 1. Zeige einen Info-Dialog.
 * 2. Lies den Rechnernamen als String.
 * 3. Oeffne einen Ja/Nein-Confirm-Dialog.
 * 4. Vergleiche die Antwort mit `YES_OPTION`.
 * 5. Gib bei Ja eine Konsolenbestaetigung aus.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Noch nicht. Der Ablauf ist klein genug, um die API-Rollen direkt zu sehen.
 *
 * Exemples a verifier :
 * - Name `LAB-PC-01`, Klick Ja -> Konsolentext `Uebernommen: LAB-PC-01`
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Importiere `javax.swing.*`.
 * - `showMessageDialog` liefert `void`.
 * - `showInputDialog` liefert String; `showConfirmDialog` liefert int.
 */
import javax.swing.*;

void main() {
    // TODO 1
    // Ecris ton code ici.
}
