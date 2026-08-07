package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p019p1.m;
import p019p1.r1;
import p020r2.y3;
import u1.d;
import u1.g;
import u1.i;
import u1.n;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Li2/b1;", "", "Lw4/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lu1/i;", DateTokenConverter.CONVERTER_KEY, "(Lu1/i;)F", "Ljn0/h0;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "to", "b", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr2/y3;", "c", "()Lr2/y3;", "a", Gender.FEMALE, "Lp1/a;", "Lp1/m;", "Lp1/a;", "animatable", "Lu1/i;", "lastTargetInteraction", "g", "targetInteraction", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float defaultElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float pressedElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float hoveredElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float focusedElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p019p1.a<h, m> animatable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private i lastTargetInteraction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private i targetInteraction;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {397}, m = "animateElevation", n = {"this", "to"}, s = {"L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74139n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f74140o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f74141p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74143r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74141p = obj;
            this.f74143r |= Integer.MIN_VALUE;
            return b1.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {383}, m = "snapElevation", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74144n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f74145o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f74147q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74145o = obj;
            this.f74147q |= Integer.MIN_VALUE;
            return b1.this.e(this);
        }
    }

    public /* synthetic */ b1(float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14);
    }

    private final float d(i iVar) {
        if (iVar instanceof n.b) {
            return this.pressedElevation;
        }
        if (iVar instanceof g) {
            return this.hoveredElevation;
        }
        return iVar instanceof d ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super h0> continuation) throws Throwable {
        b bVar;
        b1 b1Var;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f74147q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f74147q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f74145o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f74147q;
        if (i12 == 0) {
            t.b(obj);
            float fD = d(this.targetInteraction);
            if (!h.i(this.animatable.k().getValue(), fD)) {
                try {
                    p019p1.a<h, m> aVar = this.animatable;
                    h hVarD = h.d(fD);
                    bVar.f74144n = this;
                    bVar.f74147q = 1;
                    if (aVar.t(hVarD, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    b1Var = this;
                    b1Var.lastTargetInteraction = b1Var.targetInteraction;
                } catch (Throwable th2) {
                    th = th2;
                    b1Var = this;
                    b1Var.lastTargetInteraction = b1Var.targetInteraction;
                    throw th;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1Var = (b1) bVar.f74144n;
            try {
                t.b(obj);
                b1Var.lastTargetInteraction = b1Var.targetInteraction;
            } catch (Throwable th3) {
                th = th3;
                b1Var.lastTargetInteraction = b1Var.targetInteraction;
                throw th;
            }
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(i iVar, Continuation<? super h0> continuation) throws Throwable {
        a aVar;
        b1 b1Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f74143r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f74143r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f74141p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f74143r;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) aVar.f74140o;
            b1Var = (b1) aVar.f74139n;
            try {
                t.b(obj);
                b1Var.lastTargetInteraction = iVar;
                return h0.f84049a;
            } catch (Throwable th2) {
                th = th2;
                b1Var.lastTargetInteraction = iVar;
                throw th;
            }
        }
        t.b(obj);
        float fD = d(iVar);
        this.targetInteraction = iVar;
        try {
            if (!h.i(this.animatable.k().getValue(), fD)) {
                p019p1.a<h, m> aVar2 = this.animatable;
                i iVar2 = this.lastTargetInteraction;
                aVar.f74139n = this;
                aVar.f74140o = iVar;
                aVar.f74143r = 1;
                if (r0.d(aVar2, fD, iVar2, iVar, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            b1Var = this;
            b1Var.lastTargetInteraction = iVar;
            return h0.f84049a;
        } catch (Throwable th3) {
            th = th3;
            b1Var = this;
            b1Var.lastTargetInteraction = iVar;
            throw th;
        }
    }

    public final y3<h> c() {
        return this.animatable.g();
    }

    public final Object f(float f11, float f12, float f13, float f14, Continuation<? super h0> continuation) throws Throwable {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
        Object objE = e(continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    private b1(float f11, float f12, float f13, float f14) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
        this.animatable = new p019p1.a<>(h.d(this.defaultElevation), r1.g(h.INSTANCE), null, null, 12, null);
    }
}
