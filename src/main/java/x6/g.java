package x6;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w<g, a> implements q0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile x0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y.f<String> strings_ = w.s();

    public static final class a extends w.a<g, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a r(Iterable<String> iterable) {
            j();
            ((g) this.f8224b).N(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w.I(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Iterable<String> iterable) {
        O();
        androidx.datastore.preferences.protobuf.a.b(iterable, this.strings_);
    }

    private void O() {
        y.f<String> fVar = this.strings_;
        if (fVar.isModifiable()) {
            return;
        }
        this.strings_ = w.C(fVar);
    }

    public static g P() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.o();
    }

    public List<String> Q() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object r(w.f fVar, Object obj, Object obj2) {
        x0 bVar;
        e eVar = null;
        switch (e.f122805a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return w.E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<g> x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (g.class) {
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
