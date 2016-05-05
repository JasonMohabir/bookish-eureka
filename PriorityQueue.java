//Team Bookish Eureka: Arpita Abrol, Jason Mohabir, William Xiang                                                                                                                    
//APCS2 pd10                                                                                                                                                                         
//HW35 -- Privileged Status Gets You to the Front of the Line                                                                                                                        
//2016-05-04 

public interface PriorityQueue<Comparable>
{ 
    // postcondition: returns true if the number of elements in 
    //                 the priority queue is 0; otherwise, returns false 
    boolean isEmpty(); 

    // postcondition: x has been added to the priority queue; 
    //                 number of elements in the priority queue is increased by 1 
    void add(Comparable x); 

    // postcondition: The smallest item in the priority queue is removed 
    //                 and returned; the number of elements in the priority queue 
    //                 is decreased by 1
    //                 throws an unchecked exception if the priority queue is empty 
    Comparable removeMin(); 

    // postcondition: The smallest item in the priority queue is returned; the 
    //                 priority queue is unchanged 
    //                 throws an unchecked exception if the priority queue is empty 
    Comparable peekMin(); 
} 