package com.stripe.android.view;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/v1;", "Landroid/webkit/WebChromeClient;", "Landroid/app/Activity;", "activity", "Lo30/d;", "logger", "<init>", "(Landroid/app/Activity;Lo30/d;)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Landroid/webkit/WebView;", "view", "", ImagesContract.URL, "message", "Landroid/webkit/JsResult;", "result", "onJsConfirm", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "a", "Landroid/app/Activity;", "b", "Lo30/d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v1 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    public v1(Activity activity, o30.d logger) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        this.activity = activity;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i11) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JsResult jsResult, DialogInterface dialogInterface, int i11) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        if (consoleMessage != null && (strMessage = consoleMessage.message()) != null) {
            this.logger.debug(strMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        new androidx.appcompat.app.b.a(this.activity, f30.e0.f63987a).f(message).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.t1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                v1.c(result, dialogInterface, i11);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.u1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                v1.d(result, dialogInterface, i11);
            }
        }).create().show();
        return true;
    }
}
