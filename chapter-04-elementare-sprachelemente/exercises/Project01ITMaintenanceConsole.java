/**
 * MINI-PROJET 01 - IT-Wartungskonsole
 * ====================================
 *
 * Niveau : difficile
 *
 * Situation reelle :
 * Ein IT-Team braucht ein kleines Konsolenwerkzeug fuer wiederkehrende
 * Wartungsentscheidungen. Das Programm soll ein Menue anzeigen und so lange
 * laufen, bis der Benutzer bewusst beendet.
 *
 * Bekannte Notions:
 * Simput, Variablen, primitive Typen, Operatoren, if, switch, while,
 * for, break, continue, Math.sqrt, String-Ausgabe.
 *
 * ==================================================================
 * TODO 1 : Hauptmenue und Kontrollfluss
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Ein Werkzeugkasten hat mehrere Faecher. Der Benutzer sagt eine Zahl,
 * und du oeffnest genau das passende Fach. Nach der Arbeit gehst du wieder
 * zur Auswahl zurueck.
 *
 * -- Essayons a la main --
 * Wahl 1 -> Statuscode klassifizieren.
 * Wahl 2 -> Geraete-ID auf Primzahl pruefen.
 * Wahl 3 -> zwei Wartungsintervalle synchronisieren.
 * Wahl 0 -> Programm beenden.
 *
 * -- Le plan --
 * 1. Eine while-Schleife fuer das Menue starten.
 * 2. Menue anzeigen und Wahl mit Simput.gint() lesen.
 * 3. Mit switch genau einen Arbeitsweg waehlen.
 * 4. Nach jeder Aktion zum Menue zurueckkehren.
 * 5. Bei Wahl 0 die main-Methode mit return verlassen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Ja, in einem spaeteren Kapitel waeren die drei Aktionen gute Methoden.
 * Hier bleiben sie bewusst im switch, weil neue Methoden nicht das Lernziel sind.
 *
 * ==================================================================
 * TODO 2 : Die drei echten Wartungsprobleme loesen
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Jede Menueaktion ist ein kleines reales Problem:
 * Status verstehen, Primzahl pruefen, gemeinsamen Rhythmus finden.
 *
 * -- Essayons a la main --
 * Status 2 -> FEHLER.
 * ID 29 -> Primzahl.
 * Intervalle 84 und 126 -> GGT 42.
 *
 * -- Le plan --
 * 1. Status mit switch klassifizieren.
 * 2. Primzahl nur bis sqrt(n) testen.
 * 3. GGT mit dem Euklidischen Modulo-Verfahren berechnen.
 * 4. Ungueltige Eingaben frueh erkennen.
 * 5. Ergebnisse klar ausgeben.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Fachlich ja, aber noch nicht als Java-Methode in diesem Kapitel.
 *
 * Exemples a verifier :
 * - Status 2 -> FEHLER
 * - ID 29 -> Primzahl
 * - 84 / 126 -> GGT 42
 *
 * Indices techniques Java :
 * - Fuer den Primzahltest brauchst du %, Math.sqrt(), for und break.
 * - Fuer den GGT brauchst du while und %.
 * - return beendet die aktuelle main-Methode.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.

    // TODO 2
    // Ecris ton code ici.
}
