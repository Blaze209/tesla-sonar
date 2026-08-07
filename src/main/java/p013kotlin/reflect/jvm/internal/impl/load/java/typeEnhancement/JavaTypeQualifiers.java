package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeQualifiers {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final JavaTypeQualifiers f87429e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NullabilityQualifier f87430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutabilityQualifier f87431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f87433d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.f87429e;
        }

        private Companion() {
        }
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12) {
        this.f87430a = nullabilityQualifier;
        this.f87431b = mutabilityQualifier;
        this.f87432c = z11;
        this.f87433d = z12;
    }

    public static /* synthetic */ JavaTypeQualifiers copy$default(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f87430a;
        }
        if ((i11 & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f87431b;
        }
        if ((i11 & 4) != 0) {
            z11 = javaTypeQualifiers.f87432c;
        }
        if ((i11 & 8) != 0) {
            z12 = javaTypeQualifiers.f87433d;
        }
        return javaTypeQualifiers.copy(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    public final JavaTypeQualifiers copy(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.f87430a == javaTypeQualifiers.f87430a && this.f87431b == javaTypeQualifiers.f87431b && this.f87432c == javaTypeQualifiers.f87432c && this.f87433d == javaTypeQualifiers.f87433d;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f87432c;
    }

    public final MutabilityQualifier getMutability() {
        return this.f87431b;
    }

    public final NullabilityQualifier getNullability() {
        return this.f87430a;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f87430a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f87431b;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.f87432c)) * 31) + Boolean.hashCode(this.f87433d);
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.f87433d;
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f87430a + ", mutability=" + this.f87431b + ", definitelyNotNull=" + this.f87432c + ", isNullabilityQualifierForWarning=" + this.f87433d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z11, (i11 & 8) != 0 ? false : z12);
    }
}
