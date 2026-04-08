package regex;

import java.util.concurrent.TimeUnit;

public class RetriLogic {

	    private static final int MAX_ATTEMPTS = 3;
	    private static final long DELAY_MS = 1000; // 1 second

	    public static void main(String[] args) {
	        try {
	            performOperationWithRetries();
	            System.out.println("Operation succeeded!");
	        } catch (Exception e) {
	            System.err.println("Operation failed after " + MAX_ATTEMPTS + " attempts: " + e.getMessage());
	        }
	    }

	    public static void performOperationWithRetries() throws Exception {
	        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
	            try {
	                System.out.println("Attempt " + attempt + " of " + MAX_ATTEMPTS);
	                // The actual operation that might fail
	                flakyOperation(); 
	                return; // Success, exit the loop and method
	            } catch (TransientException e) {
	                System.err.println("Transient failure: " + e.getMessage());
	                if (attempt == MAX_ATTEMPTS) {
	                    throw e; // Rethrow on the last attempt
	                }
	                // Wait before the next attempt
	                TimeUnit.MILLISECONDS.sleep(DELAY_MS); 
	            }
	        }
	    }

	    // Simulate an operation that fails intermittently with a custom exception
	    private static void flakyOperation() throws TransientException {
	        if (Math.random() < 0.7) { // 70% chance of failure
	            throw new TransientException("API service temporarily unavailable");
	        }
	        // Success case
	    }
	}

	// A custom exception to distinguish from non-retryable errors
	class TransientException extends RuntimeException {
	    public TransientException(String message) {
	        super(message);
	    }
	}
