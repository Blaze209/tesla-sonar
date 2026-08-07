package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltIns f86673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StorageManager f86674b;

    public c(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        this.f86673a = jvmBuiltIns;
        this.f86674b = storageManager;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmBuiltIns.t(this.f86673a, this.f86674b);
    }
}
