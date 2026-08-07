package io.sentry.android.core.internal.util;

import io.sentry.d1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m f79528c = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f79529a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Integer> f79530b = new ArrayList();

    private m() {
    }

    public static m a() {
        return f79528c;
    }

    String b() {
        return "/sys/devices/system/cpu";
    }

    public List<Integer> c() {
        d1 d1VarA = this.f79529a.a();
        try {
            if (!this.f79530b.isEmpty()) {
                List<Integer> list = this.f79530b;
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(b()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strC = io.sentry.util.i.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strC != null) {
                            this.f79530b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            List<Integer> list2 = this.f79530b;
            if (d1VarA != null) {
                d1VarA.close();
            }
            return list2;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
