package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.x;
import java.io.IOException;
import java.util.List;
import p7.u;
import p8.f;
import p8.m;
import p8.n;
import q9.h;
import r8.t;
import r8.z;
import s7.k0;
import s8.e;
import s8.k;
import t9.g;
import t9.q;
import v7.j;
import z7.b0;

/* JADX INFO: loaded from: classes3.dex */
public class a implements androidx.media3.exoplayer.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f[] f10702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.datasource.a f10703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f10704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t f10705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.smoothstreaming.manifest.a f10706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IOException f10708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10709j = -9223372036854775807L;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0202a implements androidx.media3.exoplayer.smoothstreaming.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f10710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.a f10711b = new g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10712c;

        public C0202a(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this.f10710a = interfaceC0192a;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public androidx.media3.exoplayer.smoothstreaming.b c(k kVar, androidx.media3.exoplayer.smoothstreaming.manifest.a aVar, int i11, t tVar, v7.q qVar, e eVar) {
            androidx.media3.datasource.a aVarA = this.f10710a.a();
            if (qVar != null) {
                aVarA.n(qVar);
            }
            return new a(kVar, aVar, i11, tVar, aVarA, eVar, this.f10711b, this.f10712c);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public u d(u uVar) {
            String str;
            if (!this.f10712c || !this.f10711b.b(uVar)) {
                return uVar;
            }
            u.b bVarY = uVar.b().y0("application/x-media3-cues").Y(this.f10711b.a(uVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uVar.f101544o);
            if (uVar.f101540k != null) {
                str = " " + uVar.f101540k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0202a b(boolean z11) {
            this.f10712c = z11;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0202a a(q.a aVar) {
            this.f10711b = aVar;
            return this;
        }
    }

    private static final class b extends p8.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media3.exoplayer.smoothstreaming.manifest.a.b f10713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f10714f;

        public b(androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar, int i11, int i12) {
            super(i12, bVar.f10783k - 1);
            this.f10713e = bVar;
            this.f10714f = i11;
        }

        @Override // p8.n
        public long a() {
            return b() + this.f10713e.c((int) d());
        }

        @Override // p8.n
        public long b() {
            c();
            return this.f10713e.e((int) d());
        }
    }

    public a(k kVar, androidx.media3.exoplayer.smoothstreaming.manifest.a aVar, int i11, t tVar, androidx.media3.datasource.a aVar2, e eVar, q.a aVar3, boolean z11) {
        this.f10700a = kVar;
        this.f10706g = aVar;
        this.f10701b = i11;
        this.f10705f = tVar;
        this.f10703d = aVar2;
        this.f10704e = eVar;
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar = aVar.f10767f[i11];
        this.f10702c = new f[tVar.length()];
        for (int i12 = 0; i12 < this.f10702c.length; i12++) {
            int iB = tVar.b(i12);
            u uVar = bVar.f10782j[iB];
            q9.u[] uVarArr = uVar.f101548s != null ? ((androidx.media3.exoplayer.smoothstreaming.manifest.a.C0203a) s7.a.f(aVar.f10766e)).f10772c : null;
            int i13 = bVar.f10773a;
            int i14 = i13 == 2 ? 4 : 0;
            long j11 = bVar.f10775c;
            long j12 = aVar.f10768g;
            this.f10702c[i12] = new p8.d(new h(aVar3, !z11 ? 35 : 3, null, new q9.t(iB, i13, j11, -9223372036854775807L, j12, j12, uVar, 0, uVarArr, i14, null, null), x.r(), null), bVar.f10773a, uVar);
        }
    }

    private static m j(u uVar, androidx.media3.datasource.a aVar, Uri uri, int i11, long j11, long j12, long j13, int i12, Object obj, f fVar, s8.f.C2354f c2354f) {
        j jVarA = new j.b().i(uri).a();
        if (c2354f != null) {
            jVarA = c2354f.a().a(jVarA);
        }
        return new p8.j(aVar, jVarA, uVar, i12, obj, j11, j12, j13, -9223372036854775807L, i11, 1, j11, fVar);
    }

    private long k(long j11) {
        androidx.media3.exoplayer.smoothstreaming.manifest.a aVar = this.f10706g;
        if (!aVar.f10765d) {
            return -9223372036854775807L;
        }
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar = aVar.f10767f[this.f10701b];
        int i11 = bVar.f10783k - 1;
        return (bVar.e(i11) + bVar.c(i11)) - j11;
    }

    @Override // p8.i
    public void a() throws IOException {
        IOException iOException = this.f10708i;
        if (iOException != null) {
            throw iOException;
        }
        this.f10700a.a();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void b(t tVar) {
        this.f10705f = tVar;
    }

    @Override // p8.i
    public boolean d(long j11, p8.e eVar, List<? extends m> list) {
        if (this.f10708i != null) {
            return false;
        }
        return this.f10705f.q(j11, eVar, list);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void e(androidx.media3.exoplayer.smoothstreaming.manifest.a aVar) {
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b[] bVarArr = this.f10706g.f10767f;
        int i11 = this.f10701b;
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar = bVarArr[i11];
        int i12 = bVar.f10783k;
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar2 = aVar.f10767f[i11];
        if (i12 == 0 || bVar2.f10783k == 0) {
            this.f10707h += i12;
        } else {
            int i13 = i12 - 1;
            long jE = bVar.e(i13) + bVar.c(i13);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.f10707h += i12;
            } else {
                this.f10707h += bVar.d(jE2);
            }
        }
        this.f10706g = aVar;
    }

    @Override // p8.i
    public int f(long j11, List<? extends m> list) {
        return (this.f10708i != null || this.f10705f.length() < 2) ? list.size() : this.f10705f.o(j11, list);
    }

    @Override // p8.i
    public final void h(o1 o1Var, long j11, List<? extends m> list, p8.g gVar) {
        List<? extends m> list2;
        int iG;
        s8.f.C2354f c2354fF;
        if (this.f10708i != null) {
            return;
        }
        androidx.media3.exoplayer.smoothstreaming.manifest.a aVar = this.f10706g;
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar = aVar.f10767f[this.f10701b];
        if (bVar.f10783k == 0) {
            gVar.f101880b = !aVar.f10765d;
            return;
        }
        if (list.isEmpty()) {
            iG = bVar.d(j11);
            list2 = list;
        } else {
            list2 = list;
            iG = (int) (list2.get(list.size() - 1).g() - ((long) this.f10707h));
            if (iG < 0) {
                this.f10708i = new BehindLiveWindowException();
                return;
            }
        }
        if (iG >= bVar.f10783k) {
            gVar.f101880b = !this.f10706g.f10765d;
            return;
        }
        long j12 = o1Var.f10600a;
        long j13 = j11 - j12;
        long jK = k(j12);
        int length = this.f10705f.length();
        n[] nVarArr = new n[length];
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11;
            nVarArr[i12] = new b(bVar, this.f10705f.b(i11), iG);
            i11 = i12 + 1;
        }
        this.f10705f.m(j12, j13, jK, list2, nVarArr);
        long jE = bVar.e(iG);
        long jC = jE + bVar.c(iG);
        long j14 = list.isEmpty() ? j11 : -9223372036854775807L;
        int i13 = iG + this.f10707h;
        int iA = this.f10705f.a();
        f fVar = this.f10702c[iA];
        int iB = this.f10705f.b(iA);
        Uri uriA = bVar.a(iB, iG);
        if (this.f10704e != null) {
            c2354fF = new s8.f.C2354f(this.f10704e, "s").n(this.f10705f).e(Math.max(0L, j13)).m(o1Var.f10601b).i(this.f10706g.f10765d).g(o1Var.b(this.f10709j)).h(list.isEmpty()).f(jC - jE);
            int i14 = iG + 1;
            if (i14 < bVar.f10783k) {
                c2354fF.j(k0.a(uriA, bVar.a(iB, i14)));
            }
        } else {
            c2354fF = null;
        }
        s8.f.C2354f c2354f = c2354fF;
        this.f10709j = SystemClock.elapsedRealtime();
        gVar.f101879a = j(this.f10705f.f(), this.f10703d, uriA, i13, jE, jC, j14, this.f10705f.t(), this.f10705f.r(), fVar, c2354f);
    }

    @Override // p8.i
    public boolean i(p8.e eVar, boolean z11, androidx.media3.exoplayer.upstream.b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        androidx.media3.exoplayer.upstream.b.C0205b c0205bC = bVar.c(z.c(this.f10705f), cVar);
        if (!z11 || c0205bC == null || c0205bC.f11160a != 2) {
            return false;
        }
        t tVar = this.f10705f;
        return tVar.n(tVar.s(eVar.f101873d), c0205bC.f11161b);
    }

    @Override // p8.i
    public long m(long j11, b0 b0Var) {
        androidx.media3.exoplayer.smoothstreaming.manifest.a.b bVar = this.f10706g.f10767f[this.f10701b];
        int iD = bVar.d(j11);
        long jE = bVar.e(iD);
        return b0Var.a(j11, jE, (jE >= j11 || iD >= bVar.f10783k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // p8.i
    public void release() {
        for (f fVar : this.f10702c) {
            fVar.release();
        }
    }

    @Override // p8.i
    public void c(p8.e eVar) {
    }
}
