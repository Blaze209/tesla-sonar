package com.squareup.moshi;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.squareup.moshi.h.e f49519a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.squareup.moshi.h<Boolean> f49520b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.squareup.moshi.h<Byte> f49521c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final com.squareup.moshi.h<Character> f49522d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.squareup.moshi.h<Double> f49523e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final com.squareup.moshi.h<Float> f49524f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final com.squareup.moshi.h<Integer> f49525g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final com.squareup.moshi.h<Long> f49526h = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final com.squareup.moshi.h<Short> f49527i = new k();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final com.squareup.moshi.h<String> f49528j = new a();

    class a extends com.squareup.moshi.h<String> {
        a() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(com.squareup.moshi.k kVar) {
            return kVar.O();
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, String str) {
            rVar.G0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49529a;

        static {
            int[] iArr = new int[com.squareup.moshi.k.c.values().length];
            f49529a = iArr;
            try {
                iArr[com.squareup.moshi.k.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49529a[com.squareup.moshi.k.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49529a[com.squareup.moshi.k.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49529a[com.squareup.moshi.k.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49529a[com.squareup.moshi.k.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49529a[com.squareup.moshi.k.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class c implements com.squareup.moshi.h.e {
        c() {
        }

        @Override // com.squareup.moshi.h.e
        public com.squareup.moshi.h<?> create(Type type, Set<? extends Annotation> set, u uVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return w.f49520b;
            }
            if (type == Byte.TYPE) {
                return w.f49521c;
            }
            if (type == Character.TYPE) {
                return w.f49522d;
            }
            if (type == Double.TYPE) {
                return w.f49523e;
            }
            if (type == Float.TYPE) {
                return w.f49524f;
            }
            if (type == Integer.TYPE) {
                return w.f49525g;
            }
            if (type == Long.TYPE) {
                return w.f49526h;
            }
            if (type == Short.TYPE) {
                return w.f49527i;
            }
            if (type == Boolean.class) {
                return w.f49520b.nullSafe();
            }
            if (type == Byte.class) {
                return w.f49521c.nullSafe();
            }
            if (type == Character.class) {
                return w.f49522d.nullSafe();
            }
            if (type == Double.class) {
                return w.f49523e.nullSafe();
            }
            if (type == Float.class) {
                return w.f49524f.nullSafe();
            }
            if (type == Integer.class) {
                return w.f49525g.nullSafe();
            }
            if (type == Long.class) {
                return w.f49526h.nullSafe();
            }
            if (type == Short.class) {
                return w.f49527i.nullSafe();
            }
            if (type == String.class) {
                return w.f49528j.nullSafe();
            }
            if (type == Object.class) {
                return new m(uVar).nullSafe();
            }
            Class<?> clsG = y.g(type);
            com.squareup.moshi.h<?> hVarD = v20.c.d(uVar, type, clsG);
            if (hVarD != null) {
                return hVarD;
            }
            if (clsG.isEnum()) {
                return new l(clsG).nullSafe();
            }
            return null;
        }
    }

    class d extends com.squareup.moshi.h<Boolean> {
        d() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(com.squareup.moshi.k kVar) {
            return Boolean.valueOf(kVar.nextBoolean());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Boolean bool) {
            rVar.J0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    class e extends com.squareup.moshi.h<Byte> {
        e() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(com.squareup.moshi.k kVar) {
            return Byte.valueOf((byte) w.a(kVar, "a byte", RangingPosition.RSSI_UNKNOWN, 255));
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Byte b11) {
            rVar.y0(b11.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    class f extends com.squareup.moshi.h<Character> {
        f() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(com.squareup.moshi.k kVar) {
            String strO = kVar.O();
            if (strO.length() <= 1) {
                return Character.valueOf(strO.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", CoreConstants.DOUBLE_QUOTE_CHAR + strO + CoreConstants.DOUBLE_QUOTE_CHAR, kVar.getPath()));
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Character ch2) {
            rVar.G0(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    class g extends com.squareup.moshi.h<Double> {
        g() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(com.squareup.moshi.k kVar) {
            return Double.valueOf(kVar.nextDouble());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Double d11) {
            rVar.w0(d11.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    class h extends com.squareup.moshi.h<Float> {
        h() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(com.squareup.moshi.k kVar) {
            float fNextDouble = (float) kVar.nextDouble();
            if (kVar.n() || !Float.isInfinite(fNextDouble)) {
                return Float.valueOf(fNextDouble);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + fNextDouble + " at path " + kVar.getPath());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Float f11) {
            f11.getClass();
            rVar.D0(f11);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    class i extends com.squareup.moshi.h<Integer> {
        i() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(com.squareup.moshi.k kVar) {
            return Integer.valueOf(kVar.nextInt());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Integer num) {
            rVar.y0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    class j extends com.squareup.moshi.h<Long> {
        j() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(com.squareup.moshi.k kVar) {
            return Long.valueOf(kVar.nextLong());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Long l11) {
            rVar.y0(l11.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    class k extends com.squareup.moshi.h<Short> {
        k() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(com.squareup.moshi.k kVar) {
            return Short.valueOf((short) w.a(kVar, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, Short sh2) {
            rVar.y0(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    static final class l<T extends Enum<T>> extends com.squareup.moshi.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f49530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f49531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T[] f49532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.k.b f49533d;

        l(Class<T> cls) {
            this.f49530a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f49532c = enumConstants;
                this.f49531b = new String[enumConstants.length];
                int i11 = 0;
                while (true) {
                    T[] tArr = this.f49532c;
                    if (i11 >= tArr.length) {
                        this.f49533d = com.squareup.moshi.k.b.a(this.f49531b);
                        return;
                    } else {
                        String strName = tArr[i11].name();
                        this.f49531b[i11] = v20.c.n(strName, cls.getField(strName));
                        i11++;
                    }
                }
            } catch (NoSuchFieldException e11) {
                throw new AssertionError("Missing field in " + cls.getName(), e11);
            }
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(com.squareup.moshi.k kVar) {
            int iB0 = kVar.b0(this.f49533d);
            if (iB0 != -1) {
                return this.f49532c[iB0];
            }
            String path = kVar.getPath();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f49531b) + " but was " + kVar.O() + " at path " + path);
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(r rVar, T t11) {
            rVar.G0(this.f49531b[t11.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f49530a.getName() + ")";
        }
    }

    static final class m extends com.squareup.moshi.h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f49534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.squareup.moshi.h<List> f49535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.squareup.moshi.h<Map> f49536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.h<String> f49537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.squareup.moshi.h<Double> f49538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.squareup.moshi.h<Boolean> f49539f;

        m(u uVar) {
            this.f49534a = uVar;
            this.f49535b = uVar.c(List.class);
            this.f49536c = uVar.c(Map.class);
            this.f49537d = uVar.c(String.class);
            this.f49538e = uVar.c(Double.class);
            this.f49539f = uVar.c(Boolean.class);
        }

        private Class<?> a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(com.squareup.moshi.k kVar) {
            switch (b.f49529a[kVar.B().ordinal()]) {
                case 1:
                    return this.f49535b.fromJson(kVar);
                case 2:
                    return this.f49536c.fromJson(kVar);
                case 3:
                    return this.f49537d.fromJson(kVar);
                case 4:
                    return this.f49538e.fromJson(kVar);
                case 5:
                    return this.f49539f.fromJson(kVar);
                case 6:
                    return kVar.o();
                default:
                    throw new IllegalStateException("Expected a value but was " + kVar.B() + " at path " + kVar.getPath());
            }
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f49534a.e(a(cls), v20.c.f117641a).toJson(rVar, obj);
            } else {
                rVar.o();
                rVar.C();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    static int a(com.squareup.moshi.k kVar, String str, int i11, int i12) {
        int iNextInt = kVar.nextInt();
        if (iNextInt < i11 || iNextInt > i12) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iNextInt), kVar.getPath()));
        }
        return iNextInt;
    }
}
