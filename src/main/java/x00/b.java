package x00;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "int32", "", "c", "(I)J", "uInt32", "b", "(J)I", "uInt64", DateTokenConverter.CONVERTER_KEY, "(J)J", "a", "(I)I", "react-native-compressor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final int a(int i11) throws Exception {
        if (i11 >= 0) {
            return i11;
        }
        throw new Exception("uInt32 value is negative");
    }

    public static final int b(long j11) throws Exception {
        if (j11 > 2147483647L || j11 < 0) {
            throw new Exception("uInt32 value is too large or negative");
        }
        return (int) j11;
    }

    public static final long c(int i11) {
        return i11;
    }

    public static final long d(long j11) throws Exception {
        if (j11 >= 0) {
            return j11;
        }
        throw new Exception("uInt64 value is negative");
    }
}
