public class Stopwatch {
    private long startTime;
    private long pausedTime;
    private boolean isRunning;
    
    // Constructor
    public Stopwatch() {
        this.startTime = 0;
        this.pausedTime = 0;
        this.isRunning = false;
    }
    
    // Start the stopwatch
    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - pausedTime;
            isRunning = true;
            System.out.println("Stopwatch started!");
        }
    }
    
    // Stop (pause) the stopwatch
    public void stop() {
        if (isRunning) {
            pausedTime = System.currentTimeMillis() - startTime;
            isRunning = false;
            System.out.println("Stopwatch paused!");
        }
    }
    
    // Reset the stopwatch
    public void reset() {
        startTime = 0;
        pausedTime = 0;
        isRunning = false;
        System.out.println("Stopwatch reset!");
    }
    
    // Get elapsed time in milliseconds
    public long getElapsedTime() {
        if (isRunning) {
            return System.currentTimeMillis() - startTime;
        } else {
            return pausedTime;
        }
    }
    
    // Get hours
    public int getHours() {
        long elapsedTime = getElapsedTime();
        return (int) (elapsedTime / (1000 * 60 * 60));
    }
    
    // Get minutes
    public int getMinutes() {
        long elapsedTime = getElapsedTime();
        return (int) ((elapsedTime / (1000 * 60)) % 60);
    }
    
    // Get seconds
    public int getSeconds() {
        long elapsedTime = getElapsedTime();
        return (int) ((elapsedTime / 1000) % 60);
    }
    
    // Get milliseconds
    public int getMilliseconds() {
        long elapsedTime = getElapsedTime();
        return (int) (elapsedTime % 1000);
    }
    
    // Display time in HH:MM:SS format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", getHours(), getMinutes(), getSeconds());
    }
    
    // Get time as a formatted string
    public String getTimeString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
    
    // Check if stopwatch is running
    public boolean isRunning() {
        return isRunning;
    }
    
    // Main method to test the stopwatch
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        
        // Start the stopwatch
        stopwatch.start();
        System.out.println("Running for 5 seconds...");
        
        // Display time every second
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Elapsed time: " + stopwatch.getTimeString());
        }
        
        // Stop the stopwatch
        stopwatch.stop();
        System.out.println("Final time: " + stopwatch.getTimeString());
        
        // Restart
        System.out.println("\nResuming stopwatch...");
        stopwatch.start();
        Thread.sleep(2000);
        stopwatch.stop();
        System.out.println("Final time: " + stopwatch.getTimeString());
        
        // Reset
        stopwatch.reset();
        System.out.println("After reset: " + stopwatch.getTimeString());
    }
}
