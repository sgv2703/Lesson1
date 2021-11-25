package lesson1;

import lesson1.Animals.Dog;
import lesson1.Animals.Cat;
import lesson1.obstacles.*;

public class Application {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        });
        Team team = new Team("Дружба",
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Dog ("Дин", 4, 7, 50));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}