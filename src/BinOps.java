public class BinOps {
    public String sum(String a, String b) {
        int abin = Integer.parseInt(a, 2);
        int bbin = Integer.parseInt(b, 2);
        int res = abin + bbin;
        return Integer.toBinaryString(res);
    }

    public String mult(String a, String b) {
        int abin = Integer.parseInt(a, 2);
        int bbin = Integer.parseInt(b, 2);
        int res = abin * bbin;
        return Integer.toBinaryString(res);
    }
}
