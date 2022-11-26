package Day6Logical;

public class CouponNumber {
    /**
     *@param ->To generate coupon Numbers
     */
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int maximum = 100000000;
        int random = (int) (Math.random() * maximum);
        StringBuilder stringBuilder = new StringBuilder();

        while (random > 0) {
            stringBuilder.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode = stringBuilder.toString();
        System.out.println("Generating Coupon Code- " + couponCode);
    }
    }

