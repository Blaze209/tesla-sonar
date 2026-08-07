package com.withpersona.sdk2.inquiry.document.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
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
import wn0.p;
import y20.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u000fB1\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "sessionToken", "Lkg0/b;", "service", "documentKind", "", "fileLimit", "fieldKeyDocument", "<init>", "(Ljava/lang/String;Lkg0/b;Ljava/lang/String;ILjava/lang/String;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", "Lkg0/b;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "e", "I", "f", "()I", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kg0.b service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String documentKind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int fileLimit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fieldKeyDocument;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "", "Lkg0/b;", "service", "<init>", "(Lkg0/b;)V", "", "sessionToken", "documentKind", "fieldKeyDocument", "", "fileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lkg0/b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1162a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kg0.b service;

        public C1162a(kg0.b service) {
            s.k(service, "service");
            this.service = service;
        }

        public final a a(String sessionToken, String documentKind, String fieldKeyDocument, int fileLimit) {
            s.k(sessionToken, "sessionToken");
            s.k(documentKind, "documentKind");
            s.k(fieldKeyDocument, "fieldKeyDocument");
            return new a(sessionToken, this.service, documentKind, fileLimit, fieldKeyDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo.NetworkErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo.NetworkErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo.NetworkErrorInfo getCause() {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1164b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1164b(String documentId) {
                super(null);
                s.k(documentId, "documentId");
                this.documentId = documentId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker$run$1", f = "DocumentCreateWorker.kt", i = {0}, l = {23, 34, 36}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class c extends SuspendLambda implements p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57370n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f57371o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f57371o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
        
            if (r1.emit(r2, r11) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        
            if (r1.emit(r3, r11) == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f57370n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                jn0.t.b(r12)
                goto L9e
            L1f:
                java.lang.Object r1 = r11.f57371o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r12)
                goto L60
            L27:
                jn0.t.b(r12)
                java.lang.Object r12 = r11.f57371o
                r1 = r12
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.withpersona.sdk2.inquiry.document.network.a r12 = com.withpersona.sdk2.inquiry.document.network.a.this
                kg0.b r12 = com.withpersona.sdk2.inquiry.document.network.a.b(r12)
                com.withpersona.sdk2.inquiry.document.network.a r5 = com.withpersona.sdk2.inquiry.document.network.a.this
                java.lang.String r5 = com.withpersona.sdk2.inquiry.document.network.a.c(r5)
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest$a r6 = com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest.INSTANCE
                com.withpersona.sdk2.inquiry.document.network.a r7 = com.withpersona.sdk2.inquiry.document.network.a.this
                java.lang.String r7 = r7.getDocumentKind()
                com.withpersona.sdk2.inquiry.document.network.a r8 = com.withpersona.sdk2.inquiry.document.network.a.this
                int r8 = r8.getFileLimit()
                com.withpersona.sdk2.inquiry.document.network.a r9 = com.withpersona.sdk2.inquiry.document.network.a.this
                java.lang.String r9 = r9.getFieldKeyDocument()
                java.lang.String r10 = "document"
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest r6 = r6.a(r10, r7, r8, r9)
                r11.f57371o = r1
                r11.f57370n = r4
                java.lang.Object r12 = r12.c(r5, r6, r11)
                if (r12 != r0) goto L60
                goto L9d
            L60:
                retrofit2.y r12 = (retrofit2.y) r12
                boolean r4 = r12.g()
                r5 = 0
                if (r4 == 0) goto L8a
                com.withpersona.sdk2.inquiry.document.network.a$b$b r2 = new com.withpersona.sdk2.inquiry.document.network.a$b$b
                java.lang.Object r12 = r12.a()
                p013kotlin.jvm.internal.s.h(r12)
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse r12 = (com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse) r12
                com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse$Data r12 = r12.getData()
                java.lang.String r12 = r12.getId()
                r2.<init>(r12)
                r11.f57371o = r5
                r11.f57370n = r3
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto L9e
                goto L9d
            L8a:
                com.withpersona.sdk2.inquiry.document.network.a$b$a r3 = new com.withpersona.sdk2.inquiry.document.network.a$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r12 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r12)
                r3.<init>(r12)
                r11.f57371o = r5
                r11.f57370n = r2
                java.lang.Object r12 = r1.emit(r3, r11)
                if (r12 != r0) goto L9e
            L9d:
                return r0
            L9e:
                jn0.h0 r12 = jn0.h0.f84049a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ a(String str, kg0.b bVar, String str2, int i11, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, str2, i11, str3);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof a)) {
            return false;
        }
        a aVar = (a) otherWorker;
        return s.f(this.sessionToken, aVar.sessionToken) && s.f(this.fieldKeyDocument, aVar.fieldKeyDocument);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentKind() {
        return this.documentKind;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFieldKeyDocument() {
        return this.fieldKeyDocument;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getFileLimit() {
        return this.fileLimit;
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }

    private a(String str, kg0.b bVar, String str2, int i11, String str3) {
        this.sessionToken = str;
        this.service = bVar;
        this.documentKind = str2;
        this.fileLimit = i11;
        this.fieldKeyDocument = str3;
    }
}
