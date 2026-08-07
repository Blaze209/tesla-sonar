package wd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import ie0.q;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\fJ#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\fJ)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006#"}, d2 = {"Lwd0/e;", "", "<init>", "()V", "Ljava/io/File;", "parent", "", "c", "(Ljava/io/File;)Ljava/util/List;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "(Landroid/content/Context;)Ljava/io/File;", "f", "Ljn0/h0;", "j", "(Landroid/content/Context;)V", "e", "(Landroid/content/Context;)Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "", "reportId", "g", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "h", "logFiles", "k", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "", "Z", "initialized", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f121681a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("ReportFileManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean initialized;

    private e() {
    }

    private final File b(Context context) {
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        File fileH = h(applicationContext);
        if (!fileH.exists()) {
            fileH.mkdirs();
        }
        return fileH;
    }

    private final List<File> c(File parent) {
        List<File> listF1;
        ArrayList arrayList = new ArrayList();
        if (parent.isDirectory()) {
            File[] fileArrListFiles = parent.listFiles();
            if (fileArrListFiles != null && (listF1 = n.F1(fileArrListFiles)) != null) {
                for (File file : listF1) {
                    if (file.isFile()) {
                        s.h(file);
                        arrayList.add(file);
                    } else {
                        e eVar = f121681a;
                        s.h(file);
                        arrayList.addAll(eVar.c(file));
                    }
                }
            }
        } else if (parent.isFile()) {
            arrayList.add(parent);
        }
        return arrayList;
    }

    private final File f(Context context) {
        return new File(context.getCacheDir().getAbsolutePath() + File.separator + "logs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(String str, List list, List list2, boolean z11, String line) {
        s.k(line, "line");
        return cd0.a.c(line, str, list, list2, z11);
    }

    public final File d(Context context) {
        Object obj;
        s.k(context, "context");
        Iterator<T> it = i(context).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jLastModified = ((File) next).lastModified();
                do {
                    Object next2 = it.next();
                    long jLastModified2 = ((File) next2).lastModified();
                    if (jLastModified < jLastModified2) {
                        next = next2;
                        jLastModified = jLastModified2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (File) obj;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[SYNTHETIC] */
    public final List<File> e(Context context) {
        List<File> arrayList;
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        File[] fileArrListFiles = f(applicationContext).listFiles();
        if (fileArrListFiles == null || (arrayList = n.F1(fileArrListFiles)) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("No log files found...");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        ArrayList<File> arrayList2 = new ArrayList();
        for (File file : arrayList) {
            e eVar = f121681a;
            s.h(file);
            v.E(arrayList2, eVar.c(file));
        }
        ArrayList arrayList3 = new ArrayList();
        for (File file2 : arrayList2) {
            if (file2.exists() && file2.isFile()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - file2.lastModified();
                if (jCurrentTimeMillis <= 432000000) {
                    logger.a("using " + file2.getName() + " last modified " + (jCurrentTimeMillis / ((long) 1000)) + " seconds ago.");
                } else if (file2.delete()) {
                    logger.a("deleted " + file2.getName() + " as it is " + ((jCurrentTimeMillis / ((long) 1000)) / 60.0d) + " minutes old.");
                } else {
                    com.tesla.logging.g gVar2 = logger;
                    String str = "failed to delete " + file2.getName() + ".";
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String tag2 = gVar2.getTag();
                    String strG2 = gVar2.g(str);
                    zb0.a aVar2 = zb0.a.f128044a;
                    Map mapF2 = v0.f(x.a(tag2, strG2));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : mapF2.entrySet()) {
                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception(strG2));
                    TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                    vr0.a.INSTANCE.a(strG2, new Object[0]);
                }
                if (file2 != null) {
                    arrayList3.add(file2);
                }
            } else {
                com.tesla.logging.g gVar3 = logger;
                String str2 = "log file " + file2.getName() + " is not a file or doesn't exist apparently.";
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String tag3 = gVar3.getTag();
                String strG3 = gVar3.g(str2);
                zb0.a aVar3 = zb0.a.f128044a;
                Map mapF3 = v0.f(x.a(tag3, strG3));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : mapF3.entrySet()) {
                    zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(strG3));
                TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                vr0.a.INSTANCE.a(strG3, new Object[0]);
            }
            file2 = null;
            if (file2 != null) {
                arrayList3.add(file2);
            }
        }
        return arrayList3;
    }

    public final List<File> g(Context context, String reportId) {
        s.k(context, "context");
        s.k(reportId, "reportId");
        File[] fileArrListFiles = h(context).listFiles();
        if (fileArrListFiles == null) {
            return v.m();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                String name = file.getName();
                s.j(name, "getName(...)");
                if (t.h0(name, reportId, false, 2, null)) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public final File h(Context context) {
        s.k(context, "context");
        return new File(context.getCacheDir().getAbsolutePath() + File.separator + "reports");
    }

    public final List<File> i(Context context) {
        s.k(context, "context");
        File[] fileArrListFiles = h(context).listFiles();
        if (fileArrListFiles == null) {
            return v.m();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            s.h(file);
            if (q.c(file)) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public final void j(Context context) {
        s.k(context, "context");
        if (initialized) {
            return;
        }
        initialized = true;
        Context applicationContext = context.getApplicationContext();
        s.h(applicationContext);
        b(applicationContext);
    }

    public final List<File> k(Context context, List<? extends File> logFiles) {
        s.k(context, "context");
        s.k(logFiles, "logFiles");
        final String strG = he0.b.m(context).g();
        if (strG == null) {
            strG = "";
        }
        l lVar = l.f121695a;
        final List<String> listG = lVar.g();
        final List<String> listE = lVar.e();
        ArrayList arrayList = new ArrayList();
        for (File file : logFiles) {
            File file2 = null;
            try {
                File file3 = new File(context.getCacheDir(), "redacted-" + sn0.h.D(file) + ".log");
                file3.createNewFile();
                Charset charset = p013kotlin.text.d.UTF_8;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), charset), PKIFailureInfo.certRevoked);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), PKIFailureInfo.certRevoked);
                    try {
                        final boolean z11 = true;
                        bufferedWriter.write(ho0.l.R(r.d(bufferedReader), "\n", null, null, 0, null, new wn0.l() { // from class: wd0.d
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return e.l(strG, listG, listE, z11, (String) obj);
                            }
                        }, 30, null));
                        bufferedWriter.newLine();
                        h0 h0Var = h0.f84049a;
                        sn0.b.a(bufferedReader, null);
                        sn0.b.a(bufferedWriter, null);
                        file2 = file3;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        sn0.b.a(bufferedWriter, th4);
                        throw th5;
                    }
                }
            } catch (Exception e11) {
                com.tesla.logging.g gVar = logger;
                String str = "Failed to write clean log file: " + file.getName() + ", exception: " + e11;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG2 = gVar.g(str);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG2));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
            }
            if (file2 != null) {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }
}
