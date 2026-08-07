package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87476a;

    public i(String str) {
        this.f87476a = str;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.i(this.f87476a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
