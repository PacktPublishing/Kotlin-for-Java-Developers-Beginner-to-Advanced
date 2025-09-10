//Invariance
open class Figure
class Triangle : Figure()
class Circle: Figure()
class Square: Figure()

class Container<T>(var content: T)

fun main(){
    val triangleContainer = Container(Triangle())
    val circleContainer = Container(Circle())
    val squareContainer = Container(Square())
    val figureContainer: Container<Figure> = Container(Figure())
    val figureContainter1: Container<Figure> = triangleContainer

}

/*Covariance(out)
open class Figure
class Triangle : Figure()
class Circle: Figure()
class Square: Figure()

class Container<out T>(val content: T)

fun main(){
     val containerTriangle:Container<Triangle> = Container(Triangle())
     val containerFigure: Container<Figure> = containerTriangle
 }
 */


/*Contravariance
open class Figure
class Triangle : Figure()
class Circle: Figure()
class Square: Figure()

class Container<in T> {
    fun setContent(content:T){
        println(content)
    }
}

fun main(){
    val figureContainer: Container<Figure> = Container()
    val triangleContainer: Container<Triangle> = figureContainer

    triangleContainer.setContent(Triangle())
    figureContainer.setContent(Square())

}

 */
