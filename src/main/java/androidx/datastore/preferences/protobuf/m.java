package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class<?> f8149a = c();

    public static n a() {
        n nVarB = b("getEmptyRegistry");
        return nVarB != null ? nVarB : n.f8153c;
    }

    private static final n b(String str) {
        Class<?> cls = f8149a;
        if (cls == null) {
            return null;
        }
        try {
            return (n) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
