package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.plaid.internal.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class DelayedC4581y0 implements Delayed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkEvent f48222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48223b;

    public DelayedC4581y0(LinkEvent linkEvent, int i11) {
        p013kotlin.jvm.internal.s.k(linkEvent, "linkEvent");
        this.f48222a = linkEvent;
        this.f48223b = System.currentTimeMillis() + ((long) i11);
    }

    public final LinkEvent a() {
        return this.f48222a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed other = delayed;
        p013kotlin.jvm.internal.s.k(other, "other");
        return p013kotlin.jvm.internal.s.n(this.f48223b, ((DelayedC4581y0) other).f48223b);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit unit) {
        p013kotlin.jvm.internal.s.k(unit, "unit");
        return unit.convert(this.f48223b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
