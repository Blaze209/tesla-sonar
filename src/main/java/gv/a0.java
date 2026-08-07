package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class a0 extends f0.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69722a;

    static final class b extends f0.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69723a;

        b() {
        }

        @Override // gv.f0.e.f.a
        public f0.e.f a() {
            String str = this.f69723a;
            if (str != null) {
                return new a0(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // gv.f0.e.f.a
        public f0.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f69723a = str;
            return this;
        }
    }

    @Override // gv.f0.e.f
    @NonNull
    public String b() {
        return this.f69722a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.f) {
            return this.f69722a.equals(((f0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f69722a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f69722a + "}";
    }

    private a0(String str) {
        this.f69722a = str;
    }
}
