package ss;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f111661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f111664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f111665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f111666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f111667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f111668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f111669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f111670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f111671k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f111672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f111673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f111674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f111675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f111676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f111677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f111678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f111679h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f111680i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f111681j;

        public l a() {
            ts.a.j(this.f111672a, "The uri must be set.");
            return new l(this.f111672a, this.f111673b, this.f111674c, this.f111675d, this.f111676e, this.f111677f, this.f111678g, this.f111679h, this.f111680i, this.f111681j);
        }

        public b b(int i11) {
            this.f111680i = i11;
            return this;
        }

        public b c(byte[] bArr) {
            this.f111675d = bArr;
            return this;
        }

        public b d(int i11) {
            this.f111674c = i11;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f111676e = map;
            return this;
        }

        public b f(String str) {
            this.f111679h = str;
            return this;
        }

        public b g(long j11) {
            this.f111677f = j11;
            return this;
        }

        public b h(Uri uri) {
            this.f111672a = uri;
            return this;
        }

        public b i(String str) {
            this.f111672a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f111674c = 1;
            this.f111676e = Collections.EMPTY_MAP;
            this.f111678g = -1L;
        }

        private b(l lVar) {
            this.f111672a = lVar.f111661a;
            this.f111673b = lVar.f111662b;
            this.f111674c = lVar.f111663c;
            this.f111675d = lVar.f111664d;
            this.f111676e = lVar.f111665e;
            this.f111677f = lVar.f111667g;
            this.f111678g = lVar.f111668h;
            this.f111679h = lVar.f111669i;
            this.f111680i = lVar.f111670j;
            this.f111681j = lVar.f111671k;
        }
    }

    static {
        br.p.a("goog.exo.datasource");
    }

    public static String c(int i11) {
        if (i11 == 1) {
            return "GET";
        }
        if (i11 == 2) {
            return "POST";
        }
        if (i11 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f111663c);
    }

    public boolean d(int i11) {
        return (this.f111670j & i11) == i11;
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f111661a + ", " + this.f111667g + ", " + this.f111668h + ", " + this.f111669i + ", " + this.f111670j + "]";
    }

    private l(Uri uri, long j11, int i11, byte[] bArr, Map<String, String> map, long j12, long j13, String str, int i12, Object obj) {
        byte[] bArr2 = bArr;
        long j14 = j11 + j12;
        ts.a.a(j14 >= 0);
        ts.a.a(j12 >= 0);
        ts.a.a(j13 > 0 || j13 == -1);
        this.f111661a = uri;
        this.f111662b = j11;
        this.f111663c = i11;
        this.f111664d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f111665e = Collections.unmodifiableMap(new HashMap(map));
        this.f111667g = j12;
        this.f111666f = j14;
        this.f111668h = j13;
        this.f111669i = str;
        this.f111670j = i12;
        this.f111671k = obj;
    }
}
