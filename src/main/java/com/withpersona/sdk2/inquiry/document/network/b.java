package com.withpersona.sdk2.inquiry.document.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import retrofit2.y;
import wn0.l;
import wn0.p;
import y20.o;
import yh0.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0010B1\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "sessionToken", "Lkg0/b;", "service", "documentId", "Lig0/d$a;", "localDocument", "Lyh0/i;", "fileHelper", "<init>", "(Ljava/lang/String;Lkg0/b;Ljava/lang/String;Lig0/d$a;Lyh0/i;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", "Lkg0/b;", DateTokenConverter.CONVERTER_KEY, "e", "Lig0/d$a;", "f", "Lyh0/i;", "Lkotlinx/coroutines/CoroutineScope;", "g", "Lkotlinx/coroutines/CoroutineScope;", "serviceCoroutineScope", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements o<AbstractC1165b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kg0.b service;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String documentId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ig0.d.Local localDocument;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i fileHelper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope serviceCoroutineScope;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$a;", "", "Lkg0/b;", "service", "Lyh0/i;", "fileHelper", "<init>", "(Lkg0/b;Lyh0/i;)V", "", "sessionToken", "documentId", "Lig0/d$a;", "localDocument", "Lcom/withpersona/sdk2/inquiry/document/network/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Lig0/d$a;)Lcom/withpersona/sdk2/inquiry/document/network/b;", "Lkg0/b;", "b", "Lyh0/i;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kg0.b service;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final i fileHelper;

        public a(kg0.b service, i fileHelper) {
            s.k(service, "service");
            s.k(fileHelper, "fileHelper");
            this.service = service;
            this.fileHelper = fileHelper;
        }

        public final b a(String sessionToken, String documentId, ig0.d.Local localDocument) {
            s.k(sessionToken, "sessionToken");
            s.k(documentId, "documentId");
            s.k(localDocument, "localDocument");
            return new b(sessionToken, this.service, documentId, localDocument, this.fileHelper, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$d;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractC1165b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends AbstractC1165b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GenericFileUploadErrorResponse.DocumentErrorResponse cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1166b extends AbstractC1165b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1166b(InternalErrorInfo cause) {
                super(null);
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$b$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "progressPercentage", "<init>", "(I)V", "a", "I", "()I", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends AbstractC1165b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int progressPercentage;

            public c(int i11) {
                super(null);
                this.progressPercentage = i11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$b$d */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$d;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Lig0/d$a;", "oldLocalDocument", "Lig0/d$b;", "newRemoteDocument", "<init>", "(Lig0/d$a;Lig0/d$b;)V", "a", "Lig0/d$a;", "b", "()Lig0/d$a;", "Lig0/d$b;", "()Lig0/d$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends AbstractC1165b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ig0.d.Local oldLocalDocument;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final ig0.d.Remote newRemoteDocument;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(ig0.d.Local oldLocalDocument, ig0.d.Remote newRemoteDocument) {
                super(null);
                s.k(oldLocalDocument, "oldLocalDocument");
                s.k(newRemoteDocument, "newRemoteDocument");
                this.oldLocalDocument = oldLocalDocument;
                this.newRemoteDocument = newRemoteDocument;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ig0.d.Remote getNewRemoteDocument() {
                return this.newRemoteDocument;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ig0.d.Local getOldLocalDocument() {
                return this.oldLocalDocument;
            }
        }

        public /* synthetic */ AbstractC1165b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1165b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", f = "DocumentFileUploadWorker.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<FlowCollector<? super AbstractC1165b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57386n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f57387o;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<AbstractC1165b> f57389a;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", f = "DocumentFileUploadWorker.kt", i = {0}, l = {152}, m = "emit", n = {"it"}, s = {"L$0"})
            static final class C1167a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f57390n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f57391o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ a<T> f57392p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f57393q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1167a(a<? super T> aVar, Continuation<? super C1167a> continuation) {
                    super(continuation);
                    this.f57392p = aVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f57391o = obj;
                    this.f57393q |= Integer.MIN_VALUE;
                    return this.f57392p.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(FlowCollector<? super AbstractC1165b> flowCollector) {
                this.f57389a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC1165b abstractC1165b, Continuation<? super h0> continuation) {
                C1167a c1167a;
                if (continuation instanceof C1167a) {
                    c1167a = (C1167a) continuation;
                    int i11 = c1167a.f57393q;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1167a.f57393q = i11 - Integer.MIN_VALUE;
                    } else {
                        c1167a = new C1167a(this, continuation);
                    }
                } else {
                    c1167a = new C1167a(this, continuation);
                }
                Object obj = c1167a.f57391o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c1167a.f57393q;
                if (i12 == 0) {
                    t.b(obj);
                    FlowCollector<AbstractC1165b> flowCollector = this.f57389a;
                    c1167a.f57390n = abstractC1165b;
                    c1167a.f57393q = 1;
                    if (flowCollector.emit(abstractC1165b, c1167a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1165b = (AbstractC1165b) c1167a.f57390n;
                    t.b(obj);
                }
                if ((abstractC1165b instanceof AbstractC1165b.a) || (abstractC1165b instanceof AbstractC1165b.C1166b)) {
                    JobKt__JobKt.cancel$default(c1167a.getContext(), (CancellationException) null, 1, (Object) null);
                }
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$c;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1", f = "DocumentFileUploadWorker.kt", i = {0}, l = {143, 147}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        static final class C1168b extends SuspendLambda implements p<FlowCollector<? super AbstractC1165b.c>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57394n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f57395o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ kg0.d f57396p;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$c$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1$1", f = "DocumentFileUploadWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends SuspendLambda implements p<Integer, Continuation<? super Boolean>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f57397n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ int f57398o;

                a(Continuation<? super a> continuation) {
                    super(2, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(continuation);
                    aVar.f57398o = ((Number) obj).intValue();
                    return aVar;
                }

                public final Object invoke(int i11, Continuation<? super Boolean> continuation) {
                    return ((a) create(Integer.valueOf(i11), continuation)).invokeSuspend(h0.f84049a);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f57397n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return Boxing.boxBoolean(this.f57398o < 100);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                    return invoke(num.intValue(), continuation);
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$c$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C1169b<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector<AbstractC1165b.c> f57399a;

                /* JADX WARN: Multi-variable type inference failed */
                C1169b(FlowCollector<? super AbstractC1165b.c> flowCollector) {
                    this.f57399a = flowCollector;
                }

                public final Object a(int i11, Continuation<? super h0> continuation) {
                    Object objEmit = this.f57399a.emit(new AbstractC1165b.c(i11), continuation);
                    return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((Number) obj).intValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1168b(kg0.d dVar, Continuation<? super C1168b> continuation) {
                super(2, continuation);
                this.f57396p = dVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C1168b c1168b = new C1168b(this.f57396p, continuation);
                c1168b.f57395o = obj;
                return c1168b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (r1.emit(r7, r6) == r0) goto L15;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.f57394n
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r3) goto L13
                    jn0.t.b(r7)
                    goto L5c
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    java.lang.Object r1 = r6.f57395o
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    jn0.t.b(r7)
                    goto L4a
                L23:
                    jn0.t.b(r7)
                    java.lang.Object r7 = r6.f57395o
                    r1 = r7
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    kg0.d r7 = r6.f57396p
                    kotlinx.coroutines.flow.StateFlow r7 = r7.a()
                    com.withpersona.sdk2.inquiry.document.network.b$c$b$a r5 = new com.withpersona.sdk2.inquiry.document.network.b$c$b$a
                    r5.<init>(r2)
                    kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.takeWhile(r7, r5)
                    com.withpersona.sdk2.inquiry.document.network.b$c$b$b r5 = new com.withpersona.sdk2.inquiry.document.network.b$c$b$b
                    r5.<init>(r1)
                    r6.f57395o = r1
                    r6.f57394n = r4
                    java.lang.Object r7 = r7.collect(r5, r6)
                    if (r7 != r0) goto L4a
                    goto L5b
                L4a:
                    com.withpersona.sdk2.inquiry.document.network.b$b$c r7 = new com.withpersona.sdk2.inquiry.document.network.b$b$c
                    r4 = 100
                    r7.<init>(r4)
                    r6.f57395o = r2
                    r6.f57394n = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L5c
                L5b:
                    return r0
                L5c:
                    jn0.h0 r7 = jn0.h0.f84049a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.b.c.C1168b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(FlowCollector<? super AbstractC1165b.c> flowCollector, Continuation<? super h0> continuation) {
                return ((C1168b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", f = "DocumentFileUploadWorker.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        static final class C1170c extends SuspendLambda implements p<CoroutineScope, Continuation<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57400n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f57401o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ kg0.d f57402p;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b$c$c$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", f = "DocumentFileUploadWorker.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends SuspendLambda implements l<Continuation<? super y<DocumentFileUploadResponse>>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f57403n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ b f57404o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ kg0.d f57405p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(b bVar, kg0.d dVar, Continuation<? super a> continuation) {
                    super(1, continuation);
                    this.f57404o = bVar;
                    this.f57405p = dVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Continuation<?> continuation) {
                    return new a(this.f57404o, this.f57405p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f57403n;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                        return obj;
                    }
                    t.b(obj);
                    kg0.b bVar = this.f57404o.service;
                    String str = this.f57404o.sessionToken;
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    MultipartBody.Part partCreateFormData = companion.createFormData("data[type]", "document-file");
                    MultipartBody.Part partCreateFormData2 = companion.createFormData("data[attributes][document-id]", this.f57404o.documentId);
                    MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][capture-method]", this.f57404o.localDocument.getCaptureMethod().getType());
                    MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][originals][]", this.f57404o.localDocument.getAbsoluteFilePath(), this.f57405p);
                    String name = new File(this.f57404o.localDocument.getAbsoluteFilePath()).getName();
                    s.j(name, "getName(...)");
                    List<MultipartBody.Part> listP = v.p(partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, companion.createFormData("data[attributes][name]", name));
                    this.f57403n = 1;
                    Object objD = bVar.d(str, listP, this);
                    return objD == coroutine_suspended ? coroutine_suspended : objD;
                }

                @Override // wn0.l
                public final Object invoke(Continuation<? super y<DocumentFileUploadResponse>> continuation) {
                    return ((a) create(continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1170c(b bVar, kg0.d dVar, Continuation<? super C1170c> continuation) {
                super(2, continuation);
                this.f57401o = bVar;
                this.f57402p = dVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C1170c(this.f57401o, this.f57402p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57400n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                a aVar = new a(this.f57401o, this.f57402p, null);
                this.f57400n = 1;
                Object objEnqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                return objEnqueueVerificationRequestWithRetry == coroutine_suspended ? coroutine_suspended : objEnqueueVerificationRequestWithRetry;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkCallResult<DocumentFileUploadResponse>> continuation) {
                return ((C1170c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", f = "DocumentFileUploadWorker.kt", i = {0, 1, 1, 2, 2, 3, 4, 5, 6}, l = {80, 84, 96, 121, 123, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 136}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv", "$this$onFailure$iv", "$this$onFailure$iv", "$this$onFailure$iv"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0"})
        static final class d extends SuspendLambda implements p<FlowCollector<? super AbstractC1165b>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f57406n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f57407o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private /* synthetic */ Object f57408p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Deferred<NetworkCallResult<DocumentFileUploadResponse>> f57409q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f57410r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(Deferred<? extends NetworkCallResult<DocumentFileUploadResponse>> deferred, b bVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f57409q = deferred;
                this.f57410r = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                d dVar = new d(this.f57409q, this.f57410r, continuation);
                dVar.f57408p = obj;
                return dVar;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0052  */
            /* JADX WARN: Code duplicated, block: B:24:0x0076  */
            /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:37:0x00df  */
            /* JADX WARN: Code duplicated, block: B:53:0x0160  */
            /* JADX WARN: Code duplicated, block: B:56:0x017d  */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x013a, code lost:
            
                if (r3.emit(r4, r10) == r0) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
            
                if (r3.emit(r11, r10) == r0) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
            
                if (r3.emit(r11, r10) == r0) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x018d, code lost:
            
                if (r3.emit(r4, r10) == r0) goto L58;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.b.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(FlowCollector<? super AbstractC1165b> flowCollector, Continuation<? super h0> continuation) {
                return ((d) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f57387o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57386n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f57387o;
                kg0.d dVar = new kg0.d(new File(b.this.localDocument.getAbsoluteFilePath()), MediaType.INSTANCE.parse(b.this.fileHelper.a(b.this.localDocument.getAbsoluteFilePath())));
                Flow flowMerge = FlowKt.merge(FlowKt.flow(new d(BuildersKt__Builders_commonKt.async$default(b.this.serviceCoroutineScope, Dispatchers.getIO(), null, new C1170c(b.this, dVar, null), 2, null), b.this, null)), FlowKt.flow(new C1168b(dVar, null)));
                a aVar = new a(flowCollector);
                this.f57386n = 1;
                if (flowMerge.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super AbstractC1165b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ b(String str, kg0.b bVar, String str2, ig0.d.Local local, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, str2, local, iVar);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        if (!(otherWorker instanceof b)) {
            return false;
        }
        b bVar = (b) otherWorker;
        return s.f(this.sessionToken, bVar.sessionToken) && s.f(this.localDocument, bVar.localDocument);
    }

    @Override // y20.o
    public Flow<AbstractC1165b> run() {
        return FlowKt.flow(new c(null));
    }

    private b(String str, kg0.b bVar, String str2, ig0.d.Local local, i iVar) {
        this.sessionToken = str;
        this.service = bVar;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = iVar;
        this.serviceCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
    }
}
