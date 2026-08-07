package io.realm;

import io.realm.internal.Table;

/* JADX INFO: loaded from: classes9.dex */
class m extends r0 {
    m(a aVar, t0 t0Var, Table table, io.realm.internal.c cVar) {
        super(aVar, t0Var, table, cVar);
    }

    @Override // io.realm.r0
    public r0 a(String str, Class<?> cls, k... kVarArr) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    m(a aVar, t0 t0Var, Table table) {
        super(aVar, t0Var, table, new r0.a(table));
    }
}
