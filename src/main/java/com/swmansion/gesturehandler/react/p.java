package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/swmansion/gesturehandler/react/p;", "Ly90/p;", "<init>", "()V", "Landroid/view/View;", "view", "Ly90/n;", "c", "(Landroid/view/View;)Ly90/n;", "Landroid/view/ViewGroup;", "parent", "", "index", "b", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "", "a", "(Landroid/view/ViewGroup;)Z", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements y90.p {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55445a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f55445a = iArr;
        }
    }

    @Override // y90.p
    public boolean a(ViewGroup view) {
        s.k(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof com.facebook.react.views.scroll.g) {
            return !s.f(((com.facebook.react.views.scroll.g) view).getOverflow(), "visible");
        }
        if (view instanceof com.facebook.react.views.scroll.f) {
            return !s.f(((com.facebook.react.views.scroll.f) view).getOverflow(), "visible");
        }
        if (view instanceof com.facebook.react.views.view.e) {
            return s.f(((com.facebook.react.views.view.e) view).getOverflow(), "hidden");
        }
        return false;
    }

    @Override // y90.p
    public View b(ViewGroup parent, int index) {
        s.k(parent, "parent");
        if (parent instanceof com.facebook.react.views.view.e) {
            View childAt = parent.getChildAt(((com.facebook.react.views.view.e) parent).getZIndexMappedChildIndex(index));
            s.h(childAt);
            return childAt;
        }
        View childAt2 = parent.getChildAt(index);
        s.h(childAt2);
        return childAt2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y90.p
    public y90.n c(View view) {
        s.k(view, "view");
        x pointerEvents = view instanceof f0 ? ((f0) view).getPointerEvents() : x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == x.AUTO) {
                return y90.n.BOX_NONE;
            }
            if (pointerEvents == x.BOX_ONLY) {
                return y90.n.NONE;
            }
        }
        int i11 = a.f55445a[pointerEvents.ordinal()];
        if (i11 == 1) {
            return y90.n.BOX_ONLY;
        }
        if (i11 == 2) {
            return y90.n.BOX_NONE;
        }
        if (i11 == 3) {
            return y90.n.NONE;
        }
        if (i11 == 4) {
            return y90.n.AUTO;
        }
        throw new NoWhenBranchMatchedException();
    }
}
