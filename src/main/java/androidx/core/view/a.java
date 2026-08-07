package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f7734c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f7735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f7736b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0157a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f7737a;

        C0157a(a aVar) {
            this.f7737a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7737a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProviderCompatB = this.f7737a.b(view);
            if (accessibilityNodeProviderCompatB != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProviderCompatB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7737a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatN1 = AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo);
            accessibilityNodeInfoCompatN1.W0(ViewCompat.X(view));
            accessibilityNodeInfoCompatN1.G0(ViewCompat.R(view));
            accessibilityNodeInfoCompatN1.Q0(ViewCompat.p(view));
            accessibilityNodeInfoCompatN1.c1(ViewCompat.I(view));
            this.f7737a.g(view, accessibilityNodeInfoCompatN1);
            accessibilityNodeInfoCompatN1.f(accessibilityNodeInfo.getText(), view);
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listC = a.c(view);
            for (int i11 = 0; i11 < listC.size(); i11++) {
                accessibilityNodeInfoCompatN1.b(listC.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7737a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f7737a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            return this.f7737a.j(view, i11, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i11) {
            this.f7737a.l(view, i11);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f7737a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f7734c);
    }

    static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> c(View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> list = (List) view.getTag(h5.e.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrR = AccessibilityNodeInfoCompat.r(view.createAccessibilityNodeInfo().getText());
            for (int i11 = 0; clickableSpanArrR != null && i11 < clickableSpanArrR.length; i11++) {
                if (clickableSpan.equals(clickableSpanArrR[i11])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i11, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(h5.e.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i11)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f7735a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProviderCompat b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f7735a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f7736b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f7735a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f7735a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.m1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f7735a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f7735a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i11, Bundle bundle) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i12 = 0; i12 < listC.size(); i12++) {
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = listC.get(i12);
            if (accessibilityActionCompat.b() == i11) {
                zPerformAccessibilityAction = accessibilityActionCompat.d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f7735a.performAccessibilityAction(view, i11, bundle);
        }
        return (zPerformAccessibilityAction || i11 != h5.e.f70784a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i11) {
        this.f7735a.sendAccessibilityEvent(view, i11);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f7735a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f7735a = accessibilityDelegate;
        this.f7736b = new C0157a(this);
    }
}
