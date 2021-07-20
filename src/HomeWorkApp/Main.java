package HomeWorkApp;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        arrayUniqueSum(); // 1 task
        System.out.println("==========");

        TelBook telBook = new TelBook(); // 2 task
        telBook.add("Fedin", "785567789");
        telBook.add("Fedin", "23456789");
        telBook.add("Fedin", "873387709");
        telBook.add("Frolov", "86678564");
        telBook.add("Pupkin", "764370097");
        System.out.println(telBook);
        System.out.println("==========");
        telBook.get("Fedin");

    }
    static void arrayUniqueSum() {
        String[] words = new String[15];
        words[0] = "java";
        words[1] = "junior";
        words[2] = "middle";
        words[3] = "senior";
        words[4] = "mentor";
        words[5] = "education";
        words[6] = "help";
        words[7] = "java";
        words[8] = "middle";
        words[9] = "java";
        words[10] = "java";
        words[11] = "middle";
        words[12] = "java";
        words[13] = "mentor";
        words[14] = "java";

        String[] mon = new String[15];

        Set<String> set = new HashSet<>(Arrays.asList(words));
        set.toArray(mon);
        for (int i = 0; i < mon.length; i++) {
            if (mon[i] != null)
            System.out.println(mon[i]);
        }
        /**ArrayList<String> wordsSum = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < wordsSum.size(); i++) {
            String st = null;
            if (st.contains(wordsSum.get(i)))
        }**/
            }
        }
