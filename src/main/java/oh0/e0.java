package oh0;

import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u000eB)\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Loh0/e0;", "Ly20/o;", "Loh0/e0$b;", "Landroidx/activity/result/ActivityResultLauncher;", "", "requestPermissionsLauncher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Loh0/d0;", "permission", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Loh0/d0;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "c", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Loh0/d0;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 implements y20.o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<String> requestPermissionsLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d0 permission;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loh0/e0$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/activity/result/ActivityResultLauncher;", "", "requestPermissionsLauncher", "<init>", "(Landroid/content/Context;Landroidx/activity/result/ActivityResultLauncher;)V", "Loh0/d0;", "permission", "Loh0/e0;", "a", "(Loh0/d0;)Loh0/e0;", "Landroid/content/Context;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultLauncher<String> requestPermissionsLauncher;

        public a(Context context, ActivityResultLauncher<String> requestPermissionsLauncher) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(requestPermissionsLauncher, "requestPermissionsLauncher");
            this.context = context;
            this.requestPermissionsLauncher = requestPermissionsLauncher;
        }

        public final e0 a(d0 permission) {
            p013kotlin.jvm.internal.s.k(permission, "permission");
            return new e0(this.requestPermissionsLauncher, this.context, permission);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Loh0/e0$b;", "", "<init>", "()V", "b", "a", "Loh0/e0$b$a;", "Loh0/e0$b$b;", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loh0/e0$b$a;", "Loh0/e0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f97383a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1697964102;
            }

            public String toString() {
                return "Denied";
            }
        }

        /* JADX INFO: renamed from: oh0.e0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loh0/e0$b$b;", "Loh0/e0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C2094b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2094b f97384a = new C2094b();

            private C2094b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2094b);
            }

            public int hashCode() {
                return 1972662456;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Loh0/e0$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker$run$1", f = "PermissionRequestWorker.kt", i = {}, l = {32, 36}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97385n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f97386o;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<b> f97388a;

            /* JADX WARN: Multi-variable type inference failed */
            a(FlowCollector<? super b> flowCollector) {
                this.f97388a = flowCollector;
            }

            public final Object a(boolean z11, Continuation<? super jn0.h0> continuation) {
                if (z11) {
                    Object objEmit = this.f97388a.emit(b.C2094b.f97384a, continuation);
                    return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : jn0.h0.f84049a;
                }
                Object objEmit2 = this.f97388a.emit(b.a.f97383a, continuation);
                return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : jn0.h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = e0.this.new c(continuation);
            cVar.f97386o = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (r1.collect(r3, r6) == r0) goto L23;
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
                int r1 = r6.f97385n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 == r2) goto L16
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L16:
                jn0.t.b(r7)
                goto L89
            L1a:
                jn0.t.b(r7)
                goto L60
            L1e:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f97386o
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                oh0.e0 r1 = oh0.e0.this
                androidx.activity.result.ActivityResultLauncher r1 = oh0.e0.d(r1)
                androidx.activity.result.contract.ActivityResultContract r1 = r1.a()
                oh0.e0 r4 = oh0.e0.this
                android.content.Context r4 = oh0.e0.b(r4)
                oh0.e0 r5 = oh0.e0.this
                oh0.d0 r5 = oh0.e0.c(r5)
                java.lang.String r5 = oh0.k1.b(r5)
                androidx.activity.result.contract.ActivityResultContract$a r1 = r1.getSynchronousResult(r4, r5)
                if (r1 == 0) goto L4a
                java.lang.Object r1 = r1.a()
                goto L4b
            L4a:
                r1 = 0
            L4b:
                java.lang.Boolean r4 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                boolean r1 = p013kotlin.jvm.internal.s.f(r1, r4)
                if (r1 == 0) goto L63
                oh0.e0$b$b r1 = oh0.e0.b.C2094b.f97384a
                r6.f97385n = r3
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L60
                goto L88
            L60:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            L63:
                oh0.e0 r1 = oh0.e0.this
                androidx.activity.result.ActivityResultLauncher r1 = oh0.e0.d(r1)
                oh0.e0 r3 = oh0.e0.this
                oh0.d0 r3 = oh0.e0.c(r3)
                java.lang.String r3 = oh0.k1.b(r3)
                r1.b(r3)
                com.withpersona.sdk2.inquiry.launchers.a0 r1 = new com.withpersona.sdk2.inquiry.launchers.a0
                r1.<init>()
                oh0.e0$c$a r3 = new oh0.e0$c$a
                r3.<init>(r7)
                r6.f97385n = r2
                java.lang.Object r7 = r1.collect(r3, r6)
                if (r7 != r0) goto L89
            L88:
                return r0
            L89:
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oh0.e0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public e0(ActivityResultLauncher<String> requestPermissionsLauncher, Context context, d0 permission) {
        p013kotlin.jvm.internal.s.k(requestPermissionsLauncher, "requestPermissionsLauncher");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(permission, "permission");
        this.requestPermissionsLauncher = requestPermissionsLauncher;
        this.context = context;
        this.permission = permission;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof e0) && ((e0) otherWorker).permission == this.permission;
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new c(null));
    }
}
