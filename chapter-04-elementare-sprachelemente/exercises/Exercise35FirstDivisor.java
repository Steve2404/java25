/**
 * EXERCICE 35 - Ersten Teiler mit break finden
 * ===========================================
 *
 * Niveau : moyen -> difficile
 *
 * Histoire :
 * Ein Diagnosetool prueft eine Geraete-ID 91 und soll den ersten echten Teiler finden. Sobald dieser bekannt ist, sind weitere Tests unnoetig.
 *
 * Notions du cours :
 * `for`, `%`, `break`, Zustandsvariable.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Finde den ersten Teiler ab 2 und stoppe die Suche sofort.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du probierst Schluessel der Reihe nach. Sobald einer passt, hoerst du auf, statt alle anderen Schluessel weiter zu testen.
 *
 * -- Essayons a la main --
 * 91 % 2 != 0; ... 91 % 7 == 0 -> erster Teiler 7 -> Ende.
 *
 * -- Le plan --
 * 1. Setze `n=91`.
 * 2. Lege `teiler=0` als noch-nicht-gefunden-Zustand an.
 * 3. Teste Kandidaten ab 2.
 * 4. Bei Rest 0: speichere Kandidat und `break`.
 * 5. Pruefe teiler=7.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die lineare Suche soll bewusst sichtbar bleiben.
 *
 * Exemples a verifier :
 * - 91 -> 7
 * - 25 -> 5
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ein `break` verlaesst die aktuelle Schleife.
 * - Teste nur Kandidaten kleiner als n.
 */
void main() {
    long n = 91;
    long teiler = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("Erster Teiler: " + teiler);
    ExerciseChecker.check("91 hat ersten Teiler 7", teiler == 7);
    ExerciseChecker.summary();
}
