package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Room;

public class HelloAction  extends ActionSupport {
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String execute() throws Exception {
        room = new Room("001");
        return SUCCESS;
    }
}
