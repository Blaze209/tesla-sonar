package ah0;

import androidx.browser.auth.AuthTabIntent;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0015B-\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lah0/b;", "Ly20/o;", "Lah0/b$b;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/launchers/b;", "customTabsLauncher", "", ImagesContract.URL, "", "useAuthTab", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Z)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Z", "a", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements y20.o<InterfaceC0038b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> customTabsLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useAuthTab;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lah0/b$a;", "", "", ImagesContract.URL, "", "useAuthTab", "Lah0/b;", "a", "(Ljava/lang/String;Z)Lah0/b;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        b a(String url, boolean useAuthTab);
    }

    /* JADX INFO: renamed from: ah0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lah0/b$b;", "", "a", "Lah0/b$b$a;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InterfaceC0038b {

        /* JADX INFO: renamed from: ah0.b$b$a */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lah0/b$b$a;", "Lah0/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC0038b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1050a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 456691500;
            }

            public String toString() {
                return "Complete";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lah0/b$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1", f = "IntegrationBrowserWorker.kt", i = {0, 1}, l = {42, 60, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super InterfaceC0038b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1051n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f1052o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$1", f = "IntegrationBrowserWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1054n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f1055o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1055o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1055o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.withpersona.sdk2.inquiry.launchers.b cVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1054n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                ActivityResultLauncher activityResultLauncher = this.f1055o.customTabsLauncher;
                if (this.f1055o.useAuthTab) {
                    AuthTabIntent authTabIntentBuild = new AuthTabIntent.Builder().build();
                    s.j(authTabIntentBuild, "build(...)");
                    String str = this.f1055o.url;
                    f fVar = f.f1063a;
                    cVar = new com.withpersona.sdk2.inquiry.launchers.a(authTabIntentBuild, str, fVar.a(this.f1055o.url), fVar.b());
                } else {
                    androidx.browser.customtabs.d dVarB = new androidx.browser.customtabs.d.C0067d().b();
                    s.j(dVarB, "build(...)");
                    cVar = new com.withpersona.sdk2.inquiry.launchers.c(dVarB, this.f1055o.url);
                }
                activityResultLauncher.b(cVar);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f1052o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L21;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f1051n
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L2e
                if (r1 == r5) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                jn0.t.b(r9)
                goto L6d
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f1052o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r9)
                goto L60
            L26:
                java.lang.Object r1 = r8.f1052o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r9)
                goto L4c
            L2e:
                jn0.t.b(r9)
                java.lang.Object r9 = r8.f1052o
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                ah0.b$c$a r6 = new ah0.b$c$a
                ah0.b r7 = ah0.b.this
                r6.<init>(r7, r4)
                r8.f1052o = r9
                r8.f1051n = r5
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r6, r8)
                if (r1 != r0) goto L4b
                goto L6c
            L4b:
                r1 = r9
            L4c:
                com.withpersona.sdk2.inquiry.launchers.g r9 = new com.withpersona.sdk2.inquiry.launchers.g
                r9.<init>()
                kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.take(r9, r5)
                r8.f1052o = r1
                r8.f1051n = r3
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.toList$default(r9, r4, r8, r5, r4)
                if (r9 != r0) goto L60
                goto L6c
            L60:
                ah0.b$b$a r9 = ah0.b.InterfaceC0038b.a.f1050a
                r8.f1052o = r4
                r8.f1051n = r2
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L6d
            L6c:
                return r0
            L6d:
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ah0.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super InterfaceC0038b> flowCollector, Continuation<? super h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(ActivityResultLauncher<com.withpersona.sdk2.inquiry.launchers.b> customTabsLauncher, String url, boolean z11) {
        s.k(customTabsLauncher, "customTabsLauncher");
        s.k(url, "url");
        this.customTabsLauncher = customTabsLauncher;
        this.url = url;
        this.useAuthTab = z11;
    }

    @Override // y20.o
    public boolean a(y20.o<?> oVar) {
        return y20.o.b.a(this, oVar);
    }

    @Override // y20.o
    public Flow<InterfaceC0038b> run() {
        return FlowKt.flow(new c(null));
    }
}
