package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0012\f\u0010\u0017\u0019\u001b5\u001c\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ7\u0010\u0012\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ/\u0010\u0017\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u000fJ\u0019\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\"\u0010 J\u0019\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&JC\u0010,\u001a\u00020\u000b\"\u001a\b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010(*\u0004\u0018\u00010)*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0007¢\u0006\u0004\b,\u0010\u0013JE\u00100\u001a\u00020\u0011\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010(*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011H\u0007¢\u0006\u0004\b0\u00101J3\u00102\u001a\u00020\u000b\"\u001a\b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010(*\u0004\u0018\u00010)*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b2\u0010\u000fJ-\u00103\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u00010(*\u0004\u0018\u00010)*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b3\u0010\u000fJI\u00104\u001a\u00020\u000b\" \b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010\u0004*\u0004\u0018\u00010(*\u0004\u0018\u00010)*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b4\u0010\rJ-\u00105\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b5\u0010\u000fJM\u0010;\u001a\u00020:\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010(*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0011H\u0007¢\u0006\u0004\b;\u0010<J;\u0010?\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u00010(*\u0004\u0018\u00010)*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0011¢\u0006\u0004\b?\u0010\u0013J1\u0010@\u001a\u00020\u000b\"\u001a\b\u0000\u0010\u0006*\u0004\u0018\u00010'*\u0004\u0018\u00010(*\u0004\u0018\u00010)*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b@\u0010\u000fR\u001c\u0010C\u001a\n A*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010ER \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010JR \u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0016\u0010O\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010NR\u0016\u0010P\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010E¨\u0006Q"}, d2 = {"Lcom/facebook/react/views/scroll/j;", "", "<init>", "()V", "Lcom/facebook/react/views/scroll/j$b;", "Landroid/view/ViewGroup;", "T", "scrollView", "", "xVelocity", "yVelocity", "Ljn0/h0;", "f", "(Landroid/view/ViewGroup;FF)V", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewGroup;)V", "e", "", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewGroup;II)V", "j", "Lcom/facebook/react/views/scroll/l;", "scrollEventType", "g", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/l;)V", "h", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/l;FF)V", "c", "b", "", "jsOverScrollMode", "n", "(Ljava/lang/String;)I", "alignment", "o", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "l", "(Landroid/content/Context;)I", "Lcom/facebook/react/views/scroll/j$a;", "Lcom/facebook/react/views/scroll/j$c;", "Lcom/facebook/react/views/scroll/j$e;", "x", "y", "r", "currentValue", "postAnimationValue", "velocity", "m", "(Landroid/view/ViewGroup;III)I", "s", "k", "u", "a", "velocityX", "velocityY", "maximumOffsetX", "maximumOffsetY", "Landroid/graphics/Point;", "p", "(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;", "scrollX", "scrollY", "t", "q", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "Z", "DEBUG_MODE", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/views/scroll/j$i;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "scrollListeners", "Lcom/facebook/react/views/scroll/j$f;", "layoutChangeListeners", "I", "SMOOTH_SCROLL_DURATION", "smoothScrollDurationInitialized", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean DEBUG_MODE = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static boolean smoothScrollDurationInitialized;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f23614a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String TAG = com.facebook.react.views.scroll.g.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final CopyOnWriteArrayList<WeakReference<i>> scrollListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final CopyOnWriteArrayList<WeakReference<f>> layoutChangeListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static int SMOOTH_SCROLL_DURATION = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$a;", "", "", "start", "end", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(II)V", "Landroid/animation/ValueAnimator;", "getFlingAnimator", "()Landroid/animation/ValueAnimator;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void d(int start, int end);

        ValueAnimator getFlingAnimator();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$b;", "", "", "getScrollEventThrottle", "()I", "setScrollEventThrottle", "(I)V", "scrollEventThrottle", "", "getLastScrollDispatchTime", "()J", "setLastScrollDispatchTime", "(J)V", "lastScrollDispatchTime", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j11);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$c;", "", "Lcom/facebook/react/views/scroll/j$h;", "getReactScrollViewScrollState", "()Lcom/facebook/react/views/scroll/j$h;", "reactScrollViewScrollState", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        h getReactScrollViewScrollState();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$d;", "", "", "x", "y", "Ljn0/h0;", "b", "(II)V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface d {
        void a(int x11, int y11);

        void b(int x11, int y11);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$e;", "", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper", "()Lcom/facebook/react/uimanager/u0;", "stateWrapper", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface e {
        u0 getStateWrapper();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$f;", "", "Landroid/view/ViewGroup;", "scrollView", "Ljn0/h0;", "a", "(Landroid/view/ViewGroup;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface f {
        void a(ViewGroup scrollView);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/scroll/j$g;", "Landroid/widget/OverScroller;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "startX", "startY", "dx", "dy", "duration", "Ljn0/h0;", "startScroll", "(IIIII)V", "a", "I", "currentScrollAnimationDuration", "()I", "scrollAnimationDuration", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class g extends OverScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int currentScrollAnimationDuration;

        public g(Context context) {
            super(context);
            this.currentScrollAnimationDuration = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE;
        }

        public final int a() {
            super.startScroll(0, 0, 0, 0);
            return this.currentScrollAnimationDuration;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int startX, int startY, int dx2, int dy2, int duration) {
            this.currentScrollAnimationDuration = duration;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010)\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010%\u001a\u0004\b\r\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/facebook/react/views/scroll/j$h;", "", "<init>", "()V", "", "finalAnimatedPositionScrollX", "finalAnimatedPositionScrollY", IntegerTokenConverter.CONVERTER_KEY, "(II)Lcom/facebook/react/views/scroll/j$h;", "lastStateUpdateScrollX", "lastStateUpdateScrollY", "k", "Landroid/graphics/Point;", "a", "Landroid/graphics/Point;", "b", "()Landroid/graphics/Point;", "finalAnimatedPositionScroll", "I", DateTokenConverter.CONVERTER_KEY, "()I", "l", "(I)V", "scrollAwayPaddingTop", "c", "lastStateUpdateScroll", "", "Z", "e", "()Z", "g", "(Z)V", "isCanceled", "f", "j", "isFinished", "", Gender.FEMALE, "()F", "h", "(F)V", "decelerationRate", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int scrollAwayPaddingTop;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Point finalAnimatedPositionScroll = new Point();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Point lastStateUpdateScroll = new Point(-1, -1);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private float decelerationRate = 0.985f;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void g(boolean z11) {
            this.isCanceled = z11;
        }

        public final void h(float f11) {
            this.decelerationRate = f11;
        }

        public final h i(int finalAnimatedPositionScrollX, int finalAnimatedPositionScrollY) {
            this.finalAnimatedPositionScroll.set(finalAnimatedPositionScrollX, finalAnimatedPositionScrollY);
            return this;
        }

        public final void j(boolean z11) {
            this.isFinished = z11;
        }

        public final h k(int lastStateUpdateScrollX, int lastStateUpdateScrollY) {
            this.lastStateUpdateScroll.set(lastStateUpdateScrollX, lastStateUpdateScrollY);
            return this;
        }

        public final void l(int i11) {
            this.scrollAwayPaddingTop = i11;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/j$i;", "", "Landroid/view/ViewGroup;", "scrollView", "Lcom/facebook/react/views/scroll/l;", "scrollEventType", "", "xVelocity", "yVelocity", "Ljn0/h0;", "b", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/l;FF)V", "a", "(Landroid/view/ViewGroup;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface i {
        void a(ViewGroup scrollView);

        void b(ViewGroup scrollView, l scrollEventType, float xVelocity, float yVelocity);
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/facebook/react/views/scroll/j$j", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ljn0/h0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0460j implements Animator.AnimatorListener {

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23628a;

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        C0460j(ViewGroup viewGroup) {
            this.f23628a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            s.k(animator, "animator");
            j.j(this.f23628a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            s.k(animator, "animator");
            j.j(this.f23628a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            s.k(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            s.k(animator, "animator");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/facebook/react/views/scroll/j$k", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ljn0/h0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k implements Animator.AnimatorListener {

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23629a;

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        k(ViewGroup viewGroup) {
            this.f23629a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            s.k(animator, "animator");
            ((c) this.f23629a).getReactScrollViewScrollState().g(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            s.k(animator, "animator");
            ((c) this.f23629a).getReactScrollViewScrollState().j(true);
            j.s(this.f23629a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            s.k(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            s.k(animator, "animator");
            h reactScrollViewScrollState = ((c) this.f23629a).getReactScrollViewScrollState();
            reactScrollViewScrollState.g(false);
            reactScrollViewScrollState.j(false);
        }
    }

    private j() {
    }

    public static final <T extends ViewGroup & a & b> void a(T scrollView) {
        scrollView.getFlingAnimator().addListener(new C0460j(scrollView));
    }

    public static final void b(ViewGroup scrollView) {
        s.k(scrollView, "scrollView");
        Iterator<WeakReference<f>> it = layoutChangeListeners.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            f fVar = it.next().get();
            if (fVar != null) {
                fVar.a(scrollView);
            }
        }
    }

    public static final void c(ViewGroup scrollView) {
        s.k(scrollView, "scrollView");
        Iterator<WeakReference<i>> it = scrollListeners.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            i iVar = it.next().get();
            if (iVar != null) {
                iVar.a(scrollView);
            }
        }
    }

    public static final <T extends ViewGroup & b> void d(T scrollView) {
        f23614a.g(scrollView, l.BEGIN_DRAG);
    }

    public static final <T extends ViewGroup & b> void e(T scrollView, float xVelocity, float yVelocity) {
        f23614a.h(scrollView, l.END_DRAG, xVelocity, yVelocity);
    }

    public static final <T extends ViewGroup & b> void f(T scrollView, float xVelocity, float yVelocity) {
        f23614a.h(scrollView, l.SCROLL, xVelocity, yVelocity);
    }

    private final <T extends ViewGroup & b> void g(T scrollView, l scrollEventType) {
        h(scrollView, scrollEventType, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ViewGroup & b> void h(T scrollView, l scrollEventType, float xVelocity, float yVelocity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (scrollEventType == l.SCROLL) {
            T t11 = scrollView;
            if (t11.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - t11.getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = v.m1(scrollListeners).iterator();
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar != null) {
                iVar.b(scrollView, scrollEventType, xVelocity, yVelocity);
            }
        }
        Context context = scrollView.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = b1.e(reactContext);
        EventDispatcher eventDispatcherC = b1.c(reactContext, scrollView.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(com.facebook.react.views.scroll.k.INSTANCE.a(iE, scrollView.getId(), scrollEventType, scrollView.getScrollX(), scrollView.getScrollY(), xVelocity, yVelocity, childAt.getWidth(), childAt.getHeight(), scrollView.getWidth(), scrollView.getHeight()));
            if (scrollEventType == l.SCROLL) {
                scrollView.setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    public static final <T extends ViewGroup & b> void i(T scrollView, int xVelocity, int yVelocity) {
        f23614a.h(scrollView, l.MOMENTUM_BEGIN, xVelocity, yVelocity);
    }

    public static final <T extends ViewGroup & b> void j(T scrollView) {
        f23614a.g(scrollView, l.MOMENTUM_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & c & e> void k(T scrollView) {
        h reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        int scrollAwayPaddingTop = reactScrollViewScrollState.getScrollAwayPaddingTop();
        Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
        int i11 = lastStateUpdateScroll.x;
        int i12 = lastStateUpdateScroll.y;
        if (DEBUG_MODE) {
            qk.a.u(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        u0 stateWrapper = scrollView.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", w.f(i11));
            writableNativeMap.putDouble("contentOffsetTop", w.f(i12));
            writableNativeMap.putDouble("scrollAwayPaddingTop", w.f(scrollAwayPaddingTop));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int l(Context context) {
        if (!smoothScrollDurationInitialized) {
            smoothScrollDurationInitialized = true;
            try {
                SMOOTH_SCROLL_DURATION = new g(context).a();
            } catch (Throwable unused) {
            }
        }
        return SMOOTH_SCROLL_DURATION;
    }

    public static final <T extends ViewGroup & a & c> int m(T scrollView, int currentValue, int postAnimationValue, int velocity) {
        h reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.getIsFinished() || (reactScrollViewScrollState.getIsCanceled() && ((velocity != 0 ? velocity / Math.abs(velocity) : 0) * (postAnimationValue - currentValue) > 0))) ? postAnimationValue : currentValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int n(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L4c
            int r1 = r3.hashCode()
            r2 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            if (r1 == r2) goto L2b
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L22
            r2 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "never"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L20
            goto L33
        L20:
            r3 = 2
            return r3
        L22:
            java.lang.String r1 = "auto"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L33
            goto L4c
        L2b:
            java.lang.String r1 = "always"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4a
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "wrong overScrollMode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ReactNative"
            qk.a.I(r1, r3)
            return r0
        L4a:
            r3 = 0
            return r3
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.j.n(java.lang.String):int");
    }

    public static final int o(String alignment) {
        if (alignment == null) {
            return 0;
        }
        if (t.M("start", alignment, true)) {
            return 1;
        }
        if (t.M("center", alignment, true)) {
            return 2;
        }
        if (s.f("end", alignment)) {
            return 3;
        }
        qk.a.I("ReactNative", "wrong snap alignment value: " + alignment);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & a & c> Point p(T scrollView, int velocityX, int velocityY, int maximumOffsetX, int maximumOffsetY) {
        h reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(scrollView.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.getDecelerationRate());
        int width = (scrollView.getWidth() - scrollView.getPaddingStart()) - scrollView.getPaddingEnd();
        int height = (scrollView.getHeight() - scrollView.getPaddingBottom()) - scrollView.getPaddingTop();
        Point finalAnimatedPositionScroll = reactScrollViewScrollState.getFinalAnimatedPositionScroll();
        overScroller.fling(m(scrollView, scrollView.getScrollX(), finalAnimatedPositionScroll.x, velocityX), m(scrollView, scrollView.getScrollY(), finalAnimatedPositionScroll.y, velocityY), velocityX, velocityY, 0, maximumOffsetX, 0, maximumOffsetY, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & a & c & e> void r(T scrollView, int x11, int y11) {
        if (DEBUG_MODE) {
            qk.a.u(TAG, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(x11), Integer.valueOf(y11));
        }
        T t11 = scrollView;
        ValueAnimator flingAnimator = t11.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            f23614a.q(scrollView);
        }
        scrollView.getReactScrollViewScrollState().i(x11, y11);
        int scrollX = scrollView.getScrollX();
        int scrollY = scrollView.getScrollY();
        if (scrollX != x11) {
            t11.d(scrollX, x11);
        }
        if (scrollY != y11) {
            t11.d(scrollY, y11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & a & c & e> void s(T scrollView) {
        f23614a.t(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & a & b & c & e> void u(T scrollView, float xVelocity, float yVelocity) {
        f23614a.t(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
        f(scrollView, xVelocity, yVelocity);
    }

    public final <T extends ViewGroup & a & c & e> void q(T scrollView) {
        scrollView.getFlingAnimator().addListener(new k(scrollView));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewGroup & c & e> void t(T scrollView, int scrollX, int scrollY) {
        if (DEBUG_MODE) {
            qk.a.u(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(scrollX), Integer.valueOf(scrollY));
        }
        if (oo.a.a(scrollView.getId()) == 1) {
            return;
        }
        h reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        if (reactScrollViewScrollState.getLastStateUpdateScroll().equals(scrollX, scrollY)) {
            return;
        }
        reactScrollViewScrollState.k(scrollX, scrollY);
        k(scrollView);
    }
}
