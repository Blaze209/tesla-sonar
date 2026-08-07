package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;", "", "<init>", "()V", "componentNames", "", "", "getFabricComponentName", "componentName", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FabricNameComponentMapping {
    public static final FabricNameComponentMapping INSTANCE = new FabricNameComponentMapping();
    private static final Map<String, String> componentNames = v0.m(x.a("View", ReactViewManager.REACT_CLASS), x.a("Image", ReactImageManager.REACT_CLASS), x.a("ScrollView", ReactScrollViewManager.REACT_CLASS), x.a("Slider", "RCTSlider"), x.a("ModalHostView", ReactModalHostManager.REACT_CLASS), x.a("Paragraph", ReactTextViewManager.REACT_CLASS), x.a("Text", ReactTextViewManager.REACT_CLASS), x.a("RawText", ReactRawTextManager.REACT_CLASS), x.a("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), x.a("ShimmeringView", "RKShimmeringView"), x.a("TemplateView", "RCTTemplateView"), x.a("AxialGradientView", "RCTAxialGradientView"), x.a("Video", "RCTVideo"), x.a("Map", "RCTMap"), x.a("WebView", "RCTWebView"), x.a("Keyframes", "RCTKeyframes"), x.a("ImpressionTrackingView", "RCTImpressionTrackingView"));

    private FabricNameComponentMapping() {
    }

    public static final String getFabricComponentName(String componentName) {
        s.k(componentName, "componentName");
        String str = componentNames.get(componentName);
        return str == null ? componentName : str;
    }
}
