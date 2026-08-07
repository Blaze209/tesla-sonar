package ef0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lef0/l;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "(Landroid/content/Context;)D", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "a", "(D)Ljava/lang/String;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f62909a = new l();

    private l() {
    }

    private final String a(double d11) {
        t0 t0Var = t0.f86535a;
        String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
        s.j(str, "format(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public static final String b(Context context) {
        double length;
        File file;
        s.k(context, "context");
        File[] fileArrListFiles = context.getFilesDir().listFiles();
        if (fileArrListFiles != null) {
            int length2 = fileArrListFiles.length;
            int i11 = 0;
            while (true) {
                file = null;
                if (i11 >= length2) {
                    break;
                }
                File file2 = fileArrListFiles[i11];
                String name = file2.getName();
                s.j(name, "getName(...)");
                if (t.h0(name, "backup.realm", false, 2, null)) {
                    file = file2;
                    break;
                }
                i11++;
            }
            if (file != null) {
                length = file.length() / 1048576.0d;
            } else {
                length = -1.0d;
            }
        } else {
            length = -1.0d;
        }
        return f62909a.a(length);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public static final double c(Context context) {
        s.k(context, "context");
        File[] fileArrListFiles = context.getFilesDir().listFiles();
        if (fileArrListFiles == null) {
            return -1.0d;
        }
        for (File file : fileArrListFiles) {
            if (s.f(file.getName(), "TrealmStorage")) {
                if (file != null) {
                    return file.length() / 1048576.0d;
                }
                return -1.0d;
            }
        }
        file = null;
        if (file != null) {
            return file.length() / 1048576.0d;
        }
        return -1.0d;
    }

    public static final String d(Context context) {
        s.k(context, "context");
        return f62909a.a(c(context));
    }
}
