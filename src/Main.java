public class Main {
    public static void main(String[] args){
        Shark shark1 = new Shark();
        Shark shark2 = new Shark();
        Turtle turtle1 = new Turtle();
        Turtle turtle2 = new Turtle();
        Eagle eagle1 = new Eagle();
        Eagle eagle2 = new Eagle();
        Animal[] animals = {shark1, shark2, turtle1, turtle2, eagle1,eagle2};
        for (Animal animal : animals) {
            animal.eat();
            if (animal instanceof Shark) {
                ((Shark)animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle)animal).fly();
            }
        }
        Shark[] sharks = {shark1, shark2};
        Turtle[] turtles = {turtle1, turtle2};
        Eagle[] eagles = {eagle1, eagle2};
    }
}