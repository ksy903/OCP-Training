package generics.interfaces;

public interface ShippableMore <T, U>{
    public void setContent (T t);
    
    public void setTitle(U u);
    
    public void combineContentAndTitle(T t, U u);
}
