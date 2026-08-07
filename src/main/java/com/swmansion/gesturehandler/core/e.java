package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 !2\u00020\u0001:\b\"#$%&'()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/swmansion/gesturehandler/core/e;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Ljn0/h0;", "W0", "s0", "handler", "", "L0", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "K0", "n0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "j0", "k0", "o0", Gender.OTHER, "Z", "shouldActivateOnStart", "value", "P", "X0", "()Z", "disallowInterruption", "Lcom/swmansion/gesturehandler/core/e$e;", "Q", "Lcom/swmansion/gesturehandler/core/e$e;", "hook", "R", DateTokenConverter.CONVERTER_KEY, "b", "e", IntegerTokenConverter.CONVERTER_KEY, "c", "h", "g", "f", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends GestureHandler {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a S = new a();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private boolean shouldActivateOnStart;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean disallowInterruption;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private InterfaceC1111e hook = S;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/swmansion/gesturehandler/core/e$a", "Lcom/swmansion/gesturehandler/core/e$e;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements InterfaceC1111e {
        a() {
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return InterfaceC1111e.a.f(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent motionEvent) {
            InterfaceC1111e.a.a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent motionEvent) {
            return InterfaceC1111e.a.c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return InterfaceC1111e.a.h(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            return InterfaceC1111e.a.b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent motionEvent) {
            return InterfaceC1111e.a.e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent motionEvent) {
            InterfaceC1111e.a.d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler gestureHandler) {
            return InterfaceC1111e.a.g(this, gestureHandler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0004*\u0001\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "b", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "DEFAULT_SHOULD_CANCEL_WHEN_OUTSIDE", "Z", "DEFAULT_SHOULD_ACTIVATE_ON_START", "DEFAULT_DISALLOW_INTERRUPTION", "com/swmansion/gesturehandler/core/e$a", "defaultHook", "Lcom/swmansion/gesturehandler/core/e$a;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(View view, MotionEvent event) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(event);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/swmansion/gesturehandler/core/e$c;", "Lcom/swmansion/gesturehandler/core/e$e;", "Lcom/swmansion/gesturehandler/core/e;", "handler", "Lcom/facebook/react/views/textinput/j;", "editText", "<init>", "(Lcom/swmansion/gesturehandler/core/e;Lcom/facebook/react/views/textinput/j;)V", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "b", "(Landroid/view/MotionEvent;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "", "h", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "()Z", "g", "a", "Lcom/swmansion/gesturehandler/core/e;", "Lcom/facebook/react/views/textinput/j;", "", "c", Gender.FEMALE, "startX", "startY", "", "e", "I", "touchSlopSquared", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c implements InterfaceC1111e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e handler;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final com.facebook.react.views.textinput.j editText;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float startX;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float startY;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int touchSlopSquared;

        public c(e handler, com.facebook.react.views.textinput.j editText) {
            s.k(handler, "handler");
            s.k(editText, "editText");
            this.handler = handler;
            this.editText = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.touchSlopSquared = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent event) {
            s.k(event, "event");
            if (((event.getX() - this.startX) * (event.getX() - this.startX)) + ((event.getY() - this.startY) * (event.getY() - this.startY)) < this.touchSlopSquared) {
                this.editText.P();
            }
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent motionEvent) {
            return InterfaceC1111e.a.c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            return InterfaceC1111e.a.b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent motionEvent) {
            return InterfaceC1111e.a.e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent event) {
            s.k(event, "event");
            this.handler.k();
            this.editText.onTouchEvent(event);
            this.startX = event.getX();
            this.startY = event.getY();
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler handler) {
            s.k(handler, "handler");
            return Boolean.valueOf(handler.getTag() > 0 && !(handler instanceof e));
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$d;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/e;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/e;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/e;Lcom/facebook/react/bridge/ReadableMap;)V", "Lz90/f;", "h", "(Lcom/swmansion/gesturehandler/core/e;)Lz90/f;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends GestureHandler.b<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<e> type = e.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<e> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public e a(Context context) {
            return new e();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.f c(e handler) {
            s.k(handler, "handler");
            return new z90.f(handler);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(e handler, ReadableMap config) {
            s.k(handler, "handler");
            s.k(config, "config");
            super.f(handler, config);
            if (config.hasKey("shouldActivateOnStart")) {
                handler.shouldActivateOnStart = config.getBoolean("shouldActivateOnStart");
            }
            if (config.hasKey("disallowInterruption")) {
                handler.disallowInterruption = config.getBoolean("disallowInterruption");
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$e;", "", "Landroid/view/MotionEvent;", "event", "", "c", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "view", "e", "(Landroid/view/View;)Z", "Ljn0/h0;", "b", "(Landroid/view/MotionEvent;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "h", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "()Z", "g", "a", "f", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InterfaceC1111e {

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.e$e$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public static void a(InterfaceC1111e interfaceC1111e, MotionEvent event) {
                s.k(event, "event");
            }

            public static boolean b(InterfaceC1111e interfaceC1111e, View view) {
                s.k(view, "view");
                return view.isPressed();
            }

            public static boolean c(InterfaceC1111e interfaceC1111e, MotionEvent event) {
                s.k(event, "event");
                return true;
            }

            public static void d(InterfaceC1111e interfaceC1111e, MotionEvent event) {
                s.k(event, "event");
            }

            public static Boolean e(InterfaceC1111e interfaceC1111e, View view, MotionEvent event) {
                s.k(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(event));
                }
                return null;
            }

            public static boolean f(InterfaceC1111e interfaceC1111e) {
                return false;
            }

            public static Boolean g(InterfaceC1111e interfaceC1111e, GestureHandler handler) {
                s.k(handler, "handler");
                return null;
            }

            public static boolean h(InterfaceC1111e interfaceC1111e) {
                return false;
            }
        }

        boolean a();

        void b(MotionEvent event);

        boolean c(MotionEvent event);

        boolean d();

        boolean e(View view);

        Boolean f(View view, MotionEvent event);

        void g(MotionEvent event);

        Boolean h(GestureHandler handler);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$f;", "Lcom/swmansion/gesturehandler/core/e$e;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "f", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class f implements InterfaceC1111e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return InterfaceC1111e.a.f(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent motionEvent) {
            InterfaceC1111e.a.a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent motionEvent) {
            return InterfaceC1111e.a.c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return InterfaceC1111e.a.h(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            return InterfaceC1111e.a.b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent event) {
            s.k(event, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(event));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent motionEvent) {
            InterfaceC1111e.a.d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler gestureHandler) {
            return InterfaceC1111e.a.g(this, gestureHandler);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$g;", "Lcom/swmansion/gesturehandler/core/e$e;", "<init>", "()V", "", "a", "()Z", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class g implements InterfaceC1111e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent motionEvent) {
            InterfaceC1111e.a.a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent motionEvent) {
            return InterfaceC1111e.a.c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return InterfaceC1111e.a.h(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            return InterfaceC1111e.a.b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent motionEvent) {
            return InterfaceC1111e.a.e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent motionEvent) {
            InterfaceC1111e.a.d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler gestureHandler) {
            return InterfaceC1111e.a.g(this, gestureHandler);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$h;", "Lcom/swmansion/gesturehandler/core/e$e;", "Lcom/swmansion/gesturehandler/core/e;", "handler", "Lcom/facebook/react/views/swiperefresh/a;", "swipeRefreshLayout", "<init>", "(Lcom/swmansion/gesturehandler/core/e;Lcom/facebook/react/views/swiperefresh/a;)V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "g", "(Landroid/view/MotionEvent;)V", "a", "Lcom/swmansion/gesturehandler/core/e;", "b", "Lcom/facebook/react/views/swiperefresh/a;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class h implements InterfaceC1111e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e handler;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final com.facebook.react.views.swiperefresh.a swipeRefreshLayout;

        public h(e handler, com.facebook.react.views.swiperefresh.a swipeRefreshLayout) {
            s.k(handler, "handler");
            s.k(swipeRefreshLayout, "swipeRefreshLayout");
            this.handler = handler;
            this.swipeRefreshLayout = swipeRefreshLayout;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return InterfaceC1111e.a.f(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent motionEvent) {
            InterfaceC1111e.a.a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent motionEvent) {
            return InterfaceC1111e.a.c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            return InterfaceC1111e.a.b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent motionEvent) {
            return InterfaceC1111e.a.e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent event) {
            ArrayList<GestureHandler> arrayListS;
            s.k(event, "event");
            View childAt = this.swipeRefreshLayout.getChildAt(0);
            GestureHandler gestureHandler = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            y90.g orchestrator = this.handler.getOrchestrator();
            if (orchestrator != null && (arrayListS = orchestrator.s(scrollView)) != null) {
                Iterator<T> it = arrayListS.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    gestureHandler = (GestureHandler) it.next();
                } while (!(gestureHandler instanceof e));
            }
            if (gestureHandler == null || gestureHandler.getState() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.handler.D();
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler gestureHandler) {
            return InterfaceC1111e.a.g(this, gestureHandler);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/swmansion/gesturehandler/core/e$i;", "Lcom/swmansion/gesturehandler/core/e$e;", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "", "h", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ljava/lang/Boolean;", "Landroid/view/View;", "view", "e", "(Landroid/view/View;)Z", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class i implements InterfaceC1111e {
        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return InterfaceC1111e.a.f(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent motionEvent) {
            InterfaceC1111e.a.a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent motionEvent) {
            return InterfaceC1111e.a.c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return InterfaceC1111e.a.h(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            s.k(view, "view");
            return view instanceof com.facebook.react.views.text.h;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent motionEvent) {
            return InterfaceC1111e.a.e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent motionEvent) {
            InterfaceC1111e.a.d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler handler) {
            s.k(handler, "handler");
            return Boolean.FALSE;
        }
    }

    public e() {
        G0(true);
    }

    private final void W0() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        motionEventObtain.setAction(3);
        InterfaceC1111e interfaceC1111e = this.hook;
        View view = getView();
        s.h(motionEventObtain);
        interfaceC1111e.f(view, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean K0(GestureHandler handler) {
        s.k(handler, "handler");
        return !this.disallowInterruption;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean L0(GestureHandler handler) {
        s.k(handler, "handler");
        Boolean boolH = this.hook.h(handler);
        if (boolH != null) {
            return boolH.booleanValue();
        }
        if (super.L0(handler)) {
            return true;
        }
        if ((handler instanceof e) && handler.getState() == 4 && ((e) handler).disallowInterruption) {
            return false;
        }
        boolean z11 = this.disallowInterruption;
        return !(getState() == 4 && handler.getState() == 4 && !z11) && getState() == 4 && !z11 && (!this.hook.a() || handler.getTag() > 0);
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final boolean getDisallowInterruption() {
        return this.disallowInterruption;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void j0() {
        W0();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void k0() {
        W0();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        View view = getView();
        s.h(view);
        Context context = view.getContext();
        s.j(context, "getContext(...)");
        boolean zC = com.swmansion.gesturehandler.react.a.c(context);
        if ((view instanceof RNGestureHandlerButtonViewManager.a) && zC) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (getState() != 0 || this.hook.c(event)) {
                this.hook.f(view, event);
                if ((getState() == 0 || getState() == 2) && this.hook.e(view)) {
                    k();
                }
                if (getState() == 0) {
                    q();
                } else {
                    B();
                }
            } else {
                q();
            }
            this.hook.b(event);
            return;
        }
        if (getState() != 0 && getState() != 2) {
            if (getState() == 4) {
                this.hook.f(view, event);
                return;
            }
            return;
        }
        if (this.shouldActivateOnStart) {
            INSTANCE.b(view, event);
            this.hook.f(view, event);
            k();
        } else if (INSTANCE.b(view, event)) {
            this.hook.f(view, event);
            k();
        } else if (this.hook.d()) {
            this.hook.g(event);
        } else {
            if (getState() == 2 || !this.hook.c(event)) {
                return;
            }
            p();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void n0() {
        KeyEvent.Callback view = getView();
        if (view instanceof InterfaceC1111e) {
            this.hook = (InterfaceC1111e) view;
            return;
        }
        if (view instanceof com.facebook.react.views.textinput.j) {
            this.hook = new c(this, (com.facebook.react.views.textinput.j) view);
            return;
        }
        if (view instanceof com.facebook.react.views.swiperefresh.a) {
            this.hook = new h(this, (com.facebook.react.views.swiperefresh.a) view);
            return;
        }
        if (view instanceof com.facebook.react.views.scroll.g) {
            this.hook = new g();
            return;
        }
        if (view instanceof com.facebook.react.views.scroll.f) {
            this.hook = new g();
        } else if (view instanceof com.facebook.react.views.text.h) {
            this.hook = new i();
        } else if (view instanceof com.facebook.react.views.view.e) {
            this.hook = new f();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        this.hook = S;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void s0() {
        super.s0();
        this.shouldActivateOnStart = false;
        this.disallowInterruption = false;
        G0(true);
    }
}
