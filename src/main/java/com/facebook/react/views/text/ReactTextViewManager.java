package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import androidx.annotation.NonNull;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactTextViewManager.REACT_CLASS)
public class ReactTextViewManager extends ReactTextAnchorViewManager<h, f> implements com.facebook.react.uimanager.i {
    public static final String REACT_CLASS = "RCTText";
    private static final String TAG = "ReactTextViewManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected j mReactTextViewManagerCallback;

    public ReactTextViewManager() {
        this(null);
    }

    private Object getReactTextUpdate(h hVar, k0 k0Var, com.facebook.react.common.mapbuffer.a aVar) {
        com.facebook.react.common.mapbuffer.a aVarW0 = aVar.w0(0);
        com.facebook.react.common.mapbuffer.a aVarW1 = aVar.w0(1);
        Spannable spannableG = o.g(hVar.getContext(), aVarW0, null);
        hVar.setSpanned(spannableG);
        try {
            hVar.setMinimumFontSize((float) aVarW1.getDouble(6));
            return new g(spannableG, -1, false, o.j(aVarW0, spannableG, hVar.getGravityHorizontal()), m.m(aVarW1.getString(2)), m.h(k0Var, Build.VERSION.SDK_INT >= 26 ? hVar.getJustificationMode() : 0));
        } catch (IllegalArgumentException e11) {
            qk.a.o(TAG, "Paragraph Attributes: %s", aVarW1 != null ? aVarW1.toString() : "<empty>");
            throw e11;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(jn.c.e("topTextLayout", jn.c.d("registrationName", "onTextLayout"), "topInlineViewLayout", jn.c.d("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<f> getShadowNodeClass() {
        return f.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2, float[] fArr) {
        return o.n(context, aVar, aVar2, f11, pVar, f12, pVar2, null, fArr);
    }

    @Override // com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @no.a(name = "overflow")
    public void setOverflow(h hVar, String str) {
        hVar.setOverflow(str);
    }

    public ReactTextViewManager(j jVar) {
        if (tn.b.k()) {
            setupViewRecycling();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createShadowNodeInstance() {
        return new f(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(v0 v0Var) {
        return new h(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        super.onAfterUpdateTransaction(hVar);
        hVar.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public h prepareToRecycleView(@NonNull v0 v0Var, h hVar) {
        h hVar2 = (h) super.prepareToRecycleView(v0Var, hVar);
        if (hVar2 != null) {
            hVar2.i();
            setSelectionColor(hVar2, null);
        }
        return hVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(h hVar, int i11, int i12, int i13, int i14) {
        hVar.setPadding(i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(h hVar, Object obj) {
        sn.c cVar = new sn.c("ReactTextViewManager.updateExtraData");
        try {
            g gVar = (g) obj;
            Spannable text = gVar.getText();
            if (gVar.getContainsImages()) {
                ap.p.g(text, hVar);
            }
            hVar.setText(gVar);
            ap.f[] fVarArr = (ap.f[]) text.getSpans(0, gVar.getText().length(), ap.f.class);
            hVar.setTag(com.facebook.react.m.f22656f, fVarArr.length > 0 ? new i.a(fVarArr, text) : null);
            i.INSTANCE.a(hVar, hVar.isFocusable(), hVar.getImportantForAccessibility());
            cVar.close();
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(h hVar, k0 k0Var, u0 u0Var) {
        sn.c cVar = new sn.c("ReactTextViewManager.updateState");
        try {
            ReadableMapBuffer stateDataMapBuffer = u0Var.getStateDataMapBuffer();
            if (stateDataMapBuffer == null) {
                cVar.close();
                return null;
            }
            Object reactTextUpdate = getReactTextUpdate(hVar, k0Var, stateDataMapBuffer);
            cVar.close();
            return reactTextUpdate;
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(@NonNull h hVar) {
        i.INSTANCE.b(hVar, hVar.isFocusable(), hVar.getImportantForAccessibility());
    }

    public f createShadowNodeInstance(j jVar) {
        return new f(jVar);
    }
}
