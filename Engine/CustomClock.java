package Engine;

public class CustomClock {
    private long startTime = 0; // Time when the clock started
    private long pausedTime = 0; // Time when the clock was paused
    private boolean running = false; // Is the clock running?
    private double speedMultiplier = 1.0; // Speed of the clock (1x, 2x, 4x)

    // Start the clock at normal speed
    public void startClock() {
        if (!running) {
            startTime = System.currentTimeMillis() - pausedTime;
            pausedTime = 0;
            running = true;
            speedMultiplier = 1.0; // Reset to normal speed
        }
    }

    // Run the clock at 2x speed
    public void runAtTwoTimesSpeed() {
        if (running) {
            pausedTime = (long) ((System.currentTimeMillis() - startTime) * speedMultiplier);
            startTime = System.currentTimeMillis();
            speedMultiplier = 2.0;
        }
    }

    // Run the clock at 4x speed
    public void runAtFourTimesSpeed() {
        if (running) {
            pausedTime = (long) ((System.currentTimeMillis() - startTime) * speedMultiplier);
            startTime = System.currentTimeMillis();
            speedMultiplier = 4.0;
        }
    }

    // Pause the clock
    public void pauseClock() {
        if (running) {
            pausedTime = (long) ((System.currentTimeMillis() - startTime) * speedMultiplier);
            running = false;
        }
    }

    // Get the elapsed time in milliseconds
    public long getElapsedTime() {
        if (running) {
            return (long) ((System.currentTimeMillis() - startTime) * speedMultiplier);
        }
        return pausedTime;
    }

    public static void main(String[] args) throws InterruptedException {
        CustomClock clock = new CustomClock();

        // Start the clock
        clock.startClock();
        System.out.println("Clock started...");

        // Let it run for 2 seconds
        Thread.sleep(2000);

        // Print elapsed time at normal speed
        System.out.println("Elapsed time: " + clock.getElapsedTime() + "ms");

        // Run at 2x speed
        clock.runAtTwoTimesSpeed();
        System.out.println("Clock running at 2x speed...");

        // Let it run for another 2 seconds
        Thread.sleep(2000);

        // Print elapsed time at 2x speed
        System.out.println("Elapsed time: " + clock.getElapsedTime() + "ms");

        // Run at 4x speed
        clock.runAtFourTimesSpeed();
        System.out.println("Clock running at 4x speed...");

        // Let it run for another 2 seconds
        Thread.sleep(2000);

        // Print elapsed time at 4x speed
        System.out.println("Elapsed time: " + clock.getElapsedTime() + "ms");

        // Pause the clock
        clock.pauseClock();
        System.out.println("Clock paused...");

        // Print final elapsed time
        System.out.println("Final elapsed time: " + clock.getElapsedTime() + "ms");
    }
}
