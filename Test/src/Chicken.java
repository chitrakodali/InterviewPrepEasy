
/*import java.util.concurrent.Callable;

interface Bird {
    Egg lay();
}

class Chicken implements Bird{
    public Chicken() {
    }

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
        System.out.println(chicken instanceof Bird);
        //Egg egg1 = chicken.lay();

    }

    public Egg lay(){


    }
}

class Egg {
    private int numOfHatches =0;
   Callable<Bird> createBird;
    public Egg(Callable<Bird> createBird) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");

        this.createBird = createBird;


    }

    public Bird hatch() throws Exception {
        if (numOfHatches <= 0)
        {
            ++numOfHatches;
            return new Chicken();
        }else
        {
            throw new IllegalStateException("An Egg can't hatch twice.");
        }
    }
        //throw new UnsupportedOperationException("Waiting to be implemented.");


    }
*/