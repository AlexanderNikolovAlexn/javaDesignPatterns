package designPatterns.creational.builder;

/**
 * Created by Alexander Nikolov on 27.1.2019 г..
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Computer computer = new Computer
                .ComputerBuilder("750 GB", "16 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);
    }

}
