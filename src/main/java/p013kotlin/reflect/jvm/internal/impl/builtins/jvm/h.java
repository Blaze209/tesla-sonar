package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.Pair;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f86681a;

    public h(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f86681a = jvmBuiltInsCustomizer;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.n(this.f86681a, (Pair) obj);
    }
}
