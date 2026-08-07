package ni;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", DateTokenConverter.CONVERTER_KEY, "(J)I", "", "a", "(D)I", "c", "(J)D", "b", "(D)J", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class c {
    public static final int a(double d11) {
        int i11 = (int) d11;
        if (i11 == d11) {
            return i11;
        }
        throw new IllegalStateException((d11 + " cannot be converted to Int").toString());
    }

    public static final long b(double d11) {
        long j11 = (long) d11;
        if (j11 == d11) {
            return j11;
        }
        throw new IllegalStateException((d11 + " cannot be converted to Long").toString());
    }

    public static final double c(long j11) {
        double d11 = j11;
        if (((long) d11) == j11) {
            return d11;
        }
        throw new IllegalStateException((j11 + " cannot be converted to Double").toString());
    }

    public static final int d(long j11) {
        int i11 = (int) j11;
        if (i11 == j11) {
            return i11;
        }
        throw new IllegalStateException((j11 + " cannot be converted to Int").toString());
    }
}
