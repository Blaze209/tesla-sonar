package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public class ErasureTypeAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeUsage f88875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<TypeParameterDescriptor> f88876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleType f88877c;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(TypeUsage howThisTypeIsUsed, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        s.k(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f88875a = howThisTypeIsUsed;
        this.f88876b = set;
        this.f88877c = simpleType;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return s.f(erasureTypeAttributes.getDefaultType(), getDefaultType()) && erasureTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    public SimpleType getDefaultType() {
        return this.f88877c;
    }

    public TypeUsage getHowThisTypeIsUsed() {
        return this.f88875a;
    }

    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f88876b;
    }

    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + getHowThisTypeIsUsed().hashCode();
    }

    public ErasureTypeAttributes withNewVisitedTypeParameter(TypeParameterDescriptor typeParameter) {
        Set setC;
        s.k(typeParameter, "typeParameter");
        TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        if (visitedTypeParameters == null || (setC = d1.o(visitedTypeParameters, typeParameter)) == null) {
            setC = d1.c(typeParameter);
        }
        return new ErasureTypeAttributes(howThisTypeIsUsed, setC, getDefaultType());
    }
}
