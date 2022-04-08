import java.util.*;

public class Sort2 {
    public void printElements() {
        List<Time2> list = new ArrayList<Time2>();

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 24, 22));

        Collections.sort(list, new TimeComparator());

        System.out.printf("Sorted list elements: \n%s\n");
    }

    public static void main(String args[]) {
        Sort2 sort2 = new sort2();
        sort2.printElements();
    }
}

class TimeComparator implements Comparator<Time2> {
    public int compare(Time2 time1, Time2 time2) {
        int hourCompare = time1.getHour() - time2.getHour();

        if (hourCompare != 0) {
            return hourCompare;
        }

        int minuteCompare = time1.getMinute() - time2.getMinute();

        if (minuteCompare != 0) {
            return minuteCompare;
        }

        int secondCompare = time1.getSecond() - time2.getSecond();

        return secondCompare;
    }
}