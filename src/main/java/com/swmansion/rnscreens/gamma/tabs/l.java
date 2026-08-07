package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.os.Build;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.s0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.rnscreens.safearea.EdgeInsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.z;
import p013kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Å\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Æ\u0001Ç\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u0010J\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0013H\u0000¢\u0006\u0004\b(\u0010\u0016J\u0017\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u001eH\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b.\u0010\u0010J\u001f\u00102\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b4\u0010,J\u0019\u00105\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010\u0010J\u0019\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u000107H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u001b\u0010I\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020\fH\u0000¢\u0006\u0004\bK\u0010\u0010JY\u0010W\u001a\u00020\f2\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010[R\u0018\u0010]\u001a\u00060\\R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00190q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010x\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R3\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0004\b~\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010\u001d\"\u0006\b\u0081\u0001\u0010\u0082\u0001R4\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0084\u0001\u0010\u007f\u001a\u0005\b\u0085\u0001\u0010\u001d\"\u0006\b\u0086\u0001\u0010\u0082\u0001R1\u0010\u0089\u0001\u001a\u0002002\u0006\u0010}\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010\u007f\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R4\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u008d\u0001\u0010\u007f\u001a\u0005\b\u008e\u0001\u0010\u001d\"\u0006\b\u008f\u0001\u0010\u0082\u0001R7\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u0010}\u001a\u0005\u0018\u00010\u0091\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0092\u0001\u0010\u007f\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R4\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0098\u0001\u0010\u007f\u001a\u0005\b\u0099\u0001\u0010\u001d\"\u0006\b\u009a\u0001\u0010\u0082\u0001R4\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u009c\u0001\u0010\u007f\u001a\u0005\b\u009d\u0001\u0010\u001d\"\u0006\b\u009e\u0001\u0010\u0082\u0001R4\u0010£\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b \u0001\u0010\u007f\u001a\u0005\b¡\u0001\u0010\u001d\"\u0006\b¢\u0001\u0010\u0082\u0001R7\u0010ª\u0001\u001a\u0005\u0018\u00010¤\u00012\t\u0010}\u001a\u0005\u0018\u00010¤\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b¥\u0001\u0010\u007f\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R7\u0010®\u0001\u001a\u0005\u0018\u00010¤\u00012\t\u0010}\u001a\u0005\u0018\u00010¤\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b«\u0001\u0010\u007f\u001a\u0006\b¬\u0001\u0010§\u0001\"\u0006\b\u00ad\u0001\u0010©\u0001R7\u0010²\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u0010}\u001a\u0005\u0018\u00010\u0091\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b¯\u0001\u0010\u007f\u001a\u0006\b°\u0001\u0010\u0094\u0001\"\u0006\b±\u0001\u0010\u0096\u0001R7\u0010¶\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u0010}\u001a\u0005\u0018\u00010\u0091\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b³\u0001\u0010\u007f\u001a\u0006\b´\u0001\u0010\u0094\u0001\"\u0006\bµ\u0001\u0010\u0096\u0001R4\u0010º\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010}\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b·\u0001\u0010\u007f\u001a\u0005\b¸\u0001\u0010\u001d\"\u0006\b¹\u0001\u0010\u0082\u0001R7\u0010¾\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u0010}\u001a\u0005\u0018\u00010\u0091\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b»\u0001\u0010\u007f\u001a\u0006\b¼\u0001\u0010\u0094\u0001\"\u0006\b½\u0001\u0010\u0096\u0001R\u0018\u0010À\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0017\u0010Ä\u0001\u001a\u00020n8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006È\u0001"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/l;", "Landroid/widget/FrameLayout;", "Lcom/swmansion/rnscreens/gamma/tabs/b;", "Lcom/swmansion/rnscreens/safearea/c;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "T", "oldValue", "newValue", "Ljn0/h0;", "updateNavigationMenuIfNeeded", "(Ljava/lang/Object;Ljava/lang/Object;)V", "updateBottomNavigationViewAppearance", "()V", "updateSelectedTab", "refreshLayout", "", "uiMode", "applyDayNightUiModeIfNeeded", "(I)V", "forceSubtreeMeasureAndLayoutPass", "itemId", "Lcom/swmansion/rnscreens/gamma/tabs/e;", "getFragmentForMenuItemId", "(I)Lcom/swmansion/rnscreens/gamma/tabs/e;", "getSelectedTabScreenFragmentId", "()Ljava/lang/Integer;", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "tabScreen", "Landroid/view/MenuItem;", "getMenuItemForTabScreen", "(Lcom/swmansion/rnscreens/gamma/tabs/a;)Landroid/view/MenuItem;", "onAttachedToWindow", "index", "mountReactSubviewAt$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/a;I)V", "mountReactSubviewAt", "unmountReactSubviewAt$react_native_screens_release", "unmountReactSubviewAt", "reactSubview", "unmountReactSubview$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "unmountReactSubview", "unmountAllReactSubviews$react_native_screens_release", "unmountAllReactSubviews", "", "isFocused", "onTabFocusChangedFromJS", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Z)V", "onMenuItemAttributesChange", "getFragmentForTabScreen", "(Lcom/swmansion/rnscreens/gamma/tabs/a;)Lcom/swmansion/rnscreens/gamma/tabs/e;", "Landroid/content/res/Configuration;", "config", "onFragmentConfigurationChange", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/content/res/Configuration;)V", "requestLayout", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/swmansion/rnscreens/safearea/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnInterfaceInsetsChangeListener", "(Lcom/swmansion/rnscreens/safearea/f;)V", "removeOnInterfaceInsetsChangeListener", "Lcom/swmansion/rnscreens/safearea/a;", "getInterfaceInsets", "()Lcom/swmansion/rnscreens/safearea/a;", "Landroid/view/WindowInsets;", "insets", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "onViewManagerAddEventEmitters$react_native_screens_release", "onViewManagerAddEventEmitters", "Landroid/view/View;", "view", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "Lcom/swmansion/rnscreens/gamma/tabs/l$b;", "containerUpdateCoordinator", "Lcom/swmansion/rnscreens/gamma/tabs/l$b;", "Ln/c;", "wrappedContext", "Ln/c;", "Lcom/google/android/material/bottomnavigation/c;", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/c;", "contentView", "Landroid/widget/FrameLayout;", "Lcom/swmansion/rnscreens/gamma/tabs/q;", "eventEmitter", "Lcom/swmansion/rnscreens/gamma/tabs/q;", "getEventEmitter$react_native_screens_release", "()Lcom/swmansion/rnscreens/gamma/tabs/q;", "setEventEmitter$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/q;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "", "tabScreenFragments", "Ljava/util/List;", "lastAppliedUiMode", "Ljava/lang/Integer;", "isLayoutEnqueued", "Z", "interfaceInsetsChangeListener", "Lcom/swmansion/rnscreens/safearea/f;", "Lcom/swmansion/rnscreens/gamma/tabs/o;", "appearanceCoordinator", "Lcom/swmansion/rnscreens/gamma/tabs/o;", "<set-?>", "tabBarBackgroundColor$delegate", "Lkotlin/properties/d;", "getTabBarBackgroundColor", "setTabBarBackgroundColor", "(Ljava/lang/Integer;)V", "tabBarBackgroundColor", "tabBarItemActiveIndicatorColor$delegate", "getTabBarItemActiveIndicatorColor", "setTabBarItemActiveIndicatorColor", "tabBarItemActiveIndicatorColor", "isTabBarItemActiveIndicatorEnabled$delegate", "isTabBarItemActiveIndicatorEnabled", "()Z", "setTabBarItemActiveIndicatorEnabled", "(Z)V", "tabBarItemIconColor$delegate", "getTabBarItemIconColor", "setTabBarItemIconColor", "tabBarItemIconColor", "", "tabBarItemTitleFontFamily$delegate", "getTabBarItemTitleFontFamily", "()Ljava/lang/String;", "setTabBarItemTitleFontFamily", "(Ljava/lang/String;)V", "tabBarItemTitleFontFamily", "tabBarItemIconColorActive$delegate", "getTabBarItemIconColorActive", "setTabBarItemIconColorActive", "tabBarItemIconColorActive", "tabBarItemTitleFontColor$delegate", "getTabBarItemTitleFontColor", "setTabBarItemTitleFontColor", "tabBarItemTitleFontColor", "tabBarItemTitleFontColorActive$delegate", "getTabBarItemTitleFontColorActive", "setTabBarItemTitleFontColorActive", "tabBarItemTitleFontColorActive", "", "tabBarItemTitleFontSize$delegate", "getTabBarItemTitleFontSize", "()Ljava/lang/Float;", "setTabBarItemTitleFontSize", "(Ljava/lang/Float;)V", "tabBarItemTitleFontSize", "tabBarItemTitleFontSizeActive$delegate", "getTabBarItemTitleFontSizeActive", "setTabBarItemTitleFontSizeActive", "tabBarItemTitleFontSizeActive", "tabBarItemTitleFontWeight$delegate", "getTabBarItemTitleFontWeight", "setTabBarItemTitleFontWeight", "tabBarItemTitleFontWeight", "tabBarItemTitleFontStyle$delegate", "getTabBarItemTitleFontStyle", "setTabBarItemTitleFontStyle", "tabBarItemTitleFontStyle", "tabBarItemRippleColor$delegate", "getTabBarItemRippleColor", "setTabBarItemRippleColor", "tabBarItemRippleColor", "tabBarItemLabelVisibilityMode$delegate", "getTabBarItemLabelVisibilityMode", "setTabBarItemLabelVisibilityMode", "tabBarItemLabelVisibilityMode", "Landroid/view/Choreographer$FrameCallback;", "layoutCallback", "Landroid/view/Choreographer$FrameCallback;", "getRequireFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "requireFragmentManager", "Companion", "b", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends FrameLayout implements com.swmansion.rnscreens.gamma.tabs.b, com.swmansion.rnscreens.safearea.c, View.OnLayoutChangeListener {
    static final /* synthetic */ co0.m<Object>[] $$delegatedProperties = {o0.f(new z(l.class, "tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", 0)), o0.f(new z(l.class, "tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", 0)), o0.f(new z(l.class, "tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", 0)), o0.f(new z(l.class, "tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", 0)), o0.f(new z(l.class, "tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", 0)), o0.f(new z(l.class, "tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", 0))};
    public static final String TAG = "TabsHost";
    private final com.swmansion.rnscreens.gamma.tabs.o appearanceCoordinator;
    private final com.google.android.material.bottomnavigation.c bottomNavigationView;
    private final b containerUpdateCoordinator;
    private final FrameLayout contentView;
    public q eventEmitter;
    private FragmentManager fragmentManager;
    private com.swmansion.rnscreens.safearea.f interfaceInsetsChangeListener;
    private boolean isLayoutEnqueued;

    /* JADX INFO: renamed from: isTabBarItemActiveIndicatorEnabled$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d isTabBarItemActiveIndicatorEnabled;
    private Integer lastAppliedUiMode;
    private final Choreographer.FrameCallback layoutCallback;
    private final v0 reactContext;

    /* JADX INFO: renamed from: tabBarBackgroundColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarBackgroundColor;

    /* JADX INFO: renamed from: tabBarItemActiveIndicatorColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemActiveIndicatorColor;

    /* JADX INFO: renamed from: tabBarItemIconColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemIconColor;

    /* JADX INFO: renamed from: tabBarItemIconColorActive$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemIconColorActive;

    /* JADX INFO: renamed from: tabBarItemLabelVisibilityMode$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemLabelVisibilityMode;

    /* JADX INFO: renamed from: tabBarItemRippleColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemRippleColor;

    /* JADX INFO: renamed from: tabBarItemTitleFontColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontColor;

    /* JADX INFO: renamed from: tabBarItemTitleFontColorActive$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontColorActive;

    /* JADX INFO: renamed from: tabBarItemTitleFontFamily$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontFamily;

    /* JADX INFO: renamed from: tabBarItemTitleFontSize$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontSize;

    /* JADX INFO: renamed from: tabBarItemTitleFontSizeActive$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontSizeActive;

    /* JADX INFO: renamed from: tabBarItemTitleFontStyle$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontStyle;

    /* JADX INFO: renamed from: tabBarItemTitleFontWeight$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemTitleFontWeight;
    private final List<com.swmansion.rnscreens.gamma.tabs.e> tabScreenFragments;
    private final n.c wrappedContext;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/l$b;", "", "<init>", "(Lcom/swmansion/rnscreens/gamma/tabs/l;)V", "Ljn0/h0;", "runContainerUpdateIfNeeded", "()V", "invalidateSelectedTab", "invalidateNavigationMenu", "invalidateAll", "postContainerUpdateIfNeeded", "postContainerUpdate", "runContainerUpdate", "", "isUpdatePending", "Z", "isSelectedTabInvalidated", "isBottomNavigationMenuInvalidated", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class b {
        private boolean isBottomNavigationMenuInvalidated;
        private boolean isSelectedTabInvalidated;
        private boolean isUpdatePending;

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runContainerUpdateIfNeeded() {
            if (this.isUpdatePending) {
                runContainerUpdate();
            }
        }

        public final void invalidateAll() {
            invalidateSelectedTab();
            invalidateNavigationMenu();
        }

        public final void invalidateNavigationMenu() {
            this.isBottomNavigationMenuInvalidated = true;
        }

        public final void invalidateSelectedTab() {
            this.isSelectedTabInvalidated = true;
        }

        public final void postContainerUpdate() {
            this.isUpdatePending = true;
            l.this.post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55504a.runContainerUpdateIfNeeded();
                }
            });
        }

        public final void postContainerUpdateIfNeeded() {
            if (this.isUpdatePending) {
                return;
            }
            postContainerUpdate();
        }

        public final void runContainerUpdate() {
            this.isUpdatePending = false;
            if (this.isSelectedTabInvalidated) {
                this.isSelectedTabInvalidated = false;
                l.this.updateSelectedTab();
            }
            if (this.isBottomNavigationMenuInvalidated) {
                this.isBottomNavigationMenuInvalidated = false;
                l.this.updateBottomNavigationViewAppearance();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$c", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends ObservableProperty<Float> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Float oldValue, Float newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$d", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends ObservableProperty<String> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$e", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends ObservableProperty<String> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$f", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$g", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends ObservableProperty<String> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$h", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$i", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$j", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends ObservableProperty<Boolean> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Boolean oldValue, Boolean newValue) {
            s.k(property, "property");
            Boolean bool = newValue;
            bool.booleanValue();
            Boolean bool2 = oldValue;
            bool2.booleanValue();
            this.this$0.updateNavigationMenuIfNeeded(bool2, bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$k", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.l$l, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$l", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1118l extends ObservableProperty<String> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1118l(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$m", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$n", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$o", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o extends ObservableProperty<Integer> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/l$p", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p extends ObservableProperty<Float> {
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, l lVar) {
            super(obj);
            this.this$0 = lVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Float oldValue, Float newValue) {
            s.k(property, "property");
            l lVar = this.this$0;
            lVar.updateNavigationMenuIfNeeded(oldValue, newValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.containerUpdateCoordinator = new b();
        n.c cVar = new n.c(reactContext, zs.l.f128799h);
        this.wrappedContext = cVar;
        com.google.android.material.bottomnavigation.c cVar2 = new com.google.android.material.bottomnavigation.c(cVar);
        cVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.bottomNavigationView = cVar2;
        FrameLayout frameLayout = new FrameLayout(reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(ba0.e.INSTANCE.generateViewId());
        this.contentView = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.tabScreenFragments = arrayList;
        this.appearanceCoordinator = new com.swmansion.rnscreens.gamma.tabs.o(cVar, cVar2, arrayList);
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.tabBarBackgroundColor = new h(null, this);
        this.tabBarItemActiveIndicatorColor = new i(null, this);
        this.isTabBarItemActiveIndicatorEnabled = new j(Boolean.TRUE, this);
        this.tabBarItemIconColor = new k(null, this);
        this.tabBarItemTitleFontFamily = new C1118l(null, this);
        this.tabBarItemIconColorActive = new m(null, this);
        this.tabBarItemTitleFontColor = new n(null, this);
        this.tabBarItemTitleFontColorActive = new o(null, this);
        this.tabBarItemTitleFontSize = new p(null, this);
        this.tabBarItemTitleFontSizeActive = new c(null, this);
        this.tabBarItemTitleFontWeight = new d(null, this);
        this.tabBarItemTitleFontStyle = new e(null, this);
        this.tabBarItemRippleColor = new f(null, this);
        this.tabBarItemLabelVisibilityMode = new g(null, this);
        addView(frameLayout);
        addView(cVar2);
        cVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.gamma.tabs.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                l._init_$lambda$18(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        cVar2.setOnItemSelectedListener(new com.google.android.material.navigation.e.c() { // from class: com.swmansion.rnscreens.gamma.tabs.g
            @Override // com.google.android.material.navigation.e.c
            public final boolean a(MenuItem menuItem) {
                return l._init_$lambda$19(this.f55496a, menuItem);
            }
        });
        this.layoutCallback = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.gamma.tabs.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                l.layoutCallback$lambda$42(this.f55497a, j11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$18(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        com.swmansion.rnscreens.utils.g.INSTANCE.d(TAG, "BottomNavigationView layout changed {" + i11 + ", " + i12 + "} {" + (i13 - i11) + ", " + (i14 - i12) + "}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$19(l lVar, MenuItem item) {
        String tabKey;
        a tabScreen;
        s.k(item, "item");
        com.swmansion.rnscreens.utils.g.INSTANCE.d(TAG, "Item selected " + item);
        com.swmansion.rnscreens.gamma.tabs.e fragmentForMenuItemId = lVar.getFragmentForMenuItemId(item.getItemId());
        if (fragmentForMenuItemId == null || (tabScreen = fragmentForMenuItemId.getTabScreen()) == null || (tabKey = tabScreen.getTabKey()) == null) {
            tabKey = "undefined";
        }
        lVar.getEventEmitter$react_native_screens_release().emitOnNativeFocusChange(tabKey);
        return true;
    }

    private final void applyDayNightUiModeIfNeeded(int uiMode) {
        Integer num = this.lastAppliedUiMode;
        if (num != null && uiMode == num.intValue()) {
            return;
        }
        if (uiMode == 16) {
            this.wrappedContext.setTheme(zs.l.f128800i);
        } else if (uiMode != 32) {
            this.wrappedContext.setTheme(zs.l.f128799h);
        } else {
            this.wrappedContext.setTheme(zs.l.f128797f);
        }
        this.appearanceCoordinator.updateTabAppearance(this);
        this.lastAppliedUiMode = Integer.valueOf(uiMode);
    }

    private final void forceSubtreeMeasureAndLayoutPass() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    private final com.swmansion.rnscreens.gamma.tabs.e getFragmentForMenuItemId(int itemId) {
        return (com.swmansion.rnscreens.gamma.tabs.e) v.r0(this.tabScreenFragments, itemId);
    }

    private final MenuItem getMenuItemForTabScreen(a tabScreen) {
        Iterator<com.swmansion.rnscreens.gamma.tabs.e> it = this.tabScreenFragments.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().getTabScreen() == tabScreen) {
                break;
            }
            i11++;
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.bottomNavigationView.getMenu().findItem(numValueOf.intValue());
    }

    private final FragmentManager getRequireFragmentManager() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("[RNScreens] Nullish fragment manager");
    }

    private final Integer getSelectedTabScreenFragmentId() {
        if (this.tabScreenFragments.isEmpty()) {
            return null;
        }
        Iterator<com.swmansion.rnscreens.gamma.tabs.e> it = this.tabScreenFragments.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().getTabScreen().getIsFocusedTab()) {
                return Integer.valueOf(i11);
            }
            i11++;
        }
        i11 = -1;
        return Integer.valueOf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutCallback$lambda$42(l lVar, long j11) {
        lVar.isLayoutEnqueued = false;
        lVar.forceSubtreeMeasureAndLayoutPass();
    }

    private final void refreshLayout() {
        if (this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        com.facebook.react.modules.core.b.INSTANCE.a().k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unmountReactSubview$lambda$26(a aVar, com.swmansion.rnscreens.gamma.tabs.e it) {
        s.k(it, "it");
        return it.getTabScreen() == aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unmountReactSubview$lambda$27(wn0.l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomNavigationViewAppearance() {
        com.swmansion.rnscreens.utils.g.INSTANCE.d(TAG, "updateBottomNavigationViewAppearance");
        this.appearanceCoordinator.updateTabAppearance(this);
        com.google.android.material.bottomnavigation.c cVar = this.bottomNavigationView;
        Integer selectedTabScreenFragmentId = getSelectedTabScreenFragmentId();
        if (selectedTabScreenFragmentId == null) {
            throw new IllegalStateException("[RNScreens] A single selected tab must be present");
        }
        cVar.setSelectedItemId(selectedTabScreenFragmentId.intValue());
        post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.i
            @Override // java.lang.Runnable
            public final void run() {
                l.updateBottomNavigationViewAppearance$lambda$37(this.f55498a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBottomNavigationViewAppearance$lambda$37(l lVar) {
        lVar.refreshLayout();
        com.swmansion.rnscreens.utils.g.INSTANCE.d(TAG, "BottomNavigationView request layout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void updateNavigationMenuIfNeeded(T oldValue, T newValue) {
        if (s.f(newValue, oldValue)) {
            return;
        }
        b bVar = this.containerUpdateCoordinator;
        bVar.invalidateNavigationMenu();
        bVar.postContainerUpdateIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectedTab() {
        Object next;
        Iterator<T> it = this.tabScreenFragments.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.swmansion.rnscreens.gamma.tabs.e) next).getTabScreen().getIsFocusedTab());
        if (next == null) {
            throw new IllegalStateException("[RNScreens] No focused tab present");
        }
        com.swmansion.rnscreens.gamma.tabs.e eVar = (com.swmansion.rnscreens.gamma.tabs.e) next;
        if (getRequireFragmentManager().A0().size() > 1) {
            throw new IllegalStateException("[RNScreens] There can be only a single focused tab");
        }
        List<Fragment> listA0 = getRequireFragmentManager().A0();
        s.j(listA0, "getFragments(...)");
        Fragment fragment = (Fragment) v.q0(listA0);
        if (eVar == fragment) {
            return;
        }
        r0 r0VarX = getRequireFragmentManager().r().x(true);
        if (fragment != null) {
            r0VarX.n(fragment);
        }
        r0VarX.b(this.contentView.getId(), eVar);
        r0VarX.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return super.dispatchApplyWindowInsets(insets);
        }
        if (!(insets != null ? insets.isConsumed() : true)) {
            Iterator<View> it = s0.a(this).iterator();
            while (it.hasNext()) {
                it.next().dispatchApplyWindowInsets(insets);
            }
        }
        return insets;
    }

    public final q getEventEmitter$react_native_screens_release() {
        q qVar = this.eventEmitter;
        if (qVar != null) {
            return qVar;
        }
        s.B("eventEmitter");
        return null;
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public EdgeInsets getInterfaceInsets() {
        return new EdgeInsets(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.bottomNavigationView.getHeight());
    }

    public final v0 getReactContext() {
        return this.reactContext;
    }

    public final Integer getTabBarBackgroundColor() {
        return (Integer) this.tabBarBackgroundColor.getValue(this, $$delegatedProperties[0]);
    }

    public final Integer getTabBarItemActiveIndicatorColor() {
        return (Integer) this.tabBarItemActiveIndicatorColor.getValue(this, $$delegatedProperties[1]);
    }

    public final Integer getTabBarItemIconColor() {
        return (Integer) this.tabBarItemIconColor.getValue(this, $$delegatedProperties[3]);
    }

    public final Integer getTabBarItemIconColorActive() {
        return (Integer) this.tabBarItemIconColorActive.getValue(this, $$delegatedProperties[5]);
    }

    public final String getTabBarItemLabelVisibilityMode() {
        return (String) this.tabBarItemLabelVisibilityMode.getValue(this, $$delegatedProperties[13]);
    }

    public final Integer getTabBarItemRippleColor() {
        return (Integer) this.tabBarItemRippleColor.getValue(this, $$delegatedProperties[12]);
    }

    public final Integer getTabBarItemTitleFontColor() {
        return (Integer) this.tabBarItemTitleFontColor.getValue(this, $$delegatedProperties[6]);
    }

    public final Integer getTabBarItemTitleFontColorActive() {
        return (Integer) this.tabBarItemTitleFontColorActive.getValue(this, $$delegatedProperties[7]);
    }

    public final String getTabBarItemTitleFontFamily() {
        return (String) this.tabBarItemTitleFontFamily.getValue(this, $$delegatedProperties[4]);
    }

    public final Float getTabBarItemTitleFontSize() {
        return (Float) this.tabBarItemTitleFontSize.getValue(this, $$delegatedProperties[8]);
    }

    public final Float getTabBarItemTitleFontSizeActive() {
        return (Float) this.tabBarItemTitleFontSizeActive.getValue(this, $$delegatedProperties[9]);
    }

    public final String getTabBarItemTitleFontStyle() {
        return (String) this.tabBarItemTitleFontStyle.getValue(this, $$delegatedProperties[11]);
    }

    public final String getTabBarItemTitleFontWeight() {
        return (String) this.tabBarItemTitleFontWeight.getValue(this, $$delegatedProperties[10]);
    }

    public final boolean isTabBarItemActiveIndicatorEnabled() {
        return ((Boolean) this.isTabBarItemActiveIndicatorEnabled.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final void mountReactSubviewAt$react_native_screens_release(a tabScreen, int index) {
        s.k(tabScreen, "tabScreen");
        if (index < this.bottomNavigationView.getMaxItemCount()) {
            this.tabScreenFragments.add(index, new com.swmansion.rnscreens.gamma.tabs.e(tabScreen));
            tabScreen.setTabScreenDelegate$react_native_screens_release(this);
            b bVar = this.containerUpdateCoordinator;
            bVar.invalidateAll();
            bVar.postContainerUpdateIfNeeded();
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] Attempt to insert TabScreen at index " + index + "; BottomNavigationView supports at most " + this.bottomNavigationView.getMaxItemCount() + " items").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.swmansion.rnscreens.utils.g.INSTANCE.d(TAG, "TabsHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        FragmentManager fragmentManagerFindFragmentManagerForView = ba0.b.INSTANCE.findFragmentManagerForView(this);
        if (fragmentManagerFindFragmentManagerForView == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.fragmentManager = fragmentManagerFindFragmentManagerForView;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig != null) {
            applyDayNightUiModeIfNeeded(newConfig.uiMode & 48);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void onFragmentConfigurationChange(a tabScreen, Configuration config) {
        s.k(tabScreen, "tabScreen");
        s.k(config, "config");
        onConfigurationChanged(config);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        com.swmansion.rnscreens.safearea.f fVar;
        if (!(view instanceof com.google.android.material.bottomnavigation.c)) {
            throw new IllegalArgumentException(("[RNScreens] TabsHost's onLayoutChange expects BottomNavigationView, received " + view + " instead").toString());
        }
        int i11 = bottom - top;
        if (i11 == oldBottom - oldTop || (fVar = this.interfaceInsetsChangeListener) == null) {
            return;
        }
        fVar.onInterfaceInsetsChange(new EdgeInsets(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11));
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void onMenuItemAttributesChange(a tabScreen) {
        s.k(tabScreen, "tabScreen");
        MenuItem menuItemForTabScreen = getMenuItemForTabScreen(tabScreen);
        if (menuItemForTabScreen != null) {
            this.appearanceCoordinator.updateMenuItemAppearance(menuItemForTabScreen, tabScreen);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void onTabFocusChangedFromJS(a tabScreen, boolean isFocused) {
        s.k(tabScreen, "tabScreen");
        b bVar = this.containerUpdateCoordinator;
        bVar.invalidateAll();
        bVar.postContainerUpdateIfNeeded();
    }

    public final void onViewManagerAddEventEmitters$react_native_screens_release() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsHost must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new q(this.reactContext, getId()));
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public void removeOnInterfaceInsetsChangeListener(com.swmansion.rnscreens.safearea.f listener) {
        s.k(listener, "listener");
        if (s.f(this.interfaceInsetsChangeListener, listener)) {
            this.interfaceInsetsChangeListener = null;
            this.bottomNavigationView.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        refreshLayout();
    }

    public final void setEventEmitter$react_native_screens_release(q qVar) {
        s.k(qVar, "<set-?>");
        this.eventEmitter = qVar;
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public void setOnInterfaceInsetsChangeListener(com.swmansion.rnscreens.safearea.f listener) {
        s.k(listener, "listener");
        if (this.interfaceInsetsChangeListener == null) {
            this.bottomNavigationView.addOnLayoutChangeListener(this);
        }
        this.interfaceInsetsChangeListener = listener;
    }

    public final void setTabBarBackgroundColor(Integer num) {
        this.tabBarBackgroundColor.setValue(this, $$delegatedProperties[0], num);
    }

    public final void setTabBarItemActiveIndicatorColor(Integer num) {
        this.tabBarItemActiveIndicatorColor.setValue(this, $$delegatedProperties[1], num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z11) {
        this.isTabBarItemActiveIndicatorEnabled.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z11));
    }

    public final void setTabBarItemIconColor(Integer num) {
        this.tabBarItemIconColor.setValue(this, $$delegatedProperties[3], num);
    }

    public final void setTabBarItemIconColorActive(Integer num) {
        this.tabBarItemIconColorActive.setValue(this, $$delegatedProperties[5], num);
    }

    public final void setTabBarItemLabelVisibilityMode(String str) {
        this.tabBarItemLabelVisibilityMode.setValue(this, $$delegatedProperties[13], str);
    }

    public final void setTabBarItemRippleColor(Integer num) {
        this.tabBarItemRippleColor.setValue(this, $$delegatedProperties[12], num);
    }

    public final void setTabBarItemTitleFontColor(Integer num) {
        this.tabBarItemTitleFontColor.setValue(this, $$delegatedProperties[6], num);
    }

    public final void setTabBarItemTitleFontColorActive(Integer num) {
        this.tabBarItemTitleFontColorActive.setValue(this, $$delegatedProperties[7], num);
    }

    public final void setTabBarItemTitleFontFamily(String str) {
        this.tabBarItemTitleFontFamily.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setTabBarItemTitleFontSize(Float f11) {
        this.tabBarItemTitleFontSize.setValue(this, $$delegatedProperties[8], f11);
    }

    public final void setTabBarItemTitleFontSizeActive(Float f11) {
        this.tabBarItemTitleFontSizeActive.setValue(this, $$delegatedProperties[9], f11);
    }

    public final void setTabBarItemTitleFontStyle(String str) {
        this.tabBarItemTitleFontStyle.setValue(this, $$delegatedProperties[11], str);
    }

    public final void setTabBarItemTitleFontWeight(String str) {
        this.tabBarItemTitleFontWeight.setValue(this, $$delegatedProperties[10], str);
    }

    public final void unmountAllReactSubviews$react_native_screens_release() {
        Iterator<T> it = this.tabScreenFragments.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.tabs.e) it.next()).getTabScreen().setTabScreenDelegate$react_native_screens_release(null);
        }
        this.tabScreenFragments.clear();
        b bVar = this.containerUpdateCoordinator;
        bVar.invalidateAll();
        bVar.postContainerUpdateIfNeeded();
    }

    public final void unmountReactSubview$react_native_screens_release(final a reactSubview) {
        s.k(reactSubview, "reactSubview");
        List<com.swmansion.rnscreens.gamma.tabs.e> list = this.tabScreenFragments;
        final wn0.l lVar = new wn0.l() { // from class: com.swmansion.rnscreens.gamma.tabs.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l.unmountReactSubview$lambda$26(reactSubview, (e) obj));
            }
        };
        boolean zRemoveIf = list.removeIf(new Predicate() { // from class: com.swmansion.rnscreens.gamma.tabs.k
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l.unmountReactSubview$lambda$27(lVar, obj);
            }
        });
        Boolean boolValueOf = Boolean.valueOf(zRemoveIf);
        if (!zRemoveIf) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            reactSubview.setTabScreenDelegate$react_native_screens_release(null);
            b bVar = this.containerUpdateCoordinator;
            bVar.invalidateAll();
            bVar.postContainerUpdateIfNeeded();
        }
    }

    public final void unmountReactSubviewAt$react_native_screens_release(int index) {
        this.tabScreenFragments.remove(index).getTabScreen().setTabScreenDelegate$react_native_screens_release(null);
        b bVar = this.containerUpdateCoordinator;
        bVar.invalidateAll();
        bVar.postContainerUpdateIfNeeded();
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public com.swmansion.rnscreens.gamma.tabs.e getFragmentForTabScreen(a tabScreen) {
        Object next;
        s.k(tabScreen, "tabScreen");
        Iterator<T> it = this.tabScreenFragments.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.e) next).getTabScreen() == tabScreen) {
                return (com.swmansion.rnscreens.gamma.tabs.e) next;
            }
        }
        next = null;
        return (com.swmansion.rnscreens.gamma.tabs.e) next;
    }
}
