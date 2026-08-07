package p014n4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "", "c", "(Ln4/f0;I)I", "", "isBold", "isItalic", "b", "(ZZ)I", "Ln4/f0$a;", "a", "(Ln4/f0$a;)Ln4/f0;", "AndroidBold", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final FontWeight a(FontWeight.Companion companion) {
        return companion.h();
    }

    public static final int b(boolean z11, boolean z12) {
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    public static final int c(FontWeight fontWeight, int i11) {
        return b(fontWeight.compareTo(a(FontWeight.INSTANCE)) >= 0, b0.f(i11, b0.INSTANCE.a()));
    }
}
