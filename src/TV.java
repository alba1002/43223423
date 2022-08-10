public class TV extends Gadget{
    private String channels;

    public String getChannels() {
        return channels;
    }

    @Override
    public void print() {
        System.out.println("������:" + getModel() + "������" + getSize() + "����������" + getTypeGadget() + "������" + getChannels());
    }

    public TV(String model, String typeGadget, String size, String channels) {
        super(model, typeGadget, size);
        this.channels = channels;

    }
}
