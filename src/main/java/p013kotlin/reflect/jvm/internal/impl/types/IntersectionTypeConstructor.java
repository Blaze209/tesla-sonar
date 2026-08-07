package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import mn0.a;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KotlinType f88886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<KotlinType> f88887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f88888c;

    public IntersectionTypeConstructor(Collection<? extends KotlinType> typesToIntersect) {
        s.k(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f88887b = linkedHashSet;
        this.f88888c = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType d(IntersectionTypeConstructor intersectionTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return intersectionTypeConstructor.refine(kotlinTypeRefiner).createType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(KotlinType it) {
        s.k(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(l lVar, KotlinType kotlinType) {
        s.h(kotlinType);
        return lVar.invoke(kotlinType).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = l.f89017a;
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(lVar);
    }

    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.f88887b);
    }

    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, v.m(), false, createScopeForKotlinType(), new m(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return s.f(this.f88887b, ((IntersectionTypeConstructor) obj).f88887b);
        }
        return false;
    }

    public final KotlinType getAlternativeType() {
        return this.f88886a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.f88887b.iterator().next().getConstructor().getBuiltIns();
        s.j(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo500getDeclarationDescriptor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return this.f88887b;
    }

    public int hashCode() {
        return this.f88888c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final String makeDebugNameForIntersectionType(final l<? super KotlinType, ? extends Object> getProperTypeRelatedToStringify) {
        s.k(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return v.y0(v.a1(this.f88887b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                KotlinType kotlinType = (KotlinType) t11;
                l lVar = getProperTypeRelatedToStringify;
                s.h(kotlinType);
                String string = lVar.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t12;
                l lVar2 = getProperTypeRelatedToStringify;
                s.h(kotlinType2);
                return a.d(string, lVar2.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new k(getProperTypeRelatedToStringify), 24, null);
    }

    public final IntersectionTypeConstructor setAlternative(KotlinType kotlinType) {
        return new IntersectionTypeConstructor(this.f88887b, kotlinType);
    }

    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public IntersectionTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> supertypes = getSupertypes();
        ArrayList arrayList = new ArrayList(v.y(supertypes, 10));
        Iterator<T> it = supertypes.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).refine(kotlinTypeRefiner));
            z11 = true;
        }
        IntersectionTypeConstructor alternative = null;
        if (z11) {
            KotlinType alternativeType = getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return alternative == null ? this : alternative;
    }

    private IntersectionTypeConstructor(Collection<? extends KotlinType> collection, KotlinType kotlinType) {
        this(collection);
        this.f88886a = kotlinType;
    }
}
