package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import gg0.ThreatEventState;
import hh0.s;
import hi0.GpsData;
import hi0.InquirySessionConfig;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import jn0.h0;
import jn0.t;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import retrofit2.y;
import wn0.p;
import yh0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0018\u0010\u0016J6\u0010\u001e\u001a\u0004\u0018\u00010\u00172\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b%\u0010&J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020\u0010H\u0086@¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b1\u0010.J \u00103\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b3\u0010\u0016J0\u00104\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b4\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/e;", "", "Landroid/content/Context;", "applicationContext", "Lhh0/s;", "service", "Lfh0/h;", "fallbackModeManager", "Lrh0/c;", "sandboxFlags", "Lhg0/a;", "deviceIdProvider", "Lgh0/a;", "playIntegrityHelper", "<init>", "(Landroid/content/Context;Lhh0/s;Lfh0/h;Lrh0/c;Lhg0/a;Lgh0/a;)V", "", "sessionToken", "Lhi0/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/j;", "q", "(Ljava/lang/String;Lhi0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "p", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/y;", "Lokhttp3/ResponseBody;", "inquiryCall", "k", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiryId", "fromStep", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhi0/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhh0/d;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "h", "(Lhh0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "j", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "o", "n", "a", "Landroid/content/Context;", "b", "Lhh0/s;", "c", "Lfh0/h;", DateTokenConverter.CONVERTER_KEY, "Lrh0/c;", "e", "Lhg0/a;", "f", "Lgh0/a;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s service;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fh0.h fallbackModeManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rh0.c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hg0.a deviceIdProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gh0.a playIntegrityHelper;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0}, l = {57, 73}, m = "createInquiry", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58128n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f58129o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f58131q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58129o = obj;
            this.f58131q |= Integer.MIN_VALUE;
            return e.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0}, l = {118}, m = "createInquirySession", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58132n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f58133o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f58135q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58133o = obj;
            this.f58135q |= Integer.MIN_VALUE;
            return e.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0, 0}, l = {149}, m = "exchangeOneTimeLinkCode", n = {"this", "oneTimeLinkCode"}, s = {"L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58136n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f58137o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f58138p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58140r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58138p = obj;
            this.f58140r |= Integer.MIN_VALUE;
            return e.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m = "makeInquiryCallWithRetry", n = {"lastError"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58141n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f58142o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f58144q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58142o = obj;
            this.f58144q |= Integer.MIN_VALUE;
            return e.this.k(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "attempt", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", f = "InquiryApiHelper.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class C1187e extends SuspendLambda implements p<Integer, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58145n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ int f58146o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<Continuation<? super y<ResponseBody>>, Object> f58147p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0<InternalErrorInfo> f58148q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1187e(wn0.l<? super Continuation<? super y<ResponseBody>>, ? extends Object> lVar, n0<InternalErrorInfo> n0Var, Continuation<? super C1187e> continuation) {
            super(2, continuation);
            this.f58147p = lVar;
            this.f58148q = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C1187e c1187e = new C1187e(this.f58147p, this.f58148q, continuation);
            c1187e.f58146o = ((Number) obj).intValue();
            return c1187e;
        }

        public final Object invoke(int i11, Continuation<? super Boolean> continuation) {
            return ((C1187e) create(Integer.valueOf(i11), continuation)).invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (r12 == r0) goto L20;
         */
        /* JADX WARN: Type inference failed for: r12v12, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f58145n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                jn0.t.b(r12)     // Catch: java.io.IOException -> L12
                goto L3e
            L12:
                r0 = move-exception
                r12 = r0
                goto L62
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                jn0.t.b(r12)
                goto L33
            L21:
                jn0.t.b(r12)
                int r12 = r11.f58146o
                if (r12 <= 0) goto L33
                r11.f58145n = r3
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r4, r11)
                if (r12 != r0) goto L33
                goto L3d
            L33:
                wn0.l<kotlin.coroutines.Continuation<? super retrofit2.y<okhttp3.ResponseBody>>, java.lang.Object> r12 = r11.f58147p     // Catch: java.io.IOException -> L12
                r11.f58145n = r2     // Catch: java.io.IOException -> L12
                java.lang.Object r12 = r12.invoke(r11)     // Catch: java.io.IOException -> L12
                if (r12 != r0) goto L3e
            L3d:
                return r0
            L3e:
                retrofit2.y r12 = (retrofit2.y) r12     // Catch: java.io.IOException -> L12
                boolean r0 = r12.g()
                if (r0 != 0) goto L57
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r12 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r12)
                kotlin.jvm.internal.n0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r11.f58148q
                r0.f86529a = r12
                boolean r12 = r12.isRecoverable()
                java.lang.Boolean r12 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
                return r12
            L57:
                kotlin.jvm.internal.n0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r12 = r11.f58148q
                r0 = 0
                r12.f86529a = r0
                r12 = 0
                java.lang.Boolean r12 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
                return r12
            L62:
                kotlin.jvm.internal.n0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r11.f58148q
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r4 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                java.lang.String r6 = r12.getMessage()
                r9 = 8
                r10 = 0
                r5 = 0
                r7 = 1
                r8 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r0.f86529a = r4
                java.lang.Boolean r12 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.C1187e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0}, l = {369}, m = "runFallbackTransitionBack", n = {"this"}, s = {"L$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58149n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f58150o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f58152q;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58150o = obj;
            this.f58152q |= Integer.MIN_VALUE;
            return e.this.l(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0, 0}, l = {340}, m = "runTransitionBack", n = {"sessionToken", "inquirySessionConfig"}, s = {"L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58153n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f58154o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f58155p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58157r;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58155p = obj;
            this.f58157r |= Integer.MIN_VALUE;
            return e.this.m(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0, 0, 0, 1}, l = {193, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE}, m = "updateInquiry", n = {"this", "sessionToken", "inquirySessionConfig", "inquirySessionConfig"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58158n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f58159o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f58160p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f58161q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58163s;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58161q = obj;
            this.f58163s |= Integer.MIN_VALUE;
            return e.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m = "updateInquiryInternal", n = {"this", "sessionToken", "gpsData"}, s = {"L$0", "L$1", "L$2"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58164n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f58165o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f58166p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f58167q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58169s;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58167q = obj;
            this.f58169s |= Integer.MIN_VALUE;
            return e.this.p(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", f = "InquiryApiHelper.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.l<Continuation<? super y<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58170n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f58172p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ GpsData f58173q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ThreatEventState f58174r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, GpsData gpsData, ThreatEventState threatEventState, Continuation<? super j> continuation) {
            super(1, continuation);
            this.f58172p = str;
            this.f58173q = gpsData;
            this.f58174r = threatEventState;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return e.this.new j(this.f58172p, this.f58173q, this.f58174r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<String, ThreatEventState.EventMetadata> mapB;
            hi0.c precision;
            Location location;
            Location location2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f58170n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            s sVar = e.this.service;
            String str = this.f58172p;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            GpsData gpsData = this.f58173q;
            ArrayList arrayList = null;
            Double dBoxDouble = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : Boxing.boxDouble(location2.getLatitude());
            GpsData gpsData2 = this.f58173q;
            Double dBoxDouble2 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : Boxing.boxDouble(location.getLongitude());
            GpsData gpsData3 = this.f58173q;
            String strA = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : hi0.d.a(precision);
            ThreatEventState threatEventState = this.f58174r;
            if (threatEventState != null && (mapB = threatEventState.b()) != null) {
                arrayList = new ArrayList(mapB.size());
                for (Map.Entry<String, ThreatEventState.EventMetadata> entry : mapB.entrySet()) {
                    String key = entry.getKey();
                    String timestamp = entry.getValue().getTimestamp();
                    String str2 = "";
                    if (timestamp == null) {
                        timestamp = "";
                    }
                    String reasonData = entry.getValue().getReasonData();
                    if (reasonData != null) {
                        str2 = reasonData;
                    }
                    arrayList.add(new UpdateInquirySessionRequest.AppdomeThreatEvent(key, timestamp, str2));
                }
            }
            UpdateInquirySessionRequest updateInquirySessionRequestA = companion.a(dBoxDouble2, dBoxDouble, strA, arrayList);
            this.f58170n = 1;
            Object objA = sVar.a(str, updateInquirySessionRequestA, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super y<ResponseBody>> continuation) {
            return ((j) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", i = {0, 0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 255}, m = "verifyDeviceIntegrity", n = {"this", "sessionToken", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58175n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f58176o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f58177p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58179r;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58177p = obj;
            this.f58179r |= Integer.MIN_VALUE;
            return e.this.q(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", f = "InquiryApiHelper.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.l<Continuation<? super y<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58180n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f58182p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f58183q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, Continuation<? super l> continuation) {
            super(1, continuation);
            this.f58182p = str;
            this.f58183q = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return e.this.new l(this.f58182p, this.f58183q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f58180n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            s sVar = e.this.service;
            String str = this.f58182p;
            VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(e.this.applicationContext.getPackageName(), this.f58183q));
            this.f58180n = 1;
            Object objC = sVar.c(str, verifyDeviceIntegrityRequest, this);
            return objC == coroutine_suspended ? coroutine_suspended : objC;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super y<ResponseBody>> continuation) {
            return ((l) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public e(Context applicationContext, s service, fh0.h fallbackModeManager, rh0.c sandboxFlags, hg0.a deviceIdProvider, gh0.a playIntegrityHelper) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(service, "service");
        p013kotlin.jvm.internal.s.k(fallbackModeManager, "fallbackModeManager");
        p013kotlin.jvm.internal.s.k(sandboxFlags, "sandboxFlags");
        p013kotlin.jvm.internal.s.k(deviceIdProvider, "deviceIdProvider");
        p013kotlin.jvm.internal.s.k(playIntegrityHelper, "playIntegrityHelper");
        this.applicationContext = applicationContext;
        this.service = service;
        this.fallbackModeManager = fallbackModeManager;
        this.sandboxFlags = sandboxFlags;
        this.deviceIdProvider = deviceIdProvider;
        this.playIntegrityHelper = playIntegrityHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(wn0.l<? super Continuation<? super y<ResponseBody>>, ? extends Object> lVar, Continuation<? super InternalErrorInfo> continuation) {
        d dVar;
        n0 n0Var;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f58144q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f58144q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f58142o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f58144q;
        if (i12 == 0) {
            t.b(obj);
            n0 n0Var2 = new n0();
            C1187e c1187e = new C1187e(lVar, n0Var2, null);
            dVar.f58141n = n0Var2;
            dVar.f58144q = 1;
            if (u.a(5, c1187e, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) dVar.f58141n;
            t.b(obj);
        }
        return n0Var.f86529a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, String str2, Continuation<? super com.withpersona.sdk2.inquiry.internal.network.h> continuation) {
        f fVar;
        e eVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f58152q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f58152q = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objF = fVar.f58150o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f58152q;
        try {
            if (i12 == 0) {
                t.b(objF);
                fh0.h hVar = this.fallbackModeManager;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str2);
                fVar.f58149n = this;
                fVar.f58152q = 1;
                objF = hVar.f(str, transitionBackRequestA, fVar);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (e) fVar.f58149n;
                t.b(objF);
            }
            y yVar = (y) objF;
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = eVar.fallbackModeManager.getCurrentSession();
            if (yVar.g()) {
                return currentSession == null ? new com.withpersona.sdk2.inquiry.internal.network.h.Error(new InternalErrorInfo.UnknownErrorInfo("Current fallback session is unexpectedly null.")) : new com.withpersona.sdk2.inquiry.internal.network.h.Success(currentSession.a());
            }
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toErrorInfo(yVar));
        } catch (SocketTimeoutException e11) {
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, Continuation<? super com.withpersona.sdk2.inquiry.internal.network.h> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f58157r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f58157r = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objB = gVar.f58155p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f58157r;
        try {
            if (i12 == 0) {
                t.b(objB);
                s sVar = this.service;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str3);
                gVar.f58153n = str;
                gVar.f58154o = inquirySessionConfig;
                gVar.f58157r = 1;
                objB = sVar.b(str, str2, transitionBackRequestA, gVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inquirySessionConfig = (InquirySessionConfig) gVar.f58154o;
                str = (String) gVar.f58153n;
                t.b(objB);
            }
            y yVar = (y) objB;
            if (!yVar.g()) {
                return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toErrorInfo(yVar));
            }
            Object objA = yVar.a();
            p013kotlin.jvm.internal.s.h(objA);
            return new com.withpersona.sdk2.inquiry.internal.network.h.Success(hh0.a.o((CheckInquiryResponse) objA, str, inquirySessionConfig));
        } catch (SocketTimeoutException e11) {
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r15 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r13, hi0.InquirySessionConfig r14, p013kotlin.coroutines.Continuation<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.withpersona.sdk2.inquiry.internal.network.e.i
            if (r0 == 0) goto L13
            r0 = r15
            com.withpersona.sdk2.inquiry.internal.network.e$i r0 = (com.withpersona.sdk2.inquiry.internal.network.e.i) r0
            int r1 = r0.f58169s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58169s = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$i r0 = new com.withpersona.sdk2.inquiry.internal.network.e$i
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f58167q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f58169s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            jn0.t.b(r15)
            goto La5
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            java.lang.Object r13 = r0.f58166p
            hi0.b r13 = (hi0.GpsData) r13
            java.lang.Object r14 = r0.f58165o
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.f58164n
            com.withpersona.sdk2.inquiry.internal.network.e r2 = (com.withpersona.sdk2.inquiry.internal.network.e) r2
            jn0.t.b(r15)
            goto L72
        L46:
            jn0.t.b(r15)
            hi0.a r14 = r14.getGpsCollectionRequirement()
            hi0.a r15 = hi0.a.NONE
            if (r14 == r15) goto L58
            android.content.Context r14 = r12.applicationContext
            hi0.b r14 = hi0.f.a(r14)
            goto L59
        L58:
            r14 = r5
        L59:
            kotlinx.coroutines.flow.Flow r15 = gg0.c.b()
            if (r15 == 0) goto L79
            r0.f58164n = r12
            r0.f58165o = r13
            r0.f58166p = r14
            r0.f58169s = r4
            java.lang.Object r15 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r15, r0)
            if (r15 != r1) goto L6e
            goto La4
        L6e:
            r2 = r14
            r14 = r13
            r13 = r2
            r2 = r12
        L72:
            gg0.a r15 = (gg0.ThreatEventState) r15
            r9 = r13
            r8 = r14
            r10 = r15
            r7 = r2
            goto L7d
        L79:
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r5
        L7d:
            if (r9 != 0) goto L90
            if (r10 == 0) goto L86
            java.util.Map r13 = r10.b()
            goto L87
        L86:
            r13 = r5
        L87:
            if (r13 == 0) goto L8f
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L90
        L8f:
            return r5
        L90:
            com.withpersona.sdk2.inquiry.internal.network.e$j r6 = new com.withpersona.sdk2.inquiry.internal.network.e$j
            r11 = 0
            r6.<init>(r8, r9, r10, r11)
            r0.f58164n = r5
            r0.f58165o = r5
            r0.f58166p = r5
            r0.f58169s = r3
            java.lang.Object r15 = r7.k(r6, r0)
            if (r15 != r1) goto La5
        La4:
            return r1
        La5:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r15 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.p(java.lang.String, hi0.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r9.i(r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r9, hi0.InquirySessionConfig r10, p013kotlin.coroutines.Continuation<? super com.withpersona.sdk2.inquiry.internal.network.j> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.withpersona.sdk2.inquiry.internal.network.e.k
            if (r0 == 0) goto L13
            r0 = r11
            com.withpersona.sdk2.inquiry.internal.network.e$k r0 = (com.withpersona.sdk2.inquiry.internal.network.e.k) r0
            int r1 = r0.f58179r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58179r = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.internal.network.e$k r0 = new com.withpersona.sdk2.inquiry.internal.network.e$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f58177p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f58179r
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            jn0.t.b(r11)
            goto L97
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.f58175n
            com.withpersona.sdk2.inquiry.internal.network.e r9 = (com.withpersona.sdk2.inquiry.internal.network.e) r9
            jn0.t.b(r11)
            goto L86
        L41:
            java.lang.Object r9 = r0.f58176o
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f58175n
            com.withpersona.sdk2.inquiry.internal.network.e r10 = (com.withpersona.sdk2.inquiry.internal.network.e) r10
            jn0.t.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L6d
        L50:
            jn0.t.b(r11)
            boolean r10 = r10.getUsePlayIntegrity()
            if (r10 != 0) goto L5c
            com.withpersona.sdk2.inquiry.internal.network.j$b r9 = com.withpersona.sdk2.inquiry.internal.network.j.b.f58194a
            return r9
        L5c:
            gh0.a r10 = r8.playIntegrityHelper
            r0.f58175n = r8
            r0.f58176o = r9
            r0.f58179r = r5
            java.lang.Object r11 = r10.g(r0)
            if (r11 != r1) goto L6b
            goto L96
        L6b:
            r10 = r9
            r9 = r8
        L6d:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L74
            com.withpersona.sdk2.inquiry.internal.network.j$b r9 = com.withpersona.sdk2.inquiry.internal.network.j.b.f58194a
            return r9
        L74:
            com.withpersona.sdk2.inquiry.internal.network.e$l r2 = new com.withpersona.sdk2.inquiry.internal.network.e$l
            r2.<init>(r10, r11, r6)
            r0.f58175n = r9
            r0.f58176o = r6
            r0.f58179r = r4
            java.lang.Object r11 = r9.k(r2, r0)
            if (r11 != r1) goto L86
            goto L96
        L86:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r11 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) r11
            if (r11 != 0) goto L9a
            gh0.a r9 = r9.playIntegrityHelper
            r0.f58175n = r6
            r0.f58179r = r3
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            com.withpersona.sdk2.inquiry.internal.network.j$b r9 = com.withpersona.sdk2.inquiry.internal.network.j.b.f58194a
            return r9
        L9a:
            com.withpersona.sdk2.inquiry.internal.network.j$a r9 = new com.withpersona.sdk2.inquiry.internal.network.j$a
            r9.<init>(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.q(java.lang.String, hi0.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0114, code lost:
    
        if (r15 == r1) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(hh0.InquiryAttributes r14, p013kotlin.coroutines.Continuation<? super com.withpersona.sdk2.inquiry.internal.network.a> r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.h(hh0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, Continuation<? super com.withpersona.sdk2.inquiry.internal.network.b> continuation) {
        b bVar;
        e eVar;
        hi0.a aVarA;
        hi0.e eVarB;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f58135q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f58135q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objD = bVar.f58133o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f58135q;
        if (i12 == 0) {
            t.b(objD);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession != null) {
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success(currentSession.getAuthorization(), InquirySessionConfig.INSTANCE.a());
            }
            s sVar = this.service;
            CreateInquirySessionRequest createInquirySessionRequestA = CreateInquirySessionRequest.INSTANCE.a(str);
            String strB = this.deviceIdProvider.b();
            bVar.f58132n = this;
            bVar.f58135q = 1;
            objD = sVar.d(createInquirySessionRequestA, strB, bVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) bVar.f58132n;
            t.b(objD);
        }
        y yVar = (y) objD;
        if (!yVar.g()) {
            return new com.withpersona.sdk2.inquiry.internal.network.b.Error(NetworkUtilsKt.toErrorInfo(yVar));
        }
        String str2 = yVar.f().get("persona-device-id");
        if (str2 != null) {
            eVar.deviceIdProvider.a(str2);
        }
        Object objA = yVar.a();
        p013kotlin.jvm.internal.s.h(objA);
        CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) objA;
        String playIntegrityProjectId = createInquirySessionResponse.getData().getAttributes().getPlayIntegrityProjectId();
        if (playIntegrityProjectId != null) {
            eVar.playIntegrityHelper.h(playIntegrityProjectId);
        }
        String str3 = "Bearer " + createInquirySessionResponse.getMeta().getAccessToken();
        CreateInquirySessionResponse.GpsCollectionRequirement gpsCollectionRequirement = createInquirySessionResponse.getData().getAttributes().getGpsCollectionRequirement();
        if (gpsCollectionRequirement == null || (aVarA = bh0.b.a(gpsCollectionRequirement)) == null) {
            aVarA = hi0.a.NONE;
        }
        CreateInquirySessionResponse.GpsPrecisionRequirement gpsPrecisionRequirement = createInquirySessionResponse.getData().getAttributes().getGpsPrecisionRequirement();
        if (gpsPrecisionRequirement == null || (eVarB = bh0.b.b(gpsPrecisionRequirement)) == null) {
            eVarB = hi0.e.PRECISE;
        }
        return new com.withpersona.sdk2.inquiry.internal.network.b.Success(str3, new InquirySessionConfig(aVarA, eVarB, createInquirySessionResponse.getData().getAttributes().getPlayIntegrityProjectId() != null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, Continuation<? super com.withpersona.sdk2.inquiry.internal.network.d> continuation) {
        c cVar;
        e eVar;
        Map<String, ExchangeOneTimeLinkCodeResponse.Relationship> mapA;
        ExchangeOneTimeLinkCodeResponse.Relationship relationship;
        ExchangeOneTimeLinkCodeResponse.RelationshipData data;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f58140r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f58140r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objJ = cVar.f58138p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f58140r;
        if (i12 == 0) {
            t.b(objJ);
            s sVar = this.service;
            ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
            cVar.f58136n = this;
            cVar.f58137o = str;
            cVar.f58140r = 1;
            objJ = sVar.j(exchangeOneTimeLinkCodeRequest, cVar);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f58137o;
            eVar = (e) cVar.f58136n;
            t.b(objJ);
        }
        y yVar = (y) objJ;
        if (!yVar.g()) {
            return NetworkUtilsKt.toErrorInfo(yVar).getCode() == 404 ? new com.withpersona.sdk2.inquiry.internal.network.d.Error(new InternalErrorInfo.InvalidOneTimeLinkCode(str)) : new com.withpersona.sdk2.inquiry.internal.network.d.Error(NetworkUtilsKt.toErrorInfo(yVar));
        }
        String str2 = yVar.f().get("persona-device-id");
        if (str2 != null) {
            eVar.deviceIdProvider.a(str2);
        }
        Object objA = yVar.a();
        p013kotlin.jvm.internal.s.h(objA);
        ExchangeOneTimeLinkCodeResponse exchangeOneTimeLinkCodeResponse = (ExchangeOneTimeLinkCodeResponse) objA;
        ExchangeOneTimeLinkCodeResponse.Data data2 = exchangeOneTimeLinkCodeResponse.getData();
        String id2 = (data2 == null || (mapA = data2.a()) == null || (relationship = mapA.get("inquiry")) == null || (data = relationship.getData()) == null) ? null : data.getId();
        if (id2 == null) {
            return new com.withpersona.sdk2.inquiry.internal.network.d.Error(new InternalErrorInfo.UnknownErrorInfo("Error exchanging one-time-code."));
        }
        ExchangeOneTimeLinkCodeResponse.Metadata meta = exchangeOneTimeLinkCodeResponse.getMeta();
        return new com.withpersona.sdk2.inquiry.internal.network.d.Success(id2, "Bearer " + (meta != null ? meta.getAccessToken() : null));
    }

    public final Object n(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, Continuation<? super com.withpersona.sdk2.inquiry.internal.network.h> continuation) {
        return this.fallbackModeManager.b() ? l(str, str3, continuation) : m(str, str2, str3, inquirySessionConfig, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, InquirySessionConfig inquirySessionConfig, Continuation<? super com.withpersona.sdk2.inquiry.internal.network.i> continuation) {
        h hVar;
        e eVar;
        InquirySessionConfig inquirySessionConfig2;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f58163s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f58163s = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objQ = hVar.f58161q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f58163s;
        if (i12 == 0) {
            t.b(objQ);
            hVar.f58158n = this;
            hVar.f58159o = str;
            hVar.f58160p = inquirySessionConfig;
            hVar.f58163s = 1;
            objQ = q(str, inquirySessionConfig, hVar);
            if (objQ != coroutine_suspended) {
                eVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            inquirySessionConfig = (InquirySessionConfig) hVar.f58160p;
            str = (String) hVar.f58159o;
            eVar = (e) hVar.f58158n;
            t.b(objQ);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquirySessionConfig2 = (InquirySessionConfig) hVar.f58158n;
            t.b(objQ);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objQ;
        return (internalErrorInfo == null && inquirySessionConfig2.e()) ? new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo) : com.withpersona.sdk2.inquiry.internal.network.i.b.f58192a;
        com.withpersona.sdk2.inquiry.internal.network.j jVar = (com.withpersona.sdk2.inquiry.internal.network.j) objQ;
        if (jVar instanceof com.withpersona.sdk2.inquiry.internal.network.j.Error) {
            return new com.withpersona.sdk2.inquiry.internal.network.i.Error(((com.withpersona.sdk2.inquiry.internal.network.j.Error) jVar).getCause());
        }
        hVar.f58158n = inquirySessionConfig;
        hVar.f58159o = null;
        hVar.f58160p = null;
        hVar.f58163s = 2;
        objQ = eVar.p(str, inquirySessionConfig, hVar);
        if (objQ != coroutine_suspended) {
            inquirySessionConfig2 = inquirySessionConfig;
            InternalErrorInfo internalErrorInfo2 = (InternalErrorInfo) objQ;
            if (internalErrorInfo2 == null) {
            }
        }
        return coroutine_suspended;
    }
}
