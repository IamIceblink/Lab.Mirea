package ru.mirea.lab1.Homework2.Homework2_1;
import ru.mirea.lab1.Homework2.Homework2_1.Author;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        Author aut = new Author ("Vsevolod", "ryabov@list.ru", 'm');
        System.out.println("Name: "+ aut.getName() );
        System.out.println("Gender: "+ aut.getGender() );
        System.out.println("Email: "+ aut.getEmail() );
        System.out.print("Введите email:");
        String email = input.nextLine();
        aut.setEmail(email);
        System.out.println(aut.toString());



    }
}
