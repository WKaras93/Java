public class ComplexNumber{
    private float real;
    private float image;
    
    public ComplexNumber(float re, float img){
        this.real = re;
        this.image = img;
    }

    public float getImage(){
        return this.image;
    }

    public float getReal(){
        return this.real;
    }

    public void print(){
        System.out.printf("Real part: %f and imaginary part: %f", this.real, this.image);
    }

    public ComplexNumber addition(ComplexNumber N) {
        float img = this.image + N.getImage();
        float re = this.real + N.getReal();
        return new ComplexNumber(re, img);
    }

    public ComplexNumber subtraction(ComplexNumber N){
        float img = this.image - N.getImage();
        float re = this.real - N.getReal();
        return new ComplexNumber(re, img);
    }

    public ComplexNumber multiply(ComplexNumber N){
        float re = this.real * N.getReal() - this.image * N.getImage();
        float img = this.real * N.getImage() - this.image * N.getReal();
        return new ComplexNumber(re, img);
    }

    public ComplexNumber division(ComplexNumber N){
        if(N.getImage() == 0 && N.getReal() == 0){
            System.out.println("Math error: dividing by 0!");
            return new ComplexNumber(0, 0);
        }
        else{
            float re = (this.real * N.getReal() + this.image * N.getImage()) / (N.getReal() * N.getReal() + N.getImage() * N.getImage());
            float img = (this.image * N.getReal() - this.real * N.getImage()) / (N.getReal() * N.getReal() + N.getImage() * N.getImage());
            return new ComplexNumber(re, img);
        }
    }
}