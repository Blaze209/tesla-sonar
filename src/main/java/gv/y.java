package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class y extends f0.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f0.e.d.AbstractC1440e> f69987a;

    static final class b extends f0.e.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<f0.e.d.AbstractC1440e> f69988a;

        b() {
        }

        @Override // gv.f0.e.d.f.a
        public f0.e.d.f a() {
            List<f0.e.d.AbstractC1440e> list = this.f69988a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // gv.f0.e.d.f.a
        public f0.e.d.f.a b(List<f0.e.d.AbstractC1440e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f69988a = list;
            return this;
        }
    }

    @Override // gv.f0.e.d.f
    @NonNull
    public List<f0.e.d.AbstractC1440e> b() {
        return this.f69987a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.f) {
            return this.f69987a.equals(((f0.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f69987a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f69987a + "}";
    }

    private y(List<f0.e.d.AbstractC1440e> list) {
        this.f69987a = list;
    }
}
