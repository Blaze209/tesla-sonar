package androidx.compose.ui.platform;

import android.view.View;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/s3;", "Lr2/p;", "Landroidx/lifecycle/u;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lr2/p;)V", "Lkotlin/Function0;", "Ljn0/h0;", "content", DateTokenConverter.CONVERTER_KEY, "(Lwn0/p;)V", "dispose", "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "y", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lr2/p;", "x", "()Lr2/p;", "", "c", "Z", "disposed", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "e", "Lwn0/p;", "lastContent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class s3 implements p020r2.p, androidx.p003lifecycle.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p original;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Lifecycle addedToLifecycle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super p020r2.l, ? super Integer, jn0.h0> lastContent = y0.f6083a.a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<AndroidComposeView.b, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, jn0.h0> f5957d;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.s3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C0127a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ s3 f5958c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.p<p020r2.l, Integer, jn0.h0> f5959d;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.s3$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
            static final class C0128a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f5960n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ s3 f5961o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0128a(s3 s3Var, Continuation<? super C0128a> continuation) {
                    super(2, continuation);
                    this.f5961o = s3Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new C0128a(this.f5961o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f5960n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        AndroidComposeView owner = this.f5961o.getOwner();
                        this.f5960n = 1;
                        if (owner.a0(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    return jn0.h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((C0128a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.s3$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f5962n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ s3 f5963o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(s3 s3Var, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f5963o = s3Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f5963o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f5962n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        AndroidComposeView owner = this.f5963o.getOwner();
                        this.f5962n = 1;
                        if (owner.b0(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    return jn0.h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.s3$a$a$c */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
            static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ s3 f5964c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ wn0.p<p020r2.l, Integer, jn0.h0> f5965d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(s3 s3Var, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar) {
                    super(2);
                    this.f5964c = s3Var;
                    this.f5965d = pVar;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1193460702, i11, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.f5964c.getOwner(), this.f5965d, lVar, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0127a(s3 s3Var, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar) {
                super(2);
                this.f5958c = s3Var;
                this.f5959d = pVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2000640158, i11, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                }
                Object tag = this.f5958c.getOwner().getTag(d3.h.K);
                Set<c3.a> set = p013kotlin.jvm.internal.u0.r(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f5958c.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(d3.h.K) : null;
                    set = p013kotlin.jvm.internal.u0.r(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(lVar.J());
                    lVar.D();
                }
                AndroidComposeView owner = this.f5958c.getOwner();
                boolean zK = lVar.K(this.f5958c);
                s3 s3Var = this.f5958c;
                Object objI = lVar.I();
                if (zK || objI == p020r2.l.INSTANCE.a()) {
                    objI = new C0128a(s3Var, null);
                    lVar.B(objI);
                }
                Function0.g(owner, (wn0.p) objI, lVar, 0);
                AndroidComposeView owner2 = this.f5958c.getOwner();
                boolean zK2 = lVar.K(this.f5958c);
                s3 s3Var2 = this.f5958c;
                Object objI2 = lVar.I();
                if (zK2 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new b(s3Var2, null);
                    lVar.B(objI2);
                }
                Function0.g(owner2, (wn0.p) objI2, lVar, 0);
                p020r2.w.a(c3.d.a().d(set), z2.c.e(-1193460702, true, new c(this.f5958c, this.f5959d), lVar, 54), lVar, p020r2.h2.f106566i | 48);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar) {
            super(1);
            this.f5957d = pVar;
        }

        public final void a(AndroidComposeView.b bVar) {
            if (s3.this.disposed) {
                return;
            }
            Lifecycle lifecycle = bVar.getLifecycleOwner().getLifecycle();
            s3.this.lastContent = this.f5957d;
            if (s3.this.addedToLifecycle == null) {
                s3.this.addedToLifecycle = lifecycle;
                lifecycle.a(s3.this);
            } else if (lifecycle.getState().isAtLeast(Lifecycle.State.CREATED)) {
                s3.this.getOriginal().d(z2.c.c(-2000640158, true, new C0127a(s3.this, this.f5957d)));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(AndroidComposeView.b bVar) {
            a(bVar);
            return jn0.h0.f84049a;
        }
    }

    public s3(AndroidComposeView androidComposeView, p020r2.p pVar) {
        this.owner = androidComposeView;
        this.original = pVar;
    }

    @Override // p020r2.p
    public void d(wn0.p<? super p020r2.l, ? super Integer, jn0.h0> content) {
        this.owner.setOnViewTreeOwnersAvailable(new a(content));
    }

    @Override // p020r2.p
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(d3.h.L, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.p003lifecycle.u
    public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
        if (event == Lifecycle.a.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.a.ON_CREATE || this.disposed) {
                return;
            }
            d(this.lastContent);
        }
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final p020r2.p getOriginal() {
        return this.original;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }
}
