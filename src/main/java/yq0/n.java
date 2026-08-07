package yq0;

import dr0.u;
import dr0.v;
import dr0.w;
import dr0.y;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Collection;
import java.util.logging.Logger;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes10.dex */
public class n extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Logger f125755u = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final byte[] f125756v = {-96, 0, 0, 2, 71, Tnaf.POW_2_WIDTH, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f125757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f125758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y f125759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f125760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f125761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f125762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f125763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f125764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j f125765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private dr0.e f125766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private dr0.m f125767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private dr0.a f125768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private dr0.i f125769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private dr0.l f125770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private w f125771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private zo0.e f125772t;

    public n(zo0.e eVar, int i11, int i12, boolean z11, boolean z12) {
        this(eVar, 256, i11, i12, z11, z12);
    }

    @Override // zo0.e
    public void a(zo0.b bVar) {
        this.f125772t.a(bVar);
    }

    @Override // zo0.e
    public Collection<zo0.b> b() {
        return this.f125772t.b();
    }

    @Override // zo0.e
    public boolean c(Exception exc) {
        return this.f125772t.c(exc);
    }

    @Override // zo0.e
    public void e() {
        if (n()) {
            return;
        }
        synchronized (this) {
            this.f125772t.e();
            this.f125758f = true;
        }
    }

    @Override // zo0.e
    public zo0.j f(zo0.f fVar) {
        return this.f125772t.f(fVar);
    }

    public dr0.c g(PublicKey publicKey, String str, String str2, byte[] bArr) {
        return new dr0.b(this.f125768p, m()).a(publicKey, str, str2, bArr);
    }

    public synchronized dr0.g h(g gVar) {
        dr0.g gVarB;
        if (!(gVar instanceof i)) {
            throw new IllegalArgumentException("Unsupported key type");
        }
        gVarB = new dr0.f(this.f125766n, this.f125760h, this.f125762j).b(gVar);
        y yVarA = gVarB.a();
        this.f125759g = yVarA;
        this.f125765m.j(yVarA);
        return gVarB;
    }

    public synchronized dr0.k i(BigInteger bigInteger, String str, String str2, PublicKey publicKey) {
        dr0.k kVarB;
        kVarB = new dr0.j(this.f125769q, m(), this.f125760h, this.f125762j).b(bigInteger, str, str2, publicKey);
        y yVarA = kVarB.a();
        this.f125759g = yVarA;
        this.f125765m.j(yVarA);
        return kVarB;
    }

    public synchronized v j(g gVar, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) {
        v vVarF;
        vVarF = new u(this.f125767o, this.f125759g, this.f125761i, this.f125760h, this.f125762j).f(gVar, str, algorithmParameterSpec, bigInteger);
        y yVarJ = vVarF.j();
        this.f125759g = yVarJ;
        this.f125765m.j(yVarJ);
        return vVarF;
    }

    @Deprecated
    public synchronized zo0.d k(short s11) {
        return l(s11, this.f125757e);
    }

    public synchronized zo0.d l(short s11, int i11) {
        zo0.d dVar;
        zo0.d dVar2;
        try {
            if (this.f125763k) {
                synchronized (this.f125765m) {
                    this.f125765m.b(s11);
                    dVar = new zo0.d(i11, this.f125765m);
                }
                return dVar;
            }
            synchronized (this.f125764l) {
                this.f125764l.b(s11);
                dVar2 = new zo0.d(i11, this.f125764l);
            }
            return dVar2;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public y m() {
        y yVar = (y) this.f125765m.f();
        if (yVar != null && yVar.l() > this.f125759g.l()) {
            this.f125759g = yVar;
        }
        return this.f125759g;
    }

    public boolean n() {
        return this.f125758f;
    }

    public void o(boolean z11) {
        if (this.f125763k) {
            f125755u.info("Re-selecting ICAO applet");
        }
        if (z11) {
            this.f125771s.e(this.f125759g, f125756v);
        } else {
            this.f125771s.e(null, f125756v);
        }
        this.f125763k = true;
    }

    public n(zo0.e eVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        this.f125772t = eVar;
        this.f125766n = new dr0.e(eVar);
        this.f125767o = new dr0.m(eVar);
        this.f125768p = new dr0.a(eVar);
        this.f125769q = new dr0.i(eVar);
        this.f125770r = new dr0.l(eVar);
        this.f125771s = new w(eVar);
        this.f125761i = i11;
        this.f125760h = i12;
        this.f125757e = i13;
        this.f125762j = z12;
        this.f125763k = false;
        this.f125758f = false;
        this.f125764l = new j(this.f125771s, false);
        this.f125765m = new j(this.f125771s, z11);
    }
}
