package OOPs.Inheritance.Multiple;

interface Browser1 { void browser1();}
interface Browser2 { void browser2();}
interface Browser3 { void browser3();}

class Browsers implements Browser1, Browser2, Browser3 {

    @Override
    public void browser1() {
        System.out.println("Chrome Browser");
    }

    @Override
    public void browser2() {
        System.out.println("Firefox Browser");
    }

    @Override
    public void browser3() {
        System.out.println("Safari Browser");
    }
}

class MultipleInheritance extends Browsers {
    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.browser1();
        mi.browser2();
        mi.browser3();
    }
}
