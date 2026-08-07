package lk0;

import freemarker.core.Configurable;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public class a extends Configurable implements Cloneable {
    public static final q B;
    public static final q C;
    public static final q D;
    public static final q E;
    public static final q F;
    public static final q G;
    public static final q H;
    public static final String I;
    public static final int J;
    private static final q K;
    private static final boolean L;
    private static final Object M;
    static /* synthetic */ Class N;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final kk0.b f90049y = kk0.b.i("freemarker.cache");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String[] f90050z = {"auto_import", "auto_include", "cache_storage", "default_encoding", "incompatible_improvements", "localized_lookup", "naming_convention", "strict_syntax", "tag_syntax", "template_loader", "template_lookup_strategy", "template_name_format", "template_update_delay", "whitespace_stripping"};
    private static final String[] A = {"autoImport", "autoInclude", "cacheStorage", "defaultEncoding", "incompatibleImprovements", "localizedLookup", "namingConvention", "strictSyntax", "tagSyntax", "templateLoader", "templateLookupStrategy", "templateNameFormat", "templateUpdateDelay", "whitespaceStripping"};

    static {
        Date date;
        boolean z11 = false;
        q qVar = new q(2, 3, 0);
        B = qVar;
        C = new q(2, 3, 19);
        D = new q(2, 3, 20);
        E = new q(2, 3, 21);
        F = new q(2, 3, 22);
        G = new q(2, 3, 23);
        H = qVar;
        I = qVar.toString();
        J = qVar.c();
        try {
            Properties properties = new Properties();
            Class clsB = N;
            if (clsB == null) {
                clsB = b("freemarker.template.Configuration");
                N = clsB;
            }
            InputStream resourceAsStream = clsB.getClassLoader().getResourceAsStream("freemarker/version.properties");
            if (resourceAsStream == null) {
                throw new RuntimeException("Version file is missing.");
            }
            try {
                properties.load(resourceAsStream);
                resourceAsStream.close();
                String strF = f(properties, "version");
                String strF2 = f(properties, "buildTimestamp");
                if (strF2.endsWith("Z")) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(strF2.substring(0, strF2.length() - 1));
                    stringBuffer.append("+0000");
                    strF2 = stringBuffer.toString();
                }
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).parse(strF2);
                } catch (ParseException unused) {
                    date = null;
                }
                K = new q(strF, Boolean.valueOf(f(properties, "isGAECompliant")), date);
                try {
                    Class.forName("freemarker.core._2_4_OrLaterMarker");
                } catch (LinkageError unused2) {
                } catch (Throwable unused3) {
                }
                z11 = true;
                L = z11;
                M = new Object();
            } catch (Throwable th2) {
                resourceAsStream.close();
                throw th2;
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to load and parse freemarker/version.properties", e11);
        }
    }

    static /* synthetic */ Class b(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    static final boolean c(q qVar) {
        return true;
    }

    public static g d(q qVar) {
        return qVar.c() < r.f90079d ? g.f90058b : new e(qVar).l();
    }

    static final o e(q qVar) {
        return o.f90064c;
    }

    private static String f(Properties properties, String str) {
        String property = properties.getProperty(str);
        if (property != null) {
            return property;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Version file is corrupt: \"");
        stringBuffer.append(str);
        stringBuffer.append("\" property is missing.");
        throw new RuntimeException(stringBuffer.toString());
    }

    public static q g() {
        return K;
    }
}
