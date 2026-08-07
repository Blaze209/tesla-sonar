package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f23396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f23397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f23398c = new SparseBooleanArray();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f23399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23400b;

        a(i0 i0Var, int i11) {
            this.f23399a = i0Var;
            this.f23400b = i11;
        }
    }

    public u(h1 h1Var, s0 s0Var) {
        this.f23396a = h1Var;
        this.f23397b = s0Var;
    }

    private void a(i0 i0Var, i0 i0Var2, int i11) {
        gn.a.a(i0Var2.getNativeKind() != s.PARENT);
        for (int i12 = 0; i12 < i0Var2.getChildCount(); i12++) {
            i0 childAt = i0Var2.getChildAt(i12);
            gn.a.a(childAt.getNativeParent() == null);
            int nativeChildCount = i0Var.getNativeChildCount();
            if (childAt.getNativeKind() == s.NONE) {
                d(i0Var, childAt, i11);
            } else {
                b(i0Var, childAt, i11);
            }
            i11 += i0Var.getNativeChildCount() - nativeChildCount;
        }
    }

    private void b(i0 i0Var, i0 i0Var2, int i11) {
        i0Var.addNativeChildAt(i0Var2, i11);
        this.f23396a.G(i0Var.getReactTag(), null, new j1[]{new j1(i0Var2.getReactTag(), i11)}, null);
        if (i0Var2.getNativeKind() != s.PARENT) {
            a(i0Var, i0Var2, i11 + 1);
        }
    }

    private void c(i0 i0Var, i0 i0Var2, int i11) {
        int nativeOffsetForChild = i0Var.getNativeOffsetForChild(i0Var.getChildAt(i11));
        if (i0Var.getNativeKind() != s.PARENT) {
            a aVarS = s(i0Var, nativeOffsetForChild);
            if (aVarS == null) {
                return;
            }
            i0 i0Var3 = aVarS.f23399a;
            nativeOffsetForChild = aVarS.f23400b;
            i0Var = i0Var3;
        }
        if (i0Var2.getNativeKind() != s.NONE) {
            b(i0Var, i0Var2, nativeOffsetForChild);
        } else {
            d(i0Var, i0Var2, nativeOffsetForChild);
        }
    }

    private void d(i0 i0Var, i0 i0Var2, int i11) {
        a(i0Var, i0Var2, i11);
    }

    private void e(i0 i0Var) {
        int reactTag = i0Var.getReactTag();
        if (this.f23398c.get(reactTag)) {
            return;
        }
        this.f23398c.put(reactTag, true);
        int screenX = i0Var.getScreenX();
        int screenY = i0Var.getScreenY();
        for (i0 parent = i0Var.getParent(); parent != null && parent.getNativeKind() != s.PARENT; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
            }
        }
        f(i0Var, screenX, screenY);
    }

    private void f(i0 i0Var, int i11, int i12) {
        if (i0Var.getNativeKind() != s.NONE && i0Var.getNativeParent() != null) {
            this.f23396a.P(i0Var.getLayoutParent().getReactTag(), i0Var.getReactTag(), i11, i12, i0Var.getScreenWidth(), i0Var.getScreenHeight(), i0Var.getLayoutDirection());
            return;
        }
        for (int i13 = 0; i13 < i0Var.getChildCount(); i13++) {
            i0 childAt = i0Var.getChildAt(i13);
            int reactTag = childAt.getReactTag();
            if (!this.f23398c.get(reactTag)) {
                this.f23398c.put(reactTag, true);
                f(childAt, childAt.getScreenX() + i11, childAt.getScreenY() + i12);
            }
        }
    }

    public static void j(i0 i0Var) {
        i0Var.removeAllNativeChildren();
    }

    private static boolean n(k0 k0Var) {
        if (k0Var == null) {
            return true;
        }
        if (k0Var.d("collapsable") && !k0Var.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = k0Var.f23326a.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!u1.a(k0Var.f23326a, readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(i0 i0Var, boolean z11) {
        if (i0Var.getNativeKind() != s.PARENT) {
            for (int childCount = i0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                q(i0Var.getChildAt(childCount), z11);
            }
        }
        i0 nativeParent = i0Var.getNativeParent();
        if (nativeParent != null) {
            int iIndexOfNativeChild = nativeParent.indexOfNativeChild(i0Var);
            nativeParent.removeNativeChildAt(iIndexOfNativeChild);
            this.f23396a.G(nativeParent.getReactTag(), new int[]{iIndexOfNativeChild}, null, z11 ? new int[]{i0Var.getReactTag()} : null);
        }
    }

    private void r(i0 i0Var, k0 k0Var) {
        i0 parent = i0Var.getParent();
        if (parent == null) {
            i0Var.setIsLayoutOnly(false);
            return;
        }
        int iIndexOf = parent.indexOf(i0Var);
        parent.removeChildAt(iIndexOf);
        q(i0Var, false);
        i0Var.setIsLayoutOnly(false);
        this.f23396a.C(i0Var.getThemedContext(), i0Var.getReactTag(), i0Var.getViewClass(), k0Var);
        parent.addChildAt(i0Var, iIndexOf);
        c(parent, i0Var, iIndexOf);
        for (int i11 = 0; i11 < i0Var.getChildCount(); i11++) {
            c(i0Var, i0Var.getChildAt(i11), i11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(i0Var.getReactTag());
        sb2.append(" - rootTag: ");
        sb2.append(i0Var.getRootTag());
        sb2.append(" - hasProps: ");
        sb2.append(k0Var != null);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.f23398c.size());
        qk.a.s("NativeViewHierarchyOptimizer", sb2.toString());
        gn.a.a(this.f23398c.size() == 0);
        e(i0Var);
        for (int i12 = 0; i12 < i0Var.getChildCount(); i12++) {
            e(i0Var.getChildAt(i12));
        }
        this.f23398c.clear();
    }

    private a s(i0 i0Var, int i11) {
        while (i0Var.getNativeKind() != s.PARENT) {
            i0 parent = i0Var.getParent();
            if (parent == null) {
                return null;
            }
            i11 = i11 + (i0Var.getNativeKind() == s.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(i0Var);
            i0Var = parent;
        }
        return new a(i0Var, i11);
    }

    public void g(i0 i0Var, v0 v0Var, k0 k0Var) {
        i0Var.setIsLayoutOnly(i0Var.getViewClass().equals(ReactViewManager.REACT_CLASS) && n(k0Var));
        if (i0Var.getNativeKind() != s.NONE) {
            this.f23396a.C(v0Var, i0Var.getReactTag(), i0Var.getViewClass(), k0Var);
        }
    }

    public void h(i0 i0Var) {
        if (i0Var.isLayoutOnly()) {
            r(i0Var, null);
        }
    }

    public void i(i0 i0Var, int[] iArr, int[] iArr2, j1[] j1VarArr, int[] iArr3) {
        boolean z11;
        for (int i11 : iArr2) {
            int i12 = 0;
            while (true) {
                if (i12 >= iArr3.length) {
                    z11 = false;
                    break;
                } else {
                    if (iArr3[i12] == i11) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
            }
            q(this.f23397b.c(i11), z11);
        }
        for (j1 j1Var : j1VarArr) {
            c(i0Var, this.f23397b.c(j1Var.f23318a), j1Var.f23319b);
        }
    }

    public void k(i0 i0Var, ReadableArray readableArray) {
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            c(i0Var, this.f23397b.c(readableArray.getInt(i11)), i11);
        }
    }

    public void l(i0 i0Var) {
        e(i0Var);
    }

    public void m(i0 i0Var, String str, k0 k0Var) {
        if (i0Var.isLayoutOnly() && !n(k0Var)) {
            r(i0Var, k0Var);
        } else {
            if (i0Var.isLayoutOnly()) {
                return;
            }
            this.f23396a.Q(i0Var.getReactTag(), str, k0Var);
        }
    }

    public void o() {
        this.f23398c.clear();
    }

    void p(i0 i0Var) {
        this.f23398c.clear();
    }
}
