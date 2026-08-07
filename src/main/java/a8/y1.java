package a8;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements m2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ou.x<String> f811i = new ou.x() { // from class: a8.x1
        @Override // ou.x
        public final Object get() {
            return y1.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f812j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p7.r0.d f813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7.r0.b f814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ou.x<String> f816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m2.a f817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p7.r0 f818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f820h;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.source.r.b f824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f826f;

        public a(String str, int i11, androidx.media3.exoplayer.source.r.b bVar) {
            this.f821a = str;
            this.f822b = i11;
            this.f823c = bVar == null ? -1L : bVar.f11106d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f824d = bVar;
        }

        private int l(p7.r0 r0Var, p7.r0 r0Var2, int i11) {
            if (i11 >= r0Var.t()) {
                if (i11 < r0Var2.t()) {
                    return i11;
                }
                return -1;
            }
            r0Var.r(i11, y1.this.f813a);
            for (int i12 = y1.this.f813a.f101494n; i12 <= y1.this.f813a.f101495o; i12++) {
                int iF = r0Var2.f(r0Var.q(i12));
                if (iF != -1) {
                    return r0Var2.j(iF, y1.this.f814b).f101462c;
                }
            }
            return -1;
        }

        public boolean i(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            if (bVar == null) {
                return i11 == this.f822b;
            }
            androidx.media3.exoplayer.source.r.b bVar2 = this.f824d;
            if (bVar2 == null) {
                return !bVar.b() && bVar.f11106d == this.f823c;
            }
            return bVar.f11106d == bVar2.f11106d && bVar.f11104b == bVar2.f11104b && bVar.f11105c == bVar2.f11105c;
        }

        public boolean j(b.a aVar) {
            androidx.media3.exoplayer.source.r.b bVar = aVar.f585d;
            if (bVar == null) {
                return this.f822b != aVar.f584c;
            }
            long j11 = this.f823c;
            if (j11 == -1) {
                return false;
            }
            if (bVar.f11106d > j11) {
                return true;
            }
            if (this.f824d == null) {
                return false;
            }
            int iF = aVar.f583b.f(bVar.f11103a);
            int iF2 = aVar.f583b.f(this.f824d.f11103a);
            androidx.media3.exoplayer.source.r.b bVar2 = aVar.f585d;
            if (bVar2.f11106d < this.f824d.f11106d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            if (!bVar2.b()) {
                int i11 = aVar.f585d.f11107e;
                return i11 == -1 || i11 > this.f824d.f11104b;
            }
            androidx.media3.exoplayer.source.r.b bVar3 = aVar.f585d;
            int i12 = bVar3.f11104b;
            int i13 = bVar3.f11105c;
            androidx.media3.exoplayer.source.r.b bVar4 = this.f824d;
            int i14 = bVar4.f11104b;
            return i12 > i14 || (i12 == i14 && i13 > bVar4.f11105c);
        }

        public void k(int i11, androidx.media3.exoplayer.source.r.b bVar) {
            if (this.f823c != -1 || i11 != this.f822b || bVar == null || bVar.f11106d < y1.this.n()) {
                return;
            }
            this.f823c = bVar.f11106d;
        }

        public boolean m(p7.r0 r0Var, p7.r0 r0Var2) {
            int iL = l(r0Var, r0Var2, this.f822b);
            this.f822b = iL;
            if (iL == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.r.b bVar = this.f824d;
            return bVar == null || r0Var2.f(bVar.f11103a) != -1;
        }
    }

    public y1() {
        this(f811i);
    }

    private void l(a aVar) {
        if (aVar.f823c != -1) {
            this.f820h = aVar.f823c;
        }
        this.f819g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f812j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f815c.get(this.f819g);
        return (aVar == null || aVar.f823c == -1) ? this.f820h + 1 : aVar.f823c;
    }

    private a o(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        a aVar = null;
        long j11 = Long.MAX_VALUE;
        for (a aVar2 : this.f815c.values()) {
            aVar2.k(i11, bVar);
            if (aVar2.i(i11, bVar)) {
                long j12 = aVar2.f823c;
                if (j12 == -1 || j12 < j11) {
                    aVar = aVar2;
                    j11 = j12;
                } else if (j12 == j11 && ((a) s7.q0.l(aVar)).f824d != null && aVar2.f824d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f816d.get();
        a aVar3 = new a(str, i11, bVar);
        this.f815c.put(str, aVar3);
        return aVar3;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void p(b.a aVar) {
        if (aVar.f583b.u()) {
            String str = this.f819g;
            if (str != null) {
                l((a) s7.a.f(this.f815c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f815c.get(this.f819g);
        a aVarO = o(aVar.f584c, aVar.f585d);
        this.f819g = aVarO.f821a;
        b(aVar);
        androidx.media3.exoplayer.source.r.b bVar = aVar.f585d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f823c == aVar.f585d.f11106d && aVar2.f824d != null && aVar2.f824d.f11104b == aVar.f585d.f11104b && aVar2.f824d.f11105c == aVar.f585d.f11105c) {
            return;
        }
        androidx.media3.exoplayer.source.r.b bVar2 = aVar.f585d;
        this.f817e.n0(aVar, o(aVar.f584c, new androidx.media3.exoplayer.source.r.b(bVar2.f11103a, bVar2.f11106d)).f821a, aVarO.f821a);
    }

    @Override // a8.m2
    public synchronized String a() {
        return this.f819g;
    }

    @Override // a8.m2
    public synchronized void b(b.a aVar) {
        s7.a.f(this.f817e);
        if (aVar.f583b.u()) {
            return;
        }
        androidx.media3.exoplayer.source.r.b bVar = aVar.f585d;
        if (bVar != null) {
            if (bVar.f11106d < n()) {
                return;
            }
            a aVar2 = this.f815c.get(this.f819g);
            if (aVar2 != null && aVar2.f823c == -1 && aVar2.f822b != aVar.f584c) {
                return;
            }
        }
        a aVarO = o(aVar.f584c, aVar.f585d);
        if (this.f819g == null) {
            this.f819g = aVarO.f821a;
        }
        androidx.media3.exoplayer.source.r.b bVar2 = aVar.f585d;
        if (bVar2 != null && bVar2.b()) {
            androidx.media3.exoplayer.source.r.b bVar3 = aVar.f585d;
            androidx.media3.exoplayer.source.r.b bVar4 = new androidx.media3.exoplayer.source.r.b(bVar3.f11103a, bVar3.f11106d, bVar3.f11104b);
            a aVarO2 = o(aVar.f584c, bVar4);
            if (!aVarO2.f825e) {
                aVarO2.f825e = true;
                aVar.f583b.l(aVar.f585d.f11103a, this.f814b);
                this.f817e.e(new b.a(aVar.f582a, aVar.f583b, aVar.f584c, bVar4, Math.max(0L, s7.q0.O1(this.f814b.g(aVar.f585d.f11104b)) + this.f814b.o()), aVar.f587f, aVar.f588g, aVar.f589h, aVar.f590i, aVar.f591j), aVarO2.f821a);
            }
        }
        if (!aVarO.f825e) {
            aVarO.f825e = true;
            this.f817e.e(aVar, aVarO.f821a);
        }
        if (aVarO.f821a.equals(this.f819g) && !aVarO.f826f) {
            aVarO.f826f = true;
            this.f817e.y0(aVar, aVarO.f821a);
        }
    }

    @Override // a8.m2
    public synchronized void c(b.a aVar) {
        try {
            s7.a.f(this.f817e);
            p7.r0 r0Var = this.f818f;
            this.f818f = aVar.f583b;
            Iterator<a> it = this.f815c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(r0Var, this.f818f) || next.j(aVar)) {
                    it.remove();
                    if (next.f825e) {
                        if (next.f821a.equals(this.f819g)) {
                            l(next);
                        }
                        this.f817e.Z(aVar, next.f821a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // a8.m2
    public void d(m2.a aVar) {
        this.f817e = aVar;
    }

    @Override // a8.m2
    public synchronized void e(b.a aVar) {
        m2.a aVar2;
        try {
            String str = this.f819g;
            if (str != null) {
                l((a) s7.a.f(this.f815c.get(str)));
            }
            Iterator<a> it = this.f815c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f825e && (aVar2 = this.f817e) != null) {
                    aVar2.Z(aVar, next.f821a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // a8.m2
    public synchronized void f(b.a aVar, int i11) {
        try {
            s7.a.f(this.f817e);
            boolean z11 = i11 == 0;
            Iterator<a> it = this.f815c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f825e) {
                        boolean zEquals = next.f821a.equals(this.f819g);
                        boolean z12 = z11 && zEquals && next.f826f;
                        if (zEquals) {
                            l(next);
                        }
                        this.f817e.Z(aVar, next.f821a, z12);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // a8.m2
    public synchronized String g(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar) {
        return o(r0Var.l(bVar.f11103a, this.f814b).f101462c, bVar).f821a;
    }

    public y1(ou.x<String> xVar) {
        this.f816d = xVar;
        this.f813a = new p7.r0.d();
        this.f814b = new p7.r0.b();
        this.f815c = new HashMap<>();
        this.f818f = p7.r0.f101451a;
        this.f820h = -1L;
    }
}
