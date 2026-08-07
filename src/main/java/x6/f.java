package x6;

import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.p1;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w<f, a> implements q0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile x0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0<String, h> preferences_ = j0.e();

    public static final class a extends w.a<f, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a r(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            j();
            ((f) this.f8224b).N().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i0<String, h> f122806a = i0.d(p1.b.STRING, "", p1.b.MESSAGE, h.X());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.I(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, h> N() {
        return P();
    }

    private j0<String, h> P() {
        if (!this.preferences_.k()) {
            this.preferences_ = this.preferences_.n();
        }
        return this.preferences_;
    }

    private j0<String, h> Q() {
        return this.preferences_;
    }

    public static a R() {
        return DEFAULT_INSTANCE.o();
    }

    public static f S(InputStream inputStream) {
        return (f) w.G(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> O() {
        return Collections.unmodifiableMap(Q());
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object r(w.f fVar, Object obj, Object obj2) {
        x0 bVar;
        e eVar = null;
        switch (e.f122805a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return w.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f122806a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<f> x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new w.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
