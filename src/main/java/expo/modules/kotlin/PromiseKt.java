package expo.modules.kotlin;

import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.jni.PromiseImpl;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"unknownCode", "", "toBridgePromise", "Lcom/facebook/react/bridge/Promise;", "Lexpo/modules/kotlin/Promise;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PromiseKt {
    private static final String unknownCode = "UnknownCode";

    public static final com.facebook.react.bridge.Promise toBridgePromise(final Promise promise) {
        s.k(promise, "<this>");
        final l promiseKt$toBridgePromise$resolveMethod$1 = promise instanceof PromiseImpl ? new PromiseKt$toBridgePromise$resolveMethod$1(((PromiseImpl) promise).getCallback()) : new PromiseKt$toBridgePromise$resolveMethod$2(promise);
        return new com.facebook.react.bridge.Promise() { // from class: expo.modules.kotlin.PromiseKt.toBridgePromise.1
            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message) {
                s.k(code, "code");
                promise.reject(code, message, null);
            }

            @Override // com.facebook.react.bridge.Promise
            public void resolve(Object value) {
                promiseKt$toBridgePromise$resolveMethod$1.invoke(value);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, Throwable throwable) {
                s.k(code, "code");
                promise.reject(code, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message, Throwable throwable) {
                s.k(code, "code");
                promise.reject(code, message, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(Throwable throwable) {
                s.k(throwable, "throwable");
                promise.reject(PromiseKt.unknownCode, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(Throwable throwable, WritableMap userInfo) {
                s.k(throwable, "throwable");
                s.k(userInfo, "userInfo");
                promise.reject(PromiseKt.unknownCode, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, WritableMap userInfo) {
                s.k(code, "code");
                s.k(userInfo, "userInfo");
                promise.reject(code, null, null);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, Throwable throwable, WritableMap userInfo) {
                s.k(code, "code");
                s.k(userInfo, "userInfo");
                promise.reject(code, null, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message, WritableMap userInfo) {
                s.k(code, "code");
                s.k(userInfo, "userInfo");
                promise.reject(code, message, null);
            }

            @Override // com.facebook.react.bridge.Promise
            public void reject(String code, String message, Throwable throwable, WritableMap userInfo) {
                Promise promise2 = promise;
                if (code == null) {
                    code = PromiseKt.unknownCode;
                }
                promise2.reject(code, message, throwable);
            }

            @Override // com.facebook.react.bridge.Promise
            @e
            public void reject(String message) {
                s.k(message, "message");
                promise.reject(PromiseKt.unknownCode, message, null);
            }
        };
    }
}
