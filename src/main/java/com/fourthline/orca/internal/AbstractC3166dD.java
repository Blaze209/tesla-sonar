package com.fourthline.orca.internal;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3166dD {
    public static final byte[] a(URI uri) {
        p013kotlin.jvm.internal.s.k(uri, "<this>");
        File file = new File(uri.getPath());
        try {
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                sn0.b.a(fileInputStream, null);
                return bArr;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            file.toString();
            return null;
        }
    }

    public static final boolean a(URI uri, byte[] content) {
        p013kotlin.jvm.internal.s.k(uri, "<this>");
        p013kotlin.jvm.internal.s.k(content, "content");
        File file = new File(uri.getPath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(content);
                jn0.h0 h0Var = jn0.h0.f84049a;
                sn0.b.a(fileOutputStream, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            file.toString();
            return false;
        }
    }

    public static final boolean a(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "<this>");
        String path = uri.getPath();
        if (path == null) {
            return true;
        }
        File file = new File(path);
        return !file.exists() || file.length() == 0;
    }
}
