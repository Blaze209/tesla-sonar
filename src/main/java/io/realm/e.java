package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
final class e extends y {
    e(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), d0.a.DATE, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Date) super.e(Date.class));
    }
}
