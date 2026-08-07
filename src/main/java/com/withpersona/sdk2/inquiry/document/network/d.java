package com.withpersona.sdk2.inquiry.document.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import retrofit2.y;
import wn0.l;
import wn0.p;
import y20.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u0015BO\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "", "sessionToken", "Lkg0/b;", "service", "inquiryId", "fromStep", "fromComponent", "Lmg0/a;", "fallbackModeManager", "Lai0/a;", "dataCollector", "", "Lig0/d;", "documents", "<init>", "(Ljava/lang/String;Lkg0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmg0/a;Lai0/a;Ljava/util/List;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", "Lkg0/b;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lmg0/a;", "h", "Lai0/a;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kg0.b service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String fromStep;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fromComponent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mg0.a fallbackModeManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ai0.a dataCollector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<ig0.d> documents;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$a;", "", "Lkg0/b;", "service", "Lmg0/a;", "fallbackModeManager", "Lai0/a;", "dataCollector", "<init>", "(Lkg0/b;Lmg0/a;Lai0/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "", "Lig0/d;", "documents", "Lcom/withpersona/sdk2/inquiry/document/network/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/d;", "Lkg0/b;", "b", "Lmg0/a;", "c", "Lai0/a;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kg0.b service;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mg0.a fallbackModeManager;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ai0.a dataCollector;

        public a(kg0.b service, mg0.a fallbackModeManager, ai0.a dataCollector) {
            s.k(service, "service");
            s.k(fallbackModeManager, "fallbackModeManager");
            s.k(dataCollector, "dataCollector");
            this.service = service;
            this.fallbackModeManager = fallbackModeManager;
            this.dataCollector = dataCollector;
        }

        public final d a(String sessionToken, String inquiryId, String fromStep, String fromComponent, List<? extends ig0.d> documents) {
            s.k(sessionToken, "sessionToken");
            s.k(inquiryId, "inquiryId");
            s.k(fromStep, "fromStep");
            s.k(fromComponent, "fromComponent");
            s.k(documents, "documents");
            return new d(sessionToken, this.service, inquiryId, fromStep, fromComponent, this.fallbackModeManager, this.dataCollector, documents, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/d$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
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
                return (other instanceof Error) && s.f(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1173b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1173b f57435a = new C1173b();

            private C1173b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1", f = "DocumentSubmitWorker.kt", i = {0, 1, 1, 2}, l = {37, 58, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$1", "L$0"})
    static final class c extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57436n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f57437o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f57438p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1$1", f = "DocumentSubmitWorker.kt", i = {}, l = {40, 48}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<? extends Object>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57440n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ d f57441o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57441o = dVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57441o, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
            
                if (r8 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
            
                if (r8 == r0) goto L19;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f57440n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jn0.t.b(r8)
                    goto L84
                L12:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1a:
                    jn0.t.b(r8)
                    goto L54
                L1e:
                    jn0.t.b(r8)
                    com.withpersona.sdk2.inquiry.document.network.d r8 = r7.f57441o
                    mg0.a r8 = com.withpersona.sdk2.inquiry.document.network.d.d(r8)
                    boolean r8 = r8.b()
                    if (r8 == 0) goto L57
                    com.withpersona.sdk2.inquiry.document.network.d r8 = r7.f57441o
                    mg0.a r8 = com.withpersona.sdk2.inquiry.document.network.d.d(r8)
                    com.withpersona.sdk2.inquiry.document.network.d r1 = r7.f57441o
                    java.lang.String r1 = com.withpersona.sdk2.inquiry.document.network.d.i(r1)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$a r2 = com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.INSTANCE
                    com.withpersona.sdk2.inquiry.document.network.d r4 = r7.f57441o
                    java.lang.String r4 = com.withpersona.sdk2.inquiry.document.network.d.f(r4)
                    com.withpersona.sdk2.inquiry.document.network.d r5 = r7.f57441o
                    java.lang.String r5 = com.withpersona.sdk2.inquiry.document.network.d.e(r5)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest r2 = r2.a(r4, r5)
                    r7.f57440n = r3
                    java.lang.Object r8 = r8.a(r1, r2, r7)
                    if (r8 != r0) goto L54
                    goto L83
                L54:
                    retrofit2.y r8 = (retrofit2.y) r8
                    return r8
                L57:
                    com.withpersona.sdk2.inquiry.document.network.d r8 = r7.f57441o
                    kg0.b r8 = com.withpersona.sdk2.inquiry.document.network.d.h(r8)
                    com.withpersona.sdk2.inquiry.document.network.d r1 = r7.f57441o
                    java.lang.String r1 = com.withpersona.sdk2.inquiry.document.network.d.i(r1)
                    com.withpersona.sdk2.inquiry.document.network.d r3 = r7.f57441o
                    java.lang.String r3 = com.withpersona.sdk2.inquiry.document.network.d.g(r3)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$a r4 = com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.INSTANCE
                    com.withpersona.sdk2.inquiry.document.network.d r5 = r7.f57441o
                    java.lang.String r5 = com.withpersona.sdk2.inquiry.document.network.d.f(r5)
                    com.withpersona.sdk2.inquiry.document.network.d r6 = r7.f57441o
                    java.lang.String r6 = com.withpersona.sdk2.inquiry.document.network.d.e(r6)
                    com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest r4 = r4.a(r5, r6)
                    r7.f57440n = r2
                    java.lang.Object r8 = r8.e(r1, r3, r4, r7)
                    if (r8 != r0) goto L84
                L83:
                    return r0
                L84:
                    retrofit2.y r8 = (retrofit2.y) r8
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.d.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<? extends Object>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.f57438p = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
        
            if (r1.emit(r5, r10) == r0) goto L27;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f57437o
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                java.lang.Object r0 = r10.f57438p
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                jn0.t.b(r11)
                goto La9
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                java.lang.Object r1 = r10.f57436n
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r1 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r1
                java.lang.Object r4 = r10.f57438p
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                jn0.t.b(r11)
                goto L8a
            L2f:
                java.lang.Object r1 = r10.f57438p
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r11)
                goto L6d
            L37:
                jn0.t.b(r11)
                java.lang.Object r11 = r10.f57438p
                kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
                com.withpersona.sdk2.inquiry.document.network.d r1 = com.withpersona.sdk2.inquiry.document.network.d.this
                ai0.a r1 = com.withpersona.sdk2.inquiry.document.network.d.b(r1)
                kg0.c r6 = new kg0.c
                com.withpersona.sdk2.inquiry.document.network.d r7 = com.withpersona.sdk2.inquiry.document.network.d.this
                java.lang.String r7 = com.withpersona.sdk2.inquiry.document.network.d.f(r7)
                com.withpersona.sdk2.inquiry.document.network.d r8 = com.withpersona.sdk2.inquiry.document.network.d.this
                java.util.List r8 = com.withpersona.sdk2.inquiry.document.network.d.c(r8)
                r6.<init>(r7, r8)
                r1.a(r6)
                com.withpersona.sdk2.inquiry.document.network.d$c$a r1 = new com.withpersona.sdk2.inquiry.document.network.d$c$a
                com.withpersona.sdk2.inquiry.document.network.d r6 = com.withpersona.sdk2.inquiry.document.network.d.this
                r1.<init>(r6, r2)
                r10.f57438p = r11
                r10.f57437o = r5
                java.lang.Object r1 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r1, r10)
                if (r1 != r0) goto L6a
                goto La8
            L6a:
                r9 = r1
                r1 = r11
                r11 = r9
            L6d:
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r11 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r11
                boolean r5 = r11 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r5 == 0) goto L8c
                r5 = r11
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r5 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r5
                r5.getResponse()
                com.withpersona.sdk2.inquiry.document.network.d$b$b r5 = com.withpersona.sdk2.inquiry.document.network.d.b.C1173b.f57435a
                r10.f57438p = r1
                r10.f57436n = r11
                r10.f57437o = r4
                java.lang.Object r4 = r1.emit(r5, r10)
                if (r4 != r0) goto L88
                goto La8
            L88:
                r4 = r1
                r1 = r11
            L8a:
                r11 = r1
                r1 = r4
            L8c:
                boolean r4 = r11 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r4 == 0) goto La9
                r4 = r11
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r4 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r4
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r4 = r4.getNetworkErrorInfo()
                com.withpersona.sdk2.inquiry.document.network.d$b$a r5 = new com.withpersona.sdk2.inquiry.document.network.d$b$a
                r5.<init>(r4)
                r10.f57438p = r11
                r10.f57436n = r2
                r10.f57437o = r3
                java.lang.Object r11 = r1.emit(r5, r10)
                if (r11 != r0) goto La9
            La8:
                return r0
            La9:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ d(String str, kg0.b bVar, String str2, String str3, String str4, mg0.a aVar, ai0.a aVar2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, str2, str3, str4, aVar, aVar2, list);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof d) && s.f(this.sessionToken, ((d) otherWorker).sessionToken);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(String str, kg0.b bVar, String str2, String str3, String str4, mg0.a aVar, ai0.a aVar2, List<? extends ig0.d> list) {
        this.sessionToken = str;
        this.service = bVar;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.fallbackModeManager = aVar;
        this.dataCollector = aVar2;
        this.documents = list;
    }
}
