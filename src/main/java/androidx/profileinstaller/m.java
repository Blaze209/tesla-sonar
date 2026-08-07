package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.f<c> f13086a = androidx.concurrent.futures.f.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f13087b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f13088c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f13090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f13091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f13092d;

        b(int i11, int i12, long j11, long j12) {
            this.f13089a = i11;
            this.f13090b = i12;
            this.f13091c = j11;
            this.f13092d = j12;
        }

        static b a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }

        void b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f13089a);
                dataOutputStream.writeInt(this.f13090b);
                dataOutputStream.writeLong(this.f13091c);
                dataOutputStream.writeLong(this.f13092d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f13090b == bVar.f13090b && this.f13091c == bVar.f13091c && this.f13089a == bVar.f13089a && this.f13092d == bVar.f13092d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f13090b), Long.valueOf(this.f13091c), Integer.valueOf(this.f13089a), Long.valueOf(this.f13092d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f13094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f13095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f13096d;

        c(int i11, boolean z11, boolean z12, boolean z13) {
            this.f13093a = i11;
            this.f13095c = z12;
            this.f13094b = z11;
            this.f13096d = z13;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i11, boolean z11, boolean z12, boolean z13) {
        c cVar = new c(i11, z11, z12, z13);
        f13088c = cVar;
        f13086a.p(cVar);
        return f13088c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    @NonNull
    static c c(@NonNull Context context, boolean z11) {
        int i11;
        boolean z12;
        int i12;
        File file;
        boolean z13;
        File file2;
        long length;
        boolean z14;
        File file3;
        b bVarA;
        b bVar;
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z11 && (cVar = f13088c) != null) {
            return cVar;
        }
        synchronized (f13087b) {
            if (z11) {
                i11 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                assetFileDescriptorOpenFd.close();
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (!z12) {
                            i11 = 327680;
                        } else if (z13) {
                            i11 = 1;
                        } else if (z14) {
                            i11 = 2;
                        }
                    } else if (!z12) {
                        i11 = 327680;
                    } else if (z13) {
                        i11 = 1;
                    } else if (z14) {
                        i11 = 2;
                    }
                    if (z11) {
                        i11 = 2;
                    }
                    if (bVarA != null) {
                        i11 = 3;
                    }
                    int i14 = i11;
                    bVar = new b(1, i14, jA, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return b(i14, z13, z14, z12);
                }
                return b(262144, false, false, z12);
            }
            c cVar2 = f13088c;
            if (cVar2 != null) {
                return cVar2;
            }
            i11 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z12 = false;
            }
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28 && i12 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused2) {
                            return b(131072, z13, z14, z12);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f13091c == jA2 && (i13 = bVarA.f13090b) != 2) {
                        i11 = i13;
                    } else if (!z12) {
                        i11 = 327680;
                    } else if (z13) {
                        i11 = 1;
                    } else if (z14) {
                        i11 = 2;
                    }
                    if (z11 && z14 && i11 != 1) {
                        i11 = 2;
                    }
                    if (bVarA != null && bVarA.f13090b == 2 && i11 == 1 && length3 < bVarA.f13092d) {
                        i11 = 3;
                    }
                    int i15 = i11;
                    bVar = new b(1, i15, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused3) {
                            i15 = 196608;
                        }
                    }
                    return b(i15, z13, z14, z12);
                } catch (PackageManager.NameNotFoundException unused4) {
                    return b(65536, z13, z14, z12);
                }
            }
            return b(262144, false, false, z12);
            throw th;
        }
    }
}
