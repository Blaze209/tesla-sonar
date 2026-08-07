package com.withpersona.sdk2.inquiry.document.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import retrofit2.y;
import wn0.l;
import wn0.p;
import y20.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\fB!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "sessionToken", "Lkg0/b;", "service", "documentId", "<init>", "(Ljava/lang/String;Lkg0/b;Ljava/lang/String;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", "Lkg0/b;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kg0.b service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String documentId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "", "Lkg0/b;", "service", "<init>", "(Lkg0/b;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/network/c;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lkg0/b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kg0.b service;

        public a(kg0.b service) {
            s.k(service, "service");
            this.service = service;
        }

        public final c a(String sessionToken, String documentId) {
            s.k(sessionToken, "sessionToken");
            s.k(documentId, "documentId");
            return new c(sessionToken, this.service, documentId, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "Lig0/d;", "documents", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1171b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<ig0.d> documents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1171b(List<? extends ig0.d> documents) {
                super(null);
                s.k(documents, "documents");
                this.documents = documents;
            }

            public final List<ig0.d> a() {
                return this.documents;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1", f = "DocumentLoadWorker.kt", i = {0, 1, 1, 2, 2, 3}, l = {25, 42, 44, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class C1172c extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57417n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f57418o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f57419p;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1", f = "DocumentLoadWorker.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<CreateDocumentResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57421n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ c f57422o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57422o = cVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57422o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57421n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                kg0.b bVar = this.f57422o.service;
                String str = this.f57422o.sessionToken;
                String documentId = this.f57422o.getDocumentId();
                this.f57421n = 1;
                Object objA = bVar.a(str, documentId, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<CreateDocumentResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        C1172c(Continuation<? super C1172c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C1172c c1172c = c.this.new C1172c(continuation);
            c1172c.f57419p = obj;
            return c1172c;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        
            if (r1.emit(r3, r14) == r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        
            r3 = r1;
            r1 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
        
            if (r1.emit(r4, r14) == r0) goto L48;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.C1172c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((C1172c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ c(String str, kg0.b bVar, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, str2);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof c)) {
            return false;
        }
        c cVar = (c) otherWorker;
        return s.f(this.sessionToken, cVar.sessionToken) && s.f(this.documentId, cVar.documentId);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new C1172c(null));
    }

    private c(String str, kg0.b bVar, String str2) {
        this.sessionToken = str;
        this.service = bVar;
        this.documentId = str2;
    }
}
