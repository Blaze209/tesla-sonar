package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: loaded from: classes9.dex */
class l implements wn0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f87482a;

    public l(String str) {
        this.f87482a = str;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.l(this.f87482a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
