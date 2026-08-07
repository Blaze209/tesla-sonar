package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Li4/r0;", "start", "stop", "", "fraction", "c", "(Li4/r0;Li4/r0;F)Li4/r0;", "style", "Lw4/t;", "direction", DateTokenConverter.CONVERTER_KEY, "(Li4/r0;Lw4/t;)Li4/r0;", "layoutDirection", "Lt4/l;", "textDirection", "e", "(Lw4/t;I)I", "Li4/z;", "platformSpanStyle", "Li4/y;", "platformParagraphStyle", "Li4/b0;", "b", "(Li4/z;Li4/y;)Li4/b0;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75792a;

        static {
            int[] iArr = new int[w4.t.values().length];
            try {
                iArr[w4.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w4.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75792a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle b(z zVar, PlatformParagraphStyle platformParagraphStyle) {
        if (zVar == null && platformParagraphStyle == null) {
            return null;
        }
        return c.a(zVar, platformParagraphStyle);
    }

    public static final TextStyle c(TextStyle textStyle, TextStyle textStyle2, float f11) {
        return new TextStyle(e0.c(textStyle.O(), textStyle2.O(), f11), v.b(textStyle.getParagraphStyle(), textStyle2.getParagraphStyle(), f11));
    }

    public static final TextStyle d(TextStyle textStyle, w4.t tVar) {
        return new TextStyle(e0.h(textStyle.getSpanStyle()), v.e(textStyle.x(), tVar), textStyle.getPlatformStyle());
    }

    public static final int e(w4.t tVar, int i11) {
        t4.l.Companion companion = t4.l.INSTANCE;
        if (t4.l.j(i11, companion.a())) {
            int i12 = a.f75792a[tVar.ordinal()];
            if (i12 == 1) {
                return companion.b();
            }
            if (i12 == 2) {
                return companion.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!t4.l.j(i11, companion.f())) {
            return i11;
        }
        int i13 = a.f75792a[tVar.ordinal()];
        if (i13 == 1) {
            return companion.d();
        }
        if (i13 == 2) {
            return companion.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
