// Fig. 20.10: AdditionApplet.java
// Adicionando dois n�meros de ponto flutuante.
import java.awt.Graphics;       // o programa utiliza a classe Graphics
import javax.swing.JApplet;     // o programa utiliza a classe JApplet
import javax.swing.JOptionPane; // o programa utiliza a classe JOptionPane

public class AdditionApplet extends JApplet 
{
   private double sum; // soma dos valores inseridos pelo usu�rio

   // inicializa um applet obtendo os valores inseridos pelo usu�rio
   public void init()
   {
      String firstNumber;  // primeira string inserida pelo usu�rio
      String secondNumber; // segunda string inserida pelo usu�rio

      double number1; // primeiro n�mero a adicionar
      double number2; // segundo n�mero a adicionar

      // obt�m do usu�rio o primeiro n�mero
      firstNumber = JOptionPane.showInputDialog(
         "Enter first floating-point value" );

      // obt�m do usu�rio o segundo n�mero 
      secondNumber = JOptionPane.showInputDialog(
         "Enter second floating-point value" );

      // converte os n�meros de tipo String para tipo double
      number1 = Double.parseDouble( firstNumber );      
      number2 = Double.parseDouble( secondNumber );     

      sum = number1 + number2; // soma os n�meros
   } // fim do m�todo init

   // desenha os resultados em um ret�ngulo sobre o fundo do applet
   public void paint( Graphics g )
   {
      super.paint( g ); // chama a vers�o da superclasse do m�todo paint

      // desenha um ret�ngulo iniciando em (15, 10) que tem 270
      // pixels de largura e 20 pixels de altura
      g.drawRect( 15, 10, 270, 20 );

      // desenha os resultados como uma String em (25, 25)
      g.drawString( "The sum is " + sum, 25, 25 );
   } // fim do m�todo paint
} // fim da classe AdditionApplet


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/