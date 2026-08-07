package com.reactnativecommunity.webview;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class RNCWebViewManager extends ViewGroupManager<o> {
    private final j mRNCWebViewManagerImpl = new j();

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.g();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = jn.c.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", jn.c.d("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", jn.c.d("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", jn.c.d("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topLoadingSubResourceError", jn.c.d("registrationName", "onLoadingSubResourceError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", jn.c.d("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", jn.c.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", jn.c.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(com.facebook.react.views.scroll.l.getJSEventName(com.facebook.react.views.scroll.l.SCROLL), jn.c.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", jn.c.d("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", jn.c.d("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", jn.c.d("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", jn.c.d("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "allowFileAccess")
    public void setAllowFileAccess(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.o(oVar, z11);
    }

    @no.a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.p(oVar, z11);
    }

    @no.a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.q(oVar, z11);
    }

    @no.a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.r(oVar, z11);
    }

    @no.a(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.s(oVar, z11);
    }

    @no.a(name = "androidLayerType")
    public void setAndroidLayerType(o oVar, String str) {
        this.mRNCWebViewManagerImpl.t(oVar, str);
    }

    @no.a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.u(oVar, str);
    }

    @no.a(name = "basicAuthCredential")
    public void setBasicAuthCredential(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.v(oVar, readableMap);
    }

    @no.a(name = "cacheEnabled")
    public void setCacheEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.w(oVar, z11);
    }

    @no.a(name = "cacheMode")
    public void setCacheMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.x(oVar, str);
    }

    @no.a(name = "domStorageEnabled")
    public void setDomStorageEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.y(oVar, z11);
    }

    @no.a(name = "downloadingMessage")
    public void setDownloadingMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.z(str);
    }

    @no.a(name = "forceDarkOn")
    public void setForceDarkOn(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.A(oVar, z11);
    }

    @no.a(name = "geolocationEnabled")
    public void setGeolocationEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.B(oVar, z11);
    }

    @no.a(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.C(oVar, z11);
    }

    @no.a(name = "hasOnScroll")
    public void setHasOnScroll(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.D(oVar, z11);
    }

    @no.a(name = "incognito")
    public void setIncognito(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.E(oVar, z11);
    }

    @no.a(name = "injectedJavaScript")
    public void setInjectedJavaScript(o oVar, String str) {
        this.mRNCWebViewManagerImpl.F(oVar, str);
    }

    @no.a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(o oVar, String str) {
        this.mRNCWebViewManagerImpl.G(oVar, str);
    }

    @no.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.H(oVar, z11);
    }

    @no.a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.I(oVar, z11);
    }

    @no.a(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(o oVar, String str) {
        this.mRNCWebViewManagerImpl.J(oVar, str);
    }

    @no.a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.K(oVar, z11);
    }

    @no.a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.L(oVar, z11);
    }

    @no.a(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(o oVar, String str) {
        this.mRNCWebViewManagerImpl.M(str);
    }

    @no.a(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.N(oVar, z11);
    }

    @no.a(name = "menuItems")
    public void setMenuCustomItems(o oVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.O(oVar, readableArray);
    }

    @no.a(name = "messagingEnabled")
    public void setMessagingEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.P(oVar, z11);
    }

    @no.a(name = "messagingModuleName")
    public void setMessagingModuleName(o oVar, String str) {
        this.mRNCWebViewManagerImpl.Q(oVar, str);
    }

    @no.a(name = "minimumFontSize")
    public void setMinimumFontSize(o oVar, int i11) {
        this.mRNCWebViewManagerImpl.R(oVar, i11);
    }

    @no.a(name = "mixedContentMode")
    public void setMixedContentMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.S(oVar, str);
    }

    @no.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.T(oVar, z11);
    }

    @no.a(name = "overScrollMode")
    public void setOverScrollMode(o oVar, String str) {
        this.mRNCWebViewManagerImpl.U(oVar, str);
    }

    @no.a(name = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.V(oVar, z11);
    }

    @no.a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.W(oVar, z11);
    }

    @no.a(name = "scalesPageToFit")
    public void setScalesPageToFit(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.X(oVar, z11);
    }

    @no.a(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.Y(oVar, z11);
    }

    @no.a(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.Z(oVar, z11);
    }

    @no.a(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.a0(oVar, z11);
    }

    @no.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.b0(oVar, z11);
    }

    @no.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.c0(oVar, z11);
    }

    @no.a(name = "source")
    public void setSource(o oVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.d0(oVar, readableMap);
    }

    @no.a(name = "textZoom")
    public void setTextZoom(o oVar, int i11) {
        this.mRNCWebViewManagerImpl.e0(oVar, i11);
    }

    @no.a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.f0(oVar, z11);
    }

    @no.a(name = "userAgent")
    public void setUserAgent(o oVar, String str) {
        this.mRNCWebViewManagerImpl.g0(oVar, str);
    }

    @no.a(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(o oVar, boolean z11) {
        this.mRNCWebViewManagerImpl.i0(oVar, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull v0 v0Var, o oVar) {
        oVar.getWebView().setWebViewClient(new f());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(v0 v0Var) {
        return this.mRNCWebViewManagerImpl.d(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull o oVar) {
        super.onAfterUpdateTransaction(oVar);
        this.mRNCWebViewManagerImpl.l(oVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull o oVar) {
        this.mRNCWebViewManagerImpl.m(oVar);
        super.onDropViewInstance(oVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull o oVar, String str, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.n(oVar, str, readableArray);
        super.receiveCommand(oVar, str, readableArray);
    }

    public o createViewInstance(v0 v0Var, d dVar) {
        return this.mRNCWebViewManagerImpl.e(v0Var, dVar);
    }
}
