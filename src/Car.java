public class Car {
    private String brand;
    private int doorQuan;
    private int wheelsQuan;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.doorQuan = builder.doors;
        this.wheelsQuan = builder.wheels;
    }

    @Override
    public String toString() {
        return "Freeze{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheelsQuan +
                ", doors=" + doorQuan +
                '}';
    }

    public static class Builder{
        private String brand;
        private int doors;
        private int wheels;

        public Builder(String brand) {
            this.brand = brand;
        }

        public Builder setHeight(int height) {
            this.doors = height;
            return this;
        }

        public Builder setWidth(int width) {
            this.wheels = width;
            return this;
        }
        public Car Build(){
            return new Car(this);
        }
    }
}
