package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f8157a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f8158b = androidx.datastore.preferences.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f8159c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f8160d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f8161e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f8162f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f8163g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f8164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f8165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f8166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f8167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f8168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f8169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f8170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f8171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f8172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f8173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f8174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f8175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f8176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f8177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f8178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f8179w;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean c(Object obj, long j11) {
            return n1.f8179w ? n1.q(obj, j11) : n1.r(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public double d(Object obj, long j11) {
            return Double.longBitsToDouble(g(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public float e(Object obj, long j11) {
            return Float.intBitsToFloat(f(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void j(Object obj, long j11, boolean z11) {
            if (n1.f8179w) {
                n1.F(obj, j11, z11);
            } else {
                n1.G(obj, j11, z11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void k(Object obj, long j11, byte b11) {
            if (n1.f8179w) {
                n1.I(obj, j11, b11);
            } else {
                n1.J(obj, j11, b11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void l(Object obj, long j11, double d11) {
            o(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void m(Object obj, long j11, float f11) {
            n(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean c(Object obj, long j11) {
            return n1.f8179w ? n1.q(obj, j11) : n1.r(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public double d(Object obj, long j11) {
            return Double.longBitsToDouble(g(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public float e(Object obj, long j11) {
            return Float.intBitsToFloat(f(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void j(Object obj, long j11, boolean z11) {
            if (n1.f8179w) {
                n1.F(obj, j11, z11);
            } else {
                n1.G(obj, j11, z11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void k(Object obj, long j11, byte b11) {
            if (n1.f8179w) {
                n1.I(obj, j11, b11);
            } else {
                n1.J(obj, j11, b11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void l(Object obj, long j11, double d11) {
            o(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void m(Object obj, long j11, float f11) {
            n(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean c(Object obj, long j11) {
            return this.f8180a.getBoolean(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public double d(Object obj, long j11) {
            return this.f8180a.getDouble(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public float e(Object obj, long j11) {
            return this.f8180a.getFloat(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void j(Object obj, long j11, boolean z11) {
            this.f8180a.putBoolean(obj, j11, z11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void k(Object obj, long j11, byte b11) {
            this.f8180a.putByte(obj, j11, b11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void l(Object obj, long j11, double d11) {
            this.f8180a.putDouble(obj, j11, d11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void m(Object obj, long j11, float f11) {
            this.f8180a.putFloat(obj, j11, f11);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f8180a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                n1.D(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f8180a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                n1.D(th2);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f8180a;

        e(Unsafe unsafe) {
            this.f8180a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f8180a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f8180a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j11);

        public abstract double d(Object obj, long j11);

        public abstract float e(Object obj, long j11);

        public final int f(Object obj, long j11) {
            return this.f8180a.getInt(obj, j11);
        }

        public final long g(Object obj, long j11) {
            return this.f8180a.getLong(obj, j11);
        }

        public final Object h(Object obj, long j11) {
            return this.f8180a.getObject(obj, j11);
        }

        public final long i(Field field) {
            return this.f8180a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j11, boolean z11);

        public abstract void k(Object obj, long j11, byte b11);

        public abstract void l(Object obj, long j11, double d11);

        public abstract void m(Object obj, long j11, float f11);

        public final void n(Object obj, long j11, int i11) {
            this.f8180a.putInt(obj, j11, i11);
        }

        public final void o(Object obj, long j11, long j12) {
            this.f8180a.putLong(obj, j11, j12);
        }

        public final void p(Object obj, long j11, Object obj2) {
            this.f8180a.putObject(obj, j11, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f8180a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                n1.D(th2);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f8180a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return n1.l() != null;
            } catch (Throwable th2) {
                n1.D(th2);
                return false;
            }
        }
    }

    static {
        long j11 = j(byte[].class);
        f8164h = j11;
        f8165i = j(boolean[].class);
        f8166j = k(boolean[].class);
        f8167k = j(int[].class);
        f8168l = k(int[].class);
        f8169m = j(long[].class);
        f8170n = k(long[].class);
        f8171o = j(float[].class);
        f8172p = k(float[].class);
        f8173q = j(double[].class);
        f8174r = k(double[].class);
        f8175s = j(Object[].class);
        f8176t = k(Object[].class);
        f8177u = o(l());
        f8178v = (int) (j11 & 7);
        f8179w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private n1() {
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f8163g;
    }

    static boolean C() {
        return f8162f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th2) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void E(Object obj, long j11, boolean z11) {
        f8161e.j(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j11, boolean z11) {
        I(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j11, boolean z11) {
        J(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j11, byte b11) {
        f8161e.k(bArr, f8164h + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int iW = w(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (iW & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (w(obj, j12) & (~(255 << i11))));
    }

    static void K(Object obj, long j11, double d11) {
        f8161e.l(obj, j11, d11);
    }

    static void L(Object obj, long j11, float f11) {
        f8161e.m(obj, j11, f11);
    }

    static void M(Object obj, long j11, int i11) {
        f8161e.n(obj, j11, i11);
    }

    static void N(Object obj, long j11, long j12) {
        f8161e.o(obj, j11, j12);
    }

    static void O(Object obj, long j11, Object obj2) {
        f8161e.p(obj, j11, obj2);
    }

    private static boolean P() {
        e eVar = f8161e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f8161e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f8157a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int j(Class<?> cls) {
        if (f8163g) {
            return f8161e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f8163g) {
            return f8161e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (androidx.datastore.preferences.protobuf.d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f8158b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f8161e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j11) {
        return f8161e.c(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j11) {
        return s(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j11) {
        return t(obj, j11) != 0;
    }

    private static byte s(Object obj, long j11) {
        return (byte) ((w(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j11) {
        return (byte) ((w(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j11) {
        return f8161e.d(obj, j11);
    }

    static float v(Object obj, long j11) {
        return f8161e.e(obj, j11);
    }

    static int w(Object obj, long j11) {
        return f8161e.f(obj, j11);
    }

    static long x(Object obj, long j11) {
        return f8161e.g(obj, j11);
    }

    private static e y() {
        Unsafe unsafe = f8157a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f8159c) {
            return new c(unsafe);
        }
        if (f8160d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j11) {
        return f8161e.h(obj, j11);
    }
}
