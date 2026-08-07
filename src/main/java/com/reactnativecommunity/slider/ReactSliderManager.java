package com.reactnativecommunity.slider;

import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.v0;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ReactSliderManager extends SimpleViewManager<com.reactnativecommunity.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            int iC = aVar.c(i11);
            seekBar.setProgress(iC);
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            if (z11) {
                ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().h(new com.reactnativecommunity.slider.b(seekBar.getId(), aVar.f(iC), true));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            aVar.d(true);
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().h(new g(seekBar.getId(), aVar.f(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            com.reactnativecommunity.slider.a aVar = (com.reactnativecommunity.slider.a) seekBar;
            aVar.d(false);
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().h(new f(seekBar.getId(), aVar.f(seekBar.getProgress())));
        }
    }

    static class b extends m implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48521b;

        private void b() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.o
        public long a(r rVar, float f11, p pVar, float f12, p pVar2) {
            com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(getThemedContext(), null);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f48520a = aVar.getMeasuredWidth();
            int measuredHeight = aVar.getMeasuredHeight();
            this.f48521b = measuredHeight;
            return q.b(this.f48520a, measuredHeight);
        }

        private b() {
            b();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return d.b();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return d.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSlider";
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @no.a(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(com.reactnativecommunity.slider.a aVar, ReadableArray readableArray) {
        d.d(aVar, readableArray);
    }

    @no.a(name = "accessibilityUnits")
    public void setAccessibilityUnits(com.reactnativecommunity.slider.a aVar, String str) {
        d.e(aVar, str);
    }

    @no.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(com.reactnativecommunity.slider.a aVar, boolean z11) {
        d.f(aVar, z11);
    }

    @no.a(defaultBoolean = false, name = "inverted")
    public void setInverted(com.reactnativecommunity.slider.a aVar, boolean z11) {
        d.g(aVar, z11);
    }

    @no.a(name = "lowerLimit")
    public void setLowerLimit(com.reactnativecommunity.slider.a aVar, double d11) {
        d.h(aVar, d11);
    }

    @no.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        d.i(aVar, num);
    }

    @no.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.reactnativecommunity.slider.a aVar, double d11) {
        d.j(aVar, d11);
    }

    @no.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        d.k(aVar, num);
    }

    @no.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.reactnativecommunity.slider.a aVar, double d11) {
        d.l(aVar, d11);
    }

    @no.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.reactnativecommunity.slider.a aVar, double d11) {
        d.m(aVar, d11);
    }

    @no.a(name = "thumbImage")
    public void setThumbImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
        d.n(aVar, readableMap);
    }

    @no.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        d.o(aVar, num);
    }

    @no.a(name = "upperLimit")
    public void setUpperLimit(com.reactnativecommunity.slider.a aVar, float f11) {
        d.p(aVar, f11);
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "value")
    public void setValue(com.reactnativecommunity.slider.a aVar, float f11) {
        d.q(aVar, f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(v0 v0Var, com.reactnativecommunity.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public m createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativecommunity.slider.a createViewInstance(v0 v0Var) {
        return d.a(v0Var);
    }
}
