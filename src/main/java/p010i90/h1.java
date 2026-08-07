package p010i90;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e4.i;
import f90.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p009i2.i0;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import r90.f;
import w4.h;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Li90/g1;", "element", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "Ljn0/h0;", "a", "(ZLi90/g1;Ljava/util/Set;Li90/g0;IILr2/l;II)V", "Li90/c0;", AnalyticsAttribute.Error, "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h1 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<j1> f76591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76595g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f76596h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends j1> list, boolean z11, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12) {
            super(2);
            this.f76591c = list;
            this.f76592d = z11;
            this.f76593e = set;
            this.f76594f = identifierSpec;
            this.f76595g = i11;
            this.f76596h = i12;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(272035656, i11, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:52)");
            }
            List<j1> list = this.f76591c;
            boolean z11 = this.f76592d;
            Set<IdentifierSpec> set = this.f76593e;
            IdentifierSpec identifierSpec = this.f76594f;
            int i12 = this.f76595g;
            int i13 = this.f76596h;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                k1.a(z11, (j1) it.next(), null, set, identifierSpec, i12, i13, lVar, 4096, 4);
            }
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<j1> f76597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f76602h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends j1> list, boolean z11, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12) {
            super(2);
            this.f76597c = list;
            this.f76598d = z11;
            this.f76599e = set;
            this.f76600f = identifierSpec;
            this.f76601g = i11;
            this.f76602h = i12;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1999432089, i11, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:64)");
            }
            List<j1> list = this.f76597c;
            boolean z11 = this.f76598d;
            Set<IdentifierSpec> set = this.f76599e;
            IdentifierSpec identifierSpec = this.f76600f;
            int i12 = this.f76601g;
            int i13 = this.f76602h;
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    v.x();
                }
                k1.a(z11, (j1) obj, null, set, identifierSpec, i12, i13, lVar, 4096, 4);
                boolean z12 = z11;
                Set<IdentifierSpec> set2 = set;
                IdentifierSpec identifierSpec2 = identifierSpec;
                int i16 = i12;
                int i17 = i13;
                lVar.H(1380689524);
                if (i14 != v.o(list)) {
                    j1 j1Var = j1.f74525a;
                    int i18 = j1.f74526b;
                    i0.a(t.k(d.INSTANCE, h.g(n.o(j1Var, lVar, i18).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, 2, null), n.n(j1Var, lVar, i18).getComponentDivider(), h.g(n.o(j1Var, lVar, i18).getBorderStrokeWidth()), BitmapDescriptorFactory.HUE_RED, lVar, 0, 8);
                }
                lVar.T();
                z11 = z12;
                set = set2;
                i14 = i15;
                identifierSpec = identifierSpec2;
                i12 = i16;
                i13 = i17;
            }
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
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SectionElement f76604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f76605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f76606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f76608h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76609i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76610j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, SectionElement sectionElement, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13, int i14) {
            super(2);
            this.f76603c = z11;
            this.f76604d = sectionElement;
            this.f76605e = set;
            this.f76606f = identifierSpec;
            this.f76607g = i11;
            this.f76608h = i12;
            this.f76609i = i13;
            this.f76610j = i14;
        }

        public final void a(l lVar, int i11) {
            h1.a(this.f76603c, this.f76604d, this.f76605e, this.f76606f, this.f76607g, this.f76608h, lVar, k2.a(this.f76609i | 1), this.f76610j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(boolean z11, SectionElement element, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13, int i14) {
        int iA;
        int i15;
        int iH;
        s.k(element, "element");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        l lVarV = lVar.v(-939762920);
        if ((i14 & 16) != 0) {
            i15 = i13 & (-57345);
            iA = androidx.compose.ui.focus.d.INSTANCE.a();
        } else {
            iA = i11;
            i15 = i13;
        }
        if ((i14 & 32) != 0) {
            i15 &= -458753;
            iH = androidx.compose.ui.focus.d.INSTANCE.h();
        } else {
            iH = i12;
        }
        if (o.J()) {
            o.S(-939762920, i15, -1, "com.stripe.android.uicore.elements.SectionElementUI (SectionElementUI.kt:27)");
        }
        if (!hiddenIdentifiers.contains(element.getIdentifier())) {
            f1 controller = element.getController();
            c0 c0VarB = b(f.a(controller.a(), lVarV, 8));
            lVarV.H(-389236972);
            String strD = null;
            if (c0VarB != null) {
                Object[] formatArgs = c0VarB.getFormatArgs();
                lVarV.H(-389235994);
                strD = formatArgs != null ? i.d(c0VarB.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), lVarV, 64) : null;
                lVarV.T();
                lVarV.H(-389236424);
                if (strD == null) {
                    strD = i.c(c0VarB.getErrorMessage(), lVarV, 0);
                }
                lVarV.T();
            }
            String str = strD;
            lVarV.T();
            List<j1> listG = element.g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (!((j1) obj).f()) {
                    arrayList.add(obj);
                }
            }
            List<j1> listG2 = element.g();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listG2) {
                if (((j1) obj2).f()) {
                    arrayList2.add(obj2);
                }
            }
            o1.a(controller.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), str, null, false, false, z2.c.b(lVarV, 272035656, true, new a(arrayList2, z11, hiddenIdentifiers, identifierSpec, iA, iH)), z2.c.b(lVarV, -1999432089, true, new b(arrayList, z11, hiddenIdentifiers, identifierSpec, iA, iH)), lVarV, 1769472, 28);
        }
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(z11, element, hiddenIdentifiers, identifierSpec, iA, iH, i13, i14));
        }
    }

    private static final c0 b(y3<c0> y3Var) {
        return y3Var.getValue();
    }
}
