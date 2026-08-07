package freemarker.core;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends Configurable {
    private static final DecimalFormat D;
    private static final lk0.p[] E;
    private static final Writer F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ArrayList f66484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final ThreadLocal f66483z = new ThreadLocal();
    private static final kk0.b A = kk0.b.i("freemarker.runtime");
    private static final kk0.b B = kk0.b.i("freemarker.runtime.attempt");
    private static final Map C = new HashMap();

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        D = decimalFormat;
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        E = new lk0.p[0];
        F = new b();
    }

    static void b(k kVar, StringBuffer stringBuffer) {
        stringBuffer.append(f.i(kVar.e(), 40));
        stringBuffer.append("  [");
        e eVarD = d(kVar);
        if (eVarD != null) {
            stringBuffer.append(f.e(eVarD, kVar.f66499b, kVar.f66498a));
        } else {
            kVar.c();
            stringBuffer.append(f.f(null, kVar.f66499b, kVar.f66498a));
        }
        stringBuffer.append("]");
    }

    public static c c() {
        return (c) f66483z.get();
    }

    private static e d(k kVar) {
        while (kVar != null) {
            if (kVar instanceof e) {
                return (e) kVar;
            }
            kVar = kVar.g();
        }
        return null;
    }

    static String f(k kVar) {
        StringBuffer stringBuffer = new StringBuffer();
        b(kVar, stringBuffer);
        return stringBuffer.toString();
    }

    static void g(k[] kVarArr, boolean z11, Writer writer) {
        PrintWriter printWriter = (PrintWriter) (writer instanceof PrintWriter ? writer : null);
        try {
            if (kVarArr == null) {
                writer.write("(The stack was empty)");
                if (printWriter != null) {
                    printWriter.println();
                    return;
                } else {
                    writer.write(10);
                    return;
                }
            }
            int length = kVarArr.length;
            int i11 = (!z11 || length <= 10) ? length : 9;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < length) {
                k kVar = kVarArr[i12];
                if (i12 > 1) {
                    k kVar2 = kVarArr[i12 - 1];
                }
                if (i14 < i11) {
                    writer.write(i12 == 0 ? "\t- Failed at: " : "\t- Reached through: ");
                    writer.write(f(kVar));
                    if (printWriter != null) {
                        printWriter.println();
                    } else {
                        writer.write(10);
                    }
                    i14++;
                } else {
                    i13++;
                }
                i12++;
            }
            if (i13 > 0) {
                writer.write("\t... (Had ");
                writer.write(String.valueOf(i13));
                writer.write(" more, hidden for tersenes)");
                if (printWriter != null) {
                    printWriter.println();
                } else {
                    writer.write(10);
                }
            }
        } catch (IOException e11) {
            A.f("Failed to print FTL stack trace", e11);
        }
    }

    static void h(c cVar) {
        f66483z.set(cVar);
    }

    k[] e() {
        int size = this.f66484y.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            k kVar = (k) this.f66484y.get(i12);
            if (i12 == size || kVar.h()) {
                i11++;
            }
        }
        if (i11 == 0) {
            return null;
        }
        k[] kVarArr = new k[i11];
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < size; i14++) {
            k kVar2 = (k) this.f66484y.get(i14);
            if (i14 == size || kVar2.h()) {
                kVarArr[i13] = kVar2;
                i13--;
            }
        }
        return kVarArr;
    }
}
