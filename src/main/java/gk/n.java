package gk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn0.l f69095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f69096b;

    public n(wn0.l constructor) {
        p013kotlin.jvm.internal.s.k(constructor, "constructor");
        this.f69095a = constructor;
    }

    public final Object a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f69096b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f69096b;
            if (objInvoke == null) {
                objInvoke = this.f69095a.invoke(obj);
                this.f69096b = objInvoke;
            }
        }
        return objInvoke;
    }
}
