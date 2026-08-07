package androidx.media3.exoplayer;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f10323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f10324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.j f10325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p7.r0 f10326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f10328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f10329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10331i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10332j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10336n;

    public interface a {
        void e(j2 j2Var);
    }

    public interface b {
        void k(int i11, Object obj);
    }

    public j2(a aVar, b bVar, p7.r0 r0Var, int i11, s7.j jVar, Looper looper) {
        this.f10324b = aVar;
        this.f10323a = bVar;
        this.f10326d = r0Var;
        this.f10329g = looper;
        this.f10325c = jVar;
        this.f10330h = i11;
    }

    public boolean a() {
        return this.f10332j;
    }

    public Looper b() {
        return this.f10329g;
    }

    public int c() {
        return this.f10330h;
    }

    public Object d() {
        return this.f10328f;
    }

    public long e() {
        return this.f10331i;
    }

    public b f() {
        return this.f10323a;
    }

    public p7.r0 g() {
        return this.f10326d;
    }

    public int h() {
        return this.f10327e;
    }

    public synchronized boolean i() {
        return this.f10336n;
    }

    public synchronized void j(boolean z11) {
        this.f10334l = z11 | this.f10334l;
        this.f10335m = true;
        notifyAll();
    }

    public j2 k() {
        s7.a.h(!this.f10333k);
        if (this.f10331i == -9223372036854775807L) {
            s7.a.a(this.f10332j);
        }
        this.f10333k = true;
        this.f10324b.e(this);
        return this;
    }

    public j2 l(Object obj) {
        s7.a.h(!this.f10333k);
        this.f10328f = obj;
        return this;
    }

    public j2 m(int i11) {
        s7.a.h(!this.f10333k);
        this.f10327e = i11;
        return this;
    }
}
