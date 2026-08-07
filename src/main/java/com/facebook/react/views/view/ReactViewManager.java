package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import so.n;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b#\u0010!J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b$\u0010!J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b%\u0010!J'\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J'\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b)\u0010-J!\u0010/\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u00101\u001a\u00020'H\u0017¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u00100J!\u00107\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b:\u00108J\u001f\u0010<\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0017H\u0017¢\u0006\u0004\b<\u0010\u001aJ'\u0010>\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010=\u001a\u00020+H\u0017¢\u0006\u0004\b>\u0010-J)\u0010@\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0017H\u0017¢\u0006\u0004\bC\u0010\u001aJ\u001f\u0010E\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0017¢\u0006\u0004\bE\u0010\u001aJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0017H\u0017¢\u0006\u0004\bG\u0010\u001aJ!\u0010I\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bI\u00100J\u001f\u0010K\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u0006H\u0017¢\u0006\u0004\bK\u00100J\u001f\u0010M\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010L\u001a\u00020+H\u0016¢\u0006\u0004\bM\u0010NJ+\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u00010\f2\b\u0010P\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u0012H\u0016¢\u0006\u0004\bV\u0010WJ\u001b\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0XH\u0016¢\u0006\u0004\bY\u0010ZJ)\u0010\\\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\\\u0010]J)\u0010\\\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\\\u0010^¨\u0006a"}, d2 = {"Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/view/e;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "", Action.KEY_ATTRIBUTE, "", "px", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)I", "root", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", "handleSetPressed", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/ReadableArray;)V", "handleHotspotUpdate", "Lcom/facebook/react/uimanager/v0;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/views/view/e;)Lcom/facebook/react/views/view/e;", "", "accessible", "setAccessible", "(Lcom/facebook/react/views/view/e;Z)V", "hasTVPreferredFocus", "setTVPreferredFocus", "backgroundImage", "setBackgroundImage", "viewId", "nextFocusDown", "(Lcom/facebook/react/views/view/e;I)V", "nextFocusForward", "nextFocusLeft", "nextFocusRight", "nextFocusUp", "index", "Lcom/facebook/react/bridge/Dynamic;", "rawBorderRadius", "setBorderRadius", "(Lcom/facebook/react/views/view/e;ILcom/facebook/react/bridge/Dynamic;)V", "", Snapshot.BORDER_RADIUS, "(Lcom/facebook/react/views/view/e;IF)V", "borderStyle", "setBorderStyle", "(Lcom/facebook/react/views/view/e;Ljava/lang/String;)V", "hitSlop", "setHitSlop", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/Dynamic;)V", "pointerEventsStr", "setPointerEvents", AppStateModule.APP_STATE_BACKGROUND, "setNativeBackground", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/ReadableMap;)V", "foreground", "setNativeForeground", "needsOffscreenAlphaCompositing", "setNeedsOffscreenAlphaCompositing", Snapshot.WIDTH, "setBorderWidth", "color", "setBorderColor", "(Lcom/facebook/react/views/view/e;ILjava/lang/Integer;)V", "collapsable", "setCollapsable", "collapsableChildren", "setCollapsableChildren", "focusable", "setFocusable", "overflow", "setOverflow", "backfaceVisibility", "setBackfaceVisibility", "opacity", "setOpacity", "(Lcom/facebook/react/views/view/e;F)V", "transforms", "transformOrigin", "setTransformProperty", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V", "getName", "()Ljava/lang/String;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/view/e;", "", "getCommandsMap", "()Ljava/util/Map;", "commandId", "receiveCommand", "(Lcom/facebook/react/views/view/e;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/view/e;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ReactViewManager extends ReactClippingViewManager<e> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23859a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23859a = iArr;
        }
    }

    public ReactViewManager() {
        if (tn.b.l()) {
            setupViewRecycling();
        }
    }

    private final void handleHotspotUpdate(e root, ReadableArray args) {
        if (args == null || args.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        w wVar = w.f23413a;
        root.drawableHotspotChanged(wVar.a(args.getDouble(0)), wVar.a(args.getDouble(1)));
    }

    private final void handleSetPressed(e root, ReadableArray args) {
        if (args == null || args.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        root.setPressed(args.getBoolean(0));
    }

    private final int px(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return (int) w.f23413a.a(readableMap.getDouble(str));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFocusable$lambda$2(e eVar, View view) {
        Context context = eVar.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = b1.c((ReactContext) context, eVar.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new h(b1.e(eVar.getContext()), eVar.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return v0.o(x.a(HOTSPOT_UPDATE_KEY, 1), x.a("setPressed", 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @no.a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(e view, int viewId) {
        s.k(view, "view");
        view.setNextFocusDownId(viewId);
    }

    @no.a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(e view, int viewId) {
        s.k(view, "view");
        view.setNextFocusForwardId(viewId);
    }

    @no.a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(e view, int viewId) {
        s.k(view, "view");
        view.setNextFocusLeftId(viewId);
    }

    @no.a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(e view, int viewId) {
        s.k(view, "view");
        view.setNextFocusRightId(viewId);
    }

    @no.a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(e view, int viewId) {
        s.k(view, "view");
        view.setNextFocusUpId(viewId);
    }

    @no.a(name = "accessible")
    public void setAccessible(e view, boolean accessible) {
        s.k(view, "view");
        view.setFocusable(accessible);
    }

    @no.a(name = "backfaceVisibility")
    public void setBackfaceVisibility(e view, String backfaceVisibility) {
        s.k(view, "view");
        s.k(backfaceVisibility, "backfaceVisibility");
        view.setBackfaceVisibility(backfaceVisibility);
    }

    @no.a(customType = "BackgroundImage", name = "experimental_backgroundImage")
    public void setBackgroundImage(e view, ReadableArray backgroundImage) {
        s.k(view, "view");
        if (oo.a.c(view) == 2) {
            if (backgroundImage == null || backgroundImage.size() <= 0) {
                com.facebook.react.uimanager.a.p(view, null);
                return;
            }
            ArrayList arrayList = new ArrayList(backgroundImage.size());
            int size = backgroundImage.size();
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = backgroundImage.getMap(i11);
                Context context = view.getContext();
                s.j(context, "getContext(...)");
                arrayList.add(new so.a(map, context));
            }
            com.facebook.react.uimanager.a.p(view, arrayList);
        }
    }

    @no.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(e view, int index, Integer color) {
        s.k(view, "view");
        com.facebook.react.uimanager.a.q(view, n.INSTANCE.a(SPACING_TYPES[index]), color);
    }

    @no.b(names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    public void setBorderRadius(e view, int index, Dynamic rawBorderRadius) {
        s.k(view, "view");
        s.k(rawBorderRadius, "rawBorderRadius");
        LengthPercentage lengthPercentageA = LengthPercentage.INSTANCE.a(rawBorderRadius);
        if (oo.a.c(view) != 2 && lengthPercentageA != null && lengthPercentageA.getType() == p.PERCENT) {
            lengthPercentageA = null;
        }
        com.facebook.react.uimanager.a.r(view, so.d.values()[index], lengthPercentageA);
    }

    @no.a(name = "borderStyle")
    public void setBorderStyle(e view, String borderStyle) {
        s.k(view, "view");
        com.facebook.react.uimanager.a.s(view, borderStyle == null ? null : so.f.INSTANCE.a(borderStyle));
    }

    @no.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(e view, int index, float width) {
        s.k(view, "view");
        com.facebook.react.uimanager.a.t(view, n.values()[index], Float.valueOf(width));
    }

    @no.a(name = "collapsable")
    public void setCollapsable(e view, boolean collapsable) {
        s.k(view, "view");
    }

    @no.a(name = "collapsableChildren")
    public void setCollapsableChildren(e view, boolean collapsableChildren) {
        s.k(view, "view");
    }

    @no.a(name = "focusable")
    public void setFocusable(final e view, boolean focusable) {
        s.k(view, "view");
        if (focusable) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.view.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ReactViewManager.setFocusable$lambda$2(view, view2);
                }
            });
            view.setFocusable(true);
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @no.a(name = "hitSlop")
    public void setHitSlop(e view, Dynamic hitSlop) {
        s.k(view, "view");
        s.k(hitSlop, "hitSlop");
        int i11 = b.f23859a[hitSlop.getType().ordinal()];
        if (i11 == 1) {
            ReadableMap readableMapAsMap = hitSlop.asMap();
            view.setHitSlopRect(new Rect(px(readableMapAsMap, "left"), px(readableMapAsMap, "top"), px(readableMapAsMap, "right"), px(readableMapAsMap, "bottom")));
            return;
        }
        if (i11 == 2) {
            int iA = (int) w.f23413a.a(hitSlop.asDouble());
            view.setHitSlopRect(new Rect(iA, iA, iA, iA));
        } else {
            if (i11 == 3) {
                view.setHitSlopRect(null);
                return;
            }
            qk.a.I("ReactNative", "Invalid type for 'hitSlop' value " + hitSlop.getType());
            view.setHitSlopRect(null);
        }
    }

    @no.a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(e view, ReadableMap background) {
        Drawable drawableA;
        s.k(view, "view");
        if (background != null) {
            Context context = view.getContext();
            s.j(context, "getContext(...)");
            drawableA = d.a(context, background);
        } else {
            drawableA = null;
        }
        com.facebook.react.uimanager.a.w(view, drawableA);
    }

    @no.a(name = "nativeForegroundAndroid")
    public void setNativeForeground(e view, ReadableMap foreground) {
        Drawable drawableA;
        s.k(view, "view");
        if (foreground != null) {
            Context context = view.getContext();
            s.j(context, "getContext(...)");
            drawableA = d.a(context, foreground);
        } else {
            drawableA = null;
        }
        view.setForeground(drawableA);
    }

    @no.a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(e view, boolean needsOffscreenAlphaCompositing) {
        s.k(view, "view");
        view.setNeedsOffscreenAlphaCompositing(needsOffscreenAlphaCompositing);
    }

    @no.a(name = "overflow")
    public void setOverflow(e view, String overflow) {
        s.k(view, "view");
        view.setOverflow(overflow);
    }

    @no.a(name = "pointerEvents")
    public void setPointerEvents(e view, String pointerEventsStr) {
        s.k(view, "view");
        view.setPointerEvents(com.facebook.react.uimanager.x.INSTANCE.c(pointerEventsStr));
    }

    @no.a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(e view, boolean hasTVPreferredFocus) {
        s.k(view, "view");
        if (hasTVPreferredFocus) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(com.facebook.react.uimanager.v0 context) {
        s.k(context, "context");
        return new e(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public e prepareToRecycleView(com.facebook.react.uimanager.v0 reactContext, e view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        e eVar = (e) super.prepareToRecycleView(reactContext, view);
        if (eVar != null) {
            eVar.recycleView();
        }
        return view;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(e view, float opacity) {
        s.k(view, "view");
        view.setOpacityIfPossible(opacity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(e view, ReadableArray transforms, ReadableArray transformOrigin) {
        s.k(view, "view");
        super.setTransformProperty(view, transforms, transformOrigin);
        view.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @jn0.e
    public void receiveCommand(e root, int commandId, ReadableArray args) {
        s.k(root, "root");
        if (commandId == 1) {
            handleHotspotUpdate(root, args);
        } else {
            if (commandId != 2) {
                return;
            }
            handleSetPressed(root, args);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e root, String commandId, ReadableArray args) {
        s.k(root, "root");
        s.k(commandId, "commandId");
        if (s.f(commandId, HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(root, args);
        } else if (s.f(commandId, "setPressed")) {
            handleSetPressed(root, args);
        }
    }

    @jn0.e
    public void setBorderRadius(e view, int index, float borderRadius) {
        s.k(view, "view");
        setBorderRadius(view, index, new DynamicFromObject(Float.valueOf(borderRadius)));
    }
}
