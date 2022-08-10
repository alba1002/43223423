public class SmartWatch extends Gadget{
    private String time;

    @Override
    public void print() {
        System.out.println("������:" + getModel() + "������" + getSize() + "����������" + getTypeGadget() + "�����:" + getTime());
    }

    public String getTime() {
        return time;

    }

    public SmartWatch(String model, String typeGadget, String size, String time) {
        super(model, typeGadget, size);
        this.time = time;

    }
}
