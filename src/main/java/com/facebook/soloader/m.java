package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class m extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f23955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f23956g;

    protected static final class a extends f0.c implements Comparable<a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ZipEntry f23957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f23958d;

        a(String str, ZipEntry zipEntry, int i11) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f23957c = zipEntry;
            this.f23958d = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f23939a.compareTo(aVar.f23939a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f23957c.equals(aVar.f23957c) && this.f23958d == aVar.f23958d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f23958d * 31) + this.f23957c.hashCode();
        }
    }

    protected class b extends f0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected a[] f23959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ZipFile f23960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f23961c;

        b(f0 f0Var) {
            this.f23960b = new ZipFile(m.this.f23955f);
            this.f23961c = f0Var;
        }

        @Override // com.facebook.soloader.f0.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f23960b.close();
        }

        @Override // com.facebook.soloader.f0.e
        public final f0.c[] n() {
            return t();
        }

        @Override // com.facebook.soloader.f0.e
        public void o(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : t()) {
                InputStream inputStream = this.f23960b.getInputStream(aVar.f23957c);
                try {
                    f0.d dVar = new f0.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        c(dVar, bArr, file);
                        dVar.close();
                    } catch (Throwable th2) {
                        try {
                            dVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th4;
                }
            }
        }

        a[] p() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(m.this.f23956g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f23960b.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f23958d) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f23961c.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] t() {
            a[] aVarArr = this.f23959a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrP = p();
            this.f23959a = aVarArrP;
            return aVarArrP;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f23955f = file;
        this.f23956g = str2;
    }

    @Override // com.facebook.soloader.f, com.facebook.soloader.d0
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.f0
    protected f0.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.f, com.facebook.soloader.d0
    public String toString() {
        try {
            return this.f23955f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f23955f.getName();
        }
    }

    public boolean v() throws IOException {
        b bVar = new b(this);
        try {
            boolean z11 = bVar.p().length != 0;
            bVar.close();
            return z11;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
