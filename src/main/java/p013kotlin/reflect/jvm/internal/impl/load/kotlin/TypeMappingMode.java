package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeMappingMode {
    public static final TypeMappingMode CLASS_DECLARATION;
    public static final Companion Companion = new Companion(null);
    public static final TypeMappingMode DEFAULT;
    public static final TypeMappingMode DEFAULT_UAST;
    public static final TypeMappingMode GENERIC_ARGUMENT;
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;
    public static final TypeMappingMode RETURN_TYPE_BOXED;
    public static final TypeMappingMode SUPER_TYPE;
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f87598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f87601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TypeMappingMode f87603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TypeMappingMode f87605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TypeMappingMode f87606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f87607j;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z11, z12, z13, z14, z15, null, false, null, null, z16, 1023, null);
        GENERIC_ARGUMENT = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z16, false, false, null, false, null, null, true, 511, null);
        GENERIC_ARGUMENT_UAST = typeMappingMode2;
        RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        DEFAULT = new TypeMappingMode(z11, z12, z13, z14, z15, typeMappingMode, false, null, null, z16, 988, null);
        DEFAULT_UAST = new TypeMappingMode(false, false, z16, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z17 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        CLASS_DECLARATION = new TypeMappingMode(z11, true, z13, z14, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 988, defaultConstructorMarker);
        boolean z18 = false;
        boolean z19 = true;
        SUPER_TYPE = new TypeMappingMode(z11, z18, z13, z19, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z11, z18, z13, z19, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z11, z18, true, false, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 984, defaultConstructorMarker);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.f87604g;
    }

    public final boolean getMapTypeAliases() {
        return this.f87607j;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.f87599b;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.f87598a;
    }

    public final boolean isForAnnotationParameter() {
        return this.f87600c;
    }

    public final TypeMappingMode toGenericArgumentMode(Variance effectiveVariance, boolean z11) {
        s.k(effectiveVariance, "effectiveVariance");
        if (!z11 || !this.f87600c) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i11 == 1) {
                TypeMappingMode typeMappingMode = this.f87605h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i11 != 2) {
                TypeMappingMode typeMappingMode2 = this.f87603f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.f87606i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.f87598a, true, this.f87600c, this.f87601d, this.f87602e, this.f87603f, this.f87604g, this.f87605h, this.f87606i, false, 512, null);
    }

    public TypeMappingMode(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, TypeMappingMode typeMappingMode, boolean z16, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z17) {
        this.f87598a = z11;
        this.f87599b = z12;
        this.f87600c = z13;
        this.f87601d = z14;
        this.f87602e = z15;
        this.f87603f = typeMappingMode;
        this.f87604g = z16;
        this.f87605h = typeMappingMode2;
        this.f87606i = typeMappingMode3;
        this.f87607j = z17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, TypeMappingMode typeMappingMode, boolean z16, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i11 & 1) != 0 ? true : z11;
        z12 = (i11 & 2) != 0 ? true : z12;
        z13 = (i11 & 4) != 0 ? false : z13;
        z14 = (i11 & 8) != 0 ? false : z14;
        z15 = (i11 & 16) != 0 ? false : z15;
        typeMappingMode = (i11 & 32) != 0 ? null : typeMappingMode;
        this(z11, z12, z13, z14, z15, typeMappingMode, (i11 & 64) != 0 ? true : z16, (i11 & 128) != 0 ? typeMappingMode : typeMappingMode2, (i11 & 256) != 0 ? typeMappingMode : typeMappingMode3, (i11 & 512) != 0 ? false : z17);
    }
}
