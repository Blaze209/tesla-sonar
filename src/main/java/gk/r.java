package gk;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends SuspendLambda implements wn0.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f69119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f69120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f69121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f69122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f69123r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar, u uVar, String str, String str2, Continuation continuation, boolean z11) {
        super(2, continuation);
        this.f69119n = str;
        this.f69120o = uVar;
        this.f69121p = kVar;
        this.f69122q = str2;
        this.f69123r = z11;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f69119n;
        return new r(this.f69121p, this.f69120o, str, this.f69122q, continuation, this.f69123r);
    }

    @Override // wn0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        q qVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f69119n).openConnection());
        p013kotlin.jvm.internal.s.i(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection connection = (HttpURLConnection) uRLConnection;
        u uVar = this.f69120o;
        k kVar = this.f69121p;
        String str = this.f69122q;
        boolean z11 = this.f69123r;
        List list = u.f69140d;
        uVar.getClass();
        connection.setConnectTimeout(30000);
        connection.setReadTimeout(30000);
        connection.setRequestMethod(kVar.toString());
        for (Pair pair : uVar.f69143c) {
            connection.setRequestProperty((String) pair.e(), (String) pair.f());
        }
        if (kVar == k.f69076a) {
            connection.setDoOutput(true);
            if (str != null) {
                OutputStream outputStream = connection.getOutputStream();
                p013kotlin.jvm.internal.s.j(outputStream, "getOutputStream(...)");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                try {
                    outputStreamWriter.write(str);
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    outputStream.close();
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    sn0.b.a(outputStreamWriter, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(outputStreamWriter, th2);
                        throw th3;
                    }
                }
            }
            connection.connect();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int responseCode = connection.getResponseCode();
        if (200 > responseCode || responseCode >= 300) {
            if (z11) {
                p013kotlin.jvm.internal.s.k(connection, "connection");
                uVar.a(l1.a(connection, jCurrentTimeMillis, false, uVar.f69141a.f69071b));
            } else {
                x0.a(uVar, "Failed to send " + kVar + " request: " + connection.getResponseMessage());
            }
            return new m(connection.getResponseCode(), connection.getResponseMessage());
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        if (z11) {
            try {
                p013kotlin.jvm.internal.s.k(connection, "connection");
                uVar.a(l1.a(connection, jCurrentTimeMillis, true, uVar.f69141a.f69071b));
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(bufferedReader, th4);
                    throw th5;
                }
            }
        }
        try {
            try {
                String strF = sn0.r.f(bufferedReader);
                sn0.b.a(bufferedReader, null);
                qVar = new q(strF);
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    sn0.b.a(bufferedReader, th6);
                    throw th7;
                }
            }
        } catch (Exception unused) {
            qVar = new q("");
        }
        sn0.b.a(bufferedReader, null);
        return qVar;
    }
}
