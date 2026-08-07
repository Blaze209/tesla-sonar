package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.v0;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.z;
import p013kotlin.properties.ObservableProperty;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\nH\u0000¢\u0006\u0004\b\"\u0010\u000eJ\u001f\u0010*\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010:\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R/\u0010E\u001a\u0004\u0018\u0001082\b\u0010@\u001a\u0004\u0018\u0001088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010=\"\u0004\bD\u0010?R/\u0010I\u001a\u0004\u0018\u0001082\b\u0010@\u001a\u0004\u0018\u0001088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010B\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R/\u0010O\u001a\u0004\u0018\u00010\u00122\b\u0010@\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR/\u0010S\u001a\u0004\u0018\u00010\u00122\b\u0010@\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR/\u0010W\u001a\u0004\u0018\u0001082\b\u0010@\u001a\u0004\u0018\u0001088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010B\u001a\u0004\bU\u0010=\"\u0004\bV\u0010?R/\u0010^\u001a\u0004\u0018\u00010X2\b\u0010@\u001a\u0004\u0018\u00010X8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010B\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010_\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\b_\u0010a\"\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/a;", "Landroid/view/ViewGroup;", "Lcom/swmansion/rnscreens/gamma/common/b;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "T", "oldValue", "newValue", "Ljn0/h0;", "updateMenuItemAttributesIfNeeded", "(Ljava/lang/Object;Ljava/lang/Object;)V", "onTabFocusChangedFromJS", "()V", "onMenuItemAttributesChange", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onAttachedToWindow", "Lcom/swmansion/rnscreens/gamma/tabs/b;", "delegate", "setTabScreenDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/b;)V", "setTabScreenDelegate", "Landroidx/fragment/app/Fragment;", "getAssociatedFragment", "()Landroidx/fragment/app/Fragment;", "onViewManagerAddEventEmitters$react_native_screens_release", "onViewManagerAddEventEmitters", "Lcom/swmansion/rnscreens/gamma/tabs/e;", "fragment", "Landroid/content/res/Configuration;", "config", "onFragmentConfigurationChange$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/e;Landroid/content/res/Configuration;)V", "onFragmentConfigurationChange", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "Ljava/lang/ref/WeakReference;", "tabScreenDelegate", "Ljava/lang/ref/WeakReference;", "Lcom/swmansion/rnscreens/gamma/tabs/c;", "eventEmitter", "Lcom/swmansion/rnscreens/gamma/tabs/c;", "getEventEmitter$react_native_screens_release", "()Lcom/swmansion/rnscreens/gamma/tabs/c;", "setEventEmitter$react_native_screens_release", "(Lcom/swmansion/rnscreens/gamma/tabs/c;)V", "", "value", "tabKey", "Ljava/lang/String;", "getTabKey", "()Ljava/lang/String;", "setTabKey", "(Ljava/lang/String;)V", "<set-?>", "tabTitle$delegate", "Lkotlin/properties/d;", "getTabTitle", "setTabTitle", "tabTitle", "badgeValue$delegate", "getBadgeValue", "setBadgeValue", "badgeValue", "tabBarItemBadgeTextColor$delegate", "getTabBarItemBadgeTextColor", "()Ljava/lang/Integer;", "setTabBarItemBadgeTextColor", "(Ljava/lang/Integer;)V", "tabBarItemBadgeTextColor", "tabBarItemBadgeBackgroundColor$delegate", "getTabBarItemBadgeBackgroundColor", "setTabBarItemBadgeBackgroundColor", "tabBarItemBadgeBackgroundColor", "drawableIconResourceName$delegate", "getDrawableIconResourceName", "setDrawableIconResourceName", "drawableIconResourceName", "Landroid/graphics/drawable/Drawable;", "icon$delegate", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "isFocusedTab", "Z", "()Z", "setFocusedTab", "(Z)V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends ViewGroup implements com.swmansion.rnscreens.gamma.common.b {
    static final /* synthetic */ co0.m<Object>[] $$delegatedProperties = {o0.f(new z(a.class, "tabTitle", "getTabTitle()Ljava/lang/String;", 0)), o0.f(new z(a.class, "badgeValue", "getBadgeValue()Ljava/lang/String;", 0)), o0.f(new z(a.class, "tabBarItemBadgeTextColor", "getTabBarItemBadgeTextColor()Ljava/lang/Integer;", 0)), o0.f(new z(a.class, "tabBarItemBadgeBackgroundColor", "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;", 0)), o0.f(new z(a.class, "drawableIconResourceName", "getDrawableIconResourceName()Ljava/lang/String;", 0)), o0.f(new z(a.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0))};
    public static final String TAG = "TabScreen";

    /* JADX INFO: renamed from: badgeValue$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d badgeValue;

    /* JADX INFO: renamed from: drawableIconResourceName$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d drawableIconResourceName;
    public com.swmansion.rnscreens.gamma.tabs.c eventEmitter;

    /* JADX INFO: renamed from: icon$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d icon;
    private boolean isFocusedTab;
    private final v0 reactContext;

    /* JADX INFO: renamed from: tabBarItemBadgeBackgroundColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemBadgeBackgroundColor;

    /* JADX INFO: renamed from: tabBarItemBadgeTextColor$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabBarItemBadgeTextColor;
    private String tabKey;
    private WeakReference<com.swmansion.rnscreens.gamma.tabs.b> tabScreenDelegate;

    /* JADX INFO: renamed from: tabTitle$delegate, reason: from kotlin metadata */
    private final p013kotlin.properties.d tabTitle;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/a$b", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends ObservableProperty<String> {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, a aVar) {
            super(obj);
            this.this$0 = aVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            a aVar = this.this$0;
            aVar.updateMenuItemAttributesIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/a$c", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends ObservableProperty<String> {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, a aVar) {
            super(obj);
            this.this$0 = aVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            a aVar = this.this$0;
            aVar.updateMenuItemAttributesIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/a$d", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends ObservableProperty<Integer> {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, a aVar) {
            super(obj);
            this.this$0 = aVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            a aVar = this.this$0;
            aVar.updateMenuItemAttributesIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/a$e", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends ObservableProperty<Integer> {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, a aVar) {
            super(obj);
            this.this$0 = aVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Integer oldValue, Integer newValue) {
            s.k(property, "property");
            a aVar = this.this$0;
            aVar.updateMenuItemAttributesIfNeeded(oldValue, newValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/a$f", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends ObservableProperty<String> {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, a aVar) {
            super(obj);
            this.this$0 = aVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, String oldValue, String newValue) {
            s.k(property, "property");
            String str = newValue;
            if (s.f(str, oldValue)) {
                return;
            }
            a aVar = this.this$0;
            aVar.setIcon(ba0.d.getSystemDrawableResource(aVar.getReactContext(), str));
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/gamma/tabs/a$g", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends ObservableProperty<Drawable> {
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, a aVar) {
            super(obj);
            this.this$0 = aVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, Drawable oldValue, Drawable newValue) {
            s.k(property, "property");
            a aVar = this.this$0;
            aVar.updateMenuItemAttributesIfNeeded(oldValue, newValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.tabScreenDelegate = new WeakReference<>(null);
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.tabTitle = new b(null, this);
        this.badgeValue = new c(null, this);
        this.tabBarItemBadgeTextColor = new d(null, this);
        this.tabBarItemBadgeBackgroundColor = new e(null, this);
        this.drawableIconResourceName = new f(null, this);
        this.icon = new g(null, this);
    }

    private final void onMenuItemAttributesChange() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = this.tabScreenDelegate.get();
        if (bVar != null) {
            bVar.onMenuItemAttributesChange(this);
        }
    }

    private final void onTabFocusChangedFromJS() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = this.tabScreenDelegate.get();
        if (bVar != null) {
            bVar.onTabFocusChangedFromJS(this, this.isFocusedTab);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void updateMenuItemAttributesIfNeeded(T oldValue, T newValue) {
        if (s.f(newValue, oldValue)) {
            return;
        }
        onMenuItemAttributesChange();
    }

    @Override // com.swmansion.rnscreens.gamma.common.b
    public Fragment getAssociatedFragment() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = this.tabScreenDelegate.get();
        if (bVar != null) {
            return bVar.getFragmentForTabScreen(this);
        }
        return null;
    }

    public final String getBadgeValue() {
        return (String) this.badgeValue.getValue(this, $$delegatedProperties[1]);
    }

    public final String getDrawableIconResourceName() {
        return (String) this.drawableIconResourceName.getValue(this, $$delegatedProperties[4]);
    }

    public final com.swmansion.rnscreens.gamma.tabs.c getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.c cVar = this.eventEmitter;
        if (cVar != null) {
            return cVar;
        }
        s.B("eventEmitter");
        return null;
    }

    public final Drawable getIcon() {
        return (Drawable) this.icon.getValue(this, $$delegatedProperties[5]);
    }

    public final v0 getReactContext() {
        return this.reactContext;
    }

    public final Integer getTabBarItemBadgeBackgroundColor() {
        return (Integer) this.tabBarItemBadgeBackgroundColor.getValue(this, $$delegatedProperties[3]);
    }

    public final Integer getTabBarItemBadgeTextColor() {
        return (Integer) this.tabBarItemBadgeTextColor.getValue(this, $$delegatedProperties[2]);
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabTitle() {
        return (String) this.tabTitle.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: renamed from: isFocusedTab, reason: from getter */
    public final boolean getIsFocusedTab() {
        return this.isFocusedTab;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.swmansion.rnscreens.utils.g.INSTANCE.d(TAG, "TabScreen [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    public final void onFragmentConfigurationChange$react_native_screens_release(com.swmansion.rnscreens.gamma.tabs.e fragment, Configuration config) {
        s.k(fragment, "fragment");
        s.k(config, "config");
        com.swmansion.rnscreens.gamma.tabs.b bVar = this.tabScreenDelegate.get();
        if (bVar != null) {
            bVar.onFragmentConfigurationChange(this, config);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }

    public final void onViewManagerAddEventEmitters$react_native_screens_release() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.tabs.c(this.reactContext, getId()));
    }

    public final void setBadgeValue(String str) {
        this.badgeValue.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setDrawableIconResourceName(String str) {
        this.drawableIconResourceName.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setEventEmitter$react_native_screens_release(com.swmansion.rnscreens.gamma.tabs.c cVar) {
        s.k(cVar, "<set-?>");
        this.eventEmitter = cVar;
    }

    public final void setFocusedTab(boolean z11) {
        if (this.isFocusedTab != z11) {
            this.isFocusedTab = z11;
            onTabFocusChangedFromJS();
        }
    }

    public final void setIcon(Drawable drawable) {
        this.icon.setValue(this, $$delegatedProperties[5], drawable);
    }

    public final void setTabBarItemBadgeBackgroundColor(Integer num) {
        this.tabBarItemBadgeBackgroundColor.setValue(this, $$delegatedProperties[3], num);
    }

    public final void setTabBarItemBadgeTextColor(Integer num) {
        this.tabBarItemBadgeTextColor.setValue(this, $$delegatedProperties[2], num);
    }

    public final void setTabKey(String str) {
        if (str != null && t.y0(str)) {
            str = null;
        }
        this.tabKey = str;
    }

    public final void setTabScreenDelegate$react_native_screens_release(com.swmansion.rnscreens.gamma.tabs.b delegate) {
        this.tabScreenDelegate = new WeakReference<>(delegate);
    }

    public final void setTabTitle(String str) {
        this.tabTitle.setValue(this, $$delegatedProperties[0], str);
    }
}
