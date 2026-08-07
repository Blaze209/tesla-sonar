package um;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class k implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f116449n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tk.a<PooledByteBuffer> f116450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pk.n<FileInputStream> f116451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gm.c f116452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f116453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f116454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f116455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f116456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f116457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f116458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private om.b f116459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f116460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f116461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f116462m;

    public k(tk.a<PooledByteBuffer> aVar) {
        this.f116452c = gm.c.f69215d;
        this.f116453d = -1;
        this.f116454e = 0;
        this.f116455f = -1;
        this.f116456g = -1;
        this.f116457h = 1;
        this.f116458i = -1;
        pk.k.b(Boolean.valueOf(tk.a.b0(aVar)));
        this.f116450a = aVar.clone();
        this.f116451b = null;
    }

    private Pair<Integer, Integer> D0() {
        InputStream inputStreamJ = J();
        if (inputStreamJ == null) {
            return null;
        }
        Pair<Integer, Integer> pairF = fn.i.f(inputStreamJ);
        if (pairF != null) {
            this.f116455f = pairF.a().intValue();
            this.f116456g = pairF.b().intValue();
        }
        return pairF;
    }

    public static k n(k kVar) {
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    private void n0() {
        gm.c cVarD = gm.e.d(J());
        this.f116452c = cVarD;
        Pair<Integer, Integer> pairD0 = gm.b.b(cVarD) ? D0() : z0().b();
        if (cVarD == gm.b.JPEG && this.f116453d == -1) {
            if (pairD0 != null) {
                int iB = fn.f.b(J());
                this.f116454e = iB;
                this.f116453d = fn.f.a(iB);
                return;
            }
            return;
        }
        if (cVarD == gm.b.HEIF && this.f116453d == -1) {
            int iA = fn.d.a(J());
            this.f116454e = iA;
            this.f116453d = fn.f.a(iA);
        } else if (this.f116453d == -1) {
            this.f116453d = 0;
        }
    }

    public static void o(k kVar) {
        if (kVar != null) {
            kVar.close();
        }
    }

    public static boolean s0(k kVar) {
        return kVar.f116453d >= 0 && kVar.f116455f >= 0 && kVar.f116456g >= 0;
    }

    public static boolean u0(k kVar) {
        return kVar != null && kVar.t0();
    }

    private void y0() {
        if (this.f116455f < 0 || this.f116456g < 0) {
            w0();
        }
    }

    private fn.e z0() throws Throwable {
        InputStream inputStreamJ;
        try {
            inputStreamJ = J();
            try {
                fn.e eVarE = fn.c.e(inputStreamJ);
                this.f116460k = eVarE.getColorSpace();
                Pair<Integer, Integer> pairB = eVarE.b();
                if (pairB != null) {
                    this.f116455f = pairB.a().intValue();
                    this.f116456g = pairB.b().intValue();
                }
                if (inputStreamJ != null) {
                    try {
                        inputStreamJ.close();
                    } catch (IOException unused) {
                    }
                }
                return eVarE;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamJ != null) {
                    try {
                        inputStreamJ.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamJ = null;
        }
    }

    public om.b B() {
        return this.f116459j;
    }

    public ColorSpace C() {
        y0();
        return this.f116460k;
    }

    public void G0(om.b bVar) {
        this.f116459j = bVar;
    }

    public String H(int i11) {
        tk.a<PooledByteBuffer> aVarT = t();
        if (aVarT == null) {
            return "";
        }
        int iMin = Math.min(c0(), i11);
        byte[] bArr = new byte[iMin];
        try {
            PooledByteBuffer pooledByteBufferH = aVarT.H();
            if (pooledByteBufferH == null) {
                aVarT.close();
                return "";
            }
            pooledByteBufferH.M(0, bArr, 0, iMin);
            aVarT.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i12 = 0; i12 < iMin; i12++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i12])));
            }
            return sb2.toString();
        } catch (Throwable th2) {
            aVarT.close();
            throw th2;
        }
    }

    public void H0(int i11) {
        this.f116454e = i11;
    }

    public gm.c I() {
        y0();
        return this.f116452c;
    }

    public InputStream J() {
        pk.n<FileInputStream> nVar = this.f116451b;
        if (nVar != null) {
            return nVar.get();
        }
        tk.a aVarT = tk.a.t(this.f116450a);
        if (aVarT == null) {
            return null;
        }
        try {
            return new sk.i((PooledByteBuffer) aVarT.H());
        } finally {
            tk.a.C(aVarT);
        }
    }

    public void J0(int i11) {
        this.f116456g = i11;
    }

    public void K0(gm.c cVar) {
        this.f116452c = cVar;
    }

    public int L0() {
        y0();
        return this.f116454e;
    }

    public void O0(int i11) {
        this.f116453d = i11;
    }

    public void P0(int i11) {
        this.f116457h = i11;
    }

    public InputStream T() {
        return (InputStream) pk.k.g(J());
    }

    public void T0(String str) {
        this.f116461l = str;
    }

    public void U0(int i11) {
        this.f116455f = i11;
    }

    public int U2() {
        y0();
        return this.f116453d;
    }

    public int b0() {
        return this.f116457h;
    }

    public k c() {
        k kVar;
        pk.n<FileInputStream> nVar = this.f116451b;
        if (nVar != null) {
            kVar = new k(nVar, this.f116458i);
        } else {
            tk.a aVarT = tk.a.t(this.f116450a);
            if (aVarT == null) {
                kVar = null;
            } else {
                try {
                    kVar = new k((tk.a<PooledByteBuffer>) aVarT);
                } catch (Throwable th2) {
                    tk.a.C(aVarT);
                    throw th2;
                }
            }
            tk.a.C(aVarT);
        }
        if (kVar != null) {
            kVar.p(this);
        }
        return kVar;
    }

    public int c0() {
        tk.a<PooledByteBuffer> aVar = this.f116450a;
        return (aVar == null || aVar.H() == null) ? this.f116458i : this.f116450a.H().size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        tk.a.C(this.f116450a);
    }

    public String e0() {
        return this.f116461l;
    }

    public int getHeight() {
        y0();
        return this.f116456g;
    }

    public int getWidth() {
        y0();
        return this.f116455f;
    }

    protected boolean k0() {
        return this.f116462m;
    }

    public void p(k kVar) {
        this.f116452c = kVar.I();
        this.f116455f = kVar.getWidth();
        this.f116456g = kVar.getHeight();
        this.f116453d = kVar.U2();
        this.f116454e = kVar.L0();
        this.f116457h = kVar.b0();
        this.f116458i = kVar.c0();
        this.f116459j = kVar.B();
        this.f116460k = kVar.C();
        this.f116462m = kVar.k0();
    }

    public boolean r0(int i11) {
        gm.c cVar = this.f116452c;
        if ((cVar != gm.b.JPEG && cVar != gm.b.DNG) || this.f116451b != null) {
            return true;
        }
        pk.k.g(this.f116450a);
        PooledByteBuffer pooledByteBufferH = this.f116450a.H();
        return i11 >= 2 && pooledByteBufferH.Q(i11 + (-2)) == -1 && pooledByteBufferH.Q(i11 - 1) == -39;
    }

    public tk.a<PooledByteBuffer> t() {
        return tk.a.t(this.f116450a);
    }

    public synchronized boolean t0() {
        return tk.a.b0(this.f116450a) || this.f116451b != null;
    }

    public void w0() {
        if (!f116449n) {
            n0();
        } else {
            if (this.f116462m) {
                return;
            }
            n0();
            this.f116462m = true;
        }
    }

    public k(pk.n<FileInputStream> nVar) {
        this.f116452c = gm.c.f69215d;
        this.f116453d = -1;
        this.f116454e = 0;
        this.f116455f = -1;
        this.f116456g = -1;
        this.f116457h = 1;
        this.f116458i = -1;
        pk.k.g(nVar);
        this.f116450a = null;
        this.f116451b = nVar;
    }

    public k(pk.n<FileInputStream> nVar, int i11) {
        this(nVar);
        this.f116458i = i11;
    }
}
