package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
final class v0 extends y {
    v0(String str) {
        super(str, d0.a.STRING);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((String) super.e(String.class));
    }

    v0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), d0.a.STRING, nativeRealmAny);
    }
}
