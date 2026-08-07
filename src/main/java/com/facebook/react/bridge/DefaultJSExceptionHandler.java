package com.facebook.react.bridge;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/bridge/DefaultJSExceptionHandler;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "handleException", "(Ljava/lang/Exception;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultJSExceptionHandler implements JSExceptionHandler {
    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e11) {
        s.k(e11, "e");
        if (!(e11 instanceof RuntimeException)) {
            throw new RuntimeException(e11);
        }
    }
}
