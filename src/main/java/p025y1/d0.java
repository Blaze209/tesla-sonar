package p025y1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScopeKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.k0;
import p019p1.i;
import p019p1.j1;
import p020r2.l;
import p020r2.o;
import p021s1.p;
import p021s1.u;
import t1.j;
import w4.h;
import w4.r;
import z3.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001)\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aL\u0010\u001c\u001a\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u001a\u0010(\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Ly1/c0;", "k", "(IFLwn0/a;Lr2/l;II)Ly1/c0;", "Ljn0/h0;", "e", "(Ly1/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Ly1/n;", "", "g", "(Ly1/n;I)J", "Ly1/u;", "h", "(Ly1/u;I)J", "Lx1/h;", "targetPage", "targetPageOffsetToSnappedPosition", "Lp1/i;", "animationSpec", "Lkotlin/Function2;", "Ls1/u;", "updateTargetPage", DateTokenConverter.CONVERTER_KEY, "(Lx1/h;IFLp1/i;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw4/h;", "a", Gender.FEMALE, IntegerTokenConverter.CONVERTER_KEY, "()F", "DefaultPositionThreshold", "b", "Ly1/u;", "j", "()Ly1/u;", "EmptyLayoutInfo", "y1/d0$b", "c", "Ly1/d0$b;", "UnitDensity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f124487a = h.g(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u f124488b = new u(v.m(), 0, 0, 0, p.Horizontal, 0, 0, false, 0, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, j.a.f112078a, new a(), false, null, null, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), 393216, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f124489c = new b();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"y1/d0$b", "Lw4/d;", "", "a", Gender.FEMALE, "getDensity", "()F", "density", "b", "M1", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements w4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float density = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float fontScale = 1.0f;

        b() {
        }

        @Override // w4.l
        /* JADX INFO: renamed from: M1, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // w4.d
        public float getDensity() {
            return this.density;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2", f = "PagerState.kt", i = {}, l = {953}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124495n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f124496o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.p<u, Integer, h0> f124497p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f124498q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p024x1.h f124499r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f124500s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ i<Float> f124501t;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.p<Float, Float, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f124502c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u f124503d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, u uVar) {
                super(2);
                this.f124502c = k0Var;
                this.f124503d = uVar;
            }

            public final void a(float f11, float f12) {
                this.f124502c.f86525a += this.f124503d.a(f11 - this.f124502c.f86525a);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Float f11, Float f12) {
                a(f11.floatValue(), f12.floatValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.p<? super u, ? super Integer, h0> pVar, int i11, p024x1.h hVar, float f11, i<Float> iVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f124497p = pVar;
            this.f124498q = i11;
            this.f124499r = hVar;
            this.f124500s = f11;
            this.f124501t = iVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((c) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f124497p, this.f124498q, this.f124499r, this.f124500s, this.f124501t, continuation);
            cVar.f124496o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124495n;
            if (i11 == 0) {
                t.b(obj);
                u uVar = (u) this.f124496o;
                this.f124497p.invoke(uVar, Boxing.boxInt(this.f124498q));
                boolean z11 = this.f124498q > this.f124499r.d();
                int iE = (this.f124499r.e() - this.f124499r.d()) + 1;
                if (((z11 && this.f124498q > this.f124499r.e()) || (!z11 && this.f124498q < this.f124499r.d())) && Math.abs(this.f124498q - this.f124499r.d()) >= 3) {
                    this.f124499r.b(uVar, z11 ? n.f(this.f124498q - iE, this.f124499r.d()) : n.j(this.f124498q + iE, this.f124499r.d()), 0);
                }
                float f11 = this.f124499r.f(this.f124498q) + this.f124500s;
                k0 k0Var = new k0();
                i<Float> iVar = this.f124501t;
                a aVar = new a(k0Var, uVar);
                this.f124495n = 1;
                if (j1.e(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, iVar, aVar, this, 4, null) == coroutine_suspended) {
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
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly1/b;", "b", "()Ly1/b;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<p025y1.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f124504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f124505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<Integer> f124506e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, float f11, wn0.a<Integer> aVar) {
            super(0);
            this.f124504c = i11;
            this.f124505d = f11;
            this.f124506e = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p025y1.b invoke() {
            return new p025y1.b(this.f124504c, this.f124505d, this.f124506e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(p024x1.h hVar, int i11, float f11, i<Float> iVar, wn0.p<? super u, ? super Integer, h0> pVar, Continuation<? super h0> continuation) {
        Object objC = hVar.c(new c(pVar, i11, hVar, f11, iVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
    }

    public static final Object e(c0 c0Var, Continuation<? super h0> continuation) {
        if (c0Var.v() + 1 >= c0Var.F()) {
            return h0.f84049a;
        }
        Object objN = c0.n(c0Var, c0Var.v() + 1, BitmapDescriptorFactory.HUE_RED, null, continuation, 6, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : h0.f84049a;
    }

    public static final Object f(c0 c0Var, Continuation<? super h0> continuation) {
        if (c0Var.v() - 1 < 0) {
            return h0.f84049a;
        }
        Object objN = c0.n(c0Var, c0Var.v() - 1, BitmapDescriptorFactory.HUE_RED, null, continuation, 6, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : h0.f84049a;
    }

    public static final long g(n nVar, int i11) {
        long jM = (((long) i11) * ((long) (nVar.getPageSpacing() + nVar.getPageSize()))) + ((long) nVar.f()) + ((long) nVar.getAfterContentPadding());
        int iG = nVar.getOrientation() == p.Horizontal ? r.g(nVar.a()) : r.f(nVar.a());
        return n.g(jM - ((long) (iG - n.n(nVar.getSnapPosition().a(iG, nVar.getPageSize(), nVar.f(), nVar.getAfterContentPadding(), i11 - 1, i11), 0, iG))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(u uVar, int i11) {
        int iG = uVar.getOrientation() == p.Horizontal ? r.g(uVar.a()) : r.f(uVar.a());
        return n.n(uVar.getSnapPosition().a(iG, uVar.getPageSize(), uVar.f(), uVar.getAfterContentPadding(), 0, i11), 0, iG);
    }

    public static final float i() {
        return f124487a;
    }

    public static final u j() {
        return f124488b;
    }

    public static final c0 k(int i11, float f11, wn0.a<Integer> aVar, l lVar, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        if (o.J()) {
            o.S(-1210768637, i12, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)");
        }
        Object[] objArr = new Object[0];
        a3.j<p025y1.b, ?> jVarA = p025y1.b.INSTANCE.a();
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && lVar.r(i11)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && lVar.q(f11)) || (i12 & 48) == 32) | ((((i12 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.n(aVar)) || (i12 & KyberEngine.KyberPolyBytes) == 256);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = new d(i11, f11, aVar);
            lVar.B(objI);
        }
        p025y1.b bVar = (p025y1.b) a3.b.c(objArr, jVarA, null, (wn0.a) objI, lVar, 0, 4);
        bVar.n0().setValue(aVar);
        if (o.J()) {
            o.R();
        }
        return bVar;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"y1/d0$a", "Lz3/j0;", "Ljn0/h0;", "k", "()V", "", "a", "I", "getWidth", "()I", Snapshot.WIDTH, "b", "getHeight", Snapshot.HEIGHT, "", "Lz3/a;", "c", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<z3.a, Integer> alignmentLines = v0.i();

        a() {
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public int getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() {
            return this.height;
        }

        @Override // z3.j0
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public int getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() {
            return this.width;
        }

        @Override // z3.j0
        public Map<z3.a, Integer> q() {
            return this.alignmentLines;
        }

        @Override // z3.j0
        public void k() {
        }
    }
}
