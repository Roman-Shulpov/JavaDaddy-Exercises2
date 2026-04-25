package mentorship.roadmap.Java_Core.step4_OOP.topic14_Vehicles;

public class Transport {

    static abstract class transport {
        protected String model;

        public transport(String model) {
            this.model = model;
        }

        public abstract void move();

        public void printInfo() {
            System.out.println("Модель: " + model);
        }
    }

    static class Engine {
        private final int horsePower;
        private static int engineCount = 0;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            engineCount++;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public static int getEngineCount() {
            return engineCount;
        }
    }

    static class Car extends transport {
        private final Engine engine;

        public Car(String model, Engine engine) {
            super(model);
            this.engine = engine;
        }

        @Override
        public void move() {
            System.out.println("Автомобиль " + model +
                    " едет с мощностью " + engine.getHorsePower() + " л.с.");
        }
    }

    public static void main(String[] args) {
        Engine e1 = new Engine(150);
        Engine e2 = new Engine(200);

        Car c1 = new Car("BMW", e1);
        Car c2 = new Car("Ford", e2);

        c1.move();
        c2.move();

        System.out.println("Количество двигателей: " + Engine.getEngineCount());
    }
}
