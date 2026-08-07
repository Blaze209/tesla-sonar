package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d0 {
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof ks.b);
    }

    public static void c(gs.b.C1421b c1421b) {
        c1421b.b();
        if (c1421b.e() instanceof Spanned) {
            if (!(c1421b.e() instanceof Spannable)) {
                c1421b.o(SpannableString.valueOf(c1421b.e()));
            }
            e((Spannable) ts.a.e(c1421b.e()), new ou.q() { // from class: com.google.android.exoplayer2.ui.b0
                @Override // ou.q
                public final boolean apply(Object obj) {
                    return d0.b(obj);
                }
            });
        }
        d(c1421b);
    }

    public static void d(gs.b.C1421b c1421b) {
        c1421b.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c1421b.e() instanceof Spanned) {
            if (!(c1421b.e() instanceof Spannable)) {
                c1421b.o(SpannableString.valueOf(c1421b.e()));
            }
            e((Spannable) ts.a.e(c1421b.e()), new ou.q() { // from class: com.google.android.exoplayer2.ui.c0
                @Override // ou.q
                public final boolean apply(Object obj) {
                    return d0.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, ou.q<Object> qVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (qVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float f(int i11, float f11, int i12, int i13) {
        float f12;
        if (f11 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i11 == 0) {
            f12 = i13;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -3.4028235E38f;
                }
                return f11;
            }
            f12 = i12;
        }
        return f11 * f12;
    }
}
