public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("jh7",2,145);
        Car car= new Car("subaru","iu",engine);
odel, int volume, int power) {
            this.model = model;
            this.volume = volume;
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "model='" + model + '\'' +
                    ", volume=" + volume +
                    ", power=" + power +
                    '}';
        }
    }
   static class Car{
        String marka;
        String mod;
        Engine engine;

        @Override
        public String toString() {
            return "Car{" +
                    "marka='" + marka + '\'' +
                    ", mod='" + mod + '\'' +
                    ", engine=" + engine +
                    '}';
        }

        public Car(String marka, String mod, Engine engine) {
            this.marka = marka;
            this.mod = mod;
            this.engine = engine;
        }

    }

}
