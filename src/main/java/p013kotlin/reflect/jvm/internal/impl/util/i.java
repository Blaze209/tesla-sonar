package p013kotlin.reflect.jvm.internal.impl.util;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeRegistry f89090a;

    public i(TypeRegistry typeRegistry) {
        this.f89090a = typeRegistry;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeRegistry.b(this.f89090a, (String) obj));
    }
}
