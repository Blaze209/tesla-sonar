package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f86975a;

    public b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f86975a = abstractTypeAliasDescriptor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.i(this.f86975a, (UnwrappedType) obj);
    }
}
