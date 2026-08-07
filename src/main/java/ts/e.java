package ts;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f114986a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f114987b = {"", "A", "B", "C"};

    public static String a(int i11, int i12, int i13) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static List<byte[]> b(boolean z11) {
        return Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        StringBuilder sb2 = new StringBuilder(p0.B("hvc1.%s%d.%X.%c%d", f114987b[i11], Integer.valueOf(i12), Integer.valueOf(i13), Character.valueOf(z11 ? 'H' : 'L'), Integer.valueOf(i14)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = f114986a;
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, bArr2.length, i12);
        return bArr3;
    }

    public static Pair<Integer, Integer> e(byte[] bArr) {
        d0 d0Var = new d0(bArr);
        d0Var.U(9);
        int iH = d0Var.H();
        d0Var.U(20);
        return Pair.create(Integer.valueOf(d0Var.L()), Integer.valueOf(iH));
    }

    public static boolean f(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}
