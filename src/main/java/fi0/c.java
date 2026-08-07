package fi0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.List;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import sn0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u001a"}, d2 = {"Lfi0/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljava/io/File;", "Ljn0/h0;", "c", "(Ljava/io/File;)V", "", "fileName", "e", "(Ljava/lang/String;)Ljava/io/File;", "extension", DateTokenConverter.CONVERTER_KEY, "a", "()V", "", "b", "()Ljava/util/List;", "Ljava/io/File;", "sdkCacheDir", "sdkDir", "sessionDir", "sessionCacheDir", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File sdkCacheDir;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File sdkDir;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File sessionDir;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final File sessionCacheDir;

    public c(Context context) {
        s.k(context, "context");
        File file = new File(context.getCacheDir(), ".com.withpersona.sdk2.inquiry");
        this.sdkCacheDir = file;
        File file2 = new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry");
        this.sdkDir = file2;
        this.sessionDir = new File(file2, "sess");
        this.sessionCacheDir = new File(file, "sess");
    }

    private final void c(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    public final void a() {
        h.B(this.sessionDir);
        h.B(this.sessionCacheDir);
    }

    public final List<File> b() {
        return v.p(this.sessionDir, this.sessionCacheDir);
    }

    public final File d(String extension) {
        s.k(extension, "extension");
        c(this.sessionDir);
        return new File(this.sessionDir, UUID.randomUUID() + "." + extension);
    }

    public final File e(String fileName) {
        s.k(fileName, "fileName");
        c(this.sessionDir);
        return new File(this.sessionDir, fileName);
    }
}
