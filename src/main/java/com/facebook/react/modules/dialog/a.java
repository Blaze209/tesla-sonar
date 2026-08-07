package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.o;
import com.facebook.react.m;
import i.j;

/* JADX INFO: loaded from: classes3.dex */
public class a extends o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final DialogModule.b f22797m;

    /* JADX INFO: renamed from: com.facebook.react.modules.dialog.a$a, reason: collision with other inner class name */
    class C0452a extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f22798d;

        C0452a(TextView textView) {
            this.f22798d = textView;
        }

        @Override // androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(this.f22798d, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.G0(true);
        }
    }

    public a() {
        this.f22797m = null;
    }

    private static Dialog b(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        b.a aVar = new b.a(context);
        if (bundle.containsKey("title")) {
            aVar.c(e(context, (String) gn.a.c(bundle.getString("title"))));
        }
        if (bundle.containsKey("button_positive")) {
            aVar.k(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            aVar.g(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            aVar.h(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            aVar.f(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            aVar.e(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return aVar.create();
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    private static Dialog c(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (bundle.containsKey("title")) {
            builder.setCustomTitle(e(context, (String) gn.a.c(bundle.getString("title"))));
        }
        if (bundle.containsKey("button_positive")) {
            builder.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            builder.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            builder.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            builder.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            builder.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return builder.create();
    }

    public static Dialog d(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        return f(context) ? b(context, bundle, onClickListener) : c(context, bundle, onClickListener);
    }

    private static View e(Context context, String str) {
        View viewInflate = LayoutInflater.from(context).inflate(com.facebook.react.o.f22877a, (ViewGroup) null);
        TextView textView = (TextView) gn.a.c((TextView) viewInflate.findViewById(m.f22661k));
        textView.setText(str);
        textView.setFocusable(true);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setAccessibilityHeading(true);
            return viewInflate;
        }
        ViewCompat.p0(textView, new C0452a(textView));
        return viewInflate;
    }

    private static boolean f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j.f73996z0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(j.E0);
        typedArrayObtainStyledAttributes.recycle();
        return zHasValue;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        DialogModule.b bVar = this.f22797m;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i11);
        }
    }

    @Override // androidx.fragment.app.o
    public Dialog onCreateDialog(Bundle bundle) {
        return d(requireActivity(), requireArguments(), this);
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f22797m;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    @SuppressLint({"ValidFragment"})
    public a(DialogModule.b bVar, Bundle bundle) {
        this.f22797m = bVar;
        setArguments(bundle);
    }
}
