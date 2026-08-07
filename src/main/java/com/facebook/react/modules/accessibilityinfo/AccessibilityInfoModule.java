package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = "AccessibilityInfo")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0003KLMB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u0019\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u000602R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u000605R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010D\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010E\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010F¨\u0006N"}, d2 = {"Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;", "Lcom/facebook/fbreact/specs/NativeAccessibilityInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "updateAndSendReduceMotionChangeEvent", "()V", "updateAndSendInvertColorsChangeEvent", "updateAndSendHighTextContrastChangeEvent", "", "enabled", "updateAndSendTouchExplorationChangeEvent", "(Z)V", "updateAndSendAccessibilityServiceChangeEvent", "updateAndSendGrayscaleModeChangeEvent", "Lcom/facebook/react/bridge/Callback;", "successCallback", "isReduceMotionEnabled", "(Lcom/facebook/react/bridge/Callback;)V", "isInvertColorsEnabled", "isGrayscaleEnabled", "isHighTextContrastEnabled", "isTouchExplorationEnabled", "isAccessibilityServiceEnabled", "onHostResume", "onHostPause", "initialize", "invalidate", "onHostDestroy", "", "message", "announceForAccessibility", "(Ljava/lang/String;)V", "", "reactTag", "setAccessibilityFocus", "(D)V", "originalTimeout", "getRecommendedTimeoutMillis", "(DLcom/facebook/react/bridge/Callback;)V", "Landroid/database/ContentObserver;", "animationScaleObserver", "Landroid/database/ContentObserver;", "highTextContrastObserver", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "touchExplorationStateChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "accessibilityServiceChangeListener", "Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "reduceMotionEnabled", "Z", "highTextContrastEnabled", "touchExplorationEnabled", "accessibilityServiceEnabled", "", "recommendedTimeout", "I", "invertColorsEnabled", "grayscaleModeEnabled", "isReduceMotionEnabledValue", "()Z", "isInvertColorsEnabledValue", "isGrayscaleEnabledValue", "isHighTextContrastEnabledValue", "Companion", "c", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT = "high_text_contrast_enabled";
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    private static final String GRAYSCALE_MODE_EVENT_NAME = "grayscaleModeDidChange";
    private static final String HIGH_TEXT_CONTRAST_EVENT_NAME = "highTextContrastDidChange";
    private static final String INVERT_COLOR_EVENT_NAME = "invertColorDidChange";
    public static final String NAME = "AccessibilityInfo";
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final AccessibilityManager accessibilityManager;
    private final b accessibilityServiceChangeListener;
    private boolean accessibilityServiceEnabled;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private boolean grayscaleModeEnabled;
    private boolean highTextContrastEnabled;
    private final ContentObserver highTextContrastObserver;
    private boolean invertColorsEnabled;
    private int recommendedTimeout;
    private boolean reduceMotionEnabled;
    private boolean touchExplorationEnabled;
    private final c touchExplorationStateChangeListener;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$b;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "<init>", "(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;)V", "", "enabled", "Ljn0/h0;", "onAccessibilityStateChanged", "(Z)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @TargetApi(21)
    private final class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean enabled) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(enabled);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$c;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "<init>", "(Lcom/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule;)V", "", "enabled", "Ljn0/h0;", "onTouchExplorationStateChanged", "(Z)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @TargetApi(21)
    private final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public c() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean enabled) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(enabled);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"com/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$d", "Landroid/database/ContentObserver;", "", "selfChange", "Ljn0/h0;", "onChange", "(Z)V", "Landroid/net/Uri;", "uri", "(ZLandroid/net/Uri;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends ContentObserver {
        d(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            onChange(selfChange, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"com/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule$e", "Landroid/database/ContentObserver;", "", "selfChange", "Ljn0/h0;", "onChange", "(Z)V", "Landroid/net/Uri;", "uri", "(ZLandroid/net/Uri;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends ContentObserver {
        e(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            onChange(selfChange, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                AccessibilityInfoModule.this.updateAndSendHighTextContrastChangeEvent();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityInfoModule(ReactApplicationContext context) {
        super(context);
        s.k(context, "context");
        this.animationScaleObserver = new d(UiThreadUtil.getUiThreadHandler());
        this.highTextContrastObserver = new e(UiThreadUtil.getUiThreadHandler());
        this.touchExplorationStateChangeListener = new c();
        this.accessibilityServiceChangeListener = new b();
        Object systemService = context.getApplicationContext().getSystemService("accessibility");
        s.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = getReactApplicationContext().getContentResolver();
        this.touchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        this.accessibilityServiceEnabled = accessibilityManager.isEnabled();
        this.reduceMotionEnabled = isReduceMotionEnabledValue();
        this.highTextContrastEnabled = isHighTextContrastEnabledValue();
        this.grayscaleModeEnabled = isGrayscaleEnabledValue();
    }

    @TargetApi(21)
    private final boolean isGrayscaleEnabledValue() {
        try {
            return Settings.Secure.getInt(this.contentResolver, "accessibility_display_daltonizer_enabled") == 1 && Settings.Secure.getInt(this.contentResolver, "accessibility_display_daltonizer") == 0;
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    @TargetApi(21)
    private final boolean isHighTextContrastEnabledValue() {
        return Settings.Secure.getInt(this.contentResolver, ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT, 0) != 0;
    }

    @TargetApi(21)
    private final boolean isInvertColorsEnabledValue() {
        try {
            return Settings.Secure.getInt(this.contentResolver, "accessibility_display_inversion_enabled") == 1;
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    @TargetApi(21)
    private final boolean isReduceMotionEnabledValue() {
        String string = Settings.Global.getString(this.contentResolver, "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendAccessibilityServiceChangeEvent(boolean enabled) {
        if (this.accessibilityServiceEnabled != enabled) {
            this.accessibilityServiceEnabled = enabled;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.accessibilityServiceEnabled));
            }
        }
    }

    private final void updateAndSendGrayscaleModeChangeEvent() {
        boolean zIsGrayscaleEnabledValue = isGrayscaleEnabledValue();
        if (this.grayscaleModeEnabled != zIsGrayscaleEnabledValue) {
            this.grayscaleModeEnabled = zIsGrayscaleEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(GRAYSCALE_MODE_EVENT_NAME, Boolean.valueOf(this.grayscaleModeEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendHighTextContrastChangeEvent() {
        boolean zIsHighTextContrastEnabledValue = isHighTextContrastEnabledValue();
        if (this.highTextContrastEnabled != zIsHighTextContrastEnabledValue) {
            this.highTextContrastEnabled = zIsHighTextContrastEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(HIGH_TEXT_CONTRAST_EVENT_NAME, Boolean.valueOf(this.highTextContrastEnabled));
            }
        }
    }

    private final void updateAndSendInvertColorsChangeEvent() {
        boolean zIsInvertColorsEnabledValue = isInvertColorsEnabledValue();
        if (this.invertColorsEnabled != zIsInvertColorsEnabledValue) {
            this.invertColorsEnabled = zIsInvertColorsEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(INVERT_COLOR_EVENT_NAME, Boolean.valueOf(this.invertColorsEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendReduceMotionChangeEvent() {
        boolean zIsReduceMotionEnabledValue = isReduceMotionEnabledValue();
        if (this.reduceMotionEnabled != zIsReduceMotionEnabledValue) {
            this.reduceMotionEnabled = zIsReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.reduceMotionEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendTouchExplorationChangeEvent(boolean enabled) {
        if (this.touchExplorationEnabled != enabled) {
            this.touchExplorationEnabled = enabled;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.touchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String message) {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(message);
        accessibilityEventObtain.setClassName(AccessibilityInfoModule.class.getName());
        accessibilityEventObtain.setPackageName(getReactApplicationContext().getPackageName());
        this.accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double originalTimeout, Callback successCallback) {
        s.k(successCallback, "successCallback");
        if (Build.VERSION.SDK_INT < 29) {
            successCallback.invoke(Integer.valueOf((int) originalTimeout));
            return;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        int recommendedTimeoutMillis = accessibilityManager != null ? accessibilityManager.getRecommendedTimeoutMillis((int) originalTimeout, 4) : 0;
        this.recommendedTimeout = recommendedTimeoutMillis;
        successCallback.invoke(Integer.valueOf(recommendedTimeoutMillis));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        boolean z11 = false;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null && accessibilityManager2.isEnabled()) {
            z11 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z11);
        updateAndSendReduceMotionChangeEvent();
        updateAndSendHighTextContrastChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback successCallback) {
        s.k(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.accessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isGrayscaleEnabled(Callback successCallback) {
        s.k(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.grayscaleModeEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isHighTextContrastEnabled(Callback successCallback) {
        s.k(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.highTextContrastEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isInvertColorsEnabled(Callback successCallback) {
        s.k(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.invertColorsEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback successCallback) {
        s.k(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.reduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback successCallback) {
        s.k(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.touchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(21)
    public void onHostPause() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.removeAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.contentResolver.unregisterContentObserver(this.highTextContrastObserver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(21)
    public void onHostResume() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.addAccessibilityStateChangeListener(this.accessibilityServiceChangeListener);
        }
        boolean z11 = false;
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        this.contentResolver.registerContentObserver(Settings.Global.getUriFor(ACCESSIBILITY_HIGH_TEXT_CONTRAST_ENABLED_CONSTANT), false, this.highTextContrastObserver);
        AccessibilityManager accessibilityManager3 = this.accessibilityManager;
        updateAndSendTouchExplorationChangeEvent(accessibilityManager3 != null && accessibilityManager3.isTouchExplorationEnabled());
        AccessibilityManager accessibilityManager4 = this.accessibilityManager;
        if (accessibilityManager4 != null && accessibilityManager4.isEnabled()) {
            z11 = true;
        }
        updateAndSendAccessibilityServiceChangeEvent(z11);
        updateAndSendReduceMotionChangeEvent();
        updateAndSendHighTextContrastChangeEvent();
        updateAndSendInvertColorsChangeEvent();
        updateAndSendGrayscaleModeChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double reactTag) {
    }
}
