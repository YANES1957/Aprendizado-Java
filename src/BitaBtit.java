public class BitaBtit {
    public static void main(String[] args) {
        var valor1 = 6;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro numero de operação %s( representaçao binária %s \n" + valor1, binario1);
        var valor2 = 5;
        var binario2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo numero de operação %s( representaçao binária %s \n" + valor2, binario2);
        var resultado = valor1 & valor2;
        var resultadoBinário = Integer.toBinaryString(resultado);
        System.out.printf("%s | %s = %s \n" + valor1, valor2 | valor1, valor2);
    }

        /*

        0 = false
        1= verdadeiro
        110
        101
        111


         */

}

