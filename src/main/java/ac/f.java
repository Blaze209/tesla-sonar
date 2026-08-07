package ac;

/* JADX INFO: loaded from: classes3.dex */
public class f<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<TResult> f954a = new e<>();

    public e<TResult> a() {
        return this.f954a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f954a.p();
    }

    public boolean f(Exception exc) {
        return this.f954a.q(exc);
    }

    public boolean g(TResult tresult) {
        return this.f954a.r(tresult);
    }
}
