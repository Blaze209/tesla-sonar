package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.AccessibilityAction;
import i4.TextLayoutResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0018\u0010%\u001a\u00020\u0013*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lg4/l;", "configuration", "Li4/m0;", "e", "(Lg4/l;)Li4/m0;", "", DateTokenConverter.CONVERTER_KEY, "(Lg4/l;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/m2;", "", "id", "a", "(Ljava/util/List;I)Landroidx/compose/ui/platform/m2;", "Lg4/i;", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/String;", "Lg4/p;", "", "f", "(Lg4/p;)Z", "Landroidx/compose/ui/platform/r0;", "Landroid/view/View;", "h", "(Landroidx/compose/ui/platform/r0;I)Landroid/view/View;", "Lg4/r;", "Landroidx/collection/o;", "Landroidx/compose/ui/platform/o2;", "b", "(Lg4/r;)Landroidx/collection/o;", "Lj3/i;", "Lj3/i;", "getDefaultFakeNodeBounds", "()Lj3/i;", "DefaultFakeNodeBounds", "g", "isVisible", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j3.i f5900a = new j3.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f, 10.0f);

    public static final m2 a(List<m2> list, int i11) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (list.get(i12).getSemanticsNodeId() == i11) {
                return list.get(i12);
            }
        }
        return null;
    }

    public static final androidx.collection.o<o2> b(g4.r rVar) {
        g4.p pVarA = rVar.a();
        androidx.collection.c0 c0VarB = androidx.collection.p.b();
        if (pVarA.getLayoutNode().y() && pVarA.getLayoutNode().K0()) {
            j3.i iVarI = pVarA.i();
            c(new Region(Math.round(iVarI.getLeft()), Math.round(iVarI.getTop()), Math.round(iVarI.getRight()), Math.round(iVarI.getBottom())), pVarA, c0VarB, pVarA, new Region());
        }
        return c0VarB;
    }

    private static final void c(Region region, g4.p pVar, androidx.collection.c0<o2> c0Var, g4.p pVar2, Region region2) {
        z3.z zVarP;
        boolean z11 = (pVar2.getLayoutNode().y() && pVar2.getLayoutNode().K0()) ? false : true;
        if (!region.isEmpty() || pVar2.getId() == pVar.getId()) {
            if (!z11 || pVar2.getIsFake()) {
                j3.i iVarV = pVar2.v();
                int iRound = Math.round(iVarV.getLeft());
                int iRound2 = Math.round(iVarV.getTop());
                int iRound3 = Math.round(iVarV.getRight());
                int iRound4 = Math.round(iVarV.getBottom());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int id2 = pVar2.getId() == pVar.getId() ? -1 : pVar2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (pVar2.getIsFake()) {
                        g4.p pVarR = pVar2.r();
                        j3.i iVarI = (pVarR == null || (zVarP = pVarR.p()) == null || !zVarP.y()) ? f5900a : pVarR.i();
                        c0Var.t(id2, new o2(pVar2, new Rect(Math.round(iVarI.getLeft()), Math.round(iVarI.getTop()), Math.round(iVarI.getRight()), Math.round(iVarI.getBottom()))));
                        return;
                    } else {
                        if (id2 == -1) {
                            c0Var.t(id2, new o2(pVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c0Var.t(id2, new o2(pVar2, region2.getBounds()));
                List<g4.p> listT = pVar2.t();
                for (int size = listT.size() - 1; -1 < size; size--) {
                    c(region, pVar, c0Var, listT.get(size), region2);
                }
                if (f(pVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    @SuppressLint({"PrimitiveInCollection"})
    public static final Float d(g4.l lVar) {
        wn0.l lVar2;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) g4.m.a(lVar, g4.k.f67225a.h());
        if (accessibilityAction == null || (lVar2 = (wn0.l) accessibilityAction.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult e(g4.l lVar) {
        wn0.l lVar2;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) g4.m.a(lVar, g4.k.f67225a.i());
        if (accessibilityAction == null || (lVar2 = (wn0.l) accessibilityAction.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean f(g4.p pVar) {
        if (g(pVar)) {
            return pVar.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || pVar.getUnmergedConfig().h();
        }
        return false;
    }

    public static final boolean g(g4.p pVar) {
        return (pVar.z() || pVar.getUnmergedConfig().e(g4.s.f67271a.n())) ? false : true;
    }

    public static final View h(r0 r0Var, int i11) {
        Object next;
        Iterator<T> it = r0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b4.g0) ((Map.Entry) next).getKey()).getSemanticsId() != i11);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.d) entry.getValue();
        }
        return null;
    }

    public static final String i(int i11) {
        g4.i.Companion companion = g4.i.INSTANCE;
        if (g4.i.k(i11, companion.a())) {
            return "android.widget.Button";
        }
        if (g4.i.k(i11, companion.b())) {
            return "android.widget.CheckBox";
        }
        if (g4.i.k(i11, companion.e())) {
            return "android.widget.RadioButton";
        }
        if (g4.i.k(i11, companion.d())) {
            return "android.widget.ImageView";
        }
        if (g4.i.k(i11, companion.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
