package expo.modules.kotlin;

import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0004\u0010\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0004\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0004\u0010\u0011J\u001f\u0010\u0004\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0016¢\u0006\u0004\b\u0004\u0010\u0013J%\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0016¢\u0006\u0004\b\u0004\u0010\u0015J+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/Promise;", "", "value", "Ljn0/h0;", "resolve", "(Ljava/lang/Object;)V", "()V", "", "result", "(I)V", "", "(Z)V", "", "(D)V", "", "(F)V", "", "(Ljava/lang/String;)V", "", "(Ljava/util/Collection;)V", "", "(Ljava/util/Map;)V", "code", "message", "", "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lexpo/modules/kotlin/exception/CodedException;", "exception", "(Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Promise {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void reject(Promise promise, CodedException exception) {
            s.k(exception, "exception");
            promise.reject(exception.getCode(), exception.getLocalizedMessage(), exception.getCause());
        }

        public static void resolve(Promise promise) {
            promise.resolve((Object) null);
        }

        public static void resolve(Promise promise, int i11) {
            promise.resolve(Integer.valueOf(i11));
        }

        public static void resolve(Promise promise, boolean z11) {
            promise.resolve(Boolean.valueOf(z11));
        }

        public static void resolve(Promise promise, double d11) {
            promise.resolve(Double.valueOf(d11));
        }

        public static void resolve(Promise promise, float f11) {
            promise.resolve(Float.valueOf(f11));
        }

        public static void resolve(Promise promise, String result) {
            s.k(result, "result");
            promise.resolve((Object) result);
        }

        public static void resolve(Promise promise, Collection<? extends Object> result) {
            s.k(result, "result");
            promise.resolve((Object) result);
        }

        public static void resolve(Promise promise, Map<String, ? extends Object> result) {
            s.k(result, "result");
            promise.resolve((Object) result);
        }
    }

    void reject(CodedException exception);

    void reject(String code, String message, Throwable cause);

    void resolve();

    void resolve(double result);

    void resolve(float result);

    void resolve(int result);

    void resolve(Object value);

    void resolve(String result);

    void resolve(Collection<? extends Object> result);

    void resolve(Map<String, ? extends Object> result);

    void resolve(boolean result);
}
