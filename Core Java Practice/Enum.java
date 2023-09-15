public class Enum {
    enum Status {
        RUNNING, FAILED, PENDING, SUCCESS;
    }

    public static void main(String[] args) {
        Status s = Status.RUNNING;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status s1[] = Status.values();

        for (Status status : s1) {
            System.out.println(status + " : " + status.ordinal());
        }
    }
}

// enum is a special class the represents a group of CONSTANTS.
// All enums should in upppercase.
// Use enums when you have values that you know aren't going to change, like
// month days, days, colors, deck of cards, etc.