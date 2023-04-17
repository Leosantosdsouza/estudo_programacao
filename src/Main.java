import java.util.Locale;  //Importar a classe para voce declarar a localidade.

//Primeiro Programa! 

public class Main {					// Todo Programa tem que fazer parte de uma classe, no caso a nossa classe é a "public class main".

	public static void main(String[] args) //Todo codigo é organizado em funções, e todo codigo tem que ser declaro em alguma função. Definição de ponto de entrada "Enter point".
	
	{		
		
		int y = 32;		// Declaramos a variavel "int" (Inteiro), como "Y", e colocamos um valor dentro da variavel que é 32.
		System.out.println(y); 		//Ira mostrar na tela o que está dentro da variavel "int y".
		
		double x = 10.35784;		//Declaramos a variavel "double" (Flutuante), como "X", e colocamos um valor dentro da variavel que é 10.35784 (numero quebrado).
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		
		System.out.println (x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f %n", x);		//Ira mostrar na tela o que está dentro da variavel "double x". Delimita as casas decimais %.2, ou %.4..., "%n", Quebra de linha. Tudo dentro das aspas. "printf", significa que está formatado o print.
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f %n", x);
		Locale.setDefault(Locale.US);			//Declara a localização do grupo.
		
		
		
		System.out.print("Bom Dia!");			//ln quebra de linha, sem ln sem quebra de linha.
		System.out.println("Ola Mundo!");		//Codigo que criaremos para Mostrar (Imprimir), na tela, algo escrito nas aspas.
		
		System.out.println( "RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f  METROS%n ", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);  //%f = ponto flutuante , %d = inteiro , %s = texto %n = quebra de linha, %c pega o valor e converte para letra.
		

		
	}

}
