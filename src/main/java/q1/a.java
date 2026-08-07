package q1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.n3;
import p020r2.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J6\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000eH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010\rR\u001e\u0010/\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u000b038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010?\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b>\u0010\r\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u001c\u0010D\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\b9\u0010KR\u0014\u0010M\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lq1/a;", "Lq1/n0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lq1/l0;", "overscrollConfig", "<init>", "(Landroid/content/Context;Lq1/l0;)V", "", "q", "()Z", "Ljn0/h0;", "h", "()V", "Lj3/g;", "delta", "p", "(J)Z", "scroll", "", "o", "(J)F", "l", "m", "n", "Lu3/e;", "source", "Lkotlin/Function1;", "performScroll", "a", "(JILwn0/l;)J", "Lw4/y;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "b", "(JLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3/m;", "size", "r", "(J)V", IntegerTokenConverter.CONVERTER_KEY, "()J", "k", "Lj3/g;", "pointerPosition", "Lq1/s;", "Lq1/s;", "edgeEffectWrapper", "Lr2/p1;", "c", "Lr2/p1;", "j", "()Lr2/p1;", "redrawSignal", DateTokenConverter.CONVERTER_KEY, "Z", "getInvalidationEnabled$foundation_release", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", "e", "scrollCycleInProgress", "f", "J", "containerSize", "Lv3/w;", "g", "Lv3/w;", "pointerId", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "effectModifier", "isInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private j3.g pointerPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s edgeEffectWrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1<jn0.h0> redrawSignal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long containerSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private v3.w pointerId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d effectModifier;

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {533, 559}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
    static final class C2205a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f104186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f104187o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f104188p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f104190r;

        C2205a(Continuation<? super C2205a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f104188p = obj;
            this.f104190r |= Integer.MIN_VALUE;
            return a.this.b(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", i = {}, l = {638}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<v3.f0, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f104191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f104192o;

        /* JADX INFO: renamed from: q1.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {639, 643}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
        static final class C2206a extends RestrictedSuspendLambda implements wn0.p<v3.c, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f104194n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f104195o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ a f104196p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2206a(a aVar, Continuation<? super C2206a> continuation) {
                super(2, continuation);
                this.f104196p = aVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v3.c cVar, Continuation<? super jn0.h0> continuation) {
                return ((C2206a) create(cVar, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C2206a c2206a = new C2206a(this.f104196p, continuation);
                c2206a.f104195o = obj;
                return c2206a;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x009b  */
            /* JADX WARN: Code duplicated, block: B:29:0x00b1 A[LOOP:1: B:25:0x0099->B:29:0x00b1, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[EDGE_INSN: B:44:0x00b5->B:31:0x00b5 BREAK  A[LOOP:1: B:25:0x0099->B:29:0x00b1], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:18:0x0069). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q1.a.b.C2206a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f104192o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f104191n;
            if (i11 == 0) {
                jn0.t.b(obj);
                v3.f0 f0Var = (v3.f0) this.f104192o;
                C2206a c2206a = new C2206a(a.this, null);
                this.f104191n = 1;
                if (p021s1.n.d(f0Var, c2206a, this) == coroutine_suspended) {
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
        public final Object invoke(v3.f0 f0Var, Continuation<? super jn0.h0> continuation) {
            return ((b) create(f0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {
        public c() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("overscroll");
            q1Var.c(a.this);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.l<q1, jn0.h0> {
        public d() {
            super(1);
        }

        public final void a(q1 q1Var) {
            q1Var.b("overscroll");
            q1Var.c(a.this);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(q1 q1Var) {
            a(q1Var);
            return jn0.h0.f84049a;
        }
    }

    public a(Context context, OverscrollConfiguration overscrollConfiguration) {
        androidx.compose.ui.d oVar;
        s sVar = new s(context, r1.k(overscrollConfiguration.getGlowColor()));
        this.edgeEffectWrapper = sVar;
        jn0.h0 h0Var = jn0.h0.f84049a;
        this.redrawSignal = n3.h(h0Var, n3.j());
        this.invalidationEnabled = true;
        this.containerSize = j3.m.INSTANCE.b();
        androidx.compose.ui.d dVarD = v3.o0.d(androidx.compose.ui.d.INSTANCE, h0Var, new b(null));
        if (Build.VERSION.SDK_INT >= 31) {
            oVar = new q(this, sVar, o1.b() ? new c() : o1.a());
        } else {
            oVar = new o(this, sVar, overscrollConfiguration, o1.b() ? new d() : o1.a());
        }
        this.effectModifier = dVarD.g(oVar);
    }

    private final void h() {
        boolean zIsFinished;
        s sVar = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = sVar.topEffect;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = sVar.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = sVar.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = sVar.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            k();
        }
    }

    private final float l(long scroll) {
        float fM = j3.g.m(i());
        float fN = j3.g.n(scroll) / j3.m.i(this.containerSize);
        EdgeEffect edgeEffectF = this.edgeEffectWrapper.f();
        r rVar = r.f104310a;
        return rVar.b(edgeEffectF) == BitmapDescriptorFactory.HUE_RED ? (-rVar.d(edgeEffectF, -fN, 1 - fM)) * j3.m.i(this.containerSize) : j3.g.n(scroll);
    }

    private final float m(long scroll) {
        float fN = j3.g.n(i());
        float fM = j3.g.m(scroll) / j3.m.k(this.containerSize);
        EdgeEffect edgeEffectH = this.edgeEffectWrapper.h();
        r rVar = r.f104310a;
        return rVar.b(edgeEffectH) == BitmapDescriptorFactory.HUE_RED ? rVar.d(edgeEffectH, fM, 1 - fN) * j3.m.k(this.containerSize) : j3.g.m(scroll);
    }

    private final float n(long scroll) {
        float fN = j3.g.n(i());
        float fM = j3.g.m(scroll) / j3.m.k(this.containerSize);
        EdgeEffect edgeEffectJ = this.edgeEffectWrapper.j();
        r rVar = r.f104310a;
        return rVar.b(edgeEffectJ) == BitmapDescriptorFactory.HUE_RED ? (-rVar.d(edgeEffectJ, -fM, fN)) * j3.m.k(this.containerSize) : j3.g.m(scroll);
    }

    private final float o(long scroll) {
        float fM = j3.g.m(i());
        float fN = j3.g.n(scroll) / j3.m.i(this.containerSize);
        EdgeEffect edgeEffectL = this.edgeEffectWrapper.l();
        r rVar = r.f104310a;
        return rVar.b(edgeEffectL) == BitmapDescriptorFactory.HUE_RED ? rVar.d(edgeEffectL, fN, fM) * j3.m.i(this.containerSize) : j3.g.n(scroll);
    }

    private final boolean p(long delta) {
        boolean z11;
        if (!this.edgeEffectWrapper.r() || j3.g.m(delta) >= BitmapDescriptorFactory.HUE_RED) {
            z11 = false;
        } else {
            r.f104310a.e(this.edgeEffectWrapper.h(), j3.g.m(delta));
            z11 = !this.edgeEffectWrapper.r();
        }
        if (this.edgeEffectWrapper.u() && j3.g.m(delta) > BitmapDescriptorFactory.HUE_RED) {
            r.f104310a.e(this.edgeEffectWrapper.j(), j3.g.m(delta));
            z11 = z11 || !this.edgeEffectWrapper.u();
        }
        if (this.edgeEffectWrapper.y() && j3.g.n(delta) < BitmapDescriptorFactory.HUE_RED) {
            r.f104310a.e(this.edgeEffectWrapper.l(), j3.g.n(delta));
            z11 = z11 || !this.edgeEffectWrapper.y();
        }
        if (!this.edgeEffectWrapper.o() || j3.g.n(delta) <= BitmapDescriptorFactory.HUE_RED) {
            return z11;
        }
        r.f104310a.e(this.edgeEffectWrapper.f(), j3.g.n(delta));
        return z11 || !this.edgeEffectWrapper.o();
    }

    private final boolean q() {
        boolean z11;
        if (this.edgeEffectWrapper.t()) {
            m(j3.g.INSTANCE.c());
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.edgeEffectWrapper.w()) {
            n(j3.g.INSTANCE.c());
            z11 = true;
        }
        if (this.edgeEffectWrapper.A()) {
            o(j3.g.INSTANCE.c());
            z11 = true;
        }
        if (!this.edgeEffectWrapper.q()) {
            return z11;
        }
        l(j3.g.INSTANCE.c());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[ADDED_TO_REGION] */
    @Override // q1.n0
    public long a(long delta, int source, wn0.l<? super j3.g, j3.g> performScroll) {
        float fL;
        boolean z11;
        boolean z12;
        if (j3.m.m(this.containerSize)) {
            return performScroll.invoke(j3.g.d(delta)).getPackedValue();
        }
        boolean z13 = true;
        if (!this.scrollCycleInProgress) {
            q();
            this.scrollCycleInProgress = true;
        }
        float fN = j3.g.n(delta);
        float fN2 = BitmapDescriptorFactory.HUE_RED;
        if (fN == BitmapDescriptorFactory.HUE_RED) {
            fL = 0.0f;
        } else if (this.edgeEffectWrapper.A()) {
            fL = o(delta);
            if (!this.edgeEffectWrapper.A()) {
                this.edgeEffectWrapper.l().onRelease();
            }
        } else if (this.edgeEffectWrapper.q()) {
            fL = l(delta);
            if (!this.edgeEffectWrapper.q()) {
                this.edgeEffectWrapper.f().onRelease();
            }
        } else {
            fL = 0.0f;
        }
        if (j3.g.m(delta) != BitmapDescriptorFactory.HUE_RED) {
            if (this.edgeEffectWrapper.t()) {
                fN2 = m(delta);
                if (!this.edgeEffectWrapper.t()) {
                    this.edgeEffectWrapper.h().onRelease();
                }
            } else if (this.edgeEffectWrapper.w()) {
                fN2 = n(delta);
                if (!this.edgeEffectWrapper.w()) {
                    this.edgeEffectWrapper.j().onRelease();
                }
            }
        }
        long jA = j3.h.a(fN2, fL);
        if (!j3.g.j(jA, j3.g.INSTANCE.c())) {
            k();
        }
        long jQ = j3.g.q(delta, jA);
        long packedValue = performScroll.invoke(j3.g.d(jQ)).getPackedValue();
        long jQ2 = j3.g.q(jQ, packedValue);
        boolean z14 = false;
        if (u3.e.e(source, u3.e.INSTANCE.c())) {
            if (j3.g.m(jQ2) > 0.5f) {
                m(jQ2);
            } else {
                if (j3.g.m(jQ2) < -0.5f) {
                    n(jQ2);
                } else {
                    z11 = false;
                }
                if (j3.g.n(jQ2) > 0.5f) {
                    o(jQ2);
                } else {
                    if (j3.g.n(jQ2) < -0.5f) {
                        l(jQ2);
                    } else {
                        z12 = false;
                    }
                    if (!z11 && !z12) {
                        z13 = false;
                    }
                    z14 = z13;
                }
                z12 = true;
                if (!z11) {
                    z13 = false;
                }
                z14 = z13;
            }
            z11 = true;
            if (j3.g.n(jQ2) > 0.5f) {
                o(jQ2);
            } else {
                if (j3.g.n(jQ2) < -0.5f) {
                    l(jQ2);
                } else {
                    z12 = false;
                }
                if (!z11) {
                    z13 = false;
                }
                z14 = z13;
            }
            z12 = true;
            if (!z11) {
                z13 = false;
            }
            z14 = z13;
        }
        if (p(delta) || z14) {
            k();
        }
        return j3.g.r(jA, packedValue);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r13.invoke(r11, r0) == r1) goto L50;
     */
    @Override // q1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r11, wn0.p<? super w4.y, ? super p013kotlin.coroutines.Continuation<? super w4.y>, ? extends java.lang.Object> r13, p013kotlin.coroutines.Continuation<? super jn0.h0> r14) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a.b(long, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // q1.n0
    public boolean c() {
        s sVar = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = sVar.topEffect;
        if (edgeEffect != null && r.f104310a.b(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect2 = sVar.bottomEffect;
        if (edgeEffect2 != null && r.f104310a.b(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect3 = sVar.leftEffect;
        if (edgeEffect3 != null && r.f104310a.b(edgeEffect3) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect4 = sVar.rightEffect;
        return (edgeEffect4 == null || r.f104310a.b(edgeEffect4) == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    @Override // q1.n0
    /* JADX INFO: renamed from: d, reason: from getter */
    public androidx.compose.ui.d getEffectModifier() {
        return this.effectModifier;
    }

    public final long i() {
        j3.g gVar = this.pointerPosition;
        long packedValue = gVar != null ? gVar.getPackedValue() : j3.n.b(this.containerSize);
        return j3.h.a(j3.g.m(packedValue) / j3.m.k(this.containerSize), j3.g.n(packedValue) / j3.m.i(this.containerSize));
    }

    public final p1<jn0.h0> j() {
        return this.redrawSignal;
    }

    public final void k() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(jn0.h0.f84049a);
        }
    }

    public final void r(long size) {
        boolean zH = j3.m.h(this.containerSize, j3.m.INSTANCE.b());
        boolean zH2 = j3.m.h(size, this.containerSize);
        this.containerSize = size;
        if (!zH2) {
            this.edgeEffectWrapper.B(w4.s.a(yn0.a.d(j3.m.k(size)), yn0.a.d(j3.m.i(size))));
        }
        if (zH || zH2) {
            return;
        }
        k();
        h();
    }
}
