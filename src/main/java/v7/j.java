package v7;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f118101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f118104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f118105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f118106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f118107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f118108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f118109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f118110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f118111k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f118112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f118113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f118114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f118115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f118116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f118117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f118118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f118119h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f118120i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f118121j;

        public j a() {
            s7.a.k(this.f118112a, "The uri must be set.");
            return new j(this.f118112a, this.f118113b, this.f118114c, this.f118115d, this.f118116e, this.f118117f, this.f118118g, this.f118119h, this.f118120i, this.f118121j);
        }

        public b b(int i11) {
            this.f118120i = i11;
            return this;
        }

        public b c(byte[] bArr) {
            this.f118115d = bArr;
            return this;
        }

        public b d(int i11) {
            this.f118114c = i11;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f118116e = map;
            return this;
        }

        public b f(String str) {
            this.f118119h = str;
            return this;
        }

        public b g(long j11) {
            this.f118118g = j11;
            return this;
        }

        public b h(long j11) {
            this.f118117f = j11;
            return this;
        }

        public b i(Uri uri) {
            this.f118112a = uri;
            return this;
        }

        public b j(String str) {
            this.f118112a = Uri.parse(str);
            return this;
        }

        public b k(long j11) {
            this.f118113b = j11;
            return this;
        }

        public b() {
            this.f118114c = 1;
            this.f118116e = Collections.EMPTY_MAP;
            this.f118118g = -1L;
        }

        private b(j jVar) {
            this.f118112a = jVar.f118101a;
            this.f118113b = jVar.f118102b;
            this.f118114c = jVar.f118103c;
            this.f118115d = jVar.f118104d;
            this.f118116e = jVar.f118105e;
            this.f118117f = jVar.f118107g;
            this.f118118g = jVar.f118108h;
            this.f118119h = jVar.f118109i;
            this.f118120i = jVar.f118110j;
            this.f118121j = jVar.f118111k;
        }
    }

    static {
        d0.a("media3.datasource");
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
        return c(this.f118103c);
    }

    public boolean d(int i11) {
        return (this.f118110j & i11) == i11;
    }

    public j e(long j11) {
        long j12 = this.f118108h;
        return f(j11, j12 != -1 ? j12 - j11 : -1L);
    }

    public j f(long j11, long j12) {
        return (j11 == 0 && this.f118108h == j12) ? this : new j(this.f118101a, this.f118102b, this.f118103c, this.f118104d, this.f118105e, this.f118107g + j11, j12, this.f118109i, this.f118110j, this.f118111k);
    }

    public j g(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f118105e);
        map2.putAll(map);
        return new j(this.f118101a, this.f118102b, this.f118103c, this.f118104d, map2, this.f118107g, this.f118108h, this.f118109i, this.f118110j, this.f118111k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f118101a + ", " + this.f118107g + ", " + this.f118108h + ", " + this.f118109i + ", " + this.f118110j + "]";
    }

    public j(Uri uri) {
        this(uri, 0L, -1L);
    }

    public j(Uri uri, long j11, long j12) {
        this(uri, j11, j12, null);
    }

    @Deprecated
    public j(Uri uri, long j11, long j12, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j11, j12, str, 0, null);
    }

    private j(Uri uri, long j11, int i11, byte[] bArr, Map<String, String> map, long j12, long j13, String str, int i12, Object obj) {
        byte[] bArr2 = bArr;
        long j14 = j11 + j12;
        s7.a.a(j14 >= 0);
        s7.a.a(j12 >= 0);
        s7.a.a(j13 > 0 || j13 == -1);
        this.f118101a = (Uri) s7.a.f(uri);
        this.f118102b = j11;
        this.f118103c = i11;
        this.f118104d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f118105e = Collections.unmodifiableMap(new HashMap(map));
        this.f118107g = j12;
        this.f118106f = j14;
        this.f118108h = j13;
        this.f118109i = str;
        this.f118110j = i12;
        this.f118111k = obj;
    }
}
