package com.reactnativecommunity.checkbox;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.appcompat.widget.e;

/* JADX INFO: loaded from: classes6.dex */
class a extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f48477d;

    public a(Context context) {
        super(context);
        this.f48477d = null;
    }

    void b(boolean z11) {
        if (isChecked() == z11) {
            return;
        }
        super.setChecked(z11);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f48477d;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z11);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f48477d = onCheckedChangeListener;
    }
}
