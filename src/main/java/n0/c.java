package n0;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LargeJpegImageQuirk f92625a = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.a.b(LargeJpegImageQuirk.class);

    public static int a(@NonNull byte[] bArr) {
        byte b11;
        int i11 = 2;
        while (i11 + 4 <= bArr.length && (b11 = bArr[i11]) == -1) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i12] & 255) << 8) | (bArr[i11 + 3] & 255);
            if (b11 == -1 && bArr[i11 + 1] == -38) {
                while (true) {
                    int i14 = i12 + 2;
                    if (i14 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i12] == -1 && bArr[i12 + 1] == -39) {
                        return i14;
                    }
                    i12++;
                }
            } else {
                i11 += i13 + 2;
            }
        }
        return -1;
    }

    public int b(@NonNull byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f92625a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.k(bArr)) {
            return bArr.length;
        }
        int iA = a(bArr);
        return iA != -1 ? iA : bArr.length;
    }
}
