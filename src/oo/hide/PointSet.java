package oo.hide;
import java.util.Objects;

public class PointSet {

    private Integer initialCapacity;
    private Point point;
    private Point [] pointSet;
    private int counter;

    public PointSet(Integer initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    public PointSet() {

    }
    public void helper() {
        Point [] largerSet = new Point[initialCapacity * 2];
        System.arraycopy(pointSet,0,largerSet,0,initialCapacity);
        pointSet = largerSet;
    }

    public void add(Point point) {
        this.point = point;
        counter++;
        if (pointSet == null) {
            if (initialCapacity == null) {
                pointSet = new Point[100];
            }else{
                pointSet = new Point[initialCapacity];
            }
        }
        if (initialCapacity == null) {
            if (!contains(point)) {
                pointSet[size()] = point;
            }
        } else {
            if (counter > initialCapacity) {
                helper();
            } else {
                pointSet[size()] = point;
            }
        }
    }



    public Integer size() {
        int size = 0;
        for(int i=0;i<pointSet.length;i++) {
            if (pointSet[i] != null) {
                size++;
            }
        }return size;
    }

    public boolean contains(Point p) {
        for(int i=0;i<pointSet.length;i++) {
            if(Objects.equals(p, pointSet[i])) {
                return true;
            }
        }return false;
    }

    @Override
    public String toString() {
        String output = "";
        for (Point p : pointSet) {
            if (p == null) {
                ;
            }else{
                output += String.format("%s, ",p);
            }
        }return output.substring(0, output.length()-2);

    }
}
