/**
 * EXERCICE 37 - Supportobjekte mit Pattern-switch routen
 * =====================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Support-Eingang liefert Werte als `Object`: Textmeldungen, Integer-Fehlercodes, Double-Messwerte oder `null`. Das Routing soll Laufzeittyp und Zusatzbedingungen direkt im switch verwenden.
 *
 * Notions du cours :
 * Pattern Matching in `switch`, Typmuster, Mustervariable, `when`, `case null`, `default`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Route einen Integer-Fehlercode 503 nach `SERVERFEHLER`.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * In einer gemischten Kiste liegen verschiedene Arten von Dingen. Java schaut zuerst: `Was bist du?` und kann danach innerhalb dieses Falls noch eine zweite Frage stellen.
 *
 * -- Essayons a la main --
 * ticket=Integer 503 -> String-Faelle passen nicht -> Integer passt -> when 503>=500 true -> SERVERFEHLER.
 *
 * -- Le plan --
 * 1. Speichere `ticket` als Object mit Wert 503.
 * 2. Behandle `null` separat.
 * 3. Behandle String mit einer sinnvollen Text-Kategorie.
 * 4. Behandle Integer >=500 mit `when`.
 * 5. Fuege allgemeineren Integer- und default-Fall hinzu.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Der switch ist hier selbst die Routing-Box. Eine neue Methode ist fuer diese erste Pattern-Uebung noch nicht noetig.
 *
 * Exemples a verifier :
 * - 503 -> SERVERFEHLER
 * - 42 -> CODE
 * - "VPN" -> TEXT
 * - null -> KEIN_TICKET
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Spezielle/geschuetzte Faelle muessen vor allgemeineren Typfaellen stehen.
 * - Die Mustervariable ist in der `when`-Klausel bereits verwendbar.
 */
void main() {
    Object ticket = 503;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(route);
    ExerciseChecker.check("503 wird Serverfehler", route.equals("SERVERFEHLER"));
    ExerciseChecker.summary();
}
