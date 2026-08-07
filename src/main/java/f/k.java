package f;

import android.annotation.SuppressLint;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.e0;
import androidx.p003lifecycle.LifecycleOwner;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.a0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aC\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006.\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/b;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "onBack", "a", "(ZLwn0/p;Lr2/l;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63739n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f63740o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f63741p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, boolean z11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f63740o = jVar;
            this.f63741p = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f63740o, this.f63741p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f63739n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f63740o.b(this.f63741p);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f63742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f63743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f63744e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f/k$b$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f63745a;

            public a(j jVar) {
                this.f63745a = jVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f63745a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, j jVar) {
            super(1);
            this.f63742c = onBackPressedDispatcher;
            this.f63743d = lifecycleOwner;
            this.f63744e = jVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f63742c.i(this.f63743d, this.f63744e);
            return new a(this.f63744e);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f63746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<Flow<androidx.p002activity.b>, Continuation<h0>, Object> f63747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f63748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f63749f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z11, p<Flow<androidx.p002activity.b>, ? super Continuation<h0>, ? extends Object> pVar, int i11, int i12) {
            super(2);
            this.f63746c = z11;
            this.f63747d = pVar;
            this.f63748e = i11;
            this.f63749f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            k.a(this.f63746c, this.f63747d, lVar, k2.a(this.f63748e | 1), this.f63749f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @SuppressLint({"RememberReturnType"})
    public static final void a(boolean z11, p<Flow<androidx.p002activity.b>, ? super Continuation<h0>, ? extends Object> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-642000585);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                z11 = true;
            }
            if (o.J()) {
                o.S(-642000585, i13, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            y3 y3VarO = n3.o(pVar, lVarV, (i13 >> 3) & 14);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                a0 a0Var = new a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
                lVarV.B(a0Var);
                objI = a0Var;
            }
            CoroutineScope coroutineScope = ((a0) objI).getCoroutineScope();
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new j(z11, coroutineScope, b(y3VarO));
                lVarV.B(objI2);
            }
            j jVar = (j) objI2;
            boolean zN = lVarV.n(b(y3VarO)) | lVarV.n(coroutineScope);
            Object objI3 = lVarV.I();
            if (zN || objI3 == companion.a()) {
                jVar.a(b(y3VarO));
                jVar.c(coroutineScope);
                lVarV.B(h0.f84049a);
            }
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i15 = i13 & 14;
            boolean zK = lVarV.K(jVar) | (i15 == 4);
            Object objI4 = lVarV.I();
            if (zK || objI4 == companion.a()) {
                objI4 = new a(jVar, z11, null);
                lVarV.B(objI4);
            }
            Function0.g(boolValueOf, (p) objI4, lVarV, i15);
            e0 e0VarA = g.f63718a.a(lVarV, 6);
            if (e0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            OnBackPressedDispatcher onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) lVarV.U(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zK2 = lVarV.K(onBackPressedDispatcher) | lVarV.K(lifecycleOwner) | lVarV.K(jVar);
            Object objI5 = lVarV.I();
            if (zK2 || objI5 == companion.a()) {
                objI5 = new b(onBackPressedDispatcher, lifecycleOwner, jVar);
                lVarV.B(objI5);
            }
            Function0.b(lifecycleOwner, onBackPressedDispatcher, (l) objI5, lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z11, pVar, i11, i12));
        }
    }

    private static final p<Flow<androidx.p002activity.b>, Continuation<h0>, Object> b(y3<? extends p<Flow<androidx.p002activity.b>, ? super Continuation<h0>, ? extends Object>> y3Var) {
        return (p) y3Var.getValue();
    }
}
