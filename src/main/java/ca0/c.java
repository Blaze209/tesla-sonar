package ca0;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.u1;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.rnscreens.safearea.EdgeInsets;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lca0/c;", "Lcom/facebook/react/uimanager/m;", "<init>", "()V", "Ljn0/h0;", "updateInsets", "", "edgeMode", "", "insetValue", "edgeValue", "getEdgeValue", "(ZFF)F", "Lcom/facebook/react/uimanager/u;", "nativeViewHierarchyOptimizer", "onBeforeLayout", "(Lcom/facebook/react/uimanager/u;)V", "", "data", "setLocalData", "(Ljava/lang/Object;)V", "", "index", "Lcom/facebook/react/bridge/Dynamic;", "margin", "setMargins", "(ILcom/facebook/react/bridge/Dynamic;)V", "Lca0/b;", "localData", "Lca0/b;", "", "margins", "[F", "needsUpdate", "Z", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends m {
    private SafeAreaViewLocalData localData;
    private final float[] margins;
    private boolean needsUpdate;

    public c() {
        int[] iArr = u1.PADDING_MARGIN_SPACING_TYPES;
        this.margins = new float[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.margins[i11] = Float.NaN;
        }
    }

    private final float getEdgeValue(boolean edgeMode, float insetValue, float edgeValue) {
        return edgeMode ? insetValue + edgeValue : edgeValue;
    }

    private final void updateInsets() {
        SafeAreaViewLocalData safeAreaViewLocalData = this.localData;
        if (safeAreaViewLocalData == null) {
            return;
        }
        float f11 = this.margins[8];
        if (Float.isNaN(f11)) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        float f12 = f11;
        float f13 = f12;
        float f14 = f13;
        float f15 = this.margins[7];
        if (!Float.isNaN(f15)) {
            f12 = f15;
            f14 = f12;
        }
        float f16 = this.margins[6];
        if (!Float.isNaN(f16)) {
            f11 = f16;
            f13 = f11;
        }
        float f17 = this.margins[0];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = this.margins[1];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = this.margins[2];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float f21 = this.margins[3];
        if (!Float.isNaN(f21)) {
            f14 = f21;
        }
        float fH = w.h(f11);
        float fH2 = w.h(f12);
        float fH3 = w.h(f13);
        float fH4 = w.h(f14);
        SafeAreaViewEdges edges = safeAreaViewLocalData.getEdges();
        EdgeInsets insets = safeAreaViewLocalData.getInsets();
        super.setMargin(0, getEdgeValue(edges.getLeft(), insets.getLeft(), fH));
        super.setMargin(1, getEdgeValue(edges.getTop(), insets.getTop(), fH2));
        super.setMargin(2, getEdgeValue(edges.getRight(), insets.getRight(), fH3));
        super.setMargin(3, getEdgeValue(edges.getBottom(), insets.getBottom(), fH4));
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void onBeforeLayout(u nativeViewHierarchyOptimizer) {
        s.k(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.needsUpdate) {
            this.needsUpdate = false;
            updateInsets();
        }
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void setLocalData(Object data) {
        s.k(data, "data");
        if (data instanceof SafeAreaViewLocalData) {
            this.localData = (SafeAreaViewLocalData) data;
            this.needsUpdate = false;
            updateInsets();
        }
    }

    @Override // com.facebook.react.uimanager.m
    @no.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int index, Dynamic margin) {
        s.k(margin, "margin");
        this.margins[u1.PADDING_MARGIN_SPACING_TYPES[index]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(index, margin);
        this.needsUpdate = true;
    }
}
