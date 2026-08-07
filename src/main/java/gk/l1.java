package gk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 {
    public static final q0 a(HttpURLConnection httpURLConnection, long j11, boolean z11, String str) throws IOException {
        k1 k1Var;
        String strF;
        e eVar = e.f69035c;
        h0 h0Var = new h0(httpURLConnection.getURL().getProtocol() + "://" + httpURLConnection.getURL().getHost(), httpURLConnection.getURL().getPath(), httpURLConnection.getURL().getQuery(), httpURLConnection.getRequestMethod());
        Integer numValueOf = Integer.valueOf(httpURLConnection.getResponseCode());
        f fVar = z11 ? f.f69048b : f.f69049c;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - j11);
        if (z11) {
            k1Var = null;
        } else {
            String responseMessage = httpURLConnection.getResponseMessage();
            String strValueOf = String.valueOf(httpURLConnection.getResponseCode());
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = errorStream != null ? new BufferedReader(new InputStreamReader(errorStream, p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked) : null;
            if (bufferedReader != null) {
                try {
                    strF = sn0.r.f(bufferedReader);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } else {
                strF = null;
            }
            sn0.b.a(bufferedReader, null);
            k1Var = new k1((String) null, (String) null, (String) null, responseMessage, (String) null, strF, (Integer) null, strValueOf, 87);
        }
        return new q0(new v1(eVar, new x((k1) null, h0Var, new s0(numValueOf, fVar, lValueOf, k1Var), 3)), new p(str, null));
    }
}
