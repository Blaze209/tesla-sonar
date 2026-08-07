package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public class f extends e {
    public void c() {
        long j11 = this.f23997a;
        if (j11 != 0) {
            this.f23997a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j11);
        }
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
