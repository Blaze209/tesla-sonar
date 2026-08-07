package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3405a = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    private boolean g(@NonNull byte[] bArr) {
        byte b11;
        int i11 = 2;
        while (i11 + 4 <= bArr.length && (b11 = bArr[i11]) == -1) {
            if (b11 == -1 && bArr[i11 + 1] == -38) {
                return true;
            }
            i11 += (((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255)) + 2;
        }
        return false;
    }

    private int h(@NonNull byte[] bArr) {
        int i11 = 2;
        while (true) {
            int i12 = i11 + 1;
            if (i12 > bArr.length) {
                return -1;
            }
            if (bArr[i11] == -1 && bArr[i12] == -40) {
                return i11;
            }
            i11 = i12;
        }
    }

    private static boolean i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f3405a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean k() {
        return i();
    }

    @NonNull
    public byte[] j(@NonNull n nVar) {
        int iH = 0;
        ByteBuffer byteBufferL = nVar.N0()[0].l();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.rewind();
        byteBufferL.get(bArr);
        return (g(bArr) || (iH = h(bArr)) != -1) ? Arrays.copyOfRange(bArr, iH, byteBufferL.limit()) : bArr;
    }
}
