package com.rncamerakit;

import android.util.Log;
import android.util.Size;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.swmansion.rnscreens.t;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010#J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010(J#\u0010,\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b.\u0010-J!\u00101\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b4\u0010\u001aJ\u001f\u00106\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020*H\u0007¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b8\u0010(J!\u0010:\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020*H\u0007¢\u0006\u0004\b:\u00107J!\u0010;\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b;\u0010\u001aJ!\u0010<\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u00010*¢\u0006\u0004\b<\u0010-J\u001f\u0010=\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020*¢\u0006\u0004\b=\u00107J\u001f\u0010>\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020%¢\u0006\u0004\b>\u0010(J!\u0010?\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b?\u0010\u001aJ!\u0010@\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u00109\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b@\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0006¨\u0006E"}, d2 = {"Lcom/rncamerakit/CKCameraManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/rncamerakit/e;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/rncamerakit/e;", "view", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Ljn0/h0;", "receiveCommand", "(Lcom/rncamerakit/e;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "type", "setCameraType", "(Lcom/rncamerakit/e;Ljava/lang/String;)V", "mode", "setFlashMode", "setTorchMode", "setFocusMode", "setZoomMode", "", "factor", "setZoom", "(Lcom/rncamerakit/e;D)V", "setMaxZoom", "", "enabled", "setScanBarcode", "(Lcom/rncamerakit/e;Z)V", "setShowFrame", "", "color", "setLaserColor", "(Lcom/rncamerakit/e;Ljava/lang/Integer;)V", "setFrameColor", "Lcom/facebook/react/bridge/ReadableMap;", "frameSize", "setBarcodeFrameSize", "(Lcom/rncamerakit/e;Lcom/facebook/react/bridge/ReadableMap;)V", "path", "setOutputPath", "duration", "setShutterAnimationDuration", "(Lcom/rncamerakit/e;I)V", "setShutterPhotoSound", "value", "setScanThrottleDelay", "setRatioOverlay", "setRatioOverlayColor", "setResetFocusTimeout", "setResetFocusWhenMotionDetected", "setResizeMode", "setMaxPhotoQualityPrioritization", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "setContext", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CKCameraManager extends SimpleViewManager<e> {
    private ReactApplicationContext context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48971a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f48971a = iArr;
        }
    }

    public CKCameraManager(ReactApplicationContext context) {
        s.k(context, "context");
        this.context = context;
    }

    public final ReactApplicationContext getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapJ = jn.c.j("topOrientationChange", jn.c.d("registrationName", "onOrientationChange"), "topReadCode", jn.c.d("registrationName", "onReadCode"), "topPictureTaken", jn.c.d("registrationName", "onPictureTaken"), "topZoom", jn.c.d("registrationName", "onZoom"), "topError", jn.c.d("registrationName", "onError"), "captureButtonPressIn", jn.c.d("registrationName", "onCaptureButtonPressIn"), "captureButtonPressOut", jn.c.d("registrationName", "onCaptureButtonPressOut"));
        s.j(mapJ, "of(...)");
        return mapJ;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CKCamera";
    }

    @no.a(name = "barcodeFrameSize")
    public final void setBarcodeFrameSize(e view, ReadableMap frameSize) {
        s.k(view, "view");
        if (frameSize != null && frameSize.hasKey(Snapshot.WIDTH) && frameSize.hasKey(Snapshot.HEIGHT)) {
            view.setBarcodeFrameSize(new Size(frameSize.getInt(Snapshot.WIDTH), frameSize.getInt(Snapshot.HEIGHT)));
        }
    }

    @no.a(name = "cameraType")
    public final void setCameraType(e view, String type) {
        s.k(view, "view");
        if (type == null) {
            type = "back";
        }
        view.setCameraType(type);
    }

    public final void setContext(ReactApplicationContext reactApplicationContext) {
        s.k(reactApplicationContext, "<set-?>");
        this.context = reactApplicationContext;
    }

    @no.a(name = "flashMode")
    public final void setFlashMode(e view, String mode) {
        s.k(view, "view");
        view.setFlashMode(mode);
    }

    @no.a(name = "focusMode")
    public final void setFocusMode(e view, String mode) {
        s.k(view, "view");
        if (mode == null) {
            mode = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        view.setAutoFocus(mode);
    }

    @no.a(defaultInt = -16711936, name = "frameColor")
    public final void setFrameColor(e view, Integer color) {
        s.k(view, "view");
        view.setFrameColor(color != null ? color.intValue() : -16711936);
    }

    @no.a(defaultInt = -65536, name = "laserColor")
    public final void setLaserColor(e view, Integer color) {
        s.k(view, "view");
        view.setLaserColor(color != null ? color.intValue() : -65536);
    }

    public final void setMaxPhotoQualityPrioritization(e view, String value) {
    }

    @no.a(defaultDouble = 420.0d, name = "maxZoom")
    public final void setMaxZoom(e view, double factor) {
        s.k(view, "view");
        view.setMaxZoom(Double.valueOf(factor));
    }

    @no.a(name = "outputPath")
    public final void setOutputPath(e view, String path) {
        s.k(view, "view");
        if (path == null) {
            path = "";
        }
        view.setOutputPath(path);
    }

    public final void setRatioOverlay(e view, String value) {
    }

    public final void setRatioOverlayColor(e view, Integer value) {
    }

    public final void setResetFocusTimeout(e view, int value) {
    }

    public final void setResetFocusWhenMotionDetected(e view, boolean value) {
    }

    public final void setResizeMode(e view, String value) {
    }

    @no.a(name = "scanBarcode")
    public final void setScanBarcode(e view, boolean enabled) {
        s.k(view, "view");
        view.setScanBarcode(enabled);
    }

    @no.a(name = "scanThrottleDelay")
    public final void setScanThrottleDelay(e view, int value) {
        if (view != null) {
            view.setScanThrottleDelay(value);
        }
    }

    @no.a(name = "showFrame")
    public final void setShowFrame(e view, boolean enabled) {
        s.k(view, "view");
        view.setShowFrame(enabled);
    }

    @no.a(name = "shutterAnimationDuration")
    public final void setShutterAnimationDuration(e view, int duration) {
        s.k(view, "view");
        view.setShutterAnimationDuration(duration);
    }

    @no.a(name = "shutterPhotoSound")
    public final void setShutterPhotoSound(e view, boolean enabled) {
        s.k(view, "view");
        view.setShutterPhotoSound(enabled);
    }

    @no.a(name = "torchMode")
    public final void setTorchMode(e view, String mode) {
        s.k(view, "view");
        view.setTorchMode(mode);
    }

    @no.a(defaultDouble = t.SHEET_FIT_TO_CONTENTS, name = "zoom")
    public final void setZoom(e view, double factor) {
        s.k(view, "view");
        view.setZoom(factor == -1.0d ? null : Double.valueOf(factor));
    }

    @no.a(name = "zoomMode")
    public final void setZoomMode(e view, String mode) {
        s.k(view, "view");
        view.setZoomMode(mode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(v0 context) {
        s.k(context, "context");
        return new e(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e view, String commandId, ReadableArray args) {
        String str;
        s.k(view, "view");
        String str2 = "CameraManager received command " + commandId + "(";
        int size = args != null ? args.size() : 0;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                if (i11 > 0) {
                    str2 = str2 + ", ";
                }
                ReadableType type = args != null ? args.getType(0) : null;
                switch (type == null ? -1 : a.f48971a[type.ordinal()]) {
                    case 1:
                        str = "Null";
                        break;
                    case 2:
                        str = "Array";
                        break;
                    case 3:
                        str = "Boolean";
                        break;
                    case 4:
                        str = "Map";
                        break;
                    case 5:
                        str = "Number";
                        break;
                    case 6:
                        str = "String";
                        break;
                    default:
                        str = "";
                        break;
                }
                str2 = str2 + str;
                if (i11 != size) {
                    i11++;
                }
            }
        }
        Log.d("ReactNative", str2 + ")");
    }
}
