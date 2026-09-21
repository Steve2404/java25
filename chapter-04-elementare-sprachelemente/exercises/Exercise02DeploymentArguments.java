/**
 * EXERCICE 02 - Deployment-Argumente protokollieren
 * ================================================
 *
 * Niveau : facile -> moyen
 *
 * Histoire :
 * Ein kleines Deployment-Programm bekommt Tags ueber die Kommandozeile, zum Beispiel `prod blue 3`. Jeder Tag soll in derselben Reihenfolge in einer eigenen Zeile verarbeitet werden.
 *
 * Notions du cours :
 * `String[] args`, Enhanced-for, Reihenfolge einer Serie.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Iteriere ohne Index ueber alle Argumente und zaehle, wie viele verarbeitet wurden.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du bekommst eine Reihe beschrifteter Karten. Du nimmst immer die naechste Karte, liest sie und legst sie weg. Du brauchst nicht zu wissen, auf welchem Platz die Karte lag.
 *
 * -- Essayons a la main --
 * args = [prod, blue, 3]. Drei Karten werden gelesen, also muss `count` am Ende 3 sein.
 *
 * -- Le plan --
 * 1. Lege `count` mit 0 an.
 * 2. Gehe mit Enhanced-for ueber `args`.
 * 3. Gib jedes Argument aus.
 * 4. Erhoehe `count` pro verarbeitetem Argument.
 * 5. Pruefe `count` gegen `args.length`.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Schleife selbst ist die wiederholte kleine Arbeitsbox.
 *
 * Exemples a verifier :
 * - `prod blue 3` -> drei Ausgaben und count=3
 * - keine Argumente -> keine Tag-Ausgabe und count=0
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Syntax: `for (String arg : args)`.
 * - Die Iterationsvariable bekommt nacheinander jedes Element.
 */
void main(String[] args) {
    int count = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Alle Argumente gezaehlt", count == args.length);
    ExerciseChecker.summary();
}
