public class BinOps {

    int a, b, r;

    public String sum(String a, String b) {
        this.a = Integer.parseInt(a, 2);
        this.b = Integer.parseInt(b, 2);
        r = this.a + this.b;
        return Integer.toBinaryString(r);
    }

    public String mult(String a, String b) {
        this.a = Integer.parseInt(a, 2);
        this.b = Integer.parseInt(b, 2);
        r = this.a * this.b;
        return Integer.toBinaryString(r);
    }
}
