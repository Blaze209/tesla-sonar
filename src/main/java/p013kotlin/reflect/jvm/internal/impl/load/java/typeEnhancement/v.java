package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class v implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87511b;

    public v(String str, String str2) {
        this.f87510a = str;
        this.f87511b = str2;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.v(this.f87510a, this.f87511b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
