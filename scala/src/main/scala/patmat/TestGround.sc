import patmat.Huffman._

decodedSecret
//searchCharCode('a',tree,Nil) :::
//  searchCharCode('r',tree,Nil) :::
//    searchCharCode('p',tree,Nil)
val tree = combine(combine(makeOrderedLeafList(times("abd".toList)))).head
encode(tree)("abd".toList)
"abd".map{ (char) => searchCharCode(char, tree, Nil)}
searchCharCode('a', tree, Nil)
decode(tree, List(1,0,1,1,0))
createCodeTree("abd")