package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ss.y;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ss.i.a f39847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f39850d;

    public p(String str, boolean z11, ss.i.a aVar) {
        ts.a.a((z11 && TextUtils.isEmpty(str)) ? false : true);
        this.f39847a = aVar;
        this.f39848b = str;
        this.f39849c = z11;
        this.f39850d = new HashMap();
    }

    private static byte[] c(ss.i.a aVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        y yVar = new y(aVar.a());
        ss.l lVarA = new ss.l.b().i(str).e(map).d(2).c(bArr).b(1).a();
        int i11 = 0;
        ss.l lVarA2 = lVarA;
        while (true) {
            try {
                ss.j jVar = new ss.j(yVar, lVarA2);
                try {
                    byte[] bArrT0 = p0.T0(jVar);
                    p0.n(jVar);
                    return bArrT0;
                } catch (HttpDataSource$InvalidResponseCodeException e11) {
                    try {
                        String strD = d(e11, i11);
                        if (strD == null) {
                            throw e11;
                        }
                        i11++;
                        lVarA2 = lVarA2.a().i(strD).a();
                        p0.n(jVar);
                    } catch (Throwable th2) {
                        p0.n(jVar);
                        throw th2;
                    }
                }
            } catch (Exception e12) {
                throw new MediaDrmCallbackException(lVarA, (Uri) ts.a.e(yVar.o()), yVar.b(), yVar.n(), e12);
            }
        }
    }

    private static String d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i11) {
        Map<String, List<String>> map;
        List<String> list;
        int i12 = httpDataSource$InvalidResponseCodeException.f41036d;
        if ((i12 != 307 && i12 != 308) || i11 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f41038f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.q
    public byte[] a(UUID uuid, n.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.f39849c || TextUtils.isEmpty(strB)) {
            strB = this.f39848b;
        }
        if (TextUtils.isEmpty(strB)) {
            ss.l.b bVar = new ss.l.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.h(uri).a(), uri, z.m(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = br.d.f17906e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = br.d.f17904c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f39850d) {
            map.putAll(this.f39850d);
        }
        return c(this.f39847a, strB, aVar.a(), map);
    }

    @Override // com.google.android.exoplayer2.drm.q
    public byte[] b(UUID uuid, n.d dVar) {
        return c(this.f39847a, dVar.b() + "&signedRequest=" + p0.C(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public void e(String str, String str2) {
        ts.a.e(str);
        ts.a.e(str2);
        synchronized (this.f39850d) {
            this.f39850d.put(str, str2);
        }
    }
}
