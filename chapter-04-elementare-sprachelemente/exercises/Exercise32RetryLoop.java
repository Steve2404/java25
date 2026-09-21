/**
 * EXERCICE 32 - Wiederholversuche mit while steuern
 * ================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Netzwerkdienst darf maximal drei Wiederholversuche simulieren. Der Zaehler startet bei 0 und soll exakt drei Versuche protokollieren.
 *
 * Notions du cours :
 * `while`, Schleifenbedingung, Zustandsaenderung, Terminierung.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Schreibe eine while-Schleife, die `versuche` bis genau 3 erhoeht.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Eine Maschine darf dreimal anklopfen. Nach jedem Klopfen musst du den Zaehler erhoehen, sonst klopft sie fuer immer.
 *
 * -- Essayons a la main --
 * 0 -> Versuch 1 -> 1; Versuch 2 -> 2; Versuch 3 -> 3; dann Bedingung false.
 *
 * -- Le plan --
 * 1. Starte `versuche=0`.
 * 2. Pruefe `versuche < 3`.
 * 3. Gib den naechsten Versuch aus.
 * 4. Erhoehe den Zaehler.
 * 5. Pruefe nach der Schleife den Endwert 3.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Zustandsaenderung innerhalb der Schleife ist genau das Lernziel.
 *
 * Exemples a verifier :
 * - Start 0 -> Endwert 3
 * - genau drei Rumpfdurchgaenge
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ohne `versuche++` wuerde die Schleife nicht enden.
 * - Die Bedingung wird vor jedem Durchgang geprueft.
 */
void main() {
    int versuche = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Genau drei Versuche", versuche == 3);
    ExerciseChecker.summary();
}
