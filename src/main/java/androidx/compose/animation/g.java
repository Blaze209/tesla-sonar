package androidx.compose.animation;

import androidx.compose.animation.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import k3.o4;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p015o1.ChangeSize;
import p015o1.Fade;
import p015o1.Scale;
import p015o1.Slide;
import p015o1.TransitionData;
import p019p1.e1;
import p019p1.f2;
import p019p1.g0;
import p019p1.l1;
import p019p1.m1;
import p019p1.p1;
import p019p1.r1;
import p020r2.s3;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0017\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aI\u0010\"\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\"\u0010#\u001aI\u0010'\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001a\u001a\u00020$2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\fH\u0007¢\u0006\u0004\b'\u0010(\u001aI\u0010*\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010 \u001a\u00020$2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\fH\u0007¢\u0006\u0004\b*\u0010+\u001a5\u0010-\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\fH\u0007¢\u0006\u0004\b-\u0010\u0010\u001a5\u0010/\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\fH\u0007¢\u0006\u0004\b/\u0010\u0010\u001a5\u00101\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\fH\u0007¢\u0006\u0004\b1\u0010\u0013\u001a5\u00103\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\fH\u0007¢\u0006\u0004\b3\u0010\u0013\u001a\u0013\u00104\u001a\u00020\u0019*\u00020$H\u0002¢\u0006\u0004\b4\u00105\u001aA\u0010?\u001a\u00020>*\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@\u001a!\u0010A\u001a\u00020\u0004*\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\u0004H\u0001¢\u0006\u0004\bA\u0010B\u001a!\u0010C\u001a\u00020\b*\b\u0012\u0004\u0012\u000207062\u0006\u00109\u001a\u00020\bH\u0001¢\u0006\u0004\bC\u0010D\u001a1\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0003¢\u0006\u0004\bF\u0010G\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\"\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00010M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\"\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010O\"\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\r0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010O\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\u000e\u0010U\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010V\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lp1/g0;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/i;", "l", "(Lp1/g0;F)Landroidx/compose/animation/i;", "targetAlpha", "Landroidx/compose/animation/k;", "n", "(Lp1/g0;F)Landroidx/compose/animation/k;", "Lw4/n;", "Lkotlin/Function1;", "Lw4/r;", "initialOffset", "v", "(Lp1/g0;Lwn0/l;)Landroidx/compose/animation/i;", "targetOffset", "z", "(Lp1/g0;Lwn0/l;)Landroidx/compose/animation/k;", "initialScale", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "p", "(Lp1/g0;FJ)Landroidx/compose/animation/i;", "Ld3/c;", "expandFrom", "", "clip", "initialSize", "h", "(Lp1/g0;Ld3/c;ZLwn0/l;)Landroidx/compose/animation/i;", "shrinkTowards", "targetSize", "r", "(Lp1/g0;Ld3/c;ZLwn0/l;)Landroidx/compose/animation/k;", "Ld3/c$c;", "", "initialHeight", "j", "(Lp1/g0;Ld3/c$c;ZLwn0/l;)Landroidx/compose/animation/i;", Snapshot.TARGET_HEIGHT, "t", "(Lp1/g0;Ld3/c$c;ZLwn0/l;)Landroidx/compose/animation/k;", "initialOffsetX", "w", "initialOffsetY", "x", "targetOffsetX", "A", "targetOffsetY", "B", "C", "(Ld3/c$c;)Ld3/c;", "Lp1/l1;", "Lo1/k;", "enter", "exit", "Lkotlin/Function0;", "isEnabled", "", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/d;", "g", "(Lp1/l1;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lwn0/a;Ljava/lang/String;Lr2/l;II)Landroidx/compose/ui/d;", "D", "(Lp1/l1;Landroidx/compose/animation/i;Lr2/l;I)Landroidx/compose/animation/i;", "G", "(Lp1/l1;Landroidx/compose/animation/k;Lr2/l;I)Landroidx/compose/animation/k;", "Lo1/p;", "e", "(Lp1/l1;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lr2/l;I)Lo1/p;", "Lp1/p1;", "Lp1/n;", "a", "Lp1/p1;", "TransformOriginVectorConverter", "Lp1/e1;", "b", "Lp1/e1;", "DefaultAlphaAndScaleSpring", "c", "DefaultOffsetAnimationSpec", DateTokenConverter.CONVERTER_KEY, "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p1<androidx.compose.ui.graphics.f, p019p1.n> f4055a = r1.a(a.f4059c, b.f4060c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e1<Float> f4056b = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e1<w4.n> f4057c = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.n.b(f2.e(w4.n.INSTANCE)), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e1<w4.r> f4058d = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.r.b(f2.f(w4.r.INSTANCE)), 1, null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/f;", "it", "Lp1/n;", "a", "(J)Lp1/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<androidx.compose.ui.graphics.f, p019p1.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4059c = new a();

        a() {
            super(1);
        }

        public final p019p1.n a(long j11) {
            return new p019p1.n(androidx.compose.ui.graphics.f.f(j11), androidx.compose.ui.graphics.f.g(j11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ p019p1.n invoke(androidx.compose.ui.graphics.f fVar) {
            return a(fVar.getPackedValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n;", "it", "Landroidx/compose/ui/graphics/f;", "a", "(Lp1/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<p019p1.n, androidx.compose.ui.graphics.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f4060c = new b();

        b() {
            super(1);
        }

        public final long a(p019p1.n nVar) {
            return o4.a(nVar.getV1(), nVar.getV2());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.f invoke(p019p1.n nVar) {
            return androidx.compose.ui.graphics.f.b(a(nVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lo1/k;", "Lp1/g0;", "", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<l1.b<p015o1.k>, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f4061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f4062d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f4061c = iVar;
            this.f4062d = kVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0<Float> invoke(l1.b<p015o1.k> bVar) {
            g0<Float> g0VarB;
            g0<Float> g0VarB2;
            p015o1.k kVar = p015o1.k.PreEnter;
            p015o1.k kVar2 = p015o1.k.Visible;
            if (bVar.b(kVar, kVar2)) {
                Fade fade = this.f4061c.getData().getFade();
                return (fade == null || (g0VarB2 = fade.b()) == null) ? g.f4056b : g0VarB2;
            }
            if (!bVar.b(kVar2, p015o1.k.PostExit)) {
                return g.f4056b;
            }
            Fade fade2 = this.f4062d.getData().getFade();
            return (fade2 == null || (g0VarB = fade2.b()) == null) ? g.f4056b : g0VarB;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/k;", "it", "", "a", "(Lo1/k;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<p015o1.k, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f4063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f4064d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4065a;

            static {
                int[] iArr = new int[p015o1.k.values().length];
                try {
                    iArr[p015o1.k.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p015o1.k.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p015o1.k.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4065a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f4063c = iVar;
            this.f4064d = kVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(p015o1.k kVar) {
            int i11 = a.f4065a[kVar.ordinal()];
            float alpha = 1.0f;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fade fade = this.f4063c.getData().getFade();
                    if (fade != null) {
                        alpha = fade.getAlpha();
                    }
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fade2 = this.f4064d.getData().getFade();
                    if (fade2 != null) {
                        alpha = fade2.getAlpha();
                    }
                }
            }
            return Float.valueOf(alpha);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<Float> f4066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<Float> f4067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y3<androidx.compose.ui.graphics.f> f4068e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(y3<Float> y3Var, y3<Float> y3Var2, y3<androidx.compose.ui.graphics.f> y3Var3) {
            super(1);
            this.f4066c = y3Var;
            this.f4067d = y3Var2;
            this.f4068e = y3Var3;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            y3<Float> y3Var = this.f4066c;
            cVar.a(y3Var != null ? y3Var.getValue().floatValue() : 1.0f);
            y3<Float> y3Var2 = this.f4067d;
            cVar.k(y3Var2 != null ? y3Var2.getValue().floatValue() : 1.0f);
            y3<Float> y3Var3 = this.f4067d;
            cVar.l(y3Var3 != null ? y3Var3.getValue().floatValue() : 1.0f);
            y3<androidx.compose.ui.graphics.f> y3Var4 = this.f4068e;
            cVar.k0(y3Var4 != null ? y3Var4.getValue().getPackedValue() : androidx.compose.ui.graphics.f.INSTANCE.a());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lo1/k;", "Lp1/g0;", "", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<l1.b<p015o1.k>, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f4069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f4070d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f4069c = iVar;
            this.f4070d = kVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0<Float> invoke(l1.b<p015o1.k> bVar) {
            g0<Float> g0VarA;
            g0<Float> g0VarA2;
            p015o1.k kVar = p015o1.k.PreEnter;
            p015o1.k kVar2 = p015o1.k.Visible;
            if (bVar.b(kVar, kVar2)) {
                Scale scale = this.f4069c.getData().getScale();
                return (scale == null || (g0VarA2 = scale.a()) == null) ? g.f4056b : g0VarA2;
            }
            if (!bVar.b(kVar2, p015o1.k.PostExit)) {
                return g.f4056b;
            }
            Scale scale2 = this.f4070d.getData().getScale();
            return (scale2 == null || (g0VarA = scale2.a()) == null) ? g.f4056b : g0VarA;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/k;", "it", "", "a", "(Lo1/k;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class C0083g extends p013kotlin.jvm.internal.u implements wn0.l<p015o1.k, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f4071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f4072d;

        /* JADX INFO: renamed from: androidx.compose.animation.g$g$a */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4073a;

            static {
                int[] iArr = new int[p015o1.k.values().length];
                try {
                    iArr[p015o1.k.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p015o1.k.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p015o1.k.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4073a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0083g(androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f4071c = iVar;
            this.f4072d = kVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(p015o1.k kVar) {
            int i11 = a.f4073a[kVar.ordinal()];
            float scale = 1.0f;
            if (i11 != 1) {
                if (i11 == 2) {
                    Scale scale2 = this.f4071c.getData().getScale();
                    if (scale2 != null) {
                        scale = scale2.getScale();
                    }
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale3 = this.f4072d.getData().getScale();
                    if (scale3 != null) {
                        scale = scale3.getScale();
                    }
                }
            }
            return Float.valueOf(scale);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lo1/k;", "Lp1/g0;", "Landroidx/compose/ui/graphics/f;", "a", "(Lp1/l1$b;)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<l1.b<p015o1.k>, g0<androidx.compose.ui.graphics.f>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f4074c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0<androidx.compose.ui.graphics.f> invoke(l1.b<p015o1.k> bVar) {
            return p019p1.j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/k;", "it", "Landroidx/compose/ui/graphics/f;", "a", "(Lo1/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<p015o1.k, androidx.compose.ui.graphics.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.f f4075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f4076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f4077e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4078a;

            static {
                int[] iArr = new int[p015o1.k.values().length];
                try {
                    iArr[p015o1.k.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p015o1.k.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p015o1.k.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4078a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.f fVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar) {
            super(1);
            this.f4075c = fVar;
            this.f4076d = iVar;
            this.f4077e = kVar;
        }

        public final long a(p015o1.k kVar) {
            androidx.compose.ui.graphics.f fVarB;
            int i11 = a.f4078a[kVar.ordinal()];
            if (i11 != 1) {
                fVarB = null;
                if (i11 == 2) {
                    Scale scale = this.f4076d.getData().getScale();
                    if (scale != null || (scale = this.f4077e.getData().getScale()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(scale.getTransformOrigin());
                    }
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale2 = this.f4077e.getData().getScale();
                    if (scale2 != null || (scale2 = this.f4076d.getData().getScale()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(scale2.getTransformOrigin());
                    }
                }
            } else {
                fVarB = this.f4075c;
            }
            return fVarB != null ? fVarB.getPackedValue() : androidx.compose.ui.graphics.f.INSTANCE.a();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.f invoke(p015o1.k kVar) {
            return androidx.compose.ui.graphics.f.b(a(kVar));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f4079c = new j();

        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<Boolean> f4081d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z11, wn0.a<Boolean> aVar) {
            super(1);
            this.f4080c = z11;
            this.f4081d = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.u(!this.f4080c && this.f4081d.invoke().booleanValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    public static final class l extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f4082c = new l();

        l() {
            super(1);
        }

        public final long a(long j11) {
            return w4.s.a(0, 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.r invoke(w4.r rVar) {
            return w4.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class m extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f4083c = new m();

        m() {
            super(1);
        }

        public final Integer a(int i11) {
            return 0;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4084c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4084c = lVar;
        }

        public final long a(long j11) {
            return w4.s.a(w4.r.g(j11), this.f4084c.invoke(Integer.valueOf(w4.r.f(j11))).intValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.r invoke(w4.r rVar) {
            return w4.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    public static final class o extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f4085c = new o();

        o() {
            super(1);
        }

        public final long a(long j11) {
            return w4.s.a(0, 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.r invoke(w4.r rVar) {
            return w4.r.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class p extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f4086c = new p();

        p() {
            super(1);
        }

        public final Integer a(int i11) {
            return 0;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw4/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4087c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4087c = lVar;
        }

        public final long a(long j11) {
            return w4.s.a(w4.r.g(j11), this.f4087c.invoke(Integer.valueOf(w4.r.f(j11))).intValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.r invoke(w4.r rVar) {
            return w4.r.b(a(rVar.getPackedValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Lw4/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4088c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4088c = lVar;
        }

        public final long a(long j11) {
            return w4.o.a(this.f4088c.invoke(Integer.valueOf(w4.r.g(j11))).intValue(), 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar) {
            return w4.n.b(a(rVar.getPackedValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class s extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f4089c = new s();

        s() {
            super(1);
        }

        public final Integer a(int i11) {
            return Integer.valueOf((-i11) / 2);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Lw4/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4090c = lVar;
        }

        public final long a(long j11) {
            return w4.o.a(0, this.f4090c.invoke(Integer.valueOf(w4.r.f(j11))).intValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar) {
            return w4.n.b(a(rVar.getPackedValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Lw4/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4091c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4091c = lVar;
        }

        public final long a(long j11) {
            return w4.o.a(this.f4091c.invoke(Integer.valueOf(w4.r.g(j11))).intValue(), 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar) {
            return w4.n.b(a(rVar.getPackedValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Lw4/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, w4.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Integer, Integer> f4092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(wn0.l<? super Integer, Integer> lVar) {
            super(1);
            this.f4092c = lVar;
        }

        public final long a(long j11) {
            return w4.o.a(0, this.f4092c.invoke(Integer.valueOf(w4.r.f(j11))).intValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ w4.n invoke(w4.r rVar) {
            return w4.n.b(a(rVar.getPackedValue()));
        }
    }

    public static final androidx.compose.animation.k A(g0<w4.n> g0Var, wn0.l<? super Integer, Integer> lVar) {
        return z(g0Var, new u(lVar));
    }

    public static final androidx.compose.animation.k B(g0<w4.n> g0Var, wn0.l<? super Integer, Integer> lVar) {
        return z(g0Var, new v(lVar));
    }

    private static final d3.c C(d3.c.InterfaceC1212c interfaceC1212c) {
        d3.c.Companion companion = d3.c.INSTANCE;
        if (p013kotlin.jvm.internal.s.f(interfaceC1212c, companion.l())) {
            return companion.m();
        }
        return p013kotlin.jvm.internal.s.f(interfaceC1212c, companion.a()) ? companion.b() : companion.e();
    }

    public static final androidx.compose.animation.i D(l1<p015o1.k> l1Var, androidx.compose.animation.i iVar, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(21614502, i11, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && lVar.n(l1Var)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(iVar, null, 2, null);
            lVar.B(objI);
        }
        p020r2.p1 p1Var = (p020r2.p1) objI;
        if (l1Var.i() == l1Var.p() && l1Var.i() == p015o1.k.Visible) {
            if (l1Var.u()) {
                F(p1Var, iVar);
            } else {
                F(p1Var, androidx.compose.animation.i.INSTANCE.a());
            }
        } else if (l1Var.p() == p015o1.k.Visible) {
            F(p1Var, E(p1Var).c(iVar));
        }
        androidx.compose.animation.i iVarE = E(p1Var);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return iVarE;
    }

    private static final androidx.compose.animation.i E(p020r2.p1<androidx.compose.animation.i> p1Var) {
        return p1Var.getValue();
    }

    private static final void F(p020r2.p1<androidx.compose.animation.i> p1Var, androidx.compose.animation.i iVar) {
        p1Var.setValue(iVar);
    }

    public static final androidx.compose.animation.k G(l1<p015o1.k> l1Var, androidx.compose.animation.k kVar, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-1363864804, i11, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && lVar.n(l1Var)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = s3.d(kVar, null, 2, null);
            lVar.B(objI);
        }
        p020r2.p1 p1Var = (p020r2.p1) objI;
        if (l1Var.i() == l1Var.p() && l1Var.i() == p015o1.k.Visible) {
            if (l1Var.u()) {
                I(p1Var, kVar);
            } else {
                I(p1Var, androidx.compose.animation.k.INSTANCE.a());
            }
        } else if (l1Var.p() != p015o1.k.Visible) {
            I(p1Var, H(p1Var).c(kVar));
        }
        androidx.compose.animation.k kVarH = H(p1Var);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return kVarH;
    }

    private static final androidx.compose.animation.k H(p020r2.p1<androidx.compose.animation.k> p1Var) {
        return p1Var.getValue();
    }

    private static final void I(p020r2.p1<androidx.compose.animation.k> p1Var, androidx.compose.animation.k kVar) {
        p1Var.setValue(kVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011e A[PHI: r1
      0x011e: PHI (r1v11 androidx.compose.animation.i) = (r1v9 androidx.compose.animation.i), (r1v12 androidx.compose.animation.i) binds: [B:42:0x011c, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[PHI: r2
      0x0139: PHI (r2v10 androidx.compose.animation.k) = (r2v8 androidx.compose.animation.k), (r2v11 androidx.compose.animation.k) binds: [B:52:0x0137, B:48:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    private static final p015o1.p e(final l1<p015o1.k> l1Var, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, p020r2.l lVar, int i11) {
        final l1.a aVar;
        final l1.a aVar2;
        androidx.compose.animation.i iVar2;
        boolean z11;
        androidx.compose.animation.k kVar2;
        boolean z12;
        boolean zK;
        Object objI;
        p020r2.l lVar2 = lVar;
        if (p020r2.o.J()) {
            p020r2.o.S(642253525, i11, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)");
        }
        boolean z13 = true;
        boolean z14 = (iVar.getData().getFade() == null && kVar.getData().getFade() == null) ? false : true;
        boolean z15 = (iVar.getData().getScale() == null && kVar.getData().getScale() == null) ? false : true;
        l1.a aVarC = null;
        if (z14) {
            lVar2.o(-675389204);
            p1<Float, p019p1.m> p1VarE = r1.e(p013kotlin.jvm.internal.l.f86526a);
            Object objI2 = lVar2.I();
            if (objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = str + " alpha";
                lVar2.B(objI2);
            }
            l1.a aVarC2 = m1.c(l1Var, p1VarE, (String) objI2, lVar2, (i11 & 14) | KyberEngine.KyberPolyBytes, 0);
            lVar2 = lVar2;
            lVar2.l();
            aVar = aVarC2;
        } else {
            lVar2.o(-675252433);
            lVar2.l();
            aVar = null;
        }
        if (z15) {
            lVar2.o(-675193780);
            p1<Float, p019p1.m> p1VarE2 = r1.e(p013kotlin.jvm.internal.l.f86526a);
            Object objI3 = lVar2.I();
            if (objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = str + " scale";
                lVar2.B(objI3);
            }
            l1.a aVarC3 = m1.c(l1Var, p1VarE2, (String) objI3, lVar2, (i11 & 14) | KyberEngine.KyberPolyBytes, 0);
            lVar2.l();
            aVar2 = aVarC3;
        } else {
            lVar2.o(-675057009);
            lVar2.l();
            aVar2 = null;
        }
        if (z15) {
            lVar2.o(-674987940);
            aVarC = m1.c(l1Var, f4055a, "TransformOriginInterruptionHandling", lVar2, (i11 & 14) | KyberEngine.KyberPolyBytes, 0);
            lVar2.l();
        } else {
            lVar2.o(-674835793);
            lVar2.l();
        }
        boolean zK2 = lVar2.K(aVar);
        if (((i11 & 112) ^ 48) > 32) {
            iVar2 = iVar;
            if (lVar2.n(iVar2)) {
                z11 = true;
            }
            boolean z16 = zK2 | z11;
            if (((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                kVar2 = kVar;
                if (!lVar2.n(kVar2)) {
                    z12 = true;
                }
                boolean zK3 = z16 | z12 | lVar2.K(aVar2);
                if ((((i11 & 14) ^ 6) > 4 || !lVar2.n(l1Var)) && (i11 & 6) != 4) {
                }
                zK = zK3 | z13 | lVar2.K(aVarC);
                objI = lVar2.I();
                if (zK || objI == p020r2.l.INSTANCE.a()) {
                    final androidx.compose.animation.i iVar3 = iVar2;
                    final androidx.compose.animation.k kVar3 = kVar2;
                    final l1.a aVar3 = aVarC;
                    p015o1.p pVar = new p015o1.p() { // from class: o1.l
                        @Override // p015o1.p
                        public final wn0.l init() {
                            return g.f(aVar, aVar2, l1Var, iVar3, kVar3, aVar3);
                        }
                    };
                    lVar2.B(pVar);
                    objI = pVar;
                }
                p015o1.p pVar2 = (p015o1.p) objI;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                return pVar2;
            }
            kVar2 = kVar;
            if ((i11 & KyberEngine.KyberPolyBytes) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zK4 = z16 | z12 | lVar2.K(aVar2);
            z13 = ((i11 & 14) ^ 6) > 4 ? false : false;
            zK = zK4 | z13 | lVar2.K(aVarC);
            objI = lVar2.I();
            if (zK) {
                final androidx.compose.animation.i iVar4 = iVar2;
                final androidx.compose.animation.k kVar4 = kVar2;
                final l1.a aVar4 = aVarC;
                p015o1.p pVar3 = new p015o1.p() { // from class: o1.l
                    @Override // p015o1.p
                    public final wn0.l init() {
                        return g.f(aVar, aVar2, l1Var, iVar4, kVar4, aVar4);
                    }
                };
                lVar2.B(pVar3);
                objI = pVar3;
            } else {
                final androidx.compose.animation.i iVar5 = iVar2;
                final androidx.compose.animation.k kVar5 = kVar2;
                final l1.a aVar5 = aVarC;
                p015o1.p pVar4 = new p015o1.p() { // from class: o1.l
                    @Override // p015o1.p
                    public final wn0.l init() {
                        return g.f(aVar, aVar2, l1Var, iVar5, kVar5, aVar5);
                    }
                };
                lVar2.B(pVar4);
                objI = pVar4;
            }
            p015o1.p pVar5 = (p015o1.p) objI;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            return pVar5;
        }
        iVar2 = iVar;
        if ((i11 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z17 = zK2 | z11;
        if (((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
            kVar2 = kVar;
            if (!lVar2.n(kVar2)) {
                z12 = true;
            }
            boolean zK5 = z17 | z12 | lVar2.K(aVar2);
            if (((i11 & 14) ^ 6) > 4) {
            }
            zK = zK5 | z13 | lVar2.K(aVarC);
            objI = lVar2.I();
            if (zK) {
                final androidx.compose.animation.i iVar6 = iVar2;
                final androidx.compose.animation.k kVar6 = kVar2;
                final l1.a aVar6 = aVarC;
                p015o1.p pVar6 = new p015o1.p() { // from class: o1.l
                    @Override // p015o1.p
                    public final wn0.l init() {
                        return g.f(aVar, aVar2, l1Var, iVar6, kVar6, aVar6);
                    }
                };
                lVar2.B(pVar6);
                objI = pVar6;
            } else {
                final androidx.compose.animation.i iVar7 = iVar2;
                final androidx.compose.animation.k kVar7 = kVar2;
                final l1.a aVar7 = aVarC;
                p015o1.p pVar7 = new p015o1.p() { // from class: o1.l
                    @Override // p015o1.p
                    public final wn0.l init() {
                        return g.f(aVar, aVar2, l1Var, iVar7, kVar7, aVar7);
                    }
                };
                lVar2.B(pVar7);
                objI = pVar7;
            }
            p015o1.p pVar8 = (p015o1.p) objI;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            return pVar8;
        }
        kVar2 = kVar;
        if ((i11 & KyberEngine.KyberPolyBytes) == 256) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean zK6 = z17 | z12 | lVar2.K(aVar2);
        if (((i11 & 14) ^ 6) > 4) {
        }
        zK = zK6 | z13 | lVar2.K(aVarC);
        objI = lVar2.I();
        if (zK) {
            final androidx.compose.animation.i iVar8 = iVar2;
            final androidx.compose.animation.k kVar8 = kVar2;
            final l1.a aVar8 = aVarC;
            p015o1.p pVar9 = new p015o1.p() { // from class: o1.l
                @Override // p015o1.p
                public final wn0.l init() {
                    return g.f(aVar, aVar2, l1Var, iVar8, kVar8, aVar8);
                }
            };
            lVar2.B(pVar9);
            objI = pVar9;
        } else {
            final androidx.compose.animation.i iVar9 = iVar2;
            final androidx.compose.animation.k kVar9 = kVar2;
            final l1.a aVar9 = aVarC;
            p015o1.p pVar10 = new p015o1.p() { // from class: o1.l
                @Override // p015o1.p
                public final wn0.l init() {
                    return g.f(aVar, aVar2, l1Var, iVar9, kVar9, aVar9);
                }
            };
            lVar2.B(pVar10);
            objI = pVar10;
        }
        p015o1.p pVar11 = (p015o1.p) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return pVar11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public static final wn0.l f(l1.a aVar, l1.a aVar2, l1 l1Var, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, l1.a aVar3) {
        androidx.compose.ui.graphics.f fVarB;
        y3 y3VarA = aVar != null ? aVar.a(new c(iVar, kVar), new d(iVar, kVar)) : null;
        y3 y3VarA2 = aVar2 != null ? aVar2.a(new f(iVar, kVar), new C0083g(iVar, kVar)) : null;
        if (l1Var.i() == p015o1.k.PreEnter) {
            Scale scale = iVar.getData().getScale();
            if (scale == null && (scale = kVar.getData().getScale()) == null) {
                fVarB = null;
            } else {
                fVarB = androidx.compose.ui.graphics.f.b(scale.getTransformOrigin());
            }
        } else {
            Scale scale2 = kVar.getData().getScale();
            if (scale2 == null && (scale2 = iVar.getData().getScale()) == null) {
                fVarB = null;
            } else {
                fVarB = androidx.compose.ui.graphics.f.b(scale2.getTransformOrigin());
            }
        }
        return new e(y3VarA, y3VarA2, aVar3 != null ? aVar3.a(h.f4074c, new i(fVarB, iVar, kVar)) : null);
    }

    public static final androidx.compose.ui.d g(l1<p015o1.k> l1Var, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, wn0.a<Boolean> aVar, String str, p020r2.l lVar, int i11, int i12) {
        l1.a aVar2;
        l1.a aVar3;
        ChangeSize changeSize;
        wn0.a<Boolean> aVar4 = (i12 & 4) != 0 ? j.f4079c : aVar;
        if (p020r2.o.J()) {
            p020r2.o.S(28261782, i11, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i13 = i11 & 14;
        androidx.compose.animation.i iVarD = D(l1Var, iVar, lVar, i11 & 126);
        int i14 = i11 >> 3;
        androidx.compose.animation.k kVarG = G(l1Var, kVar, lVar, (i14 & 112) | i13);
        boolean z11 = true;
        boolean z12 = (iVarD.getData().getSlide() == null && kVarG.getData().getSlide() == null) ? false : true;
        boolean z13 = (iVarD.getData().getChangeSize() == null && kVarG.getData().getChangeSize() == null) ? false : true;
        l1.a aVarC = null;
        if (z12) {
            lVar.o(-821375963);
            p1<w4.n, p019p1.n> p1VarI = r1.i(w4.n.INSTANCE);
            Object objI = lVar.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = str + " slide";
                lVar.B(objI);
            }
            l1.a aVarC2 = m1.c(l1Var, p1VarI, (String) objI, lVar, i13 | KyberEngine.KyberPolyBytes, 0);
            lVar.l();
            aVar2 = aVarC2;
        } else {
            lVar.o(-821278096);
            lVar.l();
            aVar2 = null;
        }
        if (z13) {
            lVar.o(-821202177);
            p1<w4.r, p019p1.n> p1VarJ = r1.j(w4.r.INSTANCE);
            Object objI2 = lVar.I();
            if (objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = str + " shrink/expand";
                lVar.B(objI2);
            }
            l1.a aVarC3 = m1.c(l1Var, p1VarJ, (String) objI2, lVar, i13 | KyberEngine.KyberPolyBytes, 0);
            lVar.l();
            aVar3 = aVarC3;
        } else {
            lVar.o(-821099041);
            lVar.l();
            aVar3 = null;
        }
        if (z13) {
            lVar.o(-821034002);
            p1<w4.n, p019p1.n> p1VarI2 = r1.i(w4.n.INSTANCE);
            Object objI3 = lVar.I();
            if (objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = str + " InterruptionHandlingOffset";
                lVar.B(objI3);
            }
            aVarC = m1.c(l1Var, p1VarI2, (String) objI3, lVar, i13 | KyberEngine.KyberPolyBytes, 0);
            lVar.l();
        } else {
            lVar.o(-820883777);
            lVar.l();
        }
        ChangeSize changeSize2 = iVarD.getData().getChangeSize();
        boolean z14 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = kVarG.getData().getChangeSize()) == null || changeSize.getClip()) && z13) ? false : true;
        p015o1.p pVarE = e(l1Var, iVarD, kVarG, str, lVar, i13 | (i14 & 7168));
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        boolean zP = lVar.p(z14);
        if ((((i11 & 7168) ^ 3072) <= 2048 || !lVar.n(aVar4)) && (i11 & 3072) != 2048) {
            z11 = false;
        }
        boolean z15 = zP | z11;
        Object objI4 = lVar.I();
        if (z15 || objI4 == p020r2.l.INSTANCE.a()) {
            objI4 = new k(z14, aVar4);
            lVar.B(objI4);
        }
        androidx.compose.ui.d dVarG = androidx.compose.ui.graphics.b.a(companion, (wn0.l) objI4).g(new EnterExitTransitionElement(l1Var, aVar3, aVarC, aVar2, iVarD, kVarG, aVar4, pVarE));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return dVarG;
    }

    public static final androidx.compose.animation.i h(g0<w4.r> g0Var, d3.c cVar, boolean z11, wn0.l<? super w4.r, w4.r> lVar) {
        return new androidx.compose.animation.j(new TransitionData(null, null, new ChangeSize(cVar, lVar, g0Var, z11), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.i i(g0 g0Var, d3.c cVar, boolean z11, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.r.b(f2.f(w4.r.INSTANCE)), 1, null);
        }
        if ((i11 & 2) != 0) {
            cVar = d3.c.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = l.f4082c;
        }
        return h(g0Var, cVar, z11, lVar);
    }

    public static final androidx.compose.animation.i j(g0<w4.r> g0Var, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, wn0.l<? super Integer, Integer> lVar) {
        return h(g0Var, C(interfaceC1212c), z11, new n(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.i k(g0 g0Var, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.r.b(f2.f(w4.r.INSTANCE)), 1, null);
        }
        if ((i11 & 2) != 0) {
            interfaceC1212c = d3.c.INSTANCE.a();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = m.f4083c;
        }
        return j(g0Var, interfaceC1212c, z11, lVar);
    }

    public static final androidx.compose.animation.i l(g0<Float> g0Var, float f11) {
        return new androidx.compose.animation.j(new TransitionData(new Fade(f11, g0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.i m(g0 g0Var, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return l(g0Var, f11);
    }

    public static final androidx.compose.animation.k n(g0<Float> g0Var, float f11) {
        return new androidx.compose.animation.l(new TransitionData(new Fade(f11, g0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.k o(g0 g0Var, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return n(g0Var, f11);
    }

    public static final androidx.compose.animation.i p(g0<Float> g0Var, float f11, long j11) {
        return new androidx.compose.animation.j(new TransitionData(null, null, null, new Scale(f11, j11, g0Var, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.i q(g0 g0Var, float f11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            j11 = androidx.compose.ui.graphics.f.INSTANCE.a();
        }
        return p(g0Var, f11, j11);
    }

    public static final androidx.compose.animation.k r(g0<w4.r> g0Var, d3.c cVar, boolean z11, wn0.l<? super w4.r, w4.r> lVar) {
        return new androidx.compose.animation.l(new TransitionData(null, null, new ChangeSize(cVar, lVar, g0Var, z11), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.k s(g0 g0Var, d3.c cVar, boolean z11, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.r.b(f2.f(w4.r.INSTANCE)), 1, null);
        }
        if ((i11 & 2) != 0) {
            cVar = d3.c.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = o.f4085c;
        }
        return r(g0Var, cVar, z11, lVar);
    }

    public static final androidx.compose.animation.k t(g0<w4.r> g0Var, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, wn0.l<? super Integer, Integer> lVar) {
        return r(g0Var, C(interfaceC1212c), z11, new q(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.k u(g0 g0Var, d3.c.InterfaceC1212c interfaceC1212c, boolean z11, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.r.b(f2.f(w4.r.INSTANCE)), 1, null);
        }
        if ((i11 & 2) != 0) {
            interfaceC1212c = d3.c.INSTANCE.a();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = p.f4086c;
        }
        return t(g0Var, interfaceC1212c, z11, lVar);
    }

    public static final androidx.compose.animation.i v(g0<w4.n> g0Var, wn0.l<? super w4.r, w4.n> lVar) {
        return new androidx.compose.animation.j(new TransitionData(null, new Slide(lVar, g0Var), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.i w(g0<w4.n> g0Var, wn0.l<? super Integer, Integer> lVar) {
        return v(g0Var, new r(lVar));
    }

    public static final androidx.compose.animation.i x(g0<w4.n> g0Var, wn0.l<? super Integer, Integer> lVar) {
        return v(g0Var, new t(lVar));
    }

    public static /* synthetic */ androidx.compose.animation.i y(g0 g0Var, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            g0Var = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, w4.n.b(f2.e(w4.n.INSTANCE)), 1, null);
        }
        if ((i11 & 2) != 0) {
            lVar = s.f4089c;
        }
        return x(g0Var, lVar);
    }

    public static final androidx.compose.animation.k z(g0<w4.n> g0Var, wn0.l<? super w4.r, w4.n> lVar) {
        return new androidx.compose.animation.l(new TransitionData(null, new Slide(lVar, g0Var), null, null, false, null, 61, null));
    }
}
