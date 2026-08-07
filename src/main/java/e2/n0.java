package e2;

import androidx.compose.ui.platform.c2;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.platform.e2;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.z0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00105\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0017R\u0016\u00109\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Le2/n0;", "Landroidx/compose/ui/d$c;", "Landroidx/compose/ui/platform/c2;", "Lb4/h;", "Lb4/t;", "Le2/q0$a;", "Le2/q0;", "serviceAdapter", "Lb2/b0;", "legacyTextFieldState", "Lh2/h0;", "textFieldSelectionManager", "<init>", "(Le2/q0;Lb2/b0;Lh2/h0;)V", "Ljn0/h0;", "z2", "(Le2/q0;)V", "h2", "()V", "i2", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/e2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlinx/coroutines/Job;", "f0", "(Lwn0/p;)Lkotlinx/coroutines/Job;", "n", "Le2/q0;", "o", "Lb2/b0;", "K0", "()Lb2/b0;", "y2", "(Lb2/b0;)V", "p", "Lh2/h0;", "x0", "()Lh2/h0;", "A2", "(Lh2/h0;)V", "<set-?>", "q", "Lr2/p1;", "i0", "()Lz3/v;", "x2", "layoutCoordinates", "Landroidx/compose/ui/platform/r2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/r2;", "softwareKeyboardController", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 extends androidx.compose.ui.d.c implements c2, b4.h, b4.t, q0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private q0 serviceAdapter;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private kotlin.b0 legacyTextFieldState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p007h2.h0 textFieldSelectionManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p1 layoutCoordinates = s3.d(null, null, 2, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f61504n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.p<e2, Continuation<?>, Object> f61506p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.p<? super e2, ? super Continuation<?>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f61506p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return n0.this.new a(this.f61506p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f61504n;
            if (i11 == 0) {
                jn0.t.b(obj);
                n0 n0Var = n0.this;
                wn0.p<e2, Continuation<?>, Object> pVar = this.f61506p;
                this.f61504n = 1;
                if (d2.b(n0Var, pVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public n0(q0 q0Var, kotlin.b0 b0Var, p007h2.h0 h0Var) {
        this.serviceAdapter = q0Var;
        this.legacyTextFieldState = b0Var;
        this.textFieldSelectionManager = h0Var;
    }

    private void x2(z3.v vVar) {
        this.layoutCoordinates.setValue(vVar);
    }

    public void A2(p007h2.h0 h0Var) {
        this.textFieldSelectionManager = h0Var;
    }

    @Override // e2.q0.a
    /* JADX INFO: renamed from: K0, reason: from getter */
    public kotlin.b0 getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // b4.t
    public void P(z3.v coordinates) {
        x2(coordinates);
    }

    @Override // e2.q0.a
    public Job f0(wn0.p<? super e2, ? super Continuation<?>, ? extends Object> block) {
        if (getIsAttached()) {
            return BuildersKt__Builders_commonKt.launch$default(X1(), null, CoroutineStart.UNDISPATCHED, new a(block, null), 1, null);
        }
        return null;
    }

    @Override // e2.q0.a
    public r2 getSoftwareKeyboardController() {
        return (r2) b4.i.a(this, z0.q());
    }

    @Override // e2.q0.a
    public e3 getViewConfiguration() {
        return (e3) b4.i.a(this, z0.u());
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        this.serviceAdapter.j(this);
    }

    @Override // e2.q0.a
    public z3.v i0() {
        return (z3.v) this.layoutCoordinates.getValue();
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.serviceAdapter.l(this);
    }

    @Override // e2.q0.a
    /* JADX INFO: renamed from: x0, reason: from getter */
    public p007h2.h0 getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public void y2(kotlin.b0 b0Var) {
        this.legacyTextFieldState = b0Var;
    }

    public final void z2(q0 serviceAdapter) {
        if (getIsAttached()) {
            this.serviceAdapter.a();
            this.serviceAdapter.l(this);
        }
        this.serviceAdapter = serviceAdapter;
        if (getIsAttached()) {
            this.serviceAdapter.j(this);
        }
    }
}
