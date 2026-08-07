package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializedPackageFragmentImpl f88669a;

    public c(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.f88669a = deserializedPackageFragmentImpl;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return DeserializedPackageFragmentImpl.d(this.f88669a, (ClassId) obj);
    }
}
