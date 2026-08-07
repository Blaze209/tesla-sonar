package tb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.tesla.logging.g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Ltb0/c;", "Ltb0/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", Action.KEY_ATTRIBUTE, "Ljava/io/File;", "f", "(Ljava/lang/String;)Ljava/io/File;", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lkotlin/Lazy;", "h", "()Ljava/io/File;", "filesDir", "c", "datasource_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f113109d = g.INSTANCE.a("FilePrimitiveLocalDataSource");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy filesDir;

    /* JADX INFO: renamed from: tb0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltb0/c$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltb0/e;", "a", "(Landroid/content/Context;)Ltb0/e;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "datasource_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(Context context) {
            s.k(context, "context");
            return new c(context, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(c cVar) {
        File file = new File(cVar.context.getCacheDir(), "files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final File f(final String key) {
        File[] fileArrListFiles = h().listFiles(new FilenameFilter() { // from class: tb0.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return c.g(key, file, str);
            }
        });
        if (fileArrListFiles != null) {
            if (fileArrListFiles.length == 0) {
                fileArrListFiles = null;
            }
            if (fileArrListFiles != null) {
                return fileArrListFiles[0];
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(String str, File file, String str2) {
        s.h(str2);
        return t.b0(str2, str, false, 2, null);
    }

    private final File h() {
        return (File) this.filesDir.getValue();
    }

    @Override // tb0.e
    public void a(String key, String value) {
        s.k(key, "key");
        s.k(value, "value");
        try {
            h.q(new File(h(), key + ".txt"), value, null, 2, null);
        } catch (IOException e11) {
            f113109d.d("error setting string with key " + key, e11);
        }
    }

    @Override // tb0.e
    public void b(String key) {
        s.k(key, "key");
        File fileF = f(key);
        if (fileF == null) {
            f113109d.j("no file found for key " + key + " to delete");
            return;
        }
        if (!fileF.delete()) {
            f113109d.j("failed to delete file for key " + key);
            return;
        }
        f113109d.j("deleted file for key " + key + " successfully");
    }

    @Override // tb0.e
    public String getString(String key) {
        s.k(key, "key");
        File fileF = f(key);
        if (fileF != null) {
            return h.n(fileF, null, 1, null);
        }
        f113109d.j("no file found for key " + key);
        return null;
    }

    private c(Context context) {
        this.context = context;
        this.filesDir = m.b(new wn0.a() { // from class: tb0.a
            @Override // wn0.a
            public final Object invoke() {
                return c.e(this.f113106a);
            }
        });
    }
}
