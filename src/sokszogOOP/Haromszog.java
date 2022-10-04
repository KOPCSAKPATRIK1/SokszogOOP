package sokszogOOP;

public class Haromszog  extends Sokszog
{
    private double b;
    private double c;


    public Haromszog()
    {
        super(getVeletlen());
        this.b = getVeletlen();
        this.c = getVeletlen();
        while (!isSzerkesztheto())
        {
          super.setA((getVeletlen()));
          this.b = getVeletlen();
          this.c = getVeletlen();
        }
    }

    private static double getVeletlen() {
        return Math.random() * 10 + 5;
    }

    public Haromszog(double a, double b, double c)
    {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto())
        {
            throw  new IllegalArgumentException("A háromszög nem jó");
        }
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
        if (!this.isSzerkesztheto())
        {
            throw  new IllegalArgumentException("A háromszög nem jó");
        }
    }

    public double getC()
    {
        return c;
    }

    public void setC(double c)
    {
        this.c = c;
        if (!this.isSzerkesztheto())
        {
            throw  new IllegalArgumentException("A háromszög nem jó");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkesztheto())
        {
            throw  new IllegalArgumentException("A háromszög nem jó");
        }
    }

    private  boolean isSzerkesztheto()
    {
        if ((this.getA() + this.getB()) <= this.getC() ||
                (this.getA() + this.getC()) <= this.getB() ||
                (this.getC() + this.getB()) <= this.getA())
        {
            return false;
        }
        return true;
    }

    public double getKerulet()
    {
        return this.getA() + this.getB() + this.getC();
    }

    private double getS()
    {
        return getKerulet() / 2;
    }

    public double getTerulet()
    {
        return Math.sqrt(this.getS() *
                (this.getS() - this.getA()) *
                (this.getS() - this.getB()) *
                (this.getS() - this.getC()));
    }

    @Override
    public String toString() {
        // TODO: toString elkeszitese
        return String.format("Háromszög: a = %f | b = %f | c = %f | K = %f | T = %f",
                this.getA(), this.getB(), getC(), this.getKerulet(), this.getTerulet());
    }
}
