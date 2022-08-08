package fi.cards;

import java.util.Objects;

public class CardValidatorImpl implements CardValidator{

    String name;
    String test;
    long cardNo;
    float amount;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public CardValidatorImpl() {
        someMethod();
    }

    private static void someMethod() {
        String hello_world = "hello World";
        System.out.println(hello_world);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean validateCard(long cardNo) throws RemoteException {
        return false;
    }

    @Override
    public long transact(float amount) throws RemoteException {
        return 0;
    }
}
