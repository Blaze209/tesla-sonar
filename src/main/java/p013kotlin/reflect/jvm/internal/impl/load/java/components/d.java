package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaRetentionAnnotationDescriptor f87195a;

    public d(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        this.f87195a = javaRetentionAnnotationDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return JavaRetentionAnnotationDescriptor.e(this.f87195a);
    }
}
