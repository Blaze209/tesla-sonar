package rj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.AnimationState;
import p019p1.b0;
import p019p1.j1;
import p019p1.z;
import p020r2.p1;
import p020r2.s3;
import p021s1.m;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fBQ\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u0010J'\u0010\u0014\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001b\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001d\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010#\u001a\u00020\u0019*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fH\u0002¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u0005*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R,\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R/\u0010>\u001a\u0004\u0018\u00010\n2\b\u00107\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lrj0/e;", "Ls1/m;", "Lrj0/h;", "layoutInfo", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "springAnimationSpec", "Lkotlin/Function3;", "", "snapIndex", "Lkotlin/Function1;", "maximumFlingDistance", "<init>", "(Lrj0/h;Lp1/z;Lp1/i;Lwn0/q;Lwn0/l;)V", "(Lrj0/h;Lp1/z;Lp1/i;Lwn0/q;)V", "Ls1/u;", "index", "initialVelocity", "l", "(Ls1/u;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrj0/i;", "initialItem", "targetIndex", "", "flingThenSpring", "n", "(Ls1/u;Lrj0/i;IFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "(Ls1/u;Lrj0/i;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/h;", "Lp1/m;", "currentItem", "scrollBy", "p", "(Lp1/h;Lrj0/i;ILwn0/l;)Z", "velocity", "j", "(Lp1/z;FLrj0/i;)Z", IntegerTokenConverter.CONVERTER_KEY, "(FLrj0/i;I)I", "k", "(F)F", "a", "(Ls1/u;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrj0/h;", "b", "Lp1/z;", "c", "Lp1/i;", DateTokenConverter.CONVERTER_KEY, "Lwn0/q;", "e", "Lwn0/l;", "<set-?>", "f", "Lr2/p1;", "m", "()Ljava/lang/Integer;", "r", "(Ljava/lang/Integer;)V", "animationTarget", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h layoutInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p019p1.i<Float> springAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q<h, Integer, Integer, Integer> snapIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<h, Float> maximumFlingDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 animationTarget;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0, 0, 0, 1}, l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 416}, m = "flingToIndex", n = {"this", "$this$flingToIndex", "index", "initialVelocity", "this"}, s = {"L$0", "L$1", "I$0", "F$0", "L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f108470n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f108471o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f108472p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f108473q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f108474r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f108476t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108474r = obj;
            this.f108476t |= Integer.MIN_VALUE;
            return e.this.l(null, 0, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {477}, m = "performDecayFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f108477n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f108478o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f108479p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108481r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108479p = obj;
            this.f108481r |= Integer.MIN_VALUE;
            return e.this.n(null, null, 0, BitmapDescriptorFactory.HUE_RED, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 6, 0})
    static final class c extends u implements l<p019p1.h<Float, p019p1.m>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f108482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p021s1.u f108483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f108484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f108485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f108486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f108487h;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* synthetic */ class a extends p implements l<Float, Float> {
            a(Object obj) {
                super(1, obj, p021s1.u.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float a(float f11) {
                return Float.valueOf(((p021s1.u) this.receiver).a(f11));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return a(f11.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k0 k0Var, p021s1.u uVar, k0 k0Var2, e eVar, boolean z11, int i11) {
            super(1);
            this.f108482c = k0Var;
            this.f108483d = uVar;
            this.f108484e = k0Var2;
            this.f108485f = eVar;
            this.f108486g = z11;
            this.f108487h = i11;
        }

        public final void a(p019p1.h<Float, p019p1.m> animateDecay) {
            s.k(animateDecay, "$this$animateDecay");
            float fFloatValue = animateDecay.e().floatValue() - this.f108482c.f86525a;
            float fA = this.f108483d.a(fFloatValue);
            this.f108482c.f86525a = animateDecay.e().floatValue();
            this.f108484e.f86525a = animateDecay.f().floatValue();
            if (Math.abs(fFloatValue - fA) > 0.5f) {
                animateDecay.a();
            }
            SnapperLayoutItemInfo snapperLayoutItemInfoE = this.f108485f.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                animateDecay.a();
                return;
            }
            if (animateDecay.h() && this.f108486g) {
                if (animateDecay.f().floatValue() > BitmapDescriptorFactory.HUE_RED && snapperLayoutItemInfoE.a() == this.f108487h - 1) {
                    animateDecay.a();
                } else if (animateDecay.f().floatValue() < BitmapDescriptorFactory.HUE_RED && snapperLayoutItemInfoE.a() == this.f108487h) {
                    animateDecay.a();
                }
            }
            if (animateDecay.h() && this.f108485f.p(animateDecay, snapperLayoutItemInfoE, this.f108487h, new a(this.f108483d))) {
                animateDecay.a();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p019p1.h<Float, p019p1.m> hVar) {
            a(hVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", i = {0, 0}, l = {551}, m = "performSpringFling", n = {"this", "velocityLeft"}, s = {"L$0", "L$1"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f108488n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f108489o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f108490p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108492r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108490p = obj;
            this.f108492r |= Integer.MIN_VALUE;
            return e.this.q(null, null, 0, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    /* JADX INFO: renamed from: rj0.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 6, 0})
    static final class C2306e extends u implements l<p019p1.h<Float, p019p1.m>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f108493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p021s1.u f108494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f108495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f108496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f108497g;

        /* JADX INFO: renamed from: rj0.e$e$a */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* synthetic */ class a extends p implements l<Float, Float> {
            a(Object obj) {
                super(1, obj, p021s1.u.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float a(float f11) {
                return Float.valueOf(((p021s1.u) this.receiver).a(f11));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return a(f11.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2306e(k0 k0Var, p021s1.u uVar, k0 k0Var2, e eVar, int i11) {
            super(1);
            this.f108493c = k0Var;
            this.f108494d = uVar;
            this.f108495e = k0Var2;
            this.f108496f = eVar;
            this.f108497g = i11;
        }

        public final void a(p019p1.h<Float, p019p1.m> animateTo) {
            s.k(animateTo, "$this$animateTo");
            float fFloatValue = animateTo.e().floatValue() - this.f108493c.f86525a;
            float fA = this.f108494d.a(fFloatValue);
            this.f108493c.f86525a = animateTo.e().floatValue();
            this.f108495e.f86525a = animateTo.f().floatValue();
            SnapperLayoutItemInfo snapperLayoutItemInfoE = this.f108496f.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                animateTo.a();
            } else if (this.f108496f.p(animateTo, snapperLayoutItemInfoE, this.f108497g, new a(this.f108494d))) {
                animateTo.a();
            } else if (Math.abs(fFloatValue - fA) > 0.5f) {
                animateTo.a();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p019p1.h<Float, p019p1.m> hVar) {
            a(hVar);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(h hVar, z<Float> zVar, p019p1.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> qVar, l<? super h, Float> lVar) {
        this.layoutInfo = hVar;
        this.decayAnimationSpec = zVar;
        this.springAnimationSpec = iVar;
        this.snapIndex = qVar;
        this.maximumFlingDistance = lVar;
        this.animationTarget = s3.d(null, null, 2, null);
    }

    private final int i(float initialVelocity, SnapperLayoutItemInfo currentItem, int targetIndex) {
        if (initialVelocity > BitmapDescriptorFactory.HUE_RED && currentItem.a() >= targetIndex) {
            return this.layoutInfo.d(currentItem.a());
        }
        if (initialVelocity >= BitmapDescriptorFactory.HUE_RED || currentItem.a() > targetIndex - 1) {
            return 0;
        }
        return this.layoutInfo.d(currentItem.a() + 1);
    }

    private final boolean j(z<Float> zVar, float f11, SnapperLayoutItemInfo snapperLayoutItemInfo) {
        if (Math.abs(f11) < 0.5f) {
            return false;
        }
        float fA = b0.a(zVar, BitmapDescriptorFactory.HUE_RED, f11);
        j jVar = j.f108505a;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            return fA <= ((float) this.layoutInfo.d(snapperLayoutItemInfo.a()));
        }
        return fA >= ((float) this.layoutInfo.d(snapperLayoutItemInfo.a() + 1));
    }

    private final float k(float velocity) {
        return ((velocity >= BitmapDescriptorFactory.HUE_RED || this.layoutInfo.b()) && (velocity <= BitmapDescriptorFactory.HUE_RED || this.layoutInfo.a())) ? BitmapDescriptorFactory.HUE_RED : velocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(p021s1.u uVar, int i11, float f11, Continuation<? super Float> continuation) throws Throwable {
        a aVar;
        float fFloatValue;
        a aVar2;
        e eVar;
        p021s1.u uVar2;
        int i12;
        SnapperLayoutItemInfo snapperLayoutItemInfoE;
        e eVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f108476t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f108476t = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar3 = aVar;
        Object objO = aVar3.f108474r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = aVar3.f108476t;
        if (i14 != 0) {
            if (i14 == 1) {
                f11 = aVar3.f108473q;
                i11 = aVar3.f108472p;
                uVar = (p021s1.u) aVar3.f108471o;
                eVar = (e) aVar3.f108470n;
                t.b(objO);
                aVar2 = aVar3;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar2 = (e) aVar3.f108470n;
                t.b(objO);
            }
            fFloatValue = ((Number) objO).floatValue();
            eVar = eVar2;
            return Boxing.boxFloat(eVar.k(fFloatValue));
        }
        t.b(objO);
        SnapperLayoutItemInfo snapperLayoutItemInfoE2 = this.layoutInfo.e();
        if (snapperLayoutItemInfoE2 == null) {
            return Boxing.boxFloat(f11);
        }
        if (snapperLayoutItemInfoE2.a() == i11 && this.layoutInfo.d(snapperLayoutItemInfoE2.a()) == 0) {
            j jVar = j.f108505a;
            return Boxing.boxFloat(k(f11));
        }
        if (!j(this.decayAnimationSpec, f11, snapperLayoutItemInfoE2)) {
            fFloatValue = f11;
            aVar2 = aVar3;
            eVar = this;
            uVar2 = uVar;
            i12 = i11;
            snapperLayoutItemInfoE = eVar.layoutInfo.e();
            if (snapperLayoutItemInfoE == null) {
                return Boxing.boxFloat(f11);
            }
            if (snapperLayoutItemInfoE.a() == i12 || eVar.layoutInfo.d(i12) != 0) {
                aVar2.f108470n = eVar;
                aVar2.f108471o = null;
                aVar2.f108476t = 2;
                objO = eVar.q(uVar2, snapperLayoutItemInfoE, i12, fFloatValue, aVar2);
                if (objO != coroutine_suspended) {
                    eVar2 = eVar;
                    fFloatValue = ((Number) objO).floatValue();
                    eVar = eVar2;
                }
            }
            return Boxing.boxFloat(eVar.k(fFloatValue));
        }
        aVar3.f108470n = this;
        aVar3.f108471o = uVar;
        aVar3.f108472p = i11;
        aVar3.f108473q = f11;
        aVar3.f108476t = 1;
        aVar2 = aVar3;
        objO = o(this, uVar, snapperLayoutItemInfoE2, i11, f11, false, aVar2, 8, null);
        if (objO != coroutine_suspended) {
            eVar = this;
            uVar = uVar;
            i11 = i11;
            f11 = f11;
        }
        return coroutine_suspended;
        fFloatValue = ((Number) objO).floatValue();
        uVar2 = uVar;
        i12 = i11;
        snapperLayoutItemInfoE = eVar.layoutInfo.e();
        if (snapperLayoutItemInfoE == null) {
            return Boxing.boxFloat(f11);
        }
        if (snapperLayoutItemInfoE.a() == i12) {
        }
        aVar2.f108470n = eVar;
        aVar2.f108471o = null;
        aVar2.f108476t = 2;
        objO = eVar.q(uVar2, snapperLayoutItemInfoE, i12, fFloatValue, aVar2);
        if (objO != coroutine_suspended) {
            eVar2 = eVar;
            fFloatValue = ((Number) objO).floatValue();
            eVar = eVar2;
            return Boxing.boxFloat(eVar.k(fFloatValue));
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object n(p021s1.u uVar, SnapperLayoutItemInfo snapperLayoutItemInfo, int i11, float f11, boolean z11, Continuation<? super Float> continuation) throws Throwable {
        b bVar;
        Integer num;
        k0 k0Var;
        e eVar;
        e eVar2 = this;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f108481r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f108481r = i12 - Integer.MIN_VALUE;
            } else {
                bVar = eVar2.new b(continuation);
            }
        } else {
            bVar = eVar2.new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f108479p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar2.f108481r;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) bVar2.f108478o;
            e eVar3 = (e) bVar2.f108477n;
            try {
                t.b(obj);
                num = null;
                eVar = eVar3;
                eVar.r(num);
                j jVar = j.f108505a;
                return Boxing.boxFloat(k0Var.f86525a);
            } catch (Throwable th2) {
                th = th2;
                num = null;
                eVar2 = eVar3;
                eVar2.r(num);
                throw th;
            }
        }
        t.b(obj);
        if (snapperLayoutItemInfo.a() == i11 && eVar2.layoutInfo.d(snapperLayoutItemInfo.a()) == 0) {
            j jVar2 = j.f108505a;
            return Boxing.boxFloat(eVar2.k(f11));
        }
        j jVar3 = j.f108505a;
        k0 k0Var2 = new k0();
        k0Var2.f86525a = f11;
        k0 k0Var3 = new k0();
        boolean z12 = z11 && Math.abs(i11 - snapperLayoutItemInfo.a()) >= 2;
        try {
            eVar2.r(Boxing.boxInt(i11));
            AnimationState animationStateC = p019p1.l.c(BitmapDescriptorFactory.HUE_RED, f11, 0L, 0L, false, 28, null);
            z<Float> zVar = eVar2.decayAnimationSpec;
            num = null;
            try {
                c cVar = new c(k0Var3, uVar, k0Var2, eVar2, z12, i11);
                try {
                    bVar2.f108477n = eVar2;
                    bVar2.f108478o = k0Var2;
                    bVar2.f108481r = 1;
                    if (j1.h(animationStateC, zVar, false, cVar, bVar2, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    k0Var = k0Var2;
                    eVar = eVar2;
                    eVar.r(num);
                    j jVar4 = j.f108505a;
                    return Boxing.boxFloat(k0Var.f86525a);
                } catch (Throwable th3) {
                    th = th3;
                    eVar2 = eVar2;
                    eVar2.r(num);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            num = null;
        }
    }

    static /* synthetic */ Object o(e eVar, p021s1.u uVar, SnapperLayoutItemInfo snapperLayoutItemInfo, int i11, float f11, boolean z11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        return eVar.n(uVar, snapperLayoutItemInfo, i11, f11, z11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(p019p1.h<Float, p019p1.m> hVar, SnapperLayoutItemInfo snapperLayoutItemInfo, int i11, l<? super Float, Float> lVar) {
        j jVar = j.f108505a;
        int i12 = i(hVar.f().floatValue(), snapperLayoutItemInfo, i11);
        if (i12 == 0) {
            return false;
        }
        lVar.invoke(Float.valueOf(i12));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object q(p021s1.u uVar, SnapperLayoutItemInfo snapperLayoutItemInfo, int i11, float f11, Continuation<? super Float> continuation) throws Throwable {
        d dVar;
        k0 k0Var;
        e eVar;
        e eVar2 = this;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f108492r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f108492r = i12 - Integer.MIN_VALUE;
            } else {
                dVar = eVar2.new d(continuation);
            }
        } else {
            dVar = eVar2.new d(continuation);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f108490p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = dVar2.f108492r;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) dVar2.f108489o;
            e eVar3 = (e) dVar2.f108488n;
            try {
                t.b(obj);
                eVar = eVar3;
                eVar.r(null);
                j jVar = j.f108505a;
                return Boxing.boxFloat(k0Var.f86525a);
            } catch (Throwable th2) {
                th = th2;
                eVar2 = eVar3;
                eVar2.r(null);
                throw th;
            }
        }
        t.b(obj);
        j jVar2 = j.f108505a;
        k0 k0Var2 = new k0();
        int iA = snapperLayoutItemInfo.a();
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if ((i11 > iA && f11 > BitmapDescriptorFactory.HUE_RED) || (i11 <= snapperLayoutItemInfo.a() && f11 < BitmapDescriptorFactory.HUE_RED)) {
            f12 = f11;
        }
        k0Var2.f86525a = f12;
        k0 k0Var3 = new k0();
        try {
            eVar2.r(Boxing.boxInt(i11));
            AnimationState animationStateC = p019p1.l.c(k0Var3.f86525a, k0Var2.f86525a, 0L, 0L, false, 28, null);
            Float fBoxFloat = Boxing.boxFloat(eVar2.layoutInfo.d(i11));
            p019p1.i<Float> iVar = eVar2.springAnimationSpec;
            C2306e c2306e = new C2306e(k0Var3, uVar, k0Var2, eVar2, i11);
            k0Var = k0Var2;
            try {
                dVar2.f108488n = eVar2;
                dVar2.f108489o = k0Var;
                dVar2.f108492r = 1;
                if (j1.j(animationStateC, fBoxFloat, iVar, false, c2306e, dVar2, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar = eVar2;
                eVar.r(null);
                j jVar3 = j.f108505a;
                return Boxing.boxFloat(k0Var.f86525a);
            } catch (Throwable th3) {
                th = th3;
                eVar2 = eVar2;
                eVar2.r(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void r(Integer num) {
        this.animationTarget.setValue(num);
    }

    @Override // p021s1.m
    public Object a(p021s1.u uVar, float f11, Continuation<? super Float> continuation) {
        if (!this.layoutInfo.b() || !this.layoutInfo.a()) {
            return Boxing.boxFloat(f11);
        }
        j jVar = j.f108505a;
        float fFloatValue = this.maximumFlingDistance.invoke(this.layoutInfo).floatValue();
        if (fFloatValue <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
        }
        SnapperLayoutItemInfo snapperLayoutItemInfoE = this.layoutInfo.e();
        if (snapperLayoutItemInfoE == null) {
            return Boxing.boxFloat(f11);
        }
        int iIntValue = this.snapIndex.invoke(this.layoutInfo, Boxing.boxInt(f11 < BitmapDescriptorFactory.HUE_RED ? snapperLayoutItemInfoE.a() + 1 : snapperLayoutItemInfoE.a()), Boxing.boxInt(this.layoutInfo.c(f11, this.decayAnimationSpec, fFloatValue))).intValue();
        if (iIntValue < 0 || iIntValue >= this.layoutInfo.h()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return l(uVar, iIntValue, f11, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer m() {
        return (Integer) this.animationTarget.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(h layoutInfo, z<Float> decayAnimationSpec, p019p1.i<Float> springAnimationSpec, q<? super h, ? super Integer, ? super Integer, Integer> snapIndex) {
        this(layoutInfo, decayAnimationSpec, springAnimationSpec, snapIndex, f.f108498a.a());
        s.k(layoutInfo, "layoutInfo");
        s.k(decayAnimationSpec, "decayAnimationSpec");
        s.k(springAnimationSpec, "springAnimationSpec");
        s.k(snapIndex, "snapIndex");
    }
}
