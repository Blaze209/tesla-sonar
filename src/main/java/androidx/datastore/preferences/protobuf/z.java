package androidx.datastore.preferences.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ z[] $VALUES;
    public static final z BOOLEAN;
    public static final z BYTE_STRING;
    public static final z DOUBLE;
    public static final z ENUM;
    public static final z FLOAT;
    public static final z INT;
    public static final z LONG;
    public static final z MESSAGE;
    public static final z STRING;
    public static final z VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        z zVar = new z("VOID", 0, Void.class, Void.class, null);
        VOID = zVar;
        Class cls = Integer.TYPE;
        z zVar2 = new z("INT", 1, cls, Integer.class, 0);
        INT = zVar2;
        z zVar3 = new z("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = zVar3;
        z zVar4 = new z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        FLOAT = zVar4;
        z zVar5 = new z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = zVar5;
        z zVar6 = new z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = zVar6;
        z zVar7 = new z("STRING", 6, String.class, String.class, "");
        STRING = zVar7;
        z zVar8 = new z("BYTE_STRING", 7, g.class, g.class, g.f8057b);
        BYTE_STRING = zVar8;
        z zVar9 = new z("ENUM", 8, cls, Integer.class, null);
        ENUM = zVar9;
        z zVar10 = new z("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = zVar10;
        $VALUES = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10};
    }

    private z(String str, int i11, Class cls, Class cls2, Object obj) {
        super(str, i11);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
