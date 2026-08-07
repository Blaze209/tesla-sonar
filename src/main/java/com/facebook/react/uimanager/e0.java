package com.facebook.react.uimanager;

import android.graphics.Rect;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/e0;", "Lcom/facebook/react/uimanager/d0;", "", "left", "top", "right", "bottom", "Ljn0/h0;", "setOverflowInset", "(IIII)V", "Landroid/graphics/Rect;", "getOverflowInset", "()Landroid/graphics/Rect;", "overflowInset", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface e0 extends d0 {
    Rect getOverflowInset();

    void setOverflowInset(int left, int top, int right, int bottom);
}
