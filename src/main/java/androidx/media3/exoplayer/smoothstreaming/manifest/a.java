package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p7.m0;
import q9.u;
import s7.k0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class a implements l8.a<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0203a f10766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f10767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10769h;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    public static class C0203a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f10770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f10771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u[] f10772c;

        public C0203a(UUID uuid, byte[] bArr, u[] uVarArr) {
            this.f10770a = uuid;
            this.f10771b = bArr;
            this.f10772c = uVarArr;
        }
    }

    public a(int i11, int i12, long j11, long j12, long j13, int i13, boolean z11, C0203a c0203a, b[] bVarArr) {
        this(i11, i12, j12 == 0 ? -9223372036854775807L : q0.s1(j12, 1000000L, j11), j13 != 0 ? q0.s1(j13, 1000000L, j11) : -9223372036854775807L, i13, z11, c0203a, bVarArr);
    }

    @Override // l8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<m0> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            m0 m0Var = (m0) arrayList.get(i11);
            b bVar2 = this.f10767f[m0Var.f101428b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((p7.u[]) arrayList3.toArray(new p7.u[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f10782j[m0Var.f101429c]);
            i11++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((p7.u[]) arrayList3.toArray(new p7.u[0])));
        }
        return new a(this.f10762a, this.f10763b, this.f10768g, this.f10769h, this.f10764c, this.f10765d, this.f10766e, (b[]) arrayList2.toArray(new b[0]));
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f10779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f10780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f10781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p7.u[] f10782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f10783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f10784l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f10785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List<Long> f10786n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long[] f10787o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long f10788p;

        public b(String str, String str2, int i11, String str3, long j11, String str4, int i12, int i13, int i14, int i15, String str5, p7.u[] uVarArr, List<Long> list, long j12) {
            this(str, str2, i11, str3, j11, str4, i12, i13, i14, i15, str5, uVarArr, list, q0.t1(list, 1000000L, j11), q0.s1(j12, 1000000L, j11));
        }

        public Uri a(int i11, int i12) {
            s7.a.h(this.f10782j != null);
            s7.a.h(this.f10786n != null);
            s7.a.h(i12 < this.f10786n.size());
            String string = Integer.toString(this.f10782j[i11].f101539j);
            String string2 = this.f10786n.get(i12).toString();
            return k0.g(this.f10784l, this.f10785m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(p7.u[] uVarArr) {
            return new b(this.f10784l, this.f10785m, this.f10773a, this.f10774b, this.f10775c, this.f10776d, this.f10777e, this.f10778f, this.f10779g, this.f10780h, this.f10781i, uVarArr, this.f10786n, this.f10787o, this.f10788p);
        }

        public long c(int i11) {
            if (i11 == this.f10783k - 1) {
                return this.f10788p;
            }
            long[] jArr = this.f10787o;
            return jArr[i11 + 1] - jArr[i11];
        }

        public int d(long j11) {
            return q0.k(this.f10787o, j11, true, true);
        }

        public long e(int i11) {
            return this.f10787o[i11];
        }

        private b(String str, String str2, int i11, String str3, long j11, String str4, int i12, int i13, int i14, int i15, String str5, p7.u[] uVarArr, List<Long> list, long[] jArr, long j12) {
            this.f10784l = str;
            this.f10785m = str2;
            this.f10773a = i11;
            this.f10774b = str3;
            this.f10775c = j11;
            this.f10776d = str4;
            this.f10777e = i12;
            this.f10778f = i13;
            this.f10779g = i14;
            this.f10780h = i15;
            this.f10781i = str5;
            this.f10782j = uVarArr;
            this.f10786n = list;
            this.f10787o = jArr;
            this.f10788p = j12;
            this.f10783k = list.size();
        }
    }

    private a(int i11, int i12, long j11, long j12, int i13, boolean z11, C0203a c0203a, b[] bVarArr) {
        this.f10762a = i11;
        this.f10763b = i12;
        this.f10768g = j11;
        this.f10769h = j12;
        this.f10764c = i13;
        this.f10765d = z11;
        this.f10766e = c0203a;
        this.f10767f = bVarArr;
    }
}
