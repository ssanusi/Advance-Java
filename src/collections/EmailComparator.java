package collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
