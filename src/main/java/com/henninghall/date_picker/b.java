package com.henninghall.date_picker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import net.time4j.android.ApplicationStarter;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlertDialog f45171a;

    class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f45172a;

        a(i iVar) {
            this.f45172a = iVar;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            com.henninghall.date_picker.e.d(this.f45172a.getDate(), this.f45172a.getPickerId());
        }
    }

    /* JADX INFO: renamed from: com.henninghall.date_picker.b$b, reason: collision with other inner class name */
    class C0707b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f45174a;

        C0707b(i iVar) {
            this.f45174a = iVar;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            com.henninghall.date_picker.e.c(this.f45174a.getPickerId());
        }
    }

    class c implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f45176a;

        c(Callback callback) {
            this.f45176a = callback;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f45176a.invoke(new Object[0]);
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f45178a;

        d(Callback callback) {
            this.f45178a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            this.f45178a.invoke(new Object[0]);
            dialogInterface.dismiss();
        }
    }

    class e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f45180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f45181b;

        e(Callback callback, i iVar) {
            this.f45180a = callback;
            this.f45181b = iVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            this.f45180a.invoke(this.f45181b.getDate());
            dialogInterface.dismiss();
        }
    }

    b(Context context) {
        ApplicationStarter.b(context, false);
    }

    private AlertDialog b(ReadableMap readableMap, i iVar, Callback callback, Callback callback2) {
        String string = readableMap.getString("title");
        String string2 = readableMap.getString("confirmText");
        return new AlertDialog.Builder(com.henninghall.date_picker.c.f45183a.getCurrentActivity(), d(readableMap)).setTitle(string).setCancelable(true).setView(f(iVar)).setPositiveButton(string2, new e(callback, iVar)).setNegativeButton(readableMap.getString("cancelText"), new d(callback2)).setOnCancelListener(new c(callback2)).create();
    }

    private i c(ReadableMap readableMap) {
        i iVar = new i(new LinearLayout.LayoutParams(-1, m.k(180)));
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (!strNextKey.equals("style")) {
                try {
                    iVar.d(strNextKey, dynamic);
                } catch (Exception unused) {
                }
            }
        }
        iVar.c();
        return iVar;
    }

    private int d(ReadableMap readableMap) {
        String string = readableMap.getString("theme");
        if (string == null) {
            return 0;
        }
        if (string.equals("dark")) {
            return 4;
        }
        return !string.equals("light") ? 0 : 5;
    }

    private View f(i iVar) {
        LinearLayout linearLayout = new LinearLayout(com.henninghall.date_picker.c.f45183a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(iVar);
        linearLayout.setPadding(0, m.k(20), 0, 0);
        return linearLayout;
    }

    public void a() {
        this.f45171a.dismiss();
    }

    public void e(ReadableMap readableMap) {
        i iVarC = c(readableMap);
        AlertDialog alertDialogB = b(readableMap, iVarC, new a(iVarC), new C0707b(iVarC));
        this.f45171a = alertDialogB;
        alertDialogB.show();
    }
}
