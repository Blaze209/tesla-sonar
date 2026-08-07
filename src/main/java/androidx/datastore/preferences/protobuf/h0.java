package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class h0 implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o0 f8098b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f8099a;

    class a implements o0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public n0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8100a;

        static {
            int[] iArr = new int[z0.values().length];
            f8100a = iArr;
            try {
                iArr[z0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o0[] f8101a;

        c(o0... o0VarArr) {
            this.f8101a = o0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public boolean isSupported(Class<?> cls) {
            for (o0 o0Var : this.f8101a) {
                if (o0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.o0
        public n0 messageInfoFor(Class<?> cls) {
            for (o0 o0Var : this.f8101a) {
                if (o0Var.isSupported(cls)) {
                    return o0Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public h0() {
        this(b());
    }

    private static boolean a(n0 n0Var) {
        return b.f8100a[n0Var.getSyntax().ordinal()] != 1;
    }

    private static o0 b() {
        return new c(v.a(), c());
    }

    private static o0 c() {
        if (a1.f8036d) {
            return f8098b;
        }
        try {
            return (o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f8098b;
        }
    }

    private static <T> e1<T> d(Class<T> cls, n0 n0Var) {
        if (e(cls)) {
            return s0.H(cls, n0Var, w0.b(), f0.b(), g1.L(), a(n0Var) ? q.b() : null, m0.b());
        }
        u0 u0VarA = w0.a();
        o<?> oVarA = null;
        d0 d0VarA = f0.a();
        k1<?, ?> k1VarK = g1.K();
        if (a(n0Var)) {
            oVarA = q.a();
        }
        return s0.H(cls, n0Var, u0VarA, d0VarA, k1VarK, oVarA, m0.a());
    }

    private static boolean e(Class<?> cls) {
        return a1.f8036d || w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> e1<T> createSchema(Class<T> cls) {
        g1.H(cls);
        n0 n0VarMessageInfoFor = this.f8099a.messageInfoFor(cls);
        if (n0VarMessageInfoFor.isMessageSetWireFormat()) {
            return e(cls) ? t0.e(g1.L(), q.b(), n0VarMessageInfoFor.getDefaultInstance()) : t0.e(g1.K(), q.a(), n0VarMessageInfoFor.getDefaultInstance());
        }
        return d(cls, n0VarMessageInfoFor);
    }

    private h0(o0 o0Var) {
        this.f8099a = (o0) y.b(o0Var, "messageInfoFactory");
    }
}
