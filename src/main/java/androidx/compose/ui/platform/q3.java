package androidx.compose.ui.platform;

import android.view.View;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/q3;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Lr2/m2;", "a", "(Landroid/view/View;)Lr2/m2;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/p3;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3 f5909a = new q3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<p3> factory = new AtomicReference<>(p3.INSTANCE.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5911c = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/q3$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Job f5912a;

        a(Job job) {
            this.f5912a = job;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            v11.removeOnAttachStateChangeListener(this);
            Job.DefaultImpls.cancel$default(this.f5912a, (CancellationException) null, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5913n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p020r2.m2 f5914o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f5915p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p020r2.m2 m2Var, View view, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5914o = m2Var;
            this.f5915p = view;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f5914o, this.f5915p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5913n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    p020r2.m2 m2Var = this.f5914o;
                    this.f5913n = 1;
                    if (m2Var.m0(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                if (r3.f(this.f5915p) == this.f5914o) {
                    r3.i(this.f5915p, null);
                }
                return jn0.h0.f84049a;
            } catch (Throwable th2) {
                if (r3.f(this.f5915p) == this.f5914o) {
                    r3.i(this.f5915p, null);
                }
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    private q3() {
    }

    public final p020r2.m2 a(View rootView) {
        p020r2.m2 m2VarA = factory.get().a(rootView);
        r3.i(rootView, m2VarA);
        rootView.addOnAttachStateChangeListener(new a(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, HandlerDispatcherKt.from(rootView.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new b(m2VarA, rootView, null), 2, null)));
        return m2VarA;
    }
}
