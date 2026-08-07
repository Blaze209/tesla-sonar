package com.reactcommunity.rndatetimepicker;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Calendar;
import java.util.Locale;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(¨\u0006*"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/w;", "", "Landroid/os/Bundle;", "args", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "h", "()V", "k", "n", "l", "j", "m", "g", "o", IntegerTokenConverter.CONVERTER_KEY, "a", "Landroid/os/Bundle;", "b", "Lcom/facebook/react/bridge/Promise;", "c", "Landroidx/fragment/app/FragmentManager;", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/bridge/ReactApplicationContext;", "", "e", "Z", "promiseResolved", "Lcom/google/android/material/timepicker/d;", "f", "Lcom/google/android/material/timepicker/d;", "timePicker", "Lcom/google/android/material/timepicker/d$d;", "Lcom/google/android/material/timepicker/d$d;", "builder", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bundle args;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Promise promise;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean promiseResolved;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private com.google.android.material.timepicker.d timePicker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private com.google.android.material.timepicker.d.C0672d builder;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/w$a;", "Landroid/view/View$OnClickListener;", "Landroid/content/DialogInterface$OnDismissListener;", "<init>", "(Lcom/reactcommunity/rndatetimepicker/w;)V", "Ljava/util/Calendar;", "a", "()Ljava/util/Calendar;", "Landroid/content/DialogInterface;", "dialog", "Ljn0/h0;", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a implements View.OnClickListener, DialogInterface.OnDismissListener {
        public a() {
        }

        private final Calendar a() {
            j jVar = new j(w.this.args);
            Calendar calendar = Calendar.getInstance(d.m(w.this.args));
            int iF = jVar.f();
            int iD = jVar.d();
            int iA = jVar.a();
            com.google.android.material.timepicker.d dVar = w.this.timePicker;
            p013kotlin.jvm.internal.s.h(dVar);
            int iN = dVar.n();
            com.google.android.material.timepicker.d dVar2 = w.this.timePicker;
            p013kotlin.jvm.internal.s.h(dVar2);
            calendar.set(iF, iD, iA, iN, dVar2.p(), 0);
            calendar.set(14, 0);
            p013kotlin.jvm.internal.s.h(calendar);
            return calendar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            p013kotlin.jvm.internal.s.k(v11, "v");
            if (w.this.promiseResolved || !w.this.reactContext.hasActiveReactInstance()) {
                return;
            }
            Calendar calendarA = a();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble("timestamp", calendarA.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (((double) calendarA.getTimeZone().getOffset(calendarA.getTimeInMillis())) / ((double) 1000)) / ((double) 60));
            w.this.promise.resolve(writableNativeMap);
            w.this.promiseResolved = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            p013kotlin.jvm.internal.s.k(dialog, "dialog");
            if (w.this.promiseResolved || !w.this.reactContext.hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            w.this.promise.resolve(writableNativeMap);
            w.this.promiseResolved = true;
        }
    }

    public w(Bundle args, Promise promise, FragmentManager fragmentManager, ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        p013kotlin.jvm.internal.s.k(fragmentManager, "fragmentManager");
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.args = args;
        this.promise = promise;
        this.fragmentManager = fragmentManager;
        this.reactContext = reactContext;
        this.builder = new com.google.android.material.timepicker.d.C0672d();
    }

    private final void g() {
        a aVar = new a();
        com.google.android.material.timepicker.d dVar = this.timePicker;
        p013kotlin.jvm.internal.s.h(dVar);
        dVar.l(aVar);
        com.google.android.material.timepicker.d dVar2 = this.timePicker;
        p013kotlin.jvm.internal.s.h(dVar2);
        dVar2.k(aVar);
    }

    private final void h() {
        k();
        n();
        l();
        j();
        m();
        this.timePicker = this.builder.j();
    }

    private final void j() {
        Bundle bundle = this.args.getBundle("dialogButtons");
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("negative");
        Bundle bundle3 = bundle.getBundle("positive");
        if (bundle2 != null) {
            this.builder.n(bundle2.getString(AnnotatedPrivateKey.LABEL));
        }
        if (bundle3 != null) {
            this.builder.o(bundle3.getString(AnnotatedPrivateKey.LABEL));
        }
    }

    private final void k() {
        j jVar = new j(this.args);
        this.builder.k(jVar.b()).m(jVar.c());
    }

    private final void l() {
        String string = this.args.getString("initialInputMode");
        if (string == null || string.length() == 0) {
            this.builder.l(0);
            return;
        }
        String string2 = this.args.getString("initialInputMode");
        p013kotlin.jvm.internal.s.h(string2);
        String upperCase = string2.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        if (v.valueOf(upperCase) == v.KEYBOARD) {
            this.builder.l(1);
        } else {
            this.builder.l(0);
        }
    }

    private final void m() {
        if (this.args.getBoolean("is24Hour")) {
            this.builder.p(1);
        } else if (DateFormat.is24HourFormat(this.reactContext)) {
            this.builder.p(1);
        } else {
            this.builder.p(0);
        }
    }

    private final void n() {
        String string = this.args.getString("title");
        if (string == null || string.length() == 0) {
            return;
        }
        this.builder.q(this.args.getString("title"));
    }

    private final void o() {
        com.google.android.material.timepicker.d dVar = this.timePicker;
        p013kotlin.jvm.internal.s.h(dVar);
        dVar.show(this.fragmentManager, MaterialTimePickerModule.NAME);
    }

    public final void i() {
        h();
        g();
        o();
    }
}
