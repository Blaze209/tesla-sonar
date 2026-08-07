package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f86974a;

    public a(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f86974a = abstractTypeAliasDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return AbstractTypeAliasDescriptor.g(this.f86974a);
    }
}
