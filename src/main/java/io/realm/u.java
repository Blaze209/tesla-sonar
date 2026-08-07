package io.realm;

import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
final class u extends y {
    u(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), d0.a.OBJECT_ID, nativeRealmAny);
    }

    @Override // io.realm.f0
    protected NativeRealmAny a() {
        return new NativeRealmAny((ObjectId) super.e(ObjectId.class));
    }
}
