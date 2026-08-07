package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.m;
import jn0.p;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l0;
import p020r2.o;
import p020r2.y3;
import p1.l1.a;
import p1.l1.d;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001ac\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ao\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"$\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0004\u0012\u00020 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001b\u0010(\u001a\u00020$8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"T", "targetState", "", AnnotatedPrivateKey.LABEL, "Lp1/l1;", "g", "(Ljava/lang/Object;Ljava/lang/String;Lr2/l;II)Lp1/l1;", "Lp1/n1;", "transitionState", "f", "(Lp1/n1;Ljava/lang/String;Lr2/l;II)Lp1/l1;", "S", "Lp1/q;", "V", "Lp1/p1;", "typeConverter", "Lp1/l1$a;", "c", "(Lp1/l1;Lp1/p1;Ljava/lang/String;Lr2/l;II)Lp1/l1$a;", "initialState", "childLabel", "b", "(Lp1/l1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lr2/l;I)Lp1/l1;", "initialValue", "targetValue", "Lp1/g0;", "animationSpec", "Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "(Lp1/l1;Ljava/lang/Object;Ljava/lang/Object;Lp1/g0;Lp1/p1;Ljava/lang/String;Lr2/l;I)Lr2/y3;", "Lkotlin/Function1;", "Lp1/z0;", "Ljn0/h0;", "a", "Lwn0/l;", "SeekableTransitionStateTotalDurationChanged", "Landroidx/compose/runtime/snapshots/l;", "Lkotlin/Lazy;", "e", "()Landroidx/compose/runtime/snapshots/l;", "SeekableStateObserver", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<z0<?>, h0> f100497a = b.f100501c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f100498b = m.a(p.NONE, a.f100499c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "b", "()Landroidx/compose/runtime/snapshots/l;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<androidx.compose.runtime.snapshots.l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f100499c = new a();

        /* JADX INFO: renamed from: p1.m1$a$a, reason: from Kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "it", "a", "(Lwn0/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class Function0 extends u implements l<wn0.a<? extends h0>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final Function0 f100500c = new Function0();

            Function0() {
                super(1);
            }

            public final void a(wn0.a<h0> aVar) {
                aVar.invoke();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(wn0.a<? extends h0> aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.l invoke() {
            androidx.compose.runtime.snapshots.l lVar = new androidx.compose.runtime.snapshots.l(Function0.f100500c);
            lVar.s();
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/z0;", "it", "Ljn0/h0;", "a", "(Lp1/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<z0<?>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f100501c = new b();

        b() {
            super(1);
        }

        public final void a(z0<?> z0Var) {
            z0Var.M();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(z0<?> z0Var) {
            a(z0Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<S> f100502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1<T> f100503d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/m1$c$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l1 f100504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1 f100505b;

            public a(l1 l1Var, l1 l1Var2) {
                this.f100504a = l1Var;
                this.f100505b = l1Var2;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f100504a.D(this.f100505b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l1<S> l1Var, l1<T> l1Var2) {
            super(1);
            this.f100502c = l1Var;
            this.f100503d = l1Var2;
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
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f100502c.d(this.f100503d);
            return new a(this.f100502c, this.f100503d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lp1/q;", "V", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<S> f100506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1<S>.a<T, V> f100507d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/m1$d$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l1 f100508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1.a f100509b;

            public a(l1 l1Var, l1.a aVar) {
                this.f100508a = l1Var;
                this.f100509b = aVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f100508a.B(this.f100509b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l1<S> l1Var, l1<S>.a<T, V> aVar) {
            super(1);
            this.f100506c = l1Var;
            this.f100507d = aVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            return new a(this.f100506c, this.f100507d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lp1/q;", "V", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<S> f100510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l1<S>.d<T, V> f100511d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/m1$e$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l1 f100512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l1.d f100513b;

            public a(l1 l1Var, l1.d dVar) {
                this.f100512a = l1Var;
                this.f100513b = dVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f100512a.C(this.f100513b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l1<S> l1Var, l1<S>.d<T, V> dVar) {
            super(1);
            this.f100510c = l1Var;
            this.f100511d = dVar;
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
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f100510c.c(this.f100511d);
            return new a(this.f100510c, this.f100511d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", i = {0}, l = {2191}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f100515o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f100516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n1<T> f100517q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n1<T> n1Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f100517q = n1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f100517q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex compositionContinuationMutex;
            n1 n1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100516p;
            if (i11 == 0) {
                t.b(obj);
                ((z0) this.f100517q).L();
                compositionContinuationMutex = ((z0) this.f100517q).getCompositionContinuationMutex();
                n1 n1Var2 = this.f100517q;
                this.f100514n = compositionContinuationMutex;
                this.f100515o = n1Var2;
                this.f100516p = 1;
                if (compositionContinuationMutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n1Var = n1Var2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n1Var = (n1) this.f100515o;
                compositionContinuationMutex = (Mutex) this.f100514n;
                t.b(obj);
            }
            try {
                ((z0) n1Var).S(n1Var.b());
                CancellableContinuation cancellableContinuationG = ((z0) n1Var).G();
                if (cancellableContinuationG != null) {
                    s.Companion companion = s.INSTANCE;
                    cancellableContinuationG.resumeWith(s.b(n1Var.b()));
                }
                ((z0) n1Var).T(null);
                h0 h0Var = h0.f84049a;
                return h0.f84049a;
            } finally {
                compositionContinuationMutex.unlock(null);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f100518c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/m1$g$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l1 f100519a;

            public a(l1 l1Var) {
                this.f100519a = l1Var;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f100519a.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(l1<T> l1Var) {
            super(1);
            this.f100518c = l1Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            return new a(this.f100518c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f100520c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p1/m1$h$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l1 f100521a;

            public a(l1 l1Var) {
                this.f100521a = l1Var;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f100521a.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(l1<T> l1Var) {
            super(1);
            this.f100520c = l1Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            return new a(this.f100520c);
        }
    }

    public static final <S, T> l1<T> b(l1<S> l1Var, T t11, T t12, String str, p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(-198307638, i11, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)");
        }
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && lVar.n(l1Var)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z12 || objI == p020r2.l.INSTANCE.a()) {
            objI = new l1(new u0(t11), l1Var, l1Var.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String() + " > " + str);
            lVar.B(objI);
        }
        l1<T> l1Var2 = (l1) objI;
        if ((i12 <= 4 || !lVar.n(l1Var)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean zN = lVar.n(l1Var2) | z11;
        Object objI2 = lVar.I();
        if (zN || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = new c(l1Var, l1Var2);
            lVar.B(objI2);
        }
        Function0.c(l1Var2, (l) objI2, lVar, 0);
        if (l1Var.u()) {
            l1Var2.G(t11, t12, l1Var.getLastSeekedTimeNanos());
        } else {
            l1Var2.R(t12);
            l1Var2.K(false);
        }
        if (o.J()) {
            o.R();
        }
        return l1Var2;
    }

    public static final <S, T, V extends q> l1<S>.a<T, V> c(l1<S> l1Var, p1<T, V> p1Var, String str, p020r2.l lVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (o.J()) {
            o.S(-1714122528, i11, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)");
        }
        int i13 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i13 > 4 && lVar.n(l1Var)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z12 || objI == p020r2.l.INSTANCE.a()) {
            objI = l1Var.new a(p1Var, str);
            lVar.B(objI);
        }
        l1<S>.a<T, V> aVar = (l1.a) objI;
        if ((i13 <= 4 || !lVar.n(l1Var)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean zK = lVar.K(aVar) | z11;
        Object objI2 = lVar.I();
        if (zK || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = new d(l1Var, aVar);
            lVar.B(objI2);
        }
        Function0.c(aVar, (l) objI2, lVar, 0);
        if (l1Var.u()) {
            aVar.d();
        }
        if (o.J()) {
            o.R();
        }
        return aVar;
    }

    public static final <S, T, V extends q> y3<T> d(l1<S> l1Var, T t11, T t12, g0<T> g0Var, p1<T, V> p1Var, String str, p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(-304821198, i11, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)");
        }
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && lVar.n(l1Var)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z12 || objI == p020r2.l.INSTANCE.a()) {
            Object dVar = l1Var.new d(t11, l.i(p1Var, t12), p1Var, str);
            lVar.B(dVar);
            objI = dVar;
        }
        l1.d dVar2 = (l1.d) objI;
        if (l1Var.u()) {
            dVar2.Q(t11, t12, g0Var);
        } else {
            dVar2.S(t12, g0Var);
        }
        if ((i12 <= 4 || !lVar.n(l1Var)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean zN = lVar.n(dVar2) | z11;
        Object objI2 = lVar.I();
        if (zN || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = new e(l1Var, dVar2);
            lVar.B(objI2);
        }
        Function0.c(dVar2, (l) objI2, lVar, 0);
        if (o.J()) {
            o.R();
        }
        return dVar2;
    }

    public static final androidx.compose.runtime.snapshots.l e() {
        return (androidx.compose.runtime.snapshots.l) f100498b.getValue();
    }

    public static final <T> l1<T> f(n1<T> n1Var, String str, p020r2.l lVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if (o.J()) {
            o.S(1643203617, i11, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)");
        }
        int i13 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i13 > 4 && lVar.n(n1Var)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z12 || objI == p020r2.l.INSTANCE.a()) {
            objI = new l1((n1) n1Var, str);
            lVar.B(objI);
        }
        l1<T> l1Var = (l1) objI;
        if (n1Var instanceof z0) {
            lVar.o(1030413636);
            T tA = n1Var.a();
            T tB = n1Var.b();
            if ((i13 <= 4 || !lVar.n(n1Var)) && (i11 & 6) != 4) {
                z11 = false;
            }
            Object objI2 = lVar.I();
            if (z11 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new f(n1Var, null);
                lVar.B(objI2);
            }
            Function0.f(tA, tB, (wn0.p) objI2, lVar, 0);
            lVar.l();
        } else {
            lVar.o(1030875195);
            l1Var.e(n1Var.b(), lVar, 0);
            lVar.l();
        }
        boolean zN = lVar.n(l1Var);
        Object objI3 = lVar.I();
        if (zN || objI3 == p020r2.l.INSTANCE.a()) {
            objI3 = new g(l1Var);
            lVar.B(objI3);
        }
        Function0.c(l1Var, (l) objI3, lVar, 0);
        if (o.J()) {
            o.R();
        }
        return l1Var;
    }

    public static final <T> l1<T> g(T t11, String str, p020r2.l lVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if (o.J()) {
            o.S(2029166765, i11, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:91)");
        }
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = new l1(t11, str);
            lVar.B(objI);
        }
        l1<T> l1Var = (l1) objI;
        l1Var.e(t11, lVar, (i11 & 8) | 48 | (i11 & 14));
        Object objI2 = lVar.I();
        if (objI2 == companion.a()) {
            objI2 = new h(l1Var);
            lVar.B(objI2);
        }
        Function0.c(l1Var, (l) objI2, lVar, 54);
        if (o.J()) {
            o.R();
        }
        return l1Var;
    }
}
