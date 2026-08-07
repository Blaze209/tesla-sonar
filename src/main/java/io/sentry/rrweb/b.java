package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.util.y;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f81253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f81254b;

    public static final class a {
        public boolean a(b bVar, String str, i3 i3Var, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f81253a = (c) y.c((c) i3Var.v0(iLogger, new c.a()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f81254b = i3Var.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C1706b {
        public void a(b bVar, j3 j3Var, ILogger iLogger) {
            j3Var.N("type").V(iLogger, bVar.f81253a);
            j3Var.N("timestamp").D(bVar.f81254b);
        }
    }

    protected b(c cVar) {
        this.f81253a = cVar;
        this.f81254b = System.currentTimeMillis();
    }

    public long e() {
        return this.f81254b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f81254b == bVar.f81254b && this.f81253a == bVar.f81253a;
    }

    public void f(long j11) {
        this.f81254b = j11;
    }

    public int hashCode() {
        return y.b(this.f81253a, Long.valueOf(this.f81254b));
    }

    protected b() {
        this(c.Custom);
    }
}
