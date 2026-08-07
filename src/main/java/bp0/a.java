package bp0;

import ch.qos.logback.core.joran.action.ActionConst;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static String a(byte b11) {
        int i11 = b11 & 255;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11 < 16 ? WebrtcBuildVersion.maint_version : "");
        sb2.append(Integer.toHexString(i11));
        return sb2.toString().toUpperCase();
    }

    public static String b(byte[] bArr) {
        return c(bArr, 1000);
    }

    public static String c(byte[] bArr, int i11) {
        return bArr == null ? ActionConst.NULL : d(bArr, 0, bArr.length, i11);
    }

    public static String d(byte[] bArr, int i11, int i12, int i13) {
        if (bArr == null) {
            return ActionConst.NULL;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 != 0 && i14 % i13 == 0) {
                sb2.append("\n");
            }
            sb2.append(a(bArr[i11 + i14]));
        }
        return sb2.toString();
    }
}
