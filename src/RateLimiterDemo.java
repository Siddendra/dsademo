/**
 * Rate Limiter – Problem Statement
 * Design and implement a Rate Limiter in Java that restricts the number of requests a user can make in a given time window.
 *
 * 60 seconds, 10 requests to be made, 11 th request should be rejected.
 *
 * and then once the window cools down it then allow to make another request
 *
 * last 60 seconds
 *
 */
class RateLimiter {

    private int windowTime = 60000;
    private int requestsSize = 10;

    RateLimiter(int windowTime,  int requestsSize) {
        this.requestsSize = requestsSize;
        this.windowTime = windowTime;
    }


}

public class RateLimiterDemo {


}
