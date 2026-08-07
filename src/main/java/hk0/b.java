package hk0;

/* JADX INFO: loaded from: classes8.dex */
public class b implements lk0.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kk0.b f72975c = kk0.b.i("freemarker.beans");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final lk0.p f72976d = new lk0.j("UNKNOWN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final jk0.f f72977e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f72978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final i f72979b;

    b(Object obj, i iVar, boolean z11) {
        this.f72978a = obj;
        this.f72979b = iVar;
        if (!z11 || obj == null) {
            return;
        }
        iVar.g().k(obj.getClass());
    }

    public String toString() {
        return this.f72978a.toString();
    }
}
