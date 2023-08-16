// package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    // Getters & Setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank1{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Showrav Kormokar";
        account1.email = "skshowrav07@gmail.com";
        // account1.password = "8989@sk@9090"; // Not accessable because this property has been private. But dou you want to accsess this property you need to [getters & setters]

        account1.setPassword("89@sk@90");
        System.out.println(account1.getPassword());
    }
}