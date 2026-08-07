package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0002\u0082\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010(¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010(¢\u0006\u0004\b/\u0010+J\u0015\u00102\u001a\u00020\t2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0014¢\u0006\u0004\b5\u0010#J\u0015\u00106\u001a\u00020\t2\u0006\u00104\u001a\u00020\u0014¢\u0006\u0004\b6\u0010#J\u0017\u00107\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b=\u0010;J\u0015\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\b?\u0010;J\u0015\u0010A\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bA\u0010;J\u0015\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u000f¢\u0006\u0004\bC\u0010;J\u0017\u0010E\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010(¢\u0006\u0004\bE\u0010+R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR$\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u001f0Gj\b\u0012\u0004\u0012\u00020\u001f`H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0017\u0010\u000e\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010NR\"\u0010O\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bO\u0010Q\"\u0004\bR\u0010;R\"\u0010S\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010P\u001a\u0004\bS\u0010Q\"\u0004\bT\u0010;R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010UR\u0016\u0010V\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010,\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010UR\u0018\u0010D\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010UR\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010XR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010PR\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010PR\u0016\u0010^\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010PR\u0016\u0010B\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010PR\u0016\u0010_\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010WR\u0016\u0010`\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010PR\u0014\u0010a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010WR\u0014\u0010b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010WR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010P\u001a\u0004\bf\u0010Q\"\u0004\bg\u0010;R\u0016\u0010k\u001a\u0004\u0018\u00010h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0011\u0010r\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0011\u0010t\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0011\u0010v\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bu\u0010qR\u0013\u0010z\u001a\u0004\u0018\u00010w8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0011\u0010|\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b{\u0010qR\u0015\u0010\u0080\u0001\u001a\u00020}8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/swmansion/rnscreens/w0;", "Lcom/swmansion/rnscreens/e;", "Lcom/facebook/react/uimanager/f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "pointerEventsImpl", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/f0;)V", "(Landroid/content/Context;)V", "Ljn0/h0;", "maybeUpdate", "()V", "destroy", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "", "shouldUpdateShadowStateHint", "onNativeToolbarLayout", "(Landroidx/appcompat/widget/Toolbar;Z)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onAttachedToWindow", "onDetachedFromWindow", "onUpdate", "index", "Lcom/swmansion/rnscreens/y0;", "getConfigSubview", "(I)Lcom/swmansion/rnscreens/y0;", "removeConfigSubview", "(I)V", "removeAllConfigSubviews", "child", "addConfigSubview", "(Lcom/swmansion/rnscreens/y0;I)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "fontWeightString", "setTitleFontWeight", "", "titleFontSize", "setTitleFontSize", "(F)V", "color", "setTitleColor", "setTintColor", "setBackgroundColor", "(Ljava/lang/Integer;)V", "hideShadow", "setHideShadow", "(Z)V", "hideBackButton", "setHideBackButton", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "Lcom/facebook/react/uimanager/f0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "configSubviews", "Ljava/util/ArrayList;", "Lcom/swmansion/rnscreens/d;", "Lcom/swmansion/rnscreens/d;", "getToolbar", "()Lcom/swmansion/rnscreens/d;", "isHeaderHidden", "Z", "()Z", "setHeaderHidden", "isHeaderTranslucent", "setHeaderTranslucent", "Ljava/lang/String;", "titleColor", "I", Gender.FEMALE, "titleFontWeight", "backgroundColor", "Ljava/lang/Integer;", "isBackButtonHidden", "isShadowHidden", "isDestroyed", "tintColor", "isAttachedToWindow", "defaultStartInset", "defaultStartInsetWithNavigation", "Landroid/view/View$OnClickListener;", "backClickListener", "Landroid/view/View$OnClickListener;", "isTitleEmpty", "setTitleEmpty", "Lcom/swmansion/rnscreens/t;", "getScreen", "()Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "Lcom/swmansion/rnscreens/m0;", "getScreenStack", "()Lcom/swmansion/rnscreens/m0;", "screenStack", "getPreferredContentInsetStart", "()I", "preferredContentInsetStart", "getPreferredContentInsetEnd", "preferredContentInsetEnd", "getPreferredContentInsetStartWithNavigation", "preferredContentInsetStartWithNavigation", "Lcom/swmansion/rnscreens/t0;", "getScreenFragment", "()Lcom/swmansion/rnscreens/t0;", "screenFragment", "getConfigSubviewsCount", "configSubviewsCount", "Lcom/facebook/react/uimanager/x;", "getPointerEvents", "()Lcom/facebook/react/uimanager/x;", "pointerEvents", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 extends e implements com.facebook.react.uimanager.f0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean backButtonInCustomView;
    private final View.OnClickListener backClickListener;
    private Integer backgroundColor;
    private final ArrayList<y0> configSubviews;
    private final int defaultStartInset;
    private final int defaultStartInsetWithNavigation;
    private String direction;
    private boolean isAttachedToWindow;
    private boolean isBackButtonHidden;
    private boolean isDestroyed;
    private boolean isHeaderHidden;
    private boolean isHeaderTranslucent;
    private boolean isShadowHidden;
    private boolean isTitleEmpty;
    private final com.facebook.react.uimanager.f0 pointerEventsImpl;
    private int tintColor;
    private String title;
    private int titleColor;
    private String titleFontFamily;
    private float titleFontSize;
    private int titleFontWeight;
    private final d toolbar;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.w0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/w0$a;", "", "<init>", "()V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", "findTitleTextViewInToolbar", "(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/TextView;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView findTitleTextViewInToolbar(Toolbar toolbar) {
            p013kotlin.jvm.internal.s.k(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = toolbar.getChildAt(i11);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[y0.a.values().length];
            try {
                iArr[y0.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context, com.facebook.react.uimanager.f0 pointerEventsImpl) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(pointerEventsImpl, "pointerEventsImpl");
        this.pointerEventsImpl = pointerEventsImpl;
        this.configSubviews = new ArrayList<>(3);
        this.backClickListener = new View.OnClickListener() { // from class: com.swmansion.rnscreens.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.backClickListener$lambda$1(this.f55521a, view);
            }
        };
        setVisibility(8);
        d dVar = new d(context, this);
        this.toolbar = dVar;
        this.defaultStartInset = dVar.getContentInsetStart();
        this.defaultStartInsetWithNavigation = dVar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            dVar.setBackgroundColor(typedValue.data);
        }
        dVar.setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backClickListener$lambda$1(w0 w0Var, View view) {
        t0 screenFragment = w0Var.getScreenFragment();
        if (screenFragment != null) {
            m0 screenStack = w0Var.getScreenStack();
            if (screenStack == null || !p013kotlin.jvm.internal.s.f(screenStack.getRootScreen(), screenFragment.getScreen())) {
                if (screenFragment.getScreen().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.dismissFromContainer();
                    return;
                } else {
                    screenFragment.dispatchHeaderBackButtonClickedEvent();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof t0) {
                t0 t0Var = (t0) parentFragment;
                if (t0Var.getScreen().getNativeBackButtonDismissalEnabled()) {
                    t0Var.dismissFromContainer();
                } else {
                    t0Var.dispatchHeaderBackButtonClickedEvent();
                }
            }
        }
    }

    private final t getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof t) {
            return (t) parent;
        }
        return null;
    }

    private final m0 getScreenStack() {
        t screen = getScreen();
        v container = screen != null ? screen.getContainer() : null;
        if (container instanceof m0) {
            return (m0) container;
        }
        return null;
    }

    private final void maybeUpdate() {
        t screen;
        if (getParent() == null || this.isDestroyed || (screen = getScreen()) == null || screen.getIsBeingRemoved()) {
            return;
        }
        onUpdate();
    }

    public final void addConfigSubview(y0 child, int index) {
        p013kotlin.jvm.internal.s.k(child, "child");
        this.configSubviews.add(index, child);
        maybeUpdate();
    }

    public final void destroy() {
        this.isDestroyed = true;
    }

    public final y0 getConfigSubview(int index) {
        y0 y0Var = this.configSubviews.get(index);
        p013kotlin.jvm.internal.s.j(y0Var, "get(...)");
        return y0Var;
    }

    public final int getConfigSubviewsCount() {
        return this.configSubviews.size();
    }

    @Override // com.facebook.react.uimanager.f0
    public com.facebook.react.uimanager.x getPointerEvents() {
        return this.pointerEventsImpl.getPointerEvents();
    }

    /* JADX INFO: renamed from: getPreferredContentInsetEnd, reason: from getter */
    public final int getDefaultStartInset() {
        return this.defaultStartInset;
    }

    public final int getPreferredContentInsetStart() {
        return this.defaultStartInset;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.isTitleEmpty) {
            return 0;
        }
        return this.defaultStartInsetWithNavigation;
    }

    public final t0 getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof t)) {
            return null;
        }
        Fragment fragment = ((t) parent).getFragment();
        if (fragment instanceof t0) {
            return (t0) fragment;
        }
        return null;
    }

    public final d getToolbar() {
        return this.toolbar;
    }

    /* JADX INFO: renamed from: isHeaderHidden, reason: from getter */
    public final boolean getIsHeaderHidden() {
        return this.isHeaderHidden;
    }

    /* JADX INFO: renamed from: isHeaderTranslucent, reason: from getter */
    public final boolean getIsHeaderTranslucent() {
        return this.isHeaderTranslucent;
    }

    /* JADX INFO: renamed from: isTitleEmpty, reason: from getter */
    public final boolean getIsTitleEmpty() {
        return this.isTitleEmpty;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        int iF = com.facebook.react.uimanager.b1.f(this);
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.a(iF, getId()));
        }
        onUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        int iF = com.facebook.react.uimanager.b1.f(this);
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.c(iF, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }

    public final void onNativeToolbarLayout(Toolbar toolbar, boolean shouldUpdateShadowStateHint) {
        Object next;
        p013kotlin.jvm.internal.s.k(toolbar, "toolbar");
        if (shouldUpdateShadowStateHint) {
            int currentContentInsetStart = toolbar.getNavigationIcon() != null ? toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart() : Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            Iterator<T> it = this.configSubviews.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((y0) next).getType() != y0.a.LEFT);
            y0 y0Var = (y0) next;
            if (y0Var != null) {
                currentContentInsetStart = y0Var.getLeft();
            }
            updateHeaderConfigState(toolbar.getWidth(), toolbar.getHeight(), currentContentInsetStart, toolbar.getCurrentContentInsetEnd() + toolbar.getPaddingEnd());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void onUpdate() {
        Drawable navigationIcon;
        t0 screenFragment;
        t0 screenFragment2;
        ReactContext reactContextTryGetContext;
        m0 screenStack = getScreenStack();
        boolean z11 = screenStack == null || p013kotlin.jvm.internal.s.f(screenStack.getTopScreen(), getParent());
        if (this.isAttachedToWindow && z11 && !this.isDestroyed) {
            t0 screenFragment3 = getScreenFragment();
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (cVar == null) {
                return;
            }
            String str = this.direction;
            if (str != null) {
                if (p013kotlin.jvm.internal.s.f(str, "rtl")) {
                    this.toolbar.setLayoutDirection(1);
                } else if (p013kotlin.jvm.internal.s.f(this.direction, "ltr")) {
                    this.toolbar.setLayoutDirection(0);
                }
            }
            t screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextTryGetContext = (ReactContext) context;
                } else {
                    b0 fragmentWrapper = screen.getFragmentWrapper();
                    reactContextTryGetContext = fragmentWrapper != null ? fragmentWrapper.tryGetContext() : null;
                }
                c1.INSTANCE.trySetWindowTraits$react_native_screens_release(screen, cVar, reactContextTryGetContext);
            }
            if (this.isHeaderHidden) {
                if (this.toolbar.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                screenFragment2.removeToolbar();
                return;
            }
            if (this.toolbar.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.setToolbar(this.toolbar);
            }
            cVar.setSupportActionBar(this.toolbar);
            ActionBar supportActionBar = cVar.getSupportActionBar();
            if (supportActionBar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            t0 screenFragment4 = getScreenFragment();
            supportActionBar.u((screenFragment4 == null || !screenFragment4.canNavigateBack() || this.isBackButtonHidden) ? false : true);
            supportActionBar.B(this.title);
            if (TextUtils.isEmpty(this.title)) {
                this.isTitleEmpty = true;
            }
            this.toolbar.updateContentInsets();
            this.toolbar.setNavigationOnClickListener(this.backClickListener);
            t0 screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.setToolbarShadowHidden(this.isShadowHidden);
            }
            t0 screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.setToolbarTranslucent(this.isHeaderTranslucent);
            }
            TextView textViewFindTitleTextViewInToolbar = INSTANCE.findTitleTextViewInToolbar(this.toolbar);
            int i11 = this.titleColor;
            if (i11 != 0) {
                this.toolbar.setTitleTextColor(i11);
            }
            if (textViewFindTitleTextViewInToolbar != null) {
                String str2 = this.titleFontFamily;
                if (str2 != null || this.titleFontWeight > 0) {
                    int i12 = this.titleFontWeight;
                    AssetManager assets = getContext().getAssets();
                    p013kotlin.jvm.internal.s.j(assets, "getAssets(...)");
                    textViewFindTitleTextViewInToolbar.setTypeface(com.facebook.react.views.text.k.a(null, 0, i12, str2, assets));
                }
                float f11 = this.titleFontSize;
                if (f11 > BitmapDescriptorFactory.HUE_RED) {
                    textViewFindTitleTextViewInToolbar.setTextSize(f11);
                }
            }
            Integer num = this.backgroundColor;
            if (num != null) {
                this.toolbar.setBackgroundColor(num.intValue());
            }
            if (this.tintColor != 0 && (navigationIcon = this.toolbar.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.tintColor, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.toolbar.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.toolbar.getChildAt(childCount) instanceof y0) {
                    this.toolbar.removeViewAt(childCount);
                }
            }
            int size = this.configSubviews.size();
            for (int i13 = 0; i13 < size; i13++) {
                y0 y0Var = this.configSubviews.get(i13);
                p013kotlin.jvm.internal.s.j(y0Var, "get(...)");
                y0 y0Var2 = y0Var;
                y0.a type = y0Var2.getType();
                if (type == y0.a.BACK) {
                    View childAt = y0Var2.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    supportActionBar.y(imageView.getDrawable());
                } else {
                    Toolbar.e eVar = new Toolbar.e(-2, -1);
                    int i14 = b.$EnumSwitchMapping$0[type.ordinal()];
                    if (i14 == 1) {
                        if (!this.backButtonInCustomView) {
                            this.toolbar.setNavigationIcon((Drawable) null);
                        }
                        this.toolbar.setTitle((CharSequence) null);
                        eVar.f1961a = 8388611;
                    } else if (i14 == 2) {
                        eVar.f1961a = 8388613;
                    } else if (i14 == 3) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = -1;
                        eVar.f1961a = 1;
                        this.toolbar.setTitle((CharSequence) null);
                    }
                    y0Var2.setLayoutParams(eVar);
                    this.toolbar.addView(y0Var2);
                }
            }
        }
    }

    public final void removeAllConfigSubviews() {
        this.configSubviews.clear();
        maybeUpdate();
    }

    public final void removeConfigSubview(int index) {
        this.configSubviews.remove(index);
        maybeUpdate();
    }

    public final void setBackButtonInCustomView(boolean backButtonInCustomView) {
        this.backButtonInCustomView = backButtonInCustomView;
    }

    public final void setBackgroundColor(Integer color) {
        this.backgroundColor = color;
    }

    public final void setDirection(String direction) {
        this.direction = direction;
    }

    public final void setHeaderHidden(boolean z11) {
        this.isHeaderHidden = z11;
    }

    public final void setHeaderTranslucent(boolean z11) {
        this.isHeaderTranslucent = z11;
    }

    public final void setHidden(boolean hidden) {
        this.isHeaderHidden = hidden;
    }

    public final void setHideBackButton(boolean hideBackButton) {
        this.isBackButtonHidden = hideBackButton;
    }

    public final void setHideShadow(boolean hideShadow) {
        this.isShadowHidden = hideShadow;
    }

    public final void setTintColor(int color) {
        this.tintColor = color;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final void setTitleColor(int color) {
        this.titleColor = color;
    }

    public final void setTitleEmpty(boolean z11) {
        this.isTitleEmpty = z11;
    }

    public final void setTitleFontFamily(String titleFontFamily) {
        this.titleFontFamily = titleFontFamily;
    }

    public final void setTitleFontSize(float titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    public final void setTitleFontWeight(String fontWeightString) {
        this.titleFontWeight = com.facebook.react.views.text.k.d(fontWeightString);
    }

    public final void setTranslucent(boolean translucent) {
        this.isHeaderTranslucent = translucent;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(Context context) {
        this(context, new p());
        p013kotlin.jvm.internal.s.k(context, "context");
    }
}
