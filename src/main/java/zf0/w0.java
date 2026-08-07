package zf0;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 implements qj0.e<v0> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final w0 f128334a = new w0();
    }

    public static w0 a() {
        return a.f128334a;
    }

    public static v0 c() {
        return new v0();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c();
    }
}
