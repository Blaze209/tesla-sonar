package vo;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface l0<T extends View> {
    void blur(T t11);

    void cancelSearch(T t11);

    void clearText(T t11);

    void focus(T t11);

    void setAllowToolbarIntegration(T t11, boolean z11);

    void setAutoCapitalize(T t11, String str);

    void setAutoFocus(T t11, boolean z11);

    void setBarTintColor(T t11, Integer num);

    void setCancelButtonText(T t11, String str);

    void setDisableBackButtonOverride(T t11, boolean z11);

    void setHeaderIconColor(T t11, Integer num);

    void setHideNavigationBar(T t11, String str);

    void setHideWhenScrolling(T t11, boolean z11);

    void setHintTextColor(T t11, Integer num);

    void setInputType(T t11, String str);

    void setObscureBackground(T t11, String str);

    void setPlaceholder(T t11, String str);

    void setPlacement(T t11, String str);

    void setShouldShowHintSearchIcon(T t11, boolean z11);

    void setText(T t11, String str);

    void setTextColor(T t11, Integer num);

    void setTintColor(T t11, Integer num);

    void toggleCancelButton(T t11, boolean z11);
}
