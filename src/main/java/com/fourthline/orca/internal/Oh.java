package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Oh {
    public static final String a(Ph ph2, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(ph2, "<this>");
        lVar.o(-161435748);
        if (p020r2.o.J()) {
            p020r2.o.S(-161435748, i11, -1, "com.fourthline.orca.core.internal.inputview.accessibilityDescription (InputViewStateAccessibility.kt:18)");
        }
        String strC = RA.c(ph2.a(), lVar, 0);
        if (ph2.e() != Mh.Date) {
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return strC;
        }
        String str = strC + ". " + RA.c(QA.a.a(QA.f27433a, R.string.shared_input_date_format_accessibility, 0, 2, null), lVar, 0) + ".";
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return str;
    }

    public static final String b(Ph ph2, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(ph2, "<this>");
        lVar.o(1753103352);
        if (p020r2.o.J()) {
            p020r2.o.S(1753103352, i11, -1, "com.fourthline.orca.core.internal.inputview.accessibilityErrorDescription (InputViewStateAccessibility.kt:13)");
        }
        String strA = RA.a(ph2.d(), lVar, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return strA;
    }

    public static final String b(Fq.a aVar, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        lVar.o(2009959251);
        if (p020r2.o.J()) {
            p020r2.o.S(2009959251, i11, -1, "com.fourthline.orca.core.internal.inputview.accessibilityErrorDescription (InputViewStateAccessibility.kt:34)");
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return null;
    }

    public static final String a(Fq.a aVar, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        lVar.o(-1878133919);
        if (p020r2.o.J()) {
            p020r2.o.S(-1878133919, i11, -1, "com.fourthline.orca.core.internal.inputview.accessibilityDescription (InputViewStateAccessibility.kt:29)");
        }
        String strC = RA.c(aVar.g(), lVar, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return strC;
    }
}
