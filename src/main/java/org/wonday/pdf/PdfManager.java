package org.wonday.pdf;

import android.content.Context;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.v0;
import vo.s;
import vo.t;

/* JADX INFO: loaded from: classes10.dex */
@xn.a(name = PdfManager.REACT_CLASS)
public class PdfManager extends SimpleViewManager<b> implements t<b> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String REACT_CLASS = "RNPDFPdfView";
    private Context context;
    private final l1<b> mDelegate = new s(this);
    private b pdfView;

    public PdfManager() {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<b> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // vo.t
    public void setShowsHorizontalScrollIndicator(b bVar, boolean z11) {
    }

    @Override // vo.t
    public void setShowsVerticalScrollIndicator(b bVar, boolean z11) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(v0 v0Var) {
        b bVar = new b(v0Var, null);
        this.pdfView = bVar;
        return bVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(b bVar) {
        super.onAfterUpdateTransaction(bVar);
        bVar.q0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(b bVar) {
        bVar.e0();
        this.pdfView = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull b bVar, String str, ReadableArray readableArray) {
        gn.a.c(bVar);
        if ("setNativePage".equals(str)) {
            gn.a.c(readableArray);
            setNativePage(bVar, readableArray.getInt(0));
        }
    }

    @Override // vo.t
    @no.a(name = "enableAnnotationRendering")
    public void setEnableAnnotationRendering(b bVar, boolean z11) {
        bVar.setEnableAnnotationRendering(z11);
    }

    @Override // vo.t
    @no.a(name = "enableAntialiasing")
    public void setEnableAntialiasing(b bVar, boolean z11) {
        bVar.setEnableAntialiasing(z11);
    }

    @Override // vo.t
    @no.a(name = "enableDoubleTapZoom")
    public void setEnableDoubleTapZoom(b bVar, boolean z11) {
        bVar.setEnableDoubleTapZoom(z11);
    }

    @Override // vo.t
    @no.a(name = "enablePaging")
    public void setEnablePaging(b bVar, boolean z11) {
        bVar.setEnablePaging(z11);
    }

    @Override // vo.t
    @no.a(name = "enableRTL")
    public void setEnableRTL(b bVar, boolean z11) {
        this.pdfView.setEnableRTL(z11);
    }

    @Override // vo.t
    @no.a(name = "fitPolicy")
    public void setFitPolicy(b bVar, int i11) {
        bVar.setFitPolicy(i11);
    }

    @Override // vo.t
    @no.a(name = "horizontal")
    public void setHorizontal(b bVar, boolean z11) {
        bVar.setHorizontal(z11);
    }

    @Override // vo.t
    @no.a(name = "maxScale")
    public void setMaxScale(b bVar, float f11) {
        bVar.setMaxScale(f11);
    }

    @Override // vo.t
    @no.a(name = "minScale")
    public void setMinScale(b bVar, float f11) {
        bVar.setMinScale(f11);
    }

    @Override // vo.t
    public void setNativePage(b bVar, int i11) {
        this.pdfView.setPage(i11);
    }

    @Override // vo.t
    @no.a(name = "page")
    public void setPage(b bVar, int i11) {
        bVar.setPage(i11);
    }

    @Override // vo.t
    @no.a(name = "password")
    public void setPassword(b bVar, String str) {
        bVar.setPassword(str);
    }

    @Override // vo.t
    @no.a(name = "path")
    public void setPath(b bVar, String str) {
        bVar.setPath(str);
    }

    @Override // vo.t
    @no.a(name = "scale")
    public void setScale(b bVar, float f11) {
        bVar.setScale(f11);
    }

    @Override // vo.t
    @no.a(name = "scrollEnabled")
    public void setScrollEnabled(b bVar, boolean z11) {
        this.pdfView.setScrollEnabled(z11);
    }

    @Override // vo.t
    @no.a(name = "singlePage")
    public void setSinglePage(b bVar, boolean z11) {
        bVar.setSinglePage(z11);
    }

    @Override // vo.t
    @no.a(name = "spacing")
    public void setSpacing(b bVar, int i11) {
        bVar.setSpacing(i11);
    }

    public PdfManager(ReactApplicationContext reactApplicationContext) {
        this.context = reactApplicationContext;
    }
}
