package r0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f106284d;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f106285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f106286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f106287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f106288d;

        b() {
        }

        @Override // r0.e.a
        public e a() {
            String str = "";
            if (this.f106285a == null) {
                str = " glVersion";
            }
            if (this.f106286b == null) {
                str = str + " eglVersion";
            }
            if (this.f106287c == null) {
                str = str + " glExtensions";
            }
            if (this.f106288d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f106285a, this.f106286b, this.f106287c, this.f106288d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r0.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f106288d = str;
            return this;
        }

        @Override // r0.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f106286b = str;
            return this;
        }

        @Override // r0.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f106287c = str;
            return this;
        }

        @Override // r0.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f106285a = str;
            return this;
        }
    }

    @Override // r0.e
    @NonNull
    public String b() {
        return this.f106284d;
    }

    @Override // r0.e
    @NonNull
    public String c() {
        return this.f106282b;
    }

    @Override // r0.e
    @NonNull
    public String d() {
        return this.f106283c;
    }

    @Override // r0.e
    @NonNull
    public String e() {
        return this.f106281a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f106281a.equals(eVar.e()) && this.f106282b.equals(eVar.c()) && this.f106283c.equals(eVar.d()) && this.f106284d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f106281a.hashCode() ^ 1000003) * 1000003) ^ this.f106282b.hashCode()) * 1000003) ^ this.f106283c.hashCode()) * 1000003) ^ this.f106284d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f106281a + ", eglVersion=" + this.f106282b + ", glExtensions=" + this.f106283c + ", eglExtensions=" + this.f106284d + "}";
    }

    private a(String str, String str2, String str3, String str4) {
        this.f106281a = str;
        this.f106282b = str2;
        this.f106283c = str3;
        this.f106284d = str4;
    }
}
