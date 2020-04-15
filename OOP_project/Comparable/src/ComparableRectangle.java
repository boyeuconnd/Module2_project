public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    @Override
    public int compareTo(ComparableRectangle rec) {
        if(super.getWidth()>rec.getWidth()) return 1;
        else if(super.getWidth()<rec.getWidth()) return -1;
        else return 1;
    }
}
