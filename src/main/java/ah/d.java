package ah;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f1044a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f1045b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f1046c = "";

    public static synchronized void a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        d(arrayList);
    }

    public static synchronized void b(String str, String str2, String str3) {
        f1044a = str;
        f1045b = str2;
        f1046c = str3;
    }

    public static synchronized void c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e(th2));
        d(arrayList);
    }

    public static synchronized void d(List<String> list) {
        try {
            if (!sg.a.c(f1045b) && !sg.a.c(f1046c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f1046c);
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(", " + it.next());
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f1044a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f1044a, f1045b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
