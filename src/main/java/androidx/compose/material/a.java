package androidx.compose.material;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p009i2.j0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.u;
import p019p1.i;
import p019p1.j1;
import p020r2.n3;
import p021s1.k;
import wn0.l;
import wn0.p;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0081@¢\u0006\u0004\b\u0019\u0010\u001a\u001aH\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001eH\u0082@¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b$\u0010%\u001a[\u0010*\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2*\u0010)\u001a&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000(0\u001eH\u0001¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "T", "Lkotlin/Function1;", "Li2/k0;", "Ljn0/h0;", "builder", "Li2/j0;", "a", "(Lwn0/l;)Li2/j0;", "Landroidx/compose/ui/d;", "Li2/c;", "state", "Ls1/p;", "orientation", "", "enabled", "reverseDirection", "Lu1/l;", "interactionSource", "startDragImmediately", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;Li2/c;Ls1/p;ZZLu1/l;Z)Landroidx/compose/ui/d;", "targetValue", "", "velocity", "f", "(Li2/c;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "j", "(Lwn0/a;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/c;", IntegerTokenConverter.CONVERTER_KEY, "()Landroidx/compose/material/c;", "Lw4/r;", "Lw4/b;", "Lkotlin/Pair;", "anchors", "h", "(Landroidx/compose/ui/d;Li2/c;Ls1/p;Lwn0/p;)Landroidx/compose/ui/d;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: androidx.compose.material.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "velocity", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;F)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C0108a extends SuspendLambda implements q<CoroutineScope, Float, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5016n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f5017o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ float f5018p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p009i2.c<T> f5019q;

        /* JADX INFO: renamed from: androidx.compose.material.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
        static final class C0109a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5020n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ p009i2.c<T> f5021o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ float f5022p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0109a(p009i2.c<T> cVar, float f11, Continuation<? super C0109a> continuation) {
                super(2, continuation);
                this.f5021o = cVar;
                this.f5022p = f11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0109a(this.f5021o, this.f5022p, continuation);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f5020n;
                if (i11 == 0) {
                    t.b(obj);
                    p009i2.c<T> cVar = this.f5021o;
                    float f11 = this.f5022p;
                    this.f5020n = 1;
                    if (cVar.G(f11, this) == coroutine_suspended) {
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
                return ((C0109a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0108a(p009i2.c<T> cVar, Continuation<? super C0108a> continuation) {
            super(3, continuation);
            this.f5019q = cVar;
        }

        public final Object a(CoroutineScope coroutineScope, float f11, Continuation<? super h0> continuation) {
            C0108a c0108a = new C0108a(this.f5019q, continuation);
            c0108a.f5017o = coroutineScope;
            c0108a.f5018p = f11;
            return c0108a.invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f11, Continuation<? super h0> continuation) {
            return a(coroutineScope, f11.floatValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5016n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f5017o, null, null, new C0109a(this.f5019q, this.f5018p, null), 3, null);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Li2/b;", "Li2/j0;", "anchors", "latestTarget", "Ljn0/h0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {706}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends SuspendLambda implements r<p009i2.b, j0<T>, T, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5023n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f5024o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f5025p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f5026q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p009i2.c<T> f5027r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f5028s;

        /* JADX INFO: renamed from: androidx.compose.material.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "Ljn0/h0;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class C0110a extends u implements p<Float, Float, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p009i2.b f5029c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k0 f5030d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0110a(p009i2.b bVar, k0 k0Var) {
                super(2);
                this.f5029c = bVar;
                this.f5030d = k0Var;
            }

            public final void a(float f11, float f12) {
                this.f5029c.b(f11, f12);
                this.f5030d.f86525a = f11;
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Float f11, Float f12) {
                a(f11.floatValue(), f12.floatValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p009i2.c<T> cVar, float f11, Continuation<? super b> continuation) {
            super(4, continuation);
            this.f5027r = cVar;
            this.f5028s = f11;
        }

        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p009i2.b bVar, j0<T> j0Var, T t11, Continuation<? super h0> continuation) {
            b bVar2 = new b(this.f5027r, this.f5028s, continuation);
            bVar2.f5024o = bVar;
            bVar2.f5025p = j0Var;
            bVar2.f5026q = t11;
            return bVar2.invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5023n;
            if (i11 == 0) {
                t.b(obj);
                p009i2.b bVar = (p009i2.b) this.f5024o;
                float fE = ((j0) this.f5025p).e(this.f5026q);
                if (!Float.isNaN(fE)) {
                    k0 k0Var = new k0();
                    float fW = Float.isNaN(this.f5027r.w()) ? BitmapDescriptorFactory.HUE_RED : this.f5027r.w();
                    k0Var.f86525a = fW;
                    float f11 = this.f5028s;
                    i<Float> iVarP = this.f5027r.p();
                    C0110a c0110a = new C0110a(bVar, k0Var);
                    this.f5024o = null;
                    this.f5025p = null;
                    this.f5023n = 1;
                    if (j1.b(fW, fE, f11, iVarP, c0110a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {737}, m = "restartable", n = {}, s = {})
    static final class c<I> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5031n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5032o;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5031n = obj;
            this.f5032o |= Integer.MIN_VALUE;
            return a.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {740}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5033n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f5034o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.a<I> f5035p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<I, Continuation<? super h0>, Object> f5036q;

        /* JADX INFO: renamed from: androidx.compose.material.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C0111a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0<Job> f5037a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f5038b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<I, Continuation<? super h0>, Object> f5039c;

            /* JADX INFO: renamed from: androidx.compose.material.a$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {746}, m = "invokeSuspend", n = {}, s = {})
            static final class C0112a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f5040n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ p<I, Continuation<? super h0>, Object> f5041o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ I f5042p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f5043q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0112a(p<? super I, ? super Continuation<? super h0>, ? extends Object> pVar, I i11, CoroutineScope coroutineScope, Continuation<? super C0112a> continuation) {
                    super(2, continuation);
                    this.f5041o = pVar;
                    this.f5042p = i11;
                    this.f5043q = coroutineScope;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C0112a(this.f5041o, this.f5042p, this.f5043q, continuation);
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
                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f5040n;
                    if (i11 == 0) {
                        t.b(obj);
                        p<I, Continuation<? super h0>, Object> pVar = this.f5041o;
                        I i12 = this.f5042p;
                        this.f5040n = 1;
                        if (pVar.invoke(i12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    CoroutineScopeKt.cancel(this.f5043q, new AnchoredDragFinishedSignal());
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C0112a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.material.a$d$a$b */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {743}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
            static final class b extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f5044n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f5045o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f5046p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f5047q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ C0111a<T> f5048r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f5049s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0111a<? super T> c0111a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f5048r = c0111a;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f5047q = obj;
                    this.f5049s |= Integer.MIN_VALUE;
                    return this.f5048r.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0111a(n0<Job> n0Var, CoroutineScope coroutineScope, p<? super I, ? super Continuation<? super h0>, ? extends Object> pVar) {
                this.f5037a = n0Var;
                this.f5038b = coroutineScope;
                this.f5039c = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(I i11, Continuation<? super h0> continuation) {
                b bVar;
                C0111a<T> c0111a;
                Object obj;
                if (continuation instanceof b) {
                    bVar = (b) continuation;
                    int i12 = bVar.f5049s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bVar.f5049s = i12 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, continuation);
                    }
                } else {
                    bVar = new b(this, continuation);
                }
                Object obj2 = bVar.f5047q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i13 = bVar.f5049s;
                if (i13 == 0) {
                    t.b(obj2);
                    Job job = this.f5037a.f86529a;
                    if (job != null) {
                        job.cancel((CancellationException) new AnchoredDragFinishedSignal());
                        bVar.f5044n = this;
                        bVar.f5045o = i11;
                        bVar.f5046p = job;
                        bVar.f5049s = 1;
                        if (job.join(bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    c0111a = this;
                    obj = i11;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = bVar.f5045o;
                    c0111a = (C0111a) bVar.f5044n;
                    t.b(obj2);
                    obj = obj3;
                }
                n0<Job> n0Var = c0111a.f5037a;
                CoroutineScope coroutineScope = c0111a.f5038b;
                n0Var.f86529a = (T) BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C0112a(c0111a.f5039c, obj, coroutineScope, null), 1, null);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(wn0.a<? extends I> aVar, p<? super I, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f5035p = aVar;
            this.f5036q = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f5035p, this.f5036q, continuation);
            dVar.f5034o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5033n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f5034o;
                n0 n0Var = new n0();
                Flow flowP = n3.p(this.f5035p);
                C0111a c0111a = new C0111a(n0Var, coroutineScope, this.f5036q);
                this.f5033n = 1;
                if (flowP.collect(c0111a, this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T> j0<T> a(l<? super p009i2.k0<T>, h0> lVar) {
        p009i2.k0 k0Var = new p009i2.k0();
        lVar.invoke(k0Var);
        return new MapDraggableAnchors(k0Var.b());
    }

    public static final <T> androidx.compose.ui.d d(androidx.compose.ui.d dVar, p009i2.c<T> cVar, p021s1.p pVar, boolean z11, boolean z12, u1.l lVar, boolean z13) {
        return k.g(dVar, cVar.getDraggableState(), pVar, z11, lVar, z13, null, new C0108a(cVar, null), z12, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.d e(androidx.compose.ui.d dVar, p009i2.c cVar, p021s1.p pVar, boolean z11, boolean z12, u1.l lVar, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        boolean z15 = z12;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        u1.l lVar2 = lVar;
        if ((i11 & 32) != 0) {
            z13 = cVar.y();
        }
        return d(dVar, cVar, pVar, z14, z15, lVar2, z13);
    }

    public static final <T> Object f(p009i2.c<T> cVar, T t11, float f11, Continuation<? super h0> continuation) {
        Object objK = p009i2.c.k(cVar, t11, null, new b(cVar, f11, null), continuation, 2, null);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : h0.f84049a;
    }

    public static /* synthetic */ Object g(p009i2.c cVar, Object obj, float f11, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            f11 = cVar.v();
        }
        return f(cVar, obj, f11, continuation);
    }

    public static final <T> androidx.compose.ui.d h(androidx.compose.ui.d dVar, p009i2.c<T> cVar, p021s1.p pVar, p<? super w4.r, ? super w4.b, ? extends Pair<? extends j0<T>, ? extends T>> pVar2) {
        return dVar.g(new DraggableAnchorsElement(cVar, pVar2, pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> i() {
        return new MapDraggableAnchors<>(v0.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <I> Object j(wn0.a<? extends I> aVar, p<? super I, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f5032o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f5032o = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f5031n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f5032o;
        try {
            if (i12 == 0) {
                t.b(obj);
                d dVar = new d(aVar, pVar, null);
                cVar.f5032o = 1;
                if (CoroutineScopeKt.coroutineScope(dVar, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return h0.f84049a;
    }
}
