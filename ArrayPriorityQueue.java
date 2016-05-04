import java.util.ArrayList;

//Team Bookish Eureka: Arpita Abrol, Jason Mohabir, William Xiang
//APCS2 pd10
//HW35 -- Privileged Status Gets You to the Front of the Line  
//2016-05-04 

public class ArrayPriorityQueue {

    ArrayList items;

    public ArrayPriorityQueue() {
        items = new ArrayList();
    }
    
    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void add( int x ) {
        items.add(x);
    }

    public int removeMin() {
        int min = peekMin();
        items.remove(min);
        return min; 
    }

    public int peekMin() {
        int minIndex = 0;
	for (int i = 1; i < items.size(); i++) //reigning champ algo
            {
                if ( (int)items.get(i) < (int)items.get(minIndex)) {minIndex = i;}
            }
	return (int)items.get(minIndex);
    }

    public static void main(String[] args) {
        ArrayPriorityQueue tomo = new ArrayPriorityQueue();
        tomo.add(1);
        tomo.add(5);
        tomo.add(7);
        tomo.add(2);
        tomo.add(5);
        System.out.println(tomo.peekMin());
    }

} //end class