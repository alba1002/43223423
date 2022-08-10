public class SmartWatch extends Gadget{
    private String time;

    @Override
    public void print() {
        System.out.println("Модель:" + getModel() + "Размер" + getSize() + "ТипГаджета" + getTypeGadget() + "Время:" + getTime());
    }

    public String getTime() {
        return time;

    }

    public SmartWatch(String model, String typeGadget, String size, String time) {
        super(model, typeGadget, size);
        this.time = time;

    }
}
