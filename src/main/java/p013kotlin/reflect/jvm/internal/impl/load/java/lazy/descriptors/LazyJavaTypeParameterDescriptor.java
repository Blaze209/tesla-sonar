package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LazyJavaResolverContext f87341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final JavaTypeParameter f87342l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext c11, JavaTypeParameter javaTypeParameter, int i11, DeclarationDescriptor containingDeclaration) {
        super(c11.getStorageManager(), containingDeclaration, new LazyJavaAnnotations(c11, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i11, SourceElement.NO_SOURCE, c11.getComponents().getSupertypeLoopChecker());
        s.k(c11, "c");
        s.k(javaTypeParameter, "javaTypeParameter");
        s.k(containingDeclaration, "containingDeclaration");
        this.f87341k = c11;
        this.f87342l = javaTypeParameter;
    }

    private final List<KotlinType> d() {
        Collection<JavaClassifierType> upperBounds = this.f87342l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType anyType = this.f87341k.getModule().getBuiltIns().getAnyType();
            s.j(anyType, "getAnyType(...)");
            SimpleType nullableAnyType = this.f87341k.getModule().getBuiltIns().getNullableAnyType();
            s.j(nullableAnyType, "getNullableAnyType(...)");
            return v.e(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(v.y(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f87341k.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> b(List<? extends KotlinType> bounds) {
        s.k(bounds, "bounds");
        return this.f87341k.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, bounds, this.f87341k);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> c() {
        return d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected void reportSupertypeLoopError(KotlinType type) {
        s.k(type, "type");
    }
}
