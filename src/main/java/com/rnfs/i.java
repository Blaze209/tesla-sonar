package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class i extends AsyncTask<g, int[], h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f49085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f49086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f49087c = new AtomicBoolean(false);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                i iVar = i.this;
                iVar.g(iVar.f49085a, i.this.f49086b);
                i.this.f49085a.f49078g.a(i.this.f49086b);
            } catch (Exception e11) {
                i.this.f49086b.f49083c = e11;
                i.this.f49085a.f49078g.a(i.this.f49086b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0346  */
    /* JADX WARN: Code duplicated, block: B:103:0x034b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0350  */
    /* JADX WARN: Code duplicated, block: B:107:0x0355  */
    public void g(g gVar, h hVar) throws Throwable {
        DataOutputStream dataOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        long j11;
        HttpURLConnection httpURLConnection2;
        long j12;
        String string;
        String string2;
        String strE;
        String str = "filename";
        String str2 = "name";
        String str3 = "\r\n--*****--\r\n";
        try {
            Object[] array = gVar.f49073b.toArray();
            boolean z11 = gVar.f49074c;
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(gVar.f49072a.openConnection()));
            boolean z12 = true;
            try {
                httpURLConnection3.setDoOutput(true);
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = gVar.f49075d.keySetIterator();
                httpURLConnection3.setRequestMethod(gVar.f49077f);
                if (!z11) {
                    httpURLConnection3.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                }
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    httpURLConnection3.setRequestProperty(strNextKey, gVar.f49075d.getString(strNextKey));
                }
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = gVar.f49076e.keySetIterator();
                String str4 = "";
                while (true) {
                    boolean z13 = z12;
                    ReadableMapKeySetIterator readableMapKeySetIterator = readableMapKeySetIteratorKeySetIterator2;
                    if (!readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                        break;
                    }
                    String strNextKey2 = readableMapKeySetIterator.nextKey();
                    boolean z14 = z11;
                    str4 = str4 + "--*****\r\nContent-Disposition: form-data; name=\"" + strNextKey2 + "\"\r\n\r\n" + gVar.f49076e.getString(strNextKey2) + "\r\n";
                    z12 = z13;
                    readableMapKeySetIteratorKeySetIterator2 = readableMapKeySetIterator;
                    z11 = z14;
                    str3 = str3;
                    httpURLConnection = httpURLConnection3;
                    dataOutputStream = null;
                    bufferedInputStream = null;
                    bufferedReader = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
                String str5 = str3;
                boolean z15 = z11;
                String[] strArr = new String[array.length];
                Iterator<ReadableMap> it = gVar.f49073b.iterator();
                String str6 = "" + str4;
                int i11 = 0;
                String str7 = str4;
                long j13 = 0;
                while (true) {
                    j11 = j13;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        ReadableMap next = it.next();
                        try {
                            string = next.getString(str2);
                            string2 = next.getString(str);
                            strE = next.getString("filetype");
                        } catch (NoSuchKeyException unused) {
                            string = next.getString(str2);
                            string2 = next.getString(str);
                            strE = e(next.getString("filepath"));
                        }
                        String str8 = string;
                        String str9 = str;
                        String str10 = string2;
                        String str11 = str2;
                        httpURLConnection2 = httpURLConnection3;
                        try {
                            long length = new File(next.getString("filepath")).length();
                            long length2 = j11 + length;
                            if (!z15) {
                                String str12 = "--*****\r\nContent-Disposition: form-data; name=\"" + str8 + "\"; filename=\"" + str10 + "\"\r\nContent-Type: " + strE + "\r\n";
                                if (array.length - 1 == i11) {
                                    length2 += (long) str5.length();
                                }
                                String str13 = "Content-length: " + length + "\r\n";
                                strArr[i11] = str12 + str13 + "\r\n";
                                str6 = str6 + str12 + str13 + "\r\n";
                            }
                            j13 = length2;
                            i11++;
                            str = str9;
                            str2 = str11;
                            httpURLConnection3 = httpURLConnection2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection2 = httpURLConnection3;
                    }
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                    dataOutputStream = null;
                    bufferedInputStream = null;
                    bufferedReader = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
                httpURLConnection2 = httpURLConnection3;
                try {
                    g.a aVar = this.f49085a.f49080i;
                    if (aVar != null) {
                        aVar.a();
                    }
                    if (z15) {
                        httpURLConnection3 = httpURLConnection2;
                    } else {
                        long length3 = j11 + ((long) (str6.length() + (array.length * 2)));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i12 = (int) length3;
                        sb2.append(i12);
                        httpURLConnection3 = httpURLConnection2;
                        httpURLConnection3.setRequestProperty("Content-length", sb2.toString());
                        httpURLConnection3.setFixedLengthStreamingMode(i12);
                    }
                    httpURLConnection3.connect();
                    dataOutputStream = new DataOutputStream(httpURLConnection3.getOutputStream());
                    try {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(dataOutputStream);
                        if (!z15) {
                            dataOutputStream.writeBytes(str7);
                        }
                        int i13 = 0;
                        int i14 = 0;
                        for (ReadableMap readableMap : gVar.f49073b) {
                            if (!z15) {
                                dataOutputStream.writeBytes(strArr[i13]);
                            }
                            File file = new File(readableMap.getString("filepath"));
                            long length4 = file.length();
                            long jCeil = (long) Math.ceil(length4 / 100.0f);
                            FileInputStream fileInputStream = new FileInputStream(file);
                            FileChannel channel = fileInputStream.getChannel();
                            long j14 = 0;
                            while (j14 < length4) {
                                long j15 = jCeil;
                                long jTransferTo = channel.transferTo(j14, j15, writableByteChannelNewChannel);
                                j14 += jTransferTo;
                                g.c cVar = this.f49085a.f49079h;
                                if (cVar != null) {
                                    int i15 = (int) (((long) i14) + jTransferTo);
                                    j12 = j11;
                                    cVar.a((int) j12, i15);
                                    i14 = i15;
                                } else {
                                    j12 = j11;
                                }
                                i13 = i13;
                                j11 = j12;
                                jCeil = j15;
                            }
                            int i16 = i13;
                            long j16 = j11;
                            if (!z15) {
                                dataOutputStream.writeBytes("\r\n");
                            }
                            i13 = i16 + 1;
                            fileInputStream.close();
                            j11 = j16;
                        }
                        if (!z15) {
                            dataOutputStream.writeBytes(str5);
                        }
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        bufferedInputStream = new BufferedInputStream(httpURLConnection3.getInputStream());
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                            try {
                                WritableMap writableMapCreateMap = Arguments.createMap();
                                for (Map.Entry<String, List<String>> entry : httpURLConnection3.getHeaderFields().entrySet()) {
                                    writableMapCreateMap.putString(entry.getKey(), entry.getValue().get(0));
                                }
                                StringBuilder sb3 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        String string3 = sb3.toString();
                                        int responseCode = httpURLConnection3.getResponseCode();
                                        h hVar2 = this.f49086b;
                                        hVar2.f49082b = writableMapCreateMap;
                                        hVar2.f49084d = string3;
                                        hVar2.f49081a = responseCode;
                                        httpURLConnection3.disconnect();
                                        dataOutputStream.close();
                                        bufferedInputStream.close();
                                        bufferedReader.close();
                                        return;
                                    }
                                    sb3.append(line);
                                    sb3.append("\n");
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                httpURLConnection = httpURLConnection3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = httpURLConnection3;
                            bufferedReader = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = httpURLConnection3;
                        bufferedInputStream = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection3 = httpURLConnection2;
                    httpURLConnection = httpURLConnection3;
                    dataOutputStream = null;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            dataOutputStream = null;
            bufferedInputStream = null;
            bufferedReader = null;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h doInBackground(g... gVarArr) {
        this.f49085a = gVarArr[0];
        this.f49086b = new h();
        new Thread(new a()).start();
        return this.f49086b;
    }

    protected String e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }

    protected void f() {
        this.f49087c.set(true);
    }
}
