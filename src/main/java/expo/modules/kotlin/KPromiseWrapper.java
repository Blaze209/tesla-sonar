package expo.modules.kotlin;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.types.JSTypeConverter;
import java.util.Collection;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/KPromiseWrapper;", "Lexpo/modules/kotlin/Promise;", "Lcom/facebook/react/bridge/Promise;", "bridgePromise", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", "", "value", "Ljn0/h0;", "resolve", "(Ljava/lang/Object;)V", "", "code", "message", "", "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/Promise;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KPromiseWrapper implements Promise {
    private final com.facebook.react.bridge.Promise bridgePromise;

    public KPromiseWrapper(com.facebook.react.bridge.Promise bridgePromise) {
        s.k(bridgePromise, "bridgePromise");
        this.bridgePromise = bridgePromise;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve() {
        Promise.DefaultImpls.resolve(this);
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(String code, String message, Throwable cause) {
        s.k(code, "code");
        this.bridgePromise.reject(code, message, cause);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(double d11) {
        Promise.DefaultImpls.resolve(this, d11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(float f11) {
        Promise.DefaultImpls.resolve((Promise) this, f11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(int i11) {
        Promise.DefaultImpls.resolve((Promise) this, i11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(String str) {
        Promise.DefaultImpls.resolve(this, str);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Collection<? extends Object> collection) {
        Promise.DefaultImpls.resolve(this, collection);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Map<String, ? extends Object> map) {
        Promise.DefaultImpls.resolve(this, map);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(boolean z11) {
        Promise.DefaultImpls.resolve(this, z11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Object value) {
        this.bridgePromise.resolve(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, value, null, false, 6, null));
    }
}
