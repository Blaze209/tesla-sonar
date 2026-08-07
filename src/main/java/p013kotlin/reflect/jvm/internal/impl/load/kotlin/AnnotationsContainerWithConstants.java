package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<MemberSignature, List<A>> f87530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<MemberSignature, C> f87531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<MemberSignature, C> f87532c;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(Map<MemberSignature, ? extends List<? extends A>> memberAnnotations, Map<MemberSignature, ? extends C> propertyConstants, Map<MemberSignature, ? extends C> annotationParametersDefaultValues) {
        s.k(memberAnnotations, "memberAnnotations");
        s.k(propertyConstants, "propertyConstants");
        s.k(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f87530a = memberAnnotations;
        this.f87531b = propertyConstants;
        this.f87532c = annotationParametersDefaultValues;
    }

    public final Map<MemberSignature, C> getAnnotationParametersDefaultValues() {
        return this.f87532c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    public Map<MemberSignature, List<A>> getMemberAnnotations() {
        return this.f87530a;
    }

    public final Map<MemberSignature, C> getPropertyConstants() {
        return this.f87531b;
    }
}
