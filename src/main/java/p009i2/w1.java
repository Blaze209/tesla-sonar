package p009i2;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import j3.n;
import jn0.h0;
import k3.i4;
import k3.p1;
import m3.Stroke;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.r;
import p013kotlin.jvm.internal.u;
import p019p1.CubicBezierEasing;
import p019p1.f0;
import p019p1.j;
import p019p1.m;
import p019p1.m0;
import p019p1.n0;
import p019p1.o0;
import p019p1.r0;
import p019p1.r1;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import q1.i;
import q1.t0;
import w4.h;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aD\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0015\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0017\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u0019\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016\u001a>\u0010\u001a\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c\"\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c\"\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010(\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010*\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010,\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065²\u0006\f\u0010-\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", ReactProgressBarViewManager.PROP_PROGRESS, "Landroidx/compose/ui/d;", "modifier", "Lk3/p1;", "color", "Lw4/h;", "strokeWidth", "backgroundColor", "Lk3/i4;", "strokeCap", "Ljn0/h0;", "a", "(FLandroidx/compose/ui/d;JFJILr2/l;II)V", "b", "(Landroidx/compose/ui/d;JFJILr2/l;II)V", "Lm3/f;", "startAngle", "sweep", "Lm3/k;", "stroke", "o", "(Lm3/f;FFJLm3/k;)V", "p", "(Lm3/f;JLm3/k;)V", "q", "r", "(Lm3/f;FFFJLm3/k;)V", Gender.FEMALE, "LinearIndicatorHeight", "LinearIndicatorWidth", "c", "CircularIndicatorDiameter", "Lp1/x;", DateTokenConverter.CONVERTER_KEY, "Lp1/x;", "FirstLineHeadEasing", "e", "FirstLineTailEasing", "f", "SecondLineHeadEasing", "g", "SecondLineTailEasing", "h", "CircularEasing", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f75388a = v1.f75309a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f75389b = h.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f75390c = h.g(40);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CubicBezierEasing f75391d = new CubicBezierEasing(0.2f, BitmapDescriptorFactory.HUE_RED, 0.8f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CubicBezierEasing f75392e = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CubicBezierEasing f75393f = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final CubicBezierEasing f75394g = new CubicBezierEasing(0.1f, BitmapDescriptorFactory.HUE_RED, 0.45f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final CubicBezierEasing f75395h = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f75396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f75397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Stroke f75398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f75399f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, long j11, Stroke stroke, long j12) {
            super(1);
            this.f75396c = f11;
            this.f75397d = j11;
            this.f75398e = stroke;
            this.f75399f = j12;
        }

        public final void a(m3.f fVar) {
            float f11 = this.f75396c * 360.0f;
            w1.p(fVar, this.f75397d, this.f75398e);
            w1.q(fVar, 270.0f, f11, this.f75399f, this.f75398e);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f75400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f75401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f75402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f75403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f75404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f75405h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f75406i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f75407j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11, androidx.compose.ui.d dVar, long j11, float f12, long j12, int i11, int i12, int i13) {
            super(2);
            this.f75400c = f11;
            this.f75401d = dVar;
            this.f75402e = j11;
            this.f75403f = f12;
            this.f75404g = j12;
            this.f75405h = i11;
            this.f75406i = i12;
            this.f75407j = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            w1.a(this.f75400c, this.f75401d, this.f75402e, this.f75403f, this.f75404g, this.f75405h, lVar, k2.a(this.f75406i | 1), this.f75407j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f75408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Stroke f75409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f75410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f75411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y3<Integer> f75412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y3<Float> f75413h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ y3<Float> f75414i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ y3<Float> f75415j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, Stroke stroke, float f11, long j12, y3<Integer> y3Var, y3<Float> y3Var2, y3<Float> y3Var3, y3<Float> y3Var4) {
            super(1);
            this.f75408c = j11;
            this.f75409d = stroke;
            this.f75410e = f11;
            this.f75411f = j12;
            this.f75412g = y3Var;
            this.f75413h = y3Var2;
            this.f75414i = y3Var3;
            this.f75415j = y3Var4;
        }

        public final void a(m3.f fVar) {
            w1.p(fVar, this.f75408c, this.f75409d);
            w1.r(fVar, w1.e(this.f75414i) + (((w1.f(this.f75412g) * 216.0f) % 360.0f) - 90.0f) + w1.c(this.f75415j), this.f75410e, Math.abs(w1.d(this.f75413h) - w1.e(this.f75414i)), this.f75411f, this.f75409d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f75416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f75417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f75418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f75419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f75420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f75421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f75422i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, long j11, float f11, long j12, int i11, int i12, int i13) {
            super(2);
            this.f75416c = dVar;
            this.f75417d = j11;
            this.f75418e = f11;
            this.f75419f = j12;
            this.f75420g = i11;
            this.f75421h = i12;
            this.f75422i = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            w1.b(this.f75416c, this.f75417d, this.f75418e, this.f75419f, this.f75420g, lVar, k2.a(this.f75421h | 1), this.f75422i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/r0$b;", "", "Ljn0/h0;", "a", "(Lp1/r0$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<r0.b<Float>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f75423c = new e();

        e() {
            super(1);
        }

        public final void a(r0.b<Float> bVar) {
            bVar.e(1332);
            bVar.f(bVar.g(Float.valueOf(BitmapDescriptorFactory.HUE_RED), 0), w1.f75395h);
            bVar.g(Float.valueOf(290.0f), 666);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(r0.b<Float> bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/r0$b;", "", "Ljn0/h0;", "a", "(Lp1/r0$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<r0.b<Float>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f75424c = new f();

        f() {
            super(1);
        }

        public final void a(r0.b<Float> bVar) {
            bVar.e(1332);
            bVar.f(bVar.g(Float.valueOf(BitmapDescriptorFactory.HUE_RED), 666), w1.f75395h);
            bVar.g(Float.valueOf(290.0f), bVar.getDurationMillis());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(r0.b<Float> bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0184  */
    /* JADX WARN: Code duplicated, block: B:110:0x0187  */
    /* JADX WARN: Code duplicated, block: B:113:0x0196  */
    /* JADX WARN: Code duplicated, block: B:115:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01de  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4 A[PHI: r3 r5 r8 r10 r14
      0x00e4: PHI (r3v27 int) = (r3v17 int), (r3v28 int), (r3v29 int) binds: [B:95:0x0110, B:82:0x00e1, B:83:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r5v6 androidx.compose.ui.d) = (r5v3 androidx.compose.ui.d), (r5v2 androidx.compose.ui.d), (r5v2 androidx.compose.ui.d) binds: [B:95:0x0110, B:82:0x00e1, B:83:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r8v6 float) = (r8v3 float), (r8v2 float), (r8v2 float) binds: [B:95:0x0110, B:82:0x00e1, B:83:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r10v5 long) = (r10v2 long), (r10v1 long), (r10v1 long) binds: [B:95:0x0110, B:82:0x00e1, B:83:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r14v6 long) = (r14v3 long), (r14v2 long), (r14v2 long) binds: [B:95:0x0110, B:82:0x00e1, B:83:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
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
    public static final void a(float f11, androidx.compose.ui.d dVar, long j11, float f12, long j12, int i11, p020r2.l lVar, int i12, int i13) {
        int i14;
        androidx.compose.ui.d dVar2;
        long j13;
        int i15;
        float fA;
        int i16;
        int i17;
        long jI;
        int i18;
        int i19;
        int iA;
        float f13;
        Stroke stroke;
        float f14;
        boolean z11;
        boolean z12;
        Object objI;
        long j14;
        long j15;
        w2 w2VarX;
        int i21;
        int i22;
        p020r2.l lVarV = lVar.v(1746618448);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (lVarV.q(f11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i23 = i13 & 2;
        if (i23 == 0) {
            if ((i12 & 48) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
                j13 = j11;
                if ((i13 & 4) == 0 || !lVarV.s(j13)) {
                    i22 = 128;
                } else {
                    i22 = 256;
                }
                i14 |= i22;
            } else {
                j13 = j11;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 3072) == 0) {
                    fA = f12;
                    if (lVarV.q(fA)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    if ((i12 & 24576) == 0) {
                        jI = j12;
                        if (lVarV.s(jI)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i14 |= i18;
                    }
                    if ((i12 & 196608) == 0) {
                        i19 = i11;
                        if ((i13 & 32) == 0 || !lVarV.r(i19)) {
                            i21 = 65536;
                        } else {
                            i21 = 131072;
                        }
                        i14 |= i21;
                    } else {
                        i19 = i11;
                    }
                    if ((i14 & 74899) == 74898 || !lVarV.b()) {
                        lVarV.L();
                        if ((i12 & 1) != 0 || lVarV.k()) {
                            if (i23 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if ((i13 & 4) != 0) {
                                j13 = j1.f74525a.a(lVarV, 6).j();
                                i14 &= -897;
                            }
                            if (i15 != 0) {
                                fA = v1.f75309a.a();
                            }
                            if (i17 != 0) {
                                jI = p1.INSTANCE.i();
                            }
                            if ((i13 & 32) != 0) {
                                i14 &= -458753;
                                iA = i4.INSTANCE.a();
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                            }
                            f13 = BitmapDescriptorFactory.HUE_RED;
                            if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                                f13 = f11;
                            }
                            if (f13 > 1.0f) {
                                f13 = 1.0f;
                            }
                            stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                            f14 = f13;
                            androidx.compose.ui.d dVarQ = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                            boolean zQ = lVarV.q(f14);
                            boolean z13 = true;
                            if ((57344 & i14) == 16384) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean zK = zQ | z11 | lVarV.K(stroke);
                            if ((((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256 || !lVarV.s(j13)) && (i14 & KyberEngine.KyberPolyBytes) != 256) {
                            }
                            z12 = zK | z13;
                            objI = lVarV.I();
                            if (z12 || objI == p020r2.l.INSTANCE.a()) {
                                objI = new a(f14, jI, stroke, j13);
                                lVarV.B(objI);
                            }
                            i.a(dVarQ, (l) objI, lVarV, 0);
                            if (o.J()) {
                                o.R();
                            }
                        } else {
                            lVarV.j();
                            if ((i13 & 4) != 0) {
                                i14 &= -897;
                            }
                            if ((i13 & 32) != 0) {
                                i14 &= -458753;
                            }
                        }
                        iA = i19;
                        lVarV.C();
                        if (o.J()) {
                            o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                        }
                        f13 = BitmapDescriptorFactory.HUE_RED;
                        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                            f13 = f11;
                        }
                        if (f13 > 1.0f) {
                            f13 = 1.0f;
                        }
                        stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                        f14 = f13;
                        androidx.compose.ui.d dVarQ2 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                        boolean zQ2 = lVarV.q(f14);
                        boolean z14 = true;
                        if ((57344 & i14) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean zK2 = zQ2 | z11 | lVarV.K(stroke);
                        z14 = ((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256 ? false : false;
                        z12 = zK2 | z14;
                        objI = lVarV.I();
                        if (z12) {
                            objI = new a(f14, jI, stroke, j13);
                            lVarV.B(objI);
                        } else {
                            objI = new a(f14, jI, stroke, j13);
                            lVarV.B(objI);
                        }
                        i.a(dVarQ2, (l) objI, lVarV, 0);
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        lVarV.j();
                        iA = i19;
                    }
                    j14 = j13;
                    j15 = jI;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
                    }
                }
                i14 |= 24576;
                jI = j12;
                if ((i12 & 196608) == 0) {
                    i19 = i11;
                    if ((i13 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                } else {
                    i19 = i11;
                }
                if ((i14 & 74899) == 74898) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    f13 = BitmapDescriptorFactory.HUE_RED;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f11;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                    f14 = f13;
                    androidx.compose.ui.d dVarQ3 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                    boolean zQ3 = lVarV.q(f14);
                    boolean z15 = true;
                    if ((57344 & i14) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK3 = zQ3 | z11 | lVarV.K(stroke);
                    if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                    }
                    z12 = zK3 | z15;
                    objI = lVarV.I();
                    if (z12) {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    } else {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ3, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    f13 = BitmapDescriptorFactory.HUE_RED;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f11;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                    f14 = f13;
                    androidx.compose.ui.d dVarQ4 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                    boolean zQ4 = lVarV.q(f14);
                    boolean z16 = true;
                    if ((57344 & i14) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK4 = zQ4 | z11 | lVarV.K(stroke);
                    if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                    }
                    z12 = zK4 | z16;
                    objI = lVarV.I();
                    if (z12) {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    } else {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ4, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                j14 = j13;
                j15 = jI;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
                }
            }
            i14 |= 3072;
            fA = f12;
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i12 & 24576) == 0) {
                    jI = j12;
                    if (lVarV.s(jI)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i18;
                }
                if ((i12 & 196608) == 0) {
                    i19 = i11;
                    if ((i13 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                } else {
                    i19 = i11;
                }
                if ((i14 & 74899) == 74898) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    f13 = BitmapDescriptorFactory.HUE_RED;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f11;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                    f14 = f13;
                    androidx.compose.ui.d dVarQ5 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                    boolean zQ5 = lVarV.q(f14);
                    boolean z17 = true;
                    if ((57344 & i14) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK5 = zQ5 | z11 | lVarV.K(stroke);
                    if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                    }
                    z12 = zK5 | z17;
                    objI = lVarV.I();
                    if (z12) {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    } else {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ5, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    f13 = BitmapDescriptorFactory.HUE_RED;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f11;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                    f14 = f13;
                    androidx.compose.ui.d dVarQ6 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                    boolean zQ6 = lVarV.q(f14);
                    boolean z18 = true;
                    if ((57344 & i14) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK6 = zQ6 | z11 | lVarV.K(stroke);
                    if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                    }
                    z12 = zK6 | z18;
                    objI = lVarV.I();
                    if (z12) {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    } else {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ6, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                j14 = j13;
                j15 = jI;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
                }
            }
            i14 |= 24576;
            jI = j12;
            if ((i12 & 196608) == 0) {
                i19 = i11;
                if ((i13 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            } else {
                i19 = i11;
            }
            if ((i14 & 74899) == 74898) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                f13 = BitmapDescriptorFactory.HUE_RED;
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    f13 = f11;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                f14 = f13;
                androidx.compose.ui.d dVarQ7 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                boolean zQ7 = lVarV.q(f14);
                boolean z19 = true;
                if ((57344 & i14) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK7 = zQ7 | z11 | lVarV.K(stroke);
                if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                }
                z12 = zK7 | z19;
                objI = lVarV.I();
                if (z12) {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                } else {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                }
                i.a(dVarQ7, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                f13 = BitmapDescriptorFactory.HUE_RED;
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    f13 = f11;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                f14 = f13;
                androidx.compose.ui.d dVarQ8 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                boolean zQ8 = lVarV.q(f14);
                boolean z110 = true;
                if ((57344 & i14) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK8 = zQ8 | z11 | lVarV.K(stroke);
                if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                }
                z12 = zK8 | z110;
                objI = lVarV.I();
                if (z12) {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                } else {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                }
                i.a(dVarQ8, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            }
            j14 = j13;
            j15 = jI;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
            }
        }
        i14 |= 48;
        dVar2 = dVar;
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            j13 = j11;
            if ((i13 & 4) == 0) {
                i22 = 128;
            } else {
                i22 = 128;
            }
            i14 |= i22;
        } else {
            j13 = j11;
        }
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 3072) == 0) {
                fA = f12;
                if (lVarV.q(fA)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i12 & 24576) == 0) {
                    jI = j12;
                    if (lVarV.s(jI)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i18;
                }
                if ((i12 & 196608) == 0) {
                    i19 = i11;
                    if ((i13 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                } else {
                    i19 = i11;
                }
                if ((i14 & 74899) == 74898) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    f13 = BitmapDescriptorFactory.HUE_RED;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f11;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                    f14 = f13;
                    androidx.compose.ui.d dVarQ9 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                    boolean zQ9 = lVarV.q(f14);
                    boolean z111 = true;
                    if ((57344 & i14) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK9 = zQ9 | z11 | lVarV.K(stroke);
                    if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                    }
                    z12 = zK9 | z111;
                    objI = lVarV.I();
                    if (z12) {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    } else {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ9, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if ((i13 & 4) != 0) {
                            j13 = j1.f74525a.a(lVarV, 6).j();
                            i14 &= -897;
                        }
                        if (i15 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i17 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 32) != 0) {
                            i14 &= -458753;
                            iA = i4.INSTANCE.a();
                        } else {
                            iA = i19;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    f13 = BitmapDescriptorFactory.HUE_RED;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f11;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                    f14 = f13;
                    androidx.compose.ui.d dVarQ10 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                    boolean zQ10 = lVarV.q(f14);
                    boolean z112 = true;
                    if ((57344 & i14) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK10 = zQ10 | z11 | lVarV.K(stroke);
                    if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                    }
                    z12 = zK10 | z112;
                    objI = lVarV.I();
                    if (z12) {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    } else {
                        objI = new a(f14, jI, stroke, j13);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ10, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                j14 = j13;
                j15 = jI;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
                }
            }
            i14 |= 24576;
            jI = j12;
            if ((i12 & 196608) == 0) {
                i19 = i11;
                if ((i13 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            } else {
                i19 = i11;
            }
            if ((i14 & 74899) == 74898) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                f13 = BitmapDescriptorFactory.HUE_RED;
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    f13 = f11;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                f14 = f13;
                androidx.compose.ui.d dVarQ11 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                boolean zQ11 = lVarV.q(f14);
                boolean z113 = true;
                if ((57344 & i14) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK11 = zQ11 | z11 | lVarV.K(stroke);
                if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                }
                z12 = zK11 | z113;
                objI = lVarV.I();
                if (z12) {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                } else {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                }
                i.a(dVarQ11, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                f13 = BitmapDescriptorFactory.HUE_RED;
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    f13 = f11;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                f14 = f13;
                androidx.compose.ui.d dVarQ12 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                boolean zQ12 = lVarV.q(f14);
                boolean z114 = true;
                if ((57344 & i14) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK12 = zQ12 | z11 | lVarV.K(stroke);
                if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                }
                z12 = zK12 | z114;
                objI = lVarV.I();
                if (z12) {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                } else {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                }
                i.a(dVarQ12, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            }
            j14 = j13;
            j15 = jI;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
            }
        }
        i14 |= 3072;
        fA = f12;
        i17 = i13 & 16;
        if (i17 != 0) {
            if ((i12 & 24576) == 0) {
                jI = j12;
                if (lVarV.s(jI)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i14 |= i18;
            }
            if ((i12 & 196608) == 0) {
                i19 = i11;
                if ((i13 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            } else {
                i19 = i11;
            }
            if ((i14 & 74899) == 74898) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                f13 = BitmapDescriptorFactory.HUE_RED;
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    f13 = f11;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                f14 = f13;
                androidx.compose.ui.d dVarQ13 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                boolean zQ13 = lVarV.q(f14);
                boolean z115 = true;
                if ((57344 & i14) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK13 = zQ13 | z11 | lVarV.K(stroke);
                if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                }
                z12 = zK13 | z115;
                objI = lVarV.I();
                if (z12) {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                } else {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                }
                i.a(dVarQ13, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if ((i13 & 4) != 0) {
                        j13 = j1.f74525a.a(lVarV, 6).j();
                        i14 &= -897;
                    }
                    if (i15 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i17 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 32) != 0) {
                        i14 &= -458753;
                        iA = i4.INSTANCE.a();
                    } else {
                        iA = i19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                f13 = BitmapDescriptorFactory.HUE_RED;
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    f13 = f11;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
                f14 = f13;
                androidx.compose.ui.d dVarQ14 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
                boolean zQ14 = lVarV.q(f14);
                boolean z116 = true;
                if ((57344 & i14) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK14 = zQ14 | z11 | lVarV.K(stroke);
                if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
                }
                z12 = zK14 | z116;
                objI = lVarV.I();
                if (z12) {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                } else {
                    objI = new a(f14, jI, stroke, j13);
                    lVarV.B(objI);
                }
                i.a(dVarQ14, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            }
            j14 = j13;
            j15 = jI;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
            }
        }
        i14 |= 24576;
        jI = j12;
        if ((i12 & 196608) == 0) {
            i19 = i11;
            if ((i13 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i14 |= i21;
        } else {
            i19 = i11;
        }
        if ((i14 & 74899) == 74898) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    j13 = j1.f74525a.a(lVarV, 6).j();
                    i14 &= -897;
                }
                if (i15 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i17 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 32) != 0) {
                    i14 &= -458753;
                    iA = i4.INSTANCE.a();
                } else {
                    iA = i19;
                }
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    j13 = j1.f74525a.a(lVarV, 6).j();
                    i14 &= -897;
                }
                if (i15 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i17 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 32) != 0) {
                    i14 &= -458753;
                    iA = i4.INSTANCE.a();
                } else {
                    iA = i19;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
            }
            f13 = BitmapDescriptorFactory.HUE_RED;
            if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                f13 = f11;
            }
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
            f14 = f13;
            androidx.compose.ui.d dVarQ15 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
            boolean zQ15 = lVarV.q(f14);
            boolean z117 = true;
            if ((57344 & i14) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK15 = zQ15 | z11 | lVarV.K(stroke);
            if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
            }
            z12 = zK15 | z117;
            objI = lVarV.I();
            if (z12) {
                objI = new a(f14, jI, stroke, j13);
                lVarV.B(objI);
            } else {
                objI = new a(f14, jI, stroke, j13);
                lVarV.B(objI);
            }
            i.a(dVarQ15, (l) objI, lVarV, 0);
            if (o.J()) {
                o.R();
            }
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    j13 = j1.f74525a.a(lVarV, 6).j();
                    i14 &= -897;
                }
                if (i15 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i17 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 32) != 0) {
                    i14 &= -458753;
                    iA = i4.INSTANCE.a();
                } else {
                    iA = i19;
                }
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if ((i13 & 4) != 0) {
                    j13 = j1.f74525a.a(lVarV, 6).j();
                    i14 &= -897;
                }
                if (i15 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i17 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 32) != 0) {
                    i14 &= -458753;
                    iA = i4.INSTANCE.a();
                } else {
                    iA = i19;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1746618448, i14, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
            }
            f13 = BitmapDescriptorFactory.HUE_RED;
            if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                f13 = f11;
            }
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(fA), BitmapDescriptorFactory.HUE_RED, iA, 0, null, 26, null);
            f14 = f13;
            androidx.compose.ui.d dVarQ16 = x.q(t0.c(dVar2, f14, null, 0, 6, null), f75390c);
            boolean zQ16 = lVarV.q(f14);
            boolean z118 = true;
            if ((57344 & i14) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK16 = zQ16 | z11 | lVarV.K(stroke);
            if (((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256) {
            }
            z12 = zK16 | z118;
            objI = lVarV.I();
            if (z12) {
                objI = new a(f14, jI, stroke, j13);
                lVarV.B(objI);
            } else {
                objI = new a(f14, jI, stroke, j13);
                lVarV.B(objI);
            }
            i.a(dVarQ16, (l) objI, lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        j14 = j13;
        j15 = jI;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(f11, dVar2, j14, fA, j15, iA, i12, i13));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0281  */
    /* JADX WARN: Code duplicated, block: B:104:0x0287  */
    /* JADX WARN: Code duplicated, block: B:110:0x0296  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc A[PHI: r1 r4 r9 r11 r13
      0x00cc: PHI (r1v11 androidx.compose.ui.d) = (r1v3 androidx.compose.ui.d), (r1v14 androidx.compose.ui.d) binds: [B:87:0x0100, B:73:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r4v24 int) = (r4v13 int), (r4v26 int) binds: [B:87:0x0100, B:73:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r9v8 long) = (r9v2 long), (r9v1 long) binds: [B:87:0x0100, B:73:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r11v18 float) = (r11v3 float), (r11v2 float) binds: [B:87:0x0100, B:73:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r13v30 long) = (r13v2 long), (r13v1 long) binds: [B:87:0x0100, B:73:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x0251  */
    /* JADX WARN: Code duplicated, block: B:95:0x0254  */
    /* JADX WARN: Code duplicated, block: B:98:0x0274  */
    /* JADX WARN: Code duplicated, block: B:99:0x0277  */
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
    public static final void b(androidx.compose.ui.d dVar, long j11, float f11, long j12, int i11, p020r2.l lVar, int i12, int i13) {
        androidx.compose.ui.d dVar2;
        int i14;
        long j13;
        float fA;
        int i15;
        long jI;
        int i16;
        int i17;
        androidx.compose.ui.d dVar3;
        int iC;
        int i18;
        long j14;
        float f12;
        long j15;
        Stroke stroke;
        y3 y3VarB;
        y3<Float> y3VarA;
        y3<Float> y3VarA2;
        y3<Float> y3VarA3;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objI;
        long j16;
        int i19;
        long j17;
        float f13;
        long j18;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        int i21;
        p020r2.l lVarV = lVar.v(-1119119072);
        int i22 = i13 & 1;
        if (i22 != 0) {
            i14 = i12 | 6;
            dVar2 = dVar;
        } else if ((i12 & 6) == 0) {
            dVar2 = dVar;
            i14 = (lVarV.n(dVar2) ? 4 : 2) | i12;
        } else {
            dVar2 = dVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            j13 = j11;
            i14 |= ((i13 & 2) == 0 && lVarV.s(j13)) ? 32 : 16;
        } else {
            j13 = j11;
        }
        int i23 = i13 & 4;
        if (i23 == 0) {
            if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
                fA = f11;
                i14 |= lVarV.q(fA) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 3072) == 0) {
                    jI = j12;
                    if (lVarV.s(jI)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                if ((i12 & 24576) == 0) {
                    if ((i13 & 16) == 0) {
                        i17 = i11;
                        if (lVarV.r(i17)) {
                            i21 = 16384;
                        }
                        i14 |= i21;
                    } else {
                        i17 = i11;
                    }
                    i21 = PKIFailureInfo.certRevoked;
                    i14 |= i21;
                } else {
                    i17 = i11;
                }
                if ((i14 & 9363) == 9362 || !lVarV.b()) {
                    lVarV.L();
                    if ((i12 & 1) != 0 || lVarV.k()) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i13 & 2) != 0) {
                            i14 &= -113;
                            j13 = j1.f74525a.a(lVarV, 6).j();
                        }
                        if (i23 != 0) {
                            fA = v1.f75309a.a();
                        }
                        if (i15 != 0) {
                            jI = p1.INSTANCE.i();
                        }
                        if ((i13 & 16) != 0) {
                            iC = i4.INSTANCE.c();
                            i18 = i14 & (-57345);
                        }
                        j14 = j13;
                        f12 = fA;
                        j15 = jI;
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
                        }
                        stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
                        int i24 = iC;
                        n0 n0VarC = o0.c(null, lVarV, 0, 1);
                        p019p1.p1<Integer, m> p1VarF = r1.f(r.f86532a);
                        androidx.compose.ui.d dVar5 = dVar3;
                        m0 m0VarE = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
                        int i25 = n0.f100525f;
                        int i26 = m0.f100493d;
                        boolean z14 = true;
                        y3VarB = o0.b(n0VarC, 0, 5, p1VarF, m0VarE, null, lVarV, i25 | 432 | (i26 << 12), 16);
                        y3VarA = o0.a(n0VarC, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i25 | 432 | (i26 << 9), 8);
                        y3VarA2 = o0.a(n0VarC, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i25 | 432 | (i26 << 9), 8);
                        y3VarA3 = o0.a(n0VarC, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i25 | 432 | (i26 << 9), 8);
                        androidx.compose.ui.d dVarQ = x.q(t0.a(dVar5), f75390c);
                        if ((i18 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean zK = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
                        if ((i18 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z15 = zK | z12;
                        if ((((i18 & 112) ^ 48) > 32 || !lVarV.s(j14)) && (i18 & 48) != 32) {
                        }
                        z13 = z15 | z14;
                        objI = lVarV.I();
                        if (!z13 || objI == p020r2.l.INSTANCE.a()) {
                            j16 = j14;
                            objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                            lVarV.B(objI);
                        } else {
                            j16 = j14;
                        }
                        i.a(dVarQ, (l) objI, lVarV, 0);
                        if (o.J()) {
                            o.R();
                        }
                        i19 = i24;
                        j17 = j15;
                        f13 = f12;
                        j18 = j16;
                        dVar4 = dVar5;
                    } else {
                        lVarV.j();
                        if ((i13 & 2) != 0) {
                            i14 &= -113;
                        }
                        if ((i13 & 16) != 0) {
                            i14 &= -57345;
                        }
                        dVar3 = dVar2;
                    }
                    i18 = i14;
                    iC = i17;
                    j14 = j13;
                    f12 = fA;
                    j15 = jI;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
                    }
                    stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
                    int i27 = iC;
                    n0 n0VarC2 = o0.c(null, lVarV, 0, 1);
                    p019p1.p1<Integer, m> p1VarF2 = r1.f(r.f86532a);
                    androidx.compose.ui.d dVar6 = dVar3;
                    m0 m0VarE2 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
                    int i28 = n0.f100525f;
                    int i29 = m0.f100493d;
                    boolean z16 = true;
                    y3VarB = o0.b(n0VarC2, 0, 5, p1VarF2, m0VarE2, null, lVarV, i28 | 432 | (i29 << 12), 16);
                    y3VarA = o0.a(n0VarC2, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i28 | 432 | (i29 << 9), 8);
                    y3VarA2 = o0.a(n0VarC2, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i28 | 432 | (i29 << 9), 8);
                    y3VarA3 = o0.a(n0VarC2, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i28 | 432 | (i29 << 9), 8);
                    androidx.compose.ui.d dVarQ2 = x.q(t0.a(dVar6), f75390c);
                    if ((i18 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK2 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
                    if ((i18 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = zK2 | z12;
                    z16 = ((i18 & 112) ^ 48) > 32 ? false : false;
                    z13 = z17 | z16;
                    objI = lVarV.I();
                    if (z13) {
                        j16 = j14;
                        objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                        lVarV.B(objI);
                    } else {
                        j16 = j14;
                        objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                        lVarV.B(objI);
                    }
                    i.a(dVarQ2, (l) objI, lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                    i19 = i27;
                    j17 = j15;
                    f13 = f12;
                    j18 = j16;
                    dVar4 = dVar6;
                } else {
                    lVarV.j();
                    dVar4 = dVar2;
                    i19 = i17;
                    j18 = j13;
                    f13 = fA;
                    j17 = jI;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(dVar4, j18, f13, j17, i19, i12, i13));
                }
            }
            i14 |= 3072;
            jI = j12;
            if ((i12 & 24576) == 0) {
                if ((i13 & 16) == 0) {
                    i17 = i11;
                    if (lVarV.r(i17)) {
                        i21 = 16384;
                    }
                    i14 |= i21;
                } else {
                    i17 = i11;
                }
                i21 = PKIFailureInfo.certRevoked;
                i14 |= i21;
            } else {
                i17 = i11;
            }
            if ((i14 & 9363) == 9362) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                }
                j14 = j13;
                f12 = fA;
                j15 = jI;
                lVarV.C();
                if (o.J()) {
                    o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
                int i210 = iC;
                n0 n0VarC3 = o0.c(null, lVarV, 0, 1);
                p019p1.p1<Integer, m> p1VarF3 = r1.f(r.f86532a);
                androidx.compose.ui.d dVar7 = dVar3;
                m0 m0VarE3 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
                int i211 = n0.f100525f;
                int i212 = m0.f100493d;
                boolean z18 = true;
                y3VarB = o0.b(n0VarC3, 0, 5, p1VarF3, m0VarE3, null, lVarV, i211 | 432 | (i212 << 12), 16);
                y3VarA = o0.a(n0VarC3, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i211 | 432 | (i212 << 9), 8);
                y3VarA2 = o0.a(n0VarC3, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i211 | 432 | (i212 << 9), 8);
                y3VarA3 = o0.a(n0VarC3, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i211 | 432 | (i212 << 9), 8);
                androidx.compose.ui.d dVarQ3 = x.q(t0.a(dVar7), f75390c);
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK3 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
                if ((i18 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z19 = zK3 | z12;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z13 = z19 | z18;
                objI = lVarV.I();
                if (z13) {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                } else {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                }
                i.a(dVarQ3, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                i19 = i210;
                j17 = j15;
                f13 = f12;
                j18 = j16;
                dVar4 = dVar7;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                }
                j14 = j13;
                f12 = fA;
                j15 = jI;
                lVarV.C();
                if (o.J()) {
                    o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
                int i213 = iC;
                n0 n0VarC4 = o0.c(null, lVarV, 0, 1);
                p019p1.p1<Integer, m> p1VarF4 = r1.f(r.f86532a);
                androidx.compose.ui.d dVar8 = dVar3;
                m0 m0VarE4 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
                int i214 = n0.f100525f;
                int i215 = m0.f100493d;
                boolean z110 = true;
                y3VarB = o0.b(n0VarC4, 0, 5, p1VarF4, m0VarE4, null, lVarV, i214 | 432 | (i215 << 12), 16);
                y3VarA = o0.a(n0VarC4, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i214 | 432 | (i215 << 9), 8);
                y3VarA2 = o0.a(n0VarC4, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i214 | 432 | (i215 << 9), 8);
                y3VarA3 = o0.a(n0VarC4, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i214 | 432 | (i215 << 9), 8);
                androidx.compose.ui.d dVarQ4 = x.q(t0.a(dVar8), f75390c);
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK4 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
                if ((i18 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z111 = zK4 | z12;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z13 = z111 | z110;
                objI = lVarV.I();
                if (z13) {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                } else {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                }
                i.a(dVarQ4, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                i19 = i213;
                j17 = j15;
                f13 = f12;
                j18 = j16;
                dVar4 = dVar8;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(dVar4, j18, f13, j17, i19, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        fA = f11;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 3072) == 0) {
                jI = j12;
                if (lVarV.s(jI)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            if ((i12 & 24576) == 0) {
                if ((i13 & 16) == 0) {
                    i17 = i11;
                    if (lVarV.r(i17)) {
                        i21 = 16384;
                    }
                    i14 |= i21;
                } else {
                    i17 = i11;
                }
                i21 = PKIFailureInfo.certRevoked;
                i14 |= i21;
            } else {
                i17 = i11;
            }
            if ((i14 & 9363) == 9362) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                }
                j14 = j13;
                f12 = fA;
                j15 = jI;
                lVarV.C();
                if (o.J()) {
                    o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
                int i216 = iC;
                n0 n0VarC5 = o0.c(null, lVarV, 0, 1);
                p019p1.p1<Integer, m> p1VarF5 = r1.f(r.f86532a);
                androidx.compose.ui.d dVar9 = dVar3;
                m0 m0VarE5 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
                int i217 = n0.f100525f;
                int i218 = m0.f100493d;
                boolean z112 = true;
                y3VarB = o0.b(n0VarC5, 0, 5, p1VarF5, m0VarE5, null, lVarV, i217 | 432 | (i218 << 12), 16);
                y3VarA = o0.a(n0VarC5, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i217 | 432 | (i218 << 9), 8);
                y3VarA2 = o0.a(n0VarC5, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i217 | 432 | (i218 << 9), 8);
                y3VarA3 = o0.a(n0VarC5, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i217 | 432 | (i218 << 9), 8);
                androidx.compose.ui.d dVarQ5 = x.q(t0.a(dVar9), f75390c);
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK5 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
                if ((i18 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z113 = zK5 | z12;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z13 = z113 | z112;
                objI = lVarV.I();
                if (z13) {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                } else {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                }
                i.a(dVarQ5, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                i19 = i216;
                j17 = j15;
                f13 = f12;
                j18 = j16;
                dVar4 = dVar9;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        i14 &= -113;
                        j13 = j1.f74525a.a(lVarV, 6).j();
                    }
                    if (i23 != 0) {
                        fA = v1.f75309a.a();
                    }
                    if (i15 != 0) {
                        jI = p1.INSTANCE.i();
                    }
                    if ((i13 & 16) != 0) {
                        iC = i4.INSTANCE.c();
                        i18 = i14 & (-57345);
                    } else {
                        i18 = i14;
                        iC = i17;
                    }
                }
                j14 = j13;
                f12 = fA;
                j15 = jI;
                lVarV.C();
                if (o.J()) {
                    o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
                }
                stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
                int i219 = iC;
                n0 n0VarC6 = o0.c(null, lVarV, 0, 1);
                p019p1.p1<Integer, m> p1VarF6 = r1.f(r.f86532a);
                androidx.compose.ui.d dVar10 = dVar3;
                m0 m0VarE6 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
                int i2110 = n0.f100525f;
                int i2111 = m0.f100493d;
                boolean z114 = true;
                y3VarB = o0.b(n0VarC6, 0, 5, p1VarF6, m0VarE6, null, lVarV, i2110 | 432 | (i2111 << 12), 16);
                y3VarA = o0.a(n0VarC6, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i2110 | 432 | (i2111 << 9), 8);
                y3VarA2 = o0.a(n0VarC6, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i2110 | 432 | (i2111 << 9), 8);
                y3VarA3 = o0.a(n0VarC6, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i2110 | 432 | (i2111 << 9), 8);
                androidx.compose.ui.d dVarQ6 = x.q(t0.a(dVar10), f75390c);
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK6 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
                if ((i18 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z115 = zK6 | z12;
                if (((i18 & 112) ^ 48) > 32) {
                }
                z13 = z115 | z114;
                objI = lVarV.I();
                if (z13) {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                } else {
                    j16 = j14;
                    objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                    lVarV.B(objI);
                }
                i.a(dVarQ6, (l) objI, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                i19 = i219;
                j17 = j15;
                f13 = f12;
                j18 = j16;
                dVar4 = dVar10;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(dVar4, j18, f13, j17, i19, i12, i13));
            }
        }
        i14 |= 3072;
        jI = j12;
        if ((i12 & 24576) == 0) {
            if ((i13 & 16) == 0) {
                i17 = i11;
                if (lVarV.r(i17)) {
                    i21 = 16384;
                }
                i14 |= i21;
            } else {
                i17 = i11;
            }
            i21 = PKIFailureInfo.certRevoked;
            i14 |= i21;
        } else {
            i17 = i11;
        }
        if ((i14 & 9363) == 9362) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                    j13 = j1.f74525a.a(lVarV, 6).j();
                }
                if (i23 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i15 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 16) != 0) {
                    iC = i4.INSTANCE.c();
                    i18 = i14 & (-57345);
                } else {
                    i18 = i14;
                    iC = i17;
                }
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                    j13 = j1.f74525a.a(lVarV, 6).j();
                }
                if (i23 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i15 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 16) != 0) {
                    iC = i4.INSTANCE.c();
                    i18 = i14 & (-57345);
                } else {
                    i18 = i14;
                    iC = i17;
                }
            }
            j14 = j13;
            f12 = fA;
            j15 = jI;
            lVarV.C();
            if (o.J()) {
                o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
            }
            stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
            int i2112 = iC;
            n0 n0VarC7 = o0.c(null, lVarV, 0, 1);
            p019p1.p1<Integer, m> p1VarF7 = r1.f(r.f86532a);
            androidx.compose.ui.d dVar11 = dVar3;
            m0 m0VarE7 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
            int i2113 = n0.f100525f;
            int i2114 = m0.f100493d;
            boolean z116 = true;
            y3VarB = o0.b(n0VarC7, 0, 5, p1VarF7, m0VarE7, null, lVarV, i2113 | 432 | (i2114 << 12), 16);
            y3VarA = o0.a(n0VarC7, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i2113 | 432 | (i2114 << 9), 8);
            y3VarA2 = o0.a(n0VarC7, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i2113 | 432 | (i2114 << 9), 8);
            y3VarA3 = o0.a(n0VarC7, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i2113 | 432 | (i2114 << 9), 8);
            androidx.compose.ui.d dVarQ7 = x.q(t0.a(dVar11), f75390c);
            if ((i18 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK7 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
            if ((i18 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z117 = zK7 | z12;
            if (((i18 & 112) ^ 48) > 32) {
            }
            z13 = z117 | z116;
            objI = lVarV.I();
            if (z13) {
                j16 = j14;
                objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                lVarV.B(objI);
            } else {
                j16 = j14;
                objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                lVarV.B(objI);
            }
            i.a(dVarQ7, (l) objI, lVarV, 0);
            if (o.J()) {
                o.R();
            }
            i19 = i2112;
            j17 = j15;
            f13 = f12;
            j18 = j16;
            dVar4 = dVar11;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                    j13 = j1.f74525a.a(lVarV, 6).j();
                }
                if (i23 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i15 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 16) != 0) {
                    iC = i4.INSTANCE.c();
                    i18 = i14 & (-57345);
                } else {
                    i18 = i14;
                    iC = i17;
                }
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    i14 &= -113;
                    j13 = j1.f74525a.a(lVarV, 6).j();
                }
                if (i23 != 0) {
                    fA = v1.f75309a.a();
                }
                if (i15 != 0) {
                    jI = p1.INSTANCE.i();
                }
                if ((i13 & 16) != 0) {
                    iC = i4.INSTANCE.c();
                    i18 = i14 & (-57345);
                } else {
                    i18 = i14;
                    iC = i17;
                }
            }
            j14 = j13;
            f12 = fA;
            j15 = jI;
            lVarV.C();
            if (o.J()) {
                o.S(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)");
            }
            stroke = new Stroke(((w4.d) lVarV.U(z0.g())).O1(f12), BitmapDescriptorFactory.HUE_RED, iC, 0, null, 26, null);
            int i2115 = iC;
            n0 n0VarC8 = o0.c(null, lVarV, 0, 1);
            p019p1.p1<Integer, m> p1VarF8 = r1.f(r.f86532a);
            androidx.compose.ui.d dVar12 = dVar3;
            m0 m0VarE8 = j.e(j.l(6660, 0, f0.d(), 2, null), null, 0L, 6, null);
            int i2116 = n0.f100525f;
            int i2117 = m0.f100493d;
            boolean z118 = true;
            y3VarB = o0.b(n0VarC8, 0, 5, p1VarF8, m0VarE8, null, lVarV, i2116 | 432 | (i2117 << 12), 16);
            y3VarA = o0.a(n0VarC8, BitmapDescriptorFactory.HUE_RED, 286.0f, j.e(j.l(1332, 0, f0.d(), 2, null), null, 0L, 6, null), null, lVarV, i2116 | 432 | (i2117 << 9), 8);
            y3VarA2 = o0.a(n0VarC8, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(e.f75423c), null, 0L, 6, null), null, lVarV, i2116 | 432 | (i2117 << 9), 8);
            y3VarA3 = o0.a(n0VarC8, BitmapDescriptorFactory.HUE_RED, 290.0f, j.e(j.f(f.f75424c), null, 0L, 6, null), null, lVarV, i2116 | 432 | (i2117 << 9), 8);
            androidx.compose.ui.d dVarQ8 = x.q(t0.a(dVar12), f75390c);
            if ((i18 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK8 = z11 | lVarV.K(stroke) | lVarV.n(y3VarB) | lVarV.n(y3VarA2) | lVarV.n(y3VarA3) | lVarV.n(y3VarA);
            if ((i18 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z119 = zK8 | z12;
            if (((i18 & 112) ^ 48) > 32) {
            }
            z13 = z119 | z118;
            objI = lVarV.I();
            if (z13) {
                j16 = j14;
                objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                lVarV.B(objI);
            } else {
                j16 = j14;
                objI = new c(j15, stroke, f12, j16, y3VarB, y3VarA2, y3VarA3, y3VarA);
                lVarV.B(objI);
            }
            i.a(dVarQ8, (l) objI, lVarV, 0);
            if (o.J()) {
                o.R();
            }
            i19 = i2115;
            j17 = j15;
            f13 = f12;
            j18 = j16;
            dVar4 = dVar12;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(dVar4, j18, f13, j17, i19, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(y3<Integer> y3Var) {
        return y3Var.getValue().intValue();
    }

    private static final void o(m3.f fVar, float f11, float f12, long j11, Stroke stroke) {
        float f13 = 2;
        float width = stroke.getWidth() / f13;
        float fK = j3.m.k(fVar.b()) - (f13 * width);
        m3.f.S(fVar, j11, f11, f12, false, j3.h.a(width, width), n.a(fK, fK), BitmapDescriptorFactory.HUE_RED, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(m3.f fVar, long j11, Stroke stroke) {
        o(fVar, BitmapDescriptorFactory.HUE_RED, 360.0f, j11, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(m3.f fVar, float f11, float f12, long j11, Stroke stroke) {
        o(fVar, f11, f12, j11, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(m3.f fVar, float f11, float f12, float f13, long j11, Stroke stroke) {
        o(fVar, f11 + (i4.e(stroke.getCap(), i4.INSTANCE.a()) ? BitmapDescriptorFactory.HUE_RED : ((f12 / h.g(f75390c / 2)) * 57.29578f) / 2.0f), Math.max(f13, 0.1f), j11, stroke);
    }
}
