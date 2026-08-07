package com.android.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class AuthFailureError extends VolleyError {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f20154c;

    public AuthFailureError() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f20154c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public AuthFailureError(h hVar) {
        super(hVar);
    }
}
