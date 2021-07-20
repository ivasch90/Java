package HomeWorkApp;

import java.util.*;

public class TelBook {
    private final Map<String, Set<String>> hm = new HashMap<>();



    public void add(String name, String tel) {
        Set<String> tels = hm.getOrDefault(name, new HashSet<>());
        tels.add(tel);
        hm.put(name, tels);
    }

    public Set<String> get(String name) {
        System.out.println(hm.get(name));
        return hm.getOrDefault(name, Collections.emptySet());
    }

    @Override
    public String toString() {
        return "TelBook{" +
                 hm +
                '}';
    }
}
