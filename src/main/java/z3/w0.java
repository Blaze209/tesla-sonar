package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R0\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010*\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020&8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R*\u0010-\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0014\u00101\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lz3/w0;", "Lz3/l0;", "<init>", "()V", "Ljn0/h0;", "U0", "Lw4/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Y0", "(JFLwn0/l;)V", "Ln3/c;", "layer", "X0", "(JFLn3/c;)V", "", "<set-?>", "a", "I", "T0", "()I", Snapshot.WIDTH, "b", "L0", Snapshot.HEIGHT, "Lw4/r;", "value", "c", "J", "O0", "()J", "a1", "(J)V", "measuredSize", "Lw4/b;", DateTokenConverter.CONVERTER_KEY, "R0", "e1", "measurementConstraints", "e", "K0", "apparentToRealOffset", "P0", "measuredWidth", "N0", "measuredHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class w0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long measuredSize = w4.s.a(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long measurementConstraints = x0.f126804b;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long apparentToRealOffset = w4.n.INSTANCE.a();

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJ<\u0010\u0018\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019J.\u0010\u000f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010 J.\u0010!\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b!\u0010 J!\u0010#\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lz3/w0$a;", "", "<init>", "()V", "Lz3/w0;", "Ljn0/h0;", "f", "(Lz3/w0;)V", "Lw4/n;", "position", "", "zIndex", "m", "(Lz3/w0;JF)V", "", "x", "y", "k", "(Lz3/w0;IIF)V", "g", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "q", "(Lz3/w0;JFLwn0/l;)V", "o", "(Lz3/w0;IIFLwn0/l;)V", "u", "w", "Ln3/c;", "layer", "(Lz3/w0;JLn3/c;F)V", "r", "block", "A", "(Lwn0/l;)V", "", "a", "Z", "motionFrameOfReferencePlacement", "e", "()I", "parentWidth", "Lw4/t;", DateTokenConverter.CONVERTER_KEY, "()Lw4/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(w0 w0Var) {
            if (w0Var instanceof b4.t0) {
                ((b4.t0) w0Var).y0(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void h(a aVar, w0 w0Var, int i11, int i12, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.g(w0Var, i11, i12, f11);
        }

        public static /* synthetic */ void j(a aVar, w0 w0Var, long j11, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.i(w0Var, j11, f11);
        }

        public static /* synthetic */ void l(a aVar, w0 w0Var, int i11, int i12, float f11, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.k(w0Var, i11, i12, f11);
        }

        public static /* synthetic */ void n(a aVar, w0 w0Var, long j11, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.m(w0Var, j11, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void p(a aVar, w0 w0Var, int i11, int i12, float f11, wn0.l lVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            if ((i13 & 8) != 0) {
                lVar = x0.f126803a;
            }
            aVar.o(w0Var, i11, i12, f12, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void s(a aVar, w0 w0Var, long j11, float f11, wn0.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            if ((i11 & 4) != 0) {
                lVar = x0.f126803a;
            }
            aVar.q(w0Var, j11, f12, lVar);
        }

        public static /* synthetic */ void t(a aVar, w0 w0Var, long j11, n3.c cVar, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i11 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.r(w0Var, j11, cVar, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void v(a aVar, w0 w0Var, int i11, int i12, float f11, wn0.l lVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i13 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            if ((i13 & 8) != 0) {
                lVar = x0.f126803a;
            }
            aVar.u(w0Var, i11, i12, f12, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void y(a aVar, w0 w0Var, long j11, float f11, wn0.l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i11 & 2) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = f11;
            if ((i11 & 4) != 0) {
                lVar = x0.f126803a;
            }
            aVar.w(w0Var, j11, f12, lVar);
        }

        public static /* synthetic */ void z(a aVar, w0 w0Var, long j11, n3.c cVar, float f11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i11 & 4) != 0) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            aVar.x(w0Var, j11, cVar, f11);
        }

        public final void A(wn0.l<? super a, jn0.h0> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: d */
        public abstract w4.t getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: e */
        public abstract int getParentWidth();

        public final void g(w0 w0Var, int i11, int i12, float f11) {
            long jA = w4.o.a(i11, i12);
            f(w0Var);
            w0Var.Y0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, null);
        }

        public final void i(w0 w0Var, long j11, float f11) {
            f(w0Var);
            w0Var.Y0(w4.n.l(j11, w0Var.apparentToRealOffset), f11, null);
        }

        public final void k(w0 w0Var, int i11, int i12, float f11) {
            long jA = w4.o.a(i11, i12);
            if (getParentLayoutDirection() == w4.t.Ltr || getParentWidth() == 0) {
                f(w0Var);
                w0Var.Y0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, null);
            } else {
                long jA2 = w4.o.a((getParentWidth() - w0Var.getWidth()) - w4.n.h(jA), w4.n.i(jA));
                f(w0Var);
                w0Var.Y0(w4.n.l(jA2, w0Var.apparentToRealOffset), f11, null);
            }
        }

        public final void m(w0 w0Var, long j11, float f11) {
            if (getParentLayoutDirection() == w4.t.Ltr || getParentWidth() == 0) {
                f(w0Var);
                w0Var.Y0(w4.n.l(j11, w0Var.apparentToRealOffset), f11, null);
            } else {
                long jA = w4.o.a((getParentWidth() - w0Var.getWidth()) - w4.n.h(j11), w4.n.i(j11));
                f(w0Var);
                w0Var.Y0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, null);
            }
        }

        public final void o(w0 w0Var, int i11, int i12, float f11, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
            long jA = w4.o.a(i11, i12);
            if (getParentLayoutDirection() == w4.t.Ltr || getParentWidth() == 0) {
                f(w0Var);
                w0Var.Y0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, lVar);
            } else {
                long jA2 = w4.o.a((getParentWidth() - w0Var.getWidth()) - w4.n.h(jA), w4.n.i(jA));
                f(w0Var);
                w0Var.Y0(w4.n.l(jA2, w0Var.apparentToRealOffset), f11, lVar);
            }
        }

        public final void q(w0 w0Var, long j11, float f11, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
            if (getParentLayoutDirection() == w4.t.Ltr || getParentWidth() == 0) {
                f(w0Var);
                w0Var.Y0(w4.n.l(j11, w0Var.apparentToRealOffset), f11, lVar);
            } else {
                long jA = w4.o.a((getParentWidth() - w0Var.getWidth()) - w4.n.h(j11), w4.n.i(j11));
                f(w0Var);
                w0Var.Y0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, lVar);
            }
        }

        public final void r(w0 w0Var, long j11, n3.c cVar, float f11) {
            if (getParentLayoutDirection() == w4.t.Ltr || getParentWidth() == 0) {
                f(w0Var);
                w0Var.X0(w4.n.l(j11, w0Var.apparentToRealOffset), f11, cVar);
            } else {
                long jA = w4.o.a((getParentWidth() - w0Var.getWidth()) - w4.n.h(j11), w4.n.i(j11));
                f(w0Var);
                w0Var.X0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, cVar);
            }
        }

        public final void u(w0 w0Var, int i11, int i12, float f11, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
            long jA = w4.o.a(i11, i12);
            f(w0Var);
            w0Var.Y0(w4.n.l(jA, w0Var.apparentToRealOffset), f11, lVar);
        }

        public final void w(w0 w0Var, long j11, float f11, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
            f(w0Var);
            w0Var.Y0(w4.n.l(j11, w0Var.apparentToRealOffset), f11, lVar);
        }

        public final void x(w0 w0Var, long j11, n3.c cVar, float f11) {
            f(w0Var);
            w0Var.X0(w4.n.l(j11, w0Var.apparentToRealOffset), f11, cVar);
        }
    }

    private final void U0() {
        this.width = bo0.n.n(w4.r.g(this.measuredSize), w4.b.n(this.measurementConstraints), w4.b.l(this.measurementConstraints));
        this.height = bo0.n.n(w4.r.f(this.measuredSize), w4.b.m(this.measurementConstraints), w4.b.k(this.measurementConstraints));
        this.apparentToRealOffset = w4.o.a((this.width - w4.r.g(this.measuredSize)) / 2, (this.height - w4.r.f(this.measuredSize)) / 2);
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public int N0() {
        return w4.r.f(this.measuredSize);
    }

    /* JADX INFO: renamed from: O0, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    public int P0() {
        return w4.r.g(this.measuredSize);
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: T0, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X0(long position, float zIndex, n3.c layer) {
        Y0(position, zIndex, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock);

    protected final void a1(long j11) {
        if (w4.r.e(this.measuredSize, j11)) {
            return;
        }
        this.measuredSize = j11;
        U0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e1(long j11) {
        if (w4.b.f(this.measurementConstraints, j11)) {
            return;
        }
        this.measurementConstraints = j11;
        U0();
    }
}
