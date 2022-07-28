
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros() + addition.euros();
        int newCents = this.cents() + addition.cents();
        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        return this.euros() < compared.euros() || (this.euros() == compared.euros() && this.cents() < compared.cents());
    }

    public Money minus(Money decreaser) {
        int newCents;
        int newEuros;
        if (this.cents() < decreaser.cents()) {
            newEuros = this.euros() - 1 - decreaser.euros();
            newCents = 100 + this.cents() - decreaser.cents();
        } else if (this.cents() > 0 && decreaser.cents() == 0) {
            newCents = this.cents();
            newEuros = this.euros() - decreaser.euros();
        } else if (this.cents == 0 && decreaser.cents() == 0) {
            newCents = 0;
            newEuros = this.euros() - decreaser.euros();
        } else {
            newCents = this.cents() - decreaser.cents();
            newEuros = this.euros() - decreaser.euros();
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }
}