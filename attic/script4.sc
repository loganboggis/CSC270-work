import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/littlewomen.txt")


val oneBigString: String = myLines.mkString(" ")


val myChars: Vector[Char] = oneBigString.toVector.filter( _.toHexString != "feff")


val noSpaces: Vector[Char] = myChars.filter( _ != ' ')

val groupedChars: Vector[ (Char, Vector[Char] ) ] = {
	noSpaces.groupBy( c => c ).toVector
}

val charHistoUnsorted: Vector[ (Char, Int) ] = {
	groupedChars.map( c => {
		( c._1, c._2.size )
	})
}

val charHisto: Vector[ (Char, Int) ] = charHistoUnsorted.sortBy( _._2 )

val codeHisto: Vector[String] = charHisto.map( c => {
	c._1.toHexString
})



/*
val crazyHisto: Vector[ ( String, Int ) ] = {
	myLines.mkString.filter( _ != ' ').groupBy( c => c).toVector.map( t => (t._1, t._2.size ) ).sortBy( _._2 ).reverse.map( t => ( t._1.toString, t._2 ) )
}
*/

// charHisto == crazyHisto

for ( h <- charHisto ) println( s"${h._1}\t${h._2}" )
