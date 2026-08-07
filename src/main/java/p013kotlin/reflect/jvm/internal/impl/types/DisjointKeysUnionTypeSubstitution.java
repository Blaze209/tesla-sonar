package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes9.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeSubstitution f88872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeSubstitution f88873b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeSubstitution create(TypeSubstitution first, TypeSubstitution second) {
            s.k(first, "first");
            s.k(second, "second");
            if (first.isEmpty()) {
                return second;
            }
            return second.isEmpty() ? first : new DisjointKeysUnionTypeSubstitution(first, second, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }

    public static final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.f88872a.approximateCapturedTypes() || this.f88873b.approximateCapturedTypes();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f88872a.approximateContravariantCapturedTypes() || this.f88873b.approximateContravariantCapturedTypes();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        s.k(annotations, "annotations");
        return this.f88873b.filterAnnotations(this.f88872a.filterAnnotations(annotations));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo503get(KotlinType key) {
        s.k(key, "key");
        TypeProjection typeProjectionMo503get = this.f88872a.mo503get(key);
        return typeProjectionMo503get == null ? this.f88873b.mo503get(key) : typeProjectionMo503get;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
        s.k(topLevelType, "topLevelType");
        s.k(position, "position");
        return this.f88873b.prepareTopLevelType(this.f88872a.prepareTopLevelType(topLevelType, position), position);
    }

    private DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f88872a = typeSubstitution;
        this.f88873b = typeSubstitution2;
    }
}
