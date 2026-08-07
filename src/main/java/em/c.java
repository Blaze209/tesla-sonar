package em;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static boolean a(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean b(char c11) {
        if (c11 < 'a' || c11 > 'z') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    public static boolean c(char c11) {
        return b(c11) || a(c11);
    }

    public static boolean d(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        int i15;
        if (i12 >= charSequence.length() || (i15 = (i12 - i11) + 1) < i13 || i15 > i14) {
            return false;
        }
        while (i11 <= i12) {
            if (!c(charSequence.charAt(i11))) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public static boolean e(CharSequence charSequence, int i11, int i12) {
        return d(charSequence, i11, i12, 3, 8);
    }
}
