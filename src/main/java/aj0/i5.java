package aj0;

import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u0016Bg\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\n\u0012\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Laj0/i5;", "Ly20/o;", "Laj0/i5$b;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "customTabsLauncher", "Lcj0/b;", "uiService", "Lcom/squareup/moshi/u;", "moshi", "", "sessionToken", "inquiryId", ImagesContract.URL, "componentName", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Lcj0/b;Lcom/squareup/moshi/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "c", "Lcj0/b;", DateTokenConverter.CONVERTER_KEY, "Lcom/squareup/moshi/u;", "e", "Ljava/lang/String;", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i5 implements y20.o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> customTabsLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cj0.b uiService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.u moshi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String componentName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ComponentParam> componentParams;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Laj0/i5$a;", "", "", "sessionToken", "inquiryId", ImagesContract.URL, "componentName", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "Laj0/i5;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Laj0/i5;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        i5 a(String sessionToken, String inquiryId, String url, String componentName, Map<String, ? extends ComponentParam> componentParams);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Laj0/i5$b;", "", "a", "b", "Laj0/i5$b$a;", "Laj0/i5$b$b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laj0/i5$b$a;", "Laj0/i5$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1416a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1215598964;
            }

            public String toString() {
                return "Complete";
            }
        }

        /* JADX INFO: renamed from: aj0.i5$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laj0/i5$b$b;", "Laj0/i5$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo errorInfo;

            public Error(InternalErrorInfo errorInfo) {
                p013kotlin.jvm.internal.s.k(errorInfo, "errorInfo");
                this.errorInfo = errorInfo;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getErrorInfo() {
                return this.errorInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && p013kotlin.jvm.internal.s.f(this.errorInfo, ((Error) other).errorInfo);
            }

            public int hashCode() {
                return this.errorInfo.hashCode();
            }

            public String toString() {
                return "Error(errorInfo=" + this.errorInfo + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Laj0/i5$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1", f = "VerifyReusablePersonaWorker.kt", i = {0, 4, 5}, l = {44, 50, 55, 62, 72, 81, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1418n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f1419o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1$1", f = "VerifyReusablePersonaWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1421n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ i5 f1422o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f1423p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i5 i5Var, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1422o = i5Var;
                this.f1423p = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1422o, this.f1423p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1421n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                ActivityResultLauncher activityResultLauncher = this.f1422o.customTabsLauncher;
                androidx.browser.customtabs.d dVarB = new androidx.browser.customtabs.d.C0067d().b();
                p013kotlin.jvm.internal.s.j(dVarB, "build(...)");
                activityResultLauncher.b(new com.withpersona.sdk2.inquiry.launchers.c(dVarB, o1.a(this.f1422o.url, this.f1423p, this.f1422o.componentName)));
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = i5.this.new c(continuation);
            cVar.f1419o = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:42:0x00db A[PHI: r1
          0x00db: PHI (r1v7 ??) = (r1v15 ??), (r1v16 ??) binds: [B:40:0x00d8, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x00f0 A[PHI: r1
          0x00f0: PHI (r1v10 ??) = (r1v13 ??), (r1v14 ??) binds: [B:43:0x00ed, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if (r1.emit(r2, r8) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L52;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: aj0.i5.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i5(ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> customTabsLauncher, cj0.b uiService, com.squareup.moshi.u moshi, String sessionToken, String inquiryId, String url, String componentName, Map<String, ? extends ComponentParam> componentParams) {
        p013kotlin.jvm.internal.s.k(customTabsLauncher, "customTabsLauncher");
        p013kotlin.jvm.internal.s.k(uiService, "uiService");
        p013kotlin.jvm.internal.s.k(moshi, "moshi");
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(componentName, "componentName");
        p013kotlin.jvm.internal.s.k(componentParams, "componentParams");
        this.customTabsLauncher = customTabsLauncher;
        this.uiService = uiService;
        this.moshi = moshi;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
        this.componentParams = componentParams;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        return y20.o.b.a(this, otherWorker) && p013kotlin.jvm.internal.s.f(((i5) otherWorker).url, this.url);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }
}
