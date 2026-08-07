package kk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class l implements jk.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f86267i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l f86268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f86269k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jk.d f86270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f86271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f86272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f86273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f86274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f86275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jk.c.a f86276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f86277h;

    private l() {
    }

    public static l a() {
        synchronized (f86267i) {
            try {
                l lVar = f86268j;
                if (lVar == null) {
                    return new l();
                }
                f86268j = lVar.f86277h;
                lVar.f86277h = null;
                f86269k--;
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void c() {
        this.f86270a = null;
        this.f86271b = null;
        this.f86272c = 0L;
        this.f86273d = 0L;
        this.f86274e = 0L;
        this.f86275f = null;
        this.f86276g = null;
    }

    public void b() {
        synchronized (f86267i) {
            try {
                if (f86269k < 5) {
                    c();
                    f86269k++;
                    l lVar = f86268j;
                    if (lVar != null) {
                        this.f86277h = lVar;
                    }
                    f86268j = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l d(jk.d dVar) {
        this.f86270a = dVar;
        return this;
    }

    public l e(long j11) {
        this.f86273d = j11;
        return this;
    }

    public l f(long j11) {
        this.f86274e = j11;
        return this;
    }

    public l g(jk.c.a aVar) {
        this.f86276g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f86275f = iOException;
        return this;
    }

    public l i(long j11) {
        this.f86272c = j11;
        return this;
    }

    public l j(String str) {
        this.f86271b = str;
        return this;
    }
}
