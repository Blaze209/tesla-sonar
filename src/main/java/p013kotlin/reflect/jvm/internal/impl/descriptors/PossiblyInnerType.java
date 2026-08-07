package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes9.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassifierDescriptorWithTypeParameters f86711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<TypeProjection> f86712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PossiblyInnerType f86713c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List<? extends TypeProjection> arguments, PossiblyInnerType possiblyInnerType) {
        s.k(classifierDescriptor, "classifierDescriptor");
        s.k(arguments, "arguments");
        this.f86711a = classifierDescriptor;
        this.f86712b = arguments;
        this.f86713c = possiblyInnerType;
    }

    public final List<TypeProjection> getArguments() {
        return this.f86712b;
    }

    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.f86711a;
    }

    public final PossiblyInnerType getOuterType() {
        return this.f86713c;
    }
}
