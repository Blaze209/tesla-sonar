package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.h7;
import io.sentry.l;
import io.sentry.n5;

/* JADX INFO: loaded from: classes9.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f79693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f79694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f79695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f79696d;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return Long.compare(this.f79694b, iVar.f79694b);
    }

    public String b() {
        return this.f79693a;
    }

    public long c() {
        if (n()) {
            return this.f79696d - this.f79695c;
        }
        return 0L;
    }

    public n5 d() {
        if (n()) {
            return new h7(l.i(e()));
        }
        return null;
    }

    public long e() {
        if (m()) {
            return this.f79694b + c();
        }
        return 0L;
    }

    public double f() {
        return l.j(e());
    }

    public n5 g() {
        if (m()) {
            return new h7(l.i(h()));
        }
        return null;
    }

    public long h() {
        return this.f79694b;
    }

    public double i() {
        return l.j(this.f79694b);
    }

    public long j() {
        return this.f79695c;
    }

    public boolean k() {
        return this.f79695c == 0;
    }

    public boolean l() {
        return this.f79696d == 0;
    }

    public boolean m() {
        return this.f79695c != 0;
    }

    public boolean n() {
        return this.f79696d != 0;
    }

    public void o() {
        this.f79693a = null;
        this.f79695c = 0L;
        this.f79696d = 0L;
        this.f79694b = 0L;
    }

    public void p(long j11) {
        this.f79695c = j11;
        this.f79694b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f79695c);
    }

    public void q(String str, long j11, long j12, long j13) {
        this.f79693a = str;
        this.f79694b = j11;
        this.f79695c = j12;
        this.f79696d = j13;
    }

    public void r() {
        this.f79695c = SystemClock.uptimeMillis();
        this.f79694b = System.currentTimeMillis();
    }

    public void s() {
        this.f79696d = SystemClock.uptimeMillis();
    }
}
