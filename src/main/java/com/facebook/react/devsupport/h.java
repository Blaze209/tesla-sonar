package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Arrays;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ-\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/devsupport/h;", "Lpn/c;", "Lcom/facebook/react/devsupport/z0;", "reactInstanceDevHelper", "<init>", "(Lcom/facebook/react/devsupport/z0;)V", "", "message", "Ljn0/h0;", "h", "(Ljava/lang/String;)V", "g", "()V", "b", PermissionsResponse.STATUS_KEY, "", "done", "total", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "hide", "Lcom/facebook/react/devsupport/z0;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "devLoadingView", "Landroid/widget/PopupWindow;", "c", "Landroid/widget/PopupWindow;", "devLoadingPopup", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements pn.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f22487e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0 reactInstanceDevHelper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextView devLoadingView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PopupWindow devLoadingPopup;

    public h(z0 reactInstanceDevHelper) {
        p013kotlin.jvm.internal.s.k(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.reactInstanceDevHelper = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(h hVar) {
        hVar.g();
    }

    private final void g() {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.devLoadingPopup = null;
            this.devLoadingView = null;
        }
    }

    private final void h(String message) {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                qk.a.m("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i11 = rect.top;
                Object systemService = currentActivity.getSystemService("layout_inflater");
                p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(com.facebook.react.o.f22878b, (ViewGroup) null);
                p013kotlin.jvm.internal.s.i(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewInflate;
                textView.setText(message);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i11);
                this.devLoadingView = textView;
                this.devLoadingPopup = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                qk.a.m("ReactNative", "Unable to display loading message because react activity isn't active, message: " + message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(h hVar, String str) {
        hVar.h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Integer num, Integer num2, h hVar, String str) {
        String str2;
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
        }
        TextView textView = hVar.devLoadingView;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + str2 + "…");
        }
    }

    @Override // pn.c
    public void a(final String status, final Integer done, final Integer total) {
        if (f22487e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.j(done, total, this, status);
                }
            });
        }
    }

    @Override // pn.c
    public void b(final String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
        if (f22487e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.i(this.f22469a, message);
                }
            });
        }
    }

    @Override // pn.c
    public void hide() {
        if (f22487e) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.f(this.f22466a);
                }
            });
        }
    }
}
