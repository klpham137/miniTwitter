
package miniTwitter;

public class Group {
    private String groupName;
    private long creationTime;

    public Group(String groupName) {
        this.groupName = groupName;
        this.creationTime = System.currentTimeMillis();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }
    
}

