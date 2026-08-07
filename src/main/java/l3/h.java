package l3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Arrays;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000  2\u00020\u0001:\u0002\u0011\u0016B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Ll3/h;", "", "Ll3/c;", "source", "destination", "transformSource", "transformDestination", "Ll3/n;", "renderIntent", "", "transform", "<init>", "(Ll3/c;Ll3/c;Ll3/c;Ll3/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", AnalyticsAttribute.Intent, "(Ll3/c;Ll3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lk3/p1;", "color", "a", "(J)J", "Ll3/c;", "getSource", "()Ll3/c;", "b", "getDestination", "c", DateTokenConverter.CONVERTER_KEY, "e", "I", "getRenderIntent-uksYyKA", "()I", "f", "[F", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c transformSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c transformDestination;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: l3.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Ll3/h$a;", "", "<init>", "()V", "Ll3/c;", "source", "destination", "Ll3/n;", AnalyticsAttribute.Intent, "", "b", "(Ll3/c;Ll3/c;I)[F", "Ll3/h;", "c", "(Ll3/c;)Ll3/h;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c source, c destination, int intent) {
            if (!n.e(intent, n.INSTANCE.a())) {
                return null;
            }
            long model = source.getModel();
            l3.b.Companion companion = l3.b.INSTANCE;
            boolean zE = l3.b.e(model, companion.b());
            boolean zE2 = l3.b.e(destination.getModel(), companion.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                source = destination;
            }
            p013kotlin.jvm.internal.s.i(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) source;
            float[] fArrC = zE ? xVar.getWhitePoint().c() : k.f89545a.c();
            float[] fArrC2 = zE2 ? xVar.getWhitePoint().c() : k.f89545a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final h c(c source) {
            return new C1886a(source, n.INSTANCE.c());
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: l3.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"l3/h$a$a", "Ll3/h;", "Lk3/p1;", "color", "a", "(J)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1886a extends h {
            C1886a(c cVar, int i11) {
                super(cVar, cVar, i11, null);
            }

            @Override // l3.h
            public long a(long color) {
                return color;
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Ll3/h$b;", "Ll3/h;", "Ll3/x;", "mSource", "mDestination", "Ll3/n;", AnalyticsAttribute.Intent, "<init>", "(Ll3/x;Ll3/x;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "source", "destination", "", "b", "(Ll3/x;Ll3/x;I)[F", "Lk3/p1;", "color", "a", "(J)J", "h", "Ll3/x;", IntegerTokenConverter.CONVERTER_KEY, "j", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final x mSource;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final x mDestination;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] mTransform;

        public /* synthetic */ b(x xVar, x xVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(xVar, xVar2, i11);
        }

        private final float[] b(x source, x destination, int intent) {
            if (d.f(source.getWhitePoint(), destination.getWhitePoint())) {
                return d.l(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrC = source.getWhitePoint().c();
            float[] fArrC2 = destination.getWhitePoint().c();
            WhitePoint whitePoint = source.getWhitePoint();
            k kVar = k.f89545a;
            if (!d.f(whitePoint, kVar.b())) {
                float[] transform2 = a.INSTANCE.a().getTransform();
                float[] fArrC3 = kVar.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                p013kotlin.jvm.internal.s.j(fArrCopyOf, "copyOf(this, size)");
                transform = d.l(d.e(transform2, fArrC, fArrCopyOf), source.getTransform());
            }
            if (!d.f(destination.getWhitePoint(), kVar.b())) {
                float[] transform3 = a.INSTANCE.a().getTransform();
                float[] fArrC4 = kVar.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                p013kotlin.jvm.internal.s.j(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform = d.k(d.l(d.e(transform3, fArrC2, fArrCopyOf2), destination.getTransform()));
            }
            if (n.e(intent, n.INSTANCE.a())) {
                transform = d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, transform);
            }
            return d.l(inverseTransform, transform);
        }

        @Override // l3.h
        public long a(long color) {
            float fW = p1.w(color);
            float fV = p1.v(color);
            float fT = p1.t(color);
            float fS = p1.s(color);
            float fA = (float) this.mSource.getEotfFunc().a(fW);
            float fA2 = (float) this.mSource.getEotfFunc().a(fV);
            float fA3 = (float) this.mSource.getEotfFunc().a(fT);
            float[] fArr = this.mTransform;
            return r1.a((float) this.mDestination.getOetfFunc().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fS, this.mDestination);
        }

        private b(x xVar, x xVar2, int i11) {
            super(xVar, xVar2, xVar, xVar2, i11, null, null);
            this.mSource = xVar;
            this.mDestination = xVar2;
            this.mTransform = b(xVar, xVar2, i11);
        }
    }

    public /* synthetic */ h(c cVar, c cVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i11);
    }

    public long a(long color) {
        float fW = p1.w(color);
        float fV = p1.v(color);
        float fT = p1.t(color);
        float fS = p1.s(color);
        long j11 = this.transformSource.j(fW, fV, fT);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float fM = this.transformSource.m(fW, fV, fT);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f11 = fIntBitsToFloat;
        return this.transformDestination.n(f11, fIntBitsToFloat2, fM, fS, this.destination);
    }

    public /* synthetic */ h(c cVar, c cVar2, c cVar3, c cVar4, int i11, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i11, fArr);
    }

    private h(c cVar, c cVar2, c cVar3, c cVar4, int i11, float[] fArr) {
        this.source = cVar;
        this.destination = cVar2;
        this.transformSource = cVar3;
        this.transformDestination = cVar4;
        this.renderIntent = i11;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private h(c cVar, c cVar2, int i11) {
        long model = cVar.getModel();
        l3.b.Companion companion = l3.b.INSTANCE;
        this(cVar, cVar2, l3.b.e(model, companion.b()) ? d.d(cVar, k.f89545a.b(), null, 2, null) : cVar, l3.b.e(cVar2.getModel(), companion.b()) ? d.d(cVar2, k.f89545a.b(), null, 2, null) : cVar2, i11, INSTANCE.b(cVar, cVar2, i11), null);
    }
}
