package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes5.dex */
final class zbf extends zba {
    final /* synthetic */ zbg zba;

    zbf(zbg zbgVar) {
        this.zba = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbd(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            zbg zbgVar = this.zba;
            zbn.zbc(zbgVar.zba).zbe(zbgVar.zbb, googleSignInAccount);
        }
        this.zba.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
