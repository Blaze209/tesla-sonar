package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/b;", "", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "tabScreen", "", "isFocused", "Ljn0/h0;", "onTabFocusChangedFromJS", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Z)V", "onMenuItemAttributesChange", "(Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "Landroid/content/res/Configuration;", "config", "onFragmentConfigurationChange", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/content/res/Configuration;)V", "Landroidx/fragment/app/Fragment;", "getFragmentForTabScreen", "(Lcom/swmansion/rnscreens/gamma/tabs/a;)Landroidx/fragment/app/Fragment;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    Fragment getFragmentForTabScreen(a tabScreen);

    void onFragmentConfigurationChange(a tabScreen, Configuration config);

    void onMenuItemAttributesChange(a tabScreen);

    void onTabFocusChangedFromJS(a tabScreen, boolean isFocused);
}
