package org.lantern.state;

/**
 * Common interface for friends.
 */
public interface Friend {

    public enum Status {
        friend,
        rejected,
        pending //everything else
    }
    
    public enum SuggestionReason {
        friendedYou,
        runningLantern
    }

    Long getId();

    void setId(Long id);
    
    String getUserEmail();

    void setUserEmail(String userEmail);

    String getEmail();

    void setEmail(String email);

    String getName();

    void setName(String name);
    
    Status getStatus();

    void setStatus(Status status);
    
    void setLastUpdated(long lastUpdated);
    
    long getLastUpdated();
    
    void setFreeToFriend(boolean freeToFriend);
    
    /**
     * Indicates whether friending this friend is free (i.e. they've already
     * friended you).
     * 
     * @return
     */
    boolean isFreeToFriend();
    
    SuggestionReason getReason();
    
    void setReason(SuggestionReason reason);

}
