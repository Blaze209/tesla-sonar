package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BuiltInAnnotationDescriptor f86748a;

    public b(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        this.f86748a = builtInAnnotationDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return BuiltInAnnotationDescriptor.b(this.f86748a);
    }
}
