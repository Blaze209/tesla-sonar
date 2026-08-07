package p7;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f101674i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f101675j = s7.q0.N0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f101676k = s7.q0.N0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f101677l = s7.q0.N0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f101678m = s7.q0.N0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f101679n = s7.q0.N0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f101680o = s7.q0.N0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f101682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f101683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f101684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f101685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f101686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f101687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f101688h;

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f101689c = s7.q0.N0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f101690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f101691b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f101692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f101693b;

            public a(Uri uri) {
                this.f101692a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        public static b a(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f101689c);
            s7.a.f(uri);
            return new a(uri).c();
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f101689c, this.f101690a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f101690a.equals(bVar.f101690a) && Objects.equals(this.f101691b, bVar.f101691b);
        }

        public int hashCode() {
            int iHashCode = this.f101690a.hashCode() * 31;
            Object obj = this.f101691b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(a aVar) {
            this.f101690a = aVar.f101692a;
            this.f101691b = aVar.f101693b;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f101694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f101695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f101696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f101697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f101698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<m0> f101699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f101700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.collect.x<k> f101701h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b f101702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f101703j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f101704k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private e0 f101705l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private g.a f101706m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private i f101707n;

        public y a() {
            h hVar;
            s7.a.h(this.f101698e.f101752b == null || this.f101698e.f101751a != null);
            Uri uri = this.f101695b;
            if (uri != null) {
                hVar = new h(uri, this.f101696c, this.f101698e.f101751a != null ? this.f101698e.i() : null, this.f101702i, this.f101699f, this.f101700g, this.f101701h, this.f101703j, this.f101704k);
            } else {
                hVar = null;
            }
            String str = this.f101694a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f101697d.h();
            g gVarF = this.f101706m.f();
            e0 e0Var = this.f101705l;
            if (e0Var == null) {
                e0Var = e0.K;
            }
            return new y(str2, eVarH, hVar, gVarF, e0Var, this.f101707n);
        }

        public c b(g gVar) {
            this.f101706m = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f101694a = (String) s7.a.f(str);
            return this;
        }

        public c d(e0 e0Var) {
            this.f101705l = e0Var;
            return this;
        }

        public c e(i iVar) {
            this.f101707n = iVar;
            return this;
        }

        public c f(List<m0> list) {
            this.f101699f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c g(List<k> list) {
            this.f101701h = com.google.common.collect.x.n(list);
            return this;
        }

        public c h(Object obj) {
            this.f101703j = obj;
            return this;
        }

        public c i(Uri uri) {
            this.f101695b = uri;
            return this;
        }

        public c j(String str) {
            return i(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f101697d = new d.a();
            this.f101698e = new f.a();
            this.f101699f = Collections.EMPTY_LIST;
            this.f101701h = com.google.common.collect.x.r();
            this.f101706m = new g.a();
            this.f101707n = i.f101793d;
            this.f101704k = -9223372036854775807L;
        }

        private c(y yVar) {
            f.a aVar;
            this();
            this.f101697d = yVar.f101686f.a();
            this.f101694a = yVar.f101681a;
            this.f101705l = yVar.f101685e;
            this.f101706m = yVar.f101684d.a();
            this.f101707n = yVar.f101688h;
            h hVar = yVar.f101682b;
            if (hVar != null) {
                this.f101700g = hVar.f101788f;
                this.f101696c = hVar.f101784b;
                this.f101695b = hVar.f101783a;
                this.f101699f = hVar.f101787e;
                this.f101701h = hVar.f101789g;
                this.f101703j = hVar.f101791i;
                f fVar = hVar.f101785c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f101698e = aVar;
                this.f101702i = hVar.f101786d;
                this.f101704k = hVar.f101792j;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f101708i = new a().g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f101709j = s7.q0.N0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f101710k = s7.q0.N0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101711l = s7.q0.N0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f101712m = s7.q0.N0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f101713n = s7.q0.N0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f101714o = s7.q0.N0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f101715p = s7.q0.N0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f101716q = s7.q0.N0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f101717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f101718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f101719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f101720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f101721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f101722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f101723g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f101724h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f101725a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f101726b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f101727c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f101728d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f101729e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f101730f;

            public d g() {
                return new d(this);
            }

            @Deprecated
            public e h() {
                return new e(this);
            }

            public a i(boolean z11) {
                this.f101730f = z11;
                return this;
            }

            public a j(long j11) {
                return k(s7.q0.b1(j11));
            }

            public a k(long j11) {
                s7.a.a(j11 == Long.MIN_VALUE || j11 >= 0);
                this.f101726b = j11;
                return this;
            }

            public a l(boolean z11) {
                this.f101728d = z11;
                return this;
            }

            public a m(boolean z11) {
                this.f101727c = z11;
                return this;
            }

            public a n(long j11) {
                return o(s7.q0.b1(j11));
            }

            public a o(long j11) {
                s7.a.a(j11 >= 0);
                this.f101725a = j11;
                return this;
            }

            public a p(boolean z11) {
                this.f101729e = z11;
                return this;
            }

            public a() {
                this.f101726b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f101725a = dVar.f101718b;
                this.f101726b = dVar.f101720d;
                this.f101727c = dVar.f101721e;
                this.f101728d = dVar.f101722f;
                this.f101729e = dVar.f101723g;
                this.f101730f = dVar.f101724h;
            }
        }

        public static e b(Bundle bundle) {
            a aVar = new a();
            String str = f101709j;
            d dVar = f101708i;
            a aVarI = aVar.n(bundle.getLong(str, dVar.f101717a)).j(bundle.getLong(f101710k, dVar.f101719c)).m(bundle.getBoolean(f101711l, dVar.f101721e)).l(bundle.getBoolean(f101712m, dVar.f101722f)).p(bundle.getBoolean(f101713n, dVar.f101723g)).i(bundle.getBoolean(f101716q, dVar.f101724h));
            long j11 = bundle.getLong(f101714o, dVar.f101718b);
            if (j11 != dVar.f101718b) {
                aVarI.o(j11);
            }
            long j12 = bundle.getLong(f101715p, dVar.f101720d);
            if (j12 != dVar.f101720d) {
                aVarI.k(j12);
            }
            return aVarI.h();
        }

        public a a() {
            return new a();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            long j11 = this.f101717a;
            d dVar = f101708i;
            if (j11 != dVar.f101717a) {
                bundle.putLong(f101709j, j11);
            }
            long j12 = this.f101719c;
            if (j12 != dVar.f101719c) {
                bundle.putLong(f101710k, j12);
            }
            long j13 = this.f101718b;
            if (j13 != dVar.f101718b) {
                bundle.putLong(f101714o, j13);
            }
            long j14 = this.f101720d;
            if (j14 != dVar.f101720d) {
                bundle.putLong(f101715p, j14);
            }
            boolean z11 = this.f101721e;
            if (z11 != dVar.f101721e) {
                bundle.putBoolean(f101711l, z11);
            }
            boolean z12 = this.f101722f;
            if (z12 != dVar.f101722f) {
                bundle.putBoolean(f101712m, z12);
            }
            boolean z13 = this.f101723g;
            if (z13 != dVar.f101723g) {
                bundle.putBoolean(f101713n, z13);
            }
            boolean z14 = this.f101724h;
            if (z14 != dVar.f101724h) {
                bundle.putBoolean(f101716q, z14);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f101718b == dVar.f101718b && this.f101720d == dVar.f101720d && this.f101721e == dVar.f101721e && this.f101722f == dVar.f101722f && this.f101723g == dVar.f101723g && this.f101724h == dVar.f101724h;
        }

        public int hashCode() {
            long j11 = this.f101718b;
            int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
            long j12 = this.f101720d;
            return ((((((((i11 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.f101721e ? 1 : 0)) * 31) + (this.f101722f ? 1 : 0)) * 31) + (this.f101723g ? 1 : 0)) * 31) + (this.f101724h ? 1 : 0);
        }

        private d(a aVar) {
            this.f101717a = s7.q0.O1(aVar.f101725a);
            this.f101719c = s7.q0.O1(aVar.f101726b);
            this.f101718b = aVar.f101725a;
            this.f101720d = aVar.f101726b;
            this.f101721e = aVar.f101727c;
            this.f101722f = aVar.f101728d;
            this.f101723g = aVar.f101729e;
            this.f101724h = aVar.f101730f;
        }
    }

    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f101731r = new d.a().h();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101732l = s7.q0.N0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f101733m = s7.q0.N0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f101734n = s7.q0.N0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f101735o = s7.q0.N0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f101736p = s7.q0.N0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f101737q = s7.q0.N0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f101738r = s7.q0.N0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f101739s = s7.q0.N0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f101740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f101741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f101742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.z<String, String> f101743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.z<String, String> f101744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f101745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f101746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f101747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.x<Integer> f101748i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.x<Integer> f101749j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f101750k;

        public static f c(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) s7.a.f(bundle.getString(f101732l)));
            Uri uri = (Uri) bundle.getParcelable(f101733m);
            com.google.common.collect.z<String, String> zVarB = s7.i.b(s7.i.e(bundle, f101734n, Bundle.EMPTY));
            boolean z11 = bundle.getBoolean(f101735o, false);
            boolean z12 = bundle.getBoolean(f101736p, false);
            boolean z13 = bundle.getBoolean(f101737q, false);
            com.google.common.collect.x xVarN = com.google.common.collect.x.n(s7.i.f(bundle, f101738r, new ArrayList()));
            return new a(uuidFromString).n(uri).m(zVarB).o(z11).j(z13).p(z12).k(xVarN).l(bundle.getByteArray(f101739s)).i();
        }

        public a b() {
            return new a();
        }

        public byte[] d() {
            byte[] bArr = this.f101750k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(f101732l, this.f101740a.toString());
            Uri uri = this.f101742c;
            if (uri != null) {
                bundle.putParcelable(f101733m, uri);
            }
            if (!this.f101744e.isEmpty()) {
                bundle.putBundle(f101734n, s7.i.g(this.f101744e));
            }
            boolean z11 = this.f101745f;
            if (z11) {
                bundle.putBoolean(f101735o, z11);
            }
            boolean z12 = this.f101746g;
            if (z12) {
                bundle.putBoolean(f101736p, z12);
            }
            boolean z13 = this.f101747h;
            if (z13) {
                bundle.putBoolean(f101737q, z13);
            }
            if (!this.f101749j.isEmpty()) {
                bundle.putIntegerArrayList(f101738r, new ArrayList<>(this.f101749j));
            }
            byte[] bArr = this.f101750k;
            if (bArr != null) {
                bundle.putByteArray(f101739s, bArr);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f101740a.equals(fVar.f101740a) && Objects.equals(this.f101742c, fVar.f101742c) && Objects.equals(this.f101744e, fVar.f101744e) && this.f101745f == fVar.f101745f && this.f101747h == fVar.f101747h && this.f101746g == fVar.f101746g && this.f101749j.equals(fVar.f101749j) && Arrays.equals(this.f101750k, fVar.f101750k);
        }

        public int hashCode() {
            int iHashCode = this.f101740a.hashCode() * 31;
            Uri uri = this.f101742c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f101744e.hashCode()) * 31) + (this.f101745f ? 1 : 0)) * 31) + (this.f101747h ? 1 : 0)) * 31) + (this.f101746g ? 1 : 0)) * 31) + this.f101749j.hashCode()) * 31) + Arrays.hashCode(this.f101750k);
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f101751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f101752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.z<String, String> f101753c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f101754d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f101755e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f101756f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.google.common.collect.x<Integer> f101757g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f101758h;

            public f i() {
                return new f(this);
            }

            public a j(boolean z11) {
                this.f101756f = z11;
                return this;
            }

            public a k(List<Integer> list) {
                this.f101757g = com.google.common.collect.x.n(list);
                return this;
            }

            public a l(byte[] bArr) {
                this.f101758h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a m(Map<String, String> map) {
                this.f101753c = com.google.common.collect.z.d(map);
                return this;
            }

            public a n(Uri uri) {
                this.f101752b = uri;
                return this;
            }

            public a o(boolean z11) {
                this.f101754d = z11;
                return this;
            }

            public a p(boolean z11) {
                this.f101755e = z11;
                return this;
            }

            public a(UUID uuid) {
                this();
                this.f101751a = uuid;
            }

            @Deprecated
            private a() {
                this.f101753c = com.google.common.collect.z.m();
                this.f101755e = true;
                this.f101757g = com.google.common.collect.x.r();
            }

            private a(f fVar) {
                this.f101751a = fVar.f101740a;
                this.f101752b = fVar.f101742c;
                this.f101753c = fVar.f101744e;
                this.f101754d = fVar.f101745f;
                this.f101755e = fVar.f101746g;
                this.f101756f = fVar.f101747h;
                this.f101757g = fVar.f101749j;
                this.f101758h = fVar.f101750k;
            }
        }

        private f(a aVar) {
            s7.a.h((aVar.f101756f && aVar.f101752b == null) ? false : true);
            UUID uuid = (UUID) s7.a.f(aVar.f101751a);
            this.f101740a = uuid;
            this.f101741b = uuid;
            this.f101742c = aVar.f101752b;
            this.f101743d = aVar.f101753c;
            this.f101744e = aVar.f101753c;
            this.f101745f = aVar.f101754d;
            this.f101747h = aVar.f101756f;
            this.f101746g = aVar.f101755e;
            this.f101748i = aVar.f101757g;
            this.f101749j = aVar.f101757g;
            this.f101750k = aVar.f101758h != null ? Arrays.copyOf(aVar.f101758h, aVar.f101758h.length) : null;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f101759f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f101760g = s7.q0.N0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f101761h = s7.q0.N0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f101762i = s7.q0.N0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f101763j = s7.q0.N0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f101764k = s7.q0.N0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f101765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f101766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f101767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101769e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f101770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f101771b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f101772c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f101773d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f101774e;

            public g f() {
                return new g(this);
            }

            public a g(long j11) {
                this.f101772c = j11;
                return this;
            }

            public a h(float f11) {
                this.f101774e = f11;
                return this;
            }

            public a i(long j11) {
                this.f101771b = j11;
                return this;
            }

            public a j(float f11) {
                this.f101773d = f11;
                return this;
            }

            public a k(long j11) {
                this.f101770a = j11;
                return this;
            }

            public a() {
                this.f101770a = -9223372036854775807L;
                this.f101771b = -9223372036854775807L;
                this.f101772c = -9223372036854775807L;
                this.f101773d = -3.4028235E38f;
                this.f101774e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f101770a = gVar.f101765a;
                this.f101771b = gVar.f101766b;
                this.f101772c = gVar.f101767c;
                this.f101773d = gVar.f101768d;
                this.f101774e = gVar.f101769e;
            }
        }

        public static g b(Bundle bundle) {
            a aVar = new a();
            String str = f101760g;
            g gVar = f101759f;
            return aVar.k(bundle.getLong(str, gVar.f101765a)).i(bundle.getLong(f101761h, gVar.f101766b)).g(bundle.getLong(f101762i, gVar.f101767c)).j(bundle.getFloat(f101763j, gVar.f101768d)).h(bundle.getFloat(f101764k, gVar.f101769e)).f();
        }

        public a a() {
            return new a();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            long j11 = this.f101765a;
            g gVar = f101759f;
            if (j11 != gVar.f101765a) {
                bundle.putLong(f101760g, j11);
            }
            long j12 = this.f101766b;
            if (j12 != gVar.f101766b) {
                bundle.putLong(f101761h, j12);
            }
            long j13 = this.f101767c;
            if (j13 != gVar.f101767c) {
                bundle.putLong(f101762i, j13);
            }
            float f11 = this.f101768d;
            if (f11 != gVar.f101768d) {
                bundle.putFloat(f101763j, f11);
            }
            float f12 = this.f101769e;
            if (f12 != gVar.f101769e) {
                bundle.putFloat(f101764k, f12);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f101765a == gVar.f101765a && this.f101766b == gVar.f101766b && this.f101767c == gVar.f101767c && this.f101768d == gVar.f101768d && this.f101769e == gVar.f101769e;
        }

        public int hashCode() {
            long j11 = this.f101765a;
            long j12 = this.f101766b;
            int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f101767c;
            int i12 = (i11 + ((int) ((j13 >>> 32) ^ j13))) * 31;
            float f11 = this.f101768d;
            int iFloatToIntBits = (i12 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f101769e;
            return iFloatToIntBits + (f12 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f12) : 0);
        }

        private g(a aVar) {
            this(aVar.f101770a, aVar.f101771b, aVar.f101772c, aVar.f101773d, aVar.f101774e);
        }

        @Deprecated
        public g(long j11, long j12, long j13, float f11, float f12) {
            this.f101765a = j11;
            this.f101766b = j12;
            this.f101767c = j13;
            this.f101768d = f11;
            this.f101769e = f12;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f101775k = s7.q0.N0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101776l = s7.q0.N0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f101777m = s7.q0.N0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f101778n = s7.q0.N0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f101779o = s7.q0.N0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f101780p = s7.q0.N0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f101781q = s7.q0.N0(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f101782r = s7.q0.N0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f101783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f101785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f101786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<m0> f101787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f101788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.google.common.collect.x<k> f101789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<j> f101790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f101791i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f101792j;

        public static h a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f101777m);
            f fVarC = bundle2 == null ? null : f.c(bundle2);
            Bundle bundle3 = bundle.getBundle(f101778n);
            b bVarA = bundle3 != null ? b.a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f101779o);
            com.google.common.collect.x xVarR = parcelableArrayList == null ? com.google.common.collect.x.r() : s7.i.d(new ou.h() { // from class: p7.b0
                @Override // ou.h
                public final Object apply(Object obj) {
                    return m0.b((Bundle) obj);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f101781q);
            return new h((Uri) s7.a.f((Uri) bundle.getParcelable(f101775k)), bundle.getString(f101776l), fVarC, bVarA, xVarR, bundle.getString(f101780p), parcelableArrayList2 == null ? com.google.common.collect.x.r() : s7.i.d(new ou.h() { // from class: p7.c0
                @Override // ou.h
                public final Object apply(Object obj) {
                    return y.k.b((Bundle) obj);
                }
            }, parcelableArrayList2), null, bundle.getLong(f101782r, -9223372036854775807L));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f101775k, this.f101783a);
            String str = this.f101784b;
            if (str != null) {
                bundle.putString(f101776l, str);
            }
            f fVar = this.f101785c;
            if (fVar != null) {
                bundle.putBundle(f101777m, fVar.e());
            }
            b bVar = this.f101786d;
            if (bVar != null) {
                bundle.putBundle(f101778n, bVar.b());
            }
            if (!this.f101787e.isEmpty()) {
                bundle.putParcelableArrayList(f101779o, s7.i.h(this.f101787e, new ou.h() { // from class: p7.z
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((m0) obj).c();
                    }
                }));
            }
            String str2 = this.f101788f;
            if (str2 != null) {
                bundle.putString(f101780p, str2);
            }
            if (!this.f101789g.isEmpty()) {
                bundle.putParcelableArrayList(f101781q, s7.i.h(this.f101789g, new ou.h() { // from class: p7.a0
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((y.k) obj).c();
                    }
                }));
            }
            long j11 = this.f101792j;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f101782r, j11);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f101783a.equals(hVar.f101783a) && Objects.equals(this.f101784b, hVar.f101784b) && Objects.equals(this.f101785c, hVar.f101785c) && Objects.equals(this.f101786d, hVar.f101786d) && this.f101787e.equals(hVar.f101787e) && Objects.equals(this.f101788f, hVar.f101788f) && this.f101789g.equals(hVar.f101789g) && Objects.equals(this.f101791i, hVar.f101791i) && this.f101792j == hVar.f101792j;
        }

        public int hashCode() {
            int iHashCode = this.f101783a.hashCode() * 31;
            String str = this.f101784b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f101785c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f101786d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f101787e.hashCode()) * 31;
            String str2 = this.f101788f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f101789g.hashCode()) * 31;
            Object obj = this.f101791i;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f101792j);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<m0> list, String str2, com.google.common.collect.x<k> xVar, Object obj, long j11) {
            this.f101783a = uri;
            this.f101784b = g0.u(str);
            this.f101785c = fVar;
            this.f101786d = bVar;
            this.f101787e = list;
            this.f101788f = str2;
            this.f101789g = xVar;
            com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
            for (int i11 = 0; i11 < xVar.size(); i11++) {
                aVarK.a(xVar.get(i11).a().j());
            }
            this.f101790h = aVarK.k();
            this.f101791i = obj;
            this.f101792j = j11;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f101793d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f101794e = s7.q0.N0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f101795f = s7.q0.N0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f101796g = s7.q0.N0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f101797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f101799c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f101800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f101801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f101802c;

            public i d() {
                return new i(this);
            }

            public a e(Bundle bundle) {
                this.f101802c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f101800a = uri;
                return this;
            }

            public a g(String str) {
                this.f101801b = str;
                return this;
            }
        }

        public static i a(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f101794e)).g(bundle.getString(f101795f)).e(bundle.getBundle(f101796g)).d();
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            Uri uri = this.f101797a;
            if (uri != null) {
                bundle.putParcelable(f101794e, uri);
            }
            String str = this.f101798b;
            if (str != null) {
                bundle.putString(f101795f, str);
            }
            Bundle bundle2 = this.f101799c;
            if (bundle2 != null) {
                bundle.putBundle(f101796g, bundle2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f101797a, iVar.f101797a) && Objects.equals(this.f101798b, iVar.f101798b)) {
                if ((this.f101799c == null) == (iVar.f101799c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f101797a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f101798b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f101799c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f101797a = aVar.f101800a;
            this.f101798b = aVar.f101801b;
            this.f101799c = aVar.f101802c;
        }
    }

    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f101803h = s7.q0.N0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f101804i = s7.q0.N0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f101805j = s7.q0.N0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f101806k = s7.q0.N0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101807l = s7.q0.N0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f101808m = s7.q0.N0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f101809n = s7.q0.N0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f101810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f101813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f101814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f101815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f101816g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f101817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f101818b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f101819c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f101820d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f101821e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f101822f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f101823g;

            /* JADX INFO: Access modifiers changed from: private */
            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.f101823g = str;
                return this;
            }

            public a l(String str) {
                this.f101822f = str;
                return this;
            }

            public a m(String str) {
                this.f101819c = str;
                return this;
            }

            public a n(String str) {
                this.f101818b = g0.u(str);
                return this;
            }

            public a o(int i11) {
                this.f101821e = i11;
                return this;
            }

            public a p(int i11) {
                this.f101820d = i11;
                return this;
            }

            public a(Uri uri) {
                this.f101817a = uri;
            }

            private a(k kVar) {
                this.f101817a = kVar.f101810a;
                this.f101818b = kVar.f101811b;
                this.f101819c = kVar.f101812c;
                this.f101820d = kVar.f101813d;
                this.f101821e = kVar.f101814e;
                this.f101822f = kVar.f101815f;
                this.f101823g = kVar.f101816g;
            }
        }

        public static k b(Bundle bundle) {
            Uri uri = (Uri) s7.a.f((Uri) bundle.getParcelable(f101803h));
            String string = bundle.getString(f101804i);
            String string2 = bundle.getString(f101805j);
            int i11 = bundle.getInt(f101806k, 0);
            int i12 = bundle.getInt(f101807l, 0);
            String string3 = bundle.getString(f101808m);
            return new a(uri).n(string).m(string2).p(i11).o(i12).l(string3).k(bundle.getString(f101809n)).i();
        }

        public a a() {
            return new a();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f101803h, this.f101810a);
            String str = this.f101811b;
            if (str != null) {
                bundle.putString(f101804i, str);
            }
            String str2 = this.f101812c;
            if (str2 != null) {
                bundle.putString(f101805j, str2);
            }
            int i11 = this.f101813d;
            if (i11 != 0) {
                bundle.putInt(f101806k, i11);
            }
            int i12 = this.f101814e;
            if (i12 != 0) {
                bundle.putInt(f101807l, i12);
            }
            String str3 = this.f101815f;
            if (str3 != null) {
                bundle.putString(f101808m, str3);
            }
            String str4 = this.f101816g;
            if (str4 != null) {
                bundle.putString(f101809n, str4);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f101810a.equals(kVar.f101810a) && Objects.equals(this.f101811b, kVar.f101811b) && Objects.equals(this.f101812c, kVar.f101812c) && this.f101813d == kVar.f101813d && this.f101814e == kVar.f101814e && Objects.equals(this.f101815f, kVar.f101815f) && Objects.equals(this.f101816g, kVar.f101816g);
        }

        public int hashCode() {
            int iHashCode = this.f101810a.hashCode() * 31;
            String str = this.f101811b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f101812c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f101813d) * 31) + this.f101814e) * 31;
            String str3 = this.f101815f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f101816g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f101810a = aVar.f101817a;
            this.f101811b = aVar.f101818b;
            this.f101812c = aVar.f101819c;
            this.f101813d = aVar.f101820d;
            this.f101814e = aVar.f101821e;
            this.f101815f = aVar.f101822f;
            this.f101816g = aVar.f101823g;
        }
    }

    public static y b(Bundle bundle) {
        String str = (String) s7.a.f(bundle.getString(f101675j, ""));
        Bundle bundle2 = bundle.getBundle(f101676k);
        g gVarB = bundle2 == null ? g.f101759f : g.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f101677l);
        e0 e0VarB = bundle3 == null ? e0.K : e0.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f101678m);
        e eVarB = bundle4 == null ? e.f101731r : d.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f101679n);
        i iVarA = bundle5 == null ? i.f101793d : i.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f101680o);
        return new y(str, eVarB, bundle6 == null ? null : h.a(bundle6), gVarB, e0VarB, iVarA);
    }

    public static y c(Uri uri) {
        return new c().i(uri).a();
    }

    public static y d(String str) {
        return new c().j(str).a();
    }

    private Bundle f(boolean z11) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f101681a.equals("")) {
            bundle.putString(f101675j, this.f101681a);
        }
        if (!this.f101684d.equals(g.f101759f)) {
            bundle.putBundle(f101676k, this.f101684d.c());
        }
        if (!this.f101685e.equals(e0.K)) {
            bundle.putBundle(f101677l, this.f101685e.e());
        }
        if (!this.f101686f.equals(d.f101708i)) {
            bundle.putBundle(f101678m, this.f101686f.c());
        }
        if (!this.f101688h.equals(i.f101793d)) {
            bundle.putBundle(f101679n, this.f101688h.b());
        }
        if (z11 && (hVar = this.f101682b) != null) {
            bundle.putBundle(f101680o, hVar.b());
        }
        return bundle;
    }

    public c a() {
        return new c();
    }

    public Bundle e() {
        return f(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Objects.equals(this.f101681a, yVar.f101681a) && this.f101686f.equals(yVar.f101686f) && Objects.equals(this.f101682b, yVar.f101682b) && Objects.equals(this.f101684d, yVar.f101684d) && Objects.equals(this.f101685e, yVar.f101685e) && Objects.equals(this.f101688h, yVar.f101688h);
    }

    public Bundle g() {
        return f(true);
    }

    public int hashCode() {
        int iHashCode = this.f101681a.hashCode() * 31;
        h hVar = this.f101682b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f101684d.hashCode()) * 31) + this.f101686f.hashCode()) * 31) + this.f101685e.hashCode()) * 31) + this.f101688h.hashCode();
    }

    private y(String str, e eVar, h hVar, g gVar, e0 e0Var, i iVar) {
        this.f101681a = str;
        this.f101682b = hVar;
        this.f101683c = hVar;
        this.f101684d = gVar;
        this.f101685e = e0Var;
        this.f101686f = eVar;
        this.f101687g = eVar;
        this.f101688h = iVar;
    }
}
