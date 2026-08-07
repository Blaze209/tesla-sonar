package ou;

/* JADX INFO: loaded from: classes5.dex */
final class s<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f100017a;

    s(T t11) {
        this.f100017a = t11;
    }

    @Override // ou.m
    public T b() {
        return this.f100017a;
    }

    @Override // ou.m
    public boolean c() {
        return true;
    }

    @Override // ou.m
    public T e(T t11) {
        p.n(t11, "use Optional.orNull() instead of Optional.or(null)");
        return this.f100017a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f100017a.equals(((s) obj).f100017a);
        }
        return false;
    }

    public int hashCode() {
        return this.f100017a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f100017a + ")";
    }
}
