package c1;

/* JADX INFO: loaded from: classes.dex */
final class o extends c1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18543e;

    static final class b extends c1.a.AbstractC0367a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f18544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f18545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f18546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f18547d;

        b() {
        }

        @Override // c1.a.AbstractC0367a
        c1.a a() {
            String str = "";
            if (this.f18544a == null) {
                str = " audioSource";
            }
            if (this.f18545b == null) {
                str = str + " sampleRate";
            }
            if (this.f18546c == null) {
                str = str + " channelCount";
            }
            if (this.f18547d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new o(this.f18544a.intValue(), this.f18545b.intValue(), this.f18546c.intValue(), this.f18547d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c1.a.AbstractC0367a
        public c1.a.AbstractC0367a c(int i11) {
            this.f18547d = Integer.valueOf(i11);
            return this;
        }

        @Override // c1.a.AbstractC0367a
        public c1.a.AbstractC0367a d(int i11) {
            this.f18544a = Integer.valueOf(i11);
            return this;
        }

        @Override // c1.a.AbstractC0367a
        public c1.a.AbstractC0367a e(int i11) {
            this.f18546c = Integer.valueOf(i11);
            return this;
        }

        @Override // c1.a.AbstractC0367a
        public c1.a.AbstractC0367a f(int i11) {
            this.f18545b = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // c1.a
    public int b() {
        return this.f18543e;
    }

    @Override // c1.a
    public int c() {
        return this.f18540b;
    }

    @Override // c1.a
    public int e() {
        return this.f18542d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c1.a) {
            c1.a aVar = (c1.a) obj;
            if (this.f18540b == aVar.c() && this.f18541c == aVar.f() && this.f18542d == aVar.e() && this.f18543e == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // c1.a
    public int f() {
        return this.f18541c;
    }

    public int hashCode() {
        return ((((((this.f18540b ^ 1000003) * 1000003) ^ this.f18541c) * 1000003) ^ this.f18542d) * 1000003) ^ this.f18543e;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f18540b + ", sampleRate=" + this.f18541c + ", channelCount=" + this.f18542d + ", audioFormat=" + this.f18543e + "}";
    }

    private o(int i11, int i12, int i13, int i14) {
        this.f18540b = i11;
        this.f18541c = i12;
        this.f18542d = i13;
        this.f18543e = i14;
    }
}
