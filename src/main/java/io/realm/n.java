package io.realm;

/* JADX INFO: loaded from: classes9.dex */
class n extends t0 {
    n(a aVar, io.realm.internal.b bVar) {
        super(aVar, bVar);
    }

    @Override // io.realm.t0
    public r0 c(String str) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
}
