package io.realm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f78912a;

    public enum a {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, n0.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL(null, null);

        private static final a[] realmFieldToRealmAnyTypeMap = new a[19];
        private final Class<?> clazz;
        private final RealmFieldType realmFieldType;

        static {
            for (a aVar : values()) {
                if (aVar != NULL) {
                    realmFieldToRealmAnyTypeMap[aVar.realmFieldType.getNativeValue()] = aVar;
                }
            }
            realmFieldToRealmAnyTypeMap[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        a(RealmFieldType realmFieldType, Class cls) {
            this.realmFieldType = realmFieldType;
            this.clazz = cls;
        }

        public static a fromNativeValue(int i11) {
            return i11 == -1 ? NULL : realmFieldToRealmAnyTypeMap[i11];
        }

        public Class<?> getTypedClass() {
            return this.clazz;
        }
    }

    d0(f0 f0Var) {
        this.f78912a = f0Var;
    }

    public static d0 b(String str) {
        return new d0(str == null ? new s() : new v0(str));
    }

    final long a() {
        return this.f78912a.c();
    }

    @SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f78912a.equals(((d0) obj).f78912a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f78912a.hashCode();
    }

    public String toString() {
        return this.f78912a.toString();
    }
}
