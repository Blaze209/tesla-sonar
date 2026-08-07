package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeEnhancementInfo f87460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaTypeQualifiers[] f87461b;

    public b(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        this.f87460a = typeEnhancementInfo;
        this.f87461b = javaTypeQualifiersArr;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractSignatureParts.d(this.f87460a, this.f87461b, ((Number) obj).intValue());
    }
}
