package vo;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public interface x<T extends View> {
    void setBadgeValue(T t11, String str);

    void setBottomScrollEdgeEffect(T t11, String str);

    void setDrawableIconResourceName(T t11, String str);

    void setIconImageSource(T t11, ReadableMap readableMap);

    void setIconSfSymbolName(T t11, String str);

    void setIconType(T t11, String str);

    void setImageIconResource(T t11, ReadableMap readableMap);

    void setIsFocused(T t11, boolean z11);

    void setLeftScrollEdgeEffect(T t11, String str);

    void setOrientation(T t11, String str);

    void setOverrideScrollViewContentInsetAdjustmentBehavior(T t11, boolean z11);

    void setRightScrollEdgeEffect(T t11, String str);

    void setScrollEdgeAppearance(T t11, Dynamic dynamic);

    void setSelectedIconImageSource(T t11, ReadableMap readableMap);

    void setSelectedIconSfSymbolName(T t11, String str);

    void setSpecialEffects(T t11, ReadableMap readableMap);

    void setStandardAppearance(T t11, Dynamic dynamic);

    void setSystemItem(T t11, String str);

    void setTabBarItemBadgeBackgroundColor(T t11, Integer num);

    void setTabBarItemBadgeTextColor(T t11, Integer num);

    void setTabKey(T t11, String str);

    void setTitle(T t11, String str);

    void setTopScrollEdgeEffect(T t11, String str);
}
