package penguins;

public class Calculator {
    float calculatePercentage(float amount, float percentage) {
        if (percentage > 0)
            return (amount * (percentage / 100.0f)) + amount;
        return amount - (amount * ((percentage * -1) / 100.0f));
    }
}
