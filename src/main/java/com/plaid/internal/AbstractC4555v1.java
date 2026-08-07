package com.plaid.internal;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.plaid.internal.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4555v1 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static LinkedHashMap b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String encodedQuery = Uri.parse(str).getEncodedQuery();
        if (encodedQuery != null) {
            int length = encodedQuery.length();
            int i11 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i11);
                int i12 = iIndexOf != -1 ? iIndexOf : length;
                int iIndexOf2 = encodedQuery.indexOf(61, i11);
                if (iIndexOf2 > i12 || iIndexOf2 == -1) {
                    iIndexOf2 = i12;
                }
                String strDecode = Uri.decode(encodedQuery.substring(i11, iIndexOf2));
                if (iIndexOf2 == i12) {
                    linkedHashMap.put(strDecode, "");
                } else {
                    linkedHashMap.put(strDecode, Uri.decode(encodedQuery.substring(iIndexOf2 + 1, i12)));
                }
                if (iIndexOf == -1) {
                    break;
                }
                i11 = iIndexOf + 1;
            }
        }
        return linkedHashMap;
    }

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            gZIPOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } finally {
            a(gZIPOutputStream);
        }
    }
}
