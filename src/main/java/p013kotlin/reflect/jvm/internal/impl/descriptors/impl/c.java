package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f86976a;

    public c(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f86976a = abstractTypeAliasDescriptor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.f(this.f86976a, (KotlinTypeRefiner) obj);
    }
}
