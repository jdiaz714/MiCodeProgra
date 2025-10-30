import java.util.*;

public class TallerFunciones {

    public static void edad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int e = sc.nextInt();
        System.out.println("Tu edad es: " + e + " años");
    }

    public static void suma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double b = sc.nextDouble();
        System.out.println("La suma es: " + (a + b));
    }

    public static void numAleatorio() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        while (true) {
            System.out.print("Adivina el número: ");
            int intento = sc.nextInt();
            if (intento == n) {
                System.out.println("¡Felicitaciones, adivinaste el número!");
                break;
            } else if (intento < n) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }
    }

    public static int contadorVocales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int c = 0;
        for (char ch : cadena.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) c++;
        }
        System.out.println("Número de vocales: " + c);
        return c;
    }

    public static boolean palindromo(String palabra) {
        if (palabra.equalsIgnoreCase(new StringBuilder(palabra).reverse().toString())) {
            System.out.println("Es palíndromo");
            return true;
        } else {
            System.out.println("No es palíndromo");
            return false;
        }
    }

    public static void calcularPotencia(double base, double exponente) {
        System.out.println("Resultado: " + Math.pow(base, exponente));
    }

    public static void calcularMedia(double[] lista) {
        double suma = 0;
        for (double n : lista) suma += n;
        if (lista.length == 0) System.out.println("Lista vacía");
        else System.out.println("Media: " + (suma / lista.length));
    }

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static double mayorDeTresNumeros(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double calcularArea(double radio, double altura) {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

    public static boolean buscarPalabra(String cadena, String palabra) {
        return cadena.contains(palabra);
    }

    public static double promedio(double... numeros) {
        if (numeros.length == 0) return 0;
        double suma = 0;
        for (double n : numeros) suma += n;
        return suma / numeros.length;
    }

    public static List<Double> multiplicarLista(List<Double> lista, double numero) {
        List<Double> resultado = new ArrayList<>();
        for (double n : lista) resultado.add(n * numero);
        return resultado;
    }

    public static double mayorDeVariosNumeros(double... numeros) {
        double mayor = numeros[0];
        for (double n : numeros) if (n > mayor) mayor = n;
        return mayor;
    }

    public static double calcularMediana(double... numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n == 0) return 0;
        if (n % 2 == 0) return (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
        else return numeros[n / 2];
    }

    public static int contarOcurrencias(String cadena, String palabra) {
        int contador = 0, index = 0;
        while ((index = cadena.indexOf(palabra, index)) != -1) {
            contador++;
            index += palabra.length();
        }
        return contador;
    }

    public static void menuNivel1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Nivel 1: Funciones sin parámetros ni retorno ---");
            System.out.println("1. Edad");
            System.out.println("2. Suma");
            System.out.println("3. Número aleatorio");
            System.out.println("4. Contador de vocales");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            String op = sc.nextLine();
            if (op.equals("1")) edad();
            else if (op.equals("2")) suma();
            else if (op.equals("3")) numAleatorio();
            else if (op.equals("4")) contadorVocales();
            else if (op.equals("5")) break;
            else System.out.println("Opción inválida");
        }
    }

    public static void menuNivel2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Nivel 2: Funciones con parámetros sin retorno ---");
            System.out.println("1. Palíndromo");
            System.out.println("2. Calcular potencia");
            System.out.println("3. Calcular media");
            System.out.println("4. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            String op = sc.nextLine();
            if (op.equals("1")) {
                System.out.print("Palabra: ");
                String palabra = sc.nextLine();
                palindromo(palabra);
            } else if (op.equals("2")) {
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Exponente: ");
                double exp = sc.nextDouble();
                sc.nextLine();
                calcularPotencia(base, exp);
            } else if (op.equals("3")) {
                System.out.print("Cantidad de números: ");
                int n = sc.nextInt();
                double[] lista = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    lista[i] = sc.nextDouble();
                }
                sc.nextLine();
                calcularMedia(lista);
            } else if (op.equals("4")) break;
            else System.out.println("Opción inválida");
        }
    }

    public static void menuNivel3() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Nivel 3: Funciones con parámetros y retorno ---");
            System.out.println("1. Invertir cadena");
            System.out.println("2. Mayor de tres números");
            System.out.println("3. Calcular área del cilindro");
            System.out.println("4. Buscar palabra");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            String op = sc.nextLine();
            if (op.equals("1")) {
                System.out.print("Cadena: ");
                String cad = sc.nextLine();
                System.out.println("Cadena invertida: " + invertirCadena(cad));
            } else if (op.equals("2")) {
                System.out.print("Número 1: ");
                double a = sc.nextDouble();
                System.out.print("Número 2: ");
                double b = sc.nextDouble();
                System.out.print("Número 3: ");
                double c = sc.nextDouble();
                sc.nextLine();
                System.out.println("El mayor es: " + mayorDeTresNumeros(a, b, c));
            } else if (op.equals("3")) {
                System.out.print("Radio: ");
                double r = sc.nextDouble();
                System.out.print("Altura: ");
                double h = sc.nextDouble();
                sc.nextLine();
                System.out.println("Área del cilindro: " + calcularArea(r, h));
            } else if (op.equals("4")) {
                System.out.print("Cadena: ");
                String cad = sc.nextLine();
                System.out.print("Palabra a buscar: ");
                String pal = sc.nextLine();
                if (buscarPalabra(cad, pal)) System.out.println("La palabra está en la cadena");
                else System.out.println("La palabra no está en la cadena");
            } else if (op.equals("5")) break;
            else System.out.println("Opción inválida");
        }
    }

    public static void menuNivel4() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Nivel 4: Funciones con múltiples parámetros y retorno ---");
            System.out.println("1. Promedio");
            System.out.println("2. Multiplicar lista");
            System.out.println("3. Mayor de varios números");
            System.out.println("4. Calcular mediana");
            System.out.println("5. Contar ocurrencias");
            System.out.println("6. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            String op = sc.nextLine();
            if (op.equals("1")) {
                System.out.print("Números separados por espacio: ");
                String[] parts = sc.nextLine().split(" ");
                double[] nums = Arrays.stream(parts).mapToDouble(Double::parseDouble).toArray();
                System.out.println("Promedio: " + promedio(nums));
            } else if (op.equals("2")) {
                System.out.print("Lista de números separados por espacio: ");
                String[] parts = sc.nextLine().split(" ");
                List<Double> lista = new ArrayList<>();
                for (String s : parts) lista.add(Double.parseDouble(s));
                System.out.print("Número a multiplicar: ");
                double num = sc.nextDouble();
                sc.nextLine();
                System.out.println("Resultado: " + multiplicarLista(lista, num));
            } else if (op.equals("3")) {
                System.out.print("Números separados por espacio: ");
                String[] parts = sc.nextLine().split(" ");
                double[] nums = Arrays.stream(parts).mapToDouble(Double::parseDouble).toArray();
                System.out.println("El mayor es: " + mayorDeVariosNumeros(nums));
            } else if (op.equals("4")) {
                System.out.print("Números separados por espacio: ");
                String[] parts = sc.nextLine().split(" ");
                double[] nums = Arrays.stream(parts).mapToDouble(Double::parseDouble).toArray();
                System.out.println("Mediana: " + calcularMediana(nums));
            } else if (op.equals("5")) {
                System.out.print("Cadena: ");
                String cad = sc.nextLine();
                System.out.print("Palabra a contar: ");
                String pal = sc.nextLine();
                System.out.println("Ocurrencias: " + contarOcurrencias(cad, pal));
            } else if (op.equals("6")) break;
            else System.out.println("Opción inválida");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n========== TALLER DE FUNCIONES EN JAVA ==========");
            System.out.println("1. Nivel 1: Funciones sin parámetros ni retorno");
            System.out.println("2. Nivel 2: Funciones con parámetros sin retorno");
            System.out.println("3. Nivel 3: Funciones con parámetros y retorno");
            System.out.println("4. Nivel 4: Funciones con múltiples parámetros y retorno");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            String op = sc.nextLine();
            if (op.equals("1")) menuNivel1();
            else if (op.equals("2")) menuNivel2();
            else if (op.equals("3")) menuNivel3();
            else if (op.equals("4")) menuNivel4();
            else if (op.equals("5")) {
                System.out.println("Saliendo del programa...");
                break;
            } else System.out.println("Opción inválida");
        }
    }
}
