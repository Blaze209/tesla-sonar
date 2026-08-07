package vo;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public interface g0<T extends View> {
    void setBackButtonDisplayMode(T t11, String str);

    void setBackButtonInCustomView(T t11, boolean z11);

    void setBackTitle(T t11, String str);

    void setBackTitleFontFamily(T t11, String str);

    void setBackTitleFontSize(T t11, int i11);

    void setBackTitleVisible(T t11, boolean z11);

    void setBackgroundColor(T t11, Integer num);

    void setBlurEffect(T t11, String str);

    void setColor(T t11, Integer num);

    void setDirection(T t11, String str);

    void setDisableBackButtonMenu(T t11, boolean z11);

    void setHeaderLeftBarButtonItems(T t11, ReadableArray readableArray);

    void setHeaderRightBarButtonItems(T t11, ReadableArray readableArray);

    void setHidden(T t11, boolean z11);

    void setHideBackButton(T t11, boolean z11);

    void setHideShadow(T t11, boolean z11);

    void setLargeTitle(T t11, boolean z11);

    void setLargeTitleBackgroundColor(T t11, Integer num);

    void setLargeTitleColor(T t11, Integer num);

    void setLargeTitleFontFamily(T t11, String str);

    void setLargeTitleFontSize(T t11, int i11);

    void setLargeTitleFontWeight(T t11, String str);

    void setLargeTitleHideShadow(T t11, boolean z11);

    void setTitle(T t11, String str);

    void setTitleColor(T t11, Integer num);

    void setTitleFontFamily(T t11, String str);

    void setTitleFontSize(T t11, int i11);

    void setTitleFontWeight(T t11, String str);

    void setTopInsetEnabled(T t11, boolean z11);

    void setTranslucent(T t11, boolean z11);
}
