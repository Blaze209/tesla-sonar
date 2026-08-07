package com.facebook.react.devsupport;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final okio.j f22560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22562c;

    public interface a {
        void a(Map<String, String> map, okio.h hVar, boolean z11);

        void b(Map<String, String> map, long j11, long j12);
    }

    public s0(okio.j jVar, String str) {
        this.f22560a = jVar;
        this.f22561b = str;
    }

    private void a(okio.h hVar, boolean z11, a aVar) throws EOFException {
        okio.k kVarF = okio.k.f("\r\n\r\n");
        long jZ = hVar.Z(kVarF);
        if (jZ == -1) {
            aVar.a(null, hVar, z11);
            return;
        }
        okio.h hVar2 = new okio.h();
        okio.h hVar3 = new okio.h();
        hVar.read(hVar2, jZ);
        hVar.skip(kVarF.D());
        hVar.D1(hVar3);
        aVar.a(c(hVar2), hVar3, z11);
    }

    private void b(Map<String, String> map, long j11, boolean z11, a aVar) {
        if (map == null || aVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f22562c > 16 || z11) {
            this.f22562c = jCurrentTimeMillis;
            aVar.b(map, j11, map.get("Content-Length") != null ? Long.parseLong(map.get("Content-Length")) : 0L);
        }
    }

    private Map<String, String> c(okio.h hVar) {
        HashMap map = new HashMap();
        for (String str : hVar.t1().split("\r\n")) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                map.put(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public boolean d(a aVar) throws EOFException {
        boolean z11;
        okio.k kVarF = okio.k.f("\r\n--" + this.f22561b + "\r\n");
        okio.k kVarF2 = okio.k.f("\r\n--" + this.f22561b + "--\r\n");
        okio.k kVarF3 = okio.k.f("\r\n\r\n");
        okio.h hVar = new okio.h();
        long j11 = 0L;
        long jD = 0L;
        long j12 = 0L;
        Map<String, String> mapC = null;
        while (true) {
            long jMax = Math.max(j11 - ((long) kVarF2.D()), jD);
            long jI = hVar.I(kVarF, jMax);
            if (jI == -1) {
                jI = hVar.I(kVarF2, jMax);
                z11 = true;
            } else {
                z11 = false;
            }
            if (jI == -1) {
                long size = hVar.getSize();
                if (mapC == null) {
                    long jI2 = hVar.I(kVarF3, jMax);
                    if (jI2 >= 0) {
                        this.f22560a.read(hVar, jI2);
                        okio.h hVar2 = new okio.h();
                        hVar.t(hVar2, jMax, jI2 - jMax);
                        long size2 = hVar2.getSize() + ((long) kVarF3.D());
                        mapC = c(hVar2);
                        j12 = size2;
                    }
                } else {
                    Map<String, String> map = mapC;
                    b(map, hVar.getSize() - j12, false, aVar);
                    mapC = map;
                }
                if (this.f22560a.read(hVar, 4096) <= 0) {
                    return false;
                }
                jD = jD;
                j11 = size;
            } else {
                long j13 = jD;
                Map<String, String> map2 = mapC;
                long j14 = jI - j13;
                if (j13 > 0) {
                    okio.h hVar3 = new okio.h();
                    hVar.skip(j13);
                    hVar.read(hVar3, j14);
                    b(map2, hVar3.getSize() - j12, true, aVar);
                    a(hVar3, z11, aVar);
                    j12 = 0;
                    map2 = null;
                } else {
                    hVar.skip(jI);
                }
                if (z11) {
                    return true;
                }
                jD = kVarF.D();
                mapC = map2;
                j11 = jD;
            }
        }
    }
}
