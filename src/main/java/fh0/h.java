package fh0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import hh0.InquiryAttributes;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Lfh0/h;", "Lmg0/a;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "Lfh0/a;", "apiController", "Lbh0/f;", AnalyticsAttribute.Environment, "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lfh0/a;Lbh0/f;Lcom/squareup/moshi/u;)V", "Lhh0/d;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "c", "(Lhh0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionToken", "", "body", "Lretrofit2/y;", "a", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "e", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "b", "Lfh0/a;", "Lbh0/f;", DateTokenConverter.CONVERTER_KEY, "Lcom/squareup/moshi/u;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "value", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "currentSession", "", "()Z", "isFallbackModeActive", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements mg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FallbackMode fallbackMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fh0.a apiController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bh0.f environment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u moshi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", i = {0}, l = {49}, m = "createFallbackSession", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65977n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f65978o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f65980q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65978o = obj;
            this.f65980q |= Integer.MIN_VALUE;
            return h.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", i = {0, 0, 0}, l = {68, 89, 101}, m = "transition", n = {"this", "sessionToken", "body"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65982o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f65983p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65984q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65986s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65984q = obj;
            this.f65986s |= Integer.MIN_VALUE;
            return h.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager", f = "RealFallbackModeManager.kt", i = {0, 0, 0}, l = {125, 137}, m = "transitionBack", n = {"this", "sessionToken", "body"}, s = {"L$0", "L$1", "L$2"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65987n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65988o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f65989p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65990q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65992s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65990q = obj;
            this.f65992s |= Integer.MIN_VALUE;
            return h.this.f(null, null, this);
        }
    }

    public h(FallbackMode fallbackMode, fh0.a apiController, bh0.f environment, u moshi) {
        s.k(fallbackMode, "fallbackMode");
        s.k(apiController, "apiController");
        s.k(environment, "environment");
        s.k(moshi, "moshi");
        this.fallbackMode = fallbackMode;
        this.apiController = apiController;
        this.environment = environment;
        this.moshi = moshi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (c(r8, r2) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r1 == r3) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r23, java.lang.Object r24, p013kotlin.coroutines.Continuation<? super retrofit2.y<?>> r25) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fh0.h.a(java.lang.String, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mg0.a
    public boolean b() {
        return getFallbackMode() == FallbackMode.ALWAYS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(InquiryAttributes dVar, Continuation<? super InternalErrorInfo.NetworkErrorInfo> continuation) {
        a aVar;
        Object objC;
        h hVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f65980q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f65980q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f65978o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f65980q;
        if (i12 == 0) {
            t.b(obj);
            fh0.a aVar2 = this.apiController;
            aVar.f65977n = this;
            aVar.f65980q = 1;
            objC = aVar2.c(dVar, aVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            hVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) aVar.f65977n;
            t.b(obj);
            objC = ((jn0.s) obj).getValue();
        }
        if (jn0.s.h(objC)) {
            hVar.currentSession = (com.withpersona.sdk2.inquiry.internal.fallbackmode.i) objC;
        }
        if (jn0.s.e(objC) != null) {
            return new InternalErrorInfo.NetworkErrorInfo(0, "Failed to create fallback session.", false, null, 8, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.withpersona.sdk2.inquiry.internal.fallbackmode.i getCurrentSession() {
        return this.currentSession;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (c(r9, r3) == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r24, java.lang.Object r25, p013kotlin.coroutines.Continuation<? super retrofit2.y<?>> r26) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fh0.h.f(java.lang.String, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
