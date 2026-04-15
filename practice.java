class Students {
    String name;
}

public class practice {

    public void printWishlist() {
        String[] list = {"Golden Hat", "Iron Boots"};
        for (String idea : list) {
            System.out.println(idea);
        }
    }

    public static void main(String[] args) {
        Students c1 = new Students();
        c1.name = "Pinky";
        System.out.println("name is: " + c1.name);

        String name1 = "sami", name2 = "SamI";

        boolean same1 = name1.equals(name2);
        boolean same2 = name1.equalsIgnoreCase(name2);

        System.out.println(same1);   // false
        System.out.println(same2);   // true

        String message = name1.concat(name2);
        System.out.println(message); // samiSamI

        int strlength = name1.length(); // 4

        String greet = " Hello ".trim(); // "Hello"
        String c = "GrEet".toLowerCase(); // "greet"

        int ind = "hello".indexOf("o"); // 4

        int x = 2, y = 5, z = 0;
        z = (y < x) ? x : y;
        System.out.println(z); // 5
        practice p= new practice();
        p.printWishlist();
    }
}