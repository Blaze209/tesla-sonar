package net.time4j.format;

/* JADX INFO: loaded from: classes9.dex */
final class q<A> implements net.time4j.engine.c<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<A> f94449b;

    private q(String str, Class<A> cls) {
        if (str == null) {
            throw new NullPointerException("Missing name of attribute key.");
        }
        if (cls == null) {
            throw new NullPointerException("Missing type of attribute.");
        }
        this.f94448a = str;
        this.f94449b = cls;
    }

    static <A> q<A> a(String str, Class<A> cls) {
        return new q<>(str, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f94448a.equals(qVar.f94448a) && this.f94449b.equals(qVar.f94449b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f94448a.hashCode();
    }

    @Override // net.time4j.engine.c
    public String name() {
        return this.f94448a;
    }

    public String toString() {
        return this.f94449b.getName() + "@" + this.f94448a;
    }

    @Override // net.time4j.engine.c
    public Class<A> type() {
        return this.f94449b;
    }
}
