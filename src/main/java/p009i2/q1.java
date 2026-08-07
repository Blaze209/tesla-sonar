package p009i2;

import a3.j;
import a3.k;
import a3.l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p019p1.i;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0017BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0014\u0010\u0011J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0014\u0010-\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001f¨\u0006."}, d2 = {"Li2/q1;", "", "Li2/r1;", "initialValue", "Lw4/d;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "Lp1/i;", "", "animationSpec", "isSkipHalfExpanded", "<init>", "(Li2/r1;Lw4/d;Lwn0/l;Lp1/i;Z)V", "Ljn0/h0;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", IntegerTokenConverter.CONVERTER_KEY, "c", "target", "velocity", "a", "(Li2/r1;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/i;", "getAnimationSpec$material_release", "()Lp1/i;", "b", "Z", "j", "()Z", "Li2/c;", "Li2/c;", DateTokenConverter.CONVERTER_KEY, "()Li2/c;", "anchoredDraggableState", "e", "()Li2/r1;", "currentValue", "g", "targetValue", "k", "isVisible", "f", "hasHalfExpandedState", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f74975e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i<Float> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isSkipHalfExpanded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p009i2.c<r1> anchoredDraggableState;

    /* JADX INFO: renamed from: i2.q1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u00030\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Li2/q1$a;", "", "<init>", "()V", "Lp1/i;", "", "animationSpec", "Lkotlin/Function1;", "Li2/r1;", "", "confirmValueChange", "skipHalfExpanded", "Lw4/d;", "density", "La3/j;", "Li2/q1;", "a", "(Lp1/i;Lwn0/l;ZLw4/d;)La3/j;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i2.q1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La3/l;", "Li2/q1;", "it", "Li2/r1;", "a", "(La3/l;Li2/q1;)Li2/r1;"}, k = 3, mv = {1, 8, 0})
        static final class C1571a extends u implements p<l, q1, r1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1571a f74979c = new C1571a();

            C1571a() {
                super(2);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r1 invoke(l lVar, q1 q1Var) {
                return q1Var.e();
            }
        }

        /* JADX INFO: renamed from: i2.q1$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li2/r1;", "it", "Li2/q1;", "a", "(Li2/r1;)Li2/q1;"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.l<r1, q1> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w4.d f74980c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l<r1, Boolean> f74981d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i<Float> f74982e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f74983f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(w4.d dVar, wn0.l<? super r1, Boolean> lVar, i<Float> iVar, boolean z11) {
                super(1);
                this.f74980c = dVar;
                this.f74981d = lVar;
                this.f74982e = iVar;
                this.f74983f = z11;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q1 invoke(r1 r1Var) {
                return new q1(r1Var, this.f74980c, this.f74981d, this.f74982e, this.f74983f);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<q1, ?> a(i<Float> animationSpec, wn0.l<? super r1, Boolean> confirmValueChange, boolean skipHalfExpanded, w4.d density) {
            return k.a(C1571a.f74979c, new b(density, confirmValueChange, animationSpec, skipHalfExpanded));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74984a;

        static {
            int[] iArr = new int[r1.values().length];
            try {
                iArr[r1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f74984a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<Float, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4.d f74985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w4.d dVar) {
            super(1);
            this.f74985c = dVar;
        }

        public final Float a(float f11) {
            return Float.valueOf(this.f74985c.O1(p1.f74868a));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements a<Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4.d f74986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w4.d dVar) {
            super(0);
            this.f74986c = dVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f74986c.O1(p1.f74869b));
        }
    }

    public q1(r1 r1Var, w4.d dVar, wn0.l<? super r1, Boolean> lVar, i<Float> iVar, boolean z11) {
        this.animationSpec = iVar;
        this.isSkipHalfExpanded = z11;
        this.anchoredDraggableState = new p009i2.c<>(r1Var, new c(dVar), new d(dVar), iVar, lVar);
        if (z11 && r1Var == r1.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object b(q1 q1Var, r1 r1Var, float f11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = q1Var.anchoredDraggableState.v();
        }
        return q1Var.a(r1Var, f11, continuation);
    }

    public final Object a(r1 r1Var, float f11, Continuation<? super h0> continuation) {
        Object objF = androidx.compose.material.a.f(this.anchoredDraggableState, r1Var, f11, continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
    }

    public final Object c(Continuation<? super h0> continuation) {
        j0<r1> j0VarO = this.anchoredDraggableState.o();
        r1 r1Var = r1.Expanded;
        if (!j0VarO.c(r1Var)) {
            return h0.f84049a;
        }
        Object objB = b(this, r1Var, BitmapDescriptorFactory.HUE_RED, continuation, 2, null);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }

    public final p009i2.c<r1> d() {
        return this.anchoredDraggableState;
    }

    public final r1 e() {
        return this.anchoredDraggableState.s();
    }

    public final boolean f() {
        return this.anchoredDraggableState.o().c(r1.HalfExpanded);
    }

    public final r1 g() {
        return this.anchoredDraggableState.x();
    }

    public final Object h(Continuation<? super h0> continuation) {
        if (!f()) {
            return h0.f84049a;
        }
        Object objB = b(this, r1.HalfExpanded, BitmapDescriptorFactory.HUE_RED, continuation, 2, null);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }

    public final Object i(Continuation<? super h0> continuation) {
        Object objB = b(this, r1.Hidden, BitmapDescriptorFactory.HUE_RED, continuation, 2, null);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final boolean k() {
        return this.anchoredDraggableState.s() != r1.Hidden;
    }

    public final Object l(Continuation<? super h0> continuation) {
        j0<r1> j0VarO = this.anchoredDraggableState.o();
        r1 r1Var = r1.Expanded;
        boolean zC = j0VarO.c(r1Var);
        if (b.f74984a[e().ordinal()] == 1) {
            if (f()) {
                r1Var = r1.HalfExpanded;
            }
        } else if (!zC) {
            r1Var = r1.Hidden;
        }
        Object objB = b(this, r1Var, BitmapDescriptorFactory.HUE_RED, continuation, 2, null);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }
}
