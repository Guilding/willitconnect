package willitconnect.controller.service.util;

/**
 * Matches the word host in a string, attended to be used against the keys in
 * VCAP_SERVICES
 */
public class HostMatcher {

    public static boolean isHost(String toBeChecked) {
        return toBeChecked.toLowerCase().contains("host");
    }

    public static boolean hasPort(String toBeChecked) {
        return false;
    }
}
