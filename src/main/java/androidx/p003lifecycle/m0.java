package androidx.p003lifecycle;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import jn0.e;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\t\u0010\b\u001a>\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\n\u0010\b\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Landroidx/lifecycle/Lifecycle;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "Landroidx/lifecycle/Lifecycle$State;", "minState", DateTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    static final class a<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8840n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f8841o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8842p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f8843q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super T>, Object> f8844r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Lifecycle lifecycle, Lifecycle.State state, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8842p = lifecycle;
            this.f8843q = state;
            this.f8844r = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f8842p, this.f8843q, this.f8844r, continuation);
            aVar.f8841o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            q qVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f8840n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.f8841o;
                try {
                    t.b(obj);
                    qVar.b();
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    qVar.b();
                    throw th;
                }
            }
            t.b(obj);
            Job job = (Job) ((CoroutineScope) this.f8841o).getCoroutineContext().get(Job.INSTANCE);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            l0 l0Var = new l0();
            q qVar2 = new q(this.f8842p, this.f8843q, l0Var.dispatchQueue, job);
            try {
                p<CoroutineScope, Continuation<? super T>, Object> pVar = this.f8844r;
                this.f8841o = qVar2;
                this.f8840n = 1;
                obj = BuildersKt.withContext(l0Var, pVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                qVar = qVar2;
                qVar.b();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                qVar = qVar2;
                qVar.b();
                throw th;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @e
    public static final <T> Object a(Lifecycle lifecycle, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return d(lifecycle, Lifecycle.State.CREATED, pVar, continuation);
    }

    @e
    public static final <T> Object b(Lifecycle lifecycle, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return d(lifecycle, Lifecycle.State.RESUMED, pVar, continuation);
    }

    @e
    public static final <T> Object c(Lifecycle lifecycle, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return d(lifecycle, Lifecycle.State.STARTED, pVar, continuation);
    }

    @e
    public static final <T> Object d(Lifecycle lifecycle, Lifecycle.State state, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new a(lifecycle, state, pVar, null), continuation);
    }
}
