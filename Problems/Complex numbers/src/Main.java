class Complex {

    double real;
    double image;

    public Complex add(Complex num) {
        this.real += num.real;
        this.image += num.image;
        return this;
    }

    public Complex subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
        return this;
    }
}