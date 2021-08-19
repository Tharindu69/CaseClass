object MyApp{

    case class Point(x:Int, y:Int){
        
        def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy);

        def +(that : Point) = Point(this.x + that.x, this.y + that.y);

        def distance(that : Point) = math.hypot(this.x - that.x, this.y - that.y);

        def invert() = Point(this.y, this.x);
    }


    def main(args:Array[String]){

        val p1 = Point(0,0);
        val p2 = Point(4,5);
        val p3 = Point(5,5);
        print("\n\n");
        println("add two given points " +p2+" and " +p3+ "  :-");
        val p4 = p2 + p3;
        println("\t\t"+p4);
        print("\n");

        println("move a point"+p1+" by a given distance(10,15) :-");
        val p5 = p1.move(10,15);
        println("\t\t"+p5);
        print("\n");

        println("The distance between two given points"+p1+" and "+p3+ " :-");
        val dis = p1.distance(p3);
        println("\t\t"+dis);
        print("\n");

        println("switch the x and y coordinates of "+p2+ " :-");
        val p6 = p2.invert();
        println("\t\t"+p6);
        print("\n");

    }


}

