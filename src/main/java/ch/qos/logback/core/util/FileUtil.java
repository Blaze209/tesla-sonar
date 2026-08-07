package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtil extends ContextAwareBase {
    static final int BUF_SIZE = 32768;

    public FileUtil(Context context) {
        setContext(context);
    }

    public static boolean createMissingParentDirectories(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        parentFile.mkdirs();
        return parentFile.exists();
    }

    public static URL fileToURL(File file) {
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e11) {
            throw new RuntimeException("Unexpected exception on file [" + file + "]", e11);
        }
    }

    public static String prefixRelativePath(String str, String str2) {
        if (str == null || OptionHelper.isEmpty(str.trim()) || new File(str2).isAbsolute()) {
            return str2;
        }
        return str + "/" + str2;
    }

    public void copy(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        IOException e11;
        BufferedInputStream bufferedInputStream;
        IOException iOException;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int i11 = bufferedInputStream.read(bArr);
                            if (i11 != -1) {
                                bufferedOutputStream.write(bArr, 0, i11);
                            } else {
                                bufferedInputStream.close();
                                try {
                                    bufferedOutputStream.close();
                                    return;
                                } catch (IOException e12) {
                                    iOException = e12;
                                    bufferedInputStream = null;
                                    e11 = iOException;
                                    String str3 = "Failed to copy [" + str + "] to [" + str2 + "]";
                                    addError(str3, e11);
                                    throw new RolloverFailure(str3);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (bufferedOutputStream == null) {
                                throw th;
                            }
                            try {
                                bufferedOutputStream.close();
                                throw th;
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                    } catch (IOException e13) {
                        e11 = e13;
                        String str4 = "Failed to copy [" + str + "] to [" + str2 + "]";
                        addError(str4, e11);
                        throw new RolloverFailure(str4);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream2 = bufferedInputStream;
                }
            } catch (IOException e14) {
                iOException = e14;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                bufferedInputStream2 = bufferedInputStream;
            }
        } catch (IOException e15) {
            bufferedOutputStream = null;
            e11 = e15;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
    }
}
