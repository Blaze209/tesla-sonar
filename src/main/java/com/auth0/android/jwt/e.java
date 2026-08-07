package com.auth0.android.jwt;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class e implements k<f> {
    e() {
    }

    private Date b(n nVar, String str) {
        if (nVar.o(str)) {
            return new Date(nVar.n(str).e() * 1000);
        }
        return null;
    }

    private String c(n nVar, String str) {
        if (nVar.o(str)) {
            return nVar.n(str).f();
        }
        return null;
    }

    private List<String> d(n nVar, String str) {
        List<String> list = Collections.EMPTY_LIST;
        if (!nVar.o(str)) {
            return list;
        }
        l lVarN = nVar.n(str);
        if (!lVarN.g()) {
            return Collections.singletonList(lVarN.f());
        }
        i iVarA = lVarN.a();
        ArrayList arrayList = new ArrayList(iVarA.size());
        for (int i11 = 0; i11 < iVarA.size(); i11++) {
            arrayList.add(iVarA.l(i11).f());
        }
        return arrayList;
    }

    @Override // com.google.gson.k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f deserialize(l lVar, Type type, j jVar) {
        if (lVar.h() || !lVar.i()) {
            throw new DecodeException("The token's payload had an invalid JSON format.");
        }
        n nVarB = lVar.b();
        String strC = c(nVarB, "iss");
        String strC2 = c(nVarB, "sub");
        Date dateB = b(nVarB, "exp");
        Date dateB2 = b(nVarB, "nbf");
        Date dateB3 = b(nVarB, "iat");
        String strC3 = c(nVarB, "jti");
        List<String> listD = d(nVarB, "aud");
        HashMap map = new HashMap();
        for (Map.Entry<String, l> entry : nVarB.m()) {
            map.put(entry.getKey(), new c(entry.getValue()));
        }
        return new f(strC, strC2, dateB, dateB2, dateB3, strC3, listD, map);
    }
}
