package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class G3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Float f25894b = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Float f25895c = Float.valueOf(-14.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f25896a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f25897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Float f25898b;

        public a(String str, Float f11) {
            this.f25897a = str;
            this.f25898b = f11;
        }
    }

    public G3() {
        this.f25896a = new HashMap();
    }

    public void a(String str, float f11) {
        this.f25896a.put(str, Float.valueOf(f11));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f25896a.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append("'");
            sb2.append((String) entry.getKey());
            sb2.append("' ");
            sb2.append(new DecimalFormat("#.##").format(entry.getValue()));
        }
        return sb2.toString();
    }

    public void a(G3 g11) {
        if (g11 == null) {
            return;
        }
        this.f25896a.putAll(g11.f25896a);
    }

    public G3(G3 g11) {
        this.f25896a = new HashMap(g11.f25896a);
    }

    static G3 a(String str) {
        G3 g11 = new G3();
        SA sa2 = new SA(str);
        sa2.q();
        if (sa2.a("normal")) {
            return null;
        }
        while (!sa2.c()) {
            a aVarA = a(sa2);
            if (aVarA == null) {
                return null;
            }
            g11.f25896a.put(aVarA.f25897a, aVarA.f25898b);
            sa2.p();
        }
        return g11;
    }

    private static a a(SA sa2) {
        sa2.q();
        String strJ = sa2.j();
        if (strJ == null || strJ.length() != 4) {
            return null;
        }
        sa2.q();
        if (sa2.c()) {
            return null;
        }
        return new a(strJ, Float.valueOf(sa2.g()));
    }
}
