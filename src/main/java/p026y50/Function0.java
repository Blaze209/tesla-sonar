package p026y50;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f90.StripeColors;
import f90.StripeShapes;
import f90.StripeTypography;
import f90.m;
import f90.n;
import jn0.h0;
import p009i2.Colors;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;
import z2.c;

/* JADX INFO: renamed from: y50.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lwn0/p;Lr2/l;I)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: y50.g$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f125125c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f125125c = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1119716266, i11, -1, "com.stripe.android.financialconnections.ui.theme.StripeThemeForConnections.<anonymous> (StripeThemeForConnections.kt:28)");
            }
            this.f125125c.invoke(lVar, 0);
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

    /* JADX INFO: renamed from: y50.g$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f125126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f125127d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f125126c = pVar;
            this.f125127d = i11;
        }

        public final void a(l lVar, int i11) {
            Function0.a(this.f125126c, lVar, k2.a(this.f125127d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(p<? super l, ? super Integer, h0> content, l lVar, int i11) {
        int i12;
        s.k(content, "content");
        l lVarV = lVar.v(499133436);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.K(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(499133436, i12, -1, "com.stripe.android.financialconnections.ui.theme.StripeThemeForConnections (StripeThemeForConnections.kt:10)");
            }
            m mVar = m.f64661a;
            StripeColors stripeColorsA = mVar.a(false);
            d dVar = d.f125064a;
            long textDefault = dVar.a(lVarV, 6).getTextDefault();
            long border = dVar.a(lVarV, 6).getBorder();
            long textSubdued = dVar.a(lVarV, 6).getTextSubdued();
            Colors materialColors = stripeColorsA.getMaterialColors();
            n.a(stripeColorsA.a((32 & 1) != 0 ? stripeColorsA.component : 0L, (32 & 2) != 0 ? stripeColorsA.componentBorder : border, (32 & 4) != 0 ? stripeColorsA.componentDivider : 0L, (32 & 8) != 0 ? stripeColorsA.onComponent : textDefault, (32 & 16) != 0 ? stripeColorsA.subtitle : 0L, (32 & 32) != 0 ? stripeColorsA.textCursor : 0L, (32 & 64) != 0 ? stripeColorsA.placeholderText : textSubdued, (32 & 128) != 0 ? stripeColorsA.appBarIcon : 0L, (32 & 256) != 0 ? stripeColorsA.materialColors : materialColors.a((8191 & 1) != 0 ? materialColors.j() : dVar.a(lVarV, 6).getBorderBrand(), (8191 & 2) != 0 ? materialColors.k() : 0L, (8191 & 4) != 0 ? materialColors.l() : 0L, (8191 & 8) != 0 ? materialColors.m() : 0L, (8191 & 16) != 0 ? materialColors.c() : 0L, (8191 & 32) != 0 ? materialColors.n() : 0L, (8191 & 64) != 0 ? materialColors.d() : dVar.a(lVarV, 6).getTextCritical(), (8191 & 128) != 0 ? materialColors.g() : 0L, (8191 & 256) != 0 ? materialColors.h() : 0L, (8191 & 512) != 0 ? materialColors.e() : 0L, (8191 & 1024) != 0 ? materialColors.i() : 0L, (8191 & 2048) != 0 ? materialColors.f() : 0L, (8191 & 4096) != 0 ? materialColors.o() : false)), StripeShapes.b(mVar.e(), 12.0f, BitmapDescriptorFactory.HUE_RED, 2, null), mVar.f(), c.b(lVarV, 1119716266, true, new a(content)), lVarV, StripeColors.f64639j | 3072 | (StripeShapes.f64651c << 3) | (StripeTypography.f64688s << 6), 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(content, i11));
        }
    }
}
