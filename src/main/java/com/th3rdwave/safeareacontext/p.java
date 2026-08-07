package com.th3rdwave.safeareacontext;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.u1;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/th3rdwave/safeareacontext/p;", "Lcom/facebook/react/uimanager/m;", "<init>", "()V", "Ljn0/h0;", "updateInsets", "Lcom/th3rdwave/safeareacontext/l;", "edgeMode", "", "insetValue", "edgeValue", "b", "(Lcom/th3rdwave/safeareacontext/l;FF)F", "Lcom/th3rdwave/safeareacontext/o;", "mode", "c", "(Lcom/th3rdwave/safeareacontext/o;)V", "Lcom/facebook/react/uimanager/u;", "nativeViewHierarchyOptimizer", "onBeforeLayout", "(Lcom/facebook/react/uimanager/u;)V", "", "data", "setLocalData", "(Ljava/lang/Object;)V", "", "index", "Lcom/facebook/react/bridge/Dynamic;", "padding", "setPaddings", "(ILcom/facebook/react/bridge/Dynamic;)V", "margin", "setMargins", "Lcom/th3rdwave/safeareacontext/n;", "a", "Lcom/th3rdwave/safeareacontext/n;", "mLocalData", "", "[F", "mPaddings", "mMargins", "", DateTokenConverter.CONVERTER_KEY, "Z", "mNeedsUpdate", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends com.facebook.react.uimanager.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SafeAreaViewLocalData mLocalData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] mPaddings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float[] mMargins;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean mNeedsUpdate;

    public p() {
        int[] iArr = u1.PADDING_MARGIN_SPACING_TYPES;
        this.mPaddings = new float[iArr.length];
        this.mMargins = new float[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.mPaddings[i11] = Float.NaN;
            this.mMargins[i11] = Float.NaN;
        }
    }

    private final float b(l edgeMode, float insetValue, float edgeValue) {
        if (edgeMode == l.OFF) {
            return edgeValue;
        }
        return edgeMode == l.MAXIMUM ? Math.max(insetValue, edgeValue) : insetValue + edgeValue;
    }

    private final void c(o mode) {
        if (mode == o.PADDING) {
            super.setPadding(1, this.mPaddings[1]);
            super.setPadding(2, this.mPaddings[2]);
            super.setPadding(3, this.mPaddings[3]);
            super.setPadding(0, this.mPaddings[0]);
        } else {
            super.setMargin(1, this.mMargins[1]);
            super.setMargin(2, this.mMargins[2]);
            super.setMargin(3, this.mMargins[3]);
            super.setMargin(0, this.mMargins[0]);
        }
        markUpdated();
    }

    private final void updateInsets() {
        SafeAreaViewLocalData safeAreaViewLocalData = this.mLocalData;
        if (safeAreaViewLocalData == null) {
            return;
        }
        o mode = safeAreaViewLocalData.getMode();
        o oVar = o.PADDING;
        float[] fArr = mode == oVar ? this.mPaddings : this.mMargins;
        float f11 = fArr[8];
        if (Float.isNaN(f11)) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        float f12 = f11;
        float f13 = f12;
        float f14 = f13;
        float f15 = fArr[7];
        if (!Float.isNaN(f15)) {
            f11 = f15;
            f13 = f11;
        }
        float f16 = fArr[6];
        if (!Float.isNaN(f16)) {
            f12 = f16;
            f14 = f12;
        }
        float f17 = fArr[1];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = fArr[2];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = fArr[3];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float f21 = fArr[0];
        if (!Float.isNaN(f21)) {
            f14 = f21;
        }
        float fH = w.h(f11);
        float fH2 = w.h(f12);
        float fH3 = w.h(f13);
        float fH4 = w.h(f14);
        SafeAreaViewEdges edges = safeAreaViewLocalData.getEdges();
        EdgeInsets insets = safeAreaViewLocalData.getInsets();
        if (safeAreaViewLocalData.getMode() == oVar) {
            super.setPadding(1, b(edges.getTop(), insets.getTop(), fH));
            super.setPadding(2, b(edges.getRight(), insets.getRight(), fH2));
            super.setPadding(3, b(edges.getBottom(), insets.getBottom(), fH3));
            super.setPadding(0, b(edges.getLeft(), insets.getLeft(), fH4));
            return;
        }
        super.setMargin(1, b(edges.getTop(), insets.getTop(), fH));
        super.setMargin(2, b(edges.getRight(), insets.getRight(), fH2));
        super.setMargin(3, b(edges.getBottom(), insets.getBottom(), fH3));
        super.setMargin(0, b(edges.getLeft(), insets.getLeft(), fH4));
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void onBeforeLayout(u nativeViewHierarchyOptimizer) {
        s.k(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.mNeedsUpdate) {
            this.mNeedsUpdate = false;
            updateInsets();
        }
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void setLocalData(Object data) {
        s.k(data, "data");
        if (data instanceof SafeAreaViewLocalData) {
            SafeAreaViewLocalData safeAreaViewLocalData = this.mLocalData;
            if (safeAreaViewLocalData != null && safeAreaViewLocalData.getMode() != ((SafeAreaViewLocalData) data).getMode()) {
                c(safeAreaViewLocalData.getMode());
            }
            this.mLocalData = (SafeAreaViewLocalData) data;
            this.mNeedsUpdate = false;
            updateInsets();
        }
    }

    @Override // com.facebook.react.uimanager.m
    @no.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int index, Dynamic margin) {
        s.k(margin, "margin");
        this.mMargins[u1.PADDING_MARGIN_SPACING_TYPES[index]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(index, margin);
        this.mNeedsUpdate = true;
    }

    @Override // com.facebook.react.uimanager.m
    @no.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int index, Dynamic padding) {
        s.k(padding, "padding");
        this.mPaddings[u1.PADDING_MARGIN_SPACING_TYPES[index]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(index, padding);
        this.mNeedsUpdate = true;
    }
}
