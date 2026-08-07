package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import bh0.j2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import hi0.InquirySessionConfig;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$ \u001eBk\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\n2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/p;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/internal/p$c;", "", "sessionToken", "inquiryId", "Lbh0/j2;", "pollingMode", "Lhi0/g;", "inquirySessionConfig", "", "canReuseWorkflow", "Landroid/content/Context;", "applicationContext", "Lhh0/s;", "service", "Lhg0/a;", "deviceIdProvider", "Lrh0/c;", "sandboxFlags", "Lfh0/h;", "fallbackModeManager", "Lvi0/a;", "fontDownloader", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbh0/j2;Lhi0/g;ZLandroid/content/Context;Lhh0/s;Lhg0/a;Lrh0/c;Lfh0/h;Lvi0/a;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "a", "(Ly20/o;)Z", "b", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "c", "j", DateTokenConverter.CONVERTER_KEY, "Lbh0/j2;", "e", "Lhi0/g;", "f", "Z", "g", "Landroid/content/Context;", "h", "Lhh0/s;", IntegerTokenConverter.CONVERTER_KEY, "Lhg0/a;", "Lrh0/c;", "Lfh0/h;", "l", "Lvi0/a;", "m", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements y20.o<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j2 pollingMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean canReuseWorkflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hh0.s service;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final hg0.a deviceIdProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final rh0.c sandboxFlags;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final fh0.h fallbackModeManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final vi0.a fontDownloader;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/p$b;", "", "", "sessionToken", "inquiryId", "Lbh0/j2;", "pollingMode", "Lhi0/g;", "inquirySessionConfig", "", "canReuseWorkflow", "Lcom/withpersona/sdk2/inquiry/internal/p;", "a", "(Ljava/lang/String;Ljava/lang/String;Lbh0/j2;Lhi0/g;Z)Lcom/withpersona/sdk2/inquiry/internal/p;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        p a(String sessionToken, String inquiryId, j2 pollingMode, InquirySessionConfig inquirySessionConfig, boolean canReuseWorkflow);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/p$c;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/p$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/p$c$b;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.p$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/p$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/p$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && p013kotlin.jvm.internal.s.f(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.p$c$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/p$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/p$c;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/l;)V", "currentState", "", "canReuseWorkflow", "a", "(Lcom/withpersona/sdk2/inquiry/internal/l;Z)Lcom/withpersona/sdk2/inquiry/internal/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/internal/l;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final l nextState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(l nextState) {
                super(null);
                p013kotlin.jvm.internal.s.k(nextState, "nextState");
                this.nextState = nextState;
            }

            public final l a(l currentState, boolean canReuseWorkflow) {
                l lVar = this.nextState;
                if (canReuseWorkflow && (lVar instanceof l.UiStepRunning) && (currentState instanceof l.UiStepRunning)) {
                    l.UiStepRunning uiStepRunning = (l.UiStepRunning) lVar;
                    l.UiStepRunning uiStepRunning2 = (l.UiStepRunning) currentState;
                    if (p013kotlin.jvm.internal.s.f(uiStepRunning.w(), uiStepRunning2.w())) {
                        return l.UiStepRunning.h(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, uiStepRunning2.getClientSideKey(), null, null, null, false, 253951, null);
                    }
                }
                return lVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && p013kotlin.jvm.internal.s.f(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                return this.nextState.hashCode();
            }

            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/p$c;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.PollingWorker$run$1", f = "PollingWorker.kt", i = {1, 1, 1, 1, 5, 5, 5, 5}, l = {44, 54, 103, 113, 120, 124, 128}, m = "invokeSuspend", n = {"$this$flow", "pollingDelay", "pollingTimeoutMs", "startTime", "$this$flow", "pollingDelay", "pollingTimeoutMs", "startTime"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"})
    static final class d extends SuspendLambda implements wn0.p<FlowCollector<? super c>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58209n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f58210o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f58211p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f58212q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f58213r;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f58215a;

            static {
                int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
                try {
                    iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f58215a = iArr;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = p.this.new d(continuation);
            dVar.f58213r = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x014e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:112:0x0140 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x00df  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:39:0x0105  */
        /* JADX WARN: Code duplicated, block: B:41:0x0126  */
        /* JADX WARN: Code duplicated, block: B:44:0x0135  */
        /* JADX WARN: Code duplicated, block: B:47:0x0146  */
        /* JADX WARN: Code duplicated, block: B:53:0x0167 A[LOOP:1: B:51:0x0161->B:53:0x0167, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:54:0x018e  */
        /* JADX WARN: Code duplicated, block: B:57:0x01b3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:66:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:74:0x0212  */
        /* JADX WARN: Code duplicated, block: B:79:0x0249  */
        /* JADX WARN: Code duplicated, block: B:81:0x0251  */
        /* JADX WARN: Code duplicated, block: B:83:0x025b  */
        /* JADX WARN: Code duplicated, block: B:88:0x0274  */
        /* JADX WARN: Code duplicated, block: B:92:0x028c  */
        /* JADX WARN: Code duplicated, block: B:94:0x0296  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0285 -> B:8:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:100:0x0288
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 720
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.p.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super c> flowCollector, Continuation<? super h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public p(String sessionToken, String inquiryId, j2 pollingMode, InquirySessionConfig inquirySessionConfig, boolean z11, Context applicationContext, hh0.s service, hg0.a deviceIdProvider, rh0.c sandboxFlags, fh0.h fallbackModeManager, vi0.a fontDownloader) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(pollingMode, "pollingMode");
        p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(service, "service");
        p013kotlin.jvm.internal.s.k(deviceIdProvider, "deviceIdProvider");
        p013kotlin.jvm.internal.s.k(sandboxFlags, "sandboxFlags");
        p013kotlin.jvm.internal.s.k(fallbackModeManager, "fallbackModeManager");
        p013kotlin.jvm.internal.s.k(fontDownloader, "fontDownloader");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.pollingMode = pollingMode;
        this.inquirySessionConfig = inquirySessionConfig;
        this.canReuseWorkflow = z11;
        this.applicationContext = applicationContext;
        this.service = service;
        this.deviceIdProvider = deviceIdProvider;
        this.sandboxFlags = sandboxFlags;
        this.fallbackModeManager = fallbackModeManager;
        this.fontDownloader = fontDownloader;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof p)) {
            return false;
        }
        p pVar = (p) otherWorker;
        return p013kotlin.jvm.internal.s.f(this.sessionToken, pVar.sessionToken) && p013kotlin.jvm.internal.s.f(this.inquiryId, pVar.inquiryId) && this.pollingMode == pVar.pollingMode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // y20.o
    public Flow<c> run() {
        return FlowKt.flow(new d(null));
    }
}
