package ak;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Landroid/net/Uri;", "b", "(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;", "cropper_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final String a(Context context) {
        s.k(context, "<this>");
        return context.getPackageName() + ".cropper.fileprovider";
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ed A[Catch: Exception -> 0x0067, TryCatch #7 {Exception -> 0x0067, blocks: (B:6:0x0020, B:12:0x0060, B:43:0x00ed, B:45:0x00f2, B:46:0x00f5, B:38:0x00e2, B:40:0x00e7), top: B:63:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2 A[Catch: Exception -> 0x0067, TryCatch #7 {Exception -> 0x0067, blocks: (B:6:0x0020, B:12:0x0060, B:43:0x00ed, B:45:0x00f2, B:46:0x00f5, B:38:0x00e2, B:40:0x00e7), top: B:63:0x0020 }] */
    public static final Uri b(Context context, File file) throws Throwable {
        File externalCacheDir;
        FileOutputStream fileOutputStream;
        s.k(context, "context");
        s.k(file, "file");
        String strA = a(context);
        try {
            Log.i("AIC", "Try get URI for scope storage - content://");
            Uri uriForFile = FileProvider.getUriForFile(context, strA, file);
            s.j(uriForFile, "getUriForFile(...)");
            return uriForFile;
        } catch (Exception e11) {
            try {
                Log.e("AIC", String.valueOf(e11.getMessage()));
                Log.w("AIC", "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices");
                File file2 = new File(new File(context.getCacheDir(), "CROP_LIB_CACHE"), file.getName());
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            sn0.a.b(fileInputStream2, fileOutputStream, 0, 2, null);
                            Log.i("AIC", "Completed Android N+ file copy. Attempting to return the cached file");
                            Uri uriForFile2 = FileProvider.getUriForFile(context, strA, file2);
                            s.j(uriForFile2, "getUriForFile(...)");
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return uriForFile2;
                        } catch (Exception e12) {
                            e = e12;
                            fileInputStream = fileInputStream2;
                            try {
                                Log.e("AIC", String.valueOf(e.getMessage()));
                                Log.i("AIC", "Trying to provide URI manually");
                                String str = "content://" + strA + "/files/my_images/";
                                if (Build.VERSION.SDK_INT >= 26) {
                                    Files.createDirectories(Paths.get(str, new String[0]), new FileAttribute[0]);
                                } else {
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        file3.mkdirs();
                                    }
                                }
                                Uri uri = Uri.parse(str + file.getName());
                                s.j(uri, "parse(...)");
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return uri;
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    fileOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                }
            } catch (Exception e15) {
                Log.e("AIC", String.valueOf(e15.getMessage()));
                if (Build.VERSION.SDK_INT < 29 && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Log.i("AIC", "Use External storage, do not work for OS 29 and above");
                        Uri uriFromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        s.j(uriFromFile, "fromFile(...)");
                        return uriFromFile;
                    } catch (Exception e16) {
                        Log.e("AIC", String.valueOf(e16.getMessage()));
                        Log.i("AIC", "Try get URI using file://");
                        Uri uriFromFile2 = Uri.fromFile(file);
                        s.j(uriFromFile2, "fromFile(...)");
                        return uriFromFile2;
                    }
                }
                Log.i("AIC", "Try get URI using file://");
                Uri uriFromFile3 = Uri.fromFile(file);
                s.j(uriFromFile3, "fromFile(...)");
                return uriFromFile3;
            }
        }
    }
}
