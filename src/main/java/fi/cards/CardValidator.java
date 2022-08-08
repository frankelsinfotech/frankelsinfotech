package fi.cards;

@Remote
public interface CardValidator
{
    public boolean validateCard(long cardNo) throws RemoteException;
    public long transact(float amount) throws RemoteException;
}
