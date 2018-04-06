package patmat
import Huffman._ ;

object testpatman {

 val t1 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Fork(Leaf(a,2),Leaf(b,3),List(a, b),5),Leaf
                                                  //| (d,4),List(a, b, d),9)
  val enc1 = encode(t1)(string2Chars("abd"))      //> enc1  : List[patmat.Huffman.Bit] = List(0, 0, 0, 1, 1)
  println( enc1 )                                 //> List(0, 0, 0, 1, 1)
  println( quickEncode(t1)(string2Chars("abd")) ) //> List(0, 0, 0, 1, 1)

  println( decodedSecret )                        //> List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)

}