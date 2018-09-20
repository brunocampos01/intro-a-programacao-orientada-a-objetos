// Fig. 9.13: BasePlusCommissionEmployee4.java
// Classe BasePlusCommissionEmployee4 herda de CommissionEmployee3 e
// acessa os dados privados de CommissionEmployee3 via os de CommissionEmployee3
// métodos public.

package ch09.fig09_12_14;

public class BasePlusCommissionEmployee4 extends CommissionEmployee3
{
   private double baseSalary; // salário-base por semana

   // construtor de seis argumentos
   public BasePlusCommissionEmployee4( String first, String last, 
      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); // valida e armazena salário-base
   } // fim do construtor BasePlusCommissionEmployee4 de seis argumentos
   
   // configura o salário-base
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
   } // fim do método setBaseSalary

   // retorna o salário-base
   public double getBaseSalary()
   {
      return baseSalary;
   } // fim do método getBaseSalary

   // calcula os lucros                 
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   } // fim do método earnings

   // retorna a representação String de BasePlusCommissionEmployee4
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary() );   
   } // fim do método toString
} // fim da classe BasePlusCommissionEmployee4 


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