package com.fourthline.vision.internal;

import java.util.Arrays;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37654d;

    public D2(String alias, long j11) {
        p013kotlin.jvm.internal.s.k(alias, "alias");
        this.f37651a = alias;
        this.f37652b = j11;
    }

    public final void monitor() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f37653c == 0) {
            this.f37653c = jCurrentTimeMillis;
        }
        int i11 = this.f37654d + 1;
        this.f37654d = i11;
        long j11 = jCurrentTimeMillis - this.f37653c;
        if (j11 >= this.f37652b) {
            double d11 = ((double) i11) / (j11 / 1000.0d);
            if (D2.class.isAnonymousClass()) {
                String name = D2.class.getName();
                int length = name.length();
                p013kotlin.jvm.internal.s.h(name);
                if (length > 23) {
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = D2.class.getSimpleName();
                int length2 = simpleName.length();
                p013kotlin.jvm.internal.s.h(simpleName);
                if (length2 > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
            p013kotlin.jvm.internal.s.j(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1)), "format(...)");
            this.f37653c = jCurrentTimeMillis;
            this.f37654d = 0;
        }
    }

    public /* synthetic */ D2(String str, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 1000L : j11);
    }
}
