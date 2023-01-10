package _17_Variable_Scope_Static_Super.Static_Keyword;

public class Main {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
