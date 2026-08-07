package m40;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements qj0.e<Boolean> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f91180a = new i();
    }

    public static i a() {
        return a.f91180a;
    }

    public static boolean c() {
        return f.f91173a.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
