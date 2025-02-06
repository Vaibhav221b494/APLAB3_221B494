abstract class Bharatvanshi {
    String name;
    int fightingSkill;

    Bharatvanshi(String name, int fightingSkill) {
        this.name = name;
        this.fightingSkill = fightingSkill;
    }

    abstract void fight();
}

class Pandav extends Bharatvanshi {
    int obedience;
    int kindness;

    Pandav(String name, int fightingSkill, int obedience, int kindness) {
        super(name, fightingSkill);
        this.obedience = obedience;
        this.kindness = kindness;
    }

    @Override
    void fight() {
        System.out.println(name + " fights with skill level " + fightingSkill + ".");
    }

    void obey() {
        System.out.println(name + " is obedient with level " + obedience + ".");
    }

    void showKindness() {
        System.out.println(name + " is kind with level " + kindness + ".");
    }
}

class Kaurav extends Bharatvanshi {
    int cruelty;
    int disobedience;

    Kaurav(String name, int fightingSkill, int cruelty, int disobedience) {
        super(name, fightingSkill);
        this.cruelty = cruelty;
        this.disobedience = disobedience;
    }

    @Override
    void fight() {
        System.out.println(name + " fights with skill level " + fightingSkill + ".");
    }

    void showCruelty() {
        System.out.println(name + " is cruel with level " + cruelty + ".");
    }

    void disobey() {
        System.out.println(name + " disobeys with level " + disobedience + ".");
    }
}

class Arjun extends Pandav {
    Arjun() {
        super("Arjun", 10, 10, 10);
    }
}

class Bheem extends Pandav {
    Bheem() {
        super("Bheem", 10, 10, 7);
    }
}

class Duryodhan extends Kaurav {
    Duryodhan() {
        super("Duryodhan", 10, 10, 10);
    }
}

class Vikarn extends Kaurav {
    Vikarn() {
        super("Vikarn", 10, 0, 0);
    }

    @Override
    void fight() {
        System.out.println(name + " is a good fighter.");
    }

    void showKindness() {
        System.out.println(name + " is kind.");
    }

    void obey() {
        System.out.println(name + " is obedient.");
    }
}

public class Mahabharat {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.showKindness();

        bheem.fight();
        bheem.obey();
        bheem.showKindness();

        duryodhan.fight();
        duryodhan.showCruelty();
        duryodhan.disobey();

        vikarn.fight();
        vikarn.showKindness();
        vikarn.obey();
    }
}
