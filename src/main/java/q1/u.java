package q1;

import com.plaid.internal.EnumC4419g;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lq1/u;", "Landroidx/compose/ui/d$c;", "Lu1/l;", "interactionSource", "<init>", "(Lu1/l;)V", "Ljn0/h0;", "x2", "()V", "Lu1/i;", "interaction", "y2", "(Lu1/l;Lu1/i;)V", "", "isFocused", "z2", "(Z)V", "A2", "n", "Lu1/l;", "Lu1/d;", "o", "Lu1/d;", "focusedInteraction", "p", "Z", "c2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class u extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private u1.l interactionSource;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private u1.d focusedInteraction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f104335n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ u1.l f104336o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.i f104337p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ DisposableHandle f104338q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u1.l lVar, u1.i iVar, DisposableHandle disposableHandle, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f104336o = lVar;
            this.f104337p = iVar;
            this.f104338q = disposableHandle;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f104336o, this.f104337p, this.f104338q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f104335n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u1.l lVar = this.f104336o;
                u1.i iVar = this.f104337p;
                this.f104335n = 1;
                if (lVar.a(iVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            DisposableHandle disposableHandle = this.f104338q;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u1.l f104339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u1.i f104340d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u1.l lVar, u1.i iVar) {
            super(1);
            this.f104339c = lVar;
            this.f104340d = iVar;
        }

        public final void a(Throwable th2) {
            this.f104339c.b(this.f104340d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    public u(u1.l lVar) {
        this.interactionSource = lVar;
    }

    private final void x2() {
        u1.d dVar;
        u1.l lVar = this.interactionSource;
        if (lVar != null && (dVar = this.focusedInteraction) != null) {
            lVar.b(new u1.e(dVar));
        }
        this.focusedInteraction = null;
    }

    private final void y2(u1.l lVar, u1.i iVar) {
        if (!getIsAttached()) {
            lVar.b(iVar);
        } else {
            Job job = (Job) X1().getCoroutineContext().get(Job.INSTANCE);
            BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new a(lVar, iVar, job != null ? job.invokeOnCompletion(new b(lVar, iVar)) : null, null), 3, null);
        }
    }

    public final void A2(u1.l interactionSource) {
        if (p013kotlin.jvm.internal.s.f(this.interactionSource, interactionSource)) {
            return;
        }
        x2();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void z2(boolean isFocused) {
        u1.l lVar = this.interactionSource;
        if (lVar != null) {
            if (!isFocused) {
                u1.d dVar = this.focusedInteraction;
                if (dVar != null) {
                    y2(lVar, new u1.e(dVar));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            u1.d dVar2 = this.focusedInteraction;
            if (dVar2 != null) {
                y2(lVar, new u1.e(dVar2));
                this.focusedInteraction = null;
            }
            u1.d dVar3 = new u1.d();
            y2(lVar, dVar3);
            this.focusedInteraction = dVar3;
        }
    }
}
