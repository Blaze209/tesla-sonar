package zf0;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements qj0.e<s> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f128312a = new t();
    }

    public static t a() {
        return a.f128312a;
    }

    public static s c() {
        return new s();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c();
    }
}
