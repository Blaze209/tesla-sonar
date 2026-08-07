package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/d;", DateTokenConverter.CONVERTER_KEY, "(I)Landroidx/compose/ui/focus/d;", "c", "(I)Ljava/lang/Integer;", "androidLayoutDirection", "Lw4/t;", "e", "(I)Lw4/t;", "Landroid/view/View;", "Lj3/i;", "a", "(Landroid/view/View;)Lj3/i;", "direction", "Landroid/graphics/Rect;", "rect", "", "b", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final j3.i a(View view) {
        int[] iArrA = g.INSTANCE.a();
        view.getLocationInWindow(iArrA);
        int i11 = iArrA[0];
        return new j3.i(i11, iArrA[1], i11 + view.getWidth(), iArrA[1] + view.getHeight());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i11) {
        d.Companion companion = d.INSTANCE;
        if (d.l(i11, companion.h())) {
            return 33;
        }
        if (d.l(i11, companion.a())) {
            return Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        }
        if (d.l(i11, companion.d())) {
            return 17;
        }
        if (d.l(i11, companion.g())) {
            return 66;
        }
        if (d.l(i11, companion.e())) {
            return 2;
        }
        return d.l(i11, companion.f()) ? 1 : null;
    }

    public static final d d(int i11) {
        if (i11 == 1) {
            return d.i(d.INSTANCE.f());
        }
        if (i11 == 2) {
            return d.i(d.INSTANCE.e());
        }
        if (i11 == 17) {
            return d.i(d.INSTANCE.d());
        }
        if (i11 == 33) {
            return d.i(d.INSTANCE.h());
        }
        if (i11 == 66) {
            return d.i(d.INSTANCE.g());
        }
        if (i11 != 130) {
            return null;
        }
        return d.i(d.INSTANCE.a());
    }

    public static final w4.t e(int i11) {
        if (i11 == 0) {
            return w4.t.Ltr;
        }
        if (i11 != 1) {
            return null;
        }
        return w4.t.Rtl;
    }
}
