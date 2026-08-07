package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class El {
    public static final byte[] a(Dl dl2) {
        p013kotlin.jvm.internal.s.k(dl2, "<this>");
        return dl2.a().b();
    }

    public static final String b(Dl dl2) {
        p013kotlin.jvm.internal.s.k(dl2, "<this>");
        return new String(a(dl2), p013kotlin.text.d.UTF_8);
    }

    public static final String c(Dl dl2) {
        p013kotlin.jvm.internal.s.k(dl2, "<this>");
        return "N/A";
    }

    public static final boolean d(Dl dl2) {
        p013kotlin.jvm.internal.s.k(dl2, "<this>");
        int iC = dl2.c();
        return 500 <= iC && iC < 600;
    }

    public static final boolean e(Dl dl2) {
        p013kotlin.jvm.internal.s.k(dl2, "<this>");
        int iC = dl2.c();
        return 200 <= iC && iC < 300;
    }
}
