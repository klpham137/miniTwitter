
package miniTwitter;

public class User {
    private String username;
    private long creationTime;
    private long lastUpdateTime;
    private String lastUser;

    public User(String username) {
    this.username = username;
    this.creationTime = System.currentTimeMillis();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime() {
        this.lastUpdateTime = System.currentTimeMillis();
    }
    
    public String getLastUser() {
    return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
    }


}

