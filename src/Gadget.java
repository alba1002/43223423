public class Gadget implements Printable {
    private String model;
    private String typeGadget;
    private String size;

    public String getModel() {
        return model;
    }

    public String getTypeGadget() {
        return typeGadget;
    }

    public String getSize() {
        return size;
    }

    public Gadget(String model, String typeGadget, String size) {
        this.model = model;
        this.typeGadget = typeGadget;
        this.size = size;

    }

    @Override
    public void print() {
    }
}
