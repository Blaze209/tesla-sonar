package p013kotlin.reflect.jvm.internal.impl.descriptors;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f86760a = new i();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.f((DeclarationDescriptor) obj));
    }
}
