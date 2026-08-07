package com.auth0.android.jwt;

import androidx.annotation.NonNull;
import com.google.gson.l;

/* JADX INFO: loaded from: classes3.dex */
class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f20271a;

    c(@NonNull l lVar) {
        this.f20271a = lVar;
    }

    @Override // com.auth0.android.jwt.a, com.auth0.android.jwt.b
    public String asString() {
        if (this.f20271a.j()) {
            return this.f20271a.f();
        }
        return null;
    }
}
