package templates;

public class Test {
    public static void main(String[] args) {
        // Test Maroc
        Template template1 = new MoroccoTemplateImpl();
        System.out.println(template1.perform(3, 4));

        // Test Espagne
        Template template2 = new SpainTemplateImpl();
        System.out.println(template2.perform(2, 5));
    }
}