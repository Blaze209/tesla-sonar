package tb;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import lb.r1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsb/m0;", "spec", "Landroidx/work/y;", "worker", "Landroidx/work/n;", "foregroundUpdater", "Lub/b;", "taskExecutor", "Ljn0/h0;", "b", "(Landroid/content/Context;Lsb/m0;Landroidx/work/y;Landroidx/work/n;Lub/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f113071a;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", i = {}, l = {42, 50}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super Void>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113072n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.work.y f113073o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ sb.m0 f113074p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.work.n f113075q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f113076r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.y yVar, sb.m0 m0Var, androidx.work.n nVar, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f113073o = yVar;
            this.f113074p = m0Var;
            this.f113075q = nVar;
            this.f113076r = context;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f113073o, this.f113074p, this.f113075q, this.f113076r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f113072n;
            if (i11 == 0) {
                jn0.t.b(obj);
                com.google.common.util.concurrent.s<androidx.work.m> foregroundInfoAsync = this.f113073o.getForegroundInfoAsync();
                p013kotlin.jvm.internal.s.j(foregroundInfoAsync, "getForegroundInfoAsync(...)");
                androidx.work.y yVar = this.f113073o;
                this.f113072n = 1;
                obj = r1.d(foregroundInfoAsync, yVar, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            androidx.work.m mVar = (androidx.work.m) obj;
            if (mVar == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f113074p.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = j0.f113071a;
            sb.m0 m0Var = this.f113074p;
            androidx.work.z.e().a(str, "Updating notification for " + m0Var.workerClassName);
            com.google.common.util.concurrent.s<Void> sVarA = this.f113075q.a(this.f113076r, this.f113073o.getId(), mVar);
            p013kotlin.jvm.internal.s.j(sVarA, "setForegroundAsync(...)");
            this.f113072n = 2;
            Object objA = androidx.concurrent.futures.e.a(sVarA, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Void> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static {
        String strI = androidx.work.z.i("WorkForegroundRunnable");
        p013kotlin.jvm.internal.s.j(strI, "tagWithPrefix(...)");
        f113071a = strI;
    }

    public static final Object b(Context context, sb.m0 m0Var, androidx.work.y yVar, androidx.work.n nVar, ub.b bVar, Continuation<? super jn0.h0> continuation) {
        if (!m0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return jn0.h0.f84049a;
        }
        Executor executorC = bVar.c();
        p013kotlin.jvm.internal.s.j(executorC, "getMainThreadExecutor(...)");
        Object objWithContext = BuildersKt.withContext(ExecutorsKt.from(executorC), new a(yVar, m0Var, nVar, context, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }
}
