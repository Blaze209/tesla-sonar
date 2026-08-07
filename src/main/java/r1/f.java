package r1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"", "position", "popupLength", "windowLength", "", "closeAffinity", "b", "(IIIZ)I", "h", "(IIIZ)Z", "g", "e", "(IIZ)I", DateTokenConverter.CONVERTER_KEY, "f", "a", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    private static final int a(int i11, int i12, boolean z11) {
        return f(i11, i12, !z11);
    }

    public static final int b(int i11, int i12, int i13, boolean z11) {
        if (i12 >= i13) {
            return f(i12, i13, z11);
        }
        if (g(i11, i12, i13, z11)) {
            return e(i11, i12, z11);
        }
        return h(i11, i12, i13, z11) ? d(i11, i12, z11) : a(i12, i13, z11);
    }

    public static /* synthetic */ int c(int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            z11 = true;
        }
        return b(i11, i12, i13, z11);
    }

    private static final int d(int i11, int i12, boolean z11) {
        return e(i11, i12, !z11);
    }

    private static final int e(int i11, int i12, boolean z11) {
        return z11 ? i11 : i11 - i12;
    }

    private static final int f(int i11, int i12, boolean z11) {
        if (z11) {
            return 0;
        }
        return i12 - i11;
    }

    private static final boolean g(int i11, int i12, int i13, boolean z11) {
        return h(i11, i12, i13, !z11);
    }

    private static final boolean h(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            return i12 <= i11;
        }
        return i13 - i12 > i11;
    }
}
