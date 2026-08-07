package g1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;

/* JADX INFO: loaded from: classes.dex */
final class c extends g1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f66841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h3 f66843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f66844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f66845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f66846f;

    static final class b extends g1.a.AbstractC1372a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f66847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f66848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h3 f66849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f66850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f66851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f66852f;

        b() {
        }

        @Override // g1.a.AbstractC1372a
        g1.a a() {
            String str = "";
            if (this.f66847a == null) {
                str = " mimeType";
            }
            if (this.f66848b == null) {
                str = str + " profile";
            }
            if (this.f66849c == null) {
                str = str + " inputTimebase";
            }
            if (this.f66850d == null) {
                str = str + " bitrate";
            }
            if (this.f66851e == null) {
                str = str + " sampleRate";
            }
            if (this.f66852f == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f66847a, this.f66848b.intValue(), this.f66849c, this.f66850d.intValue(), this.f66851e.intValue(), this.f66852f.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g1.a.AbstractC1372a
        public g1.a.AbstractC1372a c(int i11) {
            this.f66850d = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.a.AbstractC1372a
        public g1.a.AbstractC1372a d(int i11) {
            this.f66852f = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.a.AbstractC1372a
        public g1.a.AbstractC1372a e(h3 h3Var) {
            if (h3Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f66849c = h3Var;
            return this;
        }

        @Override // g1.a.AbstractC1372a
        public g1.a.AbstractC1372a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f66847a = str;
            return this;
        }

        @Override // g1.a.AbstractC1372a
        public g1.a.AbstractC1372a g(int i11) {
            this.f66848b = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.a.AbstractC1372a
        public g1.a.AbstractC1372a h(int i11) {
            this.f66851e = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // g1.a, g1.m
    @NonNull
    public h3 a() {
        return this.f66843c;
    }

    @Override // g1.a
    public int d() {
        return this.f66844d;
    }

    @Override // g1.a
    public int e() {
        return this.f66846f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1.a) {
            g1.a aVar = (g1.a) obj;
            if (this.f66841a.equals(aVar.getMimeType()) && this.f66842b == aVar.f() && this.f66843c.equals(aVar.a()) && this.f66844d == aVar.d() && this.f66845e == aVar.g() && this.f66846f == aVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // g1.a
    public int f() {
        return this.f66842b;
    }

    @Override // g1.a
    public int g() {
        return this.f66845e;
    }

    @Override // g1.a, g1.m
    @NonNull
    public String getMimeType() {
        return this.f66841a;
    }

    public int hashCode() {
        return ((((((((((this.f66841a.hashCode() ^ 1000003) * 1000003) ^ this.f66842b) * 1000003) ^ this.f66843c.hashCode()) * 1000003) ^ this.f66844d) * 1000003) ^ this.f66845e) * 1000003) ^ this.f66846f;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f66841a + ", profile=" + this.f66842b + ", inputTimebase=" + this.f66843c + ", bitrate=" + this.f66844d + ", sampleRate=" + this.f66845e + ", channelCount=" + this.f66846f + "}";
    }

    private c(String str, int i11, h3 h3Var, int i12, int i13, int i14) {
        this.f66841a = str;
        this.f66842b = i11;
        this.f66843c = h3Var;
        this.f66844d = i12;
        this.f66845e = i13;
        this.f66846f = i14;
    }
}
