package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class f extends f0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0.d.b> f69799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69800b;

    static final class b extends f0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<f0.d.b> f69801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f69802b;

        b() {
        }

        @Override // gv.f0.d.a
        public f0.d a() {
            List<f0.d.b> list = this.f69801a;
            if (list != null) {
                return new f(list, this.f69802b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // gv.f0.d.a
        public f0.d.a b(List<f0.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f69801a = list;
            return this;
        }

        @Override // gv.f0.d.a
        public f0.d.a c(String str) {
            this.f69802b = str;
            return this;
        }
    }

    @Override // gv.f0.d
    @NonNull
    public List<f0.d.b> b() {
        return this.f69799a;
    }

    @Override // gv.f0.d
    public String c() {
        return this.f69800b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.d) {
            f0.d dVar = (f0.d) obj;
            if (this.f69799a.equals(dVar.b()) && ((str = this.f69800b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f69799a.hashCode() ^ 1000003) * 1000003;
        String str = this.f69800b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f69799a + ", orgId=" + this.f69800b + "}";
    }

    private f(List<f0.d.b> list, String str) {
        this.f69799a = list;
        this.f69800b = str;
    }
}
