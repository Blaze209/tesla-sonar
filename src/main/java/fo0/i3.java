package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001ai\u0010I\u001a\u00028\u0001\"\b\b\u0000\u0010;*\u00020:\"\b\b\u0001\u0010=*\u00020<2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010?\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0004\bI\u0010J\"\u001a\u0010O\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\bM\u0010N\"\u0018\u0010T\u001a\u00020Q*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S\"\u0018\u0010V\u001a\u00020Q*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010S\"\u001a\u0010Z\u001a\u0004\u0018\u00010W*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006["}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "n", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)Ljava/lang/Class;", "", "packageName", "className", "m", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lco0/u;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lco0/u;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "p", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", "s", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "a", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lfo0/h1;", "c", "(Ljava/lang/Object;)Lfo0/h1;", "Lfo0/j2;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Lfo0/j2;", "Lfo0/a0;", "b", "(Ljava/lang/Object;)Lfo0/a0;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lwn0/a;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", Gender.MALE, "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lwn0/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lco0/q;", "", "l", "(Lco0/q;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FqName f66152a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66153a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f66153a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object a(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType type;
        Class clsO;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue == null || (type = typedArrayValue.getType()) == null) {
            return null;
        }
        List<? extends ConstantValue<?>> value = arrayValue.getValue();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(s((ConstantValue) it.next(), classLoader));
        }
        PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
        int i11 = 0;
        switch (primitiveArrayElementType == null ? -1 : a.f66153a[primitiveArrayElementType.ordinal()]) {
            case -1:
                if (!KotlinBuiltIns.isArray(type)) {
                    throw new IllegalStateException(("Not an array type: " + type).toString());
                }
                KotlinType type2 = ((TypeProjection) p013kotlin.collections.v.U0(type.getArguments())).getType();
                p013kotlin.jvm.internal.s.j(type2, "getType(...)");
                ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = type2.getConstructor().mo500getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
                if (classDescriptor == null) {
                    throw new IllegalStateException(("Not a class type: " + type2).toString());
                }
                if (KotlinBuiltIns.isString(type2)) {
                    int size = arrayValue.getValue().size();
                    String[] strArr = new String[size];
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i11] = obj;
                        i11++;
                    }
                    return strArr;
                }
                if (KotlinBuiltIns.isKClass(classDescriptor)) {
                    int size2 = arrayValue.getValue().size();
                    Class[] clsArr = new Class[size2];
                    while (i11 < size2) {
                        Object obj2 = arrayList.get(i11);
                        p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i11] = obj2;
                        i11++;
                    }
                    return clsArr;
                }
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (clsO = o(classLoader, classId, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsO, arrayValue.getValue().size());
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i11 < size3) {
                    objArr[i11] = arrayList.get(i11);
                    i11++;
                }
                return objArr;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int size4 = arrayValue.getValue().size();
                boolean[] zArr = new boolean[size4];
                while (i11 < size4) {
                    Object obj3 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i11] = ((Boolean) obj3).booleanValue();
                    i11++;
                }
                return zArr;
            case 2:
                int size5 = arrayValue.getValue().size();
                char[] cArr = new char[size5];
                while (i11 < size5) {
                    Object obj4 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i11] = ((Character) obj4).charValue();
                    i11++;
                }
                return cArr;
            case 3:
                int size6 = arrayValue.getValue().size();
                byte[] bArr = new byte[size6];
                while (i11 < size6) {
                    Object obj5 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i11] = ((Byte) obj5).byteValue();
                    i11++;
                }
                return bArr;
            case 4:
                int size7 = arrayValue.getValue().size();
                short[] sArr = new short[size7];
                while (i11 < size7) {
                    Object obj6 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i11] = ((Short) obj6).shortValue();
                    i11++;
                }
                return sArr;
            case 5:
                int size8 = arrayValue.getValue().size();
                int[] iArr = new int[size8];
                while (i11 < size8) {
                    Object obj7 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i11] = ((Integer) obj7).intValue();
                    i11++;
                }
                return iArr;
            case 6:
                int size9 = arrayValue.getValue().size();
                float[] fArr = new float[size9];
                while (i11 < size9) {
                    Object obj8 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i11] = ((Float) obj8).floatValue();
                    i11++;
                }
                return fArr;
            case 7:
                int size10 = arrayValue.getValue().size();
                long[] jArr = new long[size10];
                while (i11 < size10) {
                    Object obj9 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i11] = ((Long) obj9).longValue();
                    i11++;
                }
                return jArr;
            case 8:
                int size11 = arrayValue.getValue().size();
                double[] dArr = new double[size11];
                while (i11 < size11) {
                    Object obj10 = arrayList.get(i11);
                    p013kotlin.jvm.internal.s.i(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i11] = ((Double) obj10).doubleValue();
                    i11++;
                }
                return dArr;
        }
    }

    public static final a0<?> b(Object obj) {
        a0<?> a0Var = obj instanceof a0 ? (a0) obj : null;
        if (a0Var != null) {
            return a0Var;
        }
        h1 h1VarC = c(obj);
        return h1VarC != null ? h1VarC : d(obj);
    }

    public static final h1 c(Object obj) {
        h1 h1Var = obj instanceof h1 ? (h1) obj : null;
        if (h1Var != null) {
            return h1Var;
        }
        p013kotlin.jvm.internal.o oVar = obj instanceof p013kotlin.jvm.internal.o ? (p013kotlin.jvm.internal.o) obj : null;
        co0.c cVarCompute = oVar != null ? oVar.compute() : null;
        if (cVarCompute instanceof h1) {
            return (h1) cVarCompute;
        }
        return null;
    }

    public static final j2<?> d(Object obj) {
        j2<?> j2Var = obj instanceof j2 ? (j2) obj : null;
        if (j2Var != null) {
            return j2Var;
        }
        p013kotlin.jvm.internal.i0 i0Var = obj instanceof p013kotlin.jvm.internal.i0 ? (p013kotlin.jvm.internal.i0) obj : null;
        co0.c cVarCompute = i0Var != null ? i0Var.compute() : null;
        if (cVarCompute instanceof j2) {
            return (j2) cVarCompute;
        }
        return null;
    }

    public static final List<Annotation> e(Annotated annotated) {
        Annotation annotationP;
        p013kotlin.jvm.internal.s.k(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationP = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                annotationP = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                annotationP = p(annotationDescriptor);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class<?> f(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object g(Type type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Integer.TYPE)) {
            return 0;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Float.TYPE)) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (p013kotlin.jvm.internal.s.f(cls, Long.TYPE)) {
            return 0L;
        }
        if (p013kotlin.jvm.internal.s.f(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (p013kotlin.jvm.internal.s.f(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final <M extends MessageLite, D extends CallableDescriptor> D h(Class<?> moduleAnchor, M proto, NameResolver nameResolver, TypeTable typeTable, BinaryVersion metadataVersion, wn0.p<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        p013kotlin.jvm.internal.s.k(moduleAnchor, "moduleAnchor");
        p013kotlin.jvm.internal.s.k(proto, "proto");
        p013kotlin.jvm.internal.s.k(nameResolver, "nameResolver");
        p013kotlin.jvm.internal.s.k(typeTable, "typeTable");
        p013kotlin.jvm.internal.s.k(metadataVersion, "metadataVersion");
        p013kotlin.jvm.internal.s.k(createDescriptor, "createDescriptor");
        RuntimeModuleData runtimeModuleDataA = y2.a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf.Property) proto).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = runtimeModuleDataA.getDeserialization();
        ModuleDescriptor module = runtimeModuleDataA.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        p013kotlin.jvm.internal.s.h(list);
        return createDescriptor.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, metadataVersion, null, null, list)), proto);
    }

    public static final ReceiverParameterDescriptor i(CallableDescriptor callableDescriptor) {
        p013kotlin.jvm.internal.s.k(callableDescriptor, "<this>");
        if (callableDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        p013kotlin.jvm.internal.s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    public static final FqName j() {
        return f66152a;
    }

    public static final boolean k(co0.q qVar) {
        KotlinType kotlinTypeS;
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        t2 t2Var = qVar instanceof t2 ? (t2) qVar : null;
        return (t2Var == null || (kotlinTypeS = t2Var.getType()) == null || !InlineClassesUtilsKt.needsMfvcFlattening(kotlinTypeS)) ? false : true;
    }

    public static final boolean l(co0.q qVar) {
        KotlinType kotlinTypeS;
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        t2 t2Var = qVar instanceof t2 ? (t2) qVar : null;
        return (t2Var == null || (kotlinTypeS = t2Var.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(kotlinTypeS)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> m(ClassLoader classLoader, String str, String str2, int i11) {
        if (p013kotlin.jvm.internal.s.f(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + CoreConstants.DOT);
        }
        sb2.append(p013kotlin.text.t.U(str2, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null));
        if (i11 > 0) {
            sb2.append(";");
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, string);
    }

    private static final Class<?> n(ClassLoader classLoader, ClassId classId, int i11) {
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        p013kotlin.jvm.internal.s.j(unsafe, "toUnsafe(...)");
        ClassId classIdMapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
        if (classIdMapKotlinToJava != null) {
            classId = classIdMapKotlinToJava;
        }
        String strAsString = classId.getPackageFqName().asString();
        p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
        String strAsString2 = classId.getRelativeClassName().asString();
        p013kotlin.jvm.internal.s.j(strAsString2, "asString(...)");
        return m(classLoader, strAsString, strAsString2, i11);
    }

    static /* synthetic */ Class o(ClassLoader classLoader, ClassId classId, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return n(classLoader, classId, i11);
    }

    private static final Annotation p(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class<?> clsQ = annotationClass != null ? q(annotationClass) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            p013kotlin.jvm.internal.s.j(classLoader, "getClassLoader(...)");
            Object objS = s(constantValue, classLoader);
            Pair pairA = objS != null ? jn0.x.a(name.asString(), objS) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return (Annotation) go0.f.h(clsQ, p013kotlin.collections.v0.y(arrayList), null, 4, null);
    }

    public static final Class<?> q(ClassDescriptor classDescriptor) {
        p013kotlin.jvm.internal.s.k(classDescriptor, "<this>");
        SourceElement source = classDescriptor.getSource();
        p013kotlin.jvm.internal.s.j(source, "getSource(...)");
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            p013kotlin.jvm.internal.s.i(binaryClass, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            p013kotlin.jvm.internal.s.i(javaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return n(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
    }

    public static final co0.u r(DescriptorVisibility descriptorVisibility) {
        p013kotlin.jvm.internal.s.k(descriptorVisibility, "<this>");
        if (p013kotlin.jvm.internal.s.f(descriptorVisibility, DescriptorVisibilities.PUBLIC)) {
            return co0.u.PUBLIC;
        }
        if (p013kotlin.jvm.internal.s.f(descriptorVisibility, DescriptorVisibilities.PROTECTED)) {
            return co0.u.PROTECTED;
        }
        if (p013kotlin.jvm.internal.s.f(descriptorVisibility, DescriptorVisibilities.INTERNAL)) {
            return co0.u.INTERNAL;
        }
        if (p013kotlin.jvm.internal.s.f(descriptorVisibility, DescriptorVisibilities.PRIVATE) || p013kotlin.jvm.internal.s.f(descriptorVisibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return co0.u.PRIVATE;
        }
        return null;
    }

    private static final Object s(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return p(((AnnotationValue) constantValue).getValue());
        }
        if (constantValue instanceof ArrayValue) {
            return a((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value = ((EnumValue) constantValue).getValue();
            ClassId classIdA = value.a();
            Name nameB = value.b();
            Class clsO = o(classLoader, classIdA, 0, 4, null);
            if (clsO != null) {
                return h3.a(clsO, nameB.asString());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.getValue();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
            return n(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
        }
        if (!(value2 instanceof KClassValue.Value.LocalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = ((KClassValue.Value.LocalClass) value2).getType().getConstructor().mo500getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
        if (classDescriptor != null) {
            return q(classDescriptor);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    private static final List<Annotation> t(List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listE;
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (p013kotlin.jvm.internal.s.f(vn0.a.b(vn0.a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsB = vn0.a.b(vn0.a.a(annotation));
                    if (!p013kotlin.jvm.internal.s.f(clsB.getSimpleName(), "Container") || clsB.getAnnotation(p013kotlin.jvm.internal.q0.class) == null) {
                        listE = p013kotlin.collections.v.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        p013kotlin.jvm.internal.s.i(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = p013kotlin.collections.n.h((Annotation[]) objInvoke);
                    }
                    p013kotlin.collections.v.E(list, listE);
                }
                break;
            }
        }
        return list;
    }
}
