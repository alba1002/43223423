public class Camera extends Gadget{
    private String cameraquality;

    @Override
    public void print() {
        System.out.println("Модель:" + getModel() + "Размер" + getSize() + "ТипГаджета" + getTypeGadget() + "Качество Камеры:" +getCameraquality());
    }

    public String getCameraquality() {
        return cameraquality;

    }

    public Camera(String model, String typeGadget, String size, String cameraquality) {
        super(model, typeGadget, size);
        this.cameraquality = cameraquality;

    }
}
