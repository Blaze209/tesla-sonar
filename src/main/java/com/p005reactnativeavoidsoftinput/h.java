package com.p005reactnativeavoidsoftinput;

import android.app.Activity;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.view.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.q0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import j00.c;
import jn0.h0;
import l00.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\b\u000b*\u0001n\u0018\u00002\u00020\u00012\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b%\u0010\u000fJ\u0015\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000fJ\u0017\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001a\u0010,\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0001¢\u0006\u0004\b,\u0010+J\u0018\u0010-\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b-\u0010#J\u0018\u0010.\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b.\u0010#J0\u00100\u001a\u00020\t2\u001e\u0010)\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010/H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b2\u0010#J\u0018\u00103\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b3\u0010#J(\u00104\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b6\u00105J&\u00109\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t07H\u0096\u0001¢\u0006\u0004\b9\u0010:J6\u0010;\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t07H\u0096\u0001¢\u0006\u0004\b;\u0010<J0\u0010=\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b=\u0010>J0\u0010@\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b@\u0010>J.\u0010B\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t07H\u0096\u0001¢\u0006\u0004\bB\u0010CJ6\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t07H\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0096\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010M\u001a\u00020\t2\b\u0010L\u001a\u0004\u0018\u00010KH\u0096\u0001¢\u0006\u0004\bM\u0010NJ\u001a\u0010P\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\t2\b\u0010R\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\bS\u0010QJ&\u0010U\u001a\u00020\t2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010TH\u0096\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010W\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\bW\u0010QJ\u001a\u0010X\u001a\u00020\t2\b\u0010R\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\bX\u0010QJ\u0010\u0010Y\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bY\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010\u0017R\u0016\u0010_\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010,R\u0016\u0010a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010,R\u0018\u0010d\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010fR\u0016\u0010l\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0017R\u0016\u0010m\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010oR\u0014\u0010s\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010?\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010w\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010u¨\u0006x"}, d2 = {"Lcom/reactnativeavoidsoftinput/h;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/view/View;", "oldView", "newView", "Ljn0/h0;", "x", "(Landroid/view/View;Landroid/view/View;)V", "", "shouldHandle", Gender.UNKNOWN, "(Z)V", "", "from", "to", "s", "(II)V", "focusedView", "rootView", "I", "(IILandroid/view/View;Landroid/view/View;)V", "K", "Landroid/widget/ScrollView;", "scrollView", Gender.NONE, "(IILandroid/view/View;Landroid/widget/ScrollView;)V", "m", "()V", "v", "view", "T", "(Landroid/view/View;)V", "enabled", "H", "shouldMimic", "W", "Ll00/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "S", "(Ll00/c;)V", "Z", "A", "b0", "Lkotlin/Function2;", "Q", "(Lwn0/p;)V", "z", "a0", "o", "(IILandroid/view/View;)V", "t", "Lkotlin/Function0;", "onOffsetAnimationEnd", "B", "(Landroid/view/View;Lwn0/a;)V", "k", "(ILandroid/view/View;Landroid/view/View;Lwn0/a;)V", "p", "(IILandroid/widget/ScrollView;Landroid/view/View;)V", "currentFocusedView", "u", "initialScrollValue", "C", "(Landroid/widget/ScrollView;ILwn0/a;)V", "softInputHeight", "l", "(ILandroid/widget/ScrollView;Landroid/view/View;Lwn0/a;)V", "", "offset", "D", "(F)V", "", "easing", "E", "(Ljava/lang/String;)V", "delay", Gender.FEMALE, "(Ljava/lang/Integer;)V", "duration", "G", "Lkotlin/Function1;", "R", "(Lwn0/l;)V", "X", "Y", "n", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/bridge/ReactApplicationContext;", "e", "completeSoftInputHeight", "f", "isEnabled", "g", "isInitialized", "h", "Ll00/c;", "onSoftInputEventsListener", IntegerTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "previousRootView", "j", "Landroid/widget/ScrollView;", "previousScrollView", "currentRootView", "scrollY", "softInputVisible", "com/reactnativeavoidsoftinput/h$b", "Lcom/reactnativeavoidsoftinput/h$b;", "onSoftInputListener", "w", "()Z", "isCustomRootView", "q", "()Landroid/view/View;", "r", "previousFocusedView", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e f48422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ l00.b f48423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ c f48424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int completeSoftInputHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private l00.c onSoftInputEventsListener;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private View previousRootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ScrollView previousScrollView;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private View currentRootView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int scrollY;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean softInputVisible;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final b onSoftInputListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p implements wn0.p<View, View, h0> {
        a(Object obj) {
            super(2, obj, h.class, "onFocus", "onFocus(Landroid/view/View;Landroid/view/View;)V", 0);
        }

        public final void a(View view, View view2) {
            ((h) this.receiver).x(view, view2);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(View view, View view2) {
            a(view, view2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"com/reactnativeavoidsoftinput/h$b", "Ll00/c;", "", "from", "to", "", "isOrientationChanged", "Ljn0/h0;", "c", "(IIZ)V", "b", "(II)V", "e", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements l00.c {
        b() {
        }

        @Override // l00.c
        public void b(int from, int to2) {
            l00.c cVar = h.this.onSoftInputEventsListener;
            if (cVar != null) {
                cVar.b(from, to2);
            }
        }

        @Override // l00.c
        public void c(int from, int to2, boolean isOrientationChanged) {
            l00.c cVar = h.this.onSoftInputEventsListener;
            if (cVar != null) {
                cVar.c(from, to2, isOrientationChanged);
            }
            h.this.s(from, to2);
        }

        @Override // l00.c
        public void e(int from, int to2) {
            l00.c cVar = h.this.onSoftInputEventsListener;
            if (cVar != null) {
                cVar.e(from, to2);
            }
        }
    }

    public h(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.f48422a = new e();
        this.f48423b = new l00.b();
        this.f48424c = new c();
        this.reactContext = reactContext;
        this.isEnabled = true;
        this.onSoftInputListener = new b();
    }

    private final void I(int from, int to2, View focusedView, View rootView) {
        ScrollView scrollViewH = View.h(focusedView, rootView);
        if (scrollViewH == null) {
            scrollViewH = this.previousScrollView;
        }
        if (scrollViewH == null) {
            K(from, to2, focusedView, rootView);
        } else {
            View.k(scrollViewH, new l() { // from class: com.reactnativeavoidsoftinput.c
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return h.J(this.f48415a, ((Integer) obj).intValue());
                }
            });
            N(from, to2, focusedView, scrollViewH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 J(h hVar, int i11) {
        if (hVar.q() != null) {
            hVar.scrollY = i11;
        }
        return h0.f84049a;
    }

    private final void K(int from, int to2, View focusedView, final View rootView) {
        if (to2 == from) {
            return;
        }
        if (to2 == 0) {
            B(rootView, new wn0.a() { // from class: com.reactnativeavoidsoftinput.d
                @Override // wn0.a
                public final Object invoke() {
                    return h.L(this.f48416a);
                }
            });
            return;
        }
        int i11 = to2 - from;
        if (i11 > 0 && (!this.softInputVisible || from == 0)) {
            if (this.isEnabled) {
                k(to2, rootView, focusedView, new wn0.a() { // from class: com.reactnativeavoidsoftinput.e
                    @Override // wn0.a
                    public final Object invoke() {
                        return h.M(this.f48417a, rootView);
                    }
                });
            }
        } else if (i11 > 0) {
            if (this.isEnabled) {
                t(from, to2, rootView);
            }
        } else {
            if (i11 >= 0 || !this.isEnabled) {
                return;
            }
            o(from, to2, rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 L(h hVar) {
        hVar.previousRootView = null;
        hVar.softInputVisible = false;
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 M(h hVar, View view) {
        hVar.previousRootView = view;
        hVar.softInputVisible = true;
        return h0.f84049a;
    }

    private final void N(int from, int to2, View focusedView, final ScrollView scrollView) {
        if (to2 == from) {
            return;
        }
        if (to2 == 0) {
            C(scrollView, this.scrollY, new wn0.a() { // from class: com.reactnativeavoidsoftinput.f
                @Override // wn0.a
                public final Object invoke() {
                    return h.P(this.f48419a);
                }
            });
            return;
        }
        int i11 = to2 - from;
        if (i11 > 0 && (!this.softInputVisible || from == 0)) {
            if (this.isEnabled) {
                l(to2, scrollView, focusedView, new wn0.a() { // from class: com.reactnativeavoidsoftinput.g
                    @Override // wn0.a
                    public final Object invoke() {
                        return h.O(this.f48420a, scrollView);
                    }
                });
            }
        } else if (i11 > 0) {
            if (this.isEnabled) {
                u(from, to2, scrollView, focusedView);
            }
        } else {
            if (i11 >= 0 || !this.isEnabled) {
                return;
            }
            p(from, to2, scrollView, focusedView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 O(h hVar, ScrollView scrollView) {
        hVar.scrollY = scrollView.getScrollY();
        hVar.previousScrollView = scrollView;
        hVar.softInputVisible = true;
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 P(h hVar) {
        hVar.scrollY = 0;
        hVar.previousScrollView = null;
        hVar.softInputVisible = false;
        return h0.f84049a;
    }

    private final void U(boolean shouldHandle) {
        final Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        final boolean z11 = !shouldHandle;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativeavoidsoftinput.b
            @Override // java.lang.Runnable
            public final void run() {
                h.V(currentActivity, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(Activity activity, boolean z11) {
        z0.b(activity.getWindow(), z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void s(int from, int to2) {
        q0 q0Var;
        this.completeSoftInputHeight = to2;
        View viewQ = q();
        if (viewQ == null) {
            viewQ = r();
        }
        if (viewQ == null) {
            if (this.softInputVisible && to2 == 0) {
                n();
                this.scrollY = 0;
                this.previousRootView = null;
                this.previousScrollView = null;
                this.softInputVisible = false;
                return;
            }
            return;
        }
        if (w()) {
            View view = this.currentRootView;
            s.h(view);
            I(from, to2, viewQ, view);
            return;
        }
        q0 q0VarE = View.e(viewQ);
        if (q0VarE == null) {
            q0Var = q0VarE;
            q0Var = (q0) this.previousRootView;
        }
        q0Var = q0VarE;
        if (!(q0Var instanceof View) || View.b(viewQ, q0Var)) {
            return;
        }
        I(from, to2, viewQ, (View) q0Var);
    }

    private final boolean w() {
        return this.currentRootView instanceof q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(View oldView, View newView) {
        ScrollView scrollViewH;
        if (this.isEnabled) {
            Object objE = View.e(newView);
            if (!(objE instanceof View) || newView == null || (scrollViewH = View.h(newView, (View) objE)) == null) {
                return;
            }
            this.scrollY = scrollViewH.getScrollY();
            if (this.softInputVisible) {
                View.k(scrollViewH, new l() { // from class: com.reactnativeavoidsoftinput.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return h.y(this.f48412a, ((Integer) obj).intValue());
                    }
                });
                scrollViewH.smoothScrollTo(0, scrollViewH.getScrollY() + Math.max(this.completeSoftInputHeight - View.j(newView), 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(h hVar, int i11) {
        if (hVar.q() != null) {
            hVar.scrollY = i11;
        }
        return h0.f84049a;
    }

    public void A(View view) {
        s.k(view, "view");
        this.f48422a.n(view);
    }

    public void B(View rootView, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(rootView, "rootView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.f48424c.z(rootView, onOffsetAnimationEnd);
    }

    public void C(ScrollView scrollView, int initialScrollValue, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(scrollView, "scrollView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.f48424c.A(scrollView, initialScrollValue, onOffsetAnimationEnd);
    }

    public void D(float offset) {
        this.f48424c.E(offset);
    }

    public void E(String easing) {
        this.f48424c.F(easing);
    }

    public void F(Integer delay) {
        this.f48424c.G(delay);
    }

    public void G(Integer duration) {
        this.f48424c.H(duration);
    }

    public final void H(boolean enabled) {
        this.isEnabled = enabled;
    }

    public void Q(wn0.p<? super View, ? super View, h0> listener) {
        this.f48423b.f(listener);
    }

    public void R(l<? super Integer, h0> listener) {
        this.f48424c.I(listener);
    }

    public final void S(l00.c listener) {
        this.onSoftInputEventsListener = listener;
    }

    public final void T(View view) {
        this.currentRootView = view;
    }

    public final void W(boolean shouldMimic) {
        U(shouldMimic);
    }

    public void X(Integer delay) {
        this.f48424c.J(delay);
    }

    public void Y(Integer duration) {
        this.f48424c.K(duration);
    }

    public void Z(l00.c listener) {
        this.f48422a.p(listener);
    }

    public void a0(View rootView) {
        s.k(rootView, "rootView");
        this.f48423b.g(rootView);
    }

    public void b0(View view) {
        s.k(view, "view");
        this.f48422a.q(view);
    }

    public void k(int to2, View rootView, View focusedView, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(rootView, "rootView");
        s.k(focusedView, "focusedView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.f48424c.o(to2, rootView, focusedView, onOffsetAnimationEnd);
    }

    public void l(int softInputHeight, ScrollView scrollView, View currentFocusedView, wn0.a<h0> onOffsetAnimationEnd) {
        s.k(scrollView, "scrollView");
        s.k(currentFocusedView, "currentFocusedView");
        s.k(onOffsetAnimationEnd, "onOffsetAnimationEnd");
        this.f48424c.p(softInputHeight, scrollView, currentFocusedView, onOffsetAnimationEnd);
    }

    public final void m() {
        if (this.isInitialized) {
            Z(null);
            View view = this.currentRootView;
            if (view != null) {
                b0(view);
            }
            Q(null);
            View view2 = this.currentRootView;
            if (view2 != null) {
                a0(view2);
            }
            this.isInitialized = false;
        }
    }

    public void n() {
        this.f48424c.q();
    }

    public void o(int from, int to2, View rootView) {
        s.k(rootView, "rootView");
        this.f48424c.r(from, to2, rootView);
    }

    public void p(int from, int to2, ScrollView scrollView, View focusedView) {
        s.k(scrollView, "scrollView");
        s.k(focusedView, "focusedView");
        this.f48424c.s(from, to2, scrollView, focusedView);
    }

    public View q() {
        return this.f48423b.getCurrentView();
    }

    public View r() {
        return this.f48423b.getPreviousView();
    }

    public void t(int from, int to2, View rootView) {
        s.k(rootView, "rootView");
        this.f48424c.u(from, to2, rootView);
    }

    public void u(int from, int to2, ScrollView scrollView, View currentFocusedView) {
        s.k(scrollView, "scrollView");
        s.k(currentFocusedView, "currentFocusedView");
        this.f48424c.v(from, to2, scrollView, currentFocusedView);
    }

    public final void v() {
        if (this.isInitialized) {
            return;
        }
        Z(this.onSoftInputListener);
        View view = this.currentRootView;
        if (view != null) {
            A(view);
        }
        Q(new a(this));
        View view2 = this.currentRootView;
        if (view2 != null) {
            z(view2);
        }
        this.isInitialized = true;
    }

    public void z(View rootView) {
        s.k(rootView, "rootView");
        this.f48423b.e(rootView);
    }
}
