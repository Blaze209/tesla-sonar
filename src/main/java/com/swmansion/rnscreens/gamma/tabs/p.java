package com.swmansion.rnscreens.gamma.tabs;

import android.view.Menu;
import android.view.MenuItem;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/Menu;", "", "index", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "tabScreen", "Landroid/view/MenuItem;", "getOrCreateMenuItem", "(Landroid/view/Menu;ILcom/swmansion/rnscreens/gamma/tabs/a;)Landroid/view/MenuItem;", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuItem getOrCreateMenuItem(Menu menu, int i11, a aVar) {
        MenuItem menuItemFindItem = menu.findItem(i11);
        if (menuItemFindItem != null) {
            return menuItemFindItem;
        }
        MenuItem menuItemAdd = menu.add(0, i11, 0, aVar.getTabTitle());
        s.j(menuItemAdd, "add(...)");
        return menuItemAdd;
    }
}
