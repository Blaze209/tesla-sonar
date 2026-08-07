package io.realm;

import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

/* JADX INFO: loaded from: classes9.dex */
final class f extends y {
    f(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), d0.a.DECIMAL128, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Decimal128) super.e(Decimal128.class));
    }
}
