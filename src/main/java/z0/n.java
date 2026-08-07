package z0;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class n extends e2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f126185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Range<Integer> f126186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Range<Integer> f126187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f126188g;

    static final class b extends e2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a0 f126189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Range<Integer> f126190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Range<Integer> f126191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f126192d;

        @Override // z0.e2.a
        public e2 a() {
            String str = "";
            if (this.f126189a == null) {
                str = " qualitySelector";
            }
            if (this.f126190b == null) {
                str = str + " frameRate";
            }
            if (this.f126191c == null) {
                str = str + " bitrate";
            }
            if (this.f126192d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new n(this.f126189a, this.f126190b, this.f126191c, this.f126192d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.e2.a
        e2.a b(int i11) {
            this.f126192d = Integer.valueOf(i11);
            return this;
        }

        @Override // z0.e2.a
        public e2.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f126191c = range;
            return this;
        }

        @Override // z0.e2.a
        public e2.a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null frameRate");
            }
            this.f126190b = range;
            return this;
        }

        @Override // z0.e2.a
        public e2.a e(a0 a0Var) {
            if (a0Var == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f126189a = a0Var;
            return this;
        }

        b() {
        }

        private b(e2 e2Var) {
            this.f126189a = e2Var.e();
            this.f126190b = e2Var.d();
            this.f126191c = e2Var.c();
            this.f126192d = Integer.valueOf(e2Var.b());
        }
    }

    @Override // z0.e2
    int b() {
        return this.f126188g;
    }

    @Override // z0.e2
    @NonNull
    public Range<Integer> c() {
        return this.f126187f;
    }

    @Override // z0.e2
    @NonNull
    public Range<Integer> d() {
        return this.f126186e;
    }

    @Override // z0.e2
    @NonNull
    public a0 e() {
        return this.f126185d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            if (this.f126185d.equals(e2Var.e()) && this.f126186e.equals(e2Var.d()) && this.f126187f.equals(e2Var.c()) && this.f126188g == e2Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.e2
    public e2.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f126185d.hashCode() ^ 1000003) * 1000003) ^ this.f126186e.hashCode()) * 1000003) ^ this.f126187f.hashCode()) * 1000003) ^ this.f126188g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f126185d + ", frameRate=" + this.f126186e + ", bitrate=" + this.f126187f + ", aspectRatio=" + this.f126188g + "}";
    }

    private n(a0 a0Var, Range<Integer> range, Range<Integer> range2, int i11) {
        this.f126185d = a0Var;
        this.f126186e = range;
        this.f126187f = range2;
        this.f126188g = i11;
    }
}
