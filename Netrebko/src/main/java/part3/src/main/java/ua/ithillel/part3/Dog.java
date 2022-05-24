package ua.ithillel.part3;

public class Dog extends Animal{
   private String securityGuard;

    public Dog(String food, String location, String securityGuard) {
        super(food, location);
        this.securityGuard = securityGuard;
    }

    public String getSecurityGuard() {
        return securityGuard;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
