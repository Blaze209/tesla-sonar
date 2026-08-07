package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes6.dex */
public class IosClone extends dc.a implements com.henninghall.date_picker.pickers.a {
    private com.henninghall.date_picker.pickers.a.b G0;
    private com.henninghall.date_picker.pickers.a.InterfaceC0708a H0;

    class a implements dc.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a f45250a;

        a(com.henninghall.date_picker.pickers.a aVar) {
            this.f45250a = aVar;
        }

        @Override // dc.a.e
        public void a(dc.a aVar, int i11, int i12) {
            py.a.g(this.f45250a, i12);
            if (IosClone.this.G0 != null) {
                IosClone.this.G0.a(this.f45250a, i11, i12);
            }
        }
    }

    class b implements dc.a.c {
        b() {
        }

        @Override // dc.a.c
        public void a(dc.a aVar, int i11) {
            if (IosClone.this.H0 != null) {
                IosClone.this.H0.b();
            }
        }
    }

    class c implements dc.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a.InterfaceC0708a f45253a;

        c(com.henninghall.date_picker.pickers.a.InterfaceC0708a interfaceC0708a) {
            this.f45253a = interfaceC0708a;
        }

        @Override // dc.a.d
        public void a(dc.a aVar, int i11, int i12) {
            this.f45253a.a();
        }
    }

    public IosClone(Context context) {
        super(context);
        q0();
    }

    private void q0() {
        r0();
        s0();
    }

    private void r0() {
        py.a.k(this);
    }

    private void s0() {
        super.setOnValueChangeListenerInScrolling(new a(this));
        super.setOnScrollListener(new b());
    }

    @Override // com.henninghall.date_picker.pickers.a
    public boolean a() {
        return super.O();
    }

    @Override // com.henninghall.date_picker.pickers.a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        py.a.i(this, accessibilityNodeInfo);
    }

    @Override // dc.a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (py.a.j(this)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangeListenerInScrolling(com.henninghall.date_picker.pickers.a.b bVar) {
        this.G0 = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangedListener(com.henninghall.date_picker.pickers.a.InterfaceC0708a interfaceC0708a) {
        this.H0 = interfaceC0708a;
        super.setOnValueChangedListener(new c(interfaceC0708a));
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextColor(String str) {
        int color = Color.parseColor(str);
        setNormalTextColor(Color.parseColor("#70" + str.substring(1)));
        setSelectedTextColor(color);
    }

    public IosClone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q0();
    }

    public IosClone(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        q0();
    }
}
