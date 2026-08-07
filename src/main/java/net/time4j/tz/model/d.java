package net.time4j.tz.model;

import net.time4j.g0;
import net.time4j.h0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient long f94796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient h0 f94797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient i f94798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f94799d;

    protected d(int i11, i iVar, int i12) {
        if (iVar == null) {
            throw new NullPointerException("Missing offset indicator.");
        }
        if (i12 != Integer.MAX_VALUE && (i12 < -64800 || i12 > 64800)) {
            throw new IllegalArgumentException("DST out of range: " + i12);
        }
        if (i11 == 86400) {
            this.f94796a = 0L;
            this.f94797b = h0.D0();
        } else {
            net.time4j.k kVarQ0 = h0.E0().Q0(i11, net.time4j.h.SECONDS);
            this.f94796a = kVarQ0.a();
            this.f94797b = kVarQ0.b();
        }
        this.f94798c = iVar;
        this.f94799d = i12 == Integer.MAX_VALUE ? 0 : i12;
    }

    protected String a() {
        net.time4j.format.c cVar = (net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class);
        if (cVar != null) {
            return cVar.value();
        }
        throw new IllegalStateException("Cannot find calendar type annotation: " + getClass());
    }

    public abstract g0 b(int i11);

    protected final long c() {
        return this.f94796a;
    }

    public final i d() {
        return this.f94798c;
    }

    public final int e() {
        return this.f94799d;
    }

    public final h0 f() {
        return this.f94797b;
    }

    int g() {
        return 0;
    }

    protected abstract int h(long j11);

    protected abstract int i(net.time4j.base.a aVar);
}
