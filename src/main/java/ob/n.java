package ob;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.z;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import sb.m0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010*$\b\u0002\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¨\u0006\u0016"}, d2 = {"Lob/m;", "Lsb/m0;", "spec", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lob/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/Job;", "c", "(Lob/m;Lsb/m0;Lkotlinx/coroutines/CoroutineDispatcher;Lob/i;)Lkotlinx/coroutines/Job;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lob/g;", "a", "(Landroid/content/Context;)Lob/g;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Lob/b;", "Ljn0/h0;", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97080a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f97081n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ m f97082o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m0 f97083p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ i f97084q;

        /* JADX INFO: renamed from: ob.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C2077a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f97085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f97086b;

            C2077a(i iVar, m0 m0Var) {
                this.f97085a = iVar;
                this.f97086b = m0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, Continuation<? super h0> continuation) {
                this.f97085a.a(this.f97086b, bVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, m0 m0Var, i iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f97082o = mVar;
            this.f97083p = m0Var;
            this.f97084q = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f97082o, this.f97083p, this.f97084q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f97081n;
            if (i11 == 0) {
                t.b(obj);
                Flow<b> flowD = this.f97082o.d(this.f97083p);
                C2077a c2077a = new C2077a(this.f97084q, this.f97083p);
                this.f97081n = 1;
                if (flowD.collect(c2077a, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        String strI = z.i("WorkConstraintsTracker");
        s.j(strI, "tagWithPrefix(...)");
        f97080a = strI;
    }

    public static final g a(Context context) {
        s.k(context, "context");
        Object systemService = context.getSystemService("connectivity");
        s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new g((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final Job c(m mVar, m0 spec, CoroutineDispatcher dispatcher, i listener) {
        s.k(mVar, "<this>");
        s.k(spec, "spec");
        s.k(dispatcher, "dispatcher");
        s.k(listener, "listener");
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new a(mVar, spec, listener, null), 3, null);
    }
}
