package lg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!¨\u0006#"}, d2 = {"Llg0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljava/io/File;", DateTokenConverter.CONVERTER_KEY, "()Ljava/io/File;", "", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "c", Action.FILE_ATTRIBUTE, "Ljn0/h0;", "h", "(Ljava/io/File;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/io/File;)Ljava/lang/String;", "text", "j", "(Ljava/io/File;Ljava/lang/String;)V", AnalyticsAttribute.Error, "g", "(Ljava/lang/Throwable;)V", "a", "()V", "e", "()Ljava/lang/String;", "", "f", "()Z", "Ljava/io/File;", "errDir", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f89983c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File errDir;

    public a(Context context) {
        s.k(context, "context");
        this.errDir = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "errors");
    }

    private final String b(Throwable th2) {
        while (th2 != null) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            s.j(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                s.j(className, "getClassName(...)");
                if (t.b0(className, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                    return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
                }
            }
            th2 = th2.getCause();
        }
        return null;
    }

    private final String c(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        s.j(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) n.l0(stackTrace);
        if (stackTraceElement == null) {
            return null;
        }
        return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
    }

    private final File d() {
        return new File(this.errDir, "last_error.txt");
    }

    private final void h(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    private final String i(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    s.j(byteArray, "toByteArray(...)");
                    Charset UTF_8 = f89983c;
                    s.j(UTF_8, "UTF_8");
                    String str = new String(byteArray, UTF_8);
                    b.a(fileInputStream, null);
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(fileInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    private final void j(File file, String text) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f89983c);
        try {
            outputStreamWriter.write(text);
            h0 h0Var = h0.f84049a;
            b.a(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    public final void a() {
        d().delete();
    }

    public final String e() {
        return i(d());
    }

    public final boolean f() {
        return d().exists();
    }

    public final void g(Throwable error) {
        s.k(error, "error");
        h(this.errDir);
        File fileD = d();
        if (fileD.isDirectory()) {
            fileD.delete();
        }
        String canonicalName = error.getClass().getCanonicalName();
        String strB = b(error);
        if (strB == null) {
            strB = c(error);
        }
        j(fileD, canonicalName + " in " + strB);
    }
}
