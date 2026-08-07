package io.realm;

import ch.qos.logback.classic.spi.CallerData;
import com.adyen.checkout.components.core.Address;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class j extends p0 implements io.realm.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z<j> f79135a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f79137b;

        static {
            int[] iArr = new int[b.values().length];
            f79137b = iArr;
            try {
                iArr[b.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79137b[b.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79137b[b.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            f79136a = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79136a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f79136a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f79136a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f79136a[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f79136a[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f79136a[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f79136a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f79136a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f79136a[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f79136a[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f79136a[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f79136a[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f79136a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f79136a[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f79136a[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f79136a[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f79136a[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f79136a[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f79136a[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f79136a[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f79136a[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f79136a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f79136a[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f79136a[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f79136a[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f79136a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f79136a[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f79136a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f79136a[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f79136a[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f79136a[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f79136a[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f79136a[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f79136a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f79136a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f79136a[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f79136a[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    private enum b {
        LIST,
        DICTIONARY,
        SET
    }

    j(io.realm.a aVar, io.realm.internal.q qVar) {
        z<j> zVar = new z<>(this);
        this.f79135a = zVar;
        zVar.k(aVar);
        zVar.l(qVar);
        zVar.i();
    }

    private d0 l(long j11) {
        return new d0(f0.b(this.f79135a.c(), this.f79135a.d().getNativeRealmAny(j11)));
    }

    @Override // io.realm.internal.o
    public void d() {
    }

    public boolean equals(Object obj) {
        this.f79135a.c().n();
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            String path = this.f79135a.c().getPath();
            String path2 = jVar.f79135a.c().getPath();
            if (path == null ? path2 != null : !path.equals(path2)) {
                return false;
            }
            String strO = this.f79135a.d().getTable().o();
            String strO2 = jVar.f79135a.d().getTable().o();
            if (strO == null ? strO2 != null : !strO.equals(strO2)) {
                return false;
            }
            if (this.f79135a.d().getObjectKey() == jVar.f79135a.d().getObjectKey()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.realm.internal.o
    public z f() {
        return this.f79135a;
    }

    public int hashCode() {
        this.f79135a.c().n();
        String path = this.f79135a.c().getPath();
        String strO = this.f79135a.d().getTable().o();
        long objectKey = this.f79135a.d().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (strO != null ? strO.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String[] k() {
        this.f79135a.c().n();
        return this.f79135a.d().getColumnNames();
    }

    public String toString() {
        this.f79135a.c().n();
        if (!this.f79135a.d().isValid()) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder(this.f79135a.d().getTable().g() + " = dynamic[");
        for (String str : k()) {
            long columnKey = this.f79135a.d().getColumnKey(str);
            RealmFieldType columnType = this.f79135a.d().getColumnType(columnKey);
            sb2.append("{");
            sb2.append(str);
            sb2.append(":");
            int i11 = a.f79136a[columnType.ordinal()];
            String str2 = Address.ADDRESS_NULL_PLACEHOLDER;
            switch (i11) {
                case 1:
                    Object objValueOf = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        objValueOf = Boolean.valueOf(this.f79135a.d().getBoolean(columnKey));
                    }
                    sb2.append(objValueOf);
                    break;
                case 2:
                    Object objValueOf2 = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        objValueOf2 = Long.valueOf(this.f79135a.d().getLong(columnKey));
                    }
                    sb2.append(objValueOf2);
                    break;
                case 3:
                    Object objValueOf3 = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        objValueOf3 = Float.valueOf(this.f79135a.d().getFloat(columnKey));
                    }
                    sb2.append(objValueOf3);
                    break;
                case 4:
                    Object objValueOf4 = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        objValueOf4 = Double.valueOf(this.f79135a.d().getDouble(columnKey));
                    }
                    sb2.append(objValueOf4);
                    break;
                case 5:
                    sb2.append(this.f79135a.d().getString(columnKey));
                    break;
                case 6:
                    sb2.append(Arrays.toString(this.f79135a.d().getBinaryByteArray(columnKey)));
                    break;
                case 7:
                    Object date = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        date = this.f79135a.d().getDate(columnKey);
                    }
                    sb2.append(date);
                    break;
                case 8:
                    Object decimal128 = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        decimal128 = this.f79135a.d().getDecimal128(columnKey);
                    }
                    sb2.append(decimal128);
                    break;
                case 9:
                    Object objectId = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        objectId = this.f79135a.d().getObjectId(columnKey);
                    }
                    sb2.append(objectId);
                    break;
                case 10:
                    Object objL = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        objL = l(columnKey);
                    }
                    sb2.append(objL);
                    break;
                case 11:
                    Object uuid = str2;
                    if (!this.f79135a.d().isNull(columnKey)) {
                        uuid = this.f79135a.d().getUUID(columnKey);
                    }
                    sb2.append(uuid);
                    break;
                case 12:
                    String strG = str2;
                    if (!this.f79135a.d().isNullLink(columnKey)) {
                        strG = this.f79135a.d().getTable().n(columnKey).g();
                    }
                    sb2.append(strG);
                    break;
                case 13:
                    sb2.append(String.format(Locale.US, "RealmList<%s>[%s]", this.f79135a.d().getTable().n(columnKey).g(), Long.valueOf(this.f79135a.d().getModelList(columnKey).a())));
                    break;
                case 14:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 15:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 16:
                    sb2.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 17:
                    sb2.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 18:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 19:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 20:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 21:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 22:
                    sb2.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 23:
                    sb2.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 24:
                    sb2.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.f79135a.d().getValueMap(columnKey, columnType).a())));
                    break;
                case 25:
                    sb2.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.f79135a.d().getTable().n(columnKey).g(), Long.valueOf(this.f79135a.d().getModelMap(columnKey).a())));
                    break;
                case 26:
                    sb2.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 27:
                    sb2.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 28:
                    sb2.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 29:
                    sb2.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 30:
                    sb2.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 31:
                    sb2.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 32:
                    sb2.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 33:
                    sb2.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 34:
                    sb2.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 35:
                    sb2.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 36:
                    sb2.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.f79135a.d().getTable().n(columnKey).g(), Long.valueOf(this.f79135a.d().getModelSet(columnKey).a())));
                    break;
                case 37:
                    sb2.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.f79135a.d().getValueSet(columnKey, columnType).a())));
                    break;
                case 38:
                default:
                    sb2.append(CallerData.NA);
                    break;
                case 39:
                    sb2.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 40:
                    sb2.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 41:
                    sb2.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 42:
                    sb2.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 43:
                    sb2.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 44:
                    sb2.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 45:
                    sb2.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 46:
                    sb2.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 47:
                    sb2.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 48:
                    sb2.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
                case 49:
                    sb2.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.f79135a.d().getValueList(columnKey, columnType).a())));
                    break;
            }
            sb2.append("},");
        }
        sb2.replace(sb2.length() - 1, sb2.length(), "");
        sb2.append("]");
        return sb2.toString();
    }
}
