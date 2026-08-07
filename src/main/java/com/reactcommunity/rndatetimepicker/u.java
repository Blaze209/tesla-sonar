package com.reactcommunity.rndatetimepicker;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.d0;
import androidx.p003lifecycle.j0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ-\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010000048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/u;", "", "Landroid/os/Bundle;", "args", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "j", "()V", "q", "s", "r", "o", "p", "t", "Landroid/view/View;", "root", "Lkotlin/Function1;", "", "pred", "k", "(Landroid/view/View;Lwn0/l;)Landroid/view/View;", "", "resId", "l", "(I)I", IntegerTokenConverter.CONVERTER_KEY, "x", "n", "m", "a", "Landroid/os/Bundle;", "b", "Lcom/facebook/react/bridge/Promise;", "c", "Landroidx/fragment/app/FragmentManager;", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/bridge/ReactApplicationContext;", "e", "Z", "promiseResolved", "Lcom/google/android/material/datepicker/r;", "", "f", "Lcom/google/android/material/datepicker/r;", "datePicker", "Lcom/google/android/material/datepicker/r$e;", "kotlin.jvm.PlatformType", "g", "Lcom/google/android/material/datepicker/r$e;", "builder", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

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
    private com.google.android.material.datepicker.r<Long> datePicker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private com.google.android.material.datepicker.r.e<Long> builder;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/u$a;", "Lcom/google/android/material/datepicker/s;", "", "Landroid/content/DialogInterface$OnDismissListener;", "<init>", "(Lcom/reactcommunity/rndatetimepicker/u;)V", "selection", "Ljava/util/Calendar;", "b", "(J)Ljava/util/Calendar;", "Landroid/content/DialogInterface;", "dialog", "Ljn0/h0;", "onDismiss", "(Landroid/content/DialogInterface;)V", "c", "(J)V", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a implements com.google.android.material.datepicker.s<Long>, DialogInterface.OnDismissListener {
        public a() {
        }

        private final Calendar b(long selection) {
            j jVar = new j(u.this.args);
            Calendar calendar = Calendar.getInstance(d.m(u.this.args));
            calendar.setTimeInMillis(selection);
            calendar.set(11, jVar.b());
            calendar.set(12, jVar.c());
            calendar.set(13, 0);
            calendar.set(14, 0);
            p013kotlin.jvm.internal.s.h(calendar);
            return calendar;
        }

        @Override // com.google.android.material.datepicker.s
        public /* bridge */ /* synthetic */ void a(Long l11) {
            c(l11.longValue());
        }

        public void c(long selection) {
            if (u.this.promiseResolved || !u.this.reactContext.hasActiveReactInstance()) {
                return;
            }
            Calendar calendarB = b(selection);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble("timestamp", calendarB.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (((double) calendarB.getTimeZone().getOffset(calendarB.getTimeInMillis())) / ((double) 1000)) / ((double) 60));
            u.this.promise.resolve(writableNativeMap);
            u.this.promiseResolved = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            p013kotlin.jvm.internal.s.k(dialog, "dialog");
            if (u.this.promiseResolved || !u.this.reactContext.hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            u.this.promise.resolve(writableNativeMap);
            u.this.promiseResolved = true;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements j0, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f48363a;

        b(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f48363a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof j0) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f48363a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p003lifecycle.j0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48363a.invoke(obj);
        }
    }

    public u(Bundle args, Promise promise, FragmentManager fragmentManager, ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        p013kotlin.jvm.internal.s.k(fragmentManager, "fragmentManager");
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.args = args;
        this.promise = promise;
        this.fragmentManager = fragmentManager;
        this.reactContext = reactContext;
        com.google.android.material.datepicker.r.e<Long> eVarC = com.google.android.material.datepicker.r.e.c();
        p013kotlin.jvm.internal.s.j(eVarC, "datePicker(...)");
        this.builder = eVarC;
    }

    private final void i() {
        a aVar = new a();
        com.google.android.material.datepicker.r<Long> rVar = this.datePicker;
        p013kotlin.jvm.internal.s.h(rVar);
        rVar.i(aVar);
        com.google.android.material.datepicker.r<Long> rVar2 = this.datePicker;
        p013kotlin.jvm.internal.s.h(rVar2);
        rVar2.g(aVar);
    }

    private final void j() {
        q();
        s();
        r();
        n();
        o();
        p();
        this.datePicker = this.builder.a();
        t();
    }

    private final View k(View root, wn0.l<? super View, Boolean> pred) {
        if (pred.invoke(root).booleanValue()) {
            return root;
        }
        if (!(root instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) root;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            p013kotlin.jvm.internal.s.j(childAt, "getChildAt(...)");
            View viewK = k(childAt, pred);
            if (viewK != null) {
                return viewK;
            }
        }
        return null;
    }

    private final int l(int resId) {
        Resources.Theme theme;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || (theme = currentActivity.getTheme()) == null) {
            return resId;
        }
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(resId, typedValue, true);
        return typedValue.resourceId;
    }

    private final void n() {
        Bundle bundle = this.args.getBundle("dialogButtons");
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("negative");
        Bundle bundle3 = bundle.getBundle("positive");
        if (bundle2 != null) {
            this.builder.g(bundle2.getString(AnnotatedPrivateKey.LABEL));
        }
        if (bundle3 != null) {
            this.builder.h(bundle3.getString(AnnotatedPrivateKey.LABEL));
        }
    }

    private final void o() {
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b();
        if (this.args.containsKey("firstDayOfWeek")) {
            bVar.b(this.args.getInt("firstDayOfWeek"));
        }
        ArrayList arrayList = new ArrayList();
        if (this.args.containsKey("minimumDate")) {
            com.google.android.material.datepicker.m mVarA = com.google.android.material.datepicker.m.a(d.o(this.args));
            p013kotlin.jvm.internal.s.j(mVarA, "from(...)");
            arrayList.add(mVarA);
        }
        if (this.args.containsKey("maximumDate")) {
            com.google.android.material.datepicker.l lVarA = com.google.android.material.datepicker.l.a(d.n(this.args));
            p013kotlin.jvm.internal.s.j(lVarA, "before(...)");
            arrayList.add(lVarA);
        }
        bVar.d(com.google.android.material.datepicker.d.c(arrayList));
        this.builder.e(bVar.a());
    }

    private final void p() {
        if (this.args.getBoolean("fullscreen")) {
            this.builder.j(l(zs.c.L));
        } else {
            this.builder.j(l(zs.c.N));
        }
    }

    private final void q() {
        this.builder.i(new j(this.args).e());
    }

    private final void r() {
        String string = this.args.getString("initialInputMode");
        if (string == null || string.length() == 0) {
            this.builder.f(0);
            return;
        }
        String string2 = this.args.getString("initialInputMode");
        p013kotlin.jvm.internal.s.h(string2);
        String upperCase = string2.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        if (v.valueOf(upperCase) == v.KEYBOARD) {
            this.builder.f(1);
        } else {
            this.builder.f(0);
        }
    }

    private final void s() {
        String string = this.args.getString("title");
        if (string == null || string.length() == 0) {
            return;
        }
        this.builder.k(this.args.getString("title"));
    }

    private final void t() {
        final com.google.android.material.datepicker.r<Long> rVar;
        if (this.args.getBoolean("startOnYearSelection")) {
            final j jVar = new j(this.args);
            Activity currentActivity = this.reactContext.getCurrentActivity();
            final androidx.appcompat.app.c cVar = currentActivity instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) currentActivity : null;
            if (cVar == null || (rVar = this.datePicker) == null) {
                return;
            }
            final d0<LifecycleOwner> viewLifecycleOwnerLiveData = rVar.getViewLifecycleOwnerLiveData();
            p013kotlin.jvm.internal.s.j(viewLifecycleOwnerLiveData, "getViewLifecycleOwnerLiveData(...)");
            viewLifecycleOwnerLiveData.observe(cVar, new b(new wn0.l() { // from class: com.reactcommunity.rndatetimepicker.r
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u.u(rVar, jVar, this, viewLifecycleOwnerLiveData, cVar, (LifecycleOwner) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u(final com.google.android.material.datepicker.r rVar, final j jVar, final u uVar, final d0 d0Var, final androidx.appcompat.app.c cVar, LifecycleOwner lifecycleOwner) {
        View decorView;
        if (lifecycleOwner == null) {
            return h0.f84049a;
        }
        Window window = rVar.requireDialog().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: com.reactcommunity.rndatetimepicker.s
                @Override // java.lang.Runnable
                public final void run() {
                    u.v(rVar, jVar, uVar, d0Var, cVar);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(com.google.android.material.datepicker.r rVar, j jVar, u uVar, d0 d0Var, androidx.appcompat.app.c cVar) {
        Window window;
        View decorView;
        Dialog dialog = rVar.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        final String strValueOf = String.valueOf(jVar.f());
        View viewK = uVar.k(decorView, new wn0.l() { // from class: com.reactcommunity.rndatetimepicker.t
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u.w(strValueOf, (View) obj));
            }
        });
        if (viewK != null) {
            viewK.performClick();
        } else {
            d0Var.removeObservers(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(String str, View v11) {
        CharSequence text;
        String string;
        p013kotlin.jvm.internal.s.k(v11, "v");
        if (v11 instanceof TextView) {
            TextView textView = (TextView) v11;
            if (textView.isShown() && textView.isClickable() && (text = textView.getText()) != null && (string = text.toString()) != null && p013kotlin.text.t.h0(string, str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final void x() {
        com.google.android.material.datepicker.r<Long> rVar = this.datePicker;
        p013kotlin.jvm.internal.s.h(rVar);
        rVar.show(this.fragmentManager, MaterialDatePickerModule.NAME);
    }

    public final void m() {
        j();
        i();
        x();
    }
}
