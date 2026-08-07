package com.rnfs;

import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes6.dex */
public class c extends AsyncTask<com.rnfs.a, long[], b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.rnfs.a f49067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f49068b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f49069c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                c cVar = c.this;
                cVar.d(cVar.f49067a, c.this.f49069c);
                c.this.f49067a.f49061h.a(c.this.f49069c);
            } catch (Exception e11) {
                c cVar2 = c.this;
                cVar2.f49069c.f49066c = e11;
                cVar2.f49067a.f49061h.a(c.this.f49069c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    public void d(com.rnfs.a aVar, b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        int i11;
        long j11;
        long j12;
        int i12;
        int i13;
        FileOutputStream fileOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(aVar.f49054a.openConnection()));
            try {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = aVar.f49056c.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    httpURLConnection.setRequestProperty(strNextKey, aVar.f49056c.getString(strNextKey));
                }
                httpURLConnection.setConnectTimeout(aVar.f49060g);
                httpURLConnection.setReadTimeout(aVar.f49059f);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                long jE = e(httpURLConnection);
                if (responseCode == 200 || !(responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
                    if (responseCode >= 200 || responseCode >= 300) {
                        bufferedInputStream = null;
                    } else {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap map = new HashMap();
                        Iterator<Map.Entry<String, List<String>>> it = headerFields.entrySet().iterator();
                        while (true) {
                            i11 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, List<String>> next = it.next();
                            String key = next.getKey();
                            String str = next.getValue().get(0);
                            if (key != null && str != null) {
                                map.put(key, str);
                            }
                        }
                        com.rnfs.a.InterfaceC0777a interfaceC0777a = this.f49067a.f49062i;
                        if (interfaceC0777a != null) {
                            interfaceC0777a.a(responseCode, jE, map);
                        }
                        bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), PKIFailureInfo.certRevoked);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(aVar.f49055b);
                            try {
                                byte[] bArr = new byte[PKIFailureInfo.certRevoked];
                                boolean z11 = this.f49067a.f49063j != null;
                                long j13 = 0;
                                long j14 = 0;
                                double d11 = 0.0d;
                                while (true) {
                                    int i14 = bufferedInputStream.read(bArr);
                                    int i15 = i11;
                                    if (i14 == -1) {
                                        fileOutputStream2.flush();
                                        bVar.f49065b = j14;
                                        fileOutputStream = fileOutputStream2;
                                        break;
                                    }
                                    if (this.f49068b.get()) {
                                        throw new Exception("Download has been aborted");
                                    }
                                    boolean z12 = z11;
                                    long j15 = j14 + ((long) i14);
                                    if (z12) {
                                        if (aVar.f49057d > 0) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (jCurrentTimeMillis - j13 > aVar.f49057d) {
                                                long[] jArr = new long[2];
                                                jArr[i15] = jE;
                                                jArr[1] = j15;
                                                publishProgress(jArr);
                                                j13 = jCurrentTimeMillis;
                                            }
                                            j11 = jE;
                                            i13 = i14;
                                            j12 = j15;
                                        } else if (aVar.f49058e <= BitmapDescriptorFactory.HUE_RED) {
                                            long[] jArr2 = new long[2];
                                            jArr2[i15] = jE;
                                            jArr2[1] = j15;
                                            publishProgress(jArr2);
                                            j11 = jE;
                                            i12 = i14;
                                            j12 = j15;
                                        } else {
                                            i12 = i14;
                                            j12 = j15;
                                            double dRound = Math.round((j12 * 100.0d) / jE);
                                            j11 = jE;
                                            if (dRound % ((double) aVar.f49058e) == 0.0d && (dRound != d11 || j12 == j11)) {
                                                Log.d("Downloader", "EMIT: " + String.valueOf(dRound) + ", TOTAL:" + String.valueOf(j12));
                                                long[] jArr3 = new long[2];
                                                jArr3[i15] = j11;
                                                jArr3[1] = j12;
                                                publishProgress(jArr3);
                                                d11 = dRound;
                                            }
                                        }
                                        fileOutputStream2.write(bArr, i15, i13);
                                        j14 = j12;
                                        z11 = z12;
                                        i11 = i15;
                                        jE = j11;
                                    } else {
                                        j11 = jE;
                                        j12 = j15;
                                        i12 = i14;
                                    }
                                    i13 = i12;
                                    fileOutputStream2.write(bArr, i15, i13);
                                    j14 = j12;
                                    z11 = z12;
                                    i11 = i15;
                                    jE = j11;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    bVar.f49064a = responseCode;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(headerField).openConnection()));
                try {
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.connect();
                    int responseCode2 = httpURLConnection2.getResponseCode();
                    jE = e(httpURLConnection2);
                    responseCode = responseCode2;
                    httpURLConnection = httpURLConnection2;
                    if (responseCode >= 200) {
                        bufferedInputStream = null;
                    } else {
                        bufferedInputStream = null;
                    }
                    bVar.f49064a = responseCode;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = null;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        throw th;
    }

    private long e(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLengthLong();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b doInBackground(com.rnfs.a... aVarArr) {
        this.f49067a = aVarArr[0];
        this.f49069c = new b();
        new Thread(new a()).start();
        return this.f49069c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        com.rnfs.a.b bVar = this.f49067a.f49063j;
        if (bVar != null) {
            long[] jArr2 = jArr[0];
            bVar.a(jArr2[0], jArr2[1]);
        }
    }

    protected void g() {
        this.f49068b.set(true);
    }
}
