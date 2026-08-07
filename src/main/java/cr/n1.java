package cr;

import android.util.Base64;
import com.google.android.exoplayer2.f2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n1 implements p1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ou.x<String> f59015i = new ou.x() { // from class: cr.m1
        @Override // ou.x
        public final Object get() {
            return n1.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f59016j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f2.d f59017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.b f59018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f59019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ou.x<String> f59020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p1.a f59021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f2 f59022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f59024h;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f59025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f59027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.source.o.b f59028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f59029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f59030f;

        public a(String str, int i11, com.google.android.exoplayer2.source.o.b bVar) {
            this.f59025a = str;
            this.f59026b = i11;
            this.f59027c = bVar == null ? -1L : bVar.f63160d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f59028d = bVar;
        }

        private int l(f2 f2Var, f2 f2Var2, int i11) {
            if (i11 >= f2Var.t()) {
                if (i11 < f2Var2.t()) {
                    return i11;
                }
                return -1;
            }
            f2Var.r(i11, n1.this.f59017a);
            for (int i12 = n1.this.f59017a.f39956o; i12 <= n1.this.f59017a.f39957p; i12++) {
                int iF = f2Var2.f(f2Var.q(i12));
                if (iF != -1) {
                    return f2Var2.j(iF, n1.this.f59018b).f39924c;
                }
            }
            return -1;
        }

        public boolean i(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            if (bVar == null) {
                return i11 == this.f59026b;
            }
            com.google.android.exoplayer2.source.o.b bVar2 = this.f59028d;
            if (bVar2 == null) {
                return !bVar.b() && bVar.f63160d == this.f59027c;
            }
            return bVar.f63160d == bVar2.f63160d && bVar.f63158b == bVar2.f63158b && bVar.f63159c == bVar2.f63159c;
        }

        public boolean j(b.a aVar) {
            com.google.android.exoplayer2.source.o.b bVar = aVar.f58913d;
            if (bVar == null) {
                return this.f59026b != aVar.f58912c;
            }
            long j11 = this.f59027c;
            if (j11 == -1) {
                return false;
            }
            if (bVar.f63160d > j11) {
                return true;
            }
            if (this.f59028d == null) {
                return false;
            }
            int iF = aVar.f58911b.f(bVar.f63157a);
            int iF2 = aVar.f58911b.f(this.f59028d.f63157a);
            com.google.android.exoplayer2.source.o.b bVar2 = aVar.f58913d;
            if (bVar2.f63160d < this.f59028d.f63160d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            if (!bVar2.b()) {
                int i11 = aVar.f58913d.f63161e;
                return i11 == -1 || i11 > this.f59028d.f63158b;
            }
            com.google.android.exoplayer2.source.o.b bVar3 = aVar.f58913d;
            int i12 = bVar3.f63158b;
            int i13 = bVar3.f63159c;
            com.google.android.exoplayer2.source.o.b bVar4 = this.f59028d;
            int i14 = bVar4.f63158b;
            return i12 > i14 || (i12 == i14 && i13 > bVar4.f63159c);
        }

        public void k(int i11, com.google.android.exoplayer2.source.o.b bVar) {
            if (this.f59027c != -1 || i11 != this.f59026b || bVar == null || bVar.f63160d < n1.this.n()) {
                return;
            }
            this.f59027c = bVar.f63160d;
        }

        public boolean m(f2 f2Var, f2 f2Var2) {
            int iL = l(f2Var, f2Var2, this.f59026b);
            this.f59026b = iL;
            if (iL == -1) {
                return false;
            }
            com.google.android.exoplayer2.source.o.b bVar = this.f59028d;
            return bVar == null || f2Var2.f(bVar.f63157a) != -1;
        }
    }

    public n1() {
        this(f59015i);
    }

    private void l(a aVar) {
        if (aVar.f59027c != -1) {
            this.f59024h = aVar.f59027c;
        }
        this.f59023g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f59016j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f59019c.get(this.f59023g);
        return (aVar == null || aVar.f59027c == -1) ? this.f59024h + 1 : aVar.f59027c;
    }

    private a o(int i11, com.google.android.exoplayer2.source.o.b bVar) {
        a aVar = null;
        long j11 = Long.MAX_VALUE;
        for (a aVar2 : this.f59019c.values()) {
            aVar2.k(i11, bVar);
            if (aVar2.i(i11, bVar)) {
                long j12 = aVar2.f59027c;
                if (j12 == -1 || j12 < j11) {
                    aVar = aVar2;
                    j11 = j12;
                } else if (j12 == j11 && ((a) ts.p0.j(aVar)).f59028d != null && aVar2.f59028d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f59020d.get();
        a aVar3 = new a(str, i11, bVar);
        this.f59019c.put(str, aVar3);
        return aVar3;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private void p(b.a aVar) {
        if (aVar.f58911b.u()) {
            String str = this.f59023g;
            if (str != null) {
                l((a) ts.a.e(this.f59019c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f59019c.get(this.f59023g);
        a aVarO = o(aVar.f58912c, aVar.f58913d);
        this.f59023g = aVarO.f59025a;
        b(aVar);
        com.google.android.exoplayer2.source.o.b bVar = aVar.f58913d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f59027c == aVar.f58913d.f63160d && aVar2.f59028d != null && aVar2.f59028d.f63158b == aVar.f58913d.f63158b && aVar2.f59028d.f63159c == aVar.f58913d.f63159c) {
            return;
        }
        com.google.android.exoplayer2.source.o.b bVar2 = aVar.f58913d;
        this.f59021e.K(aVar, o(aVar.f58912c, new com.google.android.exoplayer2.source.o.b(bVar2.f63157a, bVar2.f63160d)).f59025a, aVarO.f59025a);
    }

    @Override // cr.p1
    public synchronized String a() {
        return this.f59023g;
    }

    @Override // cr.p1
    public synchronized void b(b.a aVar) {
        ts.a.e(this.f59021e);
        if (aVar.f58911b.u()) {
            return;
        }
        com.google.android.exoplayer2.source.o.b bVar = aVar.f58913d;
        if (bVar != null) {
            if (bVar.f63160d < n()) {
                return;
            }
            a aVar2 = this.f59019c.get(this.f59023g);
            if (aVar2 != null && aVar2.f59027c == -1 && aVar2.f59026b != aVar.f58912c) {
                return;
            }
        }
        a aVarO = o(aVar.f58912c, aVar.f58913d);
        if (this.f59023g == null) {
            this.f59023g = aVarO.f59025a;
        }
        com.google.android.exoplayer2.source.o.b bVar2 = aVar.f58913d;
        if (bVar2 != null && bVar2.b()) {
            com.google.android.exoplayer2.source.o.b bVar3 = aVar.f58913d;
            com.google.android.exoplayer2.source.o.b bVar4 = new com.google.android.exoplayer2.source.o.b(bVar3.f63157a, bVar3.f63160d, bVar3.f63158b);
            a aVarO2 = o(aVar.f58912c, bVar4);
            if (!aVarO2.f59029e) {
                aVarO2.f59029e = true;
                aVar.f58911b.l(aVar.f58913d.f63157a, this.f59018b);
                this.f59021e.E(new b.a(aVar.f58910a, aVar.f58911b, aVar.f58912c, bVar4, Math.max(0L, ts.p0.Z0(this.f59018b.i(aVar.f58913d.f63158b)) + this.f59018b.p()), aVar.f58915f, aVar.f58916g, aVar.f58917h, aVar.f58918i, aVar.f58919j), aVarO2.f59025a);
            }
        }
        if (!aVarO.f59029e) {
            aVarO.f59029e = true;
            this.f59021e.E(aVar, aVarO.f59025a);
        }
        if (aVarO.f59025a.equals(this.f59023g) && !aVarO.f59030f) {
            aVarO.f59030f = true;
            this.f59021e.F(aVar, aVarO.f59025a);
        }
    }

    @Override // cr.p1
    public void c(p1.a aVar) {
        this.f59021e = aVar;
    }

    @Override // cr.p1
    public synchronized void d(b.a aVar) {
        p1.a aVar2;
        try {
            String str = this.f59023g;
            if (str != null) {
                l((a) ts.a.e(this.f59019c.get(str)));
            }
            Iterator<a> it = this.f59019c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f59029e && (aVar2 = this.f59021e) != null) {
                    aVar2.G(aVar, next.f59025a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // cr.p1
    public synchronized void e(b.a aVar, int i11) {
        try {
            ts.a.e(this.f59021e);
            boolean z11 = i11 == 0;
            Iterator<a> it = this.f59019c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f59029e) {
                        boolean zEquals = next.f59025a.equals(this.f59023g);
                        boolean z12 = z11 && zEquals && next.f59030f;
                        if (zEquals) {
                            l(next);
                        }
                        this.f59021e.G(aVar, next.f59025a, z12);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // cr.p1
    public synchronized String f(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar) {
        return o(f2Var.l(bVar.f63157a, this.f59018b).f39924c, bVar).f59025a;
    }

    @Override // cr.p1
    public synchronized void g(b.a aVar) {
        try {
            ts.a.e(this.f59021e);
            f2 f2Var = this.f59022f;
            this.f59022f = aVar.f58911b;
            Iterator<a> it = this.f59019c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(f2Var, this.f59022f) || next.j(aVar)) {
                    it.remove();
                    if (next.f59029e) {
                        if (next.f59025a.equals(this.f59023g)) {
                            l(next);
                        }
                        this.f59021e.G(aVar, next.f59025a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public n1(ou.x<String> xVar) {
        this.f59020d = xVar;
        this.f59017a = new f2.d();
        this.f59018b = new f2.b();
        this.f59019c = new HashMap<>();
        this.f59022f = f2.f39911a;
        this.f59024h = -1L;
    }
}
