package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeUsage f87395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaTypeFlexibility f87396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f87397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<TypeParameterDescriptor> f87399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SimpleType f87400i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z11, boolean z12, Set set, SimpleType simpleType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i11 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? null : set, (i11 & 32) != 0 ? null : simpleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z11, boolean z12, Set set, SimpleType simpleType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeUsage = javaTypeAttributes.f87395d;
        }
        if ((i11 & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f87396e;
        }
        if ((i11 & 4) != 0) {
            z11 = javaTypeAttributes.f87397f;
        }
        if ((i11 & 8) != 0) {
            z12 = javaTypeAttributes.f87398g;
        }
        if ((i11 & 16) != 0) {
            set = javaTypeAttributes.f87399h;
        }
        if ((i11 & 32) != 0) {
            simpleType = javaTypeAttributes.f87400i;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z11, z12, set2, simpleType2);
    }

    public final JavaTypeAttributes copy(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z11, boolean z12, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        s.k(howThisTypeIsUsed, "howThisTypeIsUsed");
        s.k(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z11, z12, set, simpleType);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return s.f(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.f87396e == this.f87396e && javaTypeAttributes.f87397f == this.f87397f && javaTypeAttributes.f87398g == this.f87398g;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public SimpleType getDefaultType() {
        return this.f87400i;
    }

    public final JavaTypeFlexibility getFlexibility() {
        return this.f87396e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public TypeUsage getHowThisTypeIsUsed() {
        return this.f87395d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f87399h;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + getHowThisTypeIsUsed().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f87396e.hashCode();
        int i11 = iHashCode3 + (iHashCode3 * 31) + (this.f87397f ? 1 : 0);
        return i11 + (i11 * 31) + (this.f87398g ? 1 : 0);
    }

    public final boolean isForAnnotationParameter() {
        return this.f87398g;
    }

    public final boolean isRaw() {
        return this.f87397f;
    }

    public final JavaTypeAttributes markIsRaw(boolean z11) {
        return copy$default(this, null, null, z11, false, null, null, 59, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f87395d + ", flexibility=" + this.f87396e + ", isRaw=" + this.f87397f + ", isForAnnotationParameter=" + this.f87398g + ", visitedTypeParameters=" + this.f87399h + ", defaultType=" + this.f87400i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public JavaTypeAttributes withDefaultType(SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    public final JavaTypeAttributes withFlexibility(JavaTypeFlexibility flexibility) {
        s.k(flexibility, "flexibility");
        return copy$default(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public JavaTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameter) {
        s.k(typeParameter, "typeParameter");
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? d1.o(getVisitedTypeParameters(), typeParameter) : d1.c(typeParameter), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z11, boolean z12, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        super(howThisTypeIsUsed, set, simpleType);
        s.k(howThisTypeIsUsed, "howThisTypeIsUsed");
        s.k(flexibility, "flexibility");
        this.f87395d = howThisTypeIsUsed;
        this.f87396e = flexibility;
        this.f87397f = z11;
        this.f87398g = z12;
        this.f87399h = set;
        this.f87400i = simpleType;
    }
}
