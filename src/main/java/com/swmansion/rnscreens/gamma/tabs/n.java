package com.swmansion.rnscreens.gamma.tabs;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.core.view.t;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/n;", "", "Ln/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/material/bottomnavigation/c;", "bottomNavigationView", "<init>", "(Ln/c;Lcom/google/android/material/bottomnavigation/c;)V", "", "attr", "resolveColorAttr", "(I)I", "Lcom/swmansion/rnscreens/gamma/tabs/l;", "tabsHost", "Ljn0/h0;", "updateSharedAppearance", "(Lcom/swmansion/rnscreens/gamma/tabs/l;)V", "updateFontStyles", "Landroid/view/MenuItem;", "menuItem", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "tabScreen", "updateMenuItemAppearance", "(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "updateBadgeAppearance", "Ln/c;", "Lcom/google/android/material/bottomnavigation/c;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"PrivateResource"})
public final class n {
    private final com.google.android.material.bottomnavigation.c bottomNavigationView;
    private final n.c context;

    public n(n.c context, com.google.android.material.bottomnavigation.c bottomNavigationView) {
        s.k(context, "context");
        s.k(bottomNavigationView, "bottomNavigationView");
        this.context = context;
        this.bottomNavigationView = bottomNavigationView;
    }

    private final int resolveColorAttr(int attr) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(attr, typedValue, true);
        return typedValue.data;
    }

    public final void updateBadgeAppearance(MenuItem menuItem, a tabScreen) {
        s.k(menuItem, "menuItem");
        s.k(tabScreen, "tabScreen");
        Menu menu = this.bottomNavigationView.getMenu();
        s.j(menu, "getMenu(...)");
        int iO = ho0.l.O(t.a(menu), menuItem);
        String badgeValue = tabScreen.getBadgeValue();
        if (badgeValue == null) {
            bt.a aVarD = this.bottomNavigationView.d(iO);
            if (aVarD != null) {
                aVarD.W(false);
                return;
            }
            return;
        }
        Integer numX = p013kotlin.text.t.x(badgeValue);
        bt.a aVarE = this.bottomNavigationView.e(iO);
        s.j(aVarE, "getOrCreateBadge(...)");
        aVarE.W(true);
        aVarE.e();
        aVarE.d();
        if (numX != null) {
            aVarE.U(numX.intValue());
        } else if (!s.f(badgeValue, "")) {
            aVarE.V(badgeValue);
        }
        Integer tabBarItemBadgeTextColor = tabScreen.getTabBarItemBadgeTextColor();
        aVarE.T(tabBarItemBadgeTextColor != null ? tabBarItemBadgeTextColor.intValue() : resolveColorAttr(zs.c.f128583o));
        Integer tabBarItemBadgeBackgroundColor = tabScreen.getTabBarItemBadgeBackgroundColor();
        aVarE.S(tabBarItemBadgeBackgroundColor != null ? tabBarItemBadgeBackgroundColor.intValue() : resolveColorAttr(i.a.f73748y));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    public final void updateFontStyles(l tabsHost) {
        int iIntValue;
        Integer numX;
        float dimension;
        float dimension2;
        s.k(tabsHost, "tabsHost");
        View childAt = this.bottomNavigationView.getChildAt(0);
        s.i(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view : s0.a((ViewGroup) childAt)) {
            TextView textView = (TextView) view.findViewById(zs.g.Z);
            TextView textView2 = (TextView) view.findViewById(zs.g.f128685a0);
            boolean zF = s.f(tabsHost.getTabBarItemTitleFontStyle(), "italic");
            if (s.f(tabsHost.getTabBarItemTitleFontWeight(), "bold")) {
                iIntValue = 700;
            } else {
                String tabBarItemTitleFontWeight = tabsHost.getTabBarItemTitleFontWeight();
                iIntValue = (tabBarItemTitleFontWeight == null || (numX = p013kotlin.text.t.x(tabBarItemTitleFontWeight)) == null) ? 400 : numX.intValue();
            }
            kn.a aVarC = kn.a.INSTANCE.c();
            String tabBarItemTitleFontFamily = tabsHost.getTabBarItemTitleFontFamily();
            if (tabBarItemTitleFontFamily == null) {
                tabBarItemTitleFontFamily = "";
            }
            Typeface typefaceF = aVarC.f(tabBarItemTitleFontFamily, iIntValue, zF, this.context.getAssets());
            Float tabBarItemTitleFontSize = tabsHost.getTabBarItemTitleFontSize();
            if (tabBarItemTitleFontSize == null) {
                dimension = this.context.getResources().getDimension(zs.e.f128632h);
            } else {
                if (tabBarItemTitleFontSize.floatValue() <= BitmapDescriptorFactory.HUE_RED) {
                    tabBarItemTitleFontSize = null;
                }
                if (tabBarItemTitleFontSize != null) {
                    dimension = w.l(tabBarItemTitleFontSize.floatValue(), BitmapDescriptorFactory.HUE_RED, 2, null);
                } else {
                    dimension = this.context.getResources().getDimension(zs.e.f128632h);
                }
            }
            Float tabBarItemTitleFontSizeActive = tabsHost.getTabBarItemTitleFontSizeActive();
            if (tabBarItemTitleFontSizeActive == null) {
                dimension2 = this.context.getResources().getDimension(zs.e.f128632h);
            } else {
                if (tabBarItemTitleFontSizeActive.floatValue() <= BitmapDescriptorFactory.HUE_RED) {
                    tabBarItemTitleFontSizeActive = null;
                }
                if (tabBarItemTitleFontSizeActive != null) {
                    dimension2 = w.l(tabBarItemTitleFontSizeActive.floatValue(), BitmapDescriptorFactory.HUE_RED, 2, null);
                } else {
                    dimension2 = this.context.getResources().getDimension(zs.e.f128632h);
                }
            }
            textView2.setTextSize(0, dimension);
            textView2.setTypeface(typefaceF);
            textView.setTextSize(0, dimension2);
            textView.setTypeface(typefaceF);
        }
    }

    public final void updateMenuItemAppearance(MenuItem menuItem, a tabScreen) {
        s.k(menuItem, "menuItem");
        s.k(tabScreen, "tabScreen");
        if (!s.f(menuItem.getTitle(), tabScreen.getTabTitle())) {
            menuItem.setTitle(tabScreen.getTabTitle());
        }
        if (s.f(menuItem.getIcon(), tabScreen.getIcon())) {
            return;
        }
        menuItem.setIcon(tabScreen.getIcon());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    public final void updateSharedAppearance(l tabsHost) {
        s.k(tabsHost, "tabsHost");
        int i11 = 0;
        this.bottomNavigationView.setVisibility(0);
        com.google.android.material.bottomnavigation.c cVar = this.bottomNavigationView;
        Integer tabBarBackgroundColor = tabsHost.getTabBarBackgroundColor();
        cVar.setBackgroundColor(tabBarBackgroundColor != null ? tabBarBackgroundColor.intValue() : resolveColorAttr(zs.c.f128601x));
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        Integer tabBarItemTitleFontColor = tabsHost.getTabBarItemTitleFontColor();
        int iIntValue = tabBarItemTitleFontColor != null ? tabBarItemTitleFontColor.intValue() : resolveColorAttr(zs.c.f128589r);
        Integer tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColorActive();
        this.bottomNavigationView.setItemTextColor(new ColorStateList(iArr, new int[]{iIntValue, (tabBarItemTitleFontColorActive == null && (tabBarItemTitleFontColorActive = tabsHost.getTabBarItemTitleFontColor()) == null) ? resolveColorAttr(zs.c.f128595u) : tabBarItemTitleFontColorActive.intValue()}));
        Integer tabBarItemIconColor = tabsHost.getTabBarItemIconColor();
        int iIntValue2 = tabBarItemIconColor != null ? tabBarItemIconColor.intValue() : resolveColorAttr(zs.c.f128589r);
        Integer tabBarItemIconColorActive = tabsHost.getTabBarItemIconColorActive();
        this.bottomNavigationView.setItemIconTintList(new ColorStateList(iArr, new int[]{iIntValue2, (tabBarItemIconColorActive == null && (tabBarItemIconColorActive = tabsHost.getTabBarItemIconColor()) == null) ? resolveColorAttr(zs.c.f128585p) : tabBarItemIconColorActive.intValue()}));
        String tabBarItemLabelVisibilityMode = tabsHost.getTabBarItemLabelVisibilityMode();
        if (tabBarItemLabelVisibilityMode == null) {
            i11 = -1;
        } else {
            int iHashCode = tabBarItemLabelVisibilityMode.hashCode();
            if (iHashCode != -63201645) {
                if (iHashCode != 1191572123) {
                    if (iHashCode == 1648599514 && tabBarItemLabelVisibilityMode.equals("unlabeled")) {
                        i11 = 2;
                    } else {
                        i11 = -1;
                    }
                } else if (!tabBarItemLabelVisibilityMode.equals("selected")) {
                    i11 = -1;
                }
            } else if (tabBarItemLabelVisibilityMode.equals("labeled")) {
                i11 = 1;
            } else {
                i11 = -1;
            }
        }
        this.bottomNavigationView.setLabelVisibilityMode(i11);
        Integer tabBarItemRippleColor = tabsHost.getTabBarItemRippleColor();
        this.bottomNavigationView.setItemRippleColor(ColorStateList.valueOf(tabBarItemRippleColor != null ? tabBarItemRippleColor.intValue() : resolveColorAttr(zs.c.H)));
        Integer tabBarItemActiveIndicatorColor = tabsHost.getTabBarItemActiveIndicatorColor();
        int iIntValue3 = tabBarItemActiveIndicatorColor != null ? tabBarItemActiveIndicatorColor.intValue() : resolveColorAttr(zs.c.f128597v);
        this.bottomNavigationView.setItemActiveIndicatorEnabled(tabsHost.isTabBarItemActiveIndicatorEnabled());
        this.bottomNavigationView.setItemActiveIndicatorColor(ColorStateList.valueOf(iIntValue3));
    }
}
