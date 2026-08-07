package com.facebook.react.views.drawer;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.e;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import xo.c;
import xo.d;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactDrawerLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002FGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J!\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u000bJ!\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b'\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0-H\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000102H\u0017¢\u0006\u0004\b4\u00105J)\u00104\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00106J\u001b\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070-H\u0016¢\u0006\u0004\b8\u0010/J\u001b\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002070-H\u0016¢\u0006\u0004\b9\u0010/J'\u0010>\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0016¢\u0006\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/drawer/a;", "Lvo/b;", "<init>", "()V", "view", "", "drawerPosition", "Ljn0/h0;", "setDrawerPositionInternal", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/views/drawer/a;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/drawer/a;", "value", "setDrawerPosition", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/views/drawer/a;Lcom/facebook/react/bridge/Dynamic;)V", "", Snapshot.WIDTH, "setDrawerWidth", "(Lcom/facebook/react/views/drawer/a;F)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Float;)V", "drawerLockMode", "setDrawerLockMode", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "(Lcom/facebook/react/views/drawer/a;)V", ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "setKeyboardDismissMode", "", "setDrawerBackgroundColor", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Integer;)V", "setStatusBarBackgroundColor", "elevation", "setElevation", "", "needsCustomLayoutForChildren", "()Z", "", "getCommandsMap", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/drawer/a;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "getExportedViewConstants", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "index", "addView", "(Lcom/facebook/react/views/drawer/a;Landroid/view/View;I)V", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactDrawerLayoutManager extends ViewGroupManager<a> implements vo.b<a> {
    public static final int CLOSE_DRAWER = 2;
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";
    private static final String DRAWER_POSITION = "DrawerPosition";
    private static final String DRAWER_POSITION_LEFT = "Left";
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final l1<a> delegate = new vo.a(this);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$b;", "Lb7/a$e;", "Lb7/a;", "drawerLayout", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "<init>", "(Lb7/a;Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "Landroid/view/View;", "view", "", "v", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;F)V", "a", "(Landroid/view/View;)V", "b", "", IntegerTokenConverter.CONVERTER_KEY, "c", "(I)V", "Lb7/a;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements b7.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b7.a drawerLayout;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final EventDispatcher eventDispatcher;

        public b(b7.a drawerLayout, EventDispatcher eventDispatcher) {
            s.k(drawerLayout, "drawerLayout");
            s.k(eventDispatcher, "eventDispatcher");
            this.drawerLayout = drawerLayout;
            this.eventDispatcher = eventDispatcher;
        }

        @Override // b7.a.e
        public void a(View view) {
            s.k(view, "view");
            this.eventDispatcher.h(new xo.b(b1.f(this.drawerLayout), this.drawerLayout.getId()));
        }

        @Override // b7.a.e
        public void b(View view) {
            s.k(view, "view");
            this.eventDispatcher.h(new xo.a(b1.f(this.drawerLayout), this.drawerLayout.getId()));
        }

        @Override // b7.a.e
        public void c(int i11) {
            this.eventDispatcher.h(new d(b1.f(this.drawerLayout), this.drawerLayout.getId(), i11));
        }

        @Override // b7.a.e
        public void d(View view, float v11) {
            s.k(view, "view");
            this.eventDispatcher.h(new c(b1.f(this.drawerLayout), this.drawerLayout.getId(), v11));
        }
    }

    private final void setDrawerPositionInternal(a view, String drawerPosition) {
        if (s.f(drawerPosition, "left")) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (s.f(drawerPosition, "right")) {
            view.setDrawerPosition$ReactAndroid_release(8388613);
            return;
        }
        qk.a.I("ReactNative", "drawerPosition must be 'left' or 'right', received" + drawerPosition);
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return v0.m(x.a(COMMAND_OPEN_DRAWER, 1), x.a(COMMAND_CLOSE_DRAWER, 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public l1<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topDrawerSlide", v0.f(x.a("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put("topDrawerOpen", v0.f(x.a("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put("topDrawerClose", v0.f(x.a("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put("topDrawerStateChanged", v0.f(x.a("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return v0.f(x.a(DRAWER_POSITION, v0.m(x.a(DRAWER_POSITION_LEFT, 8388611), x.a(DRAWER_POSITION_RIGHT, 8388613))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // vo.b
    @no.a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(a view, Integer value) {
        s.k(view, "view");
    }

    @Override // vo.b
    @no.a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(a view, String value) {
        s.k(view, "view");
    }

    @Override // vo.b
    @no.a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(a view, Integer value) {
        s.k(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(com.facebook.react.uimanager.v0 reactContext, a view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        EventDispatcher eventDispatcherC = b1.c(reactContext, view.getId());
        if (eventDispatcherC == null) {
            return;
        }
        view.a(new b(view, eventDispatcherC));
    }

    @Override // vo.b
    public void closeDrawer(a view) {
        s.k(view, "view");
        view.U();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(com.facebook.react.uimanager.v0 context) {
        s.k(context, "context");
        return new a(context);
    }

    @Override // vo.b
    public void openDrawer(a view) {
        s.k(view, "view");
        view.V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5.equals("unlocked") != false) goto L25;
     */
    @Override // vo.b
    @no.a(name = "drawerLockMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDrawerLockMode(com.facebook.react.views.drawer.a r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p013kotlin.jvm.internal.s.k(r4, r0)
            r0 = 0
            if (r5 == 0) goto L5a
            int r1 = r5.hashCode()
            r2 = -1292600945(0xffffffffb2f4798f, float:-2.8460617E-8)
            if (r1 == r2) goto L33
            r2 = -210949405(0xfffffffff36d2ae3, float:-1.8790347E31)
            if (r1 == r2) goto L2a
            r2 = 168848173(0xa106b2d, float:6.953505E-33)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "locked-open"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r5 = 2
            r4.setDrawerLockMode(r5)
            return
        L2a:
            java.lang.String r1 = "unlocked"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L3b
            goto L5a
        L33:
            java.lang.String r1 = "locked-closed"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L55
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown drawerLockMode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ReactNative"
            qk.a.I(r1, r5)
            r4.setDrawerLockMode(r0)
            return
        L55:
            r5 = 1
            r4.setDrawerLockMode(r5)
            return
        L5a:
            r4.setDrawerLockMode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.drawer.ReactDrawerLayoutManager.setDrawerLockMode(com.facebook.react.views.drawer.a, java.lang.String):void");
    }

    @Override // vo.b
    public void setDrawerPosition(a view, String value) {
        s.k(view, "view");
        if (value == null) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
        } else {
            setDrawerPositionInternal(view, value);
        }
    }

    @no.a(defaultFloat = Float.NaN, name = "drawerWidth")
    public final void setDrawerWidth(a view, float width) {
        s.k(view, "view");
        view.setDrawerWidth$ReactAndroid_release(Float.isNaN(width) ? -1 : Math.round(w.f23413a.b(width)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(a view, float elevation) {
        s.k(view, "view");
        view.setDrawerElevation(w.f23413a.b(elevation));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(a parent, View child, int index) {
        s.k(parent, "parent");
        s.k(child, "child");
        if (getChildCount(parent) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (index != 0 && index != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + index + " instead.");
        }
        parent.addView(child, index);
        parent.setDrawerProperties$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @e
    public void receiveCommand(a root, int commandId, ReadableArray args) {
        s.k(root, "root");
        if (commandId == 1) {
            root.V();
        } else {
            if (commandId != 2) {
                return;
            }
            root.U();
        }
    }

    @no.a(name = "drawerPosition")
    public final void setDrawerPosition(a view, Dynamic drawerPosition) {
        s.k(view, "view");
        s.k(drawerPosition, "drawerPosition");
        if (drawerPosition.isNull()) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (drawerPosition.getType() == ReadableType.Number) {
            int iAsInt = drawerPosition.asInt();
            if (8388611 != iAsInt && 8388613 != iAsInt) {
                qk.a.I("ReactNative", "Unknown drawerPosition " + iAsInt);
                view.setDrawerPosition$ReactAndroid_release(8388611);
                return;
            }
            view.setDrawerPosition$ReactAndroid_release(iAsInt);
            return;
        }
        if (drawerPosition.getType() == ReadableType.String) {
            setDrawerPositionInternal(view, drawerPosition.asString());
        } else {
            qk.a.I("ReactNative", "drawerPosition must be a string or int");
            view.setDrawerPosition$ReactAndroid_release(8388611);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a root, String commandId, ReadableArray args) {
        s.k(root, "root");
        s.k(commandId, "commandId");
        if (s.f(commandId, COMMAND_OPEN_DRAWER)) {
            root.V();
        } else if (s.f(commandId, COMMAND_CLOSE_DRAWER)) {
            root.U();
        }
    }

    @Override // vo.b
    public void setDrawerWidth(a view, Float width) {
        int iRound;
        s.k(view, "view");
        if (width != null) {
            iRound = Math.round(w.f23413a.b(width.floatValue()));
        } else {
            iRound = -1;
        }
        view.setDrawerWidth$ReactAndroid_release(iRound);
    }
}
