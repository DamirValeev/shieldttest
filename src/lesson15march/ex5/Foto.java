package lesson15march.ex5;

import static java.lang.System.out;

public class Foto {
    String model;
    int zoom;
    String material;

    Foto(String model, int zoom, String material) {
        this.model = model;
        this.zoom = zoom;
        this.material = material;
    }

    double price() {
        if (material.equalsIgnoreCase("пластиковый")) {
            return (zoom + 2) * 10;
        } else if (material.equalsIgnoreCase("металл")) {
            return (zoom + 2) * 15;
        } else return 0;
    }

    boolean hightPrice() {
        if (price() > 200) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        out.println("Zoom - " + zoom + " Цена - " + price() + " Он дорогой? - " + hightPrice());
        return "Zoom - " + zoom + " Цена - " + price() + " Он дорогой? - " + hightPrice();
    }
}

class DigitalFoto extends Foto {
    int megapixel;

    DigitalFoto(String model, int zoom, String material, int megapixel) {
        super(model, zoom, material);
        this.megapixel = megapixel;
    }

    @Override
    double price() {
        return (super.price()*megapixel);
    }

    int upgradeModel() {
        megapixel += 2;
        return megapixel;
    }

}
