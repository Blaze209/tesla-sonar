package ey;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public final class b {
    static Feature[] a(dy.d dVar) {
        if (dVar.f()) {
            return com.google.mlkit.common.sdkinternal.m.f45053a;
        }
        switch (dVar.h()) {
            case 2:
                return new Feature[]{com.google.mlkit.common.sdkinternal.m.f45059g};
            case 3:
                return new Feature[]{com.google.mlkit.common.sdkinternal.m.f45061i};
            case 4:
                return new Feature[]{com.google.mlkit.common.sdkinternal.m.f45062j};
            case 5:
                return new Feature[]{com.google.mlkit.common.sdkinternal.m.f45063k};
            case 6:
            case 7:
            case 8:
                return new Feature[]{com.google.mlkit.common.sdkinternal.m.f45060h};
            default:
                return new Feature[]{com.google.mlkit.common.sdkinternal.m.f45058f};
        }
    }
}
