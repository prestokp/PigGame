package piggame;

public class Die
{
    private final int MAX;  // maximum face value

    private int faceValue;  // current value showing on the die

    //-----------------------------------------------------------------
    //  Constructor: Gets the maximum value of the die and sets the initial face value.
    //-----------------------------------------------------------------
    public Die(int max) {
        MAX = max;
        faceValue = 1;
    }

    //-----------------------------------------------------------------
    //  Constructor: Create a six-sided Die
    //-----------------------------------------------------------------
    public Die() {
        this(6);
    }

    //-----------------------------------------------------------------
    //  Rolls the die and returns the result.
    //-----------------------------------------------------------------
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    //-----------------------------------------------------------------
    //  Face value mutator.
    //-----------------------------------------------------------------
    public void setFaceValue(int value) {

        if (value < 1 || value > MAX)
            throw new IllegalArgumentException();

        faceValue = value;
    }

    //-----------------------------------------------------------------
    //  Face value accessor.
    //-----------------------------------------------------------------
    public int getFaceValue()
    {
        return faceValue;
    }

    //-----------------------------------------------------------------
    //  Returns a string representation of this die.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = Integer.toString(faceValue);

        return result;
    }
}
