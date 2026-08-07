package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractDeserializedPackageFragmentProvider f88665a;

    public a(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        this.f88665a = abstractDeserializedPackageFragmentProvider;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractDeserializedPackageFragmentProvider.c(this.f88665a, (FqName) obj);
    }
}
