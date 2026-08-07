package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000e\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lh80/k0;", "colors", "Lh80/m0;", "shape", "Lh80/p0;", "typography", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lh80/k0;Lh80/m0;Lh80/p0;Lwn0/p;Lr2/l;II)V", "Lr2/g2;", "Lr2/g2;", "b", "()Lr2/g2;", "LocalPrimaryButtonColors", "c", "LocalPrimaryButtonShape", DateTokenConverter.CONVERTER_KEY, "LocalPrimaryButtonTypography", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<PrimaryButtonColors> f71283a = w.f(a.f71286c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<PrimaryButtonShape> f71284b = w.f(b.f71287c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g2<PrimaryButtonTypography> f71285c = w.f(c.f71288c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh80/k0;", "b", "()Lh80/k0;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<PrimaryButtonColors> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71286c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PrimaryButtonColors invoke() {
            return new PrimaryButtonColors(0L, 0L, 0L, 0L, 0L, 31, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh80/m0;", "b", "()Lh80/m0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<PrimaryButtonShape> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f71287c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PrimaryButtonShape invoke() {
            return new PrimaryButtonShape(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh80/p0;", "b", "()Lh80/p0;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<PrimaryButtonTypography> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f71288c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PrimaryButtonTypography invoke() {
            return new PrimaryButtonTypography(null, 0L, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f71289c = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-780814166, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<anonymous> (PrimaryButtonTheme.kt:156)");
            }
            this.f71289c.invoke(lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PrimaryButtonColors f71290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PrimaryButtonShape f71291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PrimaryButtonTypography f71292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f71294g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f71295h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(PrimaryButtonColors primaryButtonColors, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f71290c = primaryButtonColors;
            this.f71291d = primaryButtonShape;
            this.f71292e = primaryButtonTypography;
            this.f71293f = pVar;
            this.f71294g = i11;
            this.f71295h = i12;
        }

        public final void a(l lVar, int i11) {
            o0.a(this.f71290c, this.f71291d, this.f71292e, this.f71293f, lVar, k2.a(this.f71294g | 1), this.f71295h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(PrimaryButtonColors primaryButtonColors, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, p<? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        PrimaryButtonColors primaryButtonColors2;
        int i13;
        PrimaryButtonShape primaryButtonShape2;
        PrimaryButtonTypography primaryButtonTypography2;
        PrimaryButtonColors primaryButtonColors3;
        PrimaryButtonShape primaryButtonShape3;
        s.k(content, "content");
        l lVarV = lVar.v(872412522);
        if ((i11 & 14) == 0) {
            if ((i12 & 1) == 0) {
                primaryButtonColors2 = primaryButtonColors;
                int i14 = lVarV.n(primaryButtonColors2) ? 4 : 2;
                i13 = i14 | i11;
            } else {
                primaryButtonColors2 = primaryButtonColors;
            }
            i13 = i14 | i11;
        } else {
            primaryButtonColors2 = primaryButtonColors;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                primaryButtonShape2 = primaryButtonShape;
                int i15 = lVarV.n(primaryButtonShape2) ? 32 : 16;
                i13 |= i15;
            } else {
                primaryButtonShape2 = primaryButtonShape;
            }
            i13 |= i15;
        } else {
            primaryButtonShape2 = primaryButtonShape;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                primaryButtonTypography2 = primaryButtonTypography;
                int i16 = lVarV.n(primaryButtonTypography2) ? 256 : 128;
                i13 |= i16;
            } else {
                primaryButtonTypography2 = primaryButtonTypography;
            }
            i13 |= i16;
        } else {
            primaryButtonTypography2 = primaryButtonTypography;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.K(content) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
            primaryButtonColors3 = primaryButtonColors2;
            primaryButtonShape3 = primaryButtonShape2;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                if ((i12 & 1) != 0) {
                    primaryButtonColors3 = new PrimaryButtonColors(0L, 0L, 0L, 0L, 0L, 31, null);
                    i13 &= -15;
                } else {
                    primaryButtonColors3 = primaryButtonColors2;
                }
                if ((i12 & 2) != 0) {
                    primaryButtonShape3 = new PrimaryButtonShape(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
                    i13 &= -113;
                } else {
                    primaryButtonShape3 = primaryButtonShape2;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    primaryButtonTypography2 = new PrimaryButtonTypography(null, 0L, 3, null);
                }
            } else {
                lVarV.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                primaryButtonColors3 = primaryButtonColors2;
                primaryButtonShape3 = primaryButtonShape2;
            }
            lVarV.C();
            if (o.J()) {
                o.S(872412522, i13, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme (PrimaryButtonTheme.kt:150)");
            }
            w.b(new h2[]{f71283a.d(primaryButtonColors3), f71284b.d(primaryButtonShape3), f71285c.d(primaryButtonTypography2)}, z2.c.b(lVarV, -780814166, true, new d(content)), lVarV, 56);
            if (o.J()) {
                o.R();
            }
        }
        PrimaryButtonTypography primaryButtonTypography3 = primaryButtonTypography2;
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(primaryButtonColors3, primaryButtonShape3, primaryButtonTypography3, content, i11, i12));
        }
    }

    public static final g2<PrimaryButtonColors> b() {
        return f71283a;
    }

    public static final g2<PrimaryButtonShape> c() {
        return f71284b;
    }

    public static final g2<PrimaryButtonTypography> d() {
        return f71285c;
    }
}
