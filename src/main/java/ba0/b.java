package ba0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import com.facebook.react.x0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lba0/b;", "", "<init>", "()V", "Lcom/facebook/react/x0;", "rootView", "Landroidx/fragment/app/FragmentManager;", "resolveFragmentManagerForReactRootView", "(Lcom/facebook/react/x0;)Landroidx/fragment/app/FragmentManager;", "Landroid/view/ViewGroup;", "view", "findFragmentManagerForView", "(Landroid/view/ViewGroup;)Landroidx/fragment/app/FragmentManager;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    private final FragmentManager resolveFragmentManagerForReactRootView(x0 rootView) {
        boolean z11;
        Context context = rootView.getContext();
        while (true) {
            z11 = context instanceof u;
            if (z11 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z11) {
            throw new IllegalStateException("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
        }
        u uVar = (u) context;
        if (uVar.getSupportFragmentManager().A0().isEmpty()) {
            return uVar.getSupportFragmentManager();
        }
        try {
            return FragmentManager.m0(rootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            return uVar.getSupportFragmentManager();
        }
    }

    public final FragmentManager findFragmentManagerForView(ViewGroup view) {
        boolean z11;
        s.k(view, "view");
        ViewParent parent = view;
        while (true) {
            z11 = parent instanceof x0;
            if (z11 || (parent instanceof com.swmansion.rnscreens.gamma.common.b) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
        }
        if (!(parent instanceof com.swmansion.rnscreens.gamma.common.b)) {
            if (z11) {
                return resolveFragmentManagerForReactRootView((x0) parent);
            }
            throw new IllegalStateException(("[RNScreens] Expected parent to be a ReactRootView, instead found: " + parent.getClass().getName()).toString());
        }
        Fragment associatedFragment = ((com.swmansion.rnscreens.gamma.common.b) parent).getAssociatedFragment();
        if (associatedFragment != null) {
            return associatedFragment.getChildFragmentManager();
        }
        throw new IllegalStateException(("[RNScreens] Parent fragment providing view " + parent + " returned nullish fragment").toString());
    }
}
