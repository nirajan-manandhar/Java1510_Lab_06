package ca.bcit.comp1510.lab6;
/**
 * Name Driver.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class NameDriver {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        String first = "first";
        String middle = "middle";
        String last = "last";

        Name name = new Name(first, middle, last);

        String fullname = name.getFirst() + name.getMiddle() + name.getLast();
        System.out.println(fullname);
        System.out.println(name.getFullName());
        System.out.println(name.initials());
        System.out.println(name.getCharacter(23));
    }

}
