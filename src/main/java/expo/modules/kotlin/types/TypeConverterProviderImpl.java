package expo.modules.kotlin.types;

import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import co0.f;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.exception.UnsupportedClass;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.RecordTypeConverter;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedObjectTypeConverter;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.sharedobjects.SharedRefTypeConverter;
import expo.modules.kotlin.typedarray.BigInt64Array;
import expo.modules.kotlin.typedarray.BigUint64Array;
import expo.modules.kotlin.typedarray.Float32Array;
import expo.modules.kotlin.typedarray.Float64Array;
import expo.modules.kotlin.typedarray.Int16Array;
import expo.modules.kotlin.typedarray.Int32Array;
import expo.modules.kotlin.typedarray.Int8Array;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.typedarray.Uint16Array;
import expo.modules.kotlin.typedarray.Uint32Array;
import expo.modules.kotlin.typedarray.Uint8Array;
import expo.modules.kotlin.typedarray.Uint8ClampedArray;
import expo.modules.kotlin.types.io.FileTypeConverter;
import expo.modules.kotlin.types.io.PathTypeConverter;
import expo.modules.kotlin.types.net.JavaURITypeConverter;
import expo.modules.kotlin.types.net.URLTypConverter;
import expo.modules.kotlin.types.net.UriTypeConverter;
import expo.modules.kotlin.views.ViewTypeConverter;
import j$.time.LocalDate;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\bR(\u0010\u0015\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterProviderImpl;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "<init>", "()V", "Lco0/q;", "inputType", "Lexpo/modules/kotlin/types/TypeConverter;", "getCachedConverter", "(Lco0/q;)Lexpo/modules/kotlin/types/TypeConverter;", "type", "Ljava/lang/Class;", "jClass", "handelEither", "(Lco0/q;Ljava/lang/Class;)Lexpo/modules/kotlin/types/TypeConverter;", "", "isOptional", "", "Lco0/d;", "createCachedConverters", "(Z)Ljava/util/Map;", "obtainTypeConverter", "cachedConverters", "Ljava/util/Map;", "nullableCachedConverters", "", "cachedRecordConverters", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TypeConverterProviderImpl implements TypeConverterProvider {
    public static final TypeConverterProviderImpl INSTANCE;
    private static final Map<co0.d<?>, TypeConverter<?>> cachedConverters;
    private static final Map<q, TypeConverter<?>> cachedRecordConverters;
    private static final Map<co0.d<?>, TypeConverter<?>> nullableCachedConverters;

    static {
        TypeConverterProviderImpl typeConverterProviderImpl = new TypeConverterProviderImpl();
        INSTANCE = typeConverterProviderImpl;
        cachedConverters = typeConverterProviderImpl.createCachedConverters(false);
        nullableCachedConverters = typeConverterProviderImpl.createCachedConverters(true);
        cachedRecordConverters = new LinkedHashMap();
    }

    private TypeConverterProviderImpl() {
    }

    private final Map<co0.d<?>, TypeConverter<?>> createCachedConverters(final boolean isOptional) {
        CppType cppType = CppType.INT;
        final ExpectedType expectedType = new ExpectedType(cppType);
        DynamicAwareTypeConverters<Integer> dynamicAwareTypeConverters = new DynamicAwareTypeConverters<Integer>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$1
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Integer convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (Integer) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Integer convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return Integer.valueOf((int) value.asDouble());
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType;
            }
        };
        CppType cppType2 = CppType.LONG;
        final ExpectedType expectedType2 = new ExpectedType(cppType2);
        DynamicAwareTypeConverters<Long> dynamicAwareTypeConverters2 = new DynamicAwareTypeConverters<Long>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$2
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Long convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (Long) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Long convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return Long.valueOf((long) value.asDouble());
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType2;
            }
        };
        CppType cppType3 = CppType.DOUBLE;
        final ExpectedType expectedType3 = new ExpectedType(cppType3);
        DynamicAwareTypeConverters<Double> dynamicAwareTypeConverters3 = new DynamicAwareTypeConverters<Double>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$3
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Double convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (Double) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Double convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return Double.valueOf(value.asDouble());
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType3;
            }
        };
        CppType cppType4 = CppType.FLOAT;
        final ExpectedType expectedType4 = new ExpectedType(cppType4);
        DynamicAwareTypeConverters<Float> dynamicAwareTypeConverters4 = new DynamicAwareTypeConverters<Float>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$4
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Float convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (Float) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Float convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return Float.valueOf((float) value.asDouble());
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType4;
            }
        };
        CppType cppType5 = CppType.BOOLEAN;
        final ExpectedType expectedType5 = new ExpectedType(cppType5);
        DynamicAwareTypeConverters<Boolean> dynamicAwareTypeConverters5 = new DynamicAwareTypeConverters<Boolean>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$5
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Boolean convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (Boolean) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Boolean convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return Boolean.valueOf(value.asBoolean());
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType5;
            }
        };
        Pair pairA = x.a(o0.b(Integer.TYPE), dynamicAwareTypeConverters);
        Pair pairA2 = x.a(o0.b(Integer.class), dynamicAwareTypeConverters);
        Pair pairA3 = x.a(o0.b(Long.TYPE), dynamicAwareTypeConverters2);
        Pair pairA4 = x.a(o0.b(Long.class), dynamicAwareTypeConverters2);
        Pair pairA5 = x.a(o0.b(Double.TYPE), dynamicAwareTypeConverters3);
        Pair pairA6 = x.a(o0.b(Double.class), dynamicAwareTypeConverters3);
        Pair pairA7 = x.a(o0.b(Float.TYPE), dynamicAwareTypeConverters4);
        Pair pairA8 = x.a(o0.b(Float.class), dynamicAwareTypeConverters4);
        Pair pairA9 = x.a(o0.b(Boolean.TYPE), dynamicAwareTypeConverters5);
        Pair pairA10 = x.a(o0.b(Boolean.class), dynamicAwareTypeConverters5);
        co0.d dVarB = o0.b(String.class);
        final ExpectedType expectedType6 = new ExpectedType(CppType.STRING);
        Pair pairA11 = x.a(dVarB, new DynamicAwareTypeConverters<String>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$6
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public String convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (String) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public String convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return value.asString();
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType6;
            }
        });
        co0.d dVarB2 = o0.b(ReadableArray.class);
        final ExpectedType expectedType7 = new ExpectedType(CppType.READABLE_ARRAY);
        Pair pairA12 = x.a(dVarB2, new DynamicAwareTypeConverters<ReadableArray>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$7
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableArray convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (ReadableArray) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableArray convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return value.asArray();
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType7;
            }
        });
        co0.d dVarB3 = o0.b(ReadableMap.class);
        final ExpectedType expectedType8 = new ExpectedType(CppType.READABLE_MAP);
        Pair pairA13 = x.a(dVarB3, new DynamicAwareTypeConverters<ReadableMap>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$8
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableMap convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (ReadableMap) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableMap convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                return value.asMap();
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType8;
            }
        });
        co0.d dVarB4 = o0.b(int[].class);
        ExpectedType.Companion companion = ExpectedType.INSTANCE;
        final ExpectedType expectedTypeForPrimitiveArray = companion.forPrimitiveArray(cppType);
        Pair pairA14 = x.a(dVarB4, new DynamicAwareTypeConverters<int[]>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$9
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public int[] convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (int[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public int[] convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                int size = readableArrayAsArray.size();
                int[] iArr = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr[i11] = readableArrayAsArray.getInt(i11);
                }
                return iArr;
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray;
            }
        });
        co0.d dVarB5 = o0.b(long[].class);
        final ExpectedType expectedTypeForPrimitiveArray2 = companion.forPrimitiveArray(cppType2);
        Pair pairA15 = x.a(dVarB5, new DynamicAwareTypeConverters<long[]>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$10
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public long[] convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (long[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public long[] convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                int size = readableArrayAsArray.size();
                long[] jArr = new long[size];
                for (int i11 = 0; i11 < size; i11++) {
                    jArr[i11] = (long) readableArrayAsArray.getDouble(i11);
                }
                return jArr;
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray2;
            }
        });
        co0.d dVarB6 = o0.b(double[].class);
        final ExpectedType expectedTypeForPrimitiveArray3 = companion.forPrimitiveArray(cppType3);
        Pair pairA16 = x.a(dVarB6, new DynamicAwareTypeConverters<double[]>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$11
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public double[] convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (double[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public double[] convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                int size = readableArrayAsArray.size();
                double[] dArr = new double[size];
                for (int i11 = 0; i11 < size; i11++) {
                    dArr[i11] = readableArrayAsArray.getDouble(i11);
                }
                return dArr;
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray3;
            }
        });
        co0.d dVarB7 = o0.b(float[].class);
        final ExpectedType expectedTypeForPrimitiveArray4 = companion.forPrimitiveArray(cppType4);
        Pair pairA17 = x.a(dVarB7, new DynamicAwareTypeConverters<float[]>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$12
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public float[] convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (float[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public float[] convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                int size = readableArrayAsArray.size();
                float[] fArr = new float[size];
                for (int i11 = 0; i11 < size; i11++) {
                    fArr[i11] = (float) readableArrayAsArray.getDouble(i11);
                }
                return fArr;
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray4;
            }
        });
        co0.d dVarB8 = o0.b(boolean[].class);
        final ExpectedType expectedTypeForPrimitiveArray5 = companion.forPrimitiveArray(cppType5);
        Pair pairA18 = x.a(dVarB8, new DynamicAwareTypeConverters<boolean[]>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$13
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public boolean[] convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return (boolean[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public boolean[] convertFromDynamic(Dynamic value, AppContext context) {
                s.k(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                int size = readableArrayAsArray.size();
                boolean[] zArr = new boolean[size];
                for (int i11 = 0; i11 < size; i11++) {
                    zArr[i11] = readableArrayAsArray.getBoolean(i11);
                }
                return zArr;
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray5;
            }
        });
        Pair pairA19 = x.a(o0.b(byte[].class), new ByteArrayTypeConverter(isOptional));
        co0.d dVarB9 = o0.b(JavaScriptValue.class);
        final ExpectedType expectedType9 = new ExpectedType(CppType.JS_VALUE);
        Pair pairA20 = x.a(dVarB9, new DynamicAwareTypeConverters<Object>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$1
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromDynamic(Dynamic value, AppContext context) throws UnsupportedClass {
                s.k(value, "value");
                throw new UnsupportedClass(o0.b(Object.class));
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType9;
            }
        });
        co0.d dVarB10 = o0.b(JavaScriptObject.class);
        final ExpectedType expectedType10 = new ExpectedType(CppType.JS_OBJECT);
        Map<co0.d<?>, TypeConverter<?>> mapM = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, x.a(dVarB10, new DynamicAwareTypeConverters<Object>(isOptional) { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$2
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromAny(Object value, AppContext context) {
                s.k(value, "value");
                return value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromDynamic(Dynamic value, AppContext context) throws UnsupportedClass {
                s.k(value, "value");
                throw new UnsupportedClass(o0.b(Object.class));
            }

            @Override // expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType10;
            }
        }), x.a(o0.b(Int8Array.class), new Int8ArrayTypeConverter(isOptional)), x.a(o0.b(Int16Array.class), new Int16ArrayTypeConverter(isOptional)), x.a(o0.b(Int32Array.class), new Int32ArrayTypeConverter(isOptional)), x.a(o0.b(Uint8Array.class), new Uint8ArrayTypeConverter(isOptional)), x.a(o0.b(Uint8ClampedArray.class), new Uint8ClampedArrayTypeConverter(isOptional)), x.a(o0.b(Uint16Array.class), new Uint16ArrayTypeConverter(isOptional)), x.a(o0.b(Uint32Array.class), new Uint32ArrayTypeConverter(isOptional)), x.a(o0.b(Float32Array.class), new Float32ArrayTypeConverter(isOptional)), x.a(o0.b(Float64Array.class), new Float64ArrayTypeConverter(isOptional)), x.a(o0.b(BigInt64Array.class), new BigInt64ArrayTypeConverter(isOptional)), x.a(o0.b(BigUint64Array.class), new BigUint64ArrayTypeConverter(isOptional)), x.a(o0.b(TypedArray.class), new TypedArrayTypeConverter(isOptional)), x.a(o0.b(URL.class), new URLTypConverter(isOptional)), x.a(o0.b(Uri.class), new UriTypeConverter(isOptional)), x.a(o0.b(URI.class), new JavaURITypeConverter(isOptional)), x.a(o0.b(File.class), new FileTypeConverter(isOptional)), x.a(o0.b(io0.b.class), new DurationTypeConverter(isOptional)), x.a(o0.b(Object.class), new AnyTypeConverter(isOptional)), x.a(o0.b(h0.class), new UnitTypeConverter()), x.a(o0.b(ReadableArguments.class), new ReadableArgumentsTypeConverter(isOptional)));
        return Build.VERSION.SDK_INT >= 26 ? v0.r(mapM, v0.m(x.a(o0.b(e.a()), new PathTypeConverter(isOptional)), x.a(o0.b(Color.class), new ColorTypeConverter(isOptional)), x.a(o0.b(LocalDate.class), new DateTypeConverter(isOptional)))) : mapM;
    }

    private final TypeConverter<?> getCachedConverter(q inputType) {
        return inputType.getIsMarkedNullable() ? nullableCachedConverters.get(inputType.getClassifier()) : cachedConverters.get(inputType.getClassifier());
    }

    private final TypeConverter<?> handelEither(q type, Class<?> jClass) {
        if (!Either.class.isAssignableFrom(jClass)) {
            return null;
        }
        if (EitherOfFour.class.isAssignableFrom(jClass)) {
            return new EitherOfFourTypeConverter(this, type);
        }
        return EitherOfThree.class.isAssignableFrom(jClass) ? new EitherOfThreeTypeConverter(this, type) : new EitherTypeConverter(this, type);
    }

    @Override // expo.modules.kotlin.types.TypeConverterProvider
    public TypeConverter<?> obtainTypeConverter(q type) {
        s.k(type, "type");
        TypeConverter<?> cachedConverter = getCachedConverter(type);
        if (cachedConverter != null) {
            return cachedConverter;
        }
        f classifier = type.getClassifier();
        co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
        if (dVar == null) {
            throw new MissingTypeConverter(type);
        }
        Class<?> clsB = vn0.a.b(dVar);
        if (clsB.isArray() || Object[].class.isAssignableFrom(clsB)) {
            return new ArrayTypeConverter(this, type);
        }
        if (List.class.isAssignableFrom(clsB)) {
            return new ListTypeConverter(this, type);
        }
        if (Map.class.isAssignableFrom(clsB)) {
            return new MapTypeConverter(this, type);
        }
        if (Pair.class.isAssignableFrom(clsB)) {
            return new PairTypeConverter(this, type);
        }
        if (Set.class.isAssignableFrom(clsB)) {
            return new SetTypeConverter(this, type);
        }
        if (clsB.isEnum()) {
            return new EnumTypeConverter(dVar, type.getIsMarkedNullable());
        }
        Map<q, TypeConverter<?>> map = cachedRecordConverters;
        TypeConverter<?> typeConverter = map.get(type);
        if (typeConverter != null) {
            return typeConverter;
        }
        if (Record.class.isAssignableFrom(clsB)) {
            RecordTypeConverter recordTypeConverter = new RecordTypeConverter(this, type);
            map.put(type, recordTypeConverter);
            return recordTypeConverter;
        }
        if (View.class.isAssignableFrom(clsB)) {
            return new ViewTypeConverter(type);
        }
        if (SharedRef.class.isAssignableFrom(clsB)) {
            return new SharedRefTypeConverter(type);
        }
        if (SharedObject.class.isAssignableFrom(clsB)) {
            return new SharedObjectTypeConverter(type);
        }
        if (JavaScriptFunction.class.isAssignableFrom(clsB)) {
            return new JavaScriptFunctionTypeConverter(type);
        }
        TypeConverter<?> typeConverterHandelEither = handelEither(type, clsB);
        if (typeConverterHandelEither != null) {
            return typeConverterHandelEither;
        }
        throw new MissingTypeConverter(type);
    }
}
