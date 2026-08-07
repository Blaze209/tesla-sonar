package com.facebook.react.fabric;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012JX\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b \u0010!JG\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0096 ¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u0014\u0010.\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000f¨\u00061"}, d2 = {"Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "Lcom/facebook/jni/HybridClassBase;", "Lrn/b;", "", "moduleName", "<init>", "(Ljava/lang/String;)V", "", "surfaceId", "Ljn0/h0;", "initHybrid", "(ILjava/lang/String;)V", "_getSurfaceId", "()I", "_getModuleName", "()Ljava/lang/String;", "", "_isRunning", "()Z", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "offsetX", "offsetY", "doLeftAndRightSwapInRTL", "isRTL", "pixelDensity", "setLayoutConstraintsNative", "(FFFFFFZZF)V", "mode", "setDisplayMode", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "setLayoutConstraints", "(IIIIZZF)V", "Lcom/facebook/react/bridge/NativeMap;", "props", "setProps", "(Lcom/facebook/react/bridge/NativeMap;)V", "mountable", "setMountable", "(Z)V", "getSurfaceId", "isRunning", "getModuleName", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SurfaceHandlerBinding extends HybridClassBase implements rn.b {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DISPLAY_MODE_HIDDEN = 2;

    @Deprecated
    public static final int DISPLAY_MODE_SUSPENDED = 1;

    @Deprecated
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/fabric/SurfaceHandlerBinding$Companion;", "", "<init>", "()V", "NO_SURFACE_ID", "", "DISPLAY_MODE_VISIBLE", "DISPLAY_MODE_SUSPENDED", "DISPLAY_MODE_HIDDEN", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String moduleName) {
        s.k(moduleName, "moduleName");
        initHybrid(0, moduleName);
    }

    private final native String _getModuleName();

    private final native int _getSurfaceId();

    private final native boolean _isRunning();

    private final native void initHybrid(int surfaceId, String moduleName);

    private final native void setDisplayMode(int mode);

    private final native void setLayoutConstraintsNative(float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean doLeftAndRightSwapInRTL, boolean isRTL, float pixelDensity);

    @Override // rn.b
    public String getModuleName() {
        return _getModuleName();
    }

    @Override // rn.b
    public int getSurfaceId() {
        return _getSurfaceId();
    }

    @Override // rn.b
    public boolean isRunning() {
        return _isRunning();
    }

    @Override // rn.b
    public void setLayoutConstraints(int widthMeasureSpec, int heightMeasureSpec, int offsetX, int offsetY, boolean doLeftAndRightSwapInRTL, boolean isRTL, float pixelDensity) {
        LayoutMetricsConversions.Companion companion = LayoutMetricsConversions.INSTANCE;
        setLayoutConstraintsNative(companion.getMinSize(widthMeasureSpec) / pixelDensity, companion.getMaxSize(widthMeasureSpec) / pixelDensity, companion.getMinSize(heightMeasureSpec) / pixelDensity, companion.getMaxSize(heightMeasureSpec) / pixelDensity, offsetX / pixelDensity, offsetY / pixelDensity, doLeftAndRightSwapInRTL, isRTL, pixelDensity);
    }

    @Override // rn.b
    public void setMountable(boolean mountable) {
        setDisplayMode(!mountable ? 1 : 0);
    }

    @Override // rn.b
    public native void setProps(NativeMap props);
}
