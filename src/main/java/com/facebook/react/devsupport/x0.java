package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/devsupport/x0;", "Lpn/i;", "Lu5/j;", "Landroid/content/Context;", "contextSupplier", "<init>", "(Lu5/j;)V", "", "message", "Lpn/e$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "a", "(Ljava/lang/String;Lpn/e$a;)V", "f", "()V", "Lu5/j;", "Landroid/app/Dialog;", "b", "Landroid/app/Dialog;", "pausedInDebuggerDialog", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 implements pn.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u5.j<Context> contextSupplier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Dialog pausedInDebuggerDialog;

    public x0(u5.j<Context> contextSupplier) {
        p013kotlin.jvm.internal.s.k(contextSupplier, "contextSupplier");
        this.contextSupplier = contextSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(x0 x0Var) {
        Dialog dialog = x0Var.pausedInDebuggerDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        x0Var.pausedInDebuggerDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(x0 x0Var, String str, final pn.e.a aVar) {
        Dialog dialog = x0Var.pausedInDebuggerDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = x0Var.contextSupplier.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(com.facebook.react.o.f22880d, (ViewGroup) null);
        p013kotlin.jvm.internal.s.j(viewInflate, "inflate(...)");
        viewInflate.findViewById(com.facebook.react.m.f22662l).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x0.h(aVar, view);
            }
        });
        ((TextView) viewInflate.findViewById(com.facebook.react.m.f22663m)).setText(str);
        Dialog dialog2 = new Dialog(context, com.facebook.react.q.f22911a);
        dialog2.setContentView(viewInflate);
        dialog2.setCancelable(false);
        x0Var.pausedInDebuggerDialog = dialog2;
        Window window = dialog2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            p013kotlin.jvm.internal.s.j(attributes, "getAttributes(...)");
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(BitmapDescriptorFactory.HUE_RED);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(com.facebook.react.l.f22649a);
        }
        Dialog dialog3 = x0Var.pausedInDebuggerDialog;
        if (dialog3 != null) {
            dialog3.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(pn.e.a aVar, View view) {
        aVar.onResume();
    }

    @Override // pn.i
    public void a(final String message, final pn.e.a listener) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.u0
            @Override // java.lang.Runnable
            public final void run() {
                x0.g(this.f22572a, message, listener);
            }
        });
    }

    @Override // pn.i
    public void f() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.v0
            @Override // java.lang.Runnable
            public final void run() {
                x0.e(this.f22576a);
            }
        });
    }
}
