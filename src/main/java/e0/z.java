package e0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static Uri a(@NonNull File file, @NonNull File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri b(@NonNull File file, @NonNull c0.r0.g gVar) throws Throwable {
        ContentResolver contentResolverA = gVar.a();
        Objects.requireNonNull(contentResolverA);
        ContentValues contentValues = gVar.b() != null ? new ContentValues(gVar.b()) : new ContentValues();
        k(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri uriInsert = contentResolverA.insert(gVar.f(), contentValues);
                try {
                    if (uriInsert == null) {
                        throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
                    }
                    d(file, uriInsert, contentResolverA);
                    m(uriInsert, contentResolverA, 0);
                    return uriInsert;
                } catch (IOException e11) {
                    e = e11;
                    uri = uriInsert;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e12) {
                    e = e12;
                    uri = uriInsert;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th2) {
                    th = th2;
                    uri = uriInsert;
                    if (uri != null) {
                        m(uri, contentResolverA, 0);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (SecurityException e14) {
            e = e14;
        }
    }

    private static void c(@NonNull File file, @NonNull OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i11);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void d(@NonNull File file, @NonNull Uri uri, @NonNull ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                c(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NonNull
    static File e(@NonNull c0.r0.g gVar) {
        try {
            File fileC = gVar.c();
            if (fileC == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(fileC.getParent(), "CameraX" + UUID.randomUUID().toString() + f(fileC));
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e11);
        }
    }

    private static String f(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "";
    }

    private static boolean g(c0.r0.g gVar) {
        return gVar.c() != null;
    }

    private static boolean h(c0.r0.g gVar) {
        return (gVar.f() == null || gVar.a() == null || gVar.b() == null) ? false : true;
    }

    private static boolean i(c0.r0.g gVar) {
        return gVar.e() != null;
    }

    static Uri j(@NonNull File file, @NonNull c0.r0.g gVar) {
        Uri uriA = null;
        try {
            try {
                if (h(gVar)) {
                    uriA = b(file, gVar);
                } else if (i(gVar)) {
                    OutputStream outputStreamE = gVar.e();
                    Objects.requireNonNull(outputStreamE);
                    c(file, outputStreamE);
                } else if (g(gVar)) {
                    File fileC = gVar.c();
                    Objects.requireNonNull(fileC);
                    uriA = a(file, fileC);
                }
                file.delete();
                return uriA;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    private static void k(@NonNull ContentValues contentValues, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i11));
        }
    }

    static void l(@NonNull File file, @NonNull h0.g gVar, @NonNull c0.r0.g gVar2, int i11) {
        try {
            h0.g gVarH = h0.g.h(file);
            gVar.g(gVarH);
            if (gVarH.s() == 0 && i11 != 0) {
                gVarH.z(i11);
            }
            c0.r0.d dVarD = gVar2.d();
            if (dVarD.b()) {
                gVarH.l();
            }
            if (dVarD.c()) {
                gVarH.m();
            }
            if (dVarD.a() != null) {
                gVarH.b(dVarD.a());
            }
            gVarH.A();
        } catch (IOException e11) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e11);
        }
    }

    private static void m(@NonNull Uri uri, @NonNull ContentResolver contentResolver, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            k(contentValues, i11);
            contentResolver.update(uri, contentValues, null, null);
        }
    }
}
