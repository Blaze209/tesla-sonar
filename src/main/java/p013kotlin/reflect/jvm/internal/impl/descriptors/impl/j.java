package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueParameterDescriptorImpl.WithDestructuringDeclaration f86984a;

    public j(ValueParameterDescriptorImpl.WithDestructuringDeclaration withDestructuringDeclaration) {
        this.f86984a = withDestructuringDeclaration;
    }

    @Override // wn0.a
    public Object invoke() {
        return ValueParameterDescriptorImpl.WithDestructuringDeclaration.c(this.f86984a);
    }
}
