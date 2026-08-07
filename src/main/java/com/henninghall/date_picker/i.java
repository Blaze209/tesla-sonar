package com.henninghall.date_picker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.react.bridge.Dynamic;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class i extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup.LayoutParams f45197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private py.f f45198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f45199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<String> f45200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f45201e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            iVar.measure(View.MeasureSpec.makeMeasureSpec(iVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i.this.getHeight(), 1073741824));
            i iVar2 = i.this;
            iVar2.layout(iVar2.getLeft(), i.this.getTop(), i.this.getRight(), i.this.getBottom());
        }
    }

    public i(ViewGroup.LayoutParams layoutParams) {
        super(c.f45183a);
        this.f45199c = new l();
        this.f45200d = new ArrayList<>();
        this.f45201e = new a();
        this.f45197a = layoutParams;
    }

    private boolean a(String... strArr) {
        for (String str : strArr) {
            if (this.f45200d.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void b(int i11, int i12) {
        this.f45198b.e(i11, i12);
    }

    public void c() {
        if (a("androidVariant")) {
            removeAllViewsInLayout();
            LinearLayout linearLayout = new LinearLayout(getContext());
            LayoutInflater.from(getContext()).inflate(this.f45199c.f45233q.d(), linearLayout);
            addView(linearLayout, this.f45197a);
            this.f45198b = new py.f(this.f45199c, this);
        }
        if (a("fadeToColor")) {
            this.f45198b.i();
        }
        if (a("textColor")) {
            this.f45198b.l();
        }
        if (a("mode", "androidVariant", "is24hourSource")) {
            this.f45198b.o();
        }
        if (a(Snapshot.HEIGHT)) {
            this.f45198b.j();
        }
        if (a("dividerHeight")) {
            this.f45198b.h();
        }
        if (a("mode", "locale", "androidVariant", "is24hourSource")) {
            this.f45198b.m();
        }
        if (a("mode")) {
            this.f45198b.n();
        }
        if (a(InquiryField.DateField.TYPE, Snapshot.HEIGHT, "locale", "maximumDate", "minimumDate", "minuteInterval", "mode", "timezoneOffsetInMinutes", "androidVariant")) {
            this.f45198b.g();
        }
        if (a("locale")) {
            py.a.h(this.f45199c.y());
        }
        this.f45198b.f();
        this.f45200d = new ArrayList<>();
    }

    public void d(String str, Dynamic dynamic) {
        this.f45199c.K(str, dynamic);
        this.f45200d.add(str);
    }

    public String getDate() {
        return this.f45199c.f45233q.a();
    }

    public String getPickerId() {
        return this.f45199c.u();
    }

    public ny.c getVariant() {
        return this.f45199c.I();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f45201e);
    }
}
