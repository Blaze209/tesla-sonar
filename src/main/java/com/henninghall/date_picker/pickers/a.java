package com.henninghall.date_picker.pickers;

import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: com.henninghall.date_picker.pickers.a$a, reason: collision with other inner class name */
    public interface InterfaceC0708a {
        void a();

        void b();
    }

    public interface b {
        void a(a aVar, int i11, int i12);
    }

    boolean a();

    void b(int i11, boolean z11);

    void c(int i11);

    String[] getDisplayedValues();

    int getMaxValue();

    int getValue();

    View getView();

    boolean getWrapSelectorWheel();

    void setDisplayedValues(String[] strArr);

    void setDividerHeight(int i11);

    void setItemPaddingHorizontal(int i11);

    void setMaxValue(int i11);

    void setMinValue(int i11);

    void setOnValueChangeListenerInScrolling(b bVar);

    void setOnValueChangedListener(InterfaceC0708a interfaceC0708a);

    void setShownCount(int i11);

    void setTextAlign(Paint.Align align);

    void setTextColor(String str);

    void setValue(int i11);

    void setVisibility(int i11);

    void setWrapSelectorWheel(boolean z11);
}
