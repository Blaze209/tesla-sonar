package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final File f23929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f23930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List<String> f23931c;

    public f(File file, int i11) {
        this(file, i11, new String[0]);
    }

    @Override // com.facebook.soloader.d0
    public String c() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.d0
    public int d(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        return g(str, i11, this.f23929a, threadPolicy);
    }

    public File f(String str) {
        File file = new File(this.f23929a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    protected int g(String str, int i11, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.f23903b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f23931c.contains(str)) {
            p.a("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File fileF = f(str);
        if (fileF == null) {
            p.f("SoLoader", str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = fileF.getCanonicalPath();
        p.a("SoLoader", str + " file found at " + canonicalPath);
        if ((i11 & 1) != 0 && (this.f23930b & 2) != 0) {
            p.a("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f23930b & 1) != 0) {
            i iVar = new i(fileF);
            try {
                t.h(str, iVar, i11, threadPolicy);
                iVar.close();
            } catch (Throwable th2) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            p.a("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f23903b.a(canonicalPath, i11);
            return 1;
        } catch (UnsatisfiedLinkError e11) {
            throw c0.b(str, e11);
        }
    }

    public void h() {
        this.f23930b |= 1;
    }

    @Override // com.facebook.soloader.d0
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f23929a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f23929a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f23930b + ']';
    }

    public f(File file, int i11, String[] strArr) {
        this.f23929a = file;
        this.f23930b = i11;
        this.f23931c = Arrays.asList(strArr);
    }
}
