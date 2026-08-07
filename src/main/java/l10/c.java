package l10;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import bo0.h;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.List;
import m10.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Ll10/c;", "", "<init>", "()V", "Landroid/view/View;", "currentFocus", "Landroid/widget/EditText;", "f", "(Landroid/view/View;)Landroid/widget/EditText;", "g", "", "direction", "b", "(Landroid/view/View;I)Landroid/widget/EditText;", "Landroid/view/ViewGroup;", "viewGroup", "c", "(Landroid/view/ViewGroup;I)Landroid/widget/EditText;", "child", DateTokenConverter.CONVERTER_KEY, "view", "", "j", "(Landroid/view/View;)Z", "", "Ljn0/h0;", "k", "(Ljava/lang/String;Landroid/view/View;)V", "", "h", "(Landroid/view/View;)Ljava/util/List;", "Lm10/i;", "e", "(Landroid/view/View;)Lm10/i;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f89490a = new c();

    private c() {
    }

    private final EditText b(View currentFocus, int direction) {
        ViewParent parent = currentFocus.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int iIndexOfChild = viewGroup.indexOfChild(currentFocus);
        int i11 = direction > 0 ? iIndexOfChild + 1 : iIndexOfChild - 1;
        int childCount = direction > 0 ? viewGroup.getChildCount() : -1;
        while (i11 != childCount) {
            View childAt = viewGroup.getChildAt(i11);
            s.h(childAt);
            EditText editTextD = d(childAt, direction);
            if (editTextD != null) {
                return editTextD;
            }
            i11 += direction;
        }
        if (viewGroup instanceof i) {
            return null;
        }
        return b(viewGroup, direction);
    }

    private final EditText c(ViewGroup viewGroup, int direction) {
        int childCount = viewGroup.getChildCount();
        h hVarW = direction > 0 ? n.w(0, childCount) : n.s(childCount - 1, 0);
        int first = hVarW.getFirst();
        int last = hVarW.getLast();
        int step = hVarW.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (true) {
            View childAt = viewGroup.getChildAt(first);
            s.h(childAt);
            EditText editTextD = d(childAt, direction);
            if (editTextD != null) {
                return editTextD;
            }
            if (first == last) {
                return null;
            }
            first += step;
        }
    }

    private final EditText d(View child, int direction) {
        if (j(child)) {
            s.i(child, "null cannot be cast to non-null type android.widget.EditText");
            return (EditText) child;
        }
        if (!(child instanceof ViewGroup) || (child instanceof i)) {
            return null;
        }
        return c((ViewGroup) child, direction);
    }

    private final EditText f(View currentFocus) {
        return b(currentFocus, 1);
    }

    private final EditText g(View currentFocus) {
        return b(currentFocus, -1);
    }

    private static final void i(List<EditText> list, View view) {
        if (f89490a.j(view)) {
            s.i(view, "null cannot be cast to non-null type android.widget.EditText");
            list.add((EditText) view);
        } else {
            if (!(view instanceof ViewGroup) || (view instanceof i)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                i(list, viewGroup.getChildAt(i11));
            }
        }
    }

    private final boolean j(View view) {
        return (view instanceof EditText) && ((EditText) view).isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EditText editText) {
        c10.c.e(editText);
    }

    public final i e(View view) {
        for (ViewParent parent = view != null ? view.getParent() : null; parent != null; parent = parent.getParent()) {
            if (parent instanceof i) {
                return (i) parent;
            }
        }
        return null;
    }

    public final List<EditText> h(View viewGroup) {
        ArrayList arrayList = new ArrayList();
        if (!(viewGroup instanceof i)) {
            i(arrayList, viewGroup);
            return arrayList;
        }
        i iVar = (i) viewGroup;
        int childCount = iVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            i(arrayList, iVar.getChildAt(i11));
        }
        return arrayList;
    }

    public final void k(String direction, View view) {
        s.k(direction, "direction");
        s.k(view, "view");
        final EditText editTextF = s.f(direction, "next") ? f(view) : g(view);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: l10.b
            @Override // java.lang.Runnable
            public final void run() {
                c.l(editTextF);
            }
        });
    }
}
