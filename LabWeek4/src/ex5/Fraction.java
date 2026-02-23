/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author jeng
 */
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return topN + "/" + btmN;
    }
    public String toFloat() {
        double ans = (double) topN / btmN;
        return String.valueOf(ans);
    }
    public void addFraction(Fraction F) {
        if (btmN == F.btmN) {
            topN = topN + topN;
        } else {
            topN = topN * F.btmN + F.topN * btmN;
            btmN *= F.btmN;
        }
    }
    public boolean myEquals(Fraction x) {
        double ans = (double) topN / btmN;
        String check = String.valueOf(ans);
        return check.equals(x.toFloat());
    }
    public void LowestTermFrac() {
        int ans = 0;
        for (int i = 1; i <= topN && i <= btmN; i++) {
            if (topN % i == 0 && btmN % i == 0) {
                ans = i;
            }
        }
        topN = topN / ans;
        btmN = btmN / ans;
    }
}
