package p016o2;

import a2.c;
import a2.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.a4;
import k3.g4;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import q2.i;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La2/a;", "e", "(La2/a;)La2/a;", "a", "Lo2/e0;", "Lq2/i;", "value", "Lk3/g4;", "b", "(Lo2/e0;Lq2/i;)Lk3/g4;", "Lr2/g2;", "Lr2/g2;", "c", "()Lr2/g2;", "LocalShapes", DateTokenConverter.CONVERTER_KEY, "(Lq2/i;Lr2/l;I)Lk3/g4;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<Shapes> f95852a = w.f(a.f95853c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo2/e0;", "b", "()Lo2/e0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Shapes> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f95853c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shapes invoke() {
            return new Shapes(null, null, null, null, null, 31, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95854a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[i.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f95854a = iArr;
        }
    }

    public static final a2.a a(a2.a aVar) {
        float f11 = (float) 0.0d;
        return a2.a.d(aVar, c.b(h.g(f11)), null, null, c.b(h.g(f11)), 6, null);
    }

    public static final g4 b(Shapes shapes, i iVar) {
        switch (b.f95854a[iVar.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return e(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return e(shapes.getExtraSmall());
            case 5:
                return g.f();
            case 6:
                return shapes.getLarge();
            case 7:
                return a(shapes.getLarge());
            case 8:
                return e(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return a4.a();
            case 11:
                return shapes.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final g2<Shapes> c() {
        return f95852a;
    }

    public static final g4 d(i iVar, l lVar, int i11) {
        if (o.J()) {
            o.S(1629172543, i11, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        g4 g4VarB = b(t.f96158a.b(lVar, 6), iVar);
        if (o.J()) {
            o.R();
        }
        return g4VarB;
    }

    public static final a2.a e(a2.a aVar) {
        float f11 = (float) 0.0d;
        return a2.a.d(aVar, null, null, c.b(h.g(f11)), c.b(h.g(f11)), 3, null);
    }
}
