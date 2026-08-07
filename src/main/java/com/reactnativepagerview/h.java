package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.w;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020\r¢\u0006\u0004\b+\u0010\"J\u001d\u0010,\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020(¢\u0006\u0004\b,\u0010*J\u001d\u0010-\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020\r¢\u0006\u0004\b-\u0010\"J\u001d\u0010.\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020(¢\u0006\u0004\b.\u0010*J\u001d\u00100\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010/\u001a\u00020\r¢\u0006\u0004\b0\u0010\"¨\u00061"}, d2 = {"Lcom/reactnativepagerview/h;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ljn0/h0;", "j", "(Landroid/view/View;)V", "Lcom/reactnativepagerview/a;", "Landroidx/viewpager2/widget/f;", "h", "(Lcom/reactnativepagerview/a;)Landroidx/viewpager2/widget/f;", "", "selectedTab", "", "scrollSmooth", "p", "(Landroidx/viewpager2/widget/f;IZ)V", "host", "child", "index", "e", "(Lcom/reactnativepagerview/a;Landroid/view/View;I)V", "parent", "g", "(Lcom/reactnativepagerview/a;)I", "f", "(Lcom/reactnativepagerview/a;I)Landroid/view/View;", "m", "(Lcom/reactnativepagerview/a;Landroid/view/View;)V", "l", "(Lcom/reactnativepagerview/a;)V", "n", "(Lcom/reactnativepagerview/a;I)V", IntegerTokenConverter.CONVERTER_KEY, "()Z", "value", "y", "(Lcom/reactnativepagerview/a;Z)V", "", "s", "(Lcom/reactnativepagerview/a;Ljava/lang/String;)V", "q", "u", "t", "v", "margin", "w", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f48692a = new h();

    private h() {
    }

    private final void j(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.e
            @Override // java.lang.Runnable
            public final void run() {
                h.k(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.viewpager2.widget.f fVar) {
        fVar.invalidate();
        fVar.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a aVar) {
        aVar.setDidSetInitialIndex(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(int i11, androidx.viewpager2.widget.f fVar, View page, float f11) {
        s.k(page, "page");
        float f12 = i11 * f11;
        if (fVar.getOrientation() != 0) {
            page.setTranslationY(f12);
            return;
        }
        if (fVar.getLayoutDirection() == 1) {
            f12 = -f12;
        }
        page.setTranslationX(f12);
    }

    public final void e(a host, View child, int index) throws ClassNotFoundException {
        Integer initialIndex;
        s.k(host, "host");
        if (child == null) {
            return;
        }
        androidx.viewpager2.widget.f fVarH = h(host);
        i iVar = (i) fVarH.getAdapter();
        if (iVar != null) {
            iVar.a(child, index);
        }
        if (fVarH.getCurrentItem() == index) {
            j(fVarH);
        }
        if (host.getDidSetInitialIndex() || (initialIndex = host.getInitialIndex()) == null || initialIndex.intValue() != index) {
            return;
        }
        host.setDidSetInitialIndex(true);
        p(fVarH, index, false);
    }

    public final View f(a parent, int index) {
        s.k(parent, "parent");
        i iVar = (i) h(parent).getAdapter();
        s.h(iVar);
        return iVar.b(index);
    }

    public final int g(a parent) {
        s.k(parent, "parent");
        RecyclerView.h adapter = h(parent).getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public final androidx.viewpager2.widget.f h(a view) throws ClassNotFoundException {
        s.k(view, "view");
        if (!(view.getChildAt(0) instanceof androidx.viewpager2.widget.f)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = view.getChildAt(0);
        s.i(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        return (androidx.viewpager2.widget.f) childAt;
    }

    public final boolean i() {
        return true;
    }

    public final void l(a parent) throws ClassNotFoundException {
        s.k(parent, "parent");
        androidx.viewpager2.widget.f fVarH = h(parent);
        fVarH.setUserInputEnabled(false);
        i iVar = (i) fVarH.getAdapter();
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void m(a parent, View view) throws ClassNotFoundException {
        s.k(parent, "parent");
        s.k(view, "view");
        androidx.viewpager2.widget.f fVarH = h(parent);
        i iVar = (i) fVarH.getAdapter();
        if (iVar != null) {
            iVar.f(view);
        }
        j(fVarH);
    }

    public final void n(a parent, int index) throws ClassNotFoundException {
        s.k(parent, "parent");
        final androidx.viewpager2.widget.f fVarH = h(parent);
        i iVar = (i) fVarH.getAdapter();
        View viewB = iVar != null ? iVar.b(index) : null;
        if (viewB != null && viewB.getParent() != null) {
            ViewParent parent2 = viewB.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewB);
            }
        }
        if (iVar != null) {
            iVar.g(index);
        }
        fVarH.post(new Runnable() { // from class: com.reactnativepagerview.f
            @Override // java.lang.Runnable
            public final void run() {
                h.o(fVarH);
            }
        });
    }

    public final void p(androidx.viewpager2.widget.f view, int selectedTab, boolean scrollSmooth) {
        s.k(view, "view");
        j(view);
        view.setCurrentItem(selectedTab, scrollSmooth);
    }

    public final void q(final a host, int value) throws ClassNotFoundException {
        s.k(host, "host");
        androidx.viewpager2.widget.f fVarH = h(host);
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(value));
            fVarH.post(new Runnable() { // from class: com.reactnativepagerview.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.r(host);
                }
            });
        }
    }

    public final void s(a host, String value) throws ClassNotFoundException {
        s.k(host, "host");
        s.k(value, "value");
        androidx.viewpager2.widget.f fVarH = h(host);
        if (s.f(value, "rtl")) {
            fVarH.setLayoutDirection(1);
        } else {
            fVarH.setLayoutDirection(0);
        }
    }

    public final void t(a host, int value) {
        s.k(host, "host");
        h(host).setOffscreenPageLimit(value);
    }

    public final void u(a host, String value) {
        s.k(host, "host");
        s.k(value, "value");
        h(host).setOrientation(s.f(value, "vertical") ? 1 : 0);
    }

    public final void v(a host, String value) {
        s.k(host, "host");
        s.k(value, "value");
        View childAt = h(host).getChildAt(0);
        if (s.f(value, PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
            childAt.setOverScrollMode(2);
        } else if (s.f(value, PermissionsResponse.SCOPE_ALWAYS)) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    public final void w(a host, int margin) throws ClassNotFoundException {
        s.k(host, "host");
        final androidx.viewpager2.widget.f fVarH = h(host);
        final int iG = (int) w.g(margin);
        fVarH.setPageTransformer(new androidx.viewpager2.widget.f.k() { // from class: com.reactnativepagerview.d
            @Override // androidx.viewpager2.widget.f.k
            public final void a(View view, float f11) {
                h.x(iG, fVarH, view, f11);
            }
        });
    }

    public final void y(a host, boolean value) {
        s.k(host, "host");
        h(host).setUserInputEnabled(value);
    }
}
