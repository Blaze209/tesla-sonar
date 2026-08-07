package p013kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes9.dex */
class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f88847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f88848b = Thread.currentThread();

    a(T t11) {
        this.f88847a = t11;
    }

    public T a() {
        if (b()) {
            return this.f88847a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f88848b == Thread.currentThread();
    }
}
