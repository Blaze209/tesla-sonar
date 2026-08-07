package xf;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import jn0.h0;
import k3.f0;
import k3.j1;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import tf.k0;
import tf.y;
import z3.d1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÍ\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010%\u001a\u00020$*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\u0010\u0010'\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Ltf/i;", "composition", "Lkotlin/Function0;", "", ReactProgressBarViewManager.PROP_PROGRESS, "Landroidx/compose/ui/d;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "applyShadowToLayers", "enableMergePaths", "Ltf/k0;", "renderMode", "maintainOriginalImageBounds", "Lxf/n;", "dynamicProperties", "Ld3/c;", "alignment", "Lz3/k;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Ltf/a;", "asyncUpdates", "safeMode", "Ljn0/h0;", "a", "(Ltf/i;Lwn0/a;Landroidx/compose/ui/d;ZZZZLtf/k0;ZLxf/n;Ld3/c;Lz3/k;ZZLjava/util/Map;Ltf/a;ZLr2/l;III)V", "Lj3/m;", "Lz3/d1;", "scale", "Lw4/r;", "g", "(JJ)J", "setDynamicProperties", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tf.i f123355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<Float> f123356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f123357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f123358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f123359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f123360h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f123361i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k0 f123362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f123363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ n f123364l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d3.c f123365m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ z3.k f123366n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f123367o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f123368p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f123369q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ tf.a f123370r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f123371s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f123372t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f123373u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f123374v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(tf.i iVar, wn0.a<Float> aVar, androidx.compose.ui.d dVar, boolean z11, boolean z12, boolean z13, boolean z14, k0 k0Var, boolean z15, n nVar, d3.c cVar, z3.k kVar, boolean z16, boolean z17, Map<String, ? extends Typeface> map, tf.a aVar2, boolean z18, int i11, int i12, int i13) {
            super(2);
            this.f123355c = iVar;
            this.f123356d = aVar;
            this.f123357e = dVar;
            this.f123358f = z11;
            this.f123359g = z12;
            this.f123360h = z13;
            this.f123361i = z14;
            this.f123362j = k0Var;
            this.f123363k = z15;
            this.f123364l = nVar;
            this.f123365m = cVar;
            this.f123366n = kVar;
            this.f123367o = z16;
            this.f123368p = z17;
            this.f123369q = map;
            this.f123370r = aVar2;
            this.f123371s = z18;
            this.f123372t = i11;
            this.f123373u = i12;
            this.f123374v = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            e.a(this.f123355c, this.f123356d, this.f123357e, this.f123358f, this.f123359g, this.f123360h, this.f123361i, this.f123362j, this.f123363k, this.f123364l, this.f123365m, this.f123366n, this.f123367o, this.f123368p, this.f123369q, this.f123370r, this.f123371s, lVar, k2.a(this.f123372t | 1), k2.a(this.f123373u), this.f123374v);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f123375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z3.k f123376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d3.c f123377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Matrix f123378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.p f123379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f123380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f123381i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k0 f123382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ tf.a f123383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ tf.i f123384l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f123385m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ n f123386n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f123387o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f123388p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f123389q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f123390r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f123391s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f123392t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Context f123393u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ wn0.a<Float> f123394v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ p1<n> f123395w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Rect rect, z3.k kVar, d3.c cVar, Matrix matrix, com.airbnb.lottie.p pVar, boolean z11, boolean z12, k0 k0Var, tf.a aVar, tf.i iVar, Map<String, ? extends Typeface> map, n nVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Context context, wn0.a<Float> aVar2, p1<n> p1Var) {
            super(1);
            this.f123375c = rect;
            this.f123376d = kVar;
            this.f123377e = cVar;
            this.f123378f = matrix;
            this.f123379g = pVar;
            this.f123380h = z11;
            this.f123381i = z12;
            this.f123382j = k0Var;
            this.f123383k = aVar;
            this.f123384l = iVar;
            this.f123385m = map;
            this.f123386n = nVar;
            this.f123387o = z13;
            this.f123388p = z14;
            this.f123389q = z15;
            this.f123390r = z16;
            this.f123391s = z17;
            this.f123392t = z18;
            this.f123393u = context;
            this.f123394v = aVar2;
            this.f123395w = p1Var;
        }

        public final void a(m3.f Canvas) {
            s.k(Canvas, "$this$Canvas");
            Rect rect = this.f123375c;
            z3.k kVar = this.f123376d;
            d3.c cVar = this.f123377e;
            Matrix matrix = this.f123378f;
            com.airbnb.lottie.p pVar = this.f123379g;
            boolean z11 = this.f123380h;
            boolean z12 = this.f123381i;
            k0 k0Var = this.f123382j;
            tf.a aVar = this.f123383k;
            tf.i iVar = this.f123384l;
            Map<String, Typeface> map = this.f123385m;
            n nVar = this.f123386n;
            boolean z13 = this.f123387o;
            boolean z14 = this.f123388p;
            boolean z15 = this.f123389q;
            boolean z16 = this.f123390r;
            boolean z17 = this.f123391s;
            boolean z18 = this.f123392t;
            Context context = this.f123393u;
            wn0.a<Float> aVar2 = this.f123394v;
            p1<n> p1Var = this.f123395w;
            j1 j1VarA = Canvas.getDrawContext().a();
            long jA = j3.n.a(rect.width(), rect.height());
            long jA2 = w4.s.a(yn0.a.d(j3.m.k(Canvas.b())), yn0.a.d(j3.m.i(Canvas.b())));
            long jA3 = kVar.a(jA, Canvas.b());
            long jA4 = cVar.a(e.g(jA, jA3), jA2, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(w4.n.h(jA4), w4.n.i(jA4));
            matrix.preScale(d1.b(jA3), d1.c(jA3));
            pVar.E(y.MergePathsApi19, z11);
            pVar.Z0(z12);
            pVar.W0(k0Var);
            pVar.x0(aVar);
            pVar.A0(iVar);
            pVar.D0(map);
            if (nVar != e.b(p1Var)) {
                n nVarB = e.b(p1Var);
                if (nVarB != null) {
                    nVarB.b(pVar);
                }
                if (nVar != null) {
                    nVar.a(pVar);
                }
                e.c(p1Var, nVar);
            }
            pVar.T0(z13);
            pVar.v0(z14);
            pVar.w0(z15);
            pVar.I0(z16);
            pVar.z0(z17);
            pVar.y0(z18);
            ag.h hVarV = pVar.V();
            if (pVar.u(context) || hVarV == null) {
                pVar.V0(aVar2.invoke().floatValue());
            } else {
                pVar.V0(hVarV.f1030b);
            }
            pVar.setBounds(0, 0, rect.width(), rect.height());
            pVar.B(f0.d(j1VarA), matrix);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tf.i f123396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<Float> f123397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f123398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f123399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f123400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f123401h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f123402i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k0 f123403j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f123404k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ n f123405l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d3.c f123406m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ z3.k f123407n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f123408o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f123409p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f123410q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ tf.a f123411r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f123412s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f123413t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f123414u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f123415v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(tf.i iVar, wn0.a<Float> aVar, androidx.compose.ui.d dVar, boolean z11, boolean z12, boolean z13, boolean z14, k0 k0Var, boolean z15, n nVar, d3.c cVar, z3.k kVar, boolean z16, boolean z17, Map<String, ? extends Typeface> map, tf.a aVar2, boolean z18, int i11, int i12, int i13) {
            super(2);
            this.f123396c = iVar;
            this.f123397d = aVar;
            this.f123398e = dVar;
            this.f123399f = z11;
            this.f123400g = z12;
            this.f123401h = z13;
            this.f123402i = z14;
            this.f123403j = k0Var;
            this.f123404k = z15;
            this.f123405l = nVar;
            this.f123406m = cVar;
            this.f123407n = kVar;
            this.f123408o = z16;
            this.f123409p = z17;
            this.f123410q = map;
            this.f123411r = aVar2;
            this.f123412s = z18;
            this.f123413t = i11;
            this.f123414u = i12;
            this.f123415v = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            e.a(this.f123396c, this.f123397d, this.f123398e, this.f123399f, this.f123400g, this.f123401h, this.f123402i, this.f123403j, this.f123404k, this.f123405l, this.f123406m, this.f123407n, this.f123408o, this.f123409p, this.f123410q, this.f123411r, this.f123412s, lVar, k2.a(this.f123413t | 1), k2.a(this.f123414u), this.f123415v);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(tf.i iVar, wn0.a<Float> progress, androidx.compose.ui.d dVar, boolean z11, boolean z12, boolean z13, boolean z14, k0 k0Var, boolean z15, n nVar, d3.c cVar, z3.k kVar, boolean z16, boolean z17, Map<String, ? extends Typeface> map, tf.a aVar, boolean z18, p020r2.l lVar, int i11, int i12, int i13) {
        s.k(progress, "progress");
        p020r2.l lVarV = lVar.v(382909894);
        androidx.compose.ui.d dVar2 = (i13 & 4) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        boolean z19 = (i13 & 8) != 0 ? false : z11;
        boolean z21 = (i13 & 16) != 0 ? false : z12;
        boolean z22 = (i13 & 32) != 0 ? true : z13;
        boolean z23 = (i13 & 64) != 0 ? false : z14;
        k0 k0Var2 = (i13 & 128) != 0 ? k0.AUTOMATIC : k0Var;
        boolean z24 = (i13 & 256) != 0 ? false : z15;
        n nVar2 = (i13 & 512) != 0 ? null : nVar;
        d3.c cVarE = (i13 & 1024) != 0 ? d3.c.INSTANCE.e() : cVar;
        z3.k kVarE = (i13 & 2048) != 0 ? z3.k.INSTANCE.e() : kVar;
        boolean z25 = (i13 & 4096) != 0 ? true : z16;
        boolean z26 = (i13 & PKIFailureInfo.certRevoked) != 0 ? false : z17;
        Map<String, ? extends Typeface> map2 = (i13 & 16384) != 0 ? null : map;
        tf.a aVar2 = (i13 & 32768) != 0 ? tf.a.AUTOMATIC : aVar;
        boolean z27 = (i13 & 65536) != 0 ? false : z18;
        if (p020r2.o.J()) {
            p020r2.o.S(382909894, i11, i12, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        }
        lVarV.H(185152185);
        Object objI = lVarV.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = new com.airbnb.lottie.p();
            lVarV.B(objI);
        }
        com.airbnb.lottie.p pVar = (com.airbnb.lottie.p) objI;
        lVarV.T();
        lVarV.H(185152232);
        Object objI2 = lVarV.I();
        if (objI2 == companion.a()) {
            objI2 = new Matrix();
            lVarV.B(objI2);
        }
        Matrix matrix = (Matrix) objI2;
        lVarV.T();
        lVarV.H(185152312);
        boolean zN = lVarV.n(iVar);
        Object objI3 = lVarV.I();
        if (zN || objI3 == companion.a()) {
            objI3 = s3.d(null, null, 2, null);
            lVarV.B(objI3);
        }
        p1 p1Var = (p1) objI3;
        lVarV.T();
        lVarV.H(185152364);
        if (iVar == null || iVar.d() == BitmapDescriptorFactory.HUE_RED) {
            n nVar3 = nVar2;
            d3.c cVar2 = cVarE;
            k0 k0Var3 = k0Var2;
            androidx.compose.ui.d dVar3 = dVar2;
            boolean z28 = z19;
            boolean z29 = z21;
            boolean z31 = z22;
            boolean z32 = z25;
            boolean z33 = z26;
            boolean z34 = z27;
            Map<String, ? extends Typeface> map3 = map2;
            z3.k kVar2 = kVarE;
            boolean z35 = z24;
            tf.a aVar3 = aVar2;
            androidx.compose.foundation.layout.g.a(dVar3, lVarV, (i11 >> 6) & 14);
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(iVar, progress, dVar3, z28, z29, z31, z23, k0Var3, z35, nVar3, cVar2, kVar2, z32, z33, map3, aVar3, z34, i11, i12, i13));
                return;
            }
            return;
        }
        lVarV.T();
        Rect rectB = iVar.b();
        Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.d dVarA = g.a(dVar2, rectB.width(), rectB.height());
        z3.k kVar3 = kVarE;
        tf.a aVar4 = aVar2;
        Map<String, ? extends Typeface> map4 = map2;
        n nVar4 = nVar2;
        androidx.compose.ui.d dVar4 = dVar2;
        boolean z36 = z23;
        d3.c cVar3 = cVarE;
        k0 k0Var4 = k0Var2;
        boolean z37 = z27;
        b bVar = new b(rectB, kVar3, cVar3, matrix, pVar, z36, z37, k0Var4, aVar4, iVar, map4, nVar4, z19, z21, z22, z24, z25, z26, context, progress, p1Var);
        boolean z38 = z24;
        boolean z39 = z19;
        boolean z41 = z21;
        boolean z42 = z25;
        boolean z43 = z26;
        boolean z44 = z22;
        q1.i.a(dVarA, bVar, lVarV, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX2 = lVarV.x();
        if (w2VarX2 != null) {
            w2VarX2.a(new c(iVar, progress, dVar4, z39, z41, z44, z36, k0Var4, z38, nVar4, cVar3, kVar3, z42, z43, map4, aVar4, z37, i11, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n b(p1<n> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p1<n> p1Var, n nVar) {
        p1Var.setValue(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j11, long j12) {
        return w4.s.a((int) (j3.m.k(j11) * d1.b(j12)), (int) (j3.m.i(j11) * d1.c(j12)));
    }
}
