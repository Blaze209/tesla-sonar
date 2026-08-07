package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class w implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f87513b;

    public w(String str, String str2) {
        this.f87512a = str;
        this.f87513b = str2;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.w(this.f87512a, this.f87513b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
