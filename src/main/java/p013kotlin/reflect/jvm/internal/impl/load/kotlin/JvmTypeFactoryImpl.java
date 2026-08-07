package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JvmTypeFactoryImpl f87588a = new JvmTypeFactoryImpl();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private JvmTypeFactoryImpl() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JvmType boxType(JvmType possiblyPrimitiveType) {
        s.k(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof JvmType.Primitive)) {
            return possiblyPrimitiveType;
        }
        JvmType.Primitive primitive = (JvmType.Primitive) possiblyPrimitiveType;
        if (primitive.getJvmPrimitiveType() == null) {
            return possiblyPrimitiveType;
        }
        String internalName = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
        s.j(internalName, "getInternalName(...)");
        return createObjectType(internalName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JvmType createFromString(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        s.k(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i11];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i11++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            s.j(strSubstring, "substring(...)");
            return new JvmType.Array(createFromString(strSubstring));
        }
        if (cCharAt == 'L') {
            t.l0(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        s.j(strSubstring2, "substring(...)");
        return new JvmType.Object(strSubstring2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public JvmType.Object createObjectType(String internalName) {
        s.k(internalName, "internalName");
        return new JvmType.Object(internalName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public JvmType createPrimitiveType(PrimitiveType primitiveType) {
        s.k(primitiveType, "primitiveType");
        switch (WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return JvmType.Companion.getBOOLEAN$descriptors_jvm();
            case 2:
                return JvmType.Companion.getCHAR$descriptors_jvm();
            case 3:
                return JvmType.Companion.getBYTE$descriptors_jvm();
            case 4:
                return JvmType.Companion.getSHORT$descriptors_jvm();
            case 5:
                return JvmType.Companion.getINT$descriptors_jvm();
            case 6:
                return JvmType.Companion.getFLOAT$descriptors_jvm();
            case 7:
                return JvmType.Companion.getLONG$descriptors_jvm();
            case 8:
                return JvmType.Companion.getDOUBLE$descriptors_jvm();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public JvmType getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String toString(JvmType type) {
        String desc;
        s.k(type, "type");
        if (type instanceof JvmType.Array) {
            return '[' + toString(((JvmType.Array) type).getElementType());
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) type).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (!(type instanceof JvmType.Object)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((JvmType.Object) type).getInternalName() + ';';
    }
}
