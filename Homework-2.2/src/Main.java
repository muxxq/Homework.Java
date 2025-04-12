public class Main {
    public static void main(String[] args) {
        WebHelper helper = WebHelper.getInstance();

        System.out.println("Continutul paginii web:");
        System.out.println(helper.getWebSiteContent());
    }
}
