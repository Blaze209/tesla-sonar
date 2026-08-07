package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.henninghall.date_picker.m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidNative extends NumberPicker implements com.henninghall.date_picker.pickers.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.henninghall.date_picker.pickers.a.InterfaceC0708a f45235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.henninghall.date_picker.pickers.a.b f45237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f45239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45240f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f45238d = false;
            AndroidNative.this.f45235a.b();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AndroidNative f45242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f45243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f45244c;

        b(AndroidNative androidNative, boolean z11, boolean z12) {
            this.f45242a = androidNative;
            this.f45243b = z11;
            this.f45244c = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.m(this.f45242a, this.f45243b);
            if (this.f45244c) {
                AndroidNative.this.p();
            }
        }
    }

    class c implements NumberPicker.OnValueChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a f45246a;

        c(com.henninghall.date_picker.pickers.a aVar) {
            this.f45246a = aVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i11, int i12) {
            if (AndroidNative.this.f45237c != null) {
                AndroidNative.this.f45237c.a(this.f45246a, i11, i12);
            }
            if (AndroidNative.this.f45236b == 0) {
                AndroidNative.this.p();
            }
        }
    }

    class d implements NumberPicker.OnScrollListener {
        d() {
        }

        @Override // android.widget.NumberPicker.OnScrollListener
        public void onScrollStateChange(NumberPicker numberPicker, int i11) {
            AndroidNative.this.o(i11);
            AndroidNative.this.f45236b = i11;
            if (i11 != 0) {
                AndroidNative.this.f45240f = true;
                AndroidNative.this.f45235a.b();
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f45240f = false;
            AndroidNative.this.f45235a.a();
            AndroidNative.this.f45235a.b();
        }
    }

    public AndroidNative(Context context) {
        super(context);
        this.f45236b = 0;
        this.f45239e = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[PHI: r6
      0x0038: PHI (r6v10 int) = (r6v2 int), (r6v4 int), (r6v6 int), (r6v12 int) binds: [B:30:0x005e, B:26:0x0054, B:22:0x004a, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    public void m(NumberPicker numberPicker, boolean z11) {
        int value;
        int i11 = -1;
        try {
            try {
                try {
                    try {
                        Method declaredMethod = getClass().getSuperclass().getDeclaredMethod("changeValueByOne", Boolean.TYPE);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(numberPicker, Boolean.valueOf(z11));
                    } catch (InvocationTargetException e11) {
                        Log.w("changeValueByOne", e11);
                        value = getValue();
                        if (z11) {
                            i11 = 1;
                        }
                        setValue((value + i11) % getMaxValue());
                    }
                } catch (IllegalAccessException e12) {
                    Log.w("changeValueByOne", e12);
                    value = getValue();
                    if (z11) {
                        i11 = 1;
                    }
                    setValue((value + i11) % getMaxValue());
                }
            } catch (IllegalArgumentException e13) {
                Log.w("changeValueByOne", e13);
                value = getValue();
                if (z11) {
                    i11 = 1;
                }
                setValue((value + i11) % getMaxValue());
            } catch (NoSuchMethodException e14) {
                Log.w("changeValueByOne", e14);
                value = getValue();
                if (z11) {
                    i11 = 1;
                }
                setValue((value + i11) % getMaxValue());
            }
        } catch (Throwable th2) {
            setValue((getValue() + (z11 ? 1 : -1)) % getMaxValue());
            throw th2;
        }
    }

    private void n(boolean z11, int i11, boolean z12) {
        this.f45239e.postDelayed(new b(this, z11, z12), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i11) {
        if (this.f45236b == 0 || i11 != 0) {
            return;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f45239e.postDelayed(new e(), 500L);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public boolean a() {
        return this.f45240f || this.f45238d;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void b(int i11, boolean z11) {
        c(i11);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void c(int i11) {
        int value = getValue();
        if (i11 == value) {
            return;
        }
        int iF = m.f(value, i11, getMaxValue(), getWrapSelectorWheel());
        int iAbs = Math.abs(iF);
        this.f45238d = true;
        this.f45235a.b();
        this.f45239e.postDelayed(new a(), iAbs * 100);
        int i12 = 0;
        while (i12 < iAbs) {
            n(iF > 0, i12 * 100, i12 == iAbs + (-1));
            i12++;
        }
    }

    @Override // com.henninghall.date_picker.pickers.a
    public View getView() {
        return this;
    }

    @Override // android.widget.NumberPicker, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45239e.removeCallbacksAndMessages(null);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setDividerHeight(int i11) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setItemPaddingHorizontal(int i11) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangeListenerInScrolling(com.henninghall.date_picker.pickers.a.b bVar) {
        this.f45237c = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangedListener(com.henninghall.date_picker.pickers.a.InterfaceC0708a interfaceC0708a) {
        this.f45235a = interfaceC0708a;
        super.setOnValueChangedListener(new c(this));
        super.setOnScrollListener(new d());
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setShownCount(int i11) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextAlign(Paint.Align align) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextColor(String str) {
        int color = Color.parseColor(str);
        if (Build.VERSION.SDK_INT >= 29) {
            super.setTextColor(color);
            return;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            ((Paint) declaredField.get(this)).setColor(color);
        } catch (IllegalAccessException e11) {
            Log.w("setSelectedTextColor", e11);
        } catch (IllegalArgumentException e12) {
            Log.w("setSelectedTextColor", e12);
        } catch (NoSuchFieldException e13) {
            Log.w("setSelectedTextColor", e13);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(color);
            }
        }
        invalidate();
    }

    public AndroidNative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45236b = 0;
        this.f45239e = new Handler();
    }

    public AndroidNative(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f45236b = 0;
        this.f45239e = new Handler();
    }
}
