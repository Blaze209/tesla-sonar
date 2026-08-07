package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87470a;

    public f(String str) {
        this.f87470a = str;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.a(this.f87470a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
