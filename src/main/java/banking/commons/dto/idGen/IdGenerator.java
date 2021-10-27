package banking.commons.dto.idGen;

import java.util.Random;

public class IdGenerator {

    public static String idGen(String stringId) {

        Random randomNumber = new Random();
        long nextLong = randomNumber.nextLong();
        if (nextLong < 0) {
            nextLong = -nextLong;
        }

        return stringId + "-" + nextLong;
    }
}
