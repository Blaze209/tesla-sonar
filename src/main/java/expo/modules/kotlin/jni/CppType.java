package expo.modules.kotlin.jni;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.typedarray.TypedArray;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/jni/CppType;", "", "Lco0/d;", "clazz", "", "value", "<init>", "(Ljava/lang/String;ILco0/d;I)V", "Lco0/d;", "getClazz", "()Lco0/d;", "I", "getValue", "()I", "NONE", "DOUBLE", "INT", "LONG", "FLOAT", "BOOLEAN", "STRING", "JS_OBJECT", "JS_VALUE", "READABLE_ARRAY", "READABLE_MAP", "UINT8_TYPED_ARRAY", "TYPED_ARRAY", "PRIMITIVE_ARRAY", "LIST", "MAP", "VIEW_TAG", "SHARED_OBJECT_ID", "JS_FUNCTION", "ANY", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CppType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CppType[] $VALUES;
    public static final CppType ANY;
    public static final CppType BOOLEAN;
    public static final CppType FLOAT;
    public static final CppType INT;
    public static final CppType JS_FUNCTION;
    public static final CppType JS_OBJECT;
    public static final CppType JS_VALUE;
    public static final CppType LIST;
    public static final CppType LONG;
    public static final CppType MAP;
    public static final CppType PRIMITIVE_ARRAY;
    public static final CppType READABLE_ARRAY;
    public static final CppType READABLE_MAP;
    public static final CppType SHARED_OBJECT_ID;
    public static final CppType STRING;
    public static final CppType TYPED_ARRAY;
    public static final CppType UINT8_TYPED_ARRAY;
    public static final CppType VIEW_TAG;
    private final co0.d<?> clazz;
    private final int value;
    public static final CppType NONE = new CppType("NONE", 0, o0.b(Void.class), 0);
    public static final CppType DOUBLE = new CppType("DOUBLE", 1, o0.b(Double.TYPE), 0, 2, null);

    private static final /* synthetic */ CppType[] $values() {
        return new CppType[]{NONE, DOUBLE, INT, LONG, FLOAT, BOOLEAN, STRING, JS_OBJECT, JS_VALUE, READABLE_ARRAY, READABLE_MAP, UINT8_TYPED_ARRAY, TYPED_ARRAY, PRIMITIVE_ARRAY, LIST, MAP, VIEW_TAG, SHARED_OBJECT_ID, JS_FUNCTION, ANY};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new CppType("INT", 2, o0.b(cls), 0, 2, null);
        LONG = new CppType("LONG", 3, o0.b(Long.TYPE), 0, 2, null);
        FLOAT = new CppType("FLOAT", 4, o0.b(Float.TYPE), 0, 2, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        BOOLEAN = new CppType("BOOLEAN", 5, o0.b(Boolean.TYPE), 0, 2, defaultConstructorMarker);
        STRING = new CppType("STRING", 6, o0.b(String.class), 0, 2, null);
        JS_OBJECT = new CppType("JS_OBJECT", 7, o0.b(JavaScriptObject.class), 0, 2, null);
        JS_VALUE = new CppType("JS_VALUE", 8, o0.b(JavaScriptValue.class), 0, 2, null);
        READABLE_ARRAY = new CppType("READABLE_ARRAY", 9, o0.b(ReadableArray.class), 0, 2, null);
        READABLE_MAP = new CppType("READABLE_MAP", 10, o0.b(ReadableMap.class), 0, 2, null);
        UINT8_TYPED_ARRAY = new CppType("UINT8_TYPED_ARRAY", 11, o0.b(byte[].class), 0, 2, null);
        TYPED_ARRAY = new CppType("TYPED_ARRAY", 12, o0.b(TypedArray.class), 0, 2, null);
        PRIMITIVE_ARRAY = new CppType("PRIMITIVE_ARRAY", 13, o0.b(Object[].class), 0, 2, defaultConstructorMarker);
        LIST = new CppType("LIST", 14, o0.b(List.class), 0, 2, null);
        MAP = new CppType("MAP", 15, o0.b(Map.class), 0, 2, null);
        VIEW_TAG = new CppType("VIEW_TAG", 16, o0.b(cls), 0, 2, null);
        SHARED_OBJECT_ID = new CppType("SHARED_OBJECT_ID", 17, o0.b(cls), 0, 2, null);
        JS_FUNCTION = new CppType("JS_FUNCTION", 18, o0.b(JavaScriptFunction.class), 0, 2, null);
        ANY = new CppType("ANY", 19, o0.b(Object.class), 0, 2, null);
        CppType[] cppTypeArr$values = $values();
        $VALUES = cppTypeArr$values;
        $ENTRIES = on0.a.a(cppTypeArr$values);
    }

    private CppType(String str, int i11, co0.d dVar, int i12) {
        super(str, i11);
        this.clazz = dVar;
        this.value = i12;
    }

    public static EnumEntries<CppType> getEntries() {
        return $ENTRIES;
    }

    public static CppType valueOf(String str) {
        return (CppType) Enum.valueOf(CppType.class, str);
    }

    public static CppType[] values() {
        return (CppType[]) $VALUES.clone();
    }

    public final co0.d<?> getClazz() {
        return this.clazz;
    }

    public final int getValue() {
        return this.value;
    }

    /* synthetic */ CppType(String str, int i11, co0.d dVar, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, dVar, (i13 & 2) != 0 ? CppTypeKt.nextValue() : i12);
    }
}
