package gv;

import androidx.annotation.NonNull;
import java.util.List;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
final class c extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f69756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f69757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f69758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f69759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<f0.a.AbstractC1424a> f69760i;

    static final class b extends f0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f69761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f69763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f69764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f69766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f69767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f69768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<f0.a.AbstractC1424a> f69769i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f69770j;

        b() {
        }

        @Override // gv.f0.a.b
        public f0.a a() {
            String str;
            if (this.f69770j == 63 && (str = this.f69762b) != null) {
                return new c(this.f69761a, str, this.f69763c, this.f69764d, this.f69765e, this.f69766f, this.f69767g, this.f69768h, this.f69769i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f69770j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f69762b == null) {
                sb2.append(" processName");
            }
            if ((this.f69770j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f69770j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f69770j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f69770j & Tnaf.POW_2_WIDTH) == 0) {
                sb2.append(" rss");
            }
            if ((this.f69770j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.a.b
        public f0.a.b b(List<f0.a.AbstractC1424a> list) {
            this.f69769i = list;
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b c(int i11) {
            this.f69764d = i11;
            this.f69770j = (byte) (this.f69770j | 4);
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b d(int i11) {
            this.f69761a = i11;
            this.f69770j = (byte) (this.f69770j | 1);
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f69762b = str;
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b f(long j11) {
            this.f69765e = j11;
            this.f69770j = (byte) (this.f69770j | 8);
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b g(int i11) {
            this.f69763c = i11;
            this.f69770j = (byte) (this.f69770j | 2);
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b h(long j11) {
            this.f69766f = j11;
            this.f69770j = (byte) (this.f69770j | Tnaf.POW_2_WIDTH);
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b i(long j11) {
            this.f69767g = j11;
            this.f69770j = (byte) (this.f69770j | 32);
            return this;
        }

        @Override // gv.f0.a.b
        public f0.a.b j(String str) {
            this.f69768h = str;
            return this;
        }
    }

    @Override // gv.f0.a
    public List<f0.a.AbstractC1424a> b() {
        return this.f69760i;
    }

    @Override // gv.f0.a
    @NonNull
    public int c() {
        return this.f69755d;
    }

    @Override // gv.f0.a
    @NonNull
    public int d() {
        return this.f69752a;
    }

    @Override // gv.f0.a
    @NonNull
    public String e() {
        return this.f69753b;
    }

    public boolean equals(Object obj) {
        String str;
        List<f0.a.AbstractC1424a> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a) {
            f0.a aVar = (f0.a) obj;
            if (this.f69752a == aVar.d() && this.f69753b.equals(aVar.e()) && this.f69754c == aVar.g() && this.f69755d == aVar.c() && this.f69756e == aVar.f() && this.f69757f == aVar.h() && this.f69758g == aVar.i() && ((str = this.f69759h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f69760i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.a
    @NonNull
    public long f() {
        return this.f69756e;
    }

    @Override // gv.f0.a
    @NonNull
    public int g() {
        return this.f69754c;
    }

    @Override // gv.f0.a
    @NonNull
    public long h() {
        return this.f69757f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f69752a ^ 1000003) * 1000003) ^ this.f69753b.hashCode()) * 1000003) ^ this.f69754c) * 1000003) ^ this.f69755d) * 1000003;
        long j11 = this.f69756e;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f69757f;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f69758g;
        int i13 = (i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str = this.f69759h;
        int iHashCode2 = (i13 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC1424a> list = this.f69760i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // gv.f0.a
    @NonNull
    public long i() {
        return this.f69758g;
    }

    @Override // gv.f0.a
    public String j() {
        return this.f69759h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f69752a + ", processName=" + this.f69753b + ", reasonCode=" + this.f69754c + ", importance=" + this.f69755d + ", pss=" + this.f69756e + ", rss=" + this.f69757f + ", timestamp=" + this.f69758g + ", traceFile=" + this.f69759h + ", buildIdMappingForArch=" + this.f69760i + "}";
    }

    private c(int i11, String str, int i12, int i13, long j11, long j12, long j13, String str2, List<f0.a.AbstractC1424a> list) {
        this.f69752a = i11;
        this.f69753b = str;
        this.f69754c = i12;
        this.f69755d = i13;
        this.f69756e = j11;
        this.f69757f = j12;
        this.f69758g = j13;
        this.f69759h = str2;
        this.f69760i = list;
    }
}
