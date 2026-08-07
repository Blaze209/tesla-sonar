package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p013kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SignatureBuildingComponents f87493a;

    public q(SignatureBuildingComponents signatureBuildingComponents) {
        this.f87493a = signatureBuildingComponents;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.t(this.f87493a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
