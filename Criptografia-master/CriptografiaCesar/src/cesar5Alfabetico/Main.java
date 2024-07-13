package cesar5Alfabetico;
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        String mensaje = "Hola, este es un mensaje cifrado con Cesar +5!";
        String mensajeCifrado = CesarCipher5Alfab.cifrar(mensaje);
        System.out.println("/n Comienzo del programa de cigrado: ");
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        String mensajeDescifrado = CesarCipher5Alfab.descifrar(mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    }
}
