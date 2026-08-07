package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class p extends l0 {
    public p(sk.h hVar) {
        super(nk.a.a(), hVar);
    }

    static byte[] g(String str) {
        pk.k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (h(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        pk.k.g(strDecode);
        return strDecode.getBytes();
    }

    static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] strArrSplit = str.split(";");
        return strArrSplit[strArrSplit.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected um.k d(com.facebook.imagepipeline.request.a aVar) {
        byte[] bArrG = g(aVar.v().toString());
        return c(new ByteArrayInputStream(bArrG), bArrG.length);
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected String f() {
        return "DataFetchProducer";
    }
}
