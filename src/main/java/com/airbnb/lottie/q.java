package com.airbnb.lottie;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.HashSet;
import tf.y;

/* JADX INFO: loaded from: classes3.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<y> f19953a = new HashSet<>();

    q() {
    }

    @SuppressLint({"DefaultLocale"})
    public boolean a(y yVar, boolean z11) {
        if (!z11) {
            return this.f19953a.remove(yVar);
        }
        if (Build.VERSION.SDK_INT >= yVar.minRequiredSdkVersion) {
            return this.f19953a.add(yVar);
        }
        hg.e.c(String.format("%s is not supported pre SDK %d", yVar.name(), Integer.valueOf(yVar.minRequiredSdkVersion)));
        return false;
    }

    public boolean b(y yVar) {
        return this.f19953a.contains(yVar);
    }
}
