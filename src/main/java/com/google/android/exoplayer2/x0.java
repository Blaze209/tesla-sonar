package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.x0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x0 implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x0 f41158i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f41159j = ts.p0.t0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f41160k = ts.p0.t0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f41161l = ts.p0.t0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f41162m = ts.p0.t0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f41163n = ts.p0.t0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f41164o = ts.p0.t0(5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<x0> f41165p = new com.google.android.exoplayer2.g.a() { // from class: br.u
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return x0.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f41167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f41168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f41169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f41170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f41171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f41172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f41173h;

    public static final class b implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f41174c = ts.p0.t0(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<b> f41175d = new com.google.android.exoplayer2.g.a() { // from class: br.v
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x0.b.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f41176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f41177b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f41178a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f41179b;

            public a(Uri uri) {
                this.f41178a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f41174c);
            ts.a.e(uri);
            return new a(uri).c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f41176a.equals(bVar.f41176a) && ts.p0.c(this.f41177b, bVar.f41177b);
        }

        public int hashCode() {
            int iHashCode = this.f41176a.hashCode() * 31;
            Object obj = this.f41177b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f41174c, this.f41176a);
            return bundle;
        }

        private b(a aVar) {
            this.f41176a = aVar.f41178a;
            this.f41177b = aVar.f41179b;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f41180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f41181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f41182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f41183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f41184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<ds.a> f41185f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f41186g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.collect.x<k> f41187h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b f41188i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f41189j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private y0 f41190k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f41191l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f41192m;

        public x0 a() {
            h hVar;
            ts.a.g(this.f41184e.f41232b == null || this.f41184e.f41231a != null);
            Uri uri = this.f41181b;
            if (uri != null) {
                hVar = new h(uri, this.f41182c, this.f41184e.f41231a != null ? this.f41184e.i() : null, this.f41188i, this.f41185f, this.f41186g, this.f41187h, this.f41189j);
            } else {
                hVar = null;
            }
            String str = this.f41180a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f41183d.g();
            g gVarF = this.f41191l.f();
            y0 y0Var = this.f41190k;
            if (y0Var == null) {
                y0Var = y0.I;
            }
            return new x0(str2, eVarG, hVar, gVarF, y0Var, this.f41192m);
        }

        public c b(g gVar) {
            this.f41191l = gVar.b();
            return this;
        }

        public c c(String str) {
            this.f41180a = (String) ts.a.e(str);
            return this;
        }

        public c d(List<k> list) {
            this.f41187h = com.google.common.collect.x.n(list);
            return this;
        }

        public c e(Object obj) {
            this.f41189j = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f41181b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f41183d = new d.a();
            this.f41184e = new f.a();
            this.f41185f = Collections.EMPTY_LIST;
            this.f41187h = com.google.common.collect.x.r();
            this.f41191l = new g.a();
            this.f41192m = i.f41273d;
        }

        private c(x0 x0Var) {
            f.a aVar;
            this();
            this.f41183d = x0Var.f41171f.b();
            this.f41180a = x0Var.f41166a;
            this.f41190k = x0Var.f41170e;
            this.f41191l = x0Var.f41169d.b();
            this.f41192m = x0Var.f41173h;
            h hVar = x0Var.f41167b;
            if (hVar != null) {
                this.f41186g = hVar.f41269f;
                this.f41182c = hVar.f41265b;
                this.f41181b = hVar.f41264a;
                this.f41185f = hVar.f41268e;
                this.f41187h = hVar.f41270g;
                this.f41189j = hVar.f41272i;
                f fVar = hVar.f41266c;
                if (fVar != null) {
                    aVar = fVar.c();
                } else {
                    aVar = new f.a();
                }
                this.f41184e = aVar;
                this.f41188i = hVar.f41267d;
            }
        }
    }

    public static class d implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f41193f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f41194g = ts.p0.t0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f41195h = ts.p0.t0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f41196i = ts.p0.t0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f41197j = ts.p0.t0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f41198k = ts.p0.t0(4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<e> f41199l = new com.google.android.exoplayer2.g.a() { // from class: br.w
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x0.d.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f41200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f41201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f41202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f41203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f41204e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f41205a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f41206b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f41207c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f41208d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f41209e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j11) {
                ts.a.a(j11 == Long.MIN_VALUE || j11 >= 0);
                this.f41206b = j11;
                return this;
            }

            public a i(boolean z11) {
                this.f41208d = z11;
                return this;
            }

            public a j(boolean z11) {
                this.f41207c = z11;
                return this;
            }

            public a k(long j11) {
                ts.a.a(j11 >= 0);
                this.f41205a = j11;
                return this;
            }

            public a l(boolean z11) {
                this.f41209e = z11;
                return this;
            }

            public a() {
                this.f41206b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f41205a = dVar.f41200a;
                this.f41206b = dVar.f41201b;
                this.f41207c = dVar.f41202c;
                this.f41208d = dVar.f41203d;
                this.f41209e = dVar.f41204e;
            }
        }

        public static /* synthetic */ e a(Bundle bundle) {
            a aVar = new a();
            String str = f41194g;
            d dVar = f41193f;
            return aVar.k(bundle.getLong(str, dVar.f41200a)).h(bundle.getLong(f41195h, dVar.f41201b)).j(bundle.getBoolean(f41196i, dVar.f41202c)).i(bundle.getBoolean(f41197j, dVar.f41203d)).l(bundle.getBoolean(f41198k, dVar.f41204e)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f41200a == dVar.f41200a && this.f41201b == dVar.f41201b && this.f41202c == dVar.f41202c && this.f41203d == dVar.f41203d && this.f41204e == dVar.f41204e;
        }

        public int hashCode() {
            long j11 = this.f41200a;
            int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
            long j12 = this.f41201b;
            return ((((((i11 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.f41202c ? 1 : 0)) * 31) + (this.f41203d ? 1 : 0)) * 31) + (this.f41204e ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j11 = this.f41200a;
            d dVar = f41193f;
            if (j11 != dVar.f41200a) {
                bundle.putLong(f41194g, j11);
            }
            long j12 = this.f41201b;
            if (j12 != dVar.f41201b) {
                bundle.putLong(f41195h, j12);
            }
            boolean z11 = this.f41202c;
            if (z11 != dVar.f41202c) {
                bundle.putBoolean(f41196i, z11);
            }
            boolean z12 = this.f41203d;
            if (z12 != dVar.f41203d) {
                bundle.putBoolean(f41197j, z12);
            }
            boolean z13 = this.f41204e;
            if (z13 != dVar.f41204e) {
                bundle.putBoolean(f41198k, z13);
            }
            return bundle;
        }

        private d(a aVar) {
            this.f41200a = aVar.f41205a;
            this.f41201b = aVar.f41206b;
            this.f41202c = aVar.f41207c;
            this.f41203d = aVar.f41208d;
            this.f41204e = aVar.f41209e;
        }
    }

    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final e f41210m = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f41211l = ts.p0.t0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f41212m = ts.p0.t0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f41213n = ts.p0.t0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f41214o = ts.p0.t0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f41215p = ts.p0.t0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f41216q = ts.p0.t0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f41217r = ts.p0.t0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f41218s = ts.p0.t0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<f> f41219t = new com.google.android.exoplayer2.g.a() { // from class: br.x
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x0.f.d(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f41220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f41221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f41222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.z<String, String> f41223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.z<String, String> f41224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f41225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f41226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f41227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.x<Integer> f41228i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.x<Integer> f41229j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f41230k;

        /* JADX INFO: Access modifiers changed from: private */
        public static f d(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) ts.a.e(bundle.getString(f41211l)));
            Uri uri = (Uri) bundle.getParcelable(f41212m);
            com.google.common.collect.z<String, String> zVarB = ts.c.b(ts.c.f(bundle, f41213n, Bundle.EMPTY));
            boolean z11 = bundle.getBoolean(f41214o, false);
            boolean z12 = bundle.getBoolean(f41215p, false);
            boolean z13 = bundle.getBoolean(f41216q, false);
            com.google.common.collect.x xVarN = com.google.common.collect.x.n(ts.c.g(bundle, f41217r, new ArrayList()));
            return new a(uuidFromString).n(uri).m(zVarB).o(z11).j(z13).p(z12).k(xVarN).l(bundle.getByteArray(f41218s)).i();
        }

        public a c() {
            return new a();
        }

        public byte[] e() {
            byte[] bArr = this.f41230k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f41220a.equals(fVar.f41220a) && ts.p0.c(this.f41222c, fVar.f41222c) && ts.p0.c(this.f41224e, fVar.f41224e) && this.f41225f == fVar.f41225f && this.f41227h == fVar.f41227h && this.f41226g == fVar.f41226g && this.f41229j.equals(fVar.f41229j) && Arrays.equals(this.f41230k, fVar.f41230k);
        }

        public int hashCode() {
            int iHashCode = this.f41220a.hashCode() * 31;
            Uri uri = this.f41222c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f41224e.hashCode()) * 31) + (this.f41225f ? 1 : 0)) * 31) + (this.f41227h ? 1 : 0)) * 31) + (this.f41226g ? 1 : 0)) * 31) + this.f41229j.hashCode()) * 31) + Arrays.hashCode(this.f41230k);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f41211l, this.f41220a.toString());
            Uri uri = this.f41222c;
            if (uri != null) {
                bundle.putParcelable(f41212m, uri);
            }
            if (!this.f41224e.isEmpty()) {
                bundle.putBundle(f41213n, ts.c.h(this.f41224e));
            }
            boolean z11 = this.f41225f;
            if (z11) {
                bundle.putBoolean(f41214o, z11);
            }
            boolean z12 = this.f41226g;
            if (z12) {
                bundle.putBoolean(f41215p, z12);
            }
            boolean z13 = this.f41227h;
            if (z13) {
                bundle.putBoolean(f41216q, z13);
            }
            if (!this.f41229j.isEmpty()) {
                bundle.putIntegerArrayList(f41217r, new ArrayList<>(this.f41229j));
            }
            byte[] bArr = this.f41230k;
            if (bArr != null) {
                bundle.putByteArray(f41218s, bArr);
            }
            return bundle;
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f41231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f41232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.z<String, String> f41233c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f41234d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f41235e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f41236f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.google.common.collect.x<Integer> f41237g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f41238h;

            public f i() {
                return new f(this);
            }

            public a j(boolean z11) {
                this.f41236f = z11;
                return this;
            }

            public a k(List<Integer> list) {
                this.f41237g = com.google.common.collect.x.n(list);
                return this;
            }

            public a l(byte[] bArr) {
                this.f41238h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a m(Map<String, String> map) {
                this.f41233c = com.google.common.collect.z.d(map);
                return this;
            }

            public a n(Uri uri) {
                this.f41232b = uri;
                return this;
            }

            public a o(boolean z11) {
                this.f41234d = z11;
                return this;
            }

            public a p(boolean z11) {
                this.f41235e = z11;
                return this;
            }

            public a(UUID uuid) {
                this.f41231a = uuid;
                this.f41233c = com.google.common.collect.z.m();
                this.f41237g = com.google.common.collect.x.r();
            }

            @Deprecated
            private a() {
                this.f41233c = com.google.common.collect.z.m();
                this.f41237g = com.google.common.collect.x.r();
            }

            private a(f fVar) {
                this.f41231a = fVar.f41220a;
                this.f41232b = fVar.f41222c;
                this.f41233c = fVar.f41224e;
                this.f41234d = fVar.f41225f;
                this.f41235e = fVar.f41226g;
                this.f41236f = fVar.f41227h;
                this.f41237g = fVar.f41229j;
                this.f41238h = fVar.f41230k;
            }
        }

        private f(a aVar) {
            ts.a.g((aVar.f41236f && aVar.f41232b == null) ? false : true);
            UUID uuid = (UUID) ts.a.e(aVar.f41231a);
            this.f41220a = uuid;
            this.f41221b = uuid;
            this.f41222c = aVar.f41232b;
            this.f41223d = aVar.f41233c;
            this.f41224e = aVar.f41233c;
            this.f41225f = aVar.f41234d;
            this.f41227h = aVar.f41236f;
            this.f41226g = aVar.f41235e;
            this.f41228i = aVar.f41237g;
            this.f41229j = aVar.f41237g;
            this.f41230k = aVar.f41238h != null ? Arrays.copyOf(aVar.f41238h, aVar.f41238h.length) : null;
        }
    }

    public static final class g implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f41239f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f41240g = ts.p0.t0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f41241h = ts.p0.t0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f41242i = ts.p0.t0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f41243j = ts.p0.t0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f41244k = ts.p0.t0(4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<g> f41245l = new com.google.android.exoplayer2.g.a() { // from class: br.y
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x0.g.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f41246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f41247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f41248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f41249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f41250e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f41251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f41252b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f41253c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f41254d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f41255e;

            public g f() {
                return new g(this);
            }

            public a g(long j11) {
                this.f41253c = j11;
                return this;
            }

            public a h(float f11) {
                this.f41255e = f11;
                return this;
            }

            public a i(long j11) {
                this.f41252b = j11;
                return this;
            }

            public a j(float f11) {
                this.f41254d = f11;
                return this;
            }

            public a k(long j11) {
                this.f41251a = j11;
                return this;
            }

            public a() {
                this.f41251a = -9223372036854775807L;
                this.f41252b = -9223372036854775807L;
                this.f41253c = -9223372036854775807L;
                this.f41254d = -3.4028235E38f;
                this.f41255e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f41251a = gVar.f41246a;
                this.f41252b = gVar.f41247b;
                this.f41253c = gVar.f41248c;
                this.f41254d = gVar.f41249d;
                this.f41255e = gVar.f41250e;
            }
        }

        public static /* synthetic */ g a(Bundle bundle) {
            String str = f41240g;
            g gVar = f41239f;
            return new g(bundle.getLong(str, gVar.f41246a), bundle.getLong(f41241h, gVar.f41247b), bundle.getLong(f41242i, gVar.f41248c), bundle.getFloat(f41243j, gVar.f41249d), bundle.getFloat(f41244k, gVar.f41250e));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f41246a == gVar.f41246a && this.f41247b == gVar.f41247b && this.f41248c == gVar.f41248c && this.f41249d == gVar.f41249d && this.f41250e == gVar.f41250e;
        }

        public int hashCode() {
            long j11 = this.f41246a;
            long j12 = this.f41247b;
            int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f41248c;
            int i12 = (i11 + ((int) ((j13 >>> 32) ^ j13))) * 31;
            float f11 = this.f41249d;
            int iFloatToIntBits = (i12 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f41250e;
            return iFloatToIntBits + (f12 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f12) : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j11 = this.f41246a;
            g gVar = f41239f;
            if (j11 != gVar.f41246a) {
                bundle.putLong(f41240g, j11);
            }
            long j12 = this.f41247b;
            if (j12 != gVar.f41247b) {
                bundle.putLong(f41241h, j12);
            }
            long j13 = this.f41248c;
            if (j13 != gVar.f41248c) {
                bundle.putLong(f41242i, j13);
            }
            float f11 = this.f41249d;
            if (f11 != gVar.f41249d) {
                bundle.putFloat(f41243j, f11);
            }
            float f12 = this.f41250e;
            if (f12 != gVar.f41250e) {
                bundle.putFloat(f41244k, f12);
            }
            return bundle;
        }

        private g(a aVar) {
            this(aVar.f41251a, aVar.f41252b, aVar.f41253c, aVar.f41254d, aVar.f41255e);
        }

        @Deprecated
        public g(long j11, long j12, long j13, float f11, float f12) {
            this.f41246a = j11;
            this.f41247b = j12;
            this.f41248c = j13;
            this.f41249d = f11;
            this.f41250e = f12;
        }
    }

    public static final class h implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f41256j = ts.p0.t0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f41257k = ts.p0.t0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f41258l = ts.p0.t0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f41259m = ts.p0.t0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f41260n = ts.p0.t0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f41261o = ts.p0.t0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f41262p = ts.p0.t0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<h> f41263q = new com.google.android.exoplayer2.g.a() { // from class: br.z
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x0.h.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f41264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f41266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f41267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<ds.a> f41268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f41269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.google.common.collect.x<k> f41270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<j> f41271h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f41272i;

        /* JADX INFO: Access modifiers changed from: private */
        public static h b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f41258l);
            f fVar = bundle2 == null ? null : (f) f.f41219t.a(bundle2);
            Bundle bundle3 = bundle.getBundle(f41259m);
            b bVar = bundle3 != null ? (b) b.f41175d.a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f41260n);
            com.google.common.collect.x xVarR = parcelableArrayList == null ? com.google.common.collect.x.r() : ts.c.d(new com.google.android.exoplayer2.g.a() { // from class: br.a0
                @Override // com.google.android.exoplayer2.g.a
                public final com.google.android.exoplayer2.g a(Bundle bundle4) {
                    return ds.a.b(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f41262p);
            return new h((Uri) ts.a.e((Uri) bundle.getParcelable(f41256j)), bundle.getString(f41257k), fVar, bVar, xVarR, bundle.getString(f41261o), parcelableArrayList2 == null ? com.google.common.collect.x.r() : ts.c.d(k.f41291o, parcelableArrayList2), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f41264a.equals(hVar.f41264a) && ts.p0.c(this.f41265b, hVar.f41265b) && ts.p0.c(this.f41266c, hVar.f41266c) && ts.p0.c(this.f41267d, hVar.f41267d) && this.f41268e.equals(hVar.f41268e) && ts.p0.c(this.f41269f, hVar.f41269f) && this.f41270g.equals(hVar.f41270g) && ts.p0.c(this.f41272i, hVar.f41272i);
        }

        public int hashCode() {
            int iHashCode = this.f41264a.hashCode() * 31;
            String str = this.f41265b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f41266c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f41267d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f41268e.hashCode()) * 31;
            String str2 = this.f41269f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f41270g.hashCode()) * 31;
            Object obj = this.f41272i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f41256j, this.f41264a);
            String str = this.f41265b;
            if (str != null) {
                bundle.putString(f41257k, str);
            }
            f fVar = this.f41266c;
            if (fVar != null) {
                bundle.putBundle(f41258l, fVar.toBundle());
            }
            b bVar = this.f41267d;
            if (bVar != null) {
                bundle.putBundle(f41259m, bVar.toBundle());
            }
            if (!this.f41268e.isEmpty()) {
                bundle.putParcelableArrayList(f41260n, ts.c.i(this.f41268e));
            }
            String str2 = this.f41269f;
            if (str2 != null) {
                bundle.putString(f41261o, str2);
            }
            if (!this.f41270g.isEmpty()) {
                bundle.putParcelableArrayList(f41262p, ts.c.i(this.f41270g));
            }
            return bundle;
        }

        private h(Uri uri, String str, f fVar, b bVar, List<ds.a> list, String str2, com.google.common.collect.x<k> xVar, Object obj) {
            this.f41264a = uri;
            this.f41265b = str;
            this.f41266c = fVar;
            this.f41267d = bVar;
            this.f41268e = list;
            this.f41269f = str2;
            this.f41270g = xVar;
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i11 = 0; i11 < xVar.size(); i11++) {
                aVarK.a(xVar.get(i11).b().j());
            }
            this.f41271h = aVarK.k();
            this.f41272i = obj;
        }
    }

    public static final class i implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f41273d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f41274e = ts.p0.t0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f41275f = ts.p0.t0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f41276g = ts.p0.t0(2);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<i> f41277h = new com.google.android.exoplayer2.g.a() { // from class: br.b0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return new x0.i.a().f((Uri) bundle.getParcelable(x0.i.f41274e)).g(bundle.getString(x0.i.f41275f)).e(bundle.getBundle(x0.i.f41276g)).d();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f41278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f41280c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f41281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f41282b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f41283c;

            public i d() {
                return new i(this);
            }

            public a e(Bundle bundle) {
                this.f41283c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f41281a = uri;
                return this;
            }

            public a g(String str) {
                this.f41282b = str;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return ts.p0.c(this.f41278a, iVar.f41278a) && ts.p0.c(this.f41279b, iVar.f41279b);
        }

        public int hashCode() {
            Uri uri = this.f41278a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f41279b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f41278a;
            if (uri != null) {
                bundle.putParcelable(f41274e, uri);
            }
            String str = this.f41279b;
            if (str != null) {
                bundle.putString(f41275f, str);
            }
            Bundle bundle2 = this.f41280c;
            if (bundle2 != null) {
                bundle.putBundle(f41276g, bundle2);
            }
            return bundle;
        }

        private i(a aVar) {
            this.f41278a = aVar.f41281a;
            this.f41279b = aVar.f41282b;
            this.f41280c = aVar.f41283c;
        }
    }

    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f41284h = ts.p0.t0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f41285i = ts.p0.t0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f41286j = ts.p0.t0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f41287k = ts.p0.t0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f41288l = ts.p0.t0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f41289m = ts.p0.t0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f41290n = ts.p0.t0(6);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a<k> f41291o = new com.google.android.exoplayer2.g.a() { // from class: br.c0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return x0.k.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f41292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f41294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f41297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f41298g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f41299a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f41300b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f41301c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f41302d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f41303e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f41304f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f41305g;

            /* JADX INFO: Access modifiers changed from: private */
            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.f41305g = str;
                return this;
            }

            public a l(String str) {
                this.f41304f = str;
                return this;
            }

            public a m(String str) {
                this.f41301c = str;
                return this;
            }

            public a n(String str) {
                this.f41300b = str;
                return this;
            }

            public a o(int i11) {
                this.f41303e = i11;
                return this;
            }

            public a p(int i11) {
                this.f41302d = i11;
                return this;
            }

            public a(Uri uri) {
                this.f41299a = uri;
            }

            private a(k kVar) {
                this.f41299a = kVar.f41292a;
                this.f41300b = kVar.f41293b;
                this.f41301c = kVar.f41294c;
                this.f41302d = kVar.f41295d;
                this.f41303e = kVar.f41296e;
                this.f41304f = kVar.f41297f;
                this.f41305g = kVar.f41298g;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static k c(Bundle bundle) {
            Uri uri = (Uri) ts.a.e((Uri) bundle.getParcelable(f41284h));
            String string = bundle.getString(f41285i);
            String string2 = bundle.getString(f41286j);
            int i11 = bundle.getInt(f41287k, 0);
            int i12 = bundle.getInt(f41288l, 0);
            String string3 = bundle.getString(f41289m);
            return new a(uri).n(string).m(string2).p(i11).o(i12).l(string3).k(bundle.getString(f41290n)).i();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f41292a.equals(kVar.f41292a) && ts.p0.c(this.f41293b, kVar.f41293b) && ts.p0.c(this.f41294c, kVar.f41294c) && this.f41295d == kVar.f41295d && this.f41296e == kVar.f41296e && ts.p0.c(this.f41297f, kVar.f41297f) && ts.p0.c(this.f41298g, kVar.f41298g);
        }

        public int hashCode() {
            int iHashCode = this.f41292a.hashCode() * 31;
            String str = this.f41293b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f41294c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f41295d) * 31) + this.f41296e) * 31;
            String str3 = this.f41297f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f41298g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f41284h, this.f41292a);
            String str = this.f41293b;
            if (str != null) {
                bundle.putString(f41285i, str);
            }
            String str2 = this.f41294c;
            if (str2 != null) {
                bundle.putString(f41286j, str2);
            }
            int i11 = this.f41295d;
            if (i11 != 0) {
                bundle.putInt(f41287k, i11);
            }
            int i12 = this.f41296e;
            if (i12 != 0) {
                bundle.putInt(f41288l, i12);
            }
            String str3 = this.f41297f;
            if (str3 != null) {
                bundle.putString(f41289m, str3);
            }
            String str4 = this.f41298g;
            if (str4 != null) {
                bundle.putString(f41290n, str4);
            }
            return bundle;
        }

        private k(a aVar) {
            this.f41292a = aVar.f41299a;
            this.f41293b = aVar.f41300b;
            this.f41294c = aVar.f41301c;
            this.f41295d = aVar.f41302d;
            this.f41296e = aVar.f41303e;
            this.f41297f = aVar.f41304f;
            this.f41298g = aVar.f41305g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x0 c(Bundle bundle) {
        String str = (String) ts.a.e(bundle.getString(f41159j, ""));
        Bundle bundle2 = bundle.getBundle(f41160k);
        g gVar = bundle2 == null ? g.f41239f : (g) g.f41245l.a(bundle2);
        Bundle bundle3 = bundle.getBundle(f41161l);
        y0 y0Var = bundle3 == null ? y0.I : (y0) y0.f41333q0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f41162m);
        e eVar = bundle4 == null ? e.f41210m : (e) d.f41199l.a(bundle4);
        Bundle bundle5 = bundle.getBundle(f41163n);
        i iVar = bundle5 == null ? i.f41273d : (i) i.f41277h.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f41164o);
        return new x0(str, eVar, bundle6 == null ? null : (h) h.f41263q.a(bundle6), gVar, y0Var, iVar);
    }

    public static x0 d(Uri uri) {
        return new c().f(uri).a();
    }

    public static x0 e(String str) {
        return new c().g(str).a();
    }

    private Bundle f(boolean z11) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f41166a.equals("")) {
            bundle.putString(f41159j, this.f41166a);
        }
        if (!this.f41169d.equals(g.f41239f)) {
            bundle.putBundle(f41160k, this.f41169d.toBundle());
        }
        if (!this.f41170e.equals(y0.I)) {
            bundle.putBundle(f41161l, this.f41170e.toBundle());
        }
        if (!this.f41171f.equals(d.f41193f)) {
            bundle.putBundle(f41162m, this.f41171f.toBundle());
        }
        if (!this.f41173h.equals(i.f41273d)) {
            bundle.putBundle(f41163n, this.f41173h.toBundle());
        }
        if (z11 && (hVar = this.f41167b) != null) {
            bundle.putBundle(f41164o, hVar.toBundle());
        }
        return bundle;
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return ts.p0.c(this.f41166a, x0Var.f41166a) && this.f41171f.equals(x0Var.f41171f) && ts.p0.c(this.f41167b, x0Var.f41167b) && ts.p0.c(this.f41169d, x0Var.f41169d) && ts.p0.c(this.f41170e, x0Var.f41170e) && ts.p0.c(this.f41173h, x0Var.f41173h);
    }

    public int hashCode() {
        int iHashCode = this.f41166a.hashCode() * 31;
        h hVar = this.f41167b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f41169d.hashCode()) * 31) + this.f41171f.hashCode()) * 31) + this.f41170e.hashCode()) * 31) + this.f41173h.hashCode();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        return f(false);
    }

    private x0(String str, e eVar, h hVar, g gVar, y0 y0Var, i iVar) {
        this.f41166a = str;
        this.f41167b = hVar;
        this.f41168c = hVar;
        this.f41169d = gVar;
        this.f41170e = y0Var;
        this.f41171f = eVar;
        this.f41172g = eVar;
        this.f41173h = iVar;
    }
}
