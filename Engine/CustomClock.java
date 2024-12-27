package Engine;

public class CustomClock {
    private long startTime = 0;  // Time when the clock started
    private long pausedTime = 0; // Time when the clock was paused
    private boolean running = false; // Is the clock running?
    private double speedMultiplier = 1.0; // Speed of the clock (1x, 2x, 4x)

    // Constructor to initialize the CustomClock
    public CustomClock() {
        // Initialize variables if necessary (not strictly needed as they're already initialized)
    }

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

    // Reset the clock
    public void resetClock() {
        startTime = 0;
        pausedTime = 0;
        running = false;
        speedMultiplier = 1.0;
    }

    // Getter for running status
    public boolean isRunning() {
        return running;
    }

    // Getter for the current speed multiplier
    public double getSpeedMultiplier() {
        return speedMultiplier;
    }
}
