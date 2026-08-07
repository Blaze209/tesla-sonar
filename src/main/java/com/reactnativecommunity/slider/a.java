package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.t;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class a extends t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f48522n = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f48523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f48524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f48525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f48527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f48528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f48529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f48530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f48531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f48533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f48534m;

    /* JADX INFO: renamed from: com.reactnativecommunity.slider.a$a, reason: collision with other inner class name */
    class C0766a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f48535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccessibilityEvent f48536b;

        C0766a(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f48535a = accessibilityManager;
            this.f48536b = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f48535a.sendAccessibilityEvent(this.f48536b);
        }
    }

    class b implements Callable<BitmapDrawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48538a;

        b(String str) {
            this.f48538a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitmapDrawable call() {
            Bitmap bitmapDecodeStream;
            try {
                if (this.f48538a.startsWith("http://") || this.f48538a.startsWith("https://") || this.f48538a.startsWith("file://") || this.f48538a.startsWith("asset://") || this.f48538a.startsWith("data:")) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(this.f48538a)));
                } else {
                    bitmapDecodeStream = BitmapFactory.decodeResource(a.this.getResources(), a.this.getResources().getIdentifier(this.f48538a, "drawable", a.this.getContext().getPackageName()));
                }
                return new BitmapDrawable(a.this.getResources(), bitmapDecodeStream);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48523b = 0.0d;
        this.f48524c = 0.0d;
        this.f48525d = 0.0d;
        this.f48526e = false;
        this.f48527f = 0.0d;
        this.f48528g = 0.0d;
        this.f48531j = -9.223372036854776E18d;
        this.f48533l = 9.223372036854776E18d;
        super.setLayoutDirection(com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0);
        a();
    }

    private void a() {
        if (Build.VERSION.SDK_INT < 26) {
            super.setStateListAnimator(null);
        }
    }

    private BitmapDrawable b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new b(str)).get();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private void g() {
        if (this.f48527f == 0.0d) {
            this.f48528g = (this.f48524c - this.f48523b) / ((double) f48522n);
        }
        setMax(getTotalSteps());
        setKeyProgressIncrement(1);
        h();
        i();
        j();
    }

    private double getStepValue() {
        double d11 = this.f48527f;
        return d11 > 0.0d ? d11 : this.f48528g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f48524c - this.f48523b) / getStepValue());
    }

    private void h() {
        double dMax = Math.max(this.f48531j, this.f48523b);
        double d11 = this.f48523b;
        int iRound = (int) Math.round(((dMax - d11) / (this.f48524c - d11)) * ((double) getTotalSteps()));
        int i11 = this.f48534m;
        if (iRound > i11) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; lowerLimit not set");
        } else {
            this.f48532k = Math.min(iRound, i11);
        }
    }

    private void i() {
        double dMin = Math.min(this.f48533l, this.f48524c);
        double d11 = this.f48523b;
        int iRound = (int) Math.round(((dMin - d11) / (this.f48524c - d11)) * ((double) getTotalSteps()));
        if (this.f48532k > iRound) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; upperLimit not set");
        } else {
            this.f48534m = iRound;
        }
    }

    private void j() {
        double d11 = this.f48525d;
        double d12 = this.f48523b;
        setProgress((int) Math.round(((d11 - d12) / (this.f48524c - d12)) * ((double) getTotalSteps())));
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(getClass().getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.getText().add(charSequence);
            new Timer().schedule(new C0766a(accessibilityManager, accessibilityEventObtain), 1000L);
        }
    }

    int c(int i11) {
        if (i11 < getLowerLimit()) {
            return getLowerLimit();
        }
        return i11 > getUpperLimit() ? getUpperLimit() : i11;
    }

    void d(boolean z11) {
        this.f48526e = z11;
    }

    boolean e() {
        return this.f48526e;
    }

    public double f(int i11) {
        return i11 == getMax() ? this.f48524c : (((double) i11) * getStepValue()) + this.f48523b;
    }

    int getLowerLimit() {
        return this.f48532k;
    }

    int getUpperLimit() {
        return this.f48534m;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f48525d);
        }
    }

    void setAccessibilityIncrements(List<String> list) {
        this.f48530i = list;
    }

    void setAccessibilityUnits(String str) {
        this.f48529h = str;
    }

    void setLowerLimit(double d11) {
        this.f48531j = d11;
        h();
    }

    void setMaxValue(double d11) {
        this.f48524c = d11;
        g();
    }

    void setMinValue(double d11) {
        this.f48523b = d11;
        g();
    }

    void setStep(double d11) {
        this.f48527f = d11;
        g();
    }

    public void setThumbImage(String str) {
        if (str == null) {
            setThumb(getThumb());
        } else {
            setThumb(b(str));
            setSplitTrack(false);
        }
    }

    void setUpperLimit(double d11) {
        this.f48533l = d11;
        i();
    }

    void setValue(double d11) {
        this.f48525d = d11;
        j();
    }

    public void setupAccessibility(int i11) {
        List<String> list;
        if (this.f48529h == null || (list = this.f48530i) == null || list.size() - 1 != ((int) this.f48524c)) {
            return;
        }
        String str = this.f48530i.get(i11);
        int length = this.f48529h.length();
        String strSubstring = this.f48529h;
        if (str != null && Integer.parseInt(str) == 1) {
            strSubstring = strSubstring.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, strSubstring));
    }
}
