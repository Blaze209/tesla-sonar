package com.google.android.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f41143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f41144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.d f41145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f2 f41146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f41148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f41149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f41151i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41152j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41156n;

    public interface a {
        void d(w1 w1Var);
    }

    public interface b {
        void k(int i11, Object obj);
    }

    public w1(a aVar, b bVar, f2 f2Var, int i11, ts.d dVar, Looper looper) {
        this.f41144b = aVar;
        this.f41143a = bVar;
        this.f41146d = f2Var;
        this.f41149g = looper;
        this.f41145c = dVar;
        this.f41150h = i11;
    }

    public synchronized boolean a(long j11) {
        boolean z11;
        try {
            ts.a.g(this.f41153k);
            ts.a.g(this.f41149g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f41145c.elapsedRealtime() + j11;
            while (true) {
                z11 = this.f41155m;
                if (z11 || j11 <= 0) {
                    break;
                }
                this.f41145c.b();
                wait(j11);
                j11 = jElapsedRealtime - this.f41145c.elapsedRealtime();
            }
            if (!z11) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f41154l;
    }

    public boolean b() {
        return this.f41152j;
    }

    public Looper c() {
        return this.f41149g;
    }

    public int d() {
        return this.f41150h;
    }

    public Object e() {
        return this.f41148f;
    }

    public long f() {
        return this.f41151i;
    }

    public b g() {
        return this.f41143a;
    }

    public f2 h() {
        return this.f41146d;
    }

    public int i() {
        return this.f41147e;
    }

    public synchronized boolean j() {
        return this.f41156n;
    }

    public synchronized void k(boolean z11) {
        this.f41154l = z11 | this.f41154l;
        this.f41155m = true;
        notifyAll();
    }

    public w1 l() {
        ts.a.g(!this.f41153k);
        if (this.f41151i == -9223372036854775807L) {
            ts.a.a(this.f41152j);
        }
        this.f41153k = true;
        this.f41144b.d(this);
        return this;
    }

    public w1 m(Object obj) {
        ts.a.g(!this.f41153k);
        this.f41148f = obj;
        return this;
    }

    public w1 n(int i11) {
        ts.a.g(!this.f41153k);
        this.f41147e = i11;
        return this;
    }
}
