package jv;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.common.c0;
import com.google.firebase.crashlytics.internal.common.m;
import fv.p;
import gv.f0;
import hv.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f84339e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f84340f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j f84341g = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<? super File> f84342h = new Comparator() { // from class: jv.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f84343i = new FilenameFilter() { // from class: jv.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f84344a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f84345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lv.j f84346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f84347d;

    public e(g gVar, lv.j jVar, m mVar) {
        this.f84345b = gVar;
        this.f84346c = jVar;
        this.f84347d = mVar;
    }

    private void A(String str, long j11) {
        boolean z11;
        List<File> listR = this.f84345b.r(str, f84343i);
        if (listR.isEmpty()) {
            bv.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listR.iterator();
        loop0: while (true) {
            z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f84341g.j(y(next)));
                    if (z11 || s(next.getName())) {
                        z11 = true;
                    }
                } catch (IOException e11) {
                    bv.g.f().l("Could not add event to report for " + next, e11);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.f84345b.q(str, "report"), arrayList, j11, z11, p.l(str, this.f84345b), this.f84347d.d(str));
        } else {
            bv.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void B(@NonNull File file, @NonNull List<f0.e.d> list, long j11, boolean z11, String str, String str2) {
        try {
            j jVar = f84341g;
            f0 f0VarR = jVar.L(y(file)).v(j11, z11, str).p(str2).r(list);
            f0.e eVarN = f0VarR.n();
            if (eVarN == null) {
                return;
            }
            bv.g.f().b("appQualitySessionId: " + str2);
            D(z11 ? this.f84345b.l(eVarN.i()) : this.f84345b.n(eVarN.i()), jVar.M(f0VarR));
        } catch (IOException e11) {
            bv.g.f().l("Could not synthesize final report file for " + file, e11);
        }
    }

    private int C(String str, int i11) {
        List<File> listR = this.f84345b.r(str, new FilenameFilter() { // from class: jv.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: jv.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.v((File) obj, (File) obj2);
            }
        });
        return f(listR, i11);
    }

    private static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f84339e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void E(File file, String str, long j11) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f84339e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j11));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private SortedSet<String> e(String str) {
        this.f84345b.d();
        SortedSet<String> sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String strLast = sortedSetP.last();
                bv.g.f().b("Removing session over cap: " + strLast);
                this.f84345b.e(strLast);
                sortedSetP.remove(strLast);
            }
        }
        return sortedSetP;
    }

    private static int f(List<File> list, int i11) {
        int size = list.size();
        for (File file : list) {
            if (size <= i11) {
                break;
            }
            g.u(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i11 = this.f84346c.a().f90793a.f90805b;
        List<File> listN = n();
        int size = listN.size();
        if (size <= i11) {
            return;
        }
        Iterator<File> it = listN.subList(i11, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j11) {
        return j11 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @NonNull
    private static String m(int i11, boolean z11) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i11)) + (z11 ? "_" : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f84345b.m());
        arrayList.addAll(this.f84345b.j());
        Comparator<? super File> comparator = f84342h;
        Collections.sort(arrayList, comparator);
        List<File> listO = this.f84345b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    @NonNull
    private static String o(@NonNull String str) {
        return str.substring(0, f84340f);
    }

    private static boolean s(@NonNull String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@NonNull File file, @NonNull String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(@NonNull File file, @NonNull File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    @NonNull
    private static String y(@NonNull File file) throws IOException {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f84339e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void z(@NonNull File file, @NonNull f0.d dVar, @NonNull String str, f0.a aVar) {
        String strD = this.f84347d.d(str);
        try {
            j jVar = f84341g;
            D(this.f84345b.i(str), jVar.M(jVar.L(y(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e11) {
            bv.g.f().l("Could not synthesize final native report file for " + file, e11);
        }
    }

    public void i() {
        j(this.f84345b.o());
        j(this.f84345b.m());
        j(this.f84345b.j());
    }

    public void k(String str, long j11) {
        for (String str2 : e(str)) {
            bv.g.f().i("Finalizing report for session " + str2);
            A(str2, j11);
            this.f84345b.e(str2);
        }
        g();
    }

    public void l(String str, f0.d dVar, f0.a aVar) {
        File fileQ = this.f84345b.q(str, "report");
        bv.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        z(fileQ, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f84345b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f84345b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f84345b.o().isEmpty() && this.f84345b.m().isEmpty() && this.f84345b.j().isEmpty()) ? false : true;
    }

    @NonNull
    public List<c0> u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(c0.a(f84341g.L(y(file)), file.getName(), file));
            } catch (IOException e11) {
                bv.g.f().l("Could not load report file " + file + "; deleting", e11);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(@NonNull f0.e.d dVar, @NonNull String str, boolean z11) {
        int i11 = this.f84346c.a().f90793a.f90804a;
        try {
            D(this.f84345b.q(str, m(this.f84344a.getAndIncrement(), z11)), f84341g.k(dVar));
        } catch (IOException e11) {
            bv.g.f().l("Could not persist event for session " + str, e11);
        }
        C(str, i11);
    }

    public void x(@NonNull f0 f0Var) {
        f0.e eVarN = f0Var.n();
        if (eVarN == null) {
            bv.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            D(this.f84345b.q(strI, "report"), f84341g.M(f0Var));
            E(this.f84345b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e11) {
            bv.g.f().c("Could not persist report for session " + strI, e11);
        }
    }
}
