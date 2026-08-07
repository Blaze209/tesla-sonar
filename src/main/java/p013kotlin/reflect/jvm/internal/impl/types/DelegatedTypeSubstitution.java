package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes9.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeSubstitution f88870a;

    public DelegatedTypeSubstitution(TypeSubstitution substitution) {
        s.k(substitution, "substitution");
        this.f88870a = substitution;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.f88870a.approximateCapturedTypes();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f88870a.approximateContravariantCapturedTypes();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        s.k(annotations, "annotations");
        return this.f88870a.filterAnnotations(annotations);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo503get(KotlinType key) {
        s.k(key, "key");
        return this.f88870a.mo503get(key);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.f88870a.isEmpty();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
        s.k(topLevelType, "topLevelType");
        s.k(position, "position");
        return this.f88870a.prepareTopLevelType(topLevelType, position);
    }
}
