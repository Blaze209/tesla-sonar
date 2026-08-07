package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
final class b extends y {
    b(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), d0.a.BINARY, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((byte[]) super.e(byte[].class));
    }

    @Override // io.realm.y
    public boolean equals(Object obj) {
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals((byte[]) e(byte[].class), (byte[]) ((f0) obj).e(byte[].class));
    }
}
