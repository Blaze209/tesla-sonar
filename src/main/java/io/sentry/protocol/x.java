package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.d8;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import io.sentry.util.l0;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f81078b = new x("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<String> f81079a;

    public static final class a implements q1<x> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(i3 i3Var, ILogger iLogger) {
            return new x(i3Var.O());
        }
    }

    public x() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(x xVar, UUID uuid) {
        xVar.getClass();
        return xVar.d(l0.c(uuid));
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return io.sentry.util.f0.e(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return this.f81079a.a().equals(((x) obj).f81079a.a());
    }

    public int hashCode() {
        return this.f81079a.a().hashCode();
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.w(toString());
    }

    public String toString() {
        return this.f81079a.a();
    }

    public x(final UUID uuid) {
        if (uuid != null) {
            this.f81079a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return x.a(this.f81073a, uuid);
                }
            });
        } else {
            this.f81079a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.u
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return d8.a();
                }
            });
        }
    }

    public x(String str) {
        final String strE = io.sentry.util.f0.e(str);
        if (strE.length() != 32 && strE.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strE.length() == 36) {
            this.f81079a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.v
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return this.f81075a.d(strE);
                }
            });
        } else {
            this.f81079a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.w
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return x.b(strE);
                }
            });
        }
    }
}
