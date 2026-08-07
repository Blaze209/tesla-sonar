package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87488a;

    public o(String str) {
        this.f87488a = str;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.o(this.f87488a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
