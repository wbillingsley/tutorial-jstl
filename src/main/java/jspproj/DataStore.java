package jspproj;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class DataStore {

    private static final DataStore INSTANCE = new DataStore();

    Map<String, String> messages = new ConcurrentHashMap<String, String>();

    public static DataStore getInstance() {
        return INSTANCE;
    }

    public void putMessage(String room, String message) {
        messages.put(room, message);
    }

    public String getMessage(String room) {
        if (room != null && messages.containsKey(room)) {
            return messages.get(room);
        } else {
            return null;
        }
    }

    public String[] getRooms() {
        String[] results = messages.keySet().toArray(new String[0]);
        Arrays.sort(results);
        return results;
    }

}
