package g1;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;

/* JADX INFO: loaded from: classes.dex */
final class d extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f66856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h3 f66858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f66859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f66860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n1 f66861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f66862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f66863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f66864i;

    static final class b extends m1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f66865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f66866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h3 f66867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Size f66868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f66869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private n1 f66870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f66871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f66872h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f66873i;

        b() {
        }

        @Override // g1.m1.a
        public m1 a() {
            String str = "";
            if (this.f66865a == null) {
                str = " mimeType";
            }
            if (this.f66866b == null) {
                str = str + " profile";
            }
            if (this.f66867c == null) {
                str = str + " inputTimebase";
            }
            if (this.f66868d == null) {
                str = str + " resolution";
            }
            if (this.f66869e == null) {
                str = str + " colorFormat";
            }
            if (this.f66870f == null) {
                str = str + " dataSpace";
            }
            if (this.f66871g == null) {
                str = str + " frameRate";
            }
            if (this.f66872h == null) {
                str = str + " IFrameInterval";
            }
            if (this.f66873i == null) {
                str = str + " bitrate";
            }
            if (str.isEmpty()) {
                return new d(this.f66865a, this.f66866b.intValue(), this.f66867c, this.f66868d, this.f66869e.intValue(), this.f66870f, this.f66871g.intValue(), this.f66872h.intValue(), this.f66873i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g1.m1.a
        public m1.a b(int i11) {
            this.f66873i = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.m1.a
        public m1.a c(int i11) {
            this.f66869e = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.m1.a
        public m1.a d(n1 n1Var) {
            if (n1Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f66870f = n1Var;
            return this;
        }

        @Override // g1.m1.a
        public m1.a e(int i11) {
            this.f66871g = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.m1.a
        public m1.a f(int i11) {
            this.f66872h = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.m1.a
        public m1.a g(h3 h3Var) {
            if (h3Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f66867c = h3Var;
            return this;
        }

        @Override // g1.m1.a
        public m1.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f66865a = str;
            return this;
        }

        @Override // g1.m1.a
        public m1.a i(int i11) {
            this.f66866b = Integer.valueOf(i11);
            return this;
        }

        @Override // g1.m1.a
        public m1.a j(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f66868d = size;
            return this;
        }
    }

    @Override // g1.m1, g1.m
    @NonNull
    public h3 a() {
        return this.f66858c;
    }

    @Override // g1.m1
    public int d() {
        return this.f66864i;
    }

    @Override // g1.m1
    public int e() {
        return this.f66860e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f66856a.equals(m1Var.getMimeType()) && this.f66857b == m1Var.i() && this.f66858c.equals(m1Var.a()) && this.f66859d.equals(m1Var.j()) && this.f66860e == m1Var.e() && this.f66861f.equals(m1Var.f()) && this.f66862g == m1Var.g() && this.f66863h == m1Var.h() && this.f66864i == m1Var.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // g1.m1
    @NonNull
    public n1 f() {
        return this.f66861f;
    }

    @Override // g1.m1
    public int g() {
        return this.f66862g;
    }

    @Override // g1.m1, g1.m
    @NonNull
    public String getMimeType() {
        return this.f66856a;
    }

    @Override // g1.m1
    public int h() {
        return this.f66863h;
    }

    public int hashCode() {
        return ((((((((((((((((this.f66856a.hashCode() ^ 1000003) * 1000003) ^ this.f66857b) * 1000003) ^ this.f66858c.hashCode()) * 1000003) ^ this.f66859d.hashCode()) * 1000003) ^ this.f66860e) * 1000003) ^ this.f66861f.hashCode()) * 1000003) ^ this.f66862g) * 1000003) ^ this.f66863h) * 1000003) ^ this.f66864i;
    }

    @Override // g1.m1
    public int i() {
        return this.f66857b;
    }

    @Override // g1.m1
    @NonNull
    public Size j() {
        return this.f66859d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f66856a + ", profile=" + this.f66857b + ", inputTimebase=" + this.f66858c + ", resolution=" + this.f66859d + ", colorFormat=" + this.f66860e + ", dataSpace=" + this.f66861f + ", frameRate=" + this.f66862g + ", IFrameInterval=" + this.f66863h + ", bitrate=" + this.f66864i + "}";
    }

    private d(String str, int i11, h3 h3Var, Size size, int i12, n1 n1Var, int i13, int i14, int i15) {
        this.f66856a = str;
        this.f66857b = i11;
        this.f66858c = h3Var;
        this.f66859d = size;
        this.f66860e = i12;
        this.f66861f = n1Var;
        this.f66862g = i13;
        this.f66863h = i14;
        this.f66864i = i15;
    }
}
