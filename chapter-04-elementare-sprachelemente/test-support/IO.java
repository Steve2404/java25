/**
 * Kleine CI-Unterstuetzung fuer den Kurs.
 *
 * Der Kurs verwendet IO.print/println/printf. Das JDK-25 java.lang.IO besitzt
 * nicht alle hier im Kurs verwendeten Formatierungshelfer. Diese Klasse liegt
 * nur im Test-Classpath und delegiert auf System.out, damit die Kursbeispiele
 * unveraendert gegen Java 25 verifiziert werden koennen.
 */
final class IO {
    private IO() {
    }

    static void print(Object value) {
        System.out.print(value);
    }

    static void println() {
        System.out.println();
    }

    static void println(Object value) {
        System.out.println(value);
    }

    static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}
