package w8;

import androidx.media3.common.ParserException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    @Pure
    public static void a(boolean z11, String str) throws ParserException {
        if (!z11) {
            throw ParserException.a(str, null);
        }
    }

    public static int b(int i11) {
        if (i11 == 20) {
            return 63750;
        }
        if (i11 == 30) {
            return 2250000;
        }
        switch (i11) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i11) {
                    case 14:
                        return 3062500;
                    case 15:
                        return ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(q qVar, byte[] bArr, int i11, int i12, boolean z11) throws EOFException {
        try {
            return qVar.f(bArr, i11, i12, z11);
        } catch (EOFException e11) {
            if (z11) {
                return false;
            }
            throw e11;
        }
    }

    public static int d(q qVar, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iD = qVar.d(bArr, i11 + i13, i12 - i13);
            if (iD == -1) {
                break;
            }
            i13 += iD;
        }
        return i13;
    }

    public static boolean e(q qVar, byte[] bArr, int i11, int i12) {
        try {
            qVar.readFully(bArr, i11, i12);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(q qVar, int i11) {
        try {
            qVar.k(i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
