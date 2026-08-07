package io.sentry;

import j$.time.Instant;

/* JADX INFO: loaded from: classes9.dex */
public final class x6 extends n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Instant f81609a;

    public x6() {
        this(Instant.now());
    }

    @Override // io.sentry.n5
    public long f() {
        return l.n(this.f81609a.getEpochSecond()) + ((long) this.f81609a.getNano());
    }

    public x6(Instant instant) {
        this.f81609a = instant;
    }
}
