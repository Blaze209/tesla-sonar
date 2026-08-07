package io.sentry;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class p8 implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p8 f80831b = new p8("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<String> f80832a;

    public static final class a implements q1<p8> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p8 a(i3 i3Var, ILogger iLogger) {
            return new p8(i3Var.O());
        }
    }

    public p8(final String str) {
        Objects.requireNonNull(str, "value is required");
        this.f80832a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.o8
            @Override // io.sentry.util.r.a
            public final Object a() {
                return p8.a(str);
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p8.class != obj.getClass()) {
            return false;
        }
        return this.f80832a.a().equals(((p8) obj).f80832a.a());
    }

    public int hashCode() {
        return this.f80832a.a().hashCode();
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.w(this.f80832a.a());
    }

    public String toString() {
        return this.f80832a.a();
    }

    public p8() {
        this.f80832a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.n8
            @Override // io.sentry.util.r.a
            public final Object a() {
                return d8.b();
            }
        });
    }
}
