import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        return 0;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        return 0.0;
    }

    public double getLargestSide(Shape s) {
        // Start with totalPerim = 0
        double largestSide = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            if (currDist > largestSide)
            // Update prevPt to be currPt
                largestSide = currDist;
                
            prevPt = currPt;
        }
        // totalPerim is the answer
        return largestSide;
    }

    public double getLargestX(Shape s) {
        // Put code here
        return 0.0;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        System.out.println("largest = " + getLargestSide(s));
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }
    
    
        public void testFileWithLargestPerimeter() {
        // Put code here
        //String[] filesStr = {"datatest1.txt", "datatest2.txt", "datatest3.txt", "datatest4.txt", "datatest5.txt", "datatest6.txt"};
        String[] filesStr = {"example1.txt", "example2.txt", "example3.txt", "example4.txt"};
        //String[] filesStr = {"dataset1.txt", "dataset2.txt", "dataset3.txt", "dataset4.txt", "dataset5.txt", "dataset6.txt"};
        FileResource[] frs = new FileResource[filesStr.length];
        for (int i = 0; i < filesStr.length; i++) {
            frs[i] = new FileResource(filesStr[i]);
        }
        
        double largest_perimeter = 0;
        int index = -1;
        for (int i = 0; i < frs.length; i++) {
            Shape s = new Shape(frs[i]);
            double curr = getPerimeter(s);

            if (curr  > largest_perimeter) {
                largest_perimeter = curr;
                index = i;
            }
                
        }
        System.out.println(largest_perimeter);
        System.out.println(index + 1);        
    }

    /*
    public void testFileWithLargestPerimeter() {
        // Put code here
        String[] filesStr = {"example1.txt", "example2.txt", "example3.txt", "example4.txt"};
        FileResource[] frs = new FileResource[filesStr.length];
        for (int i = 0; i < filesStr.length; i++) {
            frs[i] = new FileResource(filesStr[i]);
        }
        
        double largest_perimeter = 0;
        for (int i = 0; i < frs.length; i++) {
            Shape s = new Shape(frs[i]);
            double curr = getPerimeter(s);
            if (curr  > largest_perimeter) {
                largest_perimeter = curr;
            }
                
        }
        System.out.println(largest_perimeter);
    }*/

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        pr.testFileWithLargestPerimeter();
    }
}
