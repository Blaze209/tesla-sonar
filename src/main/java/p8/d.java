package p8;

import a8.o2;
import android.util.SparseArray;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.List;
import java.util.Objects;
import p7.g0;
import p7.u;
import s7.c0;
import s7.q0;
import t9.q;
import w8.i0;
import w8.j0;
import w8.o0;
import w8.p;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r, f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final b f101849j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final i0 f101850k = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f101851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f101852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f101853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f101854d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f101855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.b f101856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f101857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j0 f101858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u[] f101859i;

    private static final class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f101860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f101861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u f101862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w8.n f101863d = new w8.n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public u f101864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private o0 f101865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f101866g;

        public a(int i11, int i12, u uVar) {
            this.f101860a = i11;
            this.f101861b = i12;
            this.f101862c = uVar;
        }

        @Override // w8.o0
        public void a(c0 c0Var, int i11, int i12) {
            ((o0) q0.l(this.f101865f)).f(c0Var, i11);
        }

        @Override // w8.o0
        public void b(long j11, int i11, int i12, int i13, o0.a aVar) {
            long j12 = this.f101866g;
            if (j12 != -9223372036854775807L && j11 >= j12) {
                this.f101865f = this.f101863d;
            }
            ((o0) q0.l(this.f101865f)).b(j11, i11, i12, i13, aVar);
        }

        @Override // w8.o0
        public int c(p7.j jVar, int i11, boolean z11, int i12) {
            return ((o0) q0.l(this.f101865f)).e(jVar, i11, z11);
        }

        @Override // w8.o0
        public void g(u uVar) {
            u uVar2 = this.f101862c;
            if (uVar2 != null) {
                uVar = uVar.m(uVar2);
            }
            this.f101864e = uVar;
            ((o0) q0.l(this.f101865f)).g(this.f101864e);
        }

        public void h(f.b bVar, long j11) {
            if (bVar == null) {
                this.f101865f = this.f101863d;
                return;
            }
            this.f101866g = j11;
            o0 o0VarB = bVar.b(this.f101860a, this.f101861b);
            this.f101865f = o0VarB;
            u uVar = this.f101864e;
            if (uVar != null) {
                o0VarB.g(uVar);
            }
        }
    }

    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q.a f101867a = new t9.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f101868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f101869c;

        @Override // p8.f.a
        public u d(u uVar) {
            String str;
            if (!this.f101868b || !this.f101867a.b(uVar)) {
                return uVar;
            }
            u.b bVarY = uVar.b().y0("application/x-media3-cues").Y(this.f101867a.a(uVar));
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

        @Override // p8.f.a
        public f e(int i11, u uVar, boolean z11, List<u> list, o0 o0Var, o2 o2Var) {
            p hVar;
            String str = uVar.f101543n;
            if (!g0.s(str)) {
                if (g0.r(str)) {
                    hVar = new o9.e(this.f101867a, this.f101868b ? 1 : 3);
                } else if (Objects.equals(str, ClipboardModule.MIMETYPE_JPEG)) {
                    hVar = new e9.a(1);
                } else if (Objects.equals(str, ClipboardModule.MIMETYPE_PNG)) {
                    hVar = new s9.a();
                } else {
                    int i12 = z11 ? 4 : 0;
                    if (!this.f101868b) {
                        i12 |= 32;
                    }
                    hVar = new q9.h(this.f101867a, i12 | q9.h.g(this.f101869c), null, null, list, o0Var);
                }
            } else {
                if (!this.f101868b) {
                    return null;
                }
                hVar = new t9.m(this.f101867a.c(uVar), uVar);
            }
            return new d(hVar, i11, uVar);
        }

        @Override // p8.f.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b(boolean z11) {
            this.f101868b = z11;
            return this;
        }

        @Override // p8.f.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b c(int i11) {
            this.f101869c = i11;
            return this;
        }

        @Override // p8.f.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(q.a aVar) {
            this.f101867a = (q.a) s7.a.f(aVar);
            return this;
        }
    }

    public d(p pVar, int i11, u uVar) {
        this.f101851a = pVar;
        this.f101852b = i11;
        this.f101853c = uVar;
    }

    @Override // p8.f
    public boolean a(w8.q qVar) {
        int iH = this.f101851a.h(qVar, f101850k);
        s7.a.h(iH != 1);
        return iH == 0;
    }

    @Override // w8.r
    public o0 b(int i11, int i12) {
        a aVar = this.f101854d.get(i11);
        if (aVar == null) {
            s7.a.h(this.f101859i == null);
            aVar = new a(i11, i12, i12 == this.f101852b ? this.f101853c : null);
            aVar.h(this.f101856f, this.f101857g);
            this.f101854d.put(i11, aVar);
        }
        return aVar;
    }

    @Override // p8.f
    public void c(f.b bVar, long j11, long j12) {
        this.f101856f = bVar;
        this.f101857g = j12;
        if (!this.f101855e) {
            this.f101851a.e(this);
            if (j11 != -9223372036854775807L) {
                this.f101851a.a(0L, j11);
            }
            this.f101855e = true;
            return;
        }
        p pVar = this.f101851a;
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        pVar.a(0L, j11);
        for (int i11 = 0; i11 < this.f101854d.size(); i11++) {
            this.f101854d.valueAt(i11).h(bVar, j12);
        }
    }

    @Override // p8.f
    public w8.g d() {
        j0 j0Var = this.f101858h;
        if (j0Var instanceof w8.g) {
            return (w8.g) j0Var;
        }
        return null;
    }

    @Override // p8.f
    public u[] e() {
        return this.f101859i;
    }

    @Override // w8.r
    public void j() {
        u[] uVarArr = new u[this.f101854d.size()];
        for (int i11 = 0; i11 < this.f101854d.size(); i11++) {
            uVarArr[i11] = (u) s7.a.j(this.f101854d.valueAt(i11).f101864e);
        }
        this.f101859i = uVarArr;
    }

    @Override // p8.f
    public void release() {
        this.f101851a.release();
    }

    @Override // w8.r
    public void t(j0 j0Var) {
        this.f101858h = j0Var;
    }
}
