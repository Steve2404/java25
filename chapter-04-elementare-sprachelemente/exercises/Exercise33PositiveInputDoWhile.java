/**
 * EXERCICE 33 - Positive Eingabe mit do-while erzwingen
 * ====================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein kleines Konfigurationstool braucht eine positive Anzahl von Arbeitsplaetzen. Eine ungueltige Zahl soll erneut abgefragt werden, und die Eingabe muss mindestens einmal stattfinden.
 *
 * Notions du cours :
 * `do-while`, Bedingungspruefung nach dem Rumpf, `Simput.gint()`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Frage so lange nach einer Zahl, bis sie groesser als 0 ist.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du musst den Benutzer mindestens einmal fragen. Erst nachdem er geantwortet hat, kannst du entscheiden, ob du noch einmal fragen musst.
 *
 * -- Essayons a la main --
 * Eingaben -2, 0, 7 -> zwei Wiederholungen, akzeptiert wird 7.
 *
 * -- Le plan --
 * 1. Deklariere `anzahl` vor der Schleife.
 * 2. Lies die Zahl im `do`-Block.
 * 3. Pruefe danach `anzahl <= 0`.
 * 4. Wiederhole bei ungueltigem Wert.
 * 5. Gib den akzeptierten Wert aus.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Schleife ist genau die Wiederholungsbox fuer die Eingabe.
 *
 * Exemples a verifier :
 * - 7 -> sofort akzeptiert
 * - -2,0,7 -> endet bei 7
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Bei `do-while` steht die Bedingung hinter dem Rumpf.
 * - Die Variable muss nach der Schleife noch sichtbar sein.
 */
void main() {
    int anzahl;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("Akzeptiert: " + anzahl);
}
