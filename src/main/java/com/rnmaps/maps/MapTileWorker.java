package com.rnmaps.maps;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class MapTileWorker extends Worker {
    public MapTileWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    private byte[] h(URL url) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ?? r11;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        try {
            try {
                InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i11 = inputStreamOpenStream.read(bArr, 0, 16384);
                            if (i11 == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i11);
                        }
                        byteArrayOutputStream2.flush();
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused2) {
                        }
                        return byteArray;
                    } catch (IOException e11) {
                        e = e11;
                        inputStream = inputStreamOpenStream;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        inputStream = inputStreamOpenStream;
                        e.printStackTrace();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    byteArrayOutputStream2 = null;
                    inputStream = inputStreamOpenStream;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (OutOfMemoryError e14) {
                    e = e14;
                    byteArrayOutputStream2 = null;
                    inputStream = inputStreamOpenStream;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    th2 = th3;
                    r11 = inputStreamOpenStream;
                    if (r11 != 0) {
                        try {
                            r11.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th2;
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th2;
                    } catch (Exception unused6) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                r11 = url;
            }
        } catch (IOException e15) {
            e = e15;
            inputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            return null;
        } catch (OutOfMemoryError e16) {
            e = e16;
            inputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            return null;
        } catch (Throwable th5) {
            byteArrayOutputStream = null;
            th2 = th5;
            r11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private boolean i(byte[] bArr, String str) throws Throwable {
        if (str == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                file.getParentFile().mkdirs();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return true;
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return false;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (OutOfMemoryError e14) {
            e = e14;
        }
    }

    @Override // androidx.work.Worker
    public androidx.work.y.a d() throws Throwable {
        String strI = getInputData().i("filename");
        try {
            int iF = getInputData().f("maxAge", 0);
            if (iF >= 0) {
                if ((System.currentTimeMillis() - new File(strI).lastModified()) / 1000 < iF) {
                    return androidx.work.y.a.a();
                }
            }
            try {
                byte[] bArrH = h(new URL(getInputData().i(ImagesContract.URL)));
                if (bArrH == null) {
                    return androidx.work.y.a.d();
                }
                if (!i(bArrH, strI)) {
                    return androidx.work.y.a.a();
                }
                Log.d("urlTile", "Worker fetched " + strI);
                return androidx.work.y.a.e();
            } catch (MalformedURLException e11) {
                throw new AssertionError(e11);
            }
        } catch (Error unused) {
            return androidx.work.y.a.a();
        }
    }
}
