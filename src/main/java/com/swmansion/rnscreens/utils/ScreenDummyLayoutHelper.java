package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.w;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.w0;
import ezvcard.property.Gender;
import java.lang.ref.WeakReference;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 82\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "maybeInitDummyLayoutWithHeader", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z", "Landroid/content/Context;", "contextWithTheme", "Ljn0/h0;", "initDummyLayoutWithHeader", "(Landroid/content/Context;)V", "", OrcaFlavourKeys.FONT_SIZE, "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "Lkotlin/Function0;", "", "lazyMessage", "requireReactContext", "(Lwn0/a;)Lcom/facebook/react/bridge/ReactApplicationContext;", "Landroid/app/Activity;", "requireActivity", "()Landroid/app/Activity;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/view/View;", "dummyContentView", "Landroid/view/View;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "defaultFontSize", Gender.FEMALE, "defaultContentInsetStartWithNavigation", "I", "Lcom/swmansion/rnscreens/utils/a;", "cache", "Lcom/swmansion/rnscreens/utils/a;", "Ljava/lang/ref/WeakReference;", "reactContextRef", "Ljava/lang/ref/WeakReference;", "isLayoutInitialized", "Z", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {
    private static final String DEFAULT_HEADER_TITLE = "FontSize123!#$";
    public static final int FONT_SIZE_UNSET = -1;
    public static final String LIBRARY_NAME = "react_codegen_rnscreens";
    public static final String TAG = "ScreenDummyLayoutHelper";
    private AppBarLayout appBarLayout;
    private a cache;
    private CoordinatorLayout coordinatorLayout;
    private int defaultContentInsetStartWithNavigation;
    private float defaultFontSize;
    private View dummyContentView;
    private volatile boolean isLayoutInitialized;
    private WeakReference<ReactApplicationContext> reactContextRef;
    private Toolbar toolbar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static WeakReference<ScreenDummyLayoutHelper> weakInstance = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "getInstance", "()Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "", "TAG", "Ljava/lang/String;", "LIBRARY_NAME", "", "FONT_SIZE_UNSET", "I", "DEFAULT_HEADER_TITLE", "Ljava/lang/ref/WeakReference;", "weakInstance", "Ljava/lang/ref/WeakReference;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.weakInstance.get();
        }

        private Companion() {
        }
    }

    public ScreenDummyLayoutHelper(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.cache = a.INSTANCE.getEMPTY();
        this.reactContextRef = new WeakReference<>(reactContext);
        try {
            System.loadLibrary(LIBRARY_NAME);
        } catch (UnsatisfiedLinkError unused) {
            Log.w(TAG, "[RNScreens] Failed to load react_codegen_rnscreens library.");
        }
        weakInstance = new WeakReference<>(this);
        if (reactContext.hasCurrentActivity() && maybeInitDummyLayoutWithHeader(reactContext)) {
            return;
        }
        reactContext.addLifecycleEventListener(this);
    }

    @DoNotStrip
    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.isLayoutInitialized && !maybeInitDummyLayoutWithHeader(requireReactContext(new wn0.a() { // from class: com.swmansion.rnscreens.utils.h
            @Override // wn0.a
            public final Object invoke() {
                return ScreenDummyLayoutHelper.computeDummyLayout$lambda$7();
            }
        }))) {
            Log.e(TAG, "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.cache.hasKey(new CacheKey(fontSize, isTitleEmpty))) {
            return this.cache.getHeaderHeight();
        }
        View decorView = requireActivity().getWindow().getDecorView();
        s.j(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        AppBarLayout appBarLayout = null;
        if (isTitleEmpty) {
            Toolbar toolbar = this.toolbar;
            if (toolbar == null) {
                s.B("toolbar");
                toolbar = null;
            }
            toolbar.setTitle("");
            Toolbar toolbar2 = this.toolbar;
            if (toolbar2 == null) {
                s.B("toolbar");
                toolbar2 = null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            Toolbar toolbar3 = this.toolbar;
            if (toolbar3 == null) {
                s.B("toolbar");
                toolbar3 = null;
            }
            toolbar3.setTitle(DEFAULT_HEADER_TITLE);
            Toolbar toolbar4 = this.toolbar;
            if (toolbar4 == null) {
                s.B("toolbar");
                toolbar4 = null;
            }
            toolbar4.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
        }
        w0.Companion companion = w0.INSTANCE;
        Toolbar toolbar5 = this.toolbar;
        if (toolbar5 == null) {
            s.B("toolbar");
            toolbar5 = null;
        }
        TextView textViewFindTitleTextViewInToolbar = companion.findTitleTextViewInToolbar(toolbar5);
        if (textViewFindTitleTextViewInToolbar != null) {
            textViewFindTitleTextViewInToolbar.setTextSize(fontSize != -1 ? fontSize : this.defaultFontSize);
        }
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            s.B("coordinatorLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
        if (coordinatorLayout2 == null) {
            s.B("coordinatorLayout");
            coordinatorLayout2 = null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            s.B("appBarLayout");
        } else {
            appBarLayout = appBarLayout2;
        }
        float f11 = w.f(appBarLayout.getHeight());
        this.cache = new a(new CacheKey(fontSize, isTitleEmpty), f11);
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object computeDummyLayout$lambda$7() {
        return "[RNScreens] Context was null-ed before dummy layout was initialized";
    }

    @DoNotStrip
    public static final ScreenDummyLayoutHelper getInstance() {
        return INSTANCE.getInstance();
    }

    private final void initDummyLayoutWithHeader(Context contextWithTheme) {
        this.coordinatorLayout = new CoordinatorLayout(contextWithTheme);
        AppBarLayout appBarLayout = new AppBarLayout(contextWithTheme);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        this.appBarLayout = appBarLayout;
        Toolbar toolbar = new Toolbar(contextWithTheme);
        toolbar.setTitle(DEFAULT_HEADER_TITLE);
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.toolbar = toolbar;
        TextView textViewFindTitleTextViewInToolbar = w0.INSTANCE.findTitleTextViewInToolbar(toolbar);
        s.h(textViewFindTitleTextViewInToolbar);
        this.defaultFontSize = textViewFindTitleTextViewInToolbar.getTextSize();
        Toolbar toolbar2 = this.toolbar;
        View view = null;
        if (toolbar2 == null) {
            s.B("toolbar");
            toolbar2 = null;
        }
        this.defaultContentInsetStartWithNavigation = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            s.B("appBarLayout");
            appBarLayout2 = null;
        }
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            s.B("toolbar");
            toolbar3 = null;
        }
        appBarLayout2.addView(toolbar3);
        View view2 = new View(contextWithTheme);
        view2.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        this.dummyContentView = view2;
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            s.B("coordinatorLayout");
            coordinatorLayout = null;
        }
        AppBarLayout appBarLayout3 = this.appBarLayout;
        if (appBarLayout3 == null) {
            s.B("appBarLayout");
            appBarLayout3 = null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view3 = this.dummyContentView;
        if (view3 == null) {
            s.B("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.isLayoutInitialized = true;
    }

    private final boolean maybeInitDummyLayoutWithHeader(ReactApplicationContext reactContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            initDummyLayoutWithHeader(currentActivity);
            h0 h0Var = h0.f84049a;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onHostResume$lambda$10() {
        return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
    }

    private final Activity requireActivity() {
        Activity currentActivity = requireReactContext$default(this, null, 1, null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
    }

    private final ReactApplicationContext requireReactContext(wn0.a<? extends Object> lazyMessage) {
        ReactApplicationContext reactApplicationContext = this.reactContextRef.get();
        if (lazyMessage == null) {
            lazyMessage = new wn0.a() { // from class: com.swmansion.rnscreens.utils.i
                @Override // wn0.a
                public final Object invoke() {
                    return ScreenDummyLayoutHelper.requireReactContext$lambda$8();
                }
            };
        }
        if (reactApplicationContext != null) {
            return reactApplicationContext;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ReactApplicationContext requireReactContext$default(ScreenDummyLayoutHelper screenDummyLayoutHelper, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        return screenDummyLayoutHelper.requireReactContext(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object requireReactContext$lambda$8() {
        return "[RNScreens] Attempt to require missing react context";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = this.reactContextRef.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContextRequireReactContext = requireReactContext(new wn0.a() { // from class: com.swmansion.rnscreens.utils.j
            @Override // wn0.a
            public final Object invoke() {
                return ScreenDummyLayoutHelper.onHostResume$lambda$10();
            }
        });
        if (maybeInitDummyLayoutWithHeader(reactApplicationContextRequireReactContext)) {
            reactApplicationContextRequireReactContext.removeLifecycleEventListener(this);
        } else {
            Log.w(TAG, "[RNScreens] Failed to initialise dummy layout in onHostResume.");
        }
    }
}
