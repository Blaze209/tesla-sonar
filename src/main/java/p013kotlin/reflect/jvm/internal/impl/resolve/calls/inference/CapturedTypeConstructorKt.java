package p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
public final class CapturedTypeConstructorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeProjection b(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (!typeProjection.isStarProjection()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
        s.j(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new a(typeProjection)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType c(TypeProjection typeProjection) {
        KotlinType type = typeProjection.getType();
        s.j(type, "getType(...)");
        return type;
    }

    public static final KotlinType createCapturedType(TypeProjection typeProjection) {
        s.k(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    public static final TypeSubstitution wrapWithCapturingSubstitution(TypeSubstitution typeSubstitution, final boolean z11) {
        s.k(typeSubstitution, "<this>");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
                @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateContravariantCapturedTypes() {
                    return z11;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: get */
                public TypeProjection mo503get(KotlinType key) {
                    s.k(key, "key");
                    TypeProjection typeProjectionMo503get = super.mo503get(key);
                    if (typeProjectionMo503get == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = key.getConstructor().mo500getDeclarationDescriptor();
                    return CapturedTypeConstructorKt.b(typeProjectionMo503get, classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        List<Pair> listO1 = n.O1(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
        ArrayList arrayList = new ArrayList(v.y(listO1, 10));
        for (Pair pair : listO1) {
            arrayList.add(b((TypeProjection) pair.e(), (TypeParameterDescriptor) pair.f()));
        }
        return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z11);
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z11);
    }
}
