package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 g2\u00020\u0001:\u0002hiB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\fR$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010)\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0016\u0010+\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0016\u0010-\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001bR\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001bR\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u001bR\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001bR\u0016\u00107\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001bR\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001bR\u0016\u0010;\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u001bR\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u001bR\u0016\u0010E\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u001bR\u0016\u0010G\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\u001bR\u0016\u0010I\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010\u001bR\u0016\u0010J\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010L\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\u001bR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010NR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00104R\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010b\u001a\u00020]2\u0006\u0010\u0019\u001a\u00020]8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0011\u0010d\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bc\u0010\u001dR\u0011\u0010f\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\be\u0010\u001d¨\u0006j"}, d2 = {"Lcom/swmansion/gesturehandler/core/f;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "r1", "()Z", "s1", "Ljn0/h0;", "s0", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "force", "l", "(Z)V", "j0", "o0", "t0", "", "value", Gender.OTHER, Gender.FEMALE, "p1", "()F", "velocityX", "P", "q1", "velocityY", "Q", "defaultMinDist", "R", "minDist", "S", "activeOffsetXStart", "T", "activeOffsetXEnd", Gender.UNKNOWN, "failOffsetXStart", "V", "failOffsetXEnd", "W", "activeOffsetYStart", "X", "activeOffsetYEnd", "Y", "failOffsetYStart", "Z", "failOffsetYEnd", "a0", "minVelocityX", "b0", "minVelocityY", "c0", "minVelocity", "", "d0", "I", "minPointers", "e0", "maxPointers", "f0", "startX", "g0", "startY", "h0", "offsetX", "i0", "offsetY", "lastX", "k0", "lastY", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "velocityTracker", "m0", "averageTouches", "", "n0", "J", "activateAfterLongPress", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "activateDelayed", "Landroid/os/Handler;", "p0", "Landroid/os/Handler;", "handler", "Lcom/swmansion/gesturehandler/core/k;", "q0", "Lcom/swmansion/gesturehandler/core/k;", "m1", "()Lcom/swmansion/gesturehandler/core/k;", "stylusData", "n1", "translationX", "o1", "translationY", "r0", "b", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends GestureHandler {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private float velocityX;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private float velocityY;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final float defaultMinDist;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private float minDist;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private float startX;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private float startY;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private float offsetX;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private float offsetY;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private float lastX;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private float lastY;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private boolean averageTouches;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private long activateAfterLongPress;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private float activeOffsetXStart = Float.MAX_VALUE;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private float activeOffsetXEnd = Float.MIN_VALUE;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private float failOffsetXStart = Float.MIN_VALUE;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private float failOffsetXEnd = Float.MAX_VALUE;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private float activeOffsetYStart = Float.MAX_VALUE;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private float activeOffsetYEnd = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private float failOffsetYStart = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private float failOffsetYEnd = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private float minVelocityX = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private float minVelocityY = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private float minVelocity = Float.MAX_VALUE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private int minPointers = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private int maxPointers = 10;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private final Runnable activateDelayed = new Runnable() { // from class: y90.m
        @Override // java.lang.Runnable
        public final void run() {
            com.swmansion.gesturehandler.core.f.l1(this.f125308a);
        }
    };

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private StylusData stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\rR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/swmansion/gesturehandler/core/f$a;", "", "<init>", "()V", "Landroid/view/VelocityTracker;", "tracker", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "b", "(Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V", "", "MIN_VALUE_IGNORE", Gender.FEMALE, "MAX_VALUE_IGNORE", "", "DEFAULT_MIN_POINTERS", "I", "DEFAULT_MAX_POINTERS", "", "DEFAULT_ACTIVATE_AFTER_LONG_PRESS", "J", "", "DEFAULT_AVERAGE_TOUCHES", "Z", "DEFAULT_ACTIVE_OFFSET_X_START", "DEFAULT_ACTIVE_OFFSET_X_END", "DEFAULT_FAIL_OFFSET_X_START", "DEFAULT_FAIL_OFFSET_X_END", "DEFAULT_ACTIVE_OFFSET_Y_START", "DEFAULT_ACTIVE_OFFSET_Y_END", "DEFAULT_FAIL_OFFSET_Y_START", "DEFAULT_FAIL_OFFSET_Y_END", "DEFAULT_MIN_VELOCITY_X", "DEFAULT_MIN_VELOCITY_Y", "DEFAULT_MIN_VELOCITY", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(VelocityTracker tracker, MotionEvent event) {
            float rawX = event.getRawX() - event.getX();
            float rawY = event.getRawY() - event.getY();
            event.offsetLocation(rawX, rawY);
            s.h(tracker);
            tracker.addMovement(event);
            event.offsetLocation(-rawX, -rawY);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/core/f$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/f;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/f;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/f;Lcom/facebook/react/bridge/ReadableMap;)V", "Lz90/g;", "h", "(Lcom/swmansion/gesturehandler/core/f;)Lz90/g;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends GestureHandler.b<f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<f> type = f.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<f> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public f a(Context context) {
            return new f(context);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.g c(f handler) {
            s.k(handler, "handler");
            return new z90.g(handler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(f handler, ReadableMap config) {
            boolean z11;
            s.k(handler, "handler");
            s.k(config, "config");
            super.f(handler, config);
            boolean z12 = true;
            if (config.hasKey("activeOffsetXStart")) {
                handler.activeOffsetXStart = w.g(config.getDouble("activeOffsetXStart"));
                z11 = true;
            } else {
                z11 = false;
            }
            if (config.hasKey("activeOffsetXEnd")) {
                handler.activeOffsetXEnd = w.g(config.getDouble("activeOffsetXEnd"));
                z11 = true;
            }
            if (config.hasKey("failOffsetXStart")) {
                handler.failOffsetXStart = w.g(config.getDouble("failOffsetXStart"));
                z11 = true;
            }
            if (config.hasKey("failOffsetXEnd")) {
                handler.failOffsetXEnd = w.g(config.getDouble("failOffsetXEnd"));
                z11 = true;
            }
            if (config.hasKey("activeOffsetYStart")) {
                handler.activeOffsetYStart = w.g(config.getDouble("activeOffsetYStart"));
                z11 = true;
            }
            if (config.hasKey("activeOffsetYEnd")) {
                handler.activeOffsetYEnd = w.g(config.getDouble("activeOffsetYEnd"));
                z11 = true;
            }
            if (config.hasKey("failOffsetYStart")) {
                handler.failOffsetYStart = w.g(config.getDouble("failOffsetYStart"));
                z11 = true;
            }
            if (config.hasKey("failOffsetYEnd")) {
                handler.failOffsetYEnd = w.g(config.getDouble("failOffsetYEnd"));
                z11 = true;
            }
            if (config.hasKey("minVelocity")) {
                handler.minVelocity = w.g(config.getDouble("minVelocity"));
                z11 = true;
            }
            if (config.hasKey("minVelocityX")) {
                handler.minVelocityX = w.g(config.getDouble("minVelocityX"));
                z11 = true;
            }
            if (config.hasKey("minVelocityY")) {
                handler.minVelocityY = w.g(config.getDouble("minVelocityY"));
            } else {
                z12 = z11;
            }
            if (config.hasKey("minDist")) {
                handler.minDist = w.g(config.getDouble("minDist"));
            } else if (z12) {
                handler.minDist = Float.MAX_VALUE;
            }
            if (config.hasKey("minPointers")) {
                handler.minPointers = config.getInt("minPointers");
            }
            if (config.hasKey("maxPointers")) {
                handler.maxPointers = config.getInt("maxPointers");
            }
            if (config.hasKey("avgTouches")) {
                handler.averageTouches = config.getBoolean("avgTouches");
            }
            if (config.hasKey("activateAfterLongPress")) {
                handler.activateAfterLongPress = config.getInt("activateAfterLongPress");
            }
        }
    }

    public f(Context context) {
        this.minDist = Float.MIN_VALUE;
        s.h(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.defaultMinDist = scaledTouchSlop;
        this.minDist = scaledTouchSlop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(f fVar) {
        fVar.k();
    }

    private final boolean r1() {
        float f11 = (this.lastX - this.startX) + this.offsetX;
        float f12 = this.activeOffsetXStart;
        if (f12 != Float.MAX_VALUE && f11 < f12) {
            return true;
        }
        float f13 = this.activeOffsetXEnd;
        if (f13 != Float.MIN_VALUE && f11 > f13) {
            return true;
        }
        float f14 = (this.lastY - this.startY) + this.offsetY;
        float f15 = this.activeOffsetYStart;
        if (f15 != Float.MAX_VALUE && f14 < f15) {
            return true;
        }
        float f16 = this.activeOffsetYEnd;
        if (f16 != Float.MIN_VALUE && f14 > f16) {
            return true;
        }
        float f17 = (f11 * f11) + (f14 * f14);
        float f18 = this.minDist;
        if (f18 != Float.MAX_VALUE && f17 >= f18 * f18) {
            return true;
        }
        float f19 = this.velocityX;
        float f21 = this.minVelocityX;
        if (f21 != Float.MAX_VALUE && ((f21 < BitmapDescriptorFactory.HUE_RED && f19 <= f21) || (BitmapDescriptorFactory.HUE_RED <= f21 && f21 <= f19))) {
            return true;
        }
        float f22 = this.velocityY;
        float f23 = this.minVelocityY;
        if (f23 != Float.MAX_VALUE && ((f23 < BitmapDescriptorFactory.HUE_RED && f19 <= f23) || (BitmapDescriptorFactory.HUE_RED <= f23 && f23 <= f19))) {
            return true;
        }
        float f24 = (f19 * f19) + (f22 * f22);
        float f25 = this.minVelocity;
        return f25 != Float.MAX_VALUE && f24 >= f25 * f25;
    }

    private final boolean s1() {
        float f11 = (this.lastX - this.startX) + this.offsetX;
        float f12 = (this.lastY - this.startY) + this.offsetY;
        if (this.activateAfterLongPress > 0) {
            float f13 = (f11 * f11) + (f12 * f12);
            float f14 = this.defaultMinDist;
            if (f13 > f14 * f14) {
                Handler handler = this.handler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                return true;
            }
        }
        float f15 = this.failOffsetXStart;
        if (f15 != Float.MIN_VALUE && f11 < f15) {
            return true;
        }
        float f16 = this.failOffsetXEnd;
        if (f16 != Float.MAX_VALUE && f11 > f16) {
            return true;
        }
        float f17 = this.failOffsetYStart;
        if (f17 != Float.MIN_VALUE && f12 < f17) {
            return true;
        }
        float f18 = this.failOffsetYEnd;
        return f18 != Float.MAX_VALUE && f12 > f18;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void j0() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void l(boolean force) {
        if (getState() != 4) {
            t0();
        }
        super.l(force);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.stylusData = StylusData.INSTANCE.a(event);
            }
            int state = getState();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.offsetX += this.lastX - this.startX;
                this.offsetY += this.lastY - this.startY;
                y90.i iVar = y90.i.f125305a;
                this.lastX = iVar.b(sourceEvent, this.averageTouches);
                float fC = iVar.c(sourceEvent, this.averageTouches);
                this.lastY = fC;
                this.startX = this.lastX;
                this.startY = fC;
            } else {
                y90.i iVar2 = y90.i.f125305a;
                this.lastX = iVar2.b(sourceEvent, this.averageTouches);
                this.lastY = iVar2.c(sourceEvent, this.averageTouches);
            }
            if (state != 0 || sourceEvent.getPointerCount() < this.minPointers) {
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    INSTANCE.b(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    s.h(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    s.h(velocityTracker3);
                    this.velocityX = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.velocityTracker;
                    s.h(velocityTracker4);
                    this.velocityY = velocityTracker4.getYVelocity();
                }
            } else {
                t0();
                this.offsetX = BitmapDescriptorFactory.HUE_RED;
                this.offsetY = BitmapDescriptorFactory.HUE_RED;
                this.velocityX = BitmapDescriptorFactory.HUE_RED;
                this.velocityY = BitmapDescriptorFactory.HUE_RED;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.velocityTracker = velocityTrackerObtain;
                INSTANCE.b(velocityTrackerObtain, sourceEvent);
                p();
                if (this.activateAfterLongPress > 0) {
                    if (this.handler == null) {
                        this.handler = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.handler;
                    s.h(handler);
                    handler.postDelayed(this.activateDelayed, this.activateAfterLongPress);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (state == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.maxPointers) {
                if (state == 4) {
                    q();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 6 && state == 4 && sourceEvent.getPointerCount() < this.minPointers) {
                D();
                return;
            }
            if (state == 2) {
                if (s1()) {
                    D();
                } else if (r1()) {
                    k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1, reason: from getter */
    public final StylusData getStylusData() {
        return this.stylusData;
    }

    public final float n1() {
        return (this.lastX - this.startX) + this.offsetX;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        this.stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final float o1() {
        return (this.lastY - this.startY) + this.offsetY;
    }

    /* JADX INFO: renamed from: p1, reason: from getter */
    public final float getVelocityX() {
        return this.velocityX;
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final float getVelocityY() {
        return this.velocityY;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void s0() {
        super.s0();
        this.activeOffsetXStart = Float.MAX_VALUE;
        this.activeOffsetXEnd = Float.MIN_VALUE;
        this.failOffsetXStart = Float.MIN_VALUE;
        this.failOffsetXEnd = Float.MAX_VALUE;
        this.activeOffsetYStart = Float.MAX_VALUE;
        this.activeOffsetYEnd = Float.MIN_VALUE;
        this.failOffsetYStart = Float.MIN_VALUE;
        this.failOffsetYEnd = Float.MAX_VALUE;
        this.minVelocityX = Float.MAX_VALUE;
        this.minVelocityY = Float.MAX_VALUE;
        this.minVelocity = Float.MAX_VALUE;
        this.minDist = this.defaultMinDist;
        this.minPointers = 1;
        this.maxPointers = 10;
        this.activateAfterLongPress = 0L;
        this.averageTouches = false;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void t0() {
        this.startX = this.lastX;
        this.startY = this.lastY;
    }
}
