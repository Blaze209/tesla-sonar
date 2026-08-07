package okhttp3.logging;

import bo0.n;
import java.io.EOFException;
import okio.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/h;", "", "isProbablyUtf8", "(Lokio/h;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(h isProbablyUtf8) {
        s.k(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            h hVar = new h();
            isProbablyUtf8.t(hVar, 0L, n.k(isProbablyUtf8.getSize(), 64L));
            for (int i11 = 0; i11 < 16 && !hVar.T2(); i11++) {
                int iN0 = hVar.n0();
                if (Character.isISOControl(iN0) && !Character.isWhitespace(iN0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
