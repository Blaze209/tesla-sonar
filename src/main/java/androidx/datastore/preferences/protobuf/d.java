package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f8052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f8053b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f8054c;

    static {
        f8054c = (f8052a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f8053b;
    }

    static boolean c() {
        if (f8052a) {
            return true;
        }
        return (f8053b == null || f8054c) ? false : true;
    }
}
