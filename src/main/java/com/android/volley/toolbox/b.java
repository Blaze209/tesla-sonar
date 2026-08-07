package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.android.volley.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final g f20229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f20231c;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    @Override // com.android.volley.f
    public com.android.volley.h a(com.android.volley.i<?> iVar) throws VolleyError {
        IOException iOException;
        f fVarA;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                fVarA = this.f20230b.a(iVar, e.c(iVar.getCacheEntry()));
                try {
                    int iD = fVarA.d();
                    List<com.android.volley.e> listC = fVarA.c();
                    if (iD == 304) {
                        return l.b(iVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = fVarA.a();
                    byte[] bArrC = inputStreamA != null ? l.c(inputStreamA, fVarA.b(), this.f20231c) : new byte[0];
                    try {
                        l.d(SystemClock.elapsedRealtime() - jElapsedRealtime, iVar, bArrC, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        return new com.android.volley.h(iD, bArrC, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e11) {
                        e = e11;
                        bArr = bArrC;
                        iOException = e;
                        l.a(iVar, l.e(iVar, iOException, jElapsedRealtime, fVarA, bArr));
                        iVar = iVar;
                    }
                } catch (IOException e12) {
                    e = e12;
                    bArr = null;
                }
            } catch (IOException e13) {
                iOException = e13;
                fVarA = null;
                bArr = null;
                iVar = iVar;
            }
            l.a(iVar, l.e(iVar, iOException, jElapsedRealtime, fVarA, bArr));
            iVar = iVar;
        }
    }

    public b(a aVar, c cVar) {
        this.f20230b = aVar;
        this.f20229a = aVar;
        this.f20231c = cVar;
    }
}
