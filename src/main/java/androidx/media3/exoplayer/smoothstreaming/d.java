package androidx.media3.exoplayer.smoothstreaming;

import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.g0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import com.google.common.collect.f0;
import com.google.common.collect.x;
import java.util.ArrayList;
import n8.y;
import p7.t0;
import p7.u;
import p8.h;
import r8.t;
import s8.e;
import s8.k;
import z7.b0;

/* JADX INFO: loaded from: classes3.dex */
final class d implements q, g0.a<h<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b.a f10715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7.q f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f10717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f10718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f10719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f10720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.a f10722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s8.b f10723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final y f10724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n8.e f10725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q.a f10726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.media3.exoplayer.smoothstreaming.manifest.a f10727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h<b>[] f10728n = t(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0 f10729o;

    public d(androidx.media3.exoplayer.smoothstreaming.manifest.a aVar, b.a aVar2, v7.q qVar, n8.e eVar, e eVar2, i iVar, androidx.media3.exoplayer.drm.h.a aVar3, androidx.media3.exoplayer.upstream.b bVar, s.a aVar4, k kVar, s8.b bVar2) {
        this.f10727m = aVar;
        this.f10715a = aVar2;
        this.f10716b = qVar;
        this.f10717c = kVar;
        this.f10719e = eVar2;
        this.f10718d = iVar;
        this.f10720f = aVar3;
        this.f10721g = bVar;
        this.f10722h = aVar4;
        this.f10723i = bVar2;
        this.f10725k = eVar;
        this.f10724j = s(aVar, iVar, aVar2);
        this.f10729o = eVar.empty();
    }

    private h<b> q(t tVar, long j11) {
        int iD = this.f10724j.d(tVar.e());
        return new h<>(this.f10727m.f10767f[iD].f10773a, null, null, this.f10715a.c(this.f10717c, this.f10727m, iD, tVar, this.f10716b, this.f10719e), this, this.f10723i, j11, this.f10718d, this.f10720f, this.f10721g, this.f10722h, false, null);
    }

    private static y s(androidx.media3.exoplayer.smoothstreaming.manifest.a aVar, i iVar, b.a aVar2) {
        t0[] t0VarArr = new t0[aVar.f10767f.length];
        int i11 = 0;
        while (true) {
            androidx.media3.exoplayer.smoothstreaming.manifest.a.b[] bVarArr = aVar.f10767f;
            if (i11 >= bVarArr.length) {
                return new y(t0VarArr);
            }
            u[] uVarArr = bVarArr[i11].f10782j;
            u[] uVarArr2 = new u[uVarArr.length];
            for (int i12 = 0; i12 < uVarArr.length; i12++) {
                u uVar = uVarArr[i12];
                uVarArr2[i12] = aVar2.d(uVar.b().X(iVar.e(uVar)).P());
            }
            t0VarArr[i11] = new t0(Integer.toString(i11), uVarArr2);
            i11++;
        }
    }

    private static h<b>[] t(int i11) {
        return new h[i11];
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f10729o.c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return this.f10729o.d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        this.f10729o.e(j11);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return this.f10729o.f();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) throws Throwable {
        for (h<b> hVar : this.f10728n) {
            hVar.V(j11);
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public y k() {
        return this.f10724j;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        return this.f10729o.l(o1Var);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, b0 b0Var) {
        for (h<b> hVar : this.f10728n) {
            if (hVar.f101881a == 2) {
                return hVar.m(j11, b0Var);
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
        this.f10717c.a();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
        for (h<b> hVar : this.f10728n) {
            hVar.o(j11, z11);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            n8.s sVar = sVarArr[i11];
            if (sVar != null) {
                h hVar = (h) sVar;
                if (tVarArr[i11] == null || !zArr[i11]) {
                    hVar.S();
                    sVarArr[i11] = null;
                } else {
                    ((b) hVar.G()).b((t) s7.a.f(tVarArr[i11]));
                    arrayList.add(hVar);
                }
            }
            if (sVarArr[i11] == null && (tVar = tVarArr[i11]) != null) {
                h<b> hVarQ = q(tVar, j11);
                arrayList.add(hVarQ);
                sVarArr[i11] = hVarQ;
                zArr2[i11] = true;
            }
        }
        h<b>[] hVarArrT = t(arrayList.size());
        this.f10728n = hVarArrT;
        arrayList.toArray(hVarArrT);
        this.f10729o = this.f10725k.a(arrayList, f0.j(arrayList, new ou.h() { // from class: androidx.media3.exoplayer.smoothstreaming.c
            @Override // ou.h
            public final Object apply(Object obj) {
                return x.s(Integer.valueOf(((h) obj).f101881a));
            }
        }));
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        this.f10726l = aVar;
        aVar.i(this);
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void j(h<b> hVar) {
        ((q.a) s7.a.f(this.f10726l)).j(this);
    }

    public void w() {
        for (h<b> hVar : this.f10728n) {
            hVar.S();
        }
        this.f10726l = null;
    }

    public void x(androidx.media3.exoplayer.smoothstreaming.manifest.a aVar) {
        this.f10727m = aVar;
        for (h<b> hVar : this.f10728n) {
            ((b) hVar.G()).e(aVar);
        }
        ((q.a) s7.a.f(this.f10726l)).j(this);
    }
}
