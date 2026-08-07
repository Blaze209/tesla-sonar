package com.google.android.libraries.places.widget.internal.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.b;
import com.google.android.libraries.places.internal.zzgb;

/* JADX INFO: loaded from: classes5.dex */
final class zzl implements View.OnFocusChangeListener {
    private zzl() {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) throws Throwable {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) b.getSystemService(view.getContext(), InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z11) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Error e11) {
            e = e11;
            zzgb.zzb(e);
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            zzgb.zzb(e);
            throw e;
        }
    }

    /* synthetic */ zzl(zzk zzkVar) {
    }
}
