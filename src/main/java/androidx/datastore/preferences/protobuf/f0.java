package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f8055a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f8056b = new e0();

    static d0 a() {
        return f8055a;
    }

    static d0 b() {
        return f8056b;
    }

    private static d0 c() {
        if (a1.f8036d) {
            return null;
        }
        try {
            return (d0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
