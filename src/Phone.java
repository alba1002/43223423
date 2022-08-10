public class Phone extends Gadget{
        private String CPU;

    public String getCPU() {
        return CPU;
    }

    @Override
    public void print() {
        System.out.println("Модель:" + getModel() + "Размер" + getSize() + "ТипГаджета" + getTypeGadget() + "Процессор" + getCPU());
    }

    public Phone(String model, String typeGadget, String size, String CPU) {
        super(model, typeGadget, size);
        this.CPU = CPU;


    }
}