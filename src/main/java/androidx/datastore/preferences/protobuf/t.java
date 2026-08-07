package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t BOOL;
    public static final t BOOL_LIST;
    public static final t BOOL_LIST_PACKED;
    public static final t BYTES;
    public static final t BYTES_LIST;
    public static final t DOUBLE;
    public static final t DOUBLE_LIST;
    public static final t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final t ENUM;
    public static final t ENUM_LIST;
    public static final t ENUM_LIST_PACKED;
    public static final t FIXED32;
    public static final t FIXED32_LIST;
    public static final t FIXED32_LIST_PACKED;
    public static final t FIXED64;
    public static final t FIXED64_LIST;
    public static final t FIXED64_LIST_PACKED;
    public static final t FLOAT;
    public static final t FLOAT_LIST;
    public static final t FLOAT_LIST_PACKED;
    public static final t GROUP;
    public static final t GROUP_LIST;
    public static final t INT32;
    public static final t INT32_LIST;
    public static final t INT32_LIST_PACKED;
    public static final t INT64;
    public static final t INT64_LIST;
    public static final t INT64_LIST_PACKED;
    public static final t MAP;
    public static final t MESSAGE;
    public static final t MESSAGE_LIST;
    public static final t SFIXED32;
    public static final t SFIXED32_LIST;
    public static final t SFIXED32_LIST_PACKED;
    public static final t SFIXED64;
    public static final t SFIXED64_LIST;
    public static final t SFIXED64_LIST_PACKED;
    public static final t SINT32;
    public static final t SINT32_LIST;
    public static final t SINT32_LIST_PACKED;
    public static final t SINT64;
    public static final t SINT64_LIST;
    public static final t SINT64_LIST_PACKED;
    public static final t STRING;
    public static final t STRING_LIST;
    public static final t UINT32;
    public static final t UINT32_LIST;
    public static final t UINT32_LIST_PACKED;
    public static final t UINT64;
    public static final t UINT64_LIST;
    public static final t UINT64_LIST_PACKED;
    private static final t[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f8215id;
    private final z javaType;
    private final boolean primitiveScalar;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8217b;

        static {
            int[] iArr = new int[z.values().length];
            f8217b = iArr;
            try {
                iArr[z.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8217b[z.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8217b[z.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f8216a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8216a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8216a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z11) {
            this.isList = z11;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        b bVar = b.SCALAR;
        z zVar = z.DOUBLE;
        t tVar = new t("DOUBLE", 0, 0, bVar, zVar);
        DOUBLE = tVar;
        z zVar2 = z.FLOAT;
        t tVar2 = new t("FLOAT", 1, 1, bVar, zVar2);
        FLOAT = tVar2;
        z zVar3 = z.LONG;
        t tVar3 = new t("INT64", 2, 2, bVar, zVar3);
        INT64 = tVar3;
        t tVar4 = new t("UINT64", 3, 3, bVar, zVar3);
        UINT64 = tVar4;
        z zVar4 = z.INT;
        t tVar5 = new t("INT32", 4, 4, bVar, zVar4);
        INT32 = tVar5;
        t tVar6 = new t("FIXED64", 5, 5, bVar, zVar3);
        FIXED64 = tVar6;
        t tVar7 = new t("FIXED32", 6, 6, bVar, zVar4);
        FIXED32 = tVar7;
        z zVar5 = z.BOOLEAN;
        t tVar8 = new t("BOOL", 7, 7, bVar, zVar5);
        BOOL = tVar8;
        z zVar6 = z.STRING;
        t tVar9 = new t("STRING", 8, 8, bVar, zVar6);
        STRING = tVar9;
        z zVar7 = z.MESSAGE;
        t tVar10 = new t("MESSAGE", 9, 9, bVar, zVar7);
        MESSAGE = tVar10;
        z zVar8 = z.BYTE_STRING;
        t tVar11 = new t("BYTES", 10, 10, bVar, zVar8);
        BYTES = tVar11;
        t tVar12 = new t("UINT32", 11, 11, bVar, zVar4);
        UINT32 = tVar12;
        z zVar9 = z.ENUM;
        t tVar13 = new t("ENUM", 12, 12, bVar, zVar9);
        ENUM = tVar13;
        t tVar14 = new t("SFIXED32", 13, 13, bVar, zVar4);
        SFIXED32 = tVar14;
        t tVar15 = new t("SFIXED64", 14, 14, bVar, zVar3);
        SFIXED64 = tVar15;
        t tVar16 = new t("SINT32", 15, 15, bVar, zVar4);
        SINT32 = tVar16;
        t tVar17 = new t("SINT64", 16, 16, bVar, zVar3);
        SINT64 = tVar17;
        t tVar18 = new t("GROUP", 17, 17, bVar, zVar7);
        GROUP = tVar18;
        b bVar2 = b.VECTOR;
        t tVar19 = new t("DOUBLE_LIST", 18, 18, bVar2, zVar);
        DOUBLE_LIST = tVar19;
        t tVar20 = new t("FLOAT_LIST", 19, 19, bVar2, zVar2);
        FLOAT_LIST = tVar20;
        t tVar21 = new t("INT64_LIST", 20, 20, bVar2, zVar3);
        INT64_LIST = tVar21;
        t tVar22 = new t("UINT64_LIST", 21, 21, bVar2, zVar3);
        UINT64_LIST = tVar22;
        t tVar23 = new t("INT32_LIST", 22, 22, bVar2, zVar4);
        INT32_LIST = tVar23;
        t tVar24 = new t("FIXED64_LIST", 23, 23, bVar2, zVar3);
        FIXED64_LIST = tVar24;
        t tVar25 = new t("FIXED32_LIST", 24, 24, bVar2, zVar4);
        FIXED32_LIST = tVar25;
        t tVar26 = new t("BOOL_LIST", 25, 25, bVar2, zVar5);
        BOOL_LIST = tVar26;
        t tVar27 = new t("STRING_LIST", 26, 26, bVar2, zVar6);
        STRING_LIST = tVar27;
        t tVar28 = new t("MESSAGE_LIST", 27, 27, bVar2, zVar7);
        MESSAGE_LIST = tVar28;
        t tVar29 = new t("BYTES_LIST", 28, 28, bVar2, zVar8);
        BYTES_LIST = tVar29;
        t tVar30 = new t("UINT32_LIST", 29, 29, bVar2, zVar4);
        UINT32_LIST = tVar30;
        t tVar31 = new t("ENUM_LIST", 30, 30, bVar2, zVar9);
        ENUM_LIST = tVar31;
        t tVar32 = new t("SFIXED32_LIST", 31, 31, bVar2, zVar4);
        SFIXED32_LIST = tVar32;
        t tVar33 = new t("SFIXED64_LIST", 32, 32, bVar2, zVar3);
        SFIXED64_LIST = tVar33;
        t tVar34 = new t("SINT32_LIST", 33, 33, bVar2, zVar4);
        SINT32_LIST = tVar34;
        t tVar35 = new t("SINT64_LIST", 34, 34, bVar2, zVar3);
        SINT64_LIST = tVar35;
        b bVar3 = b.PACKED_VECTOR;
        t tVar36 = new t("DOUBLE_LIST_PACKED", 35, 35, bVar3, zVar);
        DOUBLE_LIST_PACKED = tVar36;
        t tVar37 = new t("FLOAT_LIST_PACKED", 36, 36, bVar3, zVar2);
        FLOAT_LIST_PACKED = tVar37;
        t tVar38 = new t("INT64_LIST_PACKED", 37, 37, bVar3, zVar3);
        INT64_LIST_PACKED = tVar38;
        t tVar39 = new t("UINT64_LIST_PACKED", 38, 38, bVar3, zVar3);
        UINT64_LIST_PACKED = tVar39;
        t tVar40 = new t("INT32_LIST_PACKED", 39, 39, bVar3, zVar4);
        INT32_LIST_PACKED = tVar40;
        t tVar41 = new t("FIXED64_LIST_PACKED", 40, 40, bVar3, zVar3);
        FIXED64_LIST_PACKED = tVar41;
        t tVar42 = new t("FIXED32_LIST_PACKED", 41, 41, bVar3, zVar4);
        FIXED32_LIST_PACKED = tVar42;
        t tVar43 = new t("BOOL_LIST_PACKED", 42, 42, bVar3, zVar5);
        BOOL_LIST_PACKED = tVar43;
        t tVar44 = new t("UINT32_LIST_PACKED", 43, 43, bVar3, zVar4);
        UINT32_LIST_PACKED = tVar44;
        t tVar45 = new t("ENUM_LIST_PACKED", 44, 44, bVar3, zVar9);
        ENUM_LIST_PACKED = tVar45;
        t tVar46 = new t("SFIXED32_LIST_PACKED", 45, 45, bVar3, zVar4);
        SFIXED32_LIST_PACKED = tVar46;
        t tVar47 = new t("SFIXED64_LIST_PACKED", 46, 46, bVar3, zVar3);
        SFIXED64_LIST_PACKED = tVar47;
        t tVar48 = new t("SINT32_LIST_PACKED", 47, 47, bVar3, zVar4);
        SINT32_LIST_PACKED = tVar48;
        t tVar49 = new t("SINT64_LIST_PACKED", 48, 48, bVar3, zVar3);
        SINT64_LIST_PACKED = tVar49;
        t tVar50 = new t("GROUP_LIST", 49, 49, bVar2, zVar7);
        GROUP_LIST = tVar50;
        t tVar51 = new t("MAP", 50, 50, b.MAP, z.VOID);
        MAP = tVar51;
        $VALUES = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15, tVar16, tVar17, tVar18, tVar19, tVar20, tVar21, tVar22, tVar23, tVar24, tVar25, tVar26, tVar27, tVar28, tVar29, tVar30, tVar31, tVar32, tVar33, tVar34, tVar35, tVar36, tVar37, tVar38, tVar39, tVar40, tVar41, tVar42, tVar43, tVar44, tVar45, tVar46, tVar47, tVar48, tVar49, tVar50, tVar51};
        EMPTY_TYPES = new Type[0];
        t[] tVarArrValues = values();
        VALUES = new t[tVarArrValues.length];
        for (t tVar52 : tVarArrValues) {
            VALUES[tVar52.f8215id] = tVar52;
        }
    }

    private t(String str, int i11, int i12, b bVar, z zVar) {
        int i13;
        super(str, i11);
        this.f8215id = i12;
        this.collection = bVar;
        this.javaType = zVar;
        int i14 = a.f8216a[bVar.ordinal()];
        if (i14 == 1 || i14 == 2) {
            this.elementType = zVar.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i13 = a.f8217b[zVar.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static t forId(int i11) {
        if (i11 < 0) {
            return null;
        }
        t[] tVarArr = VALUES;
        if (i11 >= tVarArr.length) {
            return null;
        }
        return tVarArr[i11];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i11 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i11 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i11];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i11++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i12 = 0; i12 < actualTypeArguments.length; i12++) {
                    Type type = actualTypeArguments[i12];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i13 = 0;
                        while (true) {
                            if (i13 >= typeParameters.length) {
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            if (type == typeParameters[i13]) {
                                actualTypeArguments[i12] = typeArr[i13];
                                break;
                            }
                            i13++;
                        }
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public z getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f8215id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
