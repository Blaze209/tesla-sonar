package com.swmansion.rnscreens.gamma.tabs;

import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/o;", "", "Ln/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/material/bottomnavigation/c;", "bottomNavigationView", "", "Lcom/swmansion/rnscreens/gamma/tabs/e;", "tabScreenFragments", "<init>", "(Ln/c;Lcom/google/android/material/bottomnavigation/c;Ljava/util/List;)V", "Ljn0/h0;", "updateMenuItems", "()V", "Lcom/swmansion/rnscreens/gamma/tabs/l;", "tabsHost", "updateTabAppearance", "(Lcom/swmansion/rnscreens/gamma/tabs/l;)V", "Landroid/view/MenuItem;", "menuItem", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "tabScreen", "updateMenuItemAppearance", "(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "Lcom/google/android/material/bottomnavigation/c;", "Ljava/util/List;", "Lcom/swmansion/rnscreens/gamma/tabs/n;", "appearanceApplicator", "Lcom/swmansion/rnscreens/gamma/tabs/n;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {
    private final n appearanceApplicator;
    private final com.google.android.material.bottomnavigation.c bottomNavigationView;
    private final List<e> tabScreenFragments;

    public o(n.c context, com.google.android.material.bottomnavigation.c bottomNavigationView, List<e> tabScreenFragments) {
        s.k(context, "context");
        s.k(bottomNavigationView, "bottomNavigationView");
        s.k(tabScreenFragments, "tabScreenFragments");
        this.bottomNavigationView = bottomNavigationView;
        this.tabScreenFragments = tabScreenFragments;
        this.appearanceApplicator = new n(context, bottomNavigationView);
    }

    private final void updateMenuItems() {
        Menu menu = this.bottomNavigationView.getMenu();
        s.j(menu, "getMenu(...)");
        if (menu.size() != this.tabScreenFragments.size()) {
            this.bottomNavigationView.getMenu().clear();
        }
        int i11 = 0;
        for (Object obj : this.tabScreenFragments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            e eVar = (e) obj;
            Menu menu2 = this.bottomNavigationView.getMenu();
            s.j(menu2, "getMenu(...)");
            MenuItem orCreateMenuItem = p.getOrCreateMenuItem(menu2, i11, eVar.getTabScreen());
            if (orCreateMenuItem.getItemId() != i11) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            updateMenuItemAppearance(orCreateMenuItem, eVar.getTabScreen());
            i11 = i12;
        }
    }

    public final void updateMenuItemAppearance(MenuItem menuItem, a tabScreen) {
        s.k(menuItem, "menuItem");
        s.k(tabScreen, "tabScreen");
        this.appearanceApplicator.updateMenuItemAppearance(menuItem, tabScreen);
        this.appearanceApplicator.updateBadgeAppearance(menuItem, tabScreen);
    }

    public final void updateTabAppearance(l tabsHost) {
        s.k(tabsHost, "tabsHost");
        this.appearanceApplicator.updateSharedAppearance(tabsHost);
        updateMenuItems();
        this.appearanceApplicator.updateFontStyles(tabsHost);
    }
}
