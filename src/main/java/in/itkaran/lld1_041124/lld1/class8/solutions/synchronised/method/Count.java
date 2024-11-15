package in.itkaran.lld1_041124.lld1.class8.solutions.synchronised.method;

public class Count {
    int value = 0;

    public synchronized void changeValue(int offset) {
        // implicit lock on (this) object
        value += offset;
        // Business logic
        // value = value + offset;
        // implicit unlock on this object
    }

    public synchronized void decValue(int offset) {
        // implicit lock on (this) object
        value -= offset;
        // Business logic
        // value = value + offset;
        // implicit unlock on this object
    }

    public int getValue() {
        return value;
    }


    synchronized void fun() {
        // code here
        // Business logic
        //

        synchronized (this) {
            // implicit lock on this object
            // code here
            // critical section
            // implicit unlock on this object
        }

        // More business logic.

    }
}
