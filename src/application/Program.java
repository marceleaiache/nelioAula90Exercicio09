package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntPerson;

        System.out.println("Quantas pessoas você vai digitar?");
        qntPerson = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[qntPerson];
        int n = 0;

        for (int i=0; i< vect.length; i++) {
            n++;
            System.out.printf("Dados da %da pessoa: %n", (n));
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();

            vect[i] = new Person(name, age);
        }

        int indexOlderPerson = 0;

        for (int i=1; i< vect.length; i++) {
            if (vect[i].getAge() > vect[indexOlderPerson].getAge()) {
                indexOlderPerson = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + vect[indexOlderPerson].getName());

        sc.close();
    }
}
