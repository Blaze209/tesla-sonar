package io.realm;

import io.realm.internal.Table;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class r extends t0 {
    r(a aVar) {
        super(aVar, null);
    }

    @Override // io.realm.t0
    public r0 c(String str) {
        b(str, "Null or empty class names are not allowed");
        String strQ = Table.q(str);
        int length = str.length();
        int i11 = Table.f79049e;
        if (length > i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i11), Integer.valueOf(str.length())));
        }
        a aVar = this.f79170f;
        return new q(aVar, this, aVar.T().createTable(strQ));
    }
}
