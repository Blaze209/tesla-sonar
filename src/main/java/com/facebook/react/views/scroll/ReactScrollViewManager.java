package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.x;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import so.n;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactScrollViewManager.REACT_CLASS)
public class ReactScrollViewManager extends ViewGroupManager<g> implements i.b<g> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return jn.c.a().b(l.getJSEventName(l.SCROLL), jn.c.d("registrationName", "onScroll")).b(l.getJSEventName(l.BEGIN_DRAG), jn.c.d("registrationName", "onScrollBeginDrag")).b(l.getJSEventName(l.END_DRAG), jn.c.d("registrationName", "onScrollEndDrag")).b(l.getJSEventName(l.MOMENTUM_BEGIN), jn.c.d("registrationName", "onMomentumScrollBegin")).b(l.getJSEventName(l.MOMENTUM_END), jn.c.d("registrationName", "onMomentumScrollEnd")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return i.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(g gVar, int i11, Integer num) {
        com.facebook.react.uimanager.a.q(gVar, n.ALL, num);
    }

    @no.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(g gVar, int i11, float f11) {
        com.facebook.react.uimanager.a.r(gVar, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(f11, p.POINT));
    }

    @no.a(name = "borderStyle")
    public void setBorderStyle(g gVar, String str) {
        com.facebook.react.uimanager.a.s(gVar, str == null ? null : so.f.fromString(str));
    }

    @no.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(g gVar, int i11, float f11) {
        com.facebook.react.uimanager.a.t(gVar, n.values()[i11], Float.valueOf(f11));
    }

    @no.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(g gVar, int i11) {
        gVar.setEndFillColor(i11);
    }

    @no.a(customType = "Point", name = "contentOffset")
    public void setContentOffset(g gVar, ReadableMap readableMap) {
        gVar.setContentOffset(readableMap);
    }

    @no.a(name = "decelerationRate")
    public void setDecelerationRate(g gVar, float f11) {
        gVar.setDecelerationRate(f11);
    }

    @no.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(g gVar, boolean z11) {
        gVar.setDisableIntervalMomentum(z11);
    }

    @no.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(g gVar, int i11) {
        if (i11 > 0) {
            gVar.setVerticalFadingEdgeEnabled(true);
            gVar.setFadingEdgeLength(i11);
        } else {
            gVar.setVerticalFadingEdgeEnabled(false);
            gVar.setFadingEdgeLength(0);
        }
    }

    @no.a(name = "horizontal")
    public void setHorizontal(g gVar, boolean z11) {
    }

    @no.a(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(g gVar, boolean z11) {
        if (z11) {
            gVar.setVerticalScrollbarPosition(1);
        } else {
            gVar.setVerticalScrollbarPosition(0);
        }
    }

    @no.a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(g gVar, ReadableMap readableMap) {
        if (readableMap != null) {
            gVar.setMaintainVisibleContentPosition(b.C0459b.a(readableMap));
        } else {
            gVar.setMaintainVisibleContentPosition(null);
        }
    }

    @no.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(g gVar, boolean z11) {
        ViewCompat.D0(gVar, z11);
    }

    @no.a(name = "overScrollMode")
    public void setOverScrollMode(g gVar, String str) {
        gVar.setOverScrollMode(j.n(str));
    }

    @no.a(name = "overflow")
    public void setOverflow(g gVar, String str) {
        gVar.setOverflow(str);
    }

    @no.a(name = "pagingEnabled")
    public void setPagingEnabled(g gVar, boolean z11) {
        gVar.setPagingEnabled(z11);
    }

    @no.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(g gVar, boolean z11) {
        gVar.setScrollbarFadingEnabled(!z11);
    }

    @no.a(name = "pointerEvents")
    public void setPointerEvents(g gVar, String str) {
        gVar.setPointerEvents(x.parsePointerEvents(str));
    }

    @no.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(g gVar, boolean z11) {
        gVar.setRemoveClippedSubviews(z11);
    }

    @no.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(g gVar, boolean z11) {
        gVar.setScrollEnabled(z11);
        gVar.setFocusable(z11);
    }

    @no.a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(g gVar, int i11) {
        gVar.setScrollEventThrottle(i11);
    }

    @no.a(name = "scrollPerfTag")
    public void setScrollPerfTag(g gVar, String str) {
        gVar.setScrollPerfTag(str);
    }

    @no.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(g gVar, boolean z11) {
        gVar.setSendMomentumEvents(z11);
    }

    @no.a(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(g gVar, boolean z11) {
        gVar.setVerticalScrollBarEnabled(z11);
    }

    @no.a(name = "snapToAlignment")
    public void setSnapToAlignment(g gVar, String str) {
        gVar.setSnapToAlignment(j.o(str));
    }

    @no.a(name = "snapToEnd")
    public void setSnapToEnd(g gVar, boolean z11) {
        gVar.setSnapToEnd(z11);
    }

    @no.a(name = "snapToInterval")
    public void setSnapToInterval(g gVar, float f11) {
        gVar.setSnapInterval((int) (f11 * w.c()));
    }

    @no.a(name = "snapToOffsets")
    public void setSnapToOffsets(g gVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            gVar.setSnapOffsets(null);
            return;
        }
        float fC = w.c();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i11) * ((double) fC))));
        }
        gVar.setSnapOffsets(arrayList);
    }

    @no.a(name = "snapToStart")
    public void setSnapToStart(g gVar, boolean z11) {
        gVar.setSnapToStart(z11);
    }

    public ReactScrollViewManager(a aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(v0 v0Var) {
        return new g(v0Var, null);
    }

    @Override // com.facebook.react.views.scroll.i.b
    public void flashScrollIndicators(g gVar) {
        gVar.q();
    }

    @Override // com.facebook.react.views.scroll.i.b
    public void scrollTo(g gVar, i.c cVar) {
        gVar.l();
        if (cVar.mAnimated) {
            gVar.b(cVar.mDestX, cVar.mDestY);
        } else {
            gVar.scrollTo(cVar.mDestX, cVar.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.i.b
    public void scrollToEnd(g gVar, i.d dVar) {
        View childAt = gVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + gVar.getPaddingBottom();
        gVar.l();
        if (dVar.mAnimated) {
            gVar.b(gVar.getScrollX(), height);
        } else {
            gVar.scrollTo(gVar.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(g gVar, k0 k0Var, u0 u0Var) {
        gVar.setStateWrapper(u0Var);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, int i11, ReadableArray readableArray) {
        i.b(this, gVar, i11, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, String str, ReadableArray readableArray) {
        i.c(this, gVar, str, readableArray);
    }
}
