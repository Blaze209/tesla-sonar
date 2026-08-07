package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f23997a;

    private e(long j11) {
        if (j11 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f23997a = j11;
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f23997a, kVar.intValue());
    }

    @Override // com.facebook.yoga.c
    public void b(float f11) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f23997a, f11);
    }

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
