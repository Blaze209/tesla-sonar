package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    protected void finalize() throws Throwable {
        try {
            q0();
        } finally {
            super.finalize();
        }
    }

    public void q0() {
        long j11 = this.f23987f;
        if (j11 != 0) {
            this.f23987f = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j11);
        }
    }
}
