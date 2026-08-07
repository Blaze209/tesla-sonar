package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AssetManager f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f13056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final h.c f13057c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final File f13059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final String f13060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final String f13061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final String f13062h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d[] f13064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f13065k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13063i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f13058d = d();

    public c(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull h.c cVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f13055a = assetManager;
        this.f13056b = executor;
        this.f13057c = cVar;
        this.f13060f = str;
        this.f13061g = str2;
        this.f13062h = str3;
        this.f13059e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f13055a, this.f13062h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f13064j = l.r(inputStreamG, l.p(inputStreamG, l.f13085b), bArr, dVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th2) {
                try {
                    inputStreamG.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e11) {
            this.f13057c.a(9, e11);
        } catch (IOException e12) {
            this.f13057c.a(7, e12);
        } catch (IllegalStateException e13) {
            this.f13064j = null;
            this.f13057c.a(8, e13);
        }
    }

    private void c() {
        if (!this.f13063i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            return n.f13097a;
        }
        switch (i11) {
            case 24:
            case 25:
                return n.f13101e;
            case 26:
                return n.f13100d;
            case 27:
                return n.f13099c;
            case 28:
            case 29:
            case 30:
                return n.f13098b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f13061g);
        } catch (FileNotFoundException e11) {
            this.f13057c.a(6, e11);
            return null;
        } catch (IOException e12) {
            this.f13057c.a(7, e12);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e11) {
            String message = e11.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f13057c.b(5, null);
            }
            return null;
        }
    }

    private d[] i(InputStream inputStream) {
        try {
            try {
                try {
                    d[] dVarArrX = l.x(inputStream, l.p(inputStream, l.f13084a), this.f13060f);
                    try {
                        inputStream.close();
                        return dVarArrX;
                    } catch (IOException e11) {
                        this.f13057c.a(7, e11);
                        return dVarArrX;
                    }
                } catch (IllegalStateException e12) {
                    this.f13057c.a(8, e12);
                    try {
                        inputStream.close();
                    } catch (IOException e13) {
                        this.f13057c.a(7, e13);
                    }
                    return null;
                }
            } catch (IOException e14) {
                this.f13057c.a(7, e14);
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e15) {
                this.f13057c.a(7, e15);
            }
            throw th2;
        }
    }

    private static boolean j() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 31 || i11 == 24 || i11 == 25;
    }

    private void k(final int i11, final Object obj) {
        this.f13056b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f13052a.f13057c.a(i11, obj);
            }
        });
    }

    public boolean e() {
        if (this.f13058d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f13059e.exists()) {
            try {
                if (!this.f13059e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f13059e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f13063i = true;
        return true;
    }

    @NonNull
    public c h() {
        c cVarB;
        c();
        if (this.f13058d != null) {
            InputStream inputStreamF = f(this.f13055a);
            if (inputStreamF != null) {
                this.f13064j = i(inputStreamF);
            }
            d[] dVarArr = this.f13064j;
            if (dVarArr != null && j() && (cVarB = b(dVarArr, this.f13058d)) != null) {
                return cVarB;
            }
        }
        return this;
    }

    @NonNull
    public c l() {
        d[] dVarArr = this.f13064j;
        byte[] bArr = this.f13058d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    l.F(byteArrayOutputStream, bArr);
                    if (!l.C(byteArrayOutputStream, bArr, dVarArr)) {
                        this.f13057c.a(5, null);
                        this.f13064j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f13065k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f13064j = null;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                this.f13057c.a(7, e11);
            } catch (IllegalStateException e12) {
                this.f13057c.a(8, e12);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f13065k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f13059e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                e.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f13065k = null;
                                this.f13064j = null;
                                return true;
                            } catch (Throwable th2) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            } catch (FileNotFoundException e11) {
                k(6, e11);
                this.f13065k = null;
                this.f13064j = null;
                return false;
            } catch (IOException e12) {
                k(7, e12);
                this.f13065k = null;
                this.f13064j = null;
                return false;
            }
        } catch (Throwable th10) {
            this.f13065k = null;
            this.f13064j = null;
            throw th10;
        }
    }
}
