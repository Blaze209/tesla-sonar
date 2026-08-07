package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class c extends f0 implements v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<m> f23920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f23921g;

    protected class a extends f0.e {
        protected a() {
        }

        @Override // com.facebook.soloader.f0.e
        public f0.c[] n() {
            ArrayList arrayList = new ArrayList();
            Iterator it = c.this.f23920f.iterator();
            while (it.hasNext()) {
                f0.e eVarQ = ((m) it.next()).q();
                try {
                    arrayList.addAll(Arrays.asList(eVarQ.n()));
                    eVarQ.close();
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
            return (f0.c[]) arrayList.toArray(new f0.c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.f0.e
        public void o(File file) throws IOException {
            Iterator it = c.this.f23920f.iterator();
            while (it.hasNext()) {
                m.b bVar = (m.b) ((m) it.next()).q();
                try {
                    bVar.o(file);
                    bVar.close();
                } catch (Throwable th2) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    public c(Context context, String str, boolean z11) {
        super(context, str, z11);
        ArrayList<m> arrayList = new ArrayList<>();
        this.f23920f = arrayList;
        this.f23921g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2), "^lib/([^/]+)/([^/]+\\.so)$");
                if (mVar.v()) {
                    p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                    this.f23920f.add(mVar);
                }
            }
        } catch (IOException e11) {
            p.h("BackupSoSource", "failed to read split apks", e11);
        }
    }

    @Override // com.facebook.soloader.v
    public d0 b(Context context) {
        c cVar = new c(context, this.f23929a.getName());
        try {
            cVar.e(0);
            return cVar;
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.facebook.soloader.f, com.facebook.soloader.d0
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.f, com.facebook.soloader.d0
    public int d(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f23921g) {
            return super.d(str, i11, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.f0, com.facebook.soloader.d0
    public void e(int i11) throws IOException {
        if ((i11 & 8) != 0) {
            return;
        }
        super.e(i11);
        this.f23921g = true;
    }

    @Override // com.facebook.soloader.f0
    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.g(this.f23932d));
            parcelObtain.writeInt(this.f23920f.size());
            Iterator<m> it = this.f23920f.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(it.next().n());
            }
            String str = this.f23932d.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.f0
    public f0.c[] o() {
        f0.e eVarQ = this.f23920f.get(0).q();
        try {
            f0.c[] cVarArrN = eVarQ.n();
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

    @Override // com.facebook.soloader.f0
    protected f0.e q() {
        return new a();
    }

    @Override // com.facebook.soloader.f, com.facebook.soloader.d0
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f23929a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f23929a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f23930b + " apks = " + this.f23920f.toString() + "]";
    }

    public boolean x(String str, int i11) throws IOException {
        boolean z11;
        f0.e eVarQ = q();
        try {
            f0.c[] cVarArrN = eVarQ.n();
            int length = cVarArrN.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z11 = false;
                    break;
                }
                if (cVarArrN[i12].f23939a.equals(str)) {
                    p.b("SoLoader", "Found " + str + " in " + c());
                    z11 = true;
                    break;
                }
                i12++;
            }
            eVarQ.close();
            if (!z11) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i11);
            return true;
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

    public c(Context context, String str) {
        this(context, str, true);
    }
}
