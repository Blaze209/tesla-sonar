package androidx.p003lifecycle;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.e;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\f\u001a\u00020\t2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ3\u0010\r\u001a\u00020\t2\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/r;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Lkotlinx/coroutines/Job;", "c", "(Lwn0/p;)Lkotlinx/coroutines/Job;", "e", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/Lifecycle;", "b", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r implements CoroutineScope {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8890n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8892p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8892p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return r.this.new a(this.f8892p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f8890n;
            if (i11 == 0) {
                t.b(obj);
                Lifecycle lifecycleB = r.this.getLifecycle();
                p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f8892p;
                this.f8890n = 1;
                if (m0.a(lifecycleB, pVar, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8893n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8895p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8895p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return r.this.new b(this.f8895p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f8893n;
            if (i11 == 0) {
                t.b(obj);
                Lifecycle lifecycleB = r.this.getLifecycle();
                p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f8895p;
                this.f8893n = 1;
                if (m0.b(lifecycleB, pVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8896n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8898p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f8898p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return r.this.new c(this.f8898p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f8896n;
            if (i11 == 0) {
                t.b(obj);
                Lifecycle lifecycleB = r.this.getLifecycle();
                p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f8898p;
                this.f8896n = 1;
                if (m0.c(lifecycleB, pVar, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Lifecycle getLifecycle();

    @e
    public final Job c(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(block, null), 3, null);
    }

    @e
    public final Job d(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(block, null), 3, null);
    }

    @e
    public final Job e(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(block, null), 3, null);
    }
}
