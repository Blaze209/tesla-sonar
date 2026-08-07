package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class e extends f0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69793b;

    static final class b extends f0.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69795b;

        b() {
        }

        @Override // gv.f0.c.a
        public f0.c a() {
            String str;
            String str2 = this.f69794a;
            if (str2 != null && (str = this.f69795b) != null) {
                return new e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69794a == null) {
                sb2.append(" key");
            }
            if (this.f69795b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.c.a
        public f0.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f69794a = str;
            return this;
        }

        @Override // gv.f0.c.a
        public f0.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f69795b = str;
            return this;
        }
    }

    @Override // gv.f0.c
    @NonNull
    public String b() {
        return this.f69792a;
    }

    @Override // gv.f0.c
    @NonNull
    public String c() {
        return this.f69793b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.c) {
            f0.c cVar = (f0.c) obj;
            if (this.f69792a.equals(cVar.b()) && this.f69793b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f69792a.hashCode() ^ 1000003) * 1000003) ^ this.f69793b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f69792a + ", value=" + this.f69793b + "}";
    }

    private e(String str, String str2) {
        this.f69792a = str;
        this.f69793b = str2;
    }
}
