class SegmentDeDreapta implements Shape {
    private String culoare;
    private double lungime;

    public SegmentDeDreapta(String culoare, double lungime) {
        this.culoare = culoare;
        this.lungime = lungime;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getPerimetru() {
        return lungime; // A segment doesn't enclose an area
    }
}