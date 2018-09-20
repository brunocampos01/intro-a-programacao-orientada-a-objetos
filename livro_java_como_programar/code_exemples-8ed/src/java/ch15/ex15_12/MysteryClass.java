// Exercício 15.12: MysteryClass.java

package ch15.ex15_12;

public class MysteryClass
{
   public int mystery( int array2[], int size )
   {
      if ( size == 1 )
         return array2[ 0 ];
      else
         return array2[ size - 1 ] + mystery( array2, size - 1 );
   } // fim do método mystery
} // fim da classe MysteryClass 


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