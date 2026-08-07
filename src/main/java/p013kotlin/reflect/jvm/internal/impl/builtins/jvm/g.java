package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f86680a;

    public g(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f86680a = jvmBuiltInsCustomizer;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmBuiltInsCustomizer.C(this.f86680a);
    }
}
