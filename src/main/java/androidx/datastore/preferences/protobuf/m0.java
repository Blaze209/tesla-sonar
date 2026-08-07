package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k0 f8150a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k0 f8151b = new l0();

    static k0 a() {
        return f8150a;
    }

    static k0 b() {
        return f8151b;
    }

    private static k0 c() {
        if (a1.f8036d) {
            return null;
        }
        try {
            return (k0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
