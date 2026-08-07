package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a1 f8035c = new a1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f8036d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, e1<?>> f8038b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f8037a = new h0();

    private a1() {
    }

    public static a1 a() {
        return f8035c;
    }

    public e1<?> b(Class<?> cls, e1<?> e1Var) {
        y.b(cls, "messageType");
        y.b(e1Var, "schema");
        return this.f8038b.putIfAbsent(cls, e1Var);
    }

    public <T> e1<T> c(Class<T> cls) {
        y.b(cls, "messageType");
        e1<T> e1VarCreateSchema = (e1) this.f8038b.get(cls);
        if (e1VarCreateSchema == null) {
            e1VarCreateSchema = this.f8037a.createSchema(cls);
            e1<T> e1Var = (e1<T>) b(cls, e1VarCreateSchema);
            if (e1Var != null) {
                return e1Var;
            }
        }
        return e1VarCreateSchema;
    }

    public <T> e1<T> d(T t11) {
        return c(t11.getClass());
    }
}
