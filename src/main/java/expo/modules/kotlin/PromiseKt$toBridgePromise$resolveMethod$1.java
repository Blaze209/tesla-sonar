package expo.modules.kotlin;

import expo.modules.kotlin.jni.JavaCallback;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class PromiseKt$toBridgePromise$resolveMethod$1 extends p implements l<Object, h0> {
    PromiseKt$toBridgePromise$resolveMethod$1(Object obj) {
        super(1, obj, JavaCallback.class, "invoke", "invoke(Ljava/lang/Object;)V", 0);
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
        invoke2(obj);
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        ((JavaCallback) this.receiver).invoke(obj);
    }
}
