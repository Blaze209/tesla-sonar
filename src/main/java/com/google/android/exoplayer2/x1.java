package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class x1 extends com.google.android.exoplayer2.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f41307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f41308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f41309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f2[] f41310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object[] f41311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HashMap<Object, Integer> f41312o;

    class a extends com.google.android.exoplayer2.source.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final f2.d f41313g;

        a(f2 f2Var) {
            super(f2Var);
            this.f41313g = new f2.d();
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.b k(int i11, f2.b bVar, boolean z11) {
            f2.b bVarK = super.k(i11, bVar, z11);
            if (super.r(bVarK.f39924c, this.f41313g).h()) {
                bVarK.w(bVar.f39922a, bVar.f39923b, bVar.f39924c, bVar.f39925d, bVar.f39926e, fs.c.f66525g, true);
                return bVarK;
            }
            bVarK.f39927f = true;
            return bVarK;
        }
    }

    public x1(Collection<? extends d1> collection, es.r rVar) {
        this(K(collection), L(collection), rVar);
    }

    private static f2[] K(Collection<? extends d1> collection) {
        f2[] f2VarArr = new f2[collection.size()];
        Iterator<? extends d1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            f2VarArr[i11] = it.next().b();
            i11++;
        }
        return f2VarArr;
    }

    private static Object[] L(Collection<? extends d1> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends d1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            objArr[i11] = it.next().a();
            i11++;
        }
        return objArr;
    }

    @Override // com.google.android.exoplayer2.a
    protected Object B(int i11) {
        return this.f41311n[i11];
    }

    @Override // com.google.android.exoplayer2.a
    protected int D(int i11) {
        return this.f41308k[i11];
    }

    @Override // com.google.android.exoplayer2.a
    protected int E(int i11) {
        return this.f41309l[i11];
    }

    @Override // com.google.android.exoplayer2.a
    protected f2 H(int i11) {
        return this.f41310m[i11];
    }

    public x1 I(es.r rVar) {
        f2[] f2VarArr = new f2[this.f41310m.length];
        int i11 = 0;
        while (true) {
            f2[] f2VarArr2 = this.f41310m;
            if (i11 >= f2VarArr2.length) {
                return new x1(f2VarArr, this.f41311n, rVar);
            }
            f2VarArr[i11] = new a(f2VarArr2[i11]);
            i11++;
        }
    }

    List<f2> J() {
        return Arrays.asList(this.f41310m);
    }

    @Override // com.google.android.exoplayer2.f2
    public int m() {
        return this.f41307j;
    }

    @Override // com.google.android.exoplayer2.f2
    public int t() {
        return this.f41306i;
    }

    @Override // com.google.android.exoplayer2.a
    protected int w(Object obj) {
        Integer num = this.f41312o.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    protected int x(int i11) {
        return ts.p0.h(this.f41308k, i11 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected int y(int i11) {
        return ts.p0.h(this.f41309l, i11 + 1, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private x1(f2[] f2VarArr, Object[] objArr, es.r rVar) {
        super(false, rVar);
        int i11 = 0;
        int length = f2VarArr.length;
        this.f41310m = f2VarArr;
        this.f41308k = new int[length];
        this.f41309l = new int[length];
        this.f41311n = objArr;
        this.f41312o = new HashMap<>();
        int length2 = f2VarArr.length;
        int iT = 0;
        int iM = 0;
        int i12 = 0;
        while (i11 < length2) {
            f2 f2Var = f2VarArr[i11];
            this.f41310m[i12] = f2Var;
            this.f41309l[i12] = iT;
            this.f41308k[i12] = iM;
            iT += f2Var.t();
            iM += this.f41310m[i12].m();
            this.f41312o.put(objArr[i12], Integer.valueOf(i12));
            i11++;
            i12++;
        }
        this.f41306i = iT;
        this.f41307j = iM;
    }
}
