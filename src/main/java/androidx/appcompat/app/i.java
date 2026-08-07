package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i extends androidx.fragment.app.o {
    @Override // androidx.fragment.app.o
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new h(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.o
    public void setupDialog(@NonNull Dialog dialog, int i11) {
        if (!(dialog instanceof h)) {
            super.setupDialog(dialog, i11);
            return;
        }
        h hVar = (h) dialog;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        hVar.d(1);
    }
}
