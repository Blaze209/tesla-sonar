package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.camera.core.impl.q2;
import com.google.common.collect.c0;
import com.google.common.collect.x;
import com.google.common.collect.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p7.m0;
import p7.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends g8.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f10157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f10160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f10163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<f> f10164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<d> f10165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<Uri, e> f10166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f10167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f10168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x<C0200c> f10169w;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.playlist.c$c, reason: collision with other inner class name */
    public static final class C0200c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f10175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f10176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f10178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f10179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f10180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<String> f10181h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f10182i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f10183j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f10184k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final x<String> f10185l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final x<String> f10186m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final x<b> f10187n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f10188o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f10189p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f10190q;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.playlist.c$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f10191a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Uri f10193c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Uri f10194d;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f10200j;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private Boolean f10205o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private String f10206p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private String f10207q;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map<String, b> f10192b = new HashMap();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private long f10195e = -9223372036854775807L;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private long f10196f = -9223372036854775807L;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f10197g = -9223372036854775807L;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private long f10198h = -9223372036854775807L;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<String> f10199i = new ArrayList();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private long f10201k = -9223372036854775807L;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private long f10202l = -9223372036854775807L;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<String> f10203m = new ArrayList();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<String> f10204n = new ArrayList();

            public a(String str) {
                this.f10191a = str;
            }

            public C0200c a() {
                Uri uri = this.f10194d;
                if ((uri != null || this.f10193c == null) && (uri == null || this.f10193c != null)) {
                    return null;
                }
                long j11 = this.f10195e;
                if (j11 == -9223372036854775807L) {
                    return null;
                }
                String str = this.f10191a;
                Uri uri2 = this.f10193c;
                long j12 = this.f10196f;
                long j13 = this.f10197g;
                long j14 = this.f10198h;
                List<String> list = this.f10199i;
                boolean z11 = this.f10200j;
                long j15 = this.f10201k;
                long j16 = this.f10202l;
                List<String> list2 = this.f10203m;
                List<String> list3 = this.f10204n;
                ArrayList arrayList = new ArrayList(this.f10192b.values());
                Boolean bool = this.f10205o;
                boolean z12 = bool == null || bool.booleanValue();
                String str2 = this.f10206p;
                if (str2 == null) {
                    str2 = "POINT";
                }
                String str3 = str2;
                String str4 = this.f10207q;
                if (str4 == null) {
                    str4 = "HIGHLIGHT";
                }
                return new C0200c(str, uri2, uri, j11, j12, j13, j14, list, z11, j15, j16, list2, list3, arrayList, z12, str3, str4);
            }

            public a b(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f10194d;
                if (uri2 != null) {
                    s7.a.b(uri2.equals(uri), "Can't change assetListUri from " + this.f10194d + " to " + uri);
                }
                this.f10194d = uri;
                return this;
            }

            public a c(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f10193c;
                if (uri2 != null) {
                    s7.a.b(uri2.equals(uri), "Can't change assetUri from " + this.f10193c + " to " + uri);
                }
                this.f10193c = uri;
                return this;
            }

            public a d(List<b> list) {
                if (!list.isEmpty()) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        b bVar = list.get(i11);
                        String str = bVar.f10170a;
                        b bVar2 = this.f10192b.get(str);
                        if (bVar2 != null) {
                            s7.a.b(bVar2.equals(bVar), "Can't change " + str + " from " + bVar2.f10173d + " " + bVar2.f10172c + " to " + bVar.f10173d + " " + bVar.f10172c);
                        }
                        this.f10192b.put(str, bVar);
                    }
                }
                return this;
            }

            public a e(Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.f10205o;
                if (bool2 != null) {
                    s7.a.b(bool2.equals(bool), "Can't change contentMayVary from " + this.f10205o + " to " + bool);
                }
                this.f10205o = bool;
                return this;
            }

            public a f(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f10199i.isEmpty()) {
                    s7.a.b(this.f10199i.equals(list), "Can't change cue from " + q2.a(", ", this.f10199i) + " to " + q2.a(", ", list));
                }
                this.f10199i = list;
                return this;
            }

            public a g(long j11) {
                if (j11 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f10197g;
                if (j12 != -9223372036854775807L) {
                    s7.a.b(j12 == j11, "Can't change durationUs from " + this.f10197g + " to " + j11);
                }
                this.f10197g = j11;
                return this;
            }

            public a h(long j11) {
                if (j11 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f10196f;
                if (j12 != -9223372036854775807L) {
                    s7.a.b(j12 == j11, "Can't change endDateUnixUs from " + this.f10196f + " to " + j11);
                }
                this.f10196f = j11;
                return this;
            }

            public a i(boolean z11) {
                if (!z11) {
                    return this;
                }
                this.f10200j = true;
                return this;
            }

            public a j(long j11) {
                if (j11 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f10198h;
                if (j12 != -9223372036854775807L) {
                    s7.a.b(j12 == j11, "Can't change plannedDurationUs from " + this.f10198h + " to " + j11);
                }
                this.f10198h = j11;
                return this;
            }

            public a k(long j11) {
                if (j11 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f10202l;
                if (j12 != -9223372036854775807L) {
                    s7.a.b(j12 == j11, "Can't change playoutLimitUs from " + this.f10202l + " to " + j11);
                }
                this.f10202l = j11;
                return this;
            }

            public a l(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f10204n.isEmpty()) {
                    s7.a.b(this.f10204n.equals(list), "Can't change restrictions from " + q2.a(", ", this.f10204n) + " to " + q2.a(", ", list));
                }
                this.f10204n = list;
                return this;
            }

            public a m(long j11) {
                if (j11 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f10201k;
                if (j12 != -9223372036854775807L) {
                    s7.a.b(j12 == j11, "Can't change resumeOffsetUs from " + this.f10201k + " to " + j11);
                }
                this.f10201k = j11;
                return this;
            }

            public a n(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f10203m.isEmpty()) {
                    s7.a.b(this.f10203m.equals(list), "Can't change snapTypes from " + q2.a(", ", this.f10203m) + " to " + q2.a(", ", list));
                }
                this.f10203m = list;
                return this;
            }

            public a o(long j11) {
                if (j11 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f10195e;
                if (j12 != -9223372036854775807L) {
                    s7.a.b(j12 == j11, "Can't change startDateUnixUs from " + this.f10195e + " to " + j11);
                }
                this.f10195e = j11;
                return this;
            }

            public a p(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f10206p;
                if (str2 != null) {
                    s7.a.b(str2.equals(str), "Can't change timelineOccupies from " + this.f10206p + " to " + str);
                }
                this.f10206p = str;
                return this;
            }

            public a q(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f10207q;
                if (str2 != null) {
                    s7.a.b(str2.equals(str), "Can't change timelineStyle from " + this.f10207q + " to " + str);
                }
                this.f10207q = str;
                return this;
            }
        }

        public C0200c(String str, Uri uri, Uri uri2, long j11, long j12, long j13, long j14, List<String> list, boolean z11, long j15, long j16, List<String> list2, List<String> list3, List<b> list4, boolean z12, String str2, String str3) {
            s7.a.a((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f10174a = str;
            this.f10175b = uri;
            this.f10176c = uri2;
            this.f10177d = j11;
            this.f10178e = j12;
            this.f10179f = j13;
            this.f10180g = j14;
            this.f10181h = list;
            this.f10182i = z11;
            this.f10183j = j15;
            this.f10184k = j16;
            this.f10185l = x.n(list2);
            this.f10186m = x.n(list3);
            this.f10187n = x.y(new Comparator() { // from class: g8.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((androidx.media3.exoplayer.hls.playlist.c.b) obj).f10170a.compareTo(((androidx.media3.exoplayer.hls.playlist.c.b) obj2).f10170a);
                }
            }, list4);
            this.f10188o = z12;
            this.f10189p = str2;
            this.f10190q = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0200c)) {
                return false;
            }
            C0200c c0200c = (C0200c) obj;
            return this.f10177d == c0200c.f10177d && this.f10178e == c0200c.f10178e && this.f10179f == c0200c.f10179f && this.f10180g == c0200c.f10180g && this.f10182i == c0200c.f10182i && this.f10183j == c0200c.f10183j && this.f10184k == c0200c.f10184k && this.f10188o == c0200c.f10188o && Objects.equals(this.f10174a, c0200c.f10174a) && Objects.equals(this.f10175b, c0200c.f10175b) && Objects.equals(this.f10176c, c0200c.f10176c) && Objects.equals(this.f10181h, c0200c.f10181h) && Objects.equals(this.f10185l, c0200c.f10185l) && Objects.equals(this.f10186m, c0200c.f10186m) && Objects.equals(this.f10187n, c0200c.f10187n) && Objects.equals(this.f10189p, c0200c.f10189p) && Objects.equals(this.f10190q, c0200c.f10190q);
        }

        public int hashCode() {
            return Objects.hash(this.f10174a, this.f10175b, this.f10176c, Long.valueOf(this.f10177d), Long.valueOf(this.f10178e), Long.valueOf(this.f10179f), Long.valueOf(this.f10180g), this.f10181h, Boolean.valueOf(this.f10182i), Long.valueOf(this.f10183j), Long.valueOf(this.f10184k), this.f10185l, this.f10186m, this.f10187n, Boolean.valueOf(this.f10188o), this.f10189p, this.f10190q);
        }
    }

    public static final class d extends g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f10208l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f10209m;

        public d(String str, f fVar, long j11, int i11, long j12, n nVar, String str2, String str3, long j13, long j14, boolean z11, boolean z12, boolean z13) {
            super(str, fVar, j11, i11, j12, nVar, str2, str3, j13, j14, z11);
            this.f10208l = z12;
            this.f10209m = z13;
        }

        public d b(long j11, int i11) {
            return new d(this.f10215a, this.f10216b, this.f10217c, i11, j11, this.f10220f, this.f10221g, this.f10222h, this.f10223i, this.f10224j, this.f10225k, this.f10208l, this.f10209m);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10212c;

        public e(Uri uri, long j11, int i11) {
            this.f10210a = uri;
            this.f10211b = j11;
            this.f10212c = i11;
        }
    }

    public static class g implements Comparable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f10216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f10219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n f10220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f10221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f10222h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f10223i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f10224j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f10225k;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l11) {
            if (this.f10219e > l11.longValue()) {
                return 1;
            }
            return this.f10219e < l11.longValue() ? -1 : 0;
        }

        private g(String str, f fVar, long j11, int i11, long j12, n nVar, String str2, String str3, long j13, long j14, boolean z11) {
            this.f10215a = str;
            this.f10216b = fVar;
            this.f10217c = j11;
            this.f10218d = i11;
            this.f10219e = j12;
            this.f10220f = nVar;
            this.f10221g = str2;
            this.f10222h = str3;
            this.f10223i = j13;
            this.f10224j = j14;
            this.f10225k = z11;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f10230e;

        public h(long j11, boolean z11, long j12, long j13, boolean z12) {
            this.f10226a = j11;
            this.f10227b = z11;
            this.f10228c = j12;
            this.f10229d = j13;
            this.f10230e = z12;
        }
    }

    public c(int i11, String str, List<String> list, long j11, boolean z11, long j12, boolean z12, int i12, long j13, int i13, long j14, long j15, boolean z13, boolean z14, boolean z15, n nVar, List<f> list2, List<d> list3, h hVar, Map<Uri, e> map, List<C0200c> list4) {
        super(str, list, z13);
        this.f10150d = i11;
        this.f10154h = j12;
        this.f10153g = z11;
        this.f10155i = z12;
        this.f10156j = i12;
        this.f10157k = j13;
        this.f10158l = i13;
        this.f10159m = j14;
        this.f10160n = j15;
        this.f10161o = z14;
        this.f10162p = z15;
        this.f10163q = nVar;
        this.f10164r = x.n(list2);
        this.f10165s = x.n(list3);
        this.f10166t = z.d(map);
        this.f10169w = x.n(list4);
        if (!list3.isEmpty()) {
            d dVar = (d) c0.d(list3);
            this.f10167u = dVar.f10219e + dVar.f10217c;
        } else if (list2.isEmpty()) {
            this.f10167u = 0L;
        } else {
            f fVar = (f) c0.d(list2);
            this.f10167u = fVar.f10219e + fVar.f10217c;
        }
        this.f10151e = j11 != -9223372036854775807L ? j11 >= 0 ? Math.min(this.f10167u, j11) : Math.max(0L, this.f10167u + j11) : -9223372036854775807L;
        this.f10152f = j11 >= 0;
        this.f10168v = hVar;
    }

    @Override // l8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(List<m0> list) {
        return this;
    }

    public c c(long j11, int i11) {
        return new c(this.f10150d, this.f67468a, this.f67469b, this.f10151e, this.f10153g, j11, true, i11, this.f10157k, this.f10158l, this.f10159m, this.f10160n, this.f67470c, this.f10161o, this.f10162p, this.f10163q, this.f10164r, this.f10165s, this.f10168v, this.f10166t, this.f10169w);
    }

    public c d() {
        return this.f10161o ? this : new c(this.f10150d, this.f67468a, this.f67469b, this.f10151e, this.f10153g, this.f10154h, this.f10155i, this.f10156j, this.f10157k, this.f10158l, this.f10159m, this.f10160n, this.f67470c, true, this.f10162p, this.f10163q, this.f10164r, this.f10165s, this.f10168v, this.f10166t, this.f10169w);
    }

    public long e() {
        return this.f10154h + this.f10167u;
    }

    public boolean f(c cVar) {
        if (cVar != null) {
            long j11 = this.f10157k;
            long j12 = cVar.f10157k;
            if (j11 <= j12) {
                if (j11 < j12) {
                    return false;
                }
                int size = this.f10164r.size() - cVar.f10164r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f10165s.size();
                int size3 = cVar.f10165s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f10161o || cVar.f10161o)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final class f extends g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f10213l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List<d> f10214m;

        public f(String str, long j11, long j12, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j11, j12, false, x.r());
        }

        public f b(long j11, int i11) {
            ArrayList arrayList = new ArrayList();
            long j12 = j11;
            for (int i12 = 0; i12 < this.f10214m.size(); i12++) {
                d dVar = this.f10214m.get(i12);
                arrayList.add(dVar.b(j12, i11));
                j12 += dVar.f10217c;
            }
            return new f(this.f10215a, this.f10216b, this.f10213l, this.f10217c, i11, j11, this.f10220f, this.f10221g, this.f10222h, this.f10223i, this.f10224j, this.f10225k, arrayList);
        }

        public f(String str, f fVar, String str2, long j11, int i11, long j12, n nVar, String str3, String str4, long j13, long j14, boolean z11, List<d> list) {
            super(str, fVar, j11, i11, j12, nVar, str3, str4, j13, j14, z11);
            this.f10213l = str2;
            this.f10214m = x.n(list);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f10172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10173d;

        public b(String str, double d11) {
            this.f10170a = str;
            this.f10171b = 2;
            this.f10172c = d11;
            this.f10173d = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10171b == bVar.f10171b && Double.compare(this.f10172c, bVar.f10172c) == 0 && Objects.equals(this.f10170a, bVar.f10170a) && Objects.equals(this.f10173d, bVar.f10173d);
        }

        public int hashCode() {
            return Objects.hash(this.f10170a, Integer.valueOf(this.f10171b), Double.valueOf(this.f10172c), this.f10173d);
        }

        public b(String str, String str2, int i11) {
            boolean z11 = true;
            if (i11 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z11 = false;
            }
            s7.a.h(z11);
            this.f10170a = str;
            this.f10171b = i11;
            this.f10173d = str2;
            this.f10172c = 0.0d;
        }
    }
}
