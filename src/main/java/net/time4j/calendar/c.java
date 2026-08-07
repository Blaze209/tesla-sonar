package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final c[] f94042q;
    private static final long serialVersionUID = 4908662352833192131L;

    class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f94043a;

        a(int i11) {
            this.f94043a = i11;
        }

        @Override // net.time4j.calendar.j
        public int d() {
            return (((this.f94043a - 1) * 60) + c.this.getNumber()) - 1;
        }
    }

    static {
        c[] cVarArr = new c[60];
        int i11 = 0;
        while (i11 < 60) {
            int i12 = i11 + 1;
            cVarArr[i11] = new c(i12);
            i11 = i12;
        }
        f94042q = cVarArr;
    }

    private c(int i11) {
        super(i11);
    }

    public static c n(int i11) {
        if (i11 >= 1 && i11 <= 60) {
            return f94042q[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    static c o(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z11) {
        o oVarK = o.k(charSequence, parsePosition, locale, z11);
        if (oVarK == null) {
            return null;
        }
        return n(oVarK.getNumber());
    }

    public j m(int i11) {
        if (i11 >= 1) {
            return new a(i11);
        }
        throw new IllegalArgumentException("Cycle number must not be smaller than 1: " + i11);
    }

    @Override // net.time4j.calendar.o
    Object readResolve() {
        return n(super.getNumber());
    }
}
