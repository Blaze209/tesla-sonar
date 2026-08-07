package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, u> f44761c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44763b;

    private u(Context context, String str) {
        this.f44762a = context;
        this.f44763b = str;
    }

    public static synchronized u c(Context context, String str) {
        Map<String, u> map;
        try {
            map = f44761c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(str);
    }

    public synchronized Void a() {
        this.f44762a.deleteFile(this.f44763b);
        return null;
    }

    String b() {
        return this.f44763b;
    }

    public synchronized g d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            try {
                fileInputStreamOpenFileInput = this.f44762a.openFileInput(this.f44763b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    g gVarB = g.b(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return gVarB;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th5) {
            fileInputStreamOpenFileInput = null;
            th2 = th5;
        }
    }

    public synchronized Void e(g gVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f44762a.openFileOutput(this.f44763b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(gVar.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th2) {
            fileOutputStreamOpenFileOutput.close();
            throw th2;
        }
        return null;
    }
}
