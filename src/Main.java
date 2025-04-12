//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog * 4;
        cat = cat * 4;
        paper = paper * 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog -3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend *2;
        System.out.println(friend);

        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog *10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalMass = boxer1 + boxer2;
        System.out.println(totalMass);

        var massDifference = totalMass % boxer1;
        System.out.println(massDifference);

        var totalHours = 640;
        totalHours = totalHours / 8;
        System.out.println("Всего работников в компании " + totalHours + " человек.");

        var totalEmployees = totalHours + 94;
        var totalHours1 = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours1
                + " часа можно поделить между сотрудниками.");
    }
}