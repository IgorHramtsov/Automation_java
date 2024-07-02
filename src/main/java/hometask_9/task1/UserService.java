package hometask_9.task1;

import java.util.List;

public interface UserService <A extends Account, U extends User>{

    List<U> getAllUsersSortedByName();
    List<A> getAllAccounts();
    double getTaxAmount(U user);


}
