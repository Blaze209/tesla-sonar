package gv;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class m extends f0.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0.e.d.a.b f69880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f0.c> f69881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f0.c> f69882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f69883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0.e.d.a.c f69884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<f0.e.d.a.c> f69885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f69886g;

    static final class b extends f0.e.d.a.AbstractC1427a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0.e.d.a.b f69887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<f0.c> f69888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<f0.c> f69889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f69890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f0.e.d.a.c f69891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<f0.e.d.a.c> f69892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f69893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f69894h;

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a a() {
            f0.e.d.a.b bVar;
            if (this.f69894h == 1 && (bVar = this.f69887a) != null) {
                return new m(bVar, this.f69888b, this.f69889c, this.f69890d, this.f69891e, this.f69892f, this.f69893g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69887a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f69894h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a b(List<f0.e.d.a.c> list) {
            this.f69892f = list;
            return this;
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a c(Boolean bool) {
            this.f69890d = bool;
            return this;
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a d(f0.e.d.a.c cVar) {
            this.f69891e = cVar;
            return this;
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a e(List<f0.c> list) {
            this.f69888b = list;
            return this;
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a f(f0.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f69887a = bVar;
            return this;
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a g(List<f0.c> list) {
            this.f69889c = list;
            return this;
        }

        @Override // gv.f0.e.d.a.AbstractC1427a
        public f0.e.d.a.AbstractC1427a h(int i11) {
            this.f69893g = i11;
            this.f69894h = (byte) (this.f69894h | 1);
            return this;
        }

        b() {
        }

        private b(f0.e.d.a aVar) {
            this.f69887a = aVar.f();
            this.f69888b = aVar.e();
            this.f69889c = aVar.g();
            this.f69890d = aVar.c();
            this.f69891e = aVar.d();
            this.f69892f = aVar.b();
            this.f69893g = aVar.h();
            this.f69894h = (byte) 1;
        }
    }

    @Override // gv.f0.e.d.a
    public List<f0.e.d.a.c> b() {
        return this.f69885f;
    }

    @Override // gv.f0.e.d.a
    public Boolean c() {
        return this.f69883d;
    }

    @Override // gv.f0.e.d.a
    public f0.e.d.a.c d() {
        return this.f69884e;
    }

    @Override // gv.f0.e.d.a
    public List<f0.c> e() {
        return this.f69881b;
    }

    public boolean equals(Object obj) {
        List<f0.c> list;
        List<f0.c> list2;
        Boolean bool;
        f0.e.d.a.c cVar;
        List<f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.a) {
            f0.e.d.a aVar = (f0.e.d.a) obj;
            if (this.f69880a.equals(aVar.f()) && ((list = this.f69881b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f69882c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f69883d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f69884e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f69885f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f69886g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // gv.f0.e.d.a
    @NonNull
    public f0.e.d.a.b f() {
        return this.f69880a;
    }

    @Override // gv.f0.e.d.a
    public List<f0.c> g() {
        return this.f69882c;
    }

    @Override // gv.f0.e.d.a
    public int h() {
        return this.f69886g;
    }

    public int hashCode() {
        int iHashCode = (this.f69880a.hashCode() ^ 1000003) * 1000003;
        List<f0.c> list = this.f69881b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.c> list2 = this.f69882c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f69883d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.e.d.a.c cVar = this.f69884e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d.a.c> list3 = this.f69885f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f69886g;
    }

    @Override // gv.f0.e.d.a
    public f0.e.d.a.AbstractC1427a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f69880a + ", customAttributes=" + this.f69881b + ", internalKeys=" + this.f69882c + ", background=" + this.f69883d + ", currentProcessDetails=" + this.f69884e + ", appProcessDetails=" + this.f69885f + ", uiOrientation=" + this.f69886g + "}";
    }

    private m(f0.e.d.a.b bVar, List<f0.c> list, List<f0.c> list2, Boolean bool, f0.e.d.a.c cVar, List<f0.e.d.a.c> list3, int i11) {
        this.f69880a = bVar;
        this.f69881b = list;
        this.f69882c = list2;
        this.f69883d = bool;
        this.f69884e = cVar;
        this.f69885f = list3;
        this.f69886g = i11;
    }
}
