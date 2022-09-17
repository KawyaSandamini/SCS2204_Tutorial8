case class Point(var x:Int, var y:Int) {
    //a. add(+) should add two given points
    def add(p:Point) = new Point(this.x + p.x, this.y + p.y)
    //b. move should move a point by a given distance dx and dy
    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }
    //c. distance should return the distance between two given points
    def distance(p:Point):Double = {
        var dx:Int = this.x - p.x
        var dy:Int = this.y - p.y
        var dist:Int = dx*dx + dy*dy
        scala.math.sqrt(dist)
    }
    //d. invert should switch the x and y coordinates
    def invert():Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }
}
object Point extends App {
    var a = Point(1,2)
    var b = Point(4,10)
    //Print addition of two given points
    println("Addition=> "+a.add(b))
    //Print move point by distance dx and dy
    a.move(2,4)
    println("Move a point by Point(2,4)=> "+a)
    //Print distance between two given points
    var d = a.distance(b)
    println("Distance between two points=> "+d)
    //Print switch x and y coordinates.
    a.invert()
    println("Switch x and y=> "+a)
}