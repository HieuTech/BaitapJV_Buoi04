public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {

    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime  = System.currentTimeMillis();
    }

}
