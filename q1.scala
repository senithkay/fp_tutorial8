object test extends App{
    case class Point(x:Double , y: Double)

    def add(p1: Point, p2: Point):Point = Point(p1.x+p2.x, p1.y+p2.y);
    def move(p1:Point,dx: Double, dy:Double):Point = Point(p1.x + dx , p1.y+dy);
    def distance(p1: Point, p2:Point):Double = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y)); 
    def invert(p1: Point): Point = {val x = p1.x; Point(p1.y, x);}
    
    val p1 = Point(1,2)
    val p2 = Point(3,4)
    println(add(p1,p2));
    println(move(p1,100, 200));
    println(distance(p1,p2));
    println(invert(p1));
}

