package com.google.android.vending.expansion.downloader.impl;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.plaid.internal.EnumC4419g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SyncFailedException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.vending.expansion.downloader.impl.b f43243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DownloaderService f43244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f43245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.vending.expansion.downloader.impl.c f43246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f43247f;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f43251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f43252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f43253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f43254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f43255h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f43256i;

        private b() {
            this.f43248a = 0;
            this.f43249b = 0;
            this.f43251d = false;
            this.f43255h = 0;
            this.f43256i = 0L;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FileOutputStream f43258b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43261e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f43263g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f43259c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43260d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f43262f = false;

        public c(com.google.android.vending.expansion.downloader.impl.b bVar, DownloaderService downloaderService) {
            this.f43261e = 0;
            this.f43261e = bVar.f43227l;
            this.f43263g = bVar.f43216a;
            this.f43257a = downloaderService.generateTempSaveFileName(bVar.f43218c);
        }
    }

    public d(com.google.android.vending.expansion.downloader.impl.b bVar, DownloaderService downloaderService, com.google.android.vending.expansion.downloader.impl.c cVar) {
        this.f43242a = downloaderService;
        this.f43243b = bVar;
        this.f43244c = downloaderService;
        this.f43246e = cVar;
        this.f43245d = e.a(downloaderService);
        this.f43247f = "APKXDL (Linux; U; Android " + Build.VERSION.RELEASE + ";" + Locale.getDefault().toString() + "; " + Build.DEVICE + "/" + Build.ID + ")" + downloaderService.getPackageName();
    }

    private void A(int i11, boolean z11, int i12, int i13, boolean z12, String str) {
        com.google.android.vending.expansion.downloader.impl.b bVar = this.f43243b;
        bVar.f43223h = i11;
        bVar.f43226k = i12;
        bVar.f43227l = i13;
        bVar.f43222g = System.currentTimeMillis();
        if (!z11) {
            this.f43243b.f43225j = 0;
        } else if (z12) {
            this.f43243b.f43225j = 1;
        } else {
            this.f43243b.f43225j++;
        }
        this.f43245d.j(this.f43243b);
    }

    private String B() {
        return this.f43247f;
    }

    private void C(c cVar, byte[] bArr, int i11) throws C0677d {
        try {
            if (cVar.f43258b == null) {
                cVar.f43258b = new FileOutputStream(cVar.f43257a, true);
            }
            cVar.f43258b.write(bArr, 0, i11);
            f(cVar);
        } catch (IOException e11) {
            if (!ku.d.j()) {
                throw new C0677d(DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR, "external media not mounted while writing destination file");
            }
            if (ku.d.c(ku.d.f(cVar.f43257a)) < i11) {
                throw new C0677d(DownloaderService.STATUS_INSUFFICIENT_SPACE_ERROR, "insufficient space while writing destination file", e11);
            }
            throw new C0677d(DownloaderService.STATUS_FILE_ERROR, "while writing destination file: " + e11.toString(), e11);
        }
    }

    private void a(b bVar, HttpURLConnection httpURLConnection) {
        if (bVar.f43251d) {
            String str = bVar.f43250c;
            if (str != null) {
                httpURLConnection.setRequestProperty("If-Match", str);
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + bVar.f43248a + "-");
        }
    }

    private boolean b(b bVar) {
        return bVar.f43248a > 0 && bVar.f43250c == null;
    }

    private void c(c cVar) throws C0677d {
        int networkAvailabilityState = this.f43244c.getNetworkAvailabilityState(this.f43245d);
        if (networkAvailabilityState == 2) {
            throw new C0677d(195, "waiting for network to return");
        }
        if (networkAvailabilityState == 3) {
            throw new C0677d(197, "waiting for wifi");
        }
        if (networkAvailabilityState == 5) {
            throw new C0677d(195, "roaming is not allowed");
        }
        if (networkAvailabilityState == 6) {
            throw new C0677d(196, "waiting for wifi or for download over cellular to be authorized");
        }
    }

    private void d(c cVar) throws C0677d {
        if (this.f43244c.getControl() == 1 && this.f43244c.getStatus() == 193) {
            throw new C0677d(this.f43244c.getStatus(), "download paused");
        }
    }

    private void e(c cVar, int i11) {
        f(cVar);
        if (cVar.f43257a == null || !DownloaderService.isStatusError(i11)) {
            return;
        }
        new File(cVar.f43257a).delete();
        cVar.f43257a = null;
    }

    private void f(c cVar) {
        try {
            FileOutputStream fileOutputStream = cVar.f43258b;
            if (fileOutputStream != null) {
                fileOutputStream.close();
                cVar.f43258b = null;
            }
        } catch (IOException unused) {
        }
    }

    private void g(c cVar, HttpURLConnection httpURLConnection) throws C0677d {
        b bVar = new b();
        d(cVar);
        w(cVar, bVar);
        a(bVar, httpURLConnection);
        c(cVar);
        this.f43246e.onDownloadStateChanged(3);
        k(cVar, bVar, httpURLConnection, v(cVar, httpURLConnection));
        q(cVar, bVar, httpURLConnection);
        InputStream inputStreamP = p(cVar, httpURLConnection);
        this.f43246e.onDownloadStateChanged(4);
        y(cVar, bVar, new byte[4096], inputStreamP);
    }

    private void h(c cVar) throws Throwable {
        x(cVar);
        String str = cVar.f43257a;
        String strB = ku.d.b(this.f43244c, this.f43243b.f43218c);
        if (cVar.f43257a.equals(strB)) {
            return;
        }
        File file = new File(str);
        File file2 = new File(strB);
        com.google.android.vending.expansion.downloader.impl.b bVar = this.f43243b;
        long j11 = bVar.f43220e;
        if (j11 == -1 || bVar.f43221f != j11) {
            throw new C0677d(DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, "file delivered with incorrect size. probably due to network not browser configured");
        }
        if (!file.renameTo(file2)) {
            throw new C0677d(DownloaderService.STATUS_FILE_ERROR, "unable to finalize destination file");
        }
    }

    private int i(c cVar) {
        if (this.f43244c.getNetworkAvailabilityState(this.f43245d) != 1) {
            return 195;
        }
        if (this.f43243b.f43225j < 5) {
            cVar.f43259c = true;
            return 194;
        }
        Log.w("LVLDL", "reached max retries for " + this.f43243b.f43225j);
        return DownloaderService.STATUS_HTTP_DATA_ERROR;
    }

    private void j(c cVar, b bVar) throws C0677d {
        com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f43243b;
        bVar2.f43221f = bVar.f43248a;
        this.f43245d.j(bVar2);
        String str = bVar.f43252e;
        if (str == null || bVar.f43248a == Integer.parseInt(str)) {
            return;
        }
        if (!b(bVar)) {
            throw new C0677d(i(cVar), "closed socket before end of file");
        }
        throw new C0677d(DownloaderService.STATUS_CANNOT_RESUME, "mismatched content length");
    }

    private void k(c cVar, b bVar, HttpURLConnection httpURLConnection, int i11) throws C0677d {
        if (i11 == 503 && this.f43243b.f43225j < 5) {
            m(cVar, httpURLConnection);
        }
        if (i11 != (bVar.f43251d ? EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE : 200)) {
            l(cVar, bVar, i11);
        } else {
            cVar.f43261e = 0;
        }
    }

    private void l(c cVar, b bVar, int i11) throws C0677d {
        int i12;
        if (DownloaderService.isStatusError(i11)) {
            i12 = i11;
        } else if (i11 < 300 || i11 >= 400) {
            i12 = (bVar.f43251d && i11 == 200) ? DownloaderService.STATUS_CANNOT_RESUME : DownloaderService.STATUS_UNHANDLED_HTTP_CODE;
        } else {
            i12 = DownloaderService.STATUS_UNHANDLED_REDIRECT;
        }
        throw new C0677d(i12, "http error " + i11);
    }

    private void m(c cVar, HttpURLConnection httpURLConnection) throws C0677d {
        cVar.f43259c = true;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            try {
                int i11 = Integer.parseInt(headerField);
                cVar.f43260d = i11;
                if (i11 >= 0) {
                    if (i11 < 30) {
                        cVar.f43260d = 30;
                    } else if (i11 > 86400) {
                        cVar.f43260d = Strategy.TTL_SECONDS_MAX;
                    }
                    cVar.f43260d = (cVar.f43260d + ku.d.f89405a.nextInt(31)) * 1000;
                } else {
                    cVar.f43260d = 0;
                }
            } catch (NumberFormatException unused) {
            }
        }
        throw new C0677d(194, "got 503 Service Unavailable, will retry later");
    }

    private void n() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Net ");
        sb2.append(this.f43244c.getNetworkAvailabilityState(this.f43245d) == 1 ? "Up" : "Down");
        Log.i("LVLDL", sb2.toString());
    }

    private void o(int i11, boolean z11, int i12, int i13, boolean z12, String str) {
        A(i11, z11, i12, i13, z12, str);
        DownloaderService.isStatusCompleted(i11);
    }

    private InputStream p(c cVar, HttpURLConnection httpURLConnection) throws C0677d {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e11) {
            n();
            throw new C0677d(i(cVar), "while getting entity: " + e11.toString(), e11);
        }
    }

    private void q(c cVar, b bVar, HttpURLConnection httpURLConnection) throws C0677d {
        if (bVar.f43251d) {
            return;
        }
        s(cVar, bVar, httpURLConnection);
        try {
            DownloaderService downloaderService = this.f43244c;
            com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f43243b;
            cVar.f43257a = downloaderService.generateSaveFile(bVar2.f43218c, bVar2.f43220e);
            try {
                cVar.f43258b = new FileOutputStream(cVar.f43257a);
            } catch (FileNotFoundException e11) {
                try {
                    if (new File(ku.d.g(this.f43244c)).mkdirs()) {
                        cVar.f43258b = new FileOutputStream(cVar.f43257a);
                    }
                } catch (Exception unused) {
                    throw new C0677d(DownloaderService.STATUS_FILE_ERROR, "while opening destination file: " + e11.toString(), e11);
                }
            }
            z(cVar, bVar);
            c(cVar);
        } catch (DownloaderService.GenerateSaveFileError e12) {
            throw new C0677d(e12.f43207a, e12.f43208b);
        }
    }

    private int r(c cVar, b bVar, byte[] bArr, InputStream inputStream) throws C0677d {
        try {
            return inputStream.read(bArr);
        } catch (IOException e11) {
            n();
            this.f43243b.f43221f = bVar.f43248a;
            this.f43245d.j(this.f43243b);
            if (b(bVar)) {
                throw new C0677d(DownloaderService.STATUS_CANNOT_RESUME, "while reading response: " + e11.toString() + ", can't resume interrupted download with no ETag", e11);
            }
            throw new C0677d(i(cVar), "while reading response: " + e11.toString(), e11);
        }
    }

    private void s(c cVar, b bVar, HttpURLConnection httpURLConnection) throws C0677d {
        String headerField = httpURLConnection.getHeaderField("Content-Disposition");
        if (headerField != null) {
            bVar.f43253f = headerField;
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Location");
        if (headerField2 != null) {
            bVar.f43254g = headerField2;
        }
        String headerField3 = httpURLConnection.getHeaderField("ETag");
        if (headerField3 != null) {
            bVar.f43250c = headerField3;
        }
        String headerField4 = httpURLConnection.getHeaderField("Transfer-Encoding");
        if (headerField4 == null) {
            headerField4 = null;
        }
        String headerField5 = httpURLConnection.getHeaderField("Content-Type");
        if (headerField5 != null && !headerField5.equals("application/vnd.android.obb")) {
            throw new C0677d(DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, "file delivered with incorrect Mime type");
        }
        if (headerField4 == null) {
            long contentLength = httpURLConnection.getContentLength();
            if (headerField5 != null) {
                if (contentLength == -1 || contentLength == this.f43243b.f43220e) {
                    bVar.f43252e = Long.toString(contentLength);
                } else {
                    Log.e("LVLDL", "Incorrect file size delivered.");
                }
            }
        }
        if (bVar.f43252e == null) {
            if (headerField4 == null || !headerField4.equalsIgnoreCase("chunked")) {
                throw new C0677d(DownloaderService.STATUS_HTTP_DATA_ERROR, "can't know size of download, giving up");
            }
        }
    }

    private void t(c cVar, b bVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = bVar.f43248a;
        if (i11 - bVar.f43255h <= 4096 || jCurrentTimeMillis - bVar.f43256i <= 1000) {
            return;
        }
        com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f43243b;
        bVar2.f43221f = i11;
        this.f43245d.l(bVar2);
        bVar.f43255h = bVar.f43248a;
        bVar.f43256i = jCurrentTimeMillis;
        long j11 = bVar.f43249b;
        DownloaderService downloaderService = this.f43244c;
        downloaderService.notifyUpdateBytes(j11 + downloaderService.mBytesSoFar);
    }

    private int v(c cVar, HttpURLConnection httpURLConnection) throws C0677d {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            n();
            throw new C0677d(i(cVar), "while trying to execute request: " + e11.toString(), e11);
        } catch (IllegalArgumentException e12) {
            throw new C0677d(DownloaderService.STATUS_HTTP_DATA_ERROR, "while trying to execute request: " + e12.toString(), e12);
        }
    }

    private void w(c cVar, b bVar) throws C0677d {
        String str = cVar.f43257a;
        if (str != null) {
            if (!ku.d.k(str)) {
                throw new C0677d(DownloaderService.STATUS_FILE_ERROR, "found invalid internal destination filename");
            }
            File file = new File(cVar.f43257a);
            if (file.exists()) {
                long length = file.length();
                if (length == 0) {
                    file.delete();
                    cVar.f43257a = null;
                } else {
                    if (this.f43243b.f43219d == null) {
                        file.delete();
                        throw new C0677d(DownloaderService.STATUS_CANNOT_RESUME, "Trying to resume a download that can't be resumed");
                    }
                    try {
                        cVar.f43258b = new FileOutputStream(cVar.f43257a, true);
                        bVar.f43248a = (int) length;
                        long j11 = this.f43243b.f43220e;
                        if (j11 != -1) {
                            bVar.f43252e = Long.toString(j11);
                        }
                        bVar.f43250c = this.f43243b.f43219d;
                        bVar.f43251d = true;
                    } catch (FileNotFoundException e11) {
                        throw new C0677d(DownloaderService.STATUS_FILE_ERROR, "while opening destination for resuming: " + e11.toString(), e11);
                    }
                }
            }
        }
        if (cVar.f43258b != null) {
            f(cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004f A[Catch: RuntimeException -> 0x001c, IOException -> 0x0022, PHI: r4
      0x004f: PHI (r4v8 java.io.FileOutputStream) = (r4v6 java.io.FileOutputStream), (r4v9 java.io.FileOutputStream) binds: [B:32:0x004d, B:36:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x0022, RuntimeException -> 0x001c, blocks: (B:5:0x0018, B:33:0x004f, B:40:0x0092), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[Catch: RuntimeException -> 0x001c, IOException -> 0x0022, PHI: r5
      0x0092: PHI (r5v8 java.io.FileOutputStream) = (r5v6 java.io.FileOutputStream), (r5v9 java.io.FileOutputStream) binds: [B:39:0x0090, B:43:0x00b2] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x0022, RuntimeException -> 0x001c, blocks: (B:5:0x0018, B:33:0x004f, B:40:0x0092), top: B:55:0x0009 }] */
    private void x(c cVar) throws Throwable {
        FileOutputStream fileOutputStream;
        SyncFailedException e11;
        FileNotFoundException e12;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(cVar.f43257a, true);
                        try {
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                        } catch (FileNotFoundException e13) {
                            e12 = e13;
                            Log.w("LVLDL", "file " + cVar.f43257a + " not found: " + e12);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (SyncFailedException e14) {
                            e11 = e14;
                            Log.w("LVLDL", "file " + cVar.f43257a + " sync failed: " + e11);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (IOException e15) {
                            e = e15;
                            fileOutputStream2 = fileOutputStream;
                            Log.w("LVLDL", "IOException trying to sync " + cVar.f43257a + ": " + e);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (RuntimeException e16) {
                            e = e16;
                            fileOutputStream2 = fileOutputStream;
                            Log.w("LVLDL", "exception while syncing file: ", e);
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e17) {
                                Log.w("LVLDL", "IOException while closing synced file: ", e17);
                            } catch (RuntimeException e18) {
                                Log.w("LVLDL", "exception while closing file: ", e18);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e19) {
                    Log.w("LVLDL", "IOException while closing synced file: ", e19);
                } catch (RuntimeException e21) {
                    Log.w("LVLDL", "exception while closing file: ", e21);
                }
            } catch (FileNotFoundException e22) {
                fileOutputStream = null;
                e12 = e22;
            } catch (SyncFailedException e23) {
                fileOutputStream = null;
                e11 = e23;
            } catch (IOException e24) {
                e = e24;
            } catch (RuntimeException e25) {
                e = e25;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void y(c cVar, b bVar, byte[] bArr, InputStream inputStream) throws C0677d {
        while (true) {
            int iR = r(cVar, bVar, bArr, inputStream);
            if (iR == -1) {
                j(cVar, bVar);
                return;
            }
            cVar.f43262f = true;
            C(cVar, bArr, iR);
            bVar.f43248a += iR;
            bVar.f43249b += iR;
            t(cVar, bVar);
            d(cVar);
        }
    }

    private void z(c cVar, b bVar) {
        com.google.android.vending.expansion.downloader.impl.b bVar2 = this.f43243b;
        bVar2.f43219d = bVar.f43250c;
        this.f43245d.j(bVar2);
    }

    public void u() {
        int i11;
        Process.setThreadPriority(10);
        c cVar = new c(this.f43243b, this.f43244c);
        PowerManager.WakeLock wakeLockNewWakeLock = null;
        try {
            try {
                wakeLockNewWakeLock = ((PowerManager) this.f43242a.getSystemService("power")).newWakeLock(1, "org.godot.game:wakelock");
                wakeLockNewWakeLock.acquire(1200000L);
                for (boolean z11 = false; !z11; z11 = true) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(cVar.f43263g).openConnection()));
                    httpURLConnection.setRequestProperty("User-Agent", B());
                    try {
                        g(cVar, httpURLConnection);
                        httpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                }
                h(cVar);
                wakeLockNewWakeLock.release();
                i11 = 200;
            } catch (Throwable th3) {
                if (wakeLockNewWakeLock != null) {
                    wakeLockNewWakeLock.release();
                }
                e(cVar, DownloaderService.STATUS_UNKNOWN_ERROR);
                o(DownloaderService.STATUS_UNKNOWN_ERROR, cVar.f43259c, cVar.f43260d, cVar.f43261e, cVar.f43262f, cVar.f43257a);
                throw th3;
            }
        } catch (C0677d e11) {
            Log.w("LVLDL", "Aborting request for download " + this.f43243b.f43218c + ": " + e11.getMessage());
            e11.printStackTrace();
            i11 = e11.f43264a;
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.release();
            }
            e(cVar, i11);
            o(i11, cVar.f43259c, cVar.f43260d, cVar.f43261e, cVar.f43262f, cVar.f43257a);
        } catch (Throwable th4) {
            Log.w("LVLDL", "Exception for " + this.f43243b.f43218c + ": " + th4);
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.release();
            }
            i11 = DownloaderService.STATUS_UNKNOWN_ERROR;
            e(cVar, i11);
            o(i11, cVar.f43259c, cVar.f43260d, cVar.f43261e, cVar.f43262f, cVar.f43257a);
        }
        e(cVar, i11);
        o(i11, cVar.f43259c, cVar.f43260d, cVar.f43261e, cVar.f43262f, cVar.f43257a);
    }

    /* JADX INFO: renamed from: com.google.android.vending.expansion.downloader.impl.d$d, reason: collision with other inner class name */
    private class C0677d extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43264a;

        public C0677d(int i11, String str) {
            super(str);
            this.f43264a = i11;
        }

        public C0677d(int i11, String str, Throwable th2) {
            super(str, th2);
            this.f43264a = i11;
        }
    }
}
