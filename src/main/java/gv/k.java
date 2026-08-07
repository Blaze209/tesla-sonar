package gv;

import androidx.annotation.NonNull;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
final class k extends f0.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f69852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f69854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f69855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f69856i;

    static final class b extends f0.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f69857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f69859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f69860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f69861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f69862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f69863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f69864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f69865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f69866j;

        b() {
        }

        @Override // gv.f0.e.c.a
        public f0.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f69866j == 63 && (str = this.f69858b) != null && (str2 = this.f69864h) != null && (str3 = this.f69865i) != null) {
                return new k(this.f69857a, str, this.f69859c, this.f69860d, this.f69861e, this.f69862f, this.f69863g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f69866j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f69858b == null) {
                sb2.append(" model");
            }
            if ((this.f69866j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f69866j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f69866j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f69866j & Tnaf.POW_2_WIDTH) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f69866j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f69864h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f69865i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a b(int i11) {
            this.f69857a = i11;
            this.f69866j = (byte) (this.f69866j | 1);
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a c(int i11) {
            this.f69859c = i11;
            this.f69866j = (byte) (this.f69866j | 2);
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a d(long j11) {
            this.f69861e = j11;
            this.f69866j = (byte) (this.f69866j | 8);
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f69864h = str;
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f69858b = str;
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f69865i = str;
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a h(long j11) {
            this.f69860d = j11;
            this.f69866j = (byte) (this.f69866j | 4);
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a i(boolean z11) {
            this.f69862f = z11;
            this.f69866j = (byte) (this.f69866j | Tnaf.POW_2_WIDTH);
            return this;
        }

        @Override // gv.f0.e.c.a
        public f0.e.c.a j(int i11) {
            this.f69863g = i11;
            this.f69866j = (byte) (this.f69866j | 32);
            return this;
        }
    }

    @Override // gv.f0.e.c
    @NonNull
    public int b() {
        return this.f69848a;
    }

    @Override // gv.f0.e.c
    public int c() {
        return this.f69850c;
    }

    @Override // gv.f0.e.c
    public long d() {
        return this.f69852e;
    }

    @Override // gv.f0.e.c
    @NonNull
    public String e() {
        return this.f69855h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.c) {
            f0.e.c cVar = (f0.e.c) obj;
            if (this.f69848a == cVar.b() && this.f69849b.equals(cVar.f()) && this.f69850c == cVar.c() && this.f69851d == cVar.h() && this.f69852e == cVar.d() && this.f69853f == cVar.j() && this.f69854g == cVar.i() && this.f69855h.equals(cVar.e()) && this.f69856i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e.c
    @NonNull
    public String f() {
        return this.f69849b;
    }

    @Override // gv.f0.e.c
    @NonNull
    public String g() {
        return this.f69856i;
    }

    @Override // gv.f0.e.c
    public long h() {
        return this.f69851d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f69848a ^ 1000003) * 1000003) ^ this.f69849b.hashCode()) * 1000003) ^ this.f69850c) * 1000003;
        long j11 = this.f69851d;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f69852e;
        return ((((((((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f69853f ? 1231 : 1237)) * 1000003) ^ this.f69854g) * 1000003) ^ this.f69855h.hashCode()) * 1000003) ^ this.f69856i.hashCode();
    }

    @Override // gv.f0.e.c
    public int i() {
        return this.f69854g;
    }

    @Override // gv.f0.e.c
    public boolean j() {
        return this.f69853f;
    }

    public String toString() {
        return "Device{arch=" + this.f69848a + ", model=" + this.f69849b + ", cores=" + this.f69850c + ", ram=" + this.f69851d + ", diskSpace=" + this.f69852e + ", simulator=" + this.f69853f + ", state=" + this.f69854g + ", manufacturer=" + this.f69855h + ", modelClass=" + this.f69856i + "}";
    }

    private k(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f69848a = i11;
        this.f69849b = str;
        this.f69850c = i12;
        this.f69851d = j11;
        this.f69852e = j12;
        this.f69853f = z11;
        this.f69854g = i13;
        this.f69855h = str2;
        this.f69856i = str3;
    }
}
