public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.isUUID("f24015f0-d52a-4fe3-ac82-4a154c4e47d3") );
    }
    public boolean isUUID(String s){
        return s.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
    }
}
