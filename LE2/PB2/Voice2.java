class Voice2 {
    public void templateMethod() {
        prepareVoice();
        hear();
    }

    private void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    private void hear() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}
