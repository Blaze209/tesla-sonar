package x6;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w<h, a> implements q0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends w.a<h, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a r(boolean z11) {
            j();
            ((h) this.f8224b).g0(z11);
            return this;
        }

        public a s(androidx.datastore.preferences.protobuf.g gVar) {
            j();
            ((h) this.f8224b).h0(gVar);
            return this;
        }

        public a t(double d11) {
            j();
            ((h) this.f8224b).i0(d11);
            return this;
        }

        public a u(float f11) {
            j();
            ((h) this.f8224b).j0(f11);
            return this;
        }

        public a v(int i11) {
            j();
            ((h) this.f8224b).k0(i11);
            return this;
        }

        public a w(long j11) {
            j();
            ((h) this.f8224b).l0(j11);
            return this;
        }

        public a x(String str) {
            j();
            ((h) this.f8224b).m0(str);
            return this;
        }

        public a y(g.a aVar) {
            j();
            ((h) this.f8224b).n0(aVar.build());
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i11) {
            this.value = i11;
        }

        public static b forNumber(int i11) {
            switch (i11) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        w.I(h.class, hVar);
    }

    private h() {
    }

    public static h X() {
        return DEFAULT_INSTANCE;
    }

    public static a f0() {
        return DEFAULT_INSTANCE.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(boolean z11) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(androidx.datastore.preferences.protobuf.g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(double d11) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(float f11) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i11) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(long j11) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean V() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public androidx.datastore.preferences.protobuf.g W() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.f8057b;
    }

    public double Y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float Z() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public int a0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long b0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String c0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g d0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.P();
    }

    public b e0() {
        return b.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object r(w.f fVar, Object obj, Object obj2) {
        x0 bVar;
        e eVar = null;
        switch (e.f122805a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return w.E(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<h> x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (h.class) {
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
