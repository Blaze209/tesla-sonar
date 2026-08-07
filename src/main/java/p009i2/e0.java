package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p020r2.l;
import p020r2.o;
import p020r2.y3;
import u1.d;
import u1.e;
import u1.g;
import u1.h;
import u1.i;
import u1.j;
import u1.n;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Li2/e0;", "Li2/a1;", "Lw4/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/j;", "interactionSource", "Lr2/y3;", "a", "(Lu1/j;Lr2/l;I)Lr2/y3;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", Gender.FEMALE, "b", "c", DateTokenConverter.CONVERTER_KEY, "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74314n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ b1 f74315o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ e0 f74316p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b1 b1Var, e0 e0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f74315o = b1Var;
            this.f74316p = e0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f74315o, this.f74316p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74314n;
            if (i11 == 0) {
                t.b(obj);
                b1 b1Var = this.f74315o;
                float f11 = this.f74316p.defaultElevation;
                float f12 = this.f74316p.pressedElevation;
                float f13 = this.f74316p.hoveredElevation;
                float f14 = this.f74316p.focusedElevation;
                this.f74314n = 1;
                if (b1Var.f(f11, f12, f13, f14, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74317n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f74318o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j f74319p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ b1 f74320q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<i> f74321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f74322b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b1 f74323c;

            /* JADX INFO: renamed from: i2.e0$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
            static final class C1554a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f74324n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ b1 f74325o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ i f74326p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1554a(b1 b1Var, i iVar, Continuation<? super C1554a> continuation) {
                    super(2, continuation);
                    this.f74325o = b1Var;
                    this.f74326p = iVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1554a(this.f74325o, this.f74326p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f74324n;
                    if (i11 == 0) {
                        t.b(obj);
                        b1 b1Var = this.f74325o;
                        i iVar = this.f74326p;
                        this.f74324n = 1;
                        if (b1Var.b(iVar, this) == coroutine_suspended) {
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
                    return ((C1554a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            a(List<i> list, CoroutineScope coroutineScope, b1 b1Var) {
                this.f74321a = list;
                this.f74322b = coroutineScope;
                this.f74323c = b1Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i iVar, Continuation<? super h0> continuation) {
                if (iVar instanceof g) {
                    this.f74321a.add(iVar);
                } else if (iVar instanceof h) {
                    this.f74321a.remove(((h) iVar).getEnter());
                } else if (iVar instanceof d) {
                    this.f74321a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f74321a.remove(((e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f74321a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f74321a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f74321a.remove(((n.a) iVar).getPress());
                }
                BuildersKt__Builders_commonKt.launch$default(this.f74322b, null, null, new C1554a(this.f74323c, (i) v.C0(this.f74321a), null), 3, null);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, b1 b1Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f74319p = jVar;
            this.f74320q = b1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f74319p, this.f74320q, continuation);
            bVar.f74318o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74317n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f74318o;
                ArrayList arrayList = new ArrayList();
                Flow<i> flowC = this.f74319p.c();
                a aVar = new a(arrayList, coroutineScope, this.f74320q);
                this.f74317n = 1;
                if (flowC.collect(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ e0(float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14);
    }

    @Override // p009i2.a1
    public y3<w4.h> a(j jVar, l lVar, int i11) {
        lVar.o(-478475335);
        if (o.J()) {
            o.S(-478475335, i11, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:271)");
        }
        int i12 = i11 & 14;
        int i13 = i12 ^ 6;
        boolean z11 = (i13 > 4 && lVar.n(jVar)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            Object b1Var = new b1(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            lVar.B(b1Var);
            objI = b1Var;
        }
        b1 b1Var2 = (b1) objI;
        boolean zK = lVar.K(b1Var2) | ((((i11 & 112) ^ 48) > 32 && lVar.n(this)) || (i11 & 48) == 32);
        Object objI2 = lVar.I();
        if (zK || objI2 == l.INSTANCE.a()) {
            objI2 = new a(b1Var2, this, null);
            lVar.B(objI2);
        }
        Function0.g(this, (p) objI2, lVar, (i11 >> 3) & 14);
        boolean zK2 = lVar.K(b1Var2) | ((i13 > 4 && lVar.n(jVar)) || (i11 & 6) == 4);
        Object objI3 = lVar.I();
        if (zK2 || objI3 == l.INSTANCE.a()) {
            objI3 = new b(jVar, b1Var2, null);
            lVar.B(objI3);
        }
        Function0.g(jVar, (p) objI3, lVar, i12);
        y3<w4.h> y3VarC = b1Var2.c();
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        if (w4.h.i(this.defaultElevation, e0Var.defaultElevation) && w4.h.i(this.pressedElevation, e0Var.pressedElevation) && w4.h.i(this.hoveredElevation, e0Var.hoveredElevation)) {
            return w4.h.i(this.focusedElevation, e0Var.focusedElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((w4.h.j(this.defaultElevation) * 31) + w4.h.j(this.pressedElevation)) * 31) + w4.h.j(this.hoveredElevation)) * 31) + w4.h.j(this.focusedElevation);
    }

    private e0(float f11, float f12, float f13, float f14) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
    }
}
