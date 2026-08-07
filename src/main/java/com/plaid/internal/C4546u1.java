package com.plaid.internal;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.plaid.internal.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4546u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C4572x0 f48148e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48152d;

    static {
        W3 w11 = Z3.f46846a;
        f48148e = new C4572x0("http-response");
    }

    public C4546u1(int i11, String str, HashMap map, String str2) {
        this.f48149a = i11;
        this.f48150b = str;
        this.f48151c = map;
        this.f48152d = str2;
    }

    public static C4546u1 a(InputStream inputStream) throws IOException {
        String strA;
        String strJoin;
        J6 j11 = new J6(inputStream);
        do {
            strA = j11.a();
            if (strA == null) {
                throw new IOException("empty response");
            }
        } while (strA.length() < 10);
        f48148e.a(W3.TRACE, "HttpResponse: ".concat(strA), new Object[0]);
        String[] strArrSplit = strA.split(" ");
        if (strArrSplit.length > 0) {
            String str = strArrSplit[0];
        }
        int i11 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 500;
        if (strArrSplit.length > 2) {
            strJoin = TextUtils.join(" ", Arrays.copyOfRange(strArrSplit, 2, strArrSplit.length));
        } else if (i11 == 204) {
            strJoin = "No Content";
        } else if (i11 == 404) {
            strJoin = "Not Found";
        } else if (i11 == 410) {
            strJoin = "Gone";
        } else if (i11 != 500) {
            switch (i11) {
                case 200:
                    strJoin = "OK";
                    break;
                case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                    strJoin = "Created";
                    break;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                    strJoin = "Accepted";
                    break;
                default:
                    strJoin = "Unknown Error";
                    break;
            }
        } else {
            strJoin = "Internal Server Error";
        }
        HashMap map = new HashMap();
        String strA2 = j11.a();
        if (strA2 == null) {
            throw new IOException("unexpected end of response");
        }
        int length = strA2.length();
        while (length > 0) {
            C4572x0 c4572x0 = f48148e;
            c4572x0.a(W3.TRACE, strA2, new Object[0]);
            String[] strArrSplit2 = strA2.split(":");
            if (strArrSplit2.length > 1) {
                String lowerCase = strArrSplit2[0].trim().toLowerCase();
                String strTrim = strA2.substring(strArrSplit2[0].length() + 1).trim();
                List linkedList = (List) map.get(lowerCase);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    map.put(lowerCase, linkedList);
                }
                linkedList.add(strTrim);
            } else {
                c4572x0.a(W3.ERROR, "Invalid header line received: ".concat(strA2), new Object[0]);
            }
            strA2 = j11.a();
            if (strA2 == null) {
                throw new IOException("unexpected end of response");
            }
            length = strA2.length();
        }
        f48148e.a(W3.TRACE, strA2, new Object[0]);
        boolean z11 = false;
        boolean z12 = false;
        int i12 = -1;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) ((List) entry.getValue()).get(0);
            if ("transfer-encoding".equals(str2)) {
                if ("chunked".equalsIgnoreCase(str3)) {
                    z11 = true;
                } else if ("gzip".equalsIgnoreCase(str3)) {
                    z12 = true;
                }
            } else if ("content-length".equals(str2)) {
                i12 = Integer.parseInt((String) ((List) entry.getValue()).get(0));
            }
            if ("content-encoding".equals(entry.getKey()) && "gzip".equalsIgnoreCase(str3)) {
                z12 = true;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        if (z11) {
            f48148e.a(W3.TRACE, "read chunked", new Object[0]);
            while (true) {
                String strA3 = j11.a();
                if (strA3 != null) {
                    int i13 = Integer.parseInt(strA3.trim(), 16);
                    f48148e.a(W3.TRACE, "read chunk of " + i13 + " bytes", new Object[0]);
                    if (i13 != 0) {
                        byte[] bArr = new byte[i13];
                        byteArrayOutputStream.write(bArr, 0, j11.f46373a.read(bArr, 0, i13));
                        j11.a();
                    }
                }
            }
        } else {
            if (i12 >= 0) {
                f48148e.a(W3.TRACE, "read body of content-length=" + i12, new Object[0]);
                byte[] bArr2 = new byte[i12];
                int i14 = 0;
                do {
                    int i15 = j11.f46373a.read(bArr2, i14, i12 - i14);
                    if (i15 != -1) {
                        i14 += i15;
                    }
                    byteArrayOutputStream.write(bArr2);
                } while (i14 != i12);
                byteArrayOutputStream.write(bArr2);
            } else {
                f48148e.a(W3.TRACE, "read body of unknown content-length", new Object[0]);
                byte[] bArr3 = new byte[256];
                for (int i16 = j11.f46373a.read(bArr3, 0, 256); i16 > 0; i16 = j11.f46373a.read(bArr3, 0, 256)) {
                    byteArrayOutputStream.write(bArr3, 0, i16);
                }
            }
            if (z12) {
                f48148e.a(W3.TRACE, "decompress response bytes", new Object[0]);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = new ByteArrayOutputStream(byteArray.length * 4);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
                byte[] bArr4 = new byte[32];
                while (true) {
                    int i17 = gZIPInputStream.read(bArr4);
                    if (i17 != -1) {
                        byteArrayOutputStream.write(bArr4, 0, i17);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    }
                }
            }
        }
        return new C4546u1(i11, strJoin, map, byteArrayOutputStream.toString());
    }
}
