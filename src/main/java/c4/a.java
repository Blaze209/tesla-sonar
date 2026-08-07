package c4;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import g4.c;
import g4.l;
import g4.m;
import g4.p;
import g4.s;
import j3.g;
import j3.h;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lg4/p;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lg4/p;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "e", "", "b", "(Lg4/p;)Z", "", "items", "a", "(Ljava/util/List;)Z", "Lg4/b;", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$d;", "kotlin.jvm.PlatformType", "f", "(Lg4/b;)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$d;", "Lg4/c;", "itemNode", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$e;", "g", "(Lg4/c;Lg4/p;)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat$e;", "c", "(Lg4/b;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class C0372a extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0372a f18599c = new C0372a();

        C0372a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f18600c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List listM;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listM = v.m();
        } else {
            listM = new ArrayList();
            p pVar = list.get(0);
            int iO = v.o(list);
            int i11 = 0;
            while (i11 < iO) {
                i11++;
                p pVar2 = list.get(i11);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                listM.add(g.d(h.a(Math.abs(g.m(pVar4.i().g()) - g.m(pVar3.i().g())), Math.abs(g.n(pVar4.i().g()) - g.n(pVar3.i().g())))));
                pVar = pVar2;
            }
        }
        if (listM.size() == 1) {
            packedValue = ((g) v.o0(listM)).getPackedValue();
        } else {
            if (listM.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objO0 = v.o0(listM);
            int iO2 = v.o(listM);
            if (1 <= iO2) {
                int i12 = 1;
                while (true) {
                    objO0 = g.d(g.r(((g) objO0).getPackedValue(), ((g) listM.get(i12)).getPackedValue()));
                    if (i12 == iO2) {
                        break;
                    }
                    i12++;
                }
            }
            packedValue = ((g) objO0).getPackedValue();
        }
        return g.n(packedValue) < g.m(packedValue);
    }

    public static final boolean b(p pVar) {
        l lVarN = pVar.n();
        s sVar = s.f67271a;
        return (m.a(lVarN, sVar.a()) == null && m.a(pVar.n(), sVar.z()) == null) ? false : true;
    }

    private static final boolean c(g4.b bVar) {
        return bVar.getRowCount() < 0 || bVar.getColumnCount() < 0;
    }

    public static final void d(p pVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        l lVarN = pVar.n();
        s sVar = s.f67271a;
        g4.b bVar = (g4.b) m.a(lVarN, sVar.a());
        if (bVar != null) {
            accessibilityNodeInfoCompat.v0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(pVar.n(), sVar.z()) != null) {
            List<p> listT = pVar.t();
            int size = listT.size();
            for (int i11 = 0; i11 < size; i11++) {
                p pVar2 = listT.get(i11);
                if (pVar2.n().e(s.f67271a.A())) {
                    arrayList.add(pVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        accessibilityNodeInfoCompat.v0(AccessibilityNodeInfoCompat.d.b(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(p pVar, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        l lVarN = pVar.n();
        s sVar = s.f67271a;
        c cVar = (c) m.a(lVarN, sVar.b());
        if (cVar != null) {
            accessibilityNodeInfoCompat.w0(g(cVar, pVar));
        }
        p pVarR = pVar.r();
        if (pVarR == null || m.a(pVarR.n(), sVar.z()) == null) {
            return;
        }
        g4.b bVar = (g4.b) m.a(pVarR.n(), sVar.a());
        if ((bVar == null || !c(bVar)) && pVar.n().e(sVar.A())) {
            ArrayList arrayList = new ArrayList();
            List<p> listT = pVarR.t();
            int size = listT.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                p pVar2 = listT.get(i12);
                if (pVar2.n().e(s.f67271a.A())) {
                    arrayList.add(pVar2);
                    if (pVar2.getLayoutNode().o0() < pVar.getLayoutNode().o0()) {
                        i11++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            AccessibilityNodeInfoCompat.e eVarB = AccessibilityNodeInfoCompat.e.b(zA ? 0 : i11, 1, zA ? i11 : 0, 1, false, ((Boolean) pVar.n().k(s.f67271a.A(), C0372a.f18599c)).booleanValue());
            if (eVarB != null) {
                accessibilityNodeInfoCompat.w0(eVarB);
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.d f(g4.b bVar) {
        return AccessibilityNodeInfoCompat.d.b(bVar.getRowCount(), bVar.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.e g(c cVar, p pVar) {
        return AccessibilityNodeInfoCompat.e.b(cVar.getRowIndex(), cVar.getRowSpan(), cVar.getColumnIndex(), cVar.getColumnSpan(), false, ((Boolean) pVar.n().k(s.f67271a.A(), b.f18600c)).booleanValue());
    }
}
