package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class UA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WA f28724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28725c;

    public UA(long j11, WA timeProvider) {
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        this.f28723a = j11;
        this.f28724b = timeProvider;
    }

    private final boolean a() {
        return this.f28724b.a() - this.f28725c > this.f28723a;
    }

    public final void a(wn0.a onClick) {
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        if (a()) {
            onClick.invoke();
            this.f28725c = this.f28724b.a();
        }
    }

    public /* synthetic */ UA(long j11, WA wa2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? new C2896Ke() : wa2);
    }
}
