package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInClassDescriptorFactory f86670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StorageManager f86671b;

    public a(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.f86670a = jvmBuiltInClassDescriptorFactory;
        this.f86671b = storageManager;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmBuiltInClassDescriptorFactory.d(this.f86670a, this.f86671b);
    }
}
