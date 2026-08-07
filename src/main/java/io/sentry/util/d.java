package io.sentry.util;

import io.sentry.b7;
import io.sentry.q7;
import io.sentry.z6;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f81455a = "sentry-debug-meta.properties";

    public static void a(q7 q7Var, List<Properties> list) {
        if (list != null) {
            f(q7Var, list);
            b(q7Var, list);
            d(q7Var, list);
        }
    }

    private static void b(q7 q7Var, List<Properties> list) {
        for (Properties properties : list) {
            String strG = g(properties);
            if (strG != null) {
                String strH = h(properties);
                if (strH == null) {
                    strH = "unknown";
                }
                q7Var.getLogger().c(b7.DEBUG, "Build tool found: %s, version %s", strG, strH);
                z6.d().b(strG, strH);
                return;
            }
        }
    }

    private static void c(q7 q7Var, List<Properties> list) {
        if (q7Var.getBundleIds().isEmpty()) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String property = it.next().getProperty("io.sentry.bundle-ids");
                q7Var.getLogger().c(b7.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        q7Var.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void d(q7 q7Var, List<Properties> list) {
        for (Properties properties : list) {
            String strK = k(properties);
            String strL = l(properties);
            String strI = i(properties);
            String strJ = j(properties);
            if (strK != null || strL != null || strI != null || strJ != null) {
                q7.g distribution = q7Var.getDistribution();
                if (strK != null && !strK.isEmpty() && distribution.f81128b.isEmpty()) {
                    q7Var.getLogger().c(b7.DEBUG, "Distribution org slug found: %s", strK);
                    distribution.f81128b = strK;
                }
                if (strL != null && !strL.isEmpty() && distribution.f81129c.isEmpty()) {
                    q7Var.getLogger().c(b7.DEBUG, "Distribution project slug found: %s", strL);
                    distribution.f81129c = strL;
                }
                if (strI != null && !strI.isEmpty() && distribution.f81127a.isEmpty()) {
                    q7Var.getLogger().c(b7.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.f81127a = strI;
                }
                if (strJ == null || strJ.isEmpty() || distribution.f81131e != null) {
                    return;
                }
                q7Var.getLogger().c(b7.DEBUG, "Distribution build configuration found: %s", strJ);
                distribution.f81131e = strJ;
                return;
            }
        }
    }

    private static void e(q7 q7Var, List<Properties> list) {
        if (q7Var.getProguardUuid() == null) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String strM = m(it.next());
                if (strM != null) {
                    q7Var.getLogger().c(b7.DEBUG, "Proguard UUID found: %s", strM);
                    q7Var.setProguardUuid(strM);
                    return;
                }
            }
        }
    }

    public static void f(q7 q7Var, List<Properties> list) {
        if (list != null) {
            c(q7Var, list);
            e(q7Var, list);
        }
    }

    public static String g(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String h(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    private static String i(Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    private static String j(Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    private static String k(Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    private static String l(Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    public static String m(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
