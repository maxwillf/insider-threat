abstract public class LogEntry {
    
    String id;

    public LogEntry(String id){
        this.id = id;
    }

    public String toString(){ return this.id;}
}
