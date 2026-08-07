package androidx.media3.exoplayer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class k2 extends z7.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f10349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f10350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p7.r0[] f10351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f10352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f10353n;

    class a extends androidx.media3.exoplayer.source.m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p7.r0.d f10354f;

        a(p7.r0 r0Var) {
            super(r0Var);
            this.f10354f = new p7.r0.d();
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public p7.r0.b k(int i11, p7.r0.b bVar, boolean z11) {
            p7.r0.b bVarK = super.k(i11, bVar, z11);
            if (super.r(bVarK.f101462c, this.f10354f).g()) {
                bVarK.v(bVar.f101460a, bVar.f101461b, bVar.f101462c, bVar.f101463d, bVar.f101464e, p7.b.f101195g, true);
                return bVarK;
            }
            bVarK.f101465f = true;
            return bVarK;
        }
    }

    public k2(Collection<? extends t1> collection, n8.t tVar) {
        this(L(collection), M(collection), tVar);
    }

    private static p7.r0[] L(Collection<? extends t1> collection) {
        p7.r0[] r0VarArr = new p7.r0[collection.size()];
        Iterator<? extends t1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            r0VarArr[i11] = it.next().b();
            i11++;
        }
        return r0VarArr;
    }

    private static Object[] M(Collection<? extends t1> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends t1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            objArr[i11] = it.next().a();
            i11++;
        }
        return objArr;
    }

    @Override // z7.a
    protected Object C(int i11) {
        return this.f10352m[i11];
    }

    @Override // z7.a
    protected int E(int i11) {
        return this.f10349j[i11];
    }

    @Override // z7.a
    protected int F(int i11) {
        return this.f10350k[i11];
    }

    @Override // z7.a
    protected p7.r0 I(int i11) {
        return this.f10351l[i11];
    }

    public k2 J(n8.t tVar) {
        p7.r0[] r0VarArr = new p7.r0[this.f10351l.length];
        int i11 = 0;
        while (true) {
            p7.r0[] r0VarArr2 = this.f10351l;
            if (i11 >= r0VarArr2.length) {
                return new k2(r0VarArr, this.f10352m, tVar);
            }
            r0VarArr[i11] = new a(r0VarArr2[i11]);
            i11++;
        }
    }

    List<p7.r0> K() {
        return Arrays.asList(this.f10351l);
    }

    @Override // p7.r0
    public int m() {
        return this.f10348i;
    }

    @Override // p7.r0
    public int t() {
        return this.f10347h;
    }

    @Override // z7.a
    protected int x(Object obj) {
        Integer num = this.f10353n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // z7.a
    protected int y(int i11) {
        return s7.q0.j(this.f10349j, i11 + 1, false, false);
    }

    @Override // z7.a
    protected int z(int i11) {
        return s7.q0.j(this.f10350k, i11 + 1, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k2(p7.r0[] r0VarArr, Object[] objArr, n8.t tVar) {
        super(false, tVar);
        int i11 = 0;
        int length = r0VarArr.length;
        this.f10351l = r0VarArr;
        this.f10349j = new int[length];
        this.f10350k = new int[length];
        this.f10352m = objArr;
        this.f10353n = new HashMap<>();
        int length2 = r0VarArr.length;
        int iT = 0;
        int iM = 0;
        int i12 = 0;
        while (i11 < length2) {
            p7.r0 r0Var = r0VarArr[i11];
            this.f10351l[i12] = r0Var;
            this.f10350k[i12] = iT;
            this.f10349j[i12] = iM;
            iT += r0Var.t();
            iM += this.f10351l[i12].m();
            this.f10353n.put(objArr[i12], Integer.valueOf(i12));
            i11++;
            i12++;
        }
        this.f10347h = iT;
        this.f10348i = iM;
    }
}
