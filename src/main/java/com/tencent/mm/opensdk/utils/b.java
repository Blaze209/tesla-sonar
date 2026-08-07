package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f55573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f55574b = new ThreadPoolExecutor(5, 9, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    public static int a(ContentResolver contentResolver, Uri uri) {
        Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                            return 0;
                        } catch (IOException e11) {
                            Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e11.getMessage());
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                    return iAvailable;
                } catch (IOException e12) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e12.getMessage());
                    return iAvailable;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e13) {
                        Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e13.getMessage());
                    }
                }
                throw th2;
            }
        } catch (Exception e14) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e14.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e15.getMessage());
                }
            }
            return 0;
        }
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }

    public static int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f55573a != null && str.startsWith("content")) {
            try {
                return a(f55573a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int a(String str, int i11) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return i11;
    }

    public static boolean a(int i11) {
        return i11 == 36 || i11 == 46;
    }
}
