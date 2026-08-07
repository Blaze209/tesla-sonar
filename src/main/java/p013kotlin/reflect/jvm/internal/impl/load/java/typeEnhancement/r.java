package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class r implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87496b;

    public r(String str, String str2) {
        this.f87495a = str;
        this.f87496b = str2;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.q(this.f87495a, this.f87496b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
