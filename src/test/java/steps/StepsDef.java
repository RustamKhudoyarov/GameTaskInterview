package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Warrior;
import org.junit.Assert;

public class StepsDef {
    private final Warrior warrior = new Warrior("Test",100,10);

    @Given(": The warrior has {int} health")
    public void the_warrior_have_health(Integer health) {

        warrior.heal(health);
        Assert.assertTrue(warrior.heal(health) > 0);
    }

    @When(": the warrior got {int} points damage")
    public void the_warrior_got_points_damage(Integer damage) {
        int remainHealth = warrior.takeDamage(damage);
        Assert.assertTrue( remainHealth > 0);

    }

    @Then(": health warrior was decrease on {int} points health")
    public void health_warrior_was_decrease_on_points_health(Integer damage) {
        warrior.takeDamage(damage);
        Assert.assertTrue( warrior.takeDamage(damage) < 100);
    }
}