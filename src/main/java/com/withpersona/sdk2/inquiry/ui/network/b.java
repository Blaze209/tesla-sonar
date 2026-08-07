package com.withpersona.sdk2.inquiry.ui.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import oi0.n5;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;
import y20.o;

/* JADX INFO: loaded from: classes8.dex */
@p013kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0011B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "sessionToken", "Loi0/n5;", "triggeringComponent", "addressText", "Lcj0/b;", "uiService", "<init>", "(Ljava/lang/String;Loi0/n5;Ljava/lang/String;Lcj0/b;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "b", "Ljava/lang/String;", "c", "Loi0/n5;", DateTokenConverter.CONVERTER_KEY, "e", "Lcj0/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements o<AbstractC1201b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n5 triggeringComponent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String addressText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cj0.b uiService;

    @p013kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "", "Lcj0/b;", "uiService", "<init>", "(Lcj0/b;)V", "", "sessionToken", "Loi0/n5;", "triggeringComponent", "addressText", "Lcom/withpersona/sdk2/inquiry/ui/network/b;", "a", "(Ljava/lang/String;Loi0/n5;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/b;", "Lcj0/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final cj0.b uiService;

        public a(cj0.b uiService) {
            s.k(uiService, "uiService");
            this.uiService = uiService;
        }

        public final b a(String sessionToken, n5 triggeringComponent, String addressText) {
            s.k(sessionToken, "sessionToken");
            s.k(triggeringComponent, "triggeringComponent");
            s.k(addressText, "addressText");
            return new b(sessionToken, triggeringComponent, addressText, this.uiService, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b, reason: collision with other inner class name */
    @p013kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractC1201b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$a */
        @p013kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends AbstractC1201b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.b$b$b, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "results", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1202b extends AbstractC1201b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<Suggestion> results;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1202b(List<Suggestion> results) {
                super(null);
                s.k(results, "results");
                this.results = results;
            }

            public final List<Suggestion> a() {
                return this.results;
            }
        }

        public /* synthetic */ AbstractC1201b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1201b() {
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker$run$1", f = "UiAddressAutocompleteWorker.kt", i = {0}, l = {19, 28, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class c extends SuspendLambda implements p<FlowCollector<? super AbstractC1201b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58792n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f58793o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f58793o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            if (r1.emit(r2, r9) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
        
            if (r1.emit(r3, r9) == r0) goto L29;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f58792n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                jn0.t.b(r10)
                goto L9d
            L1f:
                java.lang.Object r1 = r9.f58793o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r10)
                goto L58
            L27:
                jn0.t.b(r10)
                java.lang.Object r10 = r9.f58793o
                r1 = r10
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.withpersona.sdk2.inquiry.ui.network.b r10 = com.withpersona.sdk2.inquiry.ui.network.b.this
                cj0.b r10 = com.withpersona.sdk2.inquiry.ui.network.b.e(r10)
                com.withpersona.sdk2.inquiry.ui.network.b r5 = com.withpersona.sdk2.inquiry.ui.network.b.this
                java.lang.String r5 = com.withpersona.sdk2.inquiry.ui.network.b.c(r5)
                com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest$a r6 = com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest.INSTANCE
                com.withpersona.sdk2.inquiry.ui.network.b r7 = com.withpersona.sdk2.inquiry.ui.network.b.this
                oi0.n5 r7 = com.withpersona.sdk2.inquiry.ui.network.b.d(r7)
                com.withpersona.sdk2.inquiry.ui.network.b r8 = com.withpersona.sdk2.inquiry.ui.network.b.this
                java.lang.String r8 = com.withpersona.sdk2.inquiry.ui.network.b.b(r8)
                com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest r6 = r6.a(r7, r8)
                r9.f58793o = r1
                r9.f58792n = r4
                java.lang.Object r10 = r10.c(r5, r6, r9)
                if (r10 != r0) goto L58
                goto L9c
            L58:
                retrofit2.y r10 = (retrofit2.y) r10
                boolean r4 = r10.g()
                r5 = 0
                if (r4 != 0) goto L75
                com.withpersona.sdk2.inquiry.ui.network.b$b$a r2 = new com.withpersona.sdk2.inquiry.ui.network.b$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r10 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r10)
                r2.<init>(r10)
                r9.f58793o = r5
                r9.f58792n = r3
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto L9d
                goto L9c
            L75:
                com.withpersona.sdk2.inquiry.ui.network.b$b$b r3 = new com.withpersona.sdk2.inquiry.ui.network.b$b$b
                java.lang.Object r10 = r10.a()
                com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse r10 = (com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse) r10
                if (r10 == 0) goto L8b
                com.withpersona.sdk2.inquiry.steps.ui.network.Meta r10 = r10.getMeta()
                if (r10 == 0) goto L8b
                java.util.List r10 = r10.a()
                if (r10 != 0) goto L8f
            L8b:
                java.util.List r10 = p013kotlin.collections.v.m()
            L8f:
                r3.<init>(r10)
                r9.f58793o = r5
                r9.f58792n = r2
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto L9d
            L9c:
                return r0
            L9d:
                jn0.h0 r10 = jn0.h0.f84049a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.network.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super AbstractC1201b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ b(String str, n5 n5Var, String str2, cj0.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, n5Var, str2, bVar);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof b) && s.f(this.addressText, ((b) otherWorker).addressText);
    }

    @Override // y20.o
    public Flow<AbstractC1201b> run() {
        return FlowKt.flow(new c(null));
    }

    private b(String str, n5 n5Var, String str2, cj0.b bVar) {
        this.sessionToken = str;
        this.triggeringComponent = n5Var;
        this.addressText = str2;
        this.uiService = bVar;
    }
}
