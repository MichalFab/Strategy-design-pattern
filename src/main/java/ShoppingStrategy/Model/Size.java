package ShoppingStrategy.Model;

public enum Size {

    S(1),
    L(2),
    XL(3);

    private int size;

    Size(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        switch(size) {
            case 1:
                return "S";
            case 2:
                return "L";
            case 3:
                return "XL";
            default:
                return "CUSTOM";
        }
    }
}
