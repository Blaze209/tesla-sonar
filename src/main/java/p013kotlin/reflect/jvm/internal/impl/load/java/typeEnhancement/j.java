package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87478a;

    public j(String str) {
        this.f87478a = str;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.j(this.f87478a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
