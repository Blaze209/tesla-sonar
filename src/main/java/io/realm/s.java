package io.realm;

import com.adyen.checkout.components.core.Address;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
final class s extends f0 {
    s() {
        super(d0.a.NULL);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny();
    }

    @Override // io.realm.f0
    public <T> T e(Class<T> cls) {
        return null;
    }

    public boolean equals(Object obj) {
        return obj != null && s.class.equals(obj.getClass());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return Address.ADDRESS_NULL_PLACEHOLDER;
    }

    s(NativeRealmAny nativeRealmAny) {
        super(d0.a.NULL, nativeRealmAny);
    }
}
