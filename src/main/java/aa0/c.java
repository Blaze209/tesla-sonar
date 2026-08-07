package aa0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0007\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"parentAsView", "Landroid/view/View;", "parentAsViewGroup", "Landroid/view/ViewGroup;", "recycle", "maybeBgColor", "", "(Landroid/view/View;)Ljava/lang/Integer;", "asViewGroupOrNull", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final ViewGroup asViewGroupOrNull(View view) {
        s.k(view, "<this>");
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static final Integer maybeBgColor(View view) {
        s.k(view, "<this>");
        Drawable background = view.getBackground();
        if (background instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) background).getColor());
        }
        return null;
    }

    public static final View parentAsView(View view) {
        s.k(view, "<this>");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static final ViewGroup parentAsViewGroup(View view) {
        s.k(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View recycle(View view) {
        s.k(view, "<this>");
        ViewGroup viewGroupParentAsViewGroup = parentAsViewGroup(view);
        if (viewGroupParentAsViewGroup != null) {
            viewGroupParentAsViewGroup.endViewTransition(view);
            viewGroupParentAsViewGroup.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        return view;
    }
}
