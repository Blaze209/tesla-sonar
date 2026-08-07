package lb;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "appContext", "Landroidx/work/c;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "Ljn0/h0;", "c", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Landroidx/work/c;Landroidx/work/impl/WorkDatabase;)V", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f89753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f89754b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "throwable", "", "attempt", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.r<FlowCollector<? super Boolean>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89755n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f89756o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ long f89757p;

        a(Continuation<? super a> continuation) {
            super(4, continuation);
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, Long l11, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th2, l11.longValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f89755n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Throwable th2 = (Throwable) this.f89756o;
                long j11 = this.f89757p;
                androidx.work.z.e().d(c0.f89753a, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j11 * ((long) 30000), c0.f89754b);
                this.f89755n = 1;
                if (DelayKt.delay(jMin, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return Boxing.boxBoolean(true);
        }

        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, long j11, Continuation<? super Boolean> continuation) {
            a aVar = new a(continuation);
            aVar.f89756o = th2;
            aVar.f89757p = j11;
            return aVar.invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasUnfinishedWork", "Ljn0/h0;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<Boolean, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ boolean f89759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f89760p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f89760p = context;
        }

        public final Object a(boolean z11, Continuation<? super jn0.h0> continuation) {
            return ((b) create(Boolean.valueOf(z11), continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f89760p, continuation);
            bVar.f89759o = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super jn0.h0> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f89758n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            tb.w.c(this.f89760p, RescheduleReceiver.class, this.f89759o);
            return jn0.h0.f84049a;
        }
    }

    static {
        String strI = androidx.work.z.i("UnfinishedWorkListener");
        p013kotlin.jvm.internal.s.j(strI, "tagWithPrefix(...)");
        f89753a = strI;
        f89754b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(CoroutineScope coroutineScope, Context appContext, androidx.work.c configuration, WorkDatabase db2) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "<this>");
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(db2, "db");
        if (tb.y.b(appContext, configuration)) {
            FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.retryWhen(db2.j().y(), new a(null)))), new b(appContext, null)), coroutineScope);
        }
    }
}
