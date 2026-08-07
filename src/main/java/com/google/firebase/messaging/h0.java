package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public class h0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f44300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Future<?> f44301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task<Bitmap> f44302c;

    private h0(URL url) {
        this.f44300a = url;
    }

    public static /* synthetic */ void c(h0 h0Var, TaskCompletionSource taskCompletionSource) {
        h0Var.getClass();
        try {
            taskCompletionSource.setResult(h0Var.n());
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    private byte[] o() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f44300a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = b.d(b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f44300a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static h0 p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new h0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public void B(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f44301b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.c(this.f44292a, taskCompletionSource);
            }
        });
        this.f44302c = taskCompletionSource.getTask();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44301b.cancel(true);
    }

    public Bitmap n() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f44300a);
        }
        byte[] bArrO = o();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrO, 0, bArrO.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f44300a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f44300a);
        }
        return bitmapDecodeByteArray;
    }

    public Task<Bitmap> t() {
        return (Task) Preconditions.checkNotNull(this.f44302c);
    }
}
