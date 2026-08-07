package hr;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n {
    @Pure
    public static void a(boolean z11, String str) throws ParserException {
        if (!z11) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(l lVar, byte[] bArr, int i11, int i12, boolean z11) throws EOFException {
        try {
            return lVar.f(bArr, i11, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    public static int c(l lVar, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iD = lVar.d(bArr, i11 + i13, i12 - i13);
            if (iD == -1) {
                break;
            }
            i13 += iD;
        }
        return i13;
    }

    public static boolean d(l lVar, byte[] bArr, int i11, int i12) {
        try {
            lVar.readFully(bArr, i11, i12);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(l lVar, int i11) {
        try {
            lVar.k(i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
