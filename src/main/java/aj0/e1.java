package aj0;

import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u001fBQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Laj0/e1;", "Ly20/o;", "Laj0/e1$b;", "Lcj0/b;", "uiService", "Lhg0/a;", "deviceIdProvider", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "customTabsLauncher", "", "sessionToken", "inquiryId", ImagesContract.URL, "componentName", "<init>", "(Lcj0/b;Lhg0/a;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Lcj0/b;", "c", "Lhg0/a;", DateTokenConverter.CONVERTER_KEY, "Landroidx/activity/result/ActivityResultLauncher;", "e", "Ljava/lang/String;", "f", "g", "h", "a", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 implements y20.o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cj0.b uiService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hg0.a deviceIdProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> customTabsLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String componentName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Laj0/e1$a;", "", "", "sessionToken", "inquiryId", ImagesContract.URL, "componentName", "Laj0/e1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Laj0/e1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        e1 a(String sessionToken, String inquiryId, String url, String componentName);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Laj0/e1$b;", "", "a", "b", "Laj0/e1$b$a;", "Laj0/e1$b$b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laj0/e1$b$a;", "Laj0/e1$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1255a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1705280535;
            }

            public String toString() {
                return "Complete";
            }
        }

        /* JADX INFO: renamed from: aj0.e1$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Laj0/e1$b$b;", "Laj0/e1$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Laj0/e1$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1", f = "CreateReusablePersonaWorker.kt", i = {0, 4, 5}, l = {36, 41, 46, 53, 63, 72, 74}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1257n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f1258o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1$1", f = "CreateReusablePersonaWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1260n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e1 f1261o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f1262p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e1 e1Var, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1261o = e1Var;
                this.f1262p = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1261o, this.f1262p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1260n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                ActivityResultLauncher activityResultLauncher = this.f1261o.customTabsLauncher;
                androidx.browser.customtabs.d dVarB = new androidx.browser.customtabs.d.C0067d().b();
                p013kotlin.jvm.internal.s.j(dVarB, "build(...)");
                activityResultLauncher.b(new com.withpersona.sdk2.inquiry.launchers.c(dVarB, o1.a(this.f1261o.url, this.f1262p, this.f1261o.componentName)));
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
            c cVar = e1.this.new c(continuation);
            cVar.f1258o = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0087  */
        /* JADX WARN: Code duplicated, block: B:32:0x009a  */
        /* JADX WARN: Code duplicated, block: B:34:0x009d  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:42:0x00cf A[PHI: r1
          0x00cf: PHI (r1v7 ??) = (r1v15 ??), (r1v16 ??) binds: [B:40:0x00cc, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x00e4 A[PHI: r1
          0x00e4: PHI (r1v10 ??) = (r1v13 ??), (r1v14 ??) binds: [B:43:0x00e1, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        
            if (r1.emit(r2, r7) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L52;
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
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: aj0.e1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public e1(cj0.b uiService, hg0.a deviceIdProvider, ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> customTabsLauncher, String sessionToken, String inquiryId, String url, String componentName) {
        p013kotlin.jvm.internal.s.k(uiService, "uiService");
        p013kotlin.jvm.internal.s.k(deviceIdProvider, "deviceIdProvider");
        p013kotlin.jvm.internal.s.k(customTabsLauncher, "customTabsLauncher");
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(url, "url");
        p013kotlin.jvm.internal.s.k(componentName, "componentName");
        this.uiService = uiService;
        this.deviceIdProvider = deviceIdProvider;
        this.customTabsLauncher = customTabsLauncher;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
    }

    @Override // y20.o
    public boolean a(y20.o<?> oVar) {
        return y20.o.b.a(this, oVar);
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }
}
