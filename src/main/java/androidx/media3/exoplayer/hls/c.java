package androidx.media3.exoplayer.hls;

import a8.o2;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.collect.c0;
import com.google.common.collect.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p7.t0;
import p7.u;
import p8.m;
import p8.n;
import r8.t;
import s7.k0;
import s7.q0;
import v7.q;
import z7.b0;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8.e f9945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a f9946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f9947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8.i f9948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f9949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u[] f9950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HlsPlaylistTracker f9951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t0 f9952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<u> f9953i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o2 f9955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s8.e f9956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f9957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f9958n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private IOException f9960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Uri f9961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f9962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private t f9964t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f9966v = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.b f9954j = new androidx.media3.exoplayer.hls.b(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f9959o = q0.f110459f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f9965u = -9223372036854775807L;

    private static final class a extends p8.k {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte[] f9967l;

        public a(androidx.media3.datasource.a aVar, v7.j jVar, u uVar, int i11, Object obj, byte[] bArr) {
            super(aVar, jVar, 3, uVar, i11, obj, bArr);
        }

        @Override // p8.k
        protected void g(byte[] bArr, int i11) {
            this.f9967l = Arrays.copyOf(bArr, i11);
        }

        public byte[] j() {
            return this.f9967l;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p8.e f9968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f9970c;

        public b() {
            a();
        }

        public void a() {
            this.f9968a = null;
            this.f9969b = false;
            this.f9970c = null;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.c$c, reason: collision with other inner class name */
    static final class C0198c extends p8.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<androidx.media3.exoplayer.hls.playlist.c.g> f9971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f9972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f9973g;

        public C0198c(String str, long j11, List<androidx.media3.exoplayer.hls.playlist.c.g> list) {
            super(0L, list.size() - 1);
            this.f9973g = str;
            this.f9972f = j11;
            this.f9971e = list;
        }

        @Override // p8.n
        public long a() {
            c();
            androidx.media3.exoplayer.hls.playlist.c.g gVar = this.f9971e.get((int) d());
            return this.f9972f + gVar.f10219e + gVar.f10217c;
        }

        @Override // p8.n
        public long b() {
            c();
            return this.f9972f + this.f9971e.get((int) d()).f10219e;
        }
    }

    private static final class d extends r8.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9974i;

        public d(t0 t0Var, int[] iArr) {
            super(t0Var, iArr);
            this.f9974i = s(t0Var.c(iArr[0]));
        }

        @Override // r8.t
        public int a() {
            return this.f9974i;
        }

        @Override // r8.t
        public void m(long j11, long j12, long j13, List<? extends m> list, n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (l(this.f9974i, jElapsedRealtime)) {
                for (int i11 = this.f107160b - 1; i11 >= 0; i11--) {
                    if (!l(i11, jElapsedRealtime)) {
                        this.f9974i = i11;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // r8.t
        public Object r() {
            return null;
        }

        @Override // r8.t
        public int t() {
            return 0;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.hls.playlist.c.g f9975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9978d;

        public e(androidx.media3.exoplayer.hls.playlist.c.g gVar, long j11, int i11) {
            this.f9975a = gVar;
            this.f9976b = j11;
            this.f9977c = i11;
            this.f9978d = (gVar instanceof androidx.media3.exoplayer.hls.playlist.c.d) && ((androidx.media3.exoplayer.hls.playlist.c.d) gVar).f10209m;
        }
    }

    public c(f8.e eVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, u[] uVarArr, f8.d dVar, q qVar, f8.i iVar, long j11, List<u> list, o2 o2Var, s8.e eVar2) {
        this.f9945a = eVar;
        this.f9951g = hlsPlaylistTracker;
        this.f9949e = uriArr;
        this.f9950f = uVarArr;
        this.f9948d = iVar;
        this.f9957m = j11;
        this.f9953i = list;
        this.f9955k = o2Var;
        this.f9956l = eVar2;
        androidx.media3.datasource.a aVarA = dVar.a(1);
        this.f9946b = aVarA;
        if (qVar != null) {
            aVarA.n(qVar);
        }
        this.f9947c = dVar.a(3);
        this.f9952h = new t0(uVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < uriArr.length; i11++) {
            if ((uVarArr[i11].f101535f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        this.f9964t = new d(this.f9952h, ru.f.n(arrayList));
    }

    private static boolean A(boolean z11, androidx.media3.exoplayer.hls.playlist.c cVar, long j11, int i11, androidx.media3.exoplayer.hls.e eVar, long j12, long j13) {
        if (!z11 || eVar == null) {
            return false;
        }
        if (j11 < cVar.f10157k) {
            return true;
        }
        e eVarH = h(cVar, j11, i11);
        return eVarH != null && j12 + eVarH.f9975a.f10219e < j13;
    }

    private void B(androidx.media3.exoplayer.hls.playlist.c cVar) {
        this.f9965u = cVar.f10161o ? -9223372036854775807L : cVar.e() - this.f9951g.a();
    }

    private void b() {
        this.f9951g.e(this.f9949e[this.f9964t.p()]);
    }

    private static Uri e(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.c.g gVar) {
        String str;
        if (gVar == null || (str = gVar.f10221g) == null) {
            return null;
        }
        return k0.g(cVar.f67468a, str);
    }

    private Pair<Long, Integer> g(androidx.media3.exoplayer.hls.e eVar, boolean z11, androidx.media3.exoplayer.hls.playlist.c cVar, long j11, long j12) {
        int i11 = -1;
        if (eVar != null && !z11) {
            if (!eVar.h()) {
                return new Pair<>(Long.valueOf(eVar.f101924j), Integer.valueOf(eVar.f9985o));
            }
            Long lValueOf = Long.valueOf(eVar.f9985o == -1 ? eVar.g() : eVar.f101924j);
            int i12 = eVar.f9985o;
            return new Pair<>(lValueOf, Integer.valueOf(i12 != -1 ? i12 + 1 : -1));
        }
        long j13 = cVar.f10167u + j11;
        if (eVar != null && !this.f9963s) {
            j12 = eVar.f101876g;
        }
        if (!cVar.f10161o && j12 >= j13) {
            return new Pair<>(Long.valueOf(cVar.f10157k + ((long) cVar.f10164r.size())), -1);
        }
        long j14 = j12 - j11;
        int iH = q0.h(cVar.f10164r, Long.valueOf(j14), true, !this.f9951g.j() || eVar == null);
        long j15 = ((long) iH) + cVar.f10157k;
        if (iH >= 0) {
            androidx.media3.exoplayer.hls.playlist.c.f fVar = cVar.f10164r.get(iH);
            List<androidx.media3.exoplayer.hls.playlist.c.d> list = j14 < fVar.f10219e + fVar.f10217c ? fVar.f10214m : cVar.f10165s;
            for (int i13 = 0; i13 < list.size(); i13++) {
                androidx.media3.exoplayer.hls.playlist.c.d dVar = list.get(i13);
                if (j14 < dVar.f10219e + dVar.f10217c) {
                    if (!dVar.f10208l) {
                        break;
                    }
                    j15 += list == cVar.f10165s ? 1L : 0L;
                    i11 = i13;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j15), Integer.valueOf(i11));
    }

    private static e h(androidx.media3.exoplayer.hls.playlist.c cVar, long j11, int i11) {
        int i12 = (int) (j11 - cVar.f10157k);
        if (i12 == cVar.f10164r.size()) {
            if (i11 == -1) {
                i11 = 0;
            }
            if (i11 < cVar.f10165s.size()) {
                return new e(cVar.f10165s.get(i11), j11, i11);
            }
            return null;
        }
        androidx.media3.exoplayer.hls.playlist.c.f fVar = cVar.f10164r.get(i12);
        if (i11 == -1) {
            return new e(fVar, j11, -1);
        }
        if (i11 < fVar.f10214m.size()) {
            return new e(fVar.f10214m.get(i11), j11, i11);
        }
        int i13 = i12 + 1;
        if (i13 < cVar.f10164r.size()) {
            return new e(cVar.f10164r.get(i13), j11 + 1, -1);
        }
        if (cVar.f10165s.isEmpty()) {
            return null;
        }
        return new e(cVar.f10165s.get(0), j11 + 1, 0);
    }

    static List<androidx.media3.exoplayer.hls.playlist.c.g> k(androidx.media3.exoplayer.hls.playlist.c cVar, long j11, int i11) {
        int i12 = (int) (j11 - cVar.f10157k);
        if (i12 < 0 || cVar.f10164r.size() < i12) {
            return x.r();
        }
        ArrayList arrayList = new ArrayList();
        if (i12 < cVar.f10164r.size()) {
            if (i11 != -1) {
                androidx.media3.exoplayer.hls.playlist.c.f fVar = cVar.f10164r.get(i12);
                if (i11 == 0) {
                    arrayList.add(fVar);
                } else if (i11 < fVar.f10214m.size()) {
                    List<androidx.media3.exoplayer.hls.playlist.c.d> list = fVar.f10214m;
                    arrayList.addAll(list.subList(i11, list.size()));
                }
                i12++;
            }
            List<androidx.media3.exoplayer.hls.playlist.c.f> list2 = cVar.f10164r;
            arrayList.addAll(list2.subList(i12, list2.size()));
            i11 = 0;
        }
        if (cVar.f10160n != -9223372036854775807L) {
            int i13 = i11 != -1 ? i11 : 0;
            if (i13 < cVar.f10165s.size()) {
                List<androidx.media3.exoplayer.hls.playlist.c.d> list3 = cVar.f10165s;
                arrayList.addAll(list3.subList(i13, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static boolean o(e eVar, androidx.media3.exoplayer.hls.playlist.c cVar) {
        androidx.media3.exoplayer.hls.playlist.c.g gVar = eVar.f9975a;
        if (!(gVar instanceof androidx.media3.exoplayer.hls.playlist.c.d)) {
            return cVar.f67470c;
        }
        if (((androidx.media3.exoplayer.hls.playlist.c.d) gVar).f10208l) {
            return true;
        }
        return eVar.f9977c == 0 && cVar.f67470c;
    }

    private p8.e p(Uri uri, int i11, boolean z11, s8.f.C2354f c2354f) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f9954j.c(uri);
        if (bArrC != null) {
            this.f9954j.b(uri, bArrC);
            return null;
        }
        v7.j jVarA = new v7.j.b().i(uri).b(1).a();
        if (c2354f != null) {
            if (z11) {
                c2354f.l(IntegerTokenConverter.CONVERTER_KEY);
            }
            jVarA = c2354f.a().a(jVarA);
        }
        return new a(this.f9947c, jVarA, this.f9950f[i11], this.f9964t.t(), this.f9964t.r(), this.f9959o);
    }

    private long w(long j11) {
        long j12 = this.f9965u;
        if (j12 != -9223372036854775807L) {
            return j12 - j11;
        }
        return -9223372036854775807L;
    }

    public n[] a(androidx.media3.exoplayer.hls.e eVar, long j11) {
        int iD = eVar == null ? -1 : this.f9952h.d(eVar.f101873d);
        int length = this.f9964t.length();
        n[] nVarArr = new n[length];
        for (int i11 = 0; i11 < length; i11++) {
            int iB = this.f9964t.b(i11);
            Uri uri = this.f9949e[iB];
            if (this.f9951g.i(uri)) {
                androidx.media3.exoplayer.hls.playlist.c cVarM = this.f9951g.m(uri, false);
                s7.a.f(cVarM);
                long jA = cVarM.f10154h - this.f9951g.a();
                Pair<Long, Integer> pairG = g(eVar, iB != iD, cVarM, jA, j11);
                nVarArr[i11] = new C0198c(cVarM.f67468a, jA, k(cVarM, ((Long) pairG.first).longValue(), ((Integer) pairG.second).intValue()));
            } else {
                nVarArr[i11] = n.f101925a;
            }
        }
        return nVarArr;
    }

    public long c(long j11, b0 b0Var) {
        int iA = this.f9964t.a();
        Uri[] uriArr = this.f9949e;
        androidx.media3.exoplayer.hls.playlist.c cVarM = (iA >= uriArr.length || iA == -1) ? null : this.f9951g.m(uriArr[this.f9964t.p()], true);
        if (cVarM == null || cVarM.f10164r.isEmpty()) {
            return j11;
        }
        long jA = cVarM.f10154h - this.f9951g.a();
        long j12 = j11 - jA;
        int iH = q0.h(cVarM.f10164r, Long.valueOf(j12), true, true);
        long j13 = cVarM.f10164r.get(iH).f10219e;
        return b0Var.a(j12, j13, (!cVarM.f67470c || iH == cVarM.f10164r.size() - 1) ? j13 : cVarM.f10164r.get(iH + 1).f10219e) + jA;
    }

    public int d(androidx.media3.exoplayer.hls.e eVar) {
        if (eVar.f9985o == -1) {
            return 1;
        }
        androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) s7.a.f(this.f9951g.m(this.f9949e[this.f9952h.d(eVar.f101873d)], false));
        int i11 = (int) (eVar.f101924j - cVar.f10157k);
        if (i11 < 0) {
            return 1;
        }
        List<androidx.media3.exoplayer.hls.playlist.c.d> list = i11 < cVar.f10164r.size() ? cVar.f10164r.get(i11).f10214m : cVar.f10165s;
        if (eVar.f9985o >= list.size()) {
            return 2;
        }
        androidx.media3.exoplayer.hls.playlist.c.d dVar = list.get(eVar.f9985o);
        if (dVar.f10209m) {
            return 0;
        }
        return Objects.equals(Uri.parse(k0.f(cVar.f67468a, dVar.f10215a)), eVar.f101871b.f118101a) ? 1 : 2;
    }

    public void f(o1 o1Var, long j11, long j12, List<androidx.media3.exoplayer.hls.e> list, boolean z11, b bVar) {
        boolean z12;
        int i11;
        long j13;
        boolean z13;
        androidx.media3.exoplayer.hls.e eVar = list.isEmpty() ? null : (androidx.media3.exoplayer.hls.e) c0.d(list);
        int iD = eVar == null ? -1 : this.f9952h.d(eVar.f101873d);
        long j14 = o1Var.f10600a;
        long jMax = j11 - j14;
        long jW = w(j14);
        if (eVar != null && !this.f9963s) {
            long jD = eVar.d();
            jMax = Math.max(0L, jMax - jD);
            if (jW != -9223372036854775807L) {
                jW = Math.max(0L, jW - jD);
            }
        }
        long j15 = jMax;
        this.f9964t.m(j14, j15, jW, list, a(eVar, j11));
        int iP = this.f9964t.p();
        boolean z14 = iD != iP;
        Uri uri = this.f9949e[iP];
        if (!this.f9951g.i(uri)) {
            bVar.f9970c = uri;
            this.f9962r = uri;
            return;
        }
        androidx.media3.exoplayer.hls.playlist.c cVarM = this.f9951g.m(uri, true);
        s7.a.f(cVarM);
        this.f9963s = cVarM.f67470c;
        B(cVarM);
        long jA = cVarM.f10154h - this.f9951g.a();
        Uri uri2 = uri;
        Pair<Long, Integer> pairG = g(eVar, z14, cVarM, jA, j11);
        long jLongValue = ((Long) pairG.first).longValue();
        int iIntValue = ((Integer) pairG.second).intValue();
        int i12 = iD;
        androidx.media3.exoplayer.hls.playlist.c cVar = cVarM;
        androidx.media3.exoplayer.hls.e eVar2 = eVar;
        long j16 = jA;
        int i13 = iP;
        long j17 = j15;
        long j18 = jLongValue;
        if (A(z14, cVar, j18, iIntValue, eVar2, j16, j12)) {
            uri2 = this.f9949e[i12];
            androidx.media3.exoplayer.hls.playlist.c cVarM2 = this.f9951g.m(uri2, true);
            s7.a.f(cVarM2);
            long jA2 = cVarM2.f10154h - this.f9951g.a();
            i11 = i12;
            Pair<Long, Integer> pairG2 = g(eVar2, false, cVarM2, jA2, j11);
            long jLongValue2 = ((Long) pairG2.first).longValue();
            iIntValue = ((Integer) pairG2.second).intValue();
            cVar = cVarM2;
            i13 = i11;
            z12 = true;
            j18 = jLongValue2;
            j17 = j17;
            j16 = jA2;
        } else {
            z12 = true;
            i11 = i12;
        }
        if (i13 != i11 && i11 != -1) {
            this.f9951g.e(this.f9949e[i11]);
        }
        if (j18 < cVar.f10157k) {
            this.f9960p = new BehindLiveWindowException();
            return;
        }
        e eVarH = h(cVar, j18, iIntValue);
        if (eVarH != null) {
            j13 = 1;
        } else if (!cVar.f10161o) {
            bVar.f9970c = uri2;
            this.f9962r = uri2;
            return;
        } else if (z11 || cVar.f10164r.isEmpty()) {
            bVar.f9969b = z12;
            return;
        } else {
            j13 = 1;
            eVarH = new e((androidx.media3.exoplayer.hls.playlist.c.g) c0.d(cVar.f10164r), (cVar.f10157k + ((long) cVar.f10164r.size())) - 1, -1);
        }
        s8.f.C2354f c2354fF = null;
        this.f9962r = null;
        if (this.f9956l != null) {
            z13 = z12;
            c2354fF = new s8.f.C2354f(this.f9956l, "h").n(this.f9964t).e(Math.max(0L, j17)).m(o1Var.f10601b).i(cVar.f10161o ^ z13).g(o1Var.b(this.f9966v)).h(list.isEmpty()).f(eVarH.f9975a.f10217c);
            int i14 = eVarH.f9977c;
            e eVarH2 = h(cVar, i14 == -1 ? eVarH.f9976b + j13 : eVarH.f9976b, i14 == -1 ? -1 : i14 + 1);
            if (eVarH2 != null) {
                c2354fF.j(k0.a(k0.g(cVar.f67468a, eVarH.f9975a.f10215a), k0.g(cVar.f67468a, eVarH2.f9975a.f10215a)));
                String string = eVarH2.f9975a.f10223i + "-";
                if (eVarH2.f9975a.f10224j != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    androidx.media3.exoplayer.hls.playlist.c.g gVar = eVarH2.f9975a;
                    sb2.append(gVar.f10223i + gVar.f10224j);
                    string = sb2.toString();
                }
                c2354fF.k(string);
            }
        } else {
            z13 = z12;
        }
        s8.f.C2354f c2354f = c2354fF;
        this.f9966v = SystemClock.elapsedRealtime();
        Uri uriE = e(cVar, eVarH.f9975a.f10216b);
        p8.e eVarP = p(uriE, i13, z13, c2354f);
        bVar.f9968a = eVarP;
        if (eVarP == null) {
            Uri uriE2 = e(cVar, eVarH.f9975a);
            p8.e eVarP2 = p(uriE2, i13, false, c2354f);
            bVar.f9968a = eVarP2;
            if (eVarP2 == null) {
                boolean zO = o(eVarH, cVar);
                int i15 = i13;
                e eVar3 = eVarH;
                Uri uri3 = uri2;
                long j19 = j16;
                boolean zY = androidx.media3.exoplayer.hls.e.y(eVar2, j11, uri3, zO, eVar3, j19);
                if (zY && eVar3.f9978d) {
                    return;
                }
                bVar.f9968a = androidx.media3.exoplayer.hls.e.k(this.f9945a, this.f9946b, this.f9950f[i15], j19, cVar, eVar3, uri3, this.f9953i, this.f9964t.t(), this.f9964t.r(), this.f9958n, this.f9948d, this.f9957m, eVar2, this.f9954j.a(uriE2), this.f9954j.a(uriE), zY, zO, this.f9955k, c2354f);
            }
        }
    }

    public int i(long j11, List<? extends m> list) {
        return (this.f9960p != null || this.f9964t.length() < 2) ? list.size() : this.f9964t.o(j11, list);
    }

    public long j(androidx.media3.exoplayer.hls.e eVar) {
        s7.a.h(eVar.f9985o != -1);
        androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) s7.a.f(this.f9951g.m(this.f9949e[this.f9952h.d(eVar.f101873d)], false));
        int i11 = (int) (eVar.f101924j - cVar.f10157k);
        if (i11 < 0) {
            return 0L;
        }
        return (i11 < cVar.f10164r.size() ? cVar.f10164r.get(i11).f10214m : cVar.f10165s).get(eVar.f9985o).f10217c;
    }

    public t0 l() {
        return this.f9952h;
    }

    public t m() {
        return this.f9964t;
    }

    public boolean n() {
        return this.f9963s;
    }

    public boolean q(p8.e eVar, long j11) {
        t tVar = this.f9964t;
        return tVar.n(tVar.d(this.f9952h.d(eVar.f101873d)), j11);
    }

    public void r() throws IOException {
        IOException iOException = this.f9960p;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f9961q;
        if (uri == null || !uri.equals(this.f9962r)) {
            return;
        }
        this.f9951g.f(this.f9961q);
    }

    public boolean s(Uri uri) {
        return q0.u(this.f9949e, uri);
    }

    public void t(p8.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.f9959o = aVar.h();
            this.f9954j.b(aVar.f101871b.f118101a, (byte[]) s7.a.f(aVar.j()));
        }
    }

    public boolean u(Uri uri, long j11) {
        int iD;
        int i11 = 0;
        while (true) {
            Uri[] uriArr = this.f9949e;
            if (i11 >= uriArr.length) {
                i11 = -1;
                break;
            }
            if (uriArr[i11].equals(uri)) {
                break;
            }
            i11++;
        }
        if (i11 == -1 || (iD = this.f9964t.d(i11)) == -1) {
            return true;
        }
        this.f9961q = uri;
        return j11 != -9223372036854775807L && this.f9964t.n(iD, j11) && this.f9951g.k(uri, j11);
    }

    public void v() {
        b();
        this.f9960p = null;
    }

    public void x(boolean z11) {
        this.f9958n = z11;
    }

    public void y(t tVar) {
        b();
        this.f9964t = tVar;
    }

    public boolean z(long j11, p8.e eVar, List<? extends m> list) {
        if (this.f9960p != null) {
            return false;
        }
        return this.f9964t.q(j11, eVar, list);
    }
}
