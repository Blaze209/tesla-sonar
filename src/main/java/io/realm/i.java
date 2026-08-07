package io.realm;

import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
final class i extends o0 {
    i(a aVar, NativeRealmAny nativeRealmAny) {
        super(g(aVar, nativeRealmAny));
    }

    private static <T extends n0> T g(a aVar, NativeRealmAny nativeRealmAny) {
        return (T) aVar.C(j.class, Table.h(nativeRealmAny.getRealmModelTableName(aVar.T())), nativeRealmAny.getRealmModelRowKey());
    }
}
