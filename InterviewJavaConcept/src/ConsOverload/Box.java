package ConsOverload;

class Box 
{ 
    double width, height, depth; 
    int boxNo;  
    Box(double w, double h, double d, int num) 
    { 
        width = w; 
        height = h; 
        depth = d; 
        boxNo = num; 
    } 
    Box() 
    { 
        width = height = depth = 10; 
    } 
    Box(int num) 
    { 
        this(); 
        boxNo = num; 
        System.out.println(boxNo); 
    } 
    public static void main(String[] args) 
    { 
        Box box1 = new Box(20); 
        System.out.println(box1.width); 
    } 
}