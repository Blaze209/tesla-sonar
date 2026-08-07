package com.facebook.react.uimanager;

import com.facebook.react.uimanager.i0;
import com.facebook.yoga.YogaValue;

/* JADX INFO: loaded from: classes4.dex */
public interface i0<T extends i0> {
    void addChildAt(T t11, int i11);

    void addNativeChildAt(T t11, int i11);

    void calculateLayout();

    void calculateLayout(float f11, float f12);

    Iterable<? extends i0> calculateLayoutOnChildren();

    void dirty();

    void dispatchUpdates(float f11, float f12, h1 h1Var, u uVar);

    boolean dispatchUpdatesWillChangeLayout(float f11, float f12);

    void dispose();

    T getChildAt(int i11);

    int getChildCount();

    Integer getHeightMeasureSpec();

    com.facebook.yoga.h getLayoutDirection();

    float getLayoutHeight();

    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    s getNativeKind();

    int getNativeOffsetForChild(T t11);

    T getNativeParent();

    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStyleWidth();

    v0 getThemedContext();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasUpdates();

    int indexOf(T t11);

    int indexOfNativeChild(T t11);

    boolean isDescendantOf(T t11);

    boolean isLayoutOnly();

    boolean isVirtual();

    void markUpdateSeen();

    void onBeforeLayout(u uVar);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i11);

    T removeNativeChildAt(int i11);

    void setIsLayoutOnly(boolean z11);

    void setLayoutDirection(com.facebook.yoga.h hVar);

    void setLayoutParent(T t11);

    void setLocalData(Object obj);

    void setMeasureSpecs(int i11, int i12);

    void setPadding(int i11, float f11);

    void setReactTag(int i11);

    void setRootTag(int i11);

    void setStyleHeight(float f11);

    void setStyleWidth(float f11);

    void setThemedContext(v0 v0Var);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(k0 k0Var);
}
