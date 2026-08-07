package expo.modules.kotlin.devtools;

import expo.modules.kotlin.devtools.cdp.Event;
import expo.modules.kotlin.devtools.cdp.ExpoReceivedResponseBodyParams;
import expo.modules.kotlin.devtools.cdp.LoadingFinishedParams;
import expo.modules.kotlin.devtools.cdp.RequestWillBeSentExtraInfoParams;
import expo.modules.kotlin.devtools.cdp.RequestWillBeSentParams;
import expo.modules.kotlin.devtools.cdp.ResponseReceivedParams;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor;", "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "<init>", "()V", "Lexpo/modules/kotlin/devtools/cdp/Event;", "event", "Ljn0/h0;", "dispatchEvent", "(Lexpo/modules/kotlin/devtools/cdp/Event;)V", "Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;", "delegate", "setDelegate", "(Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;)V", "", "requestId", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "redirectResponse", "willSendRequest", "(Ljava/lang/String;Lokhttp3/Request;Lokhttp3/Response;)V", "response", "Lokhttp3/ResponseBody;", "body", "didReceiveResponse", "(Ljava/lang/String;Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/ResponseBody;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$expo_modules_core_release", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$expo_modules_core_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "Delegate", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpoRequestCdpInterceptor implements ExpoNetworkInspectOkHttpInterceptorsDelegate {
    public static final ExpoRequestCdpInterceptor INSTANCE = new ExpoRequestCdpInterceptor();
    private static WeakReference<Delegate> delegate = new WeakReference<>(null);
    private static CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/devtools/ExpoRequestCdpInterceptor$Delegate;", "", "", "event", "Ljn0/h0;", "dispatch", "(Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Delegate {
        void dispatch(String event);
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$dispatchEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$dispatchEvent$1", f = "ExpoRequestCdpInterceptor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Event $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Event event, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = event;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$event, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Delegate delegate = (Delegate) ExpoRequestCdpInterceptor.delegate.get();
            if (delegate != null) {
                delegate.dispatch(this.$event.toJson());
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$setDelegate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.kotlin.devtools.ExpoRequestCdpInterceptor$setDelegate$1", f = "ExpoRequestCdpInterceptor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C46311 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Delegate $delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46311(Delegate delegate, Continuation<? super C46311> continuation) {
            super(2, continuation);
            this.$delegate = delegate;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C46311(this.$delegate, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ExpoRequestCdpInterceptor expoRequestCdpInterceptor = ExpoRequestCdpInterceptor.INSTANCE;
            ExpoRequestCdpInterceptor.delegate = new WeakReference(this.$delegate);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C46311) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private ExpoRequestCdpInterceptor() {
    }

    private final void dispatchEvent(Event event) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(event, null), 3, null);
    }

    @Override // expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpInterceptorsDelegate
    public void didReceiveResponse(String requestId, Request request, Response response, ResponseBody body) {
        s.k(requestId, "requestId");
        s.k(request, "request");
        s.k(response, "response");
        BigDecimal scale = new BigDecimal(System.currentTimeMillis() / 1000.0d).setScale(3, RoundingMode.CEILING);
        s.h(scale);
        dispatchEvent(new Event("Network.responseReceived", new ResponseReceivedParams(scale, requestId, response)));
        if (body != null) {
            dispatchEvent(new Event("Expo(Network.receivedResponseBody)", new ExpoReceivedResponseBodyParams(requestId, body)));
        }
        dispatchEvent(new Event("Network.loadingFinished", new LoadingFinishedParams(scale, requestId, response)));
    }

    public final CoroutineScope getCoroutineScope$expo_modules_core_release() {
        return coroutineScope;
    }

    public final void setCoroutineScope$expo_modules_core_release(CoroutineScope coroutineScope2) {
        s.k(coroutineScope2, "<set-?>");
        coroutineScope = coroutineScope2;
    }

    public final void setDelegate(Delegate delegate2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C46311(delegate2, null), 3, null);
    }

    @Override // expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpInterceptorsDelegate
    public void willSendRequest(String requestId, Request request, Response redirectResponse) {
        s.k(requestId, "requestId");
        s.k(request, "request");
        BigDecimal scale = new BigDecimal(System.currentTimeMillis() / 1000.0d).setScale(3, RoundingMode.CEILING);
        s.h(scale);
        dispatchEvent(new Event("Network.requestWillBeSent", new RequestWillBeSentParams(scale, requestId, request, redirectResponse)));
        dispatchEvent(new Event("Network.requestWillBeSentExtraInfo", new RequestWillBeSentExtraInfoParams(scale, requestId, request)));
    }
}
