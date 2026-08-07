package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import hh0.InquiryAttributes;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.y;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "Lfh0/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "service", "Lcom/squareup/moshi/u;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lcom/squareup/moshi/u;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "", "f", "()I", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Lfh0/g;", "endpoint", "Lretrofit2/y;", "h", "(Ljava/lang/String;Lokhttp3/RequestBody;Lfh0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhh0/d;", "attributes", "Ljn0/s;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(Lhh0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lcom/squareup/moshi/u;", "getMoshi", "()Lcom/squareup/moshi/u;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", DateTokenConverter.CONVERTER_KEY, "I", "requestCount", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements fh0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FallbackModeService service;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u moshi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i.a staticTemplateSessionFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", i = {0, 0, 1, 1}, l = {83, 119}, m = "createSession-gIAlu-s", n = {"this", "attributes", "this", "steps"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57701n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f57702o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f57703p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f57705r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57703p = obj;
            this.f57705r |= Integer.MIN_VALUE;
            Object objC = d.this.c(null, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : s.a(objC);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", f = "ApiController.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57706n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ InquiryAttributes f57707o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f57708p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", f = "ApiController.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<FallbackModeService.StatusResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57709n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ InquiryAttributes f57710o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f57711p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InquiryAttributes inquiryAttributes, d dVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57710o = inquiryAttributes;
                this.f57711p = dVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57710o, this.f57711p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57709n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                String sessionToken = this.f57710o.getSessionToken();
                if (sessionToken == null || sessionToken.length() == 0) {
                    str = null;
                } else {
                    str = "Bearer " + com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(this.f57710o.getSessionToken());
                }
                FallbackModeService service = this.f57711p.getService();
                FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f57710o.getTemplateId());
                this.f57709n = 1;
                Object objB = service.b(str, statusRequest, this);
                return objB == coroutine_suspended ? coroutine_suspended : objB;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<FallbackModeService.StatusResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InquiryAttributes inquiryAttributes, d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f57707o = inquiryAttributes;
            this.f57708p = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f57707o, this.f57708p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57706n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            a aVar = new a(this.f57707o, this.f57708p, null);
            this.f57706n = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.StatusResponse>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", f = "ApiController.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57712n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ InquiryAttributes f57714p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", f = "ApiController.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<FallbackModeService.SessionIdResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57715n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f57716o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ InquiryAttributes f57717p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, InquiryAttributes inquiryAttributes, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57716o = dVar;
                this.f57717p = inquiryAttributes;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57716o, this.f57717p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57715n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                FallbackModeService service = this.f57716o.getService();
                FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.f57717p.getTemplateId(), this.f57717p.getTemplateVersion(), this.f57717p.getInquiryId(), this.f57717p.getReferenceId(), this.f57717p.getAccountId(), hh0.b.a(this.f57717p.getEnvironment()), this.f57717p.getEnvironmentId(), this.f57717p.d() != null ? new InquiryFieldMap(this.f57717p.d()) : null, this.f57717p.getThemeSetId());
                this.f57715n = 1;
                Object objC = service.c(sessionIdRequest, this);
                return objC == coroutine_suspended ? coroutine_suspended : objC;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<FallbackModeService.SessionIdResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InquiryAttributes inquiryAttributes, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f57714p = inquiryAttributes;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new c(this.f57714p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57712n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            a aVar = new a(d.this, this.f57714p, null);
            this.f57712n = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", i = {0, 0, 1}, l = {170, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "transition", n = {"this", "body", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class C1176d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57718n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f57719o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f57720p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f57722r;

        C1176d(Continuation<? super C1176d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57720p = obj;
            this.f57722r |= Integer.MIN_VALUE;
            return d.this.h(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", f = "ApiController.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57723n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f57725p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ fh0.g f57726q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ RequestBody f57727r;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", f = "ApiController.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<FallbackModeService.UploadUrlResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57728n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f57729o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f57730p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ fh0.g f57731q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ RequestBody f57732r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, String str, fh0.g gVar, RequestBody requestBody, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57729o = dVar;
                this.f57730p = str;
                this.f57731q = gVar;
                this.f57732r = requestBody;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57729o, this.f57730p, this.f57731q, this.f57732r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String mediaType;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57728n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                FallbackModeService service = this.f57729o.getService();
                String str = this.f57730p;
                fh0.g gVar = this.f57731q;
                int iF = this.f57729o.f();
                long jContentLength = this.f57732r.contentLength();
                MediaType contentType = this.f57732r.getContentType();
                if (contentType == null || (mediaType = contentType.getMediaType()) == null) {
                    mediaType = "application/json";
                }
                FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jContentLength, mediaType);
                this.f57728n = 1;
                Object objD = service.d(str, gVar, iF, uploadUrlRequest, this);
                return objD == coroutine_suspended ? coroutine_suspended : objD;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<FallbackModeService.UploadUrlResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, fh0.g gVar, RequestBody requestBody, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f57725p = str;
            this.f57726q = gVar;
            this.f57727r = requestBody;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new e(this.f57725p, this.f57726q, this.f57727r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57723n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            a aVar = new a(d.this, this.f57725p, this.f57726q, this.f57727r, null);
            this.f57723n = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", f = "ApiController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super NetworkCallResult<Object>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57733n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f57735p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ RequestBody f57736q;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", f = "ApiController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<Object>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57737n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f57738o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f57739p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ RequestBody f57740q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, String str, RequestBody requestBody, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57738o = dVar;
                this.f57739p = str;
                this.f57740q = requestBody;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57738o, this.f57739p, this.f57740q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57737n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                FallbackModeService service = this.f57738o.getService();
                String str = this.f57739p;
                RequestBody requestBody = this.f57740q;
                this.f57737n = 1;
                Object objA = service.a(str, requestBody, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<Object>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, RequestBody requestBody, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f57735p = str;
            this.f57736q = requestBody;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new f(this.f57735p, this.f57736q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57733n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            a aVar = new a(d.this, this.f57735p, this.f57736q, null);
            this.f57733n = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueRetriableRequestWithRetry;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<Object>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public d(FallbackModeService service, u moshi, i.a staticTemplateSessionFactory) {
        p013kotlin.jvm.internal.s.k(service, "service");
        p013kotlin.jvm.internal.s.k(moshi, "moshi");
        p013kotlin.jvm.internal.s.k(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.service = service;
        this.moshi = moshi;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f() {
        int i11 = this.requestCount + 1;
        this.requestCount = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x012b  */
    /* JADX WARN: Code duplicated, block: B:44:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object h(String str, RequestBody requestBody, fh0.g gVar, Continuation<? super y<?>> continuation) {
        C1176d c1176d;
        d dVar;
        RequestBody requestBody2;
        d dVar2;
        NetworkCallResult networkCallResult;
        if (continuation instanceof C1176d) {
            c1176d = (C1176d) continuation;
            int i11 = c1176d.f57722r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1176d.f57722r = i11 - Integer.MIN_VALUE;
            } else {
                c1176d = new C1176d(continuation);
            }
        } else {
            c1176d = new C1176d(continuation);
        }
        C1176d c1176d2 = c1176d;
        Object objWithContext = c1176d2.f57720p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1176d2.f57722r;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            e eVar = new e(str, gVar, requestBody, null);
            c1176d2.f57718n = this;
            c1176d2.f57719o = requestBody;
            c1176d2.f57722r = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, eVar, c1176d2);
            if (objWithContext != coroutine_suspended) {
                dVar = this;
                requestBody2 = requestBody;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            requestBody2 = (RequestBody) c1176d2.f57719o;
            dVar = (d) c1176d2.f57718n;
            t.b(objWithContext);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (d) c1176d2.f57718n;
            t.b(objWithContext);
        }
        networkCallResult = (NetworkCallResult) objWithContext;
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            y yVarI = y.i(null);
            p013kotlin.jvm.internal.s.h(yVarI);
            return yVarI;
        }
        ResponseBody.Companion companion = ResponseBody.INSTANCE;
        String json = dVar2.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
        p013kotlin.jvm.internal.s.j(json, "toJson(...)");
        y yVarC = y.c(0, companion.create(json, MediaType.INSTANCE.get("application/json")));
        p013kotlin.jvm.internal.s.h(yVarC);
        return yVarC;
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objWithContext;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            ResponseBody.Companion companion2 = ResponseBody.INSTANCE;
            String json2 = dVar.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            p013kotlin.jvm.internal.s.j(json2, "toJson(...)");
            y yVarC2 = y.c(0, companion2.create(json2, MediaType.INSTANCE.get("application/json")));
            p013kotlin.jvm.internal.s.j(yVarC2, "error(...)");
            return yVarC2;
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        FallbackModeService.UploadUrlResponse uploadUrlResponse = (FallbackModeService.UploadUrlResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        String location = uploadUrlResponse != null ? uploadUrlResponse.getLocation() : null;
        if (location == null) {
            ResponseBody.Companion companion3 = ResponseBody.INSTANCE;
            String json3 = dVar.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            p013kotlin.jvm.internal.s.j(json3, "toJson(...)");
            y yVarC3 = y.c(0, companion3.create(json3, MediaType.INSTANCE.get("application/json")));
            p013kotlin.jvm.internal.s.j(yVarC3, "error(...)");
            return yVarC3;
        }
        CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
        f fVar = dVar.new f(location, requestBody2, null);
        c1176d2.f57718n = dVar;
        c1176d2.f57719o = null;
        c1176d2.f57722r = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher2, fVar, c1176d2);
        if (objWithContext != coroutine_suspended) {
            dVar2 = dVar;
            networkCallResult = (NetworkCallResult) objWithContext;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                y yVarI2 = y.i(null);
                p013kotlin.jvm.internal.s.h(yVarI2);
                return yVarI2;
            }
            ResponseBody.Companion companion4 = ResponseBody.INSTANCE;
            String json4 = dVar2.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            p013kotlin.jvm.internal.s.j(json4, "toJson(...)");
            y yVarC4 = y.c(0, companion4.create(json4, MediaType.INSTANCE.get("application/json")));
            p013kotlin.jvm.internal.s.h(yVarC4);
            return yVarC4;
        }
        return coroutine_suspended;
    }

    @Override // fh0.a
    public Object a(String str, RequestBody requestBody, Continuation<? super y<?>> continuation) {
        return h(str, requestBody, fh0.g.Transition, continuation);
    }

    @Override // fh0.a
    public Object b(String str, RequestBody requestBody, Continuation<? super y<?>> continuation) {
        return h(str, requestBody, fh0.g.TransitionBack, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fh0.a
    public Object c(InquiryAttributes inquiryAttributes, Continuation<? super s<i>> continuation) {
        a aVar;
        String sessionToken;
        d dVar;
        List<NextStep> list;
        d dVar2;
        FallbackModeService.StaticTemplate staticInquiryTemplate;
        NetworkCallResult networkCallResult;
        FallbackModeService.SessionIdResponse sessionIdResponse;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f57705r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f57705r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f57703p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f57705r;
        String token = null;
        if (i12 == 0) {
            t.b(objWithContext);
            String templateId = inquiryAttributes.getTemplateId();
            if ((templateId == null || templateId.length() == 0) && ((sessionToken = inquiryAttributes.getSessionToken()) == null || sessionToken.length() == 0)) {
                s.Companion companion = s.INSTANCE;
                return s.b(t.a(new FallbackException("Expected templateId or session token to be non-null")));
            }
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            b bVar = new b(inquiryAttributes, this, null);
            aVar.f57701n = this;
            aVar.f57702o = inquiryAttributes;
            aVar.f57705r = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, bVar, aVar);
            if (objWithContext != coroutine_suspended) {
                dVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            inquiryAttributes = (InquiryAttributes) aVar.f57702o;
            dVar = (d) aVar.f57701n;
            t.b(objWithContext);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f57702o;
            dVar2 = (d) aVar.f57701n;
            t.b(objWithContext);
        }
        networkCallResult = (NetworkCallResult) objWithContext;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (sessionIdResponse != null) {
                token = sessionIdResponse.getToken();
            }
        }
        if (token == null) {
            s.Companion companion2 = s.INSTANCE;
            return s.b(t.a(new FallbackException("Failed to create session")));
        }
        s.Companion companion3 = s.INSTANCE;
        return s.b(dVar2.staticTemplateSessionFactory.a(list, token));
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objWithContext;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            s.Companion companion4 = s.INSTANCE;
            return s.b(t.a(new FallbackException("Failed to check status")));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List<NextStep> listA = (statusResponse == null || (staticInquiryTemplate = statusResponse.getStaticInquiryTemplate()) == null) ? null : staticInquiryTemplate.a();
        if (listA == null || listA.isEmpty()) {
            s.Companion companion5 = s.INSTANCE;
            return s.b(t.a(new FallbackException("Expected steps to contain at least one step")));
        }
        if (inquiryAttributes.getSessionToken() != null) {
            String strA = com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(inquiryAttributes.getSessionToken());
            if (strA == null) {
                strA = inquiryAttributes.getSessionToken();
            }
            s.Companion companion6 = s.INSTANCE;
            return s.b(dVar.staticTemplateSessionFactory.a(listA, strA));
        }
        String templateId2 = inquiryAttributes.getTemplateId();
        if (templateId2 == null || templateId2.length() == 0) {
            s.Companion companion7 = s.INSTANCE;
            return s.b(t.a(new FallbackException("Template ID is required to create a fallback session without an existing session token")));
        }
        CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
        c cVar = dVar.new c(inquiryAttributes, null);
        aVar.f57701n = dVar;
        aVar.f57702o = listA;
        aVar.f57705r = 2;
        Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, cVar, aVar);
        if (objWithContext2 != coroutine_suspended) {
            List<NextStep> list2 = listA;
            objWithContext = objWithContext2;
            list = list2;
            dVar2 = dVar;
            networkCallResult = (NetworkCallResult) objWithContext;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    token = sessionIdResponse.getToken();
                }
            }
            if (token == null) {
                s.Companion companion8 = s.INSTANCE;
                return s.b(t.a(new FallbackException("Failed to create session")));
            }
            s.Companion companion9 = s.INSTANCE;
            return s.b(dVar2.staticTemplateSessionFactory.a(list, token));
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FallbackModeService getService() {
        return this.service;
    }
}
