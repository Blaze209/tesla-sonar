package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f86678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StorageManager f86679b;

    public f(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        this.f86678a = jvmBuiltInsCustomizer;
        this.f86679b = storageManager;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmBuiltInsCustomizer.j(this.f86678a, this.f86679b);
    }
}
