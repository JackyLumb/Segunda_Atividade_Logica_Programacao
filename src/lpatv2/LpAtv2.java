package lpatv2;

import java.util.Scanner;

public class LpAtv2 {

    public static void main(String[] args) {
        
        double quant_lata, quant_garrafa, quant_garrafa_2l, litro_lata, litro_garrafa, litro_2l, litro_total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas compradas: ");
        quant_lata = entrada.nextDouble();

        System.out.print("Digite a quantidade de garrafas de 600ml compradas: ");
        quant_garrafa = entrada.nextDouble();

        System.out.print("Digite a quantidade de garrafas de 2L compradas: ");
        quant_garrafa_2l = entrada.nextDouble();

        litro_lata = quant_lata * 0.350;

        litro_garrafa = quant_garrafa * 0.600;

        litro_2l = quant_garrafa_2l * 2;

        litro_total = litro_2l + litro_lata + litro_garrafa;

        System.out.println("Foram compradas " + quant_lata + " de latas de 350ml, portanto foram comprados " + litro_lata + " litros de refrigerante nesse formato.");

        System.out.println("Foram compradas " + quant_garrafa + " de garrafas de 600ml, portanto foram comprados " + litro_garrafa + " litros de refrigerante nesse formato.");

        System.out.println("Foram compradas " + quant_garrafa_2l + " de garrafas de 2L, portanto foram comprados " + litro_2l + " litros de refrigerante nesse formato.");

        System.out.println("Foram comprados " + litro_total + " de litros de refrigerante no total.");

    }
}