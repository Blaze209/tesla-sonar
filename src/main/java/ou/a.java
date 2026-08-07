package ou;

/* JADX INFO: loaded from: classes5.dex */
final class a<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<Object> f99991a = new a<>();

    private a() {
    }

    static <T> m<T> f() {
        return f99991a;
    }

    @Override // ou.m
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // ou.m
    public boolean c() {
        return false;
    }

    @Override // ou.m
    public T e(T t11) {
        return (T) p.n(t11, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
