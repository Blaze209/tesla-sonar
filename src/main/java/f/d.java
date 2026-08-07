package f;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.b0;
import androidx.p002activity.e0;
import androidx.p003lifecycle.LifecycleOwner;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "a", "(ZLwn0/a;Lr2/l;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1304d f63702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f63703d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1304d c1304d, boolean z11) {
            super(0);
            this.f63702c = c1304d;
            this.f63703d = z11;
        }

        public final void b() {
            this.f63702c.setEnabled(this.f63703d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f63704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f63705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1304d f63706e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f/d$b$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1304d f63707a;

            public a(C1304d c1304d) {
                this.f63707a = c1304d;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f63707a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, C1304d c1304d) {
            super(1);
            this.f63704c = onBackPressedDispatcher;
            this.f63705d = lifecycleOwner;
            this.f63706e = c1304d;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f63704c.i(this.f63705d, this.f63706e);
            return new a(this.f63706e);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f63708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f63709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f63710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f63711f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, wn0.a<h0> aVar, int i11, int i12) {
            super(2);
            this.f63708c = z11;
            this.f63709d = aVar;
            this.f63710e = i11;
            this.f63711f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            d.a(this.f63708c, this.f63709d, lVar, k2.a(this.f63710e | 1), this.f63711f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: f.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f/d$d", "Landroidx/activity/b0;", "Ljn0/h0;", "handleOnBackPressed", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1304d extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y3<wn0.a<h0>> f63712a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1304d(boolean z11, y3<? extends wn0.a<h0>> y3Var) {
            super(z11);
            this.f63712a = y3Var;
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            d.b(this.f63712a).invoke();
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
    public static final void a(boolean z11, wn0.a<h0> aVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-361453782);
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
            i13 |= lVarV.K(aVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                z11 = true;
            }
            if (o.J()) {
                o.S(-361453782, i13, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            y3 y3VarO = n3.o(aVar, lVarV, (i13 >> 3) & 14);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new C1304d(z11, y3VarO);
                lVarV.B(objI);
            }
            C1304d c1304d = (C1304d) objI;
            boolean z12 = (i13 & 14) == 4;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == companion.a()) {
                objI2 = new a(c1304d, z11);
                lVarV.B(objI2);
            }
            Function0.i((wn0.a) objI2, lVarV, 0);
            e0 e0VarA = g.f63718a.a(lVarV, 6);
            if (e0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            OnBackPressedDispatcher onBackPressedDispatcher = e0VarA.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) lVarV.U(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zK = lVarV.K(onBackPressedDispatcher) | lVarV.K(lifecycleOwner);
            Object objI3 = lVarV.I();
            if (zK || objI3 == companion.a()) {
                objI3 = new b(onBackPressedDispatcher, lifecycleOwner, c1304d);
                lVarV.B(objI3);
            }
            Function0.b(lifecycleOwner, onBackPressedDispatcher, (l) objI3, lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z11, aVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.a<h0> b(y3<? extends wn0.a<h0>> y3Var) {
        return y3Var.getValue();
    }
}
