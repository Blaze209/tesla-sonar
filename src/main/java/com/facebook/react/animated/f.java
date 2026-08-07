package com.facebook.react.animated;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001\u000eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0011\u0010+\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/react/animated/f;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/animated/d;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Lcom/facebook/react/animated/o;", "nativeAnimatedNodesManager", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/o;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "k", "()V", "a", "(Lcom/facebook/react/bridge/ReadableMap;)V", "", "e", "()Ljava/lang/String;", "f", "Lcom/facebook/react/animated/o;", "g", "Lcom/facebook/react/bridge/ReactApplicationContext;", "", "h", "I", "rNodeId", IntegerTokenConverter.CONVERTER_KEY, "gNodeId", "j", "bNodeId", "aNodeId", "l", "Lcom/facebook/react/bridge/ReadableMap;", "nativeColor", "", "m", "Z", "nativeColorApplied", "Landroid/content/Context;", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "()I", "color", "n", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends b implements d {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o nativeAnimatedNodesManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int rNodeId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int gNodeId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int bNodeId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int aNodeId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private ReadableMap nativeColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean nativeColorApplied;

    /* JADX INFO: renamed from: com.facebook.react.animated.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/animated/f$a;", "", "<init>", "()V", "Lcom/facebook/react/animated/b;", "node", "Landroid/content/Context;", "b", "(Lcom/facebook/react/animated/b;)Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Context b(b node) {
            List<b> list = node.children;
            if (list != null) {
                Iterator<b> it = list.iterator();
                if (it.hasNext()) {
                    b next = it.next();
                    if (!(next instanceof q)) {
                        return f.INSTANCE.b(next);
                    }
                    View viewK = ((q) next).k();
                    if (viewK != null) {
                        return viewK.getContext();
                    }
                    return null;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public f(ReadableMap config, o nativeAnimatedNodesManager, ReactApplicationContext reactApplicationContext) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        p013kotlin.jvm.internal.s.k(reactApplicationContext, "reactApplicationContext");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.reactApplicationContext = reactApplicationContext;
        a(config);
    }

    private final Context j() {
        Activity currentActivity = this.reactApplicationContext.getCurrentActivity();
        return currentActivity != null ? currentActivity : INSTANCE.b(this);
    }

    private final void k() {
        Context contextJ;
        if (this.nativeColor == null || this.nativeColorApplied || (contextJ = j()) == null) {
            return;
        }
        Integer color = ColorPropConverter.getColor(this.nativeColor, contextJ);
        w wVar = (w) this.nativeAnimatedNodesManager.k(this.rNodeId);
        w wVar2 = (w) this.nativeAnimatedNodesManager.k(this.gNodeId);
        w wVar3 = (w) this.nativeAnimatedNodesManager.k(this.bNodeId);
        w wVar4 = (w) this.nativeAnimatedNodesManager.k(this.aNodeId);
        if (wVar != null) {
            p013kotlin.jvm.internal.s.h(color);
            wVar.nodeValue = Color.red(color.intValue());
        }
        if (wVar2 != null) {
            p013kotlin.jvm.internal.s.h(color);
            wVar2.nodeValue = Color.green(color.intValue());
        }
        if (wVar3 != null) {
            p013kotlin.jvm.internal.s.h(color);
            wVar3.nodeValue = Color.blue(color.intValue());
        }
        if (wVar4 != null) {
            p013kotlin.jvm.internal.s.h(color);
            wVar4.nodeValue = ((double) Color.alpha(color.intValue())) / 255.0d;
        }
        this.nativeColorApplied = true;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap config) {
        if (config == null) {
            this.rNodeId = 0;
            this.gNodeId = 0;
            this.bNodeId = 0;
            this.aNodeId = 0;
            this.nativeColor = null;
            this.nativeColorApplied = false;
            return;
        }
        this.rNodeId = config.getInt("r");
        this.gNodeId = config.getInt("g");
        this.bNodeId = config.getInt("b");
        this.aNodeId = config.getInt("a");
        this.nativeColor = config.getMap("nativeColor");
        this.nativeColorApplied = false;
        k();
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ColorAnimatedNode[" + this.tag + "]: r: " + this.rNodeId + "  g: " + this.gNodeId + " b: " + this.bNodeId + " a: " + this.aNodeId;
    }

    public final int i() {
        k();
        w wVar = (w) this.nativeAnimatedNodesManager.k(this.rNodeId);
        w wVar2 = (w) this.nativeAnimatedNodesManager.k(this.gNodeId);
        w wVar3 = (w) this.nativeAnimatedNodesManager.k(this.bNodeId);
        w wVar4 = (w) this.nativeAnimatedNodesManager.k(this.aNodeId);
        return com.facebook.react.views.view.b.b(wVar != null ? wVar.nodeValue : 0.0d, wVar2 != null ? wVar2.nodeValue : 0.0d, wVar3 != null ? wVar3.nodeValue : 0.0d, wVar4 != null ? wVar4.nodeValue : 0.0d);
    }
}
