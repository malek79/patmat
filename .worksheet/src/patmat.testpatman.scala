package patmat
import Huffman._ ;

object testpatman {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(155); 

 val t1 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9);System.out.println("""t1  : patmat.Huffman.Fork = """ + $show(t1 ));$skip(45); 
  val enc1 = encode(t1)(string2Chars("abd"));System.out.println("""enc1  : List[patmat.Huffman.Bit] = """ + $show(enc1 ));$skip(18); 
  println( enc1 );$skip(50); 
  println( quickEncode(t1)(string2Chars("abd")) );$skip(28); 

  println( decodedSecret )}

}
