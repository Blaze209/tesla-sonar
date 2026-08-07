package io.realm;

import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Map<Class<?>, b> f79153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Map<Class<?>, b> f79154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Map<Class<?>, b> f79155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final Map<Class<?>, b> f79156h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final t0 f79157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.realm.a f79158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Table f79159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.realm.internal.c f79160d;

    static final class a extends io.realm.internal.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Table f79161e;

        a(Table table) {
            super((io.realm.internal.c) null, false);
            this.f79161e = table;
        }

        @Override // io.realm.internal.c
        protected void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        @Override // io.realm.internal.c
        public void c(io.realm.internal.c cVar) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RealmFieldType f79162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final RealmFieldType f79163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f79164c;

        b(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z11) {
            this.f79162a = realmFieldType;
            this.f79163b = realmFieldType2;
            this.f79164c = z11;
        }
    }

    static {
        HashMap map = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        map.put(String.class, new b(realmFieldType, RealmFieldType.STRING_LIST, true));
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        b bVar = new b(realmFieldType2, realmFieldType3, false);
        Class cls = Short.TYPE;
        map.put(cls, bVar);
        map.put(Short.class, new b(realmFieldType2, realmFieldType3, true));
        b bVar2 = new b(realmFieldType2, realmFieldType3, false);
        Class cls2 = Integer.TYPE;
        map.put(cls2, bVar2);
        map.put(Integer.class, new b(realmFieldType2, realmFieldType3, true));
        b bVar3 = new b(realmFieldType2, realmFieldType3, false);
        Class cls3 = Long.TYPE;
        map.put(cls3, bVar3);
        map.put(Long.class, new b(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        b bVar4 = new b(realmFieldType4, realmFieldType5, false);
        Class cls4 = Float.TYPE;
        map.put(cls4, bVar4);
        map.put(Float.class, new b(realmFieldType4, realmFieldType5, true));
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        b bVar5 = new b(realmFieldType6, realmFieldType7, false);
        Class cls5 = Double.TYPE;
        map.put(cls5, bVar5);
        map.put(Double.class, new b(realmFieldType6, realmFieldType7, true));
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        b bVar6 = new b(realmFieldType8, realmFieldType9, false);
        Class cls6 = Boolean.TYPE;
        map.put(cls6, bVar6);
        map.put(Boolean.class, new b(realmFieldType8, realmFieldType9, true));
        b bVar7 = new b(realmFieldType2, realmFieldType3, false);
        Class cls7 = Byte.TYPE;
        map.put(cls7, bVar7);
        map.put(Byte.class, new b(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        map.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        map.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        map.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        map.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        map.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        map.put(d0.class, new b(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        f79153e = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put(String.class, new b(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        map2.put(cls, new b(realmFieldType2, realmFieldType16, false));
        map2.put(Short.class, new b(realmFieldType2, realmFieldType16, true));
        map2.put(cls2, new b(realmFieldType2, realmFieldType16, false));
        map2.put(Integer.class, new b(realmFieldType2, realmFieldType16, true));
        map2.put(cls3, new b(realmFieldType2, realmFieldType16, false));
        map2.put(Long.class, new b(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        map2.put(cls4, new b(realmFieldType4, realmFieldType17, false));
        map2.put(Float.class, new b(realmFieldType4, realmFieldType17, true));
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        map2.put(cls5, new b(realmFieldType6, realmFieldType18, false));
        map2.put(Double.class, new b(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        map2.put(cls6, new b(realmFieldType8, realmFieldType19, false));
        map2.put(Boolean.class, new b(realmFieldType8, realmFieldType19, true));
        map2.put(cls7, new b(realmFieldType2, realmFieldType16, false));
        map2.put(Byte.class, new b(realmFieldType2, realmFieldType16, true));
        map2.put(byte[].class, new b(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        map2.put(Date.class, new b(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        map2.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        map2.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        map2.put(UUID.class, new b(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        map2.put(d0.class, new b(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        f79154f = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        map3.put(String.class, new b(realmFieldType, RealmFieldType.STRING_SET, true));
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        map3.put(cls, new b(realmFieldType2, realmFieldType20, false));
        map3.put(Short.class, new b(realmFieldType2, realmFieldType20, true));
        map3.put(cls2, new b(realmFieldType2, realmFieldType20, false));
        map3.put(Integer.class, new b(realmFieldType2, realmFieldType20, true));
        map3.put(cls3, new b(realmFieldType2, realmFieldType20, false));
        map3.put(Long.class, new b(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        map3.put(cls4, new b(realmFieldType4, realmFieldType21, false));
        map3.put(Float.class, new b(realmFieldType4, realmFieldType21, true));
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        map3.put(cls5, new b(realmFieldType6, realmFieldType22, false));
        map3.put(Double.class, new b(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        map3.put(cls6, new b(realmFieldType8, realmFieldType23, false));
        map3.put(Boolean.class, new b(realmFieldType8, realmFieldType23, true));
        map3.put(cls7, new b(realmFieldType2, realmFieldType20, false));
        map3.put(Byte.class, new b(realmFieldType2, realmFieldType20, true));
        map3.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_SET, true));
        map3.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_SET, true));
        map3.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        map3.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        map3.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_SET, true));
        map3.put(d0.class, new b(realmFieldType15, RealmFieldType.MIXED_SET, true));
        f79155g = Collections.unmodifiableMap(map3);
        HashMap map4 = new HashMap();
        map4.put(p0.class, new b(RealmFieldType.OBJECT, null, false));
        map4.put(k0.class, new b(RealmFieldType.LIST, null, false));
        map4.put(j0.class, new b(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        map4.put(u0.class, new b(RealmFieldType.LINK_SET, null, false));
        f79156h = Collections.unmodifiableMap(map4);
    }

    r0(io.realm.a aVar, t0 t0Var, Table table, io.realm.internal.c cVar) {
        this.f79157a = t0Var;
        this.f79158b = aVar;
        this.f79159c = table;
        this.f79160d = cVar;
    }

    static void c(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        }
        if (str.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        if (str.length() > 63) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    public abstract r0 a(String str, Class<?> cls, k... kVarArr);

    void b(String str) {
        if (this.f79159c.j(str) != -1) {
            return;
        }
        throw new IllegalArgumentException("Field name doesn't exist on object '" + d() + "': " + str);
    }

    public String d() {
        return this.f79159c.g();
    }

    long e(String str) {
        long j11 = this.f79159c.j(str);
        if (j11 != -1) {
            return j11;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, d()));
    }

    public RealmFieldType f(String str) {
        return this.f79159c.m(e(str));
    }

    Table g() {
        return this.f79159c;
    }
}
