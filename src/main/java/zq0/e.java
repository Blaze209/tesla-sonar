package zq0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<d> f128493a = new ArrayList();

    public void a(d dVar) {
        this.f128493a.add(dVar);
    }

    public List<d> b() {
        return new ArrayList(this.f128493a);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(e.class)) {
            return this.f128493a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return (this.f128493a.hashCode() * 7) + 11;
    }
}
