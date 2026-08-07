package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends f implements com.facebook.soloader.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Context f23932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f23933e;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f23935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f23936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f23937c;

        b(boolean z11, File file, n nVar) {
            this.f23935a = z11;
            this.f23936b = file;
            this.f23937c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f23935a) {
                        SysUtil.f(f0.this.f23929a);
                    }
                    f0.u(this.f23936b, (byte) 1, this.f23935a);
                } finally {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + f0.this.f23929a + " (from syncer thread)");
                    this.f23937c.close();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23940b;

        public c(String str, String str2) {
            this.f23939a = str;
            this.f23940b = str2;
        }
    }

    protected static final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f23941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InputStream f23942b;

        public d(c cVar, InputStream inputStream) {
            this.f23941a = cVar;
            this.f23942b = inputStream;
        }

        public int available() {
            return this.f23942b.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f23942b.close();
        }

        public c n() {
            return this.f23941a;
        }
    }

    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void c(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.n().f23939a);
            File file2 = new File(file, dVar.n().f23939a);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = dVar.available();
                        if (iAvailable > 1) {
                            SysUtil.d(randomAccessFile.getFD(), iAvailable);
                        }
                        SysUtil.a(randomAccessFile, dVar.f23942b, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (!file2.setExecutable(true, false)) {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                        randomAccessFile.close();
                        if (!file2.exists() || file2.setWritable(false)) {
                            return;
                        }
                        p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException e11) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e11);
                    SysUtil.c(file2);
                    throw e11;
                }
            } catch (Throwable th4) {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
                throw th4;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract c[] n();

        public abstract void o(File file);
    }

    protected f0(Context context, String str, boolean z11) {
        super(p(context, str), z11 ? 1 : 0);
        this.f23932d = context;
    }

    private void j() throws IOException {
        File[] fileArrListFiles = this.f23929a.listFiles(new a());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f23929a);
        }
        for (File file : fileArrListFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean m(int i11) {
        return (i11 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    private boolean r(n nVar, int i11) throws IOException {
        byte b11;
        File file = new File(this.f23929a, "dso_state");
        byte[] bArrN = n();
        if (m(i11) || k(bArrN)) {
            b11 = 0;
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b11 = randomAccessFile.readByte();
                        if (b11 == 1) {
                            p.f("fb-UnpackingSoSource", "dso store " + this.f23929a + " regeneration not needed: state file clean");
                        } else {
                            b11 = 0;
                        }
                    } catch (IOException e11) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f23929a + " regeneration interrupted: " + e11.getMessage());
                    }
                } else {
                    b11 = 0;
                }
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (b11 == 1) {
            return false;
        }
        boolean z11 = (i11 & 4) == 0;
        p.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        u(file, (byte) 0, z11);
        j();
        e eVarQ = q();
        try {
            eVarQ.o(this.f23929a);
            eVarQ.close();
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(this.f23929a, "dso_deps"), "rw");
            try {
                randomAccessFile2.write(bArrN);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                randomAccessFile2.close();
                b bVar = new b(z11, file, nVar);
                if (s(i11)) {
                    new Thread(bVar, "SoSync:" + this.f23929a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } catch (Throwable th4) {
                try {
                    randomAccessFile2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    private static boolean s(int i11) {
        return (i11 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(File file, byte b11, boolean z11) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b11);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z11) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (SyncFailedException e11) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e11);
        }
    }

    @Override // com.facebook.soloader.b
    public void a() throws Throwable {
        try {
            n nVarI = SysUtil.i(this.f23929a, new File(this.f23929a, "dso_lock"));
            if (nVarI != null) {
                nVarI.close();
            }
        } catch (Exception e11) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f23929a + "): ", e11);
        }
    }

    @Override // com.facebook.soloader.d0
    public void e(int i11) throws IOException {
        SysUtil.m(this.f23929a);
        if (!this.f23929a.canWrite() && !this.f23929a.setWritable(true)) {
            throw new IOException("error adding " + this.f23929a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n nVarI = SysUtil.i(this.f23929a, new File(this.f23929a, "dso_lock"));
                try {
                    p.f("fb-UnpackingSoSource", "locked dso store " + this.f23929a);
                    if (!this.f23929a.canWrite() && !this.f23929a.setWritable(true)) {
                        throw new IOException("error adding " + this.f23929a.getCanonicalPath() + " write permission");
                    }
                    if (!r(nVarI, i11)) {
                        p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f23929a);
                        nVar = nVarI;
                    }
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f23929a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f23929a + " (syncer thread started)");
                    }
                    if (!this.f23929a.canWrite() || this.f23929a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f23929a.getCanonicalPath() + " write permission");
                } catch (Throwable th2) {
                    th = th2;
                    nVar = nVarI;
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f23929a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f23929a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (!this.f23929a.canWrite() || this.f23929a.setWritable(false)) {
                    throw th3;
                }
                throw new IOException("error removing " + this.f23929a.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    protected boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f23929a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean zL = l(bArr2, bArr);
                        randomAccessFile.close();
                        return zL;
                    }
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e11);
            return true;
        }
    }

    protected boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarQ = q();
        try {
            c[] cVarArrN = eVarQ.n();
            parcelObtain.writeInt(cVarArrN.length);
            for (c cVar : cVarArrN) {
                parcelObtain.writeString(cVar.f23939a);
                parcelObtain.writeString(cVar.f23940b);
            }
            eVarQ.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public c[] o() {
        e eVarQ = q();
        try {
            c[] cVarArrN = eVarQ.n();
            eVarQ.close();
            return cVarArrN;
        } catch (Throwable th2) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected abstract e q();

    public void t(String[] strArr) {
        this.f23933e = strArr;
    }

    protected f0(Context context, String str) {
        this(context, str, true);
    }
}
