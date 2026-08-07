package io.realm;

import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;

/* JADX INFO: loaded from: classes9.dex */
public class e0 implements io.realm.internal.m {
    public void a(TableQuery tableQuery, OsKeyPathMapping osKeyPathMapping, String str, d0... d0VarArr) {
        long[] jArr = new long[d0VarArr.length];
        for (int i11 = 0; i11 < d0VarArr.length; i11++) {
            try {
                jArr[i11] = d0VarArr[i11].a();
            } catch (IllegalStateException e11) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e11);
            }
        }
        tableQuery.o(osKeyPathMapping, str, jArr);
    }
}
