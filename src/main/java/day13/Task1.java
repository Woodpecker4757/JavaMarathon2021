package day13;

public class Task1 {
    public static void main(String[] args){

        User user1 = new User("Alberto");
        User user2 = new User("Sebastyan");
        user2.sendMessage(user1,"Oh,hello there!");
        user1.sendMessage(user2,"How are you?");
        user2.sendMessage(user1,"Cool!");
        user1.sendMessage(user2,"Does it work?");
        user2.sendMessage(user1,"Yes");
        MessageDatabase.showDialog(user1,user2);
    }
}
