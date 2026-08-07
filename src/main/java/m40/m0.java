package m40;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements qj0.e<wo0.b> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final m0 f91194a = new m0();
    }

    public static m0 a() {
        return a.f91194a;
    }

    public static wo0.b c() {
        return (wo0.b) qj0.h.d(b0.INSTANCE.m());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wo0.b get() {
        return c();
    }
}
