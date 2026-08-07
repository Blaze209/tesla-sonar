package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import so.n;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactImageManager.REACT_CLASS)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TB=\b\u0007\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010'J!\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J'\u00105\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020!H\u0007¢\u0006\u0004\b5\u00106J!\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b8\u0010'J!\u0010:\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b:\u0010'J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J!\u0010>\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\b>\u0010.J\u001f\u0010@\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0017H\u0007¢\u0006\u0004\b@\u0010\u001bJ\u001f\u0010B\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010A\u001a\u00020+H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010\u001bJ!\u0010H\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\bM\u0010NR&\u0010\u0004\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010PR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010QR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006U"}, d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/h;", "Lil/b;", "draweeControllerBuilder", "Lcom/facebook/react/views/image/a;", "globalImageLoadListener", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "<init>", "(Lil/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V", "", "callerContext", "(Lil/b;Ljava/lang/Object;)V", "(Lil/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/image/h;", "", "getName", "()Ljava/lang/String;", "view", "", "accessible", "Ljn0/h0;", "setAccessible", "(Lcom/facebook/react/views/image/h;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "sources", "setSrc", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V", "setSource", "", "blurRadius", "setBlurRadius", "(Lcom/facebook/react/views/image/h;F)V", "analyticTag", "setInternal_AnalyticsTag", "(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V", "source", "setDefaultSource", "setLoadingIndicatorSource", "", "borderColor", "setBorderColor", "(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V", "overlayColor", "setOverlayColor", "borderWidth", "setBorderWidth", "index", Snapshot.BORDER_RADIUS, "setBorderRadius", "(Lcom/facebook/react/views/image/h;IF)V", "resizeMode", "setResizeMode", "resizeMethod", "setResizeMethod", "resizeMultiplier", "setResizeMultiplier", "tintColor", "setTintColor", "enabled", "setProgressiveRenderingEnabled", "durationMs", "setFadeDuration", "(Lcom/facebook/react/views/image/h;I)V", "shouldNotifyLoadEvents", "setLoadHandlersRegistered", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "setHeaders", "(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/image/h;)V", "Lil/b;", "Lcom/facebook/react/views/image/a;", "Lcom/facebook/react/views/image/f;", "Ljava/lang/Object;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactImageManager extends SimpleViewManager<h> {
    private static final String ON_ERROR = "onError";
    private static final String ON_LOAD = "onLoad";
    private static final String ON_LOAD_END = "onLoadEnd";
    private static final String ON_LOAD_START = "onLoadStart";
    private static final String ON_PROGRESS = "onProgress";
    public static final String REACT_CLASS = "RCTImageView";
    private static final String REGISTRATION_NAME = "registrationName";
    private Object callerContext;
    private final f callerContextFactory;
    private final il.b<?, ?, ?, ?> draweeControllerBuilder;
    private final a globalImageLoadListener;

    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        b.Companion companion = b.INSTANCE;
        exportedCustomDirectEventTypeConstants.put(companion.f(4), v0.f(x.a(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(companion.f(5), v0.f(x.a(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(companion.f(2), v0.f(x.a(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(companion.f(1), v0.f(x.a(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(companion.f(3), v0.f(x.a(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @no.a(name = "accessible")
    public final void setAccessible(h view, boolean accessible) {
        s.k(view, "view");
        view.setFocusable(accessible);
    }

    @no.a(name = "blurRadius")
    public final void setBlurRadius(h view, float blurRadius) {
        s.k(view, "view");
        view.setBlurRadius(blurRadius);
    }

    @no.a(customType = "Color", name = "borderColor")
    public final void setBorderColor(h view, Integer borderColor) {
        s.k(view, "view");
        com.facebook.react.uimanager.a.q(view, n.ALL, borderColor);
    }

    @no.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(h view, int index, float borderRadius) {
        s.k(view, "view");
        com.facebook.react.uimanager.a.r(view, so.d.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, p.POINT));
    }

    @no.a(name = "borderWidth")
    public final void setBorderWidth(h view, float borderWidth) {
        s.k(view, "view");
        com.facebook.react.uimanager.a.t(view, n.ALL, Float.valueOf(borderWidth));
    }

    @no.a(name = "defaultSource")
    public final void setDefaultSource(h view, String source) {
        s.k(view, "view");
        view.setDefaultSource(source);
    }

    @no.a(name = "fadeDuration")
    public final void setFadeDuration(h view, int durationMs) {
        s.k(view, "view");
        view.setFadeDuration(durationMs);
    }

    @no.a(name = "headers")
    public final void setHeaders(h view, ReadableMap headers) {
        s.k(view, "view");
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @no.a(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(h view, String analyticTag) {
        s.k(view, "view");
    }

    @no.a(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(h view, boolean shouldNotifyLoadEvents) {
        s.k(view, "view");
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @no.a(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(h view, String source) {
        s.k(view, "view");
        view.setLoadingIndicatorSource(source);
    }

    @no.a(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(h view, Integer overlayColor) {
        s.k(view, "view");
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @no.a(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(h view, boolean enabled) {
        s.k(view, "view");
        view.setProgressiveRenderingEnabled(enabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r3.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO) == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @no.a(name = "resizeMethod")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setResizeMethod(com.facebook.react.views.image.h r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p013kotlin.jvm.internal.s.k(r2, r0)
            if (r3 == 0) goto L65
            int r0 = r3.hashCode()
            switch(r0) {
                case -934437708: goto L36;
                case 3005871: goto L2d;
                case 3387192: goto L1e;
                case 109250890: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            java.lang.String r0 = "scale"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            goto L3e
        L18:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.SCALE
            r2.setResizeMethod(r3)
            return
        L1e:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L27
            goto L3e
        L27:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.NONE
            r2.setResizeMethod(r3)
            return
        L2d:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L65
            goto L3e
        L36:
            java.lang.String r0 = "resize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5f
        L3e:
            com.facebook.react.views.image.c r0 = com.facebook.react.views.image.c.AUTO
            r2.setResizeMethod(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Invalid resize method: '"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ReactNative"
            qk.a.I(r3, r2)
            return
        L5f:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.RESIZE
            r2.setResizeMethod(r3)
            return
        L65:
            com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.AUTO
            r2.setResizeMethod(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.ReactImageManager.setResizeMethod(com.facebook.react.views.image.h, java.lang.String):void");
    }

    @no.a(name = "resizeMode")
    public final void setResizeMode(h view, String resizeMode) {
        s.k(view, "view");
        view.setScaleType(d.c(resizeMode));
        view.setTileMode(d.d(resizeMode));
    }

    @no.a(name = "resizeMultiplier")
    public final void setResizeMultiplier(h view, float resizeMultiplier) {
        s.k(view, "view");
        if (resizeMultiplier < 0.01f) {
            qk.a.I("ReactNative", "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @no.a(name = "source")
    public final void setSource(h view, ReadableArray sources) {
        s.k(view, "view");
        view.setSource(sources);
    }

    @no.a(name = "src")
    public final void setSrc(h view, ReadableArray sources) {
        s.k(view, "view");
        setSource(view, sources);
    }

    @no.a(customType = "Color", name = "tintColor")
    public final void setTintColor(h view, Integer tintColor) {
        s.k(view, "view");
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(il.b<?, ?, ?, ?> bVar) {
        this(bVar, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(com.facebook.react.uimanager.v0 context) {
        s.k(context, "context");
        Object obj = this.callerContext;
        if (obj == null) {
            obj = null;
        }
        il.b bVarF = this.draweeControllerBuilder;
        if (bVarF == null) {
            bVarF = el.d.f();
        }
        s.h(bVarF);
        return new h(context, bVarF, null, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.o();
    }

    public ReactImageManager(il.b<?, ?, ?, ?> bVar, a aVar) {
        this(bVar, aVar, null, 4, null);
    }

    public /* synthetic */ ReactImageManager(il.b bVar, a aVar, f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((il.b<?, ?, ?, ?>) ((i11 & 1) != 0 ? null : bVar), (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : fVar);
    }

    public ReactImageManager(il.b<?, ?, ?, ?> bVar, a aVar, f fVar) {
        this.draweeControllerBuilder = bVar;
    }

    @jn0.e
    public ReactImageManager(il.b<?, ?, ?, ?> bVar, Object obj) {
        this(bVar, (a) null, (f) null);
        this.callerContext = obj;
    }

    @jn0.e
    public ReactImageManager(il.b<?, ?, ?, ?> bVar, a aVar, Object obj) {
        this(bVar, aVar, (f) null);
        this.callerContext = obj;
    }
}
