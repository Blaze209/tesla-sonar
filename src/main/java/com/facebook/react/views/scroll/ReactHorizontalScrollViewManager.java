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
import so.n;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<f> implements i.b<f> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
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
    public void setBorderColor(f fVar, int i11, Integer num) {
        com.facebook.react.uimanager.a.q(fVar, n.ALL, num);
    }

    @no.b(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(f fVar, int i11, float f11) {
        com.facebook.react.uimanager.a.r(fVar, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(f11, p.POINT));
    }

    @no.a(name = "borderStyle")
    public void setBorderStyle(f fVar, String str) {
        com.facebook.react.uimanager.a.s(fVar, str == null ? null : so.f.fromString(str));
    }

    @no.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(f fVar, int i11, float f11) {
        com.facebook.react.uimanager.a.t(fVar, n.values()[i11], Float.valueOf(f11));
    }

    @no.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(f fVar, int i11) {
        fVar.setEndFillColor(i11);
    }

    @no.a(name = "contentOffset")
    public void setContentOffset(f fVar, ReadableMap readableMap) {
        if (readableMap != null) {
            fVar.scrollTo((int) w.g(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) w.g(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            fVar.scrollTo(0, 0);
        }
    }

    @no.a(name = "decelerationRate")
    public void setDecelerationRate(f fVar, float f11) {
        fVar.setDecelerationRate(f11);
    }

    @no.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(f fVar, boolean z11) {
        fVar.setDisableIntervalMomentum(z11);
    }

    @no.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(f fVar, int i11) {
        if (i11 > 0) {
            fVar.setHorizontalFadingEdgeEnabled(true);
            fVar.setFadingEdgeLength(i11);
        } else {
            fVar.setHorizontalFadingEdgeEnabled(false);
            fVar.setFadingEdgeLength(0);
        }
    }

    @no.a(name = "horizontal")
    public void setHorizontal(f fVar, boolean z11) {
    }

    @no.a(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(f fVar, ReadableMap readableMap) {
        if (readableMap != null) {
            fVar.setMaintainVisibleContentPosition(b.C0459b.a(readableMap));
        } else {
            fVar.setMaintainVisibleContentPosition(null);
        }
    }

    @no.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(f fVar, boolean z11) {
        ViewCompat.D0(fVar, z11);
    }

    @no.a(name = "overScrollMode")
    public void setOverScrollMode(f fVar, String str) {
        fVar.setOverScrollMode(j.n(str));
    }

    @no.a(name = "overflow")
    public void setOverflow(f fVar, String str) {
        fVar.setOverflow(str);
    }

    @no.a(name = "pagingEnabled")
    public void setPagingEnabled(f fVar, boolean z11) {
        fVar.setPagingEnabled(z11);
    }

    @no.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(f fVar, boolean z11) {
        fVar.setScrollbarFadingEnabled(!z11);
    }

    @no.a(name = "pointerEvents")
    public void setPointerEvents(f fVar, String str) {
        fVar.setPointerEvents(x.parsePointerEvents(str));
    }

    @no.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(f fVar, boolean z11) {
        fVar.setRemoveClippedSubviews(z11);
    }

    @no.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(f fVar, boolean z11) {
        fVar.setScrollEnabled(z11);
    }

    @no.a(name = "scrollEventThrottle")
    public void setScrollEventThrottle(f fVar, int i11) {
        fVar.setScrollEventThrottle(i11);
    }

    @no.a(name = "scrollPerfTag")
    public void setScrollPerfTag(f fVar, String str) {
        fVar.setScrollPerfTag(str);
    }

    @no.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(f fVar, boolean z11) {
        fVar.setSendMomentumEvents(z11);
    }

    @no.a(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(f fVar, boolean z11) {
        fVar.setHorizontalScrollBarEnabled(z11);
    }

    @no.a(name = "snapToAlignment")
    public void setSnapToAlignment(f fVar, String str) {
        fVar.setSnapToAlignment(j.o(str));
    }

    @no.a(name = "snapToEnd")
    public void setSnapToEnd(f fVar, boolean z11) {
        fVar.setSnapToEnd(z11);
    }

    @no.a(name = "snapToInterval")
    public void setSnapToInterval(f fVar, float f11) {
        fVar.setSnapInterval((int) (f11 * w.c()));
    }

    @no.a(name = "snapToOffsets")
    public void setSnapToOffsets(f fVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            fVar.setSnapOffsets(null);
            return;
        }
        float fC = w.c();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i11) * ((double) fC))));
        }
        fVar.setSnapOffsets(arrayList);
    }

    @no.a(name = "snapToStart")
    public void setSnapToStart(f fVar, boolean z11) {
        fVar.setSnapToStart(z11);
    }

    public ReactHorizontalScrollViewManager(a aVar) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(v0 v0Var) {
        return new f(v0Var, null);
    }

    @Override // com.facebook.react.views.scroll.i.b
    public void flashScrollIndicators(f fVar) {
        fVar.s();
    }

    @Override // com.facebook.react.views.scroll.i.b
    public void scrollTo(f fVar, i.c cVar) {
        fVar.l();
        if (cVar.mAnimated) {
            fVar.b(cVar.mDestX, cVar.mDestY);
        } else {
            fVar.scrollTo(cVar.mDestX, cVar.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.i.b
    public void scrollToEnd(f fVar, i.d dVar) {
        View childAt = fVar.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int width = childAt.getWidth() + fVar.getPaddingRight();
        fVar.l();
        if (dVar.mAnimated) {
            fVar.b(width, fVar.getScrollY());
        } else {
            fVar.scrollTo(width, fVar.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(f fVar, k0 k0Var, u0 u0Var) {
        fVar.setStateWrapper(u0Var);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, int i11, ReadableArray readableArray) {
        i.b(this, fVar, i11, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, String str, ReadableArray readableArray) {
        i.c(this, fVar, str, readableArray);
    }
}
