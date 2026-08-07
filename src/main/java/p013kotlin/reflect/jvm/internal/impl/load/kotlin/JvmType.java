package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes9.dex */
public abstract class JvmType {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Primitive f87577a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Primitive f87578b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Primitive f87579c = new Primitive(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Primitive f87580d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Primitive f87581e = new Primitive(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Primitive f87582f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Primitive f87583g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Primitive f87584h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JvmType f87585i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(JvmType elementType) {
            super(null);
            s.k(elementType, "elementType");
            this.f87585i = elementType;
        }

        public final JvmType getElementType() {
            return this.f87585i;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.f87577a;
        }

        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.f87579c;
        }

        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.f87578b;
        }

        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.f87584h;
        }

        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f87582f;
        }

        public final Primitive getINT$descriptors_jvm() {
            return JvmType.f87581e;
        }

        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.f87583g;
        }

        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.f87580d;
        }

        private Companion() {
        }
    }

    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f87586i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(String internalName) {
            super(null);
            s.k(internalName, "internalName");
            this.f87586i = internalName;
        }

        public final String getInternalName() {
            return this.f87586i;
        }
    }

    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JvmPrimitiveType f87587i;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f87587i = jvmPrimitiveType;
        }

        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.f87587i;
        }
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return JvmTypeFactoryImpl.f87588a.toString(this);
    }

    private JvmType() {
    }
}
