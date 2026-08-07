package i4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lt4/j;", "align", "", "m", "(I)I", "Lt4/e;", "hyphens", "o", "Lt4/f$b;", "breakStrategy", "n", "Lt4/f$c;", "lineBreakStrictness", "p", "Lt4/f$d;", "lineBreakWordStyle", "q", "Lj4/i0;", "maxHeight", "k", "(Lj4/i0;I)I", "Li4/r0;", "textStyle", "", "ellipsis", "l", "(Li4/r0;Z)Z", "", "j", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Li4/g0;", "r", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        r4.c.u(spannableString, new l4.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(j4.i0 i0Var, int i11) {
        int lineCount = i0Var.getLineCount();
        for (int i12 = 0; i12 < lineCount; i12++) {
            if (i0Var.l(i12) > i11) {
                return i12;
            }
        }
        return i0Var.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(TextStyle textStyle, boolean z11) {
        if (z11 && !w4.v.e(textStyle.s(), w4.w.h(0)) && !w4.v.e(textStyle.s(), w4.v.INSTANCE.a())) {
            int iB = textStyle.B();
            t4.j.Companion companion = t4.j.INSTANCE;
            if (!t4.j.k(iB, companion.g()) && !t4.j.k(textStyle.B(), companion.f()) && !t4.j.k(textStyle.B(), companion.c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i11) {
        t4.j.Companion companion = t4.j.INSTANCE;
        if (t4.j.k(i11, companion.d())) {
            return 3;
        }
        if (t4.j.k(i11, companion.e())) {
            return 4;
        }
        if (t4.j.k(i11, companion.a())) {
            return 2;
        }
        return (!t4.j.k(i11, companion.f()) && t4.j.k(i11, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i11) {
        t4.f.b.Companion companion = t4.f.b.INSTANCE;
        if (t4.f.b.e(i11, companion.c())) {
            return 0;
        }
        if (t4.f.b.e(i11, companion.b())) {
            return 1;
        }
        return t4.f.b.e(i11, companion.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i11) {
        t4.e.Companion companion = t4.e.INSTANCE;
        if (t4.e.g(i11, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        t4.e.g(i11, companion.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i11) {
        t4.f.c.Companion companion = t4.f.c.INSTANCE;
        if (t4.f.c.f(i11, companion.a())) {
            return 0;
        }
        if (t4.f.c.f(i11, companion.b())) {
            return 1;
        }
        if (t4.f.c.f(i11, companion.c())) {
            return 2;
        }
        return t4.f.c.f(i11, companion.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i11) {
        t4.f.d.Companion companion = t4.f.d.INSTANCE;
        return (!t4.f.d.d(i11, companion.a()) && t4.f.d.d(i11, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i11) {
        g0.Companion companion = g0.INSTANCE;
        return (!g0.d(i11, companion.a()) && g0.d(i11, companion.b())) ? 1 : 0;
    }
}
