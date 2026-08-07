package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p7.t0;

/* JADX INFO: loaded from: classes3.dex */
final class v implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q[] f11114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f11115b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n8.e f11117d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q.a f11120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n8.y f11121h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0 f11123j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<q> f11118e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<t0, t0> f11119f = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<n8.s, Integer> f11116c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q[] f11122i = new q[0];

    private static final class a extends r8.v {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t0 f11124b;

        public a(r8.t tVar, t0 t0Var) {
            super(tVar);
            this.f11124b = t0Var;
        }

        @Override // r8.x
        public t0 e() {
            return this.f11124b;
        }

        @Override // r8.v
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f11124b.equals(((a) obj).f11124b);
            }
            return false;
        }

        @Override // r8.t
        public p7.u f() {
            return this.f11124b.c(u().p());
        }

        @Override // r8.x
        public p7.u h(int i11) {
            return this.f11124b.c(u().b(i11));
        }

        @Override // r8.v
        public int hashCode() {
            return (super.hashCode() * 31) + this.f11124b.hashCode();
        }

        @Override // r8.x
        public int s(p7.u uVar) {
            return u().d(this.f11124b.d(uVar));
        }
    }

    public v(n8.e eVar, long[] jArr, q... qVarArr) {
        this.f11117d = eVar;
        this.f11114a = qVarArr;
        this.f11123j = eVar.empty();
        this.f11115b = new boolean[qVarArr.length];
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                this.f11115b[i11] = true;
                this.f11114a[i11] = new k0(qVarArr[i11], j11);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f11123j.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return this.f11123j.d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        this.f11123j.e(j11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return this.f11123j.f();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        long jG = this.f11122i[0].g(j11);
        int i11 = 1;
        while (true) {
            q[] qVarArr = this.f11122i;
            if (i11 >= qVarArr.length) {
                return jG;
            }
            if (qVarArr[i11].g(jG) != jG) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        long j11 = -9223372036854775807L;
        for (q qVar : this.f11122i) {
            long jH = qVar.h();
            if (jH == -9223372036854775807L) {
                if (j11 != -9223372036854775807L && qVar.g(j11) != j11) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j11 == -9223372036854775807L) {
                for (q qVar2 : this.f11122i) {
                    if (qVar2 == qVar) {
                        break;
                    }
                    if (qVar2.g(jH) != jH) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j11 = jH;
            } else if (jH != j11) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void i(q qVar) {
        this.f11118e.remove(qVar);
        if (!this.f11118e.isEmpty()) {
            return;
        }
        int i11 = 0;
        for (q qVar2 : this.f11114a) {
            i11 += qVar2.k().f93615a;
        }
        t0[] t0VarArr = new t0[i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            q[] qVarArr = this.f11114a;
            if (i12 >= qVarArr.length) {
                this.f11121h = new n8.y(t0VarArr);
                ((q.a) s7.a.f(this.f11120g)).i(this);
                return;
            }
            n8.y yVarK = qVarArr[i12].k();
            int i14 = yVarK.f93615a;
            int i15 = 0;
            while (i15 < i14) {
                t0 t0VarB = yVarK.b(i15);
                p7.u[] uVarArr = new p7.u[t0VarB.f101499a];
                for (int i16 = 0; i16 < t0VarB.f101499a; i16++) {
                    p7.u uVarC = t0VarB.c(i16);
                    p7.u.b bVarB = uVarC.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append(":");
                    String str = uVarC.f101530a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    uVarArr[i16] = bVarB.j0(sb2.toString()).P();
                }
                t0 t0Var = new t0(i12 + ":" + t0VarB.f101500b, uVarArr);
                this.f11119f.put(t0Var, t0VarB);
                t0VarArr[i13] = t0Var;
                i15++;
                i13++;
            }
            i12++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        return (n8.y) s7.a.f(this.f11121h);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        if (this.f11118e.isEmpty()) {
            return this.f11123j.l(o1Var);
        }
        int size = this.f11118e.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f11118e.get(i11).l(o1Var);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        q[] qVarArr = this.f11122i;
        return (qVarArr.length > 0 ? qVarArr[0] : this.f11114a[0]).m(j11, b0Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
        for (q qVar : this.f11114a) {
            qVar.n();
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        for (q qVar : this.f11122i) {
            qVar.o(j11, z11);
        }
    }

    public q q(int i11) {
        return this.f11115b[i11] ? ((k0) this.f11114a[i11]).b() : this.f11114a[i11];
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < tVarArr.length; i12++) {
            n8.s sVar = sVarArr[i12];
            Integer num = sVar == null ? null : this.f11116c.get(sVar);
            iArr[i12] = num == null ? -1 : num.intValue();
            r8.t tVar = tVarArr[i12];
            if (tVar != null) {
                String str = tVar.e().f101500b;
                iArr2[i12] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i12] = -1;
            }
        }
        this.f11116c.clear();
        int length = tVarArr.length;
        n8.s[] sVarArr2 = new n8.s[length];
        n8.s[] sVarArr3 = new n8.s[tVarArr.length];
        r8.t[] tVarArr2 = new r8.t[tVarArr.length];
        ArrayList arrayList = new ArrayList(this.f11114a.length);
        long j12 = j11;
        int i13 = 0;
        while (i13 < this.f11114a.length) {
            for (int i14 = i11; i14 < tVarArr.length; i14++) {
                sVarArr3[i14] = iArr[i14] == i13 ? sVarArr[i14] : null;
                if (iArr2[i14] == i13) {
                    r8.t tVar2 = (r8.t) s7.a.f(tVarArr[i14]);
                    tVarArr2[i14] = new a(tVar2, (t0) s7.a.f(this.f11119f.get(tVar2.e())));
                } else {
                    tVarArr2[i14] = null;
                }
            }
            int i15 = i13;
            long jR = this.f11114a[i13].r(tVarArr2, zArr, sVarArr3, zArr2, j12);
            if (i15 == 0) {
                j12 = jR;
            } else if (jR != j12) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < tVarArr.length; i16++) {
                if (iArr2[i16] == i15) {
                    n8.s sVar2 = (n8.s) s7.a.f(sVarArr3[i16]);
                    sVarArr2[i16] = sVarArr3[i16];
                    this.f11116c.put(sVar2, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr[i16] == i15) {
                    s7.a.h(sVarArr3[i16] == null);
                }
            }
            if (z11) {
                arrayList.add(this.f11114a[i15]);
            }
            i13 = i15 + 1;
            i11 = 0;
        }
        int i17 = i11;
        System.arraycopy(sVarArr2, i17, sVarArr, i17, length);
        this.f11122i = (q[]) arrayList.toArray(new q[i17]);
        this.f11123j = this.f11117d.a(arrayList, com.google.common.collect.f0.j(arrayList, new ou.h() { // from class: androidx.media3.exoplayer.source.u
            @Override // ou.h
            public final Object apply(Object obj) {
                return ((q) obj).k().c();
            }
        }));
        return j12;
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void j(q qVar) {
        ((q.a) s7.a.f(this.f11120g)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f11120g = aVar;
        Collections.addAll(this.f11118e, this.f11114a);
        for (q qVar : this.f11114a) {
            qVar.u(this, j11);
        }
    }
}
