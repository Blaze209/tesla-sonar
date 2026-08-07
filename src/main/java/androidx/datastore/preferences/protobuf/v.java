package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class v implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v f8222a = new v();

    private v() {
    }

    public static v a() {
        return f8222a;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public boolean isSupported(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public n0 messageInfoFor(Class<?> cls) {
        if (!w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (n0) w.t(cls.asSubclass(w.class)).i();
        } catch (Exception e11) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e11);
        }
    }
}
