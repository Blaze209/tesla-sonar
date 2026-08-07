package dp0;

import net.time4j.format.j;

/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static String a(j jVar, char c11, int i11) {
        if (!jVar.isDecimal()) {
            return jVar.toNumeral(i11);
        }
        int i12 = c11 - '0';
        String string = Integer.toString(i11);
        if (i12 == 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = string.length();
        for (int i13 = 0; i13 < length; i13++) {
            sb2.append((char) (string.charAt(i13) + i12));
        }
        return sb2.toString();
    }
}
