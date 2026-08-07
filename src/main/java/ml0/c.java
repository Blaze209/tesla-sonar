package ml0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.f0;
import org.bouncycastle.crypto.hpke.HPKE;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f\u0088\u0001\b\u0092\u0001\u00020\u0007ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lml0/c;", "", "Ljn0/f0;", "characters", "bytes", DateTokenConverter.CONVERTER_KEY, "(SS)I", "", "value", "c", "(I)I", "a", "(I)S", "b", "f", "e", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class c {
    public static final short a(int i11) {
        return f(i11);
    }

    public static final short b(int i11) {
        return e(i11);
    }

    public static int d(short s11, short s12) {
        return c(((s11 & HPKE.aead_EXPORT_ONLY) << 16) | (s12 & HPKE.aead_EXPORT_ONLY));
    }

    public static final short e(int i11) {
        return f0.b((short) (i11 & 65535));
    }

    public static final short f(int i11) {
        return f0.b((short) (i11 >>> 16));
    }

    public static int c(int i11) {
        return i11;
    }
}
