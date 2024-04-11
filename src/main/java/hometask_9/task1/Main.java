package hometask_9.task1;

import org.apache.log4j.Logger;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_9.task1.Main.class);

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        User user1 = new User("Ivan");
        User user2 = new User("Alex");
        User user3 = new User("Anton");
        User user4 = new User("Igor");

        CreditAccount creditAccount1 = new CreditAccount(342, 20000);
        CreditAccount creditAccount2 = new CreditAccount(134, 25000);
        CreditAccount creditAccount3 = new CreditAccount(23, 40000);
        CreditAccount creditAccount4 = new CreditAccount(29, 29000);

        DebitAccount debitAccount1 = new DebitAccount("12fh", 19900);
        DebitAccount debitAccount2 = new DebitAccount("08uj", 11200);
        DebitAccount debitAccount3 = new DebitAccount("7pl", 15500);
        DebitAccount debitAccount4 = new DebitAccount("18ih", 32000);

        List<User> usersList = new LinkedList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);

        List<Account> accountsList = new LinkedList<>();

        accountsList.add(creditAccount1);
        accountsList.add(creditAccount2);
        accountsList.add(creditAccount3);
        accountsList.add(creditAccount4);

        accountsList.add(debitAccount1);
        accountsList.add(debitAccount2);
        accountsList.add(debitAccount3);
        accountsList.add(debitAccount4);

        UserService <Account, User> userService = new UserService <Account, User>() {
            @Override
            public List<User> getAllUsersSortedByName() {
                usersList.sort(Comparator.comparing(User::getName));
                logger.info("All users sorted by name: " + usersList);
                return usersList;
            }

            @Override
            public List<Account> getAllAccounts() {
                logger.info("All accounts: " + accountsList);
                return accountsList;
            }

            @Override
            public double getTaxAmount(User user) {
                double totalTaxAmount = 0;
                for (Account account : accountsList) {
                    double accountTaxAmount = account.getSum() * 0.05;
                    totalTaxAmount += accountTaxAmount;
                    logger.info(" for account " + account.getId() + ": tax amount = " + accountTaxAmount);
                }
                return totalTaxAmount;
            }
        };

        userService.getAllUsersSortedByName();
        userService.getAllAccounts();
        userService.getTaxAmount(user1);
    }
}
