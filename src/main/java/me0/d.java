package me0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Pair;", "", "location", "", "a", "(Landroid/content/Context;Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodGlobalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"me0/d$a", "Lzc0/b;", "Lcom/facebook/react/bridge/WritableArray;", "results", "Ljn0/h0;", "b", "(Lcom/facebook/react/bridge/WritableArray;)V", "Ljava/lang/Error;", AnalyticsAttribute.Error, "a", "(Ljava/lang/Error;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements zc0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<String> f91852a;

        /* JADX WARN: Multi-variable type inference failed */
        a(CancellableContinuation<? super String> cancellableContinuation) {
            this.f91852a = cancellableContinuation;
        }

        @Override // zc0.b
        public void a(Error error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            if (this.f91852a.isActive()) {
                this.f91852a.resumeWith(jn0.s.b(null));
            }
        }

        @Override // zc0.b
        public void b(WritableArray results) {
            String string;
            p013kotlin.jvm.internal.s.k(results, "results");
            if (this.f91852a.isActive()) {
                ReadableMap map = results.getMap(0);
                CancellableContinuation<String> cancellableContinuation = this.f91852a;
                if (map == null || (string = map.getString("name")) == null) {
                    string = map != null ? map.getString("city") : null;
                }
                cancellableContinuation.resumeWith(jn0.s.b(string));
            }
        }
    }

    public static final Object a(Context context, Pair<Double, Double> pair, Continuation<? super String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        double dDoubleValue = pair.a().doubleValue();
        double dDoubleValue2 = pair.b().doubleValue();
        zc0.a.Companion companion = zc0.a.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        companion.a(applicationContext).c(dDoubleValue, dDoubleValue2, Locale.getDefault().toString(), new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
