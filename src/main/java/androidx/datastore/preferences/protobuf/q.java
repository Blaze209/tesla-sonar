package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o<?> f8187a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o<?> f8188b = c();

    static o<?> a() {
        o<?> oVar = f8188b;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static o<?> b() {
        return f8187a;
    }

    private static o<?> c() {
        if (a1.f8036d) {
            return null;
        }
        try {
            return (o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
