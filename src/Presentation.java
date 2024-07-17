public class Presentation {
    private String name;
    private static final String url = "https://sniplink.xyz/SKVXpI";
    private static final String text = "это был меленький Рик Ролл";

    public Presentation(String name) {
        this.name = name;

    }
    public Presentation() {
        this.name = "Таинственная личность";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public static String getUrl() {
        return url;
    }
}
