package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class v extends f0.e.d.AbstractC1439d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69972a;

    static final class b extends f0.e.d.AbstractC1439d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69973a;

        b() {
        }

        @Override // gv.f0.e.d.AbstractC1439d.a
        public f0.e.d.AbstractC1439d a() {
            String str = this.f69973a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // gv.f0.e.d.AbstractC1439d.a
        public f0.e.d.AbstractC1439d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f69973a = str;
            return this;
        }
    }

    @Override // gv.f0.e.d.AbstractC1439d
    @NonNull
    public String b() {
        return this.f69972a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC1439d) {
            return this.f69972a.equals(((f0.e.d.AbstractC1439d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f69972a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f69972a + "}";
    }

    private v(String str) {
        this.f69972a = str;
    }
}
