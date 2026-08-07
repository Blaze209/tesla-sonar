package wp;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import xp.i;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Set<String> f122168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final wp.b.InterfaceC2624b f122169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final wp.b.a f122170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f122171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f122172e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f122173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f122174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f122175c;

        a(Context context, String str, String str2, wp.b.c cVar) {
            this.f122173a = context;
            this.f122174b = str;
            this.f122175c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                wp.c r1 = wp.c.this     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f122173a     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f122174b     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f122175c     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                wp.c.a(r1, r2, r3, r4)     // Catch: com.getkeepsafe.relinker.MissingLibraryException -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wp.c.a.run():void");
        }
    }

    class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f122177a;

        b(String str) {
            this.f122177a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f122177a);
        }
    }

    protected c() {
        this(new d(), new wp.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) throws Throwable {
        c cVar;
        Context context2;
        i iVar;
        if (this.f122168a.contains(str) && !this.f122171d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f122169b.d(str);
            this.f122168a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e11) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e11));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f122171d) {
                if (this.f122171d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                cVar = this;
                context2 = context;
                this.f122170c.a(context2, this.f122169b.b(), this.f122169b.e(str), fileD, cVar);
            } else {
                cVar = this;
                context2 = context;
            }
            try {
                if (cVar.f122172e) {
                    try {
                        iVar = new i(fileD);
                        try {
                            List<String> listO = iVar.o();
                            iVar.close();
                            Iterator<String> it = listO.iterator();
                            while (it.hasNext()) {
                                e(context2, cVar.f122169b.a(it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            iVar.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            cVar.f122169b.c(fileD.getAbsolutePath());
            cVar.f122168a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f122169b.e(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f122171d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String strE = this.f122169b.e(str);
        if (e.a(str2)) {
            return new File(c(context), strE);
        }
        return new File(c(context), strE + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, wp.b.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (e.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (cVar == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected c(wp.b.InterfaceC2624b interfaceC2624b, wp.b.a aVar) {
        this.f122168a = new HashSet();
        if (interfaceC2624b == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f122169b = interfaceC2624b;
        this.f122170c = aVar;
    }

    public void h(String str) {
    }
}
