package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87491b;

    public p(String str, String str2) {
        this.f87490a = str;
        this.f87491b = str2;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.p(this.f87490a, this.f87491b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
