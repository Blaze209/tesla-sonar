package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class m0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87485a;

    public m0(String str) {
        this.f87485a = str;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.b(this.f87485a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
