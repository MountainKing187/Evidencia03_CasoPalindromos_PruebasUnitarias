import java.util.Objects;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        if (texto.isEmpty()) {
            return false;
        }

        // Eliminar espacios y convertir a minúsculas
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();

        int izquierda = 0;
        int derecha = textoLimpio.length() - 1;

        while (izquierda < derecha) {
            if (textoLimpio.charAt(izquierda) != textoLimpio.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

}
