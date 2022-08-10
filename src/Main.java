public class Main {
    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("treeObject")};
        for (Printable printable: print){
            printable.print();
        }
    }
            public static Printable createObject(String className) {

                switch (className){
                    case "oneObject":
                        Phone phone = new Phone("айфон","телефон","средний","Apple A15");

                        return phone;

                    case "twoObject":
                        TV tv = new TV("samsung","watch tv","big" , "146");
                        return tv;

                    case "treeObject":
                        Camera camera = new Camera("Sony" , "Camera" , "small" , "4K");
                        return camera;
                }
                return null;

            }
        }
