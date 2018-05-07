package app;

public class ValidateTweetResponseDto {
    private boolean tweetValid;

    public boolean isTweetValid() {
        return tweetValid;
    }

    public void setTweetValid(boolean tweetValid) {
        this.tweetValid = tweetValid;
    }

    public ValidateTweetResponseDto() {}

    public ValidateTweetResponseDto(boolean tweetValid) {
        this.tweetValid = tweetValid;
    }
}
