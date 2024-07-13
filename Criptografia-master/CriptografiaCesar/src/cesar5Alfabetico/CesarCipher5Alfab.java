package cesar5Alfabetico;

public class CesarCipher5Alfab {
    // Método para cifrar un mensaje utilizando el cifrado César +5
    public static String cifrar(String mensaje) {
        StringBuilder cifrado = new StringBuilder();
        int longitud = mensaje.length();
        for (int i = 0; i < longitud; i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isLetter(caracter)) {
                // Aplicar cifrado César sumando 5 al valor ASCII del carácter
                char cifradoChar = (char) (caracter + 5);
                // Si el carácter cifrado excede 'Z' o 'z', se ajusta restando 26 para volver al
                // rango correcto
                if ((Character.isUpperCase(caracter) && cifradoChar > 'Z') ||
                        (Character.isLowerCase(caracter) && cifradoChar > 'z')) {
                    cifradoChar -= 26;
                }
                cifrado.append(cifradoChar);
            } else {
                // Si no es una letra, se mantiene sin cambios
                cifrado.append(caracter);
            }
        }
        return cifrado.toString();
    }

    // Método para descifrar un mensaje cifrado con el cifrado César +5
    public static String descifrar(String mensajeCifrado) {
        StringBuilder descifrado = new StringBuilder();
        int longitud = mensajeCifrado.length();
        for (int i = 0; i < longitud; i++) {
            char caracter = mensajeCifrado.charAt(i);
            if (Character.isLetter(caracter)) {
                // Aplicar descifrado César restando 5 al valor ASCII del carácter
                char descifradoChar = (char) (caracter - 5);
                // Si el carácter descifrado es menor que 'A' o 'a', se ajusta sumando 26 para
                // volver al rango correcto
                if ((Character.isUpperCase(caracter) && descifradoChar < 'A') ||
                        (Character.isLowerCase(caracter) && descifradoChar < 'a')) {
                    descifradoChar += 26;
                }
                descifrado.append(descifradoChar);
            } else {
                // Si no es una letra, se mantiene sin cambios
                descifrado.append(caracter);
            }
        }
        return descifrado.toString();
    }
}
