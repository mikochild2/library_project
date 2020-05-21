import java.util.concurrent.atomic.AtomicLong;

public class IDGenerator {
    private AtomicLong currentValue = new AtomicLong(0L);
    public long getNextValue(){
        return currentValue.getAndIncrement();
    }
}