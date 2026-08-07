package io.sentry.config;

import io.sentry.util.f0;
import io.sentry.util.y;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Properties f80424b;

    protected a(String str, Properties properties) {
        this.f80423a = (String) y.c(str, "prefix is required");
        this.f80424b = (Properties) y.c(properties, "properties are required");
    }

    @Override // io.sentry.config.f
    public Map<String, String> getMap(String str) {
        String str2 = this.f80423a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f80424b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), f0.f((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        return f0.f(this.f80424b.getProperty(this.f80423a + str), "\"");
    }

    protected a(Properties properties) {
        this("", properties);
    }
}
