package oi0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mi0.ComponentView;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aM\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/ViewGroup;", "root", "Landroidx/constraintlayout/widget/d;", "constraintSet", "", "Lmi0/a;", "componentViews", "", "childrenIds", "", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "alignment", "gap", "Ljn0/h0;", "a", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/d;Ljava/util/List;Ljava/util/List;[ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "b", "(Landroid/view/ViewGroup;Landroidx/constraintlayout/widget/d;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d5 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97583a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97583a = iArr;
        }
    }

    public static final void a(ViewGroup viewGroup, androidx.constraintlayout.widget.d constraintSet, List<ComponentView> componentViews, List<Integer> childrenIds, int[] iArr, StyleElements.PositionType positionType, int i11) {
        Integer num;
        int i12;
        int i13;
        Object next;
        Object next2;
        List<xi0.a> listH;
        ViewGroup root = viewGroup;
        p013kotlin.jvm.internal.s.k(root, "root");
        p013kotlin.jvm.internal.s.k(constraintSet, "constraintSet");
        p013kotlin.jvm.internal.s.k(componentViews, "componentViews");
        p013kotlin.jvm.internal.s.k(childrenIds, "childrenIds");
        double dL1 = iArr != null ? p013kotlin.collections.n.l1(iArr) : 0.0d;
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i14 = 0;
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p013kotlin.collections.v.x();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = root.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            xi0.b bVar = new xi0.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i15 != p013kotlin.collections.v.o(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((ComponentView) next2).d().getId() != iIntValue);
                ComponentView componentView = (ComponentView) next2;
                n5 n5VarC = componentView != null ? componentView.c() : null;
                e0 e0Var = n5VarC instanceof e0 ? (e0) n5VarC : null;
                if (e0Var != null && (listH = e0Var.h()) != null) {
                    listH.add(bVar);
                }
                root.addView(bVar);
                constraintSet.w(bVar.getId(), i11);
                constraintSet.y(bVar.getId(), true);
                constraintSet.v(bVar.getId(), 1);
                constraintSet.x(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i15 = i16;
        }
        int i17 = 0;
        for (Object obj2 : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                p013kotlin.collections.v.x();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i17 > 0 ? (Integer) arrayList.get(i17 - 1) : null;
            if (i17 == p013kotlin.collections.v.o(childrenIds)) {
                constraintSet.r(iIntValue2, 7, i14, 7);
                Iterator<T> it2 = componentViews.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((ComponentView) next).d().getId() != iIntValue2);
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((xi0.b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
                i12 = 6;
            } else {
                num = (Integer) arrayList.get(i17);
                i12 = 6;
                constraintSet.r(iIntValue2, 7, num.intValue(), 6);
                constraintSet.r(num.intValue(), 7, childrenIds.get(i18).intValue(), 6);
                constraintSet.r(num.intValue(), 6, iIntValue2, 7);
            }
            if (num2 != null) {
                constraintSet.r(iIntValue2, i12, num2.intValue(), 7);
            } else {
                constraintSet.r(iIntValue2, i12, 0, i12);
            }
            constraintSet.v(iIntValue2, -2);
            constraintSet.x(iIntValue2, true);
            if (dL1 > 0.0d) {
                double d11 = ((double) (iArr != null ? iArr[i17] : 0)) / dL1;
                if (d11 > 0.0d) {
                    constraintSet.a0(iIntValue2, (float) d11);
                } else {
                    constraintSet.w(iIntValue2, -2);
                }
                i13 = 0;
            } else {
                i13 = 0;
                constraintSet.u(iIntValue2, 0);
            }
            constraintSet.r(iIntValue2, 3, i13, 3);
            constraintSet.r(iIntValue2, 4, i13, 4);
            if (num != null) {
                constraintSet.r(num.intValue(), 3, i13, 3);
                constraintSet.r(num.intValue(), 4, i13, 4);
            }
            int i19 = positionType == null ? -1 : a.f97583a[positionType.ordinal()];
            if (i19 == 1) {
                constraintSet.e0(iIntValue2, BitmapDescriptorFactory.HUE_RED);
            } else if (i19 != 2) {
                constraintSet.e0(iIntValue2, 0.5f);
            } else {
                constraintSet.e0(iIntValue2, 1.0f);
            }
            i14 = i13;
            i17 = i18;
            root = viewGroup;
        }
    }

    public static final void b(ViewGroup root, androidx.constraintlayout.widget.d constraintSet, List<ComponentView> componentViews, List<Integer> childrenIds, StyleElements.PositionType positionType, int i11) {
        Integer num;
        Object next;
        Object next2;
        List<xi0.a> listH;
        p013kotlin.jvm.internal.s.k(root, "root");
        p013kotlin.jvm.internal.s.k(constraintSet, "constraintSet");
        p013kotlin.jvm.internal.s.k(componentViews, "componentViews");
        p013kotlin.jvm.internal.s.k(childrenIds, "childrenIds");
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                p013kotlin.collections.v.x();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = root.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            xi0.b bVar = new xi0.b(context);
            bVar.setId(View.generateViewId());
            bVar.setSaveEnabled(false);
            if (i12 != p013kotlin.collections.v.o(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((ComponentView) next2).d().getId() != iIntValue);
                ComponentView componentView = (ComponentView) next2;
                n5 n5VarC = componentView != null ? componentView.c() : null;
                e0 e0Var = n5VarC instanceof e0 ? (e0) n5VarC : null;
                if (e0Var != null && (listH = e0Var.h()) != null) {
                    listH.add(bVar);
                }
                root.addView(bVar);
                constraintSet.w(bVar.getId(), 1);
                constraintSet.y(bVar.getId(), true);
                constraintSet.v(bVar.getId(), i11);
                constraintSet.x(bVar.getId(), true);
                arrayList.add(Integer.valueOf(bVar.getId()));
            }
            i12 = i13;
        }
        int i14 = 0;
        for (Object obj2 : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p013kotlin.collections.v.x();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i14 > 0 ? (Integer) arrayList.get(i14 - 1) : null;
            if (i14 == p013kotlin.collections.v.o(childrenIds)) {
                constraintSet.r(iIntValue2, 4, 0, 4);
                Iterator<T> it2 = componentViews.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((ComponentView) next).d().getId() != iIntValue2);
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.c() : null) != null && num2 != null) {
                    ((xi0.b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.c()));
                }
                num = null;
            } else {
                num = (Integer) arrayList.get(i14);
                constraintSet.r(num.intValue(), 3, iIntValue2, 4);
            }
            if (i14 == 0) {
                constraintSet.r(iIntValue2, 3, 0, 3);
            }
            if (num2 != null) {
                constraintSet.r(num2.intValue(), 4, iIntValue2, 3);
                constraintSet.r(iIntValue2, 3, num2.intValue(), 4);
            }
            constraintSet.r(iIntValue2, 6, 0, 6);
            constraintSet.r(iIntValue2, 7, 0, 7);
            if (num != null) {
                constraintSet.r(num.intValue(), 6, 0, 6);
                constraintSet.r(num.intValue(), 7, 0, 7);
            }
            constraintSet.v(iIntValue2, -2);
            constraintSet.w(iIntValue2, 0);
            int i16 = positionType == null ? -1 : a.f97583a[positionType.ordinal()];
            if (i16 == 1) {
                constraintSet.Z(iIntValue2, BitmapDescriptorFactory.HUE_RED);
            } else if (i16 != 2) {
                constraintSet.Z(iIntValue2, 0.5f);
            } else {
                constraintSet.Z(iIntValue2, 1.0f);
            }
            i14 = i15;
        }
    }
}
