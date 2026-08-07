package z0;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class c extends z0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Range<Integer> f126088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f126089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f126090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Range<Integer> f126091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f126092h;

    static final class b extends z0.a.AbstractC2741a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Range<Integer> f126093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f126094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f126095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Range<Integer> f126096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f126097e;

        b() {
        }

        @Override // z0.a.AbstractC2741a
        public z0.a a() {
            String str = "";
            if (this.f126093a == null) {
                str = " bitrate";
            }
            if (this.f126094b == null) {
                str = str + " sourceFormat";
            }
            if (this.f126095c == null) {
                str = str + " source";
            }
            if (this.f126096d == null) {
                str = str + " sampleRate";
            }
            if (this.f126097e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new c(this.f126093a, this.f126094b.intValue(), this.f126095c.intValue(), this.f126096d, this.f126097e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.a.AbstractC2741a
        public z0.a.AbstractC2741a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f126093a = range;
            return this;
        }

        @Override // z0.a.AbstractC2741a
        public z0.a.AbstractC2741a c(int i11) {
            this.f126097e = Integer.valueOf(i11);
            return this;
        }

        @Override // z0.a.AbstractC2741a
        public z0.a.AbstractC2741a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f126096d = range;
            return this;
        }

        @Override // z0.a.AbstractC2741a
        public z0.a.AbstractC2741a e(int i11) {
            this.f126095c = Integer.valueOf(i11);
            return this;
        }

        public z0.a.AbstractC2741a f(int i11) {
            this.f126094b = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // z0.a
    @NonNull
    public Range<Integer> b() {
        return this.f126088d;
    }

    @Override // z0.a
    public int c() {
        return this.f126092h;
    }

    @Override // z0.a
    @NonNull
    public Range<Integer> d() {
        return this.f126091g;
    }

    @Override // z0.a
    public int e() {
        return this.f126090f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0.a) {
            z0.a aVar = (z0.a) obj;
            if (this.f126088d.equals(aVar.b()) && this.f126089e == aVar.f() && this.f126090f == aVar.e() && this.f126091g.equals(aVar.d()) && this.f126092h == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // z0.a
    public int f() {
        return this.f126089e;
    }

    public int hashCode() {
        return ((((((((this.f126088d.hashCode() ^ 1000003) * 1000003) ^ this.f126089e) * 1000003) ^ this.f126090f) * 1000003) ^ this.f126091g.hashCode()) * 1000003) ^ this.f126092h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f126088d + ", sourceFormat=" + this.f126089e + ", source=" + this.f126090f + ", sampleRate=" + this.f126091g + ", channelCount=" + this.f126092h + "}";
    }

    private c(Range<Integer> range, int i11, int i12, Range<Integer> range2, int i13) {
        this.f126088d = range;
        this.f126089e = i11;
        this.f126090f = i12;
        this.f126091g = range2;
        this.f126092h = i13;
    }
}
