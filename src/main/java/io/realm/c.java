package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
final class c extends y {
    c(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), d0.a.BOOLEAN, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Boolean) super.e(Boolean.class));
    }
}
