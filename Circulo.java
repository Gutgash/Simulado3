public class Circulo extends FormaGeometrica {
    private float raio;
    public Circulo(float raio) {
        this.raio = raio;
    }
    @Override
    public float calcularArea() {
        return (float)(Math.PI * Math.pow(raio, 2));
    }
    public float calcularArea(float raio) {
        this.raio = raio;
        return (float)(Math.PI * Math.pow(this.raio, 2));
    }
}