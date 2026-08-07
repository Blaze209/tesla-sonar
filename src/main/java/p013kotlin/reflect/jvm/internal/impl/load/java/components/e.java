package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaTargetAnnotationDescriptor f87196a;

    public e(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        this.f87196a = javaTargetAnnotationDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return JavaTargetAnnotationDescriptor.e(this.f87196a);
    }
}
