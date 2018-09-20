//7.20		faltou gerar um numero diferente para cada venda
public class VendasTotais {
	public static void main(String []args){
		
		int produto = 4;
		int vendedor = 4;
		int valores = gerador();
		
		
		
		int [][]sales = new int[produto][vendedor];
		
		//garante tudo inicializado
		for (int i = 0; i < sales.length; i++)
		{
			for (int j = 0; j < sales[i].length; j++)
			sales[i][j] = 1;
		}
		
		//imprime titulos de colunas
		System.out.print( "         " );
		for(int titulo=0; titulo<sales[0].length; titulo++)
			System.out.printf("  P %d", titulo + 1);
		System.out.printf("\tTOTAL");
		System.out.println();	//separa por colunas
		

		//percorre ´loop´ as linhas
		for(int linha=0; linha<sales.length; linha++){
			System.out.printf("vendedor %d|  ", linha + 1);	//imprime o vendedor				

			//percorre ´loop´ as colunas
			for(int coluna=0; coluna<sales[linha].length; coluna++){
				
				sales [linha][coluna]= valores;
				
				System.out.printf("%d   ", sales[linha][coluna]);
				
			}
			//realiza a soma no final de cada linha
			int totalVendido = getTotalVendedor(sales[linha]);
			System.out.printf("   =  %d ", totalVendido);
			
			System.out.println();	//separa por colunas
			
		}
		//imprime a ultima linha de totais por produto
		
		int totalProduto = getTotalVendedor(sales[0]);
		
		System.out.print( "TOTAL p|" );
		for(int titulo=0; titulo<sales[0].length; titulo++)
			System.out.printf("   %d", totalProduto);
		
		System.out.printf("       %d  ", totalProduto*produto );
		System.out.println();	//separa por colunas
		
		
		
	}
	public static int gerador(){
		double geradorVendas =  (Math.random()*10);
		return (int) geradorVendas;
	}
	public static int getTotalVendedor(int[] setTotal){
		int total = 0;
		//soma os produtos
		for(int valor : setTotal) // armazene setTotal em valor
			total += valor;
		return total;
	}

}