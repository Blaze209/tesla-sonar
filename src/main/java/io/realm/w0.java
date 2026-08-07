package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
final class w0 extends y {
    w0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), d0.a.UUID, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((UUID) super.e(UUID.class));
    }
}
