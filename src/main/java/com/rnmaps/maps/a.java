package com.rnmaps.maps;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AsyncTask<String, Void, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f49124a;

    public a(Context context) {
        this.f49124a = context;
    }

    private InputStream b(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("FileUtil", "temp", context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(uri.toString()));
        try {
            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    fileOutputStream.close();
                    readableByteChannelNewChannel.close();
                    inputStreamOpenStream.close();
                    return fileInputStream;
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                readableByteChannelNewChannel.close();
                throw th3;
            }
        } catch (Throwable th4) {
            inputStreamOpenStream.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InputStream doInBackground(String... strArr) {
        try {
            Uri uri = Uri.parse(strArr[0]);
            return uri.getScheme().startsWith("http") ? b(this.f49124a, uri) : this.f49124a.getContentResolver().openInputStream(uri);
        } catch (Exception e11) {
            qk.a.n("ReactNative", "Could not retrieve file for contentUri " + strArr[0], e11);
            return null;
        }
    }
}
