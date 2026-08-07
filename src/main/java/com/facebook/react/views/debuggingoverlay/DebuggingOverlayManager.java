package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo.i;
import vo.j;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/debuggingoverlay/b;", "Lvo/j;", "<init>", "()V", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "view", "", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", "receiveCommand", "(Lcom/facebook/react/views/debuggingoverlay/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "highlightTraceUpdates", "(Lcom/facebook/react/views/debuggingoverlay/b;Lcom/facebook/react/bridge/ReadableArray;)V", "highlightElements", "clearElementsHighlights", "(Lcom/facebook/react/views/debuggingoverlay/b;)V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/debuggingoverlay/b;", "getName", "()Ljava/lang/String;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebuggingOverlayManager extends SimpleViewManager<b> implements j<b> {
    public static final String REACT_CLASS = "DebuggingOverlay";
    private final l1<b> delegate = new i(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<b> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // vo.j
    public void clearElementsHighlights(b view) {
        s.k(view, "view");
        view.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(v0 context) {
        s.k(context, "context");
        return new b(context);
    }

    @Override // vo.j
    public void highlightElements(b view, ReadableArray args) throws Exception {
        ReadableArray array;
        s.k(view, "view");
        if (args == null || (array = args.getArray(0)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = array.size();
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = array.getMap(i11);
            if (map != null) {
                try {
                    float f11 = (float) map.getDouble("x");
                    float f12 = (float) map.getDouble("y");
                    float f13 = (float) (((double) f11) + map.getDouble(Snapshot.WIDTH));
                    float f14 = (float) (((double) f12) + map.getDouble(Snapshot.HEIGHT));
                    w wVar = w.f23413a;
                    arrayList.add(new RectF(wVar.b(f11), wVar.b(f12), wVar.b(f13), wVar.b(f14)));
                } catch (Exception e11) {
                    if (!(e11 instanceof NoSuchKeyException) && !(e11 instanceof UnexpectedNativeTypeException)) {
                        throw e11;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    h0 h0Var = h0.f84049a;
                    z11 = false;
                }
            }
        }
        if (z11) {
            view.setHighlightedElementsRectangles(arrayList);
        }
    }

    @Override // vo.j
    public void highlightTraceUpdates(b view, ReadableArray args) throws Exception {
        s.k(view, "view");
        if (args != null) {
            boolean z11 = false;
            ReadableArray array = args.getArray(0);
            if (array == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = array.size();
            boolean z12 = true;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = z12;
                    break;
                }
                ReadableMap map = array.getMap(i11);
                if (map != null) {
                    ReadableMap map2 = map.getMap("rectangle");
                    if (map2 == null) {
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field is null"));
                        break;
                    }
                    int i12 = map.getInt("id");
                    int i13 = map.getInt("color");
                    try {
                        float f11 = (float) map2.getDouble("x");
                        float f12 = (float) map2.getDouble("y");
                        float f13 = (float) (((double) f11) + map2.getDouble(Snapshot.WIDTH));
                        float f14 = (float) (((double) f12) + map2.getDouble(Snapshot.HEIGHT));
                        w wVar = w.f23413a;
                        arrayList.add(new c(i12, new RectF(wVar.b(f11), wVar.b(f12), wVar.b(f13), wVar.b(f14)), i13));
                    } catch (Exception e11) {
                        if (!(e11 instanceof NoSuchKeyException) && !(e11 instanceof UnexpectedNativeTypeException)) {
                            throw e11;
                        }
                        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"));
                        h0 h0Var = h0.f84049a;
                        z12 = false;
                    }
                }
                i11++;
                z11 = false;
            }
            if (z11) {
                view.setTraceUpdates(arrayList);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b view, String commandId, ReadableArray args) throws Exception {
        s.k(view, "view");
        s.k(commandId, "commandId");
        int iHashCode = commandId.hashCode();
        if (iHashCode != -1942063165) {
            if (iHashCode != 1326903961) {
                if (iHashCode == 1385348555 && commandId.equals("highlightElements")) {
                    highlightElements(view, args);
                    return;
                }
            } else if (commandId.equals("highlightTraceUpdates")) {
                highlightTraceUpdates(view, args);
                return;
            }
        } else if (commandId.equals("clearElementsHighlights")) {
            clearElementsHighlights(view);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Received unexpected command in DebuggingOverlayManager"));
    }
}
