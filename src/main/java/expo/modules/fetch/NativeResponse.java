package expo.modules.fetch;

import android.util.Log;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.core.logging.LoggerUtilsKt;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.j;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010%\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R*\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0#j\u0002`=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010@\u001a\u0004\u0018\u00010\u00112\b\u00105\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR4\u0010F\u001a\n\u0018\u00010Dj\u0004\u0018\u0001`E2\u000e\u00105\u001a\n\u0018\u00010Dj\u0004\u0018\u0001`E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lokhttp3/Callback;", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lexpo/modules/kotlin/AppContext;Lkotlinx/coroutines/CoroutineScope;)V", "", "Lexpo/modules/fetch/ResponseState;", "validStates", "", "isInvalidState", "([Lexpo/modules/fetch/ResponseState;)Z", "Lokhttp3/Response;", "response", "Lexpo/modules/fetch/NativeResponseInit;", "createResponseInit", "(Lokhttp3/Response;)Lexpo/modules/fetch/NativeResponseInit;", "Lokio/j;", "stream", "Ljn0/h0;", "pumpResponseBodyStream", "(Lokio/j;)V", "deallocate", "()V", "onStarted", "", "startStreaming", "()[B", "cancelStreaming", "emitRequestCanceled", "", "states", "Lkotlin/Function1;", "callback", "waitForStates", "(Ljava/util/List;Lwn0/l;)V", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Lkotlinx/coroutines/CoroutineScope;", "Lexpo/modules/fetch/ResponseSink;", "sink", "Lexpo/modules/fetch/ResponseSink;", "getSink", "()Lexpo/modules/fetch/ResponseSink;", "value", "state", "Lexpo/modules/fetch/ResponseState;", "getState", "()Lexpo/modules/fetch/ResponseState;", "setState", "(Lexpo/modules/fetch/ResponseState;)V", "", "Lexpo/modules/fetch/StateChangeListener;", "stateChangeOnceListeners", "Ljava/util/List;", "responseInit", "Lexpo/modules/fetch/NativeResponseInit;", "getResponseInit", "()Lexpo/modules/fetch/NativeResponseInit;", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "Ljava/lang/Exception;", "getError", "()Ljava/lang/Exception;", "getBodyUsed", "()Z", "bodyUsed", "Companion", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeResponse extends SharedObject implements Callback {
    private static final String TAG = NativeResponse.class.getSimpleName();
    private final CoroutineScope coroutineScope;
    private Exception error;
    private NativeResponseInit responseInit;
    private final ResponseSink sink;
    private ResponseState state;
    private final List<l<ResponseState, Boolean>> stateChangeOnceListeners;

    /* JADX INFO: renamed from: expo.modules.fetch.NativeResponse$onResponse$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "expo.modules.fetch.NativeResponse$onResponse$1", f = "NativeResponse.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Response $response;
        int label;
        final /* synthetic */ NativeResponse this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Response response, NativeResponse nativeResponse, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$response = response;
            this.this$0 = nativeResponse;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$response, this.this$0, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j bodySource;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ResponseBody responseBodyBody = this.$response.body();
            if (responseBodyBody == null || (bodySource = responseBodyBody.getBodySource()) == null) {
                return h0.f84049a;
            }
            this.this$0.pumpResponseBodyStream(bodySource);
            this.$response.close();
            if (this.this$0.getState() == ResponseState.BODY_STREAMING_STARTED) {
                this.this$0.emit("didComplete", new Object[0]);
            }
            this.this$0.setState(ResponseState.BODY_COMPLETED);
            this.this$0.emit("readyForJSFinalization", new Object[0]);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeResponse(AppContext appContext, CoroutineScope coroutineScope) {
        super(appContext);
        s.k(appContext, "appContext");
        s.k(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.sink = new ResponseSink();
        this.state = ResponseState.INITIALIZED;
        this.stateChangeOnceListeners = new ArrayList();
    }

    private final NativeResponseInit createResponseInit(Response response) {
        int iCode = response.code();
        String strMessage = response.message();
        Headers headers = response.headers();
        ArrayList arrayList = new ArrayList(v.y(headers, 10));
        for (Pair<? extends String, ? extends String> pair : headers) {
            arrayList.add(x.a(pair.e(), pair.f()));
        }
        return new NativeResponseInit(arrayList, iCode, strMessage, response.request().url().getUrl(), response.isRedirect());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResponseState getState() {
        ResponseState responseState;
        synchronized (this) {
            responseState = this.state;
        }
        return responseState;
    }

    private final boolean isInvalidState(ResponseState... validStates) {
        if (n.e0(validStates, getState())) {
            return false;
        }
        String strT0 = n.T0(validStates, ",", null, null, 0, null, new l() { // from class: expo.modules.fetch.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return NativeResponse.isInvalidState$lambda$3((ResponseState) obj);
            }
        }, 30, null);
        Log.w(TAG, "Invalid state - currentState[" + getState().getIntValue() + "] validStates[" + strT0 + "]");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence isInvalidState$lambda$3(ResponseState it) {
        s.k(it, "it");
        return String.valueOf(it.getIntValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pumpResponseBodyStream(j stream) {
        while (!stream.T2()) {
            try {
                ResponseState responseState = ResponseState.RESPONSE_RECEIVED;
                ResponseState responseState2 = ResponseState.BODY_STREAMING_STARTED;
                if (isInvalidState(responseState, responseState2, ResponseState.BODY_STREAMING_CANCELED)) {
                    return;
                }
                if (getState() == responseState) {
                    this.sink.appendBufferBody$expo_release(stream.getBufferField().V0());
                } else if (getState() != responseState2) {
                    return;
                } else {
                    emit("didReceiveResponseData", stream.getBufferField().V0());
                }
            } catch (IOException e11) {
                this.error = e11;
                if (getState() == ResponseState.BODY_STREAMING_STARTED) {
                    emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(e11));
                }
                setState(ResponseState.ERROR_RECEIVED);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ResponseState responseState) {
        synchronized (this) {
            this.state = responseState;
            h0 h0Var = h0.f84049a;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new NativeResponse$state$3(this, responseState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitForStates$lambda$2(List list, l lVar, ResponseState newState) {
        s.k(newState, "newState");
        if (!list.contains(newState)) {
            return false;
        }
        lVar.invoke(newState);
        return true;
    }

    public final void cancelStreaming() {
        if (isInvalidState(ResponseState.BODY_STREAMING_STARTED)) {
            return;
        }
        setState(ResponseState.BODY_STREAMING_CANCELED);
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void deallocate() {
        this.sink.finalize();
        super.deallocate();
    }

    public final void emitRequestCanceled() {
        FetchRequestCanceledException fetchRequestCanceledException = new FetchRequestCanceledException();
        this.error = fetchRequestCanceledException;
        if (getState() == ResponseState.BODY_STREAMING_STARTED) {
            emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(fetchRequestCanceledException));
        }
        setState(ResponseState.ERROR_RECEIVED);
    }

    public final boolean getBodyUsed() {
        return this.sink.getBodyUsed();
    }

    public final Exception getError() {
        return this.error;
    }

    public final NativeResponseInit getResponseInit() {
        return this.responseInit;
    }

    public final ResponseSink getSink() {
        return this.sink;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e11) {
        s.k(call, "call");
        s.k(e11, "e");
        if (e11.getMessage() == "Canceled") {
            return;
        }
        ResponseState responseState = ResponseState.STARTED;
        ResponseState responseState2 = ResponseState.RESPONSE_RECEIVED;
        ResponseState responseState3 = ResponseState.BODY_STREAMING_STARTED;
        if (isInvalidState(responseState, responseState2, responseState3, ResponseState.BODY_STREAMING_CANCELED)) {
            return;
        }
        if (getState() == responseState3) {
            emit("didFailWithError", LoggerUtilsKt.localizedMessageWithCauseLocalizedMessage(e11));
        }
        this.error = e11;
        setState(ResponseState.ERROR_RECEIVED);
        emit("readyForJSFinalization", new Object[0]);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        s.k(call, "call");
        s.k(response, "response");
        this.responseInit = createResponseInit(response);
        setState(ResponseState.RESPONSE_RECEIVED);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(response, this, null), 2, null);
    }

    public final void onStarted() {
        if (isInvalidState(ResponseState.INITIALIZED)) {
            return;
        }
        setState(ResponseState.STARTED);
    }

    public final byte[] startStreaming() {
        ResponseState responseState = ResponseState.RESPONSE_RECEIVED;
        ResponseState responseState2 = ResponseState.BODY_COMPLETED;
        if (isInvalidState(responseState, responseState2)) {
            return null;
        }
        if (getState() == responseState) {
            setState(ResponseState.BODY_STREAMING_STARTED);
            emit("didReceiveResponseData", this.sink.finalize());
        } else if (getState() == responseState2) {
            return this.sink.finalize();
        }
        return null;
    }

    public final void waitForStates(final List<? extends ResponseState> states, final l<? super ResponseState, h0> callback) {
        s.k(states, "states");
        s.k(callback, "callback");
        if (states.contains(getState())) {
            callback.invoke(getState());
        } else {
            this.stateChangeOnceListeners.add(new l() { // from class: expo.modules.fetch.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NativeResponse.waitForStates$lambda$2(states, callback, (ResponseState) obj));
                }
            });
        }
    }
}
