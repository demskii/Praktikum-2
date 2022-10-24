public class AccessModifier {

    private String nama = "";
    private String jenisKelamin = "";
    private int umur = ;

    private String getEntityInfo() {
        return nama + " is " + jenisKelamin + umur + " years old ";

    }

    public static void main(String[] args) {
        System.out.println(new AccessModifier().getEntityInfo());
    }
}
