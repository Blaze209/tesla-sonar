package gz;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: renamed from: gz.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001f\u0010 \u001a\n \u001e*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0013\u0010\u001a¨\u0006!"}, d2 = {"Lgz/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", "directory", "", "extension", "<init>", "(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "c", "Ljava/lang/String;", "getExtension", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, Action.FILE_ATTRIBUTE, "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OutputFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final File directory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String extension;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final File file;

    public OutputFile(Context context, File directory, String extension) throws IOException {
        s.k(context, "context");
        s.k(directory, "directory");
        s.k(extension, "extension");
        this.context = context;
        this.directory = directory;
        this.extension = extension;
        File fileCreateTempFile = File.createTempFile("mrousavy", extension, directory);
        this.file = fileCreateTempFile;
        String absolutePath = directory.getAbsolutePath();
        s.j(absolutePath, "getAbsolutePath(...)");
        String absolutePath2 = context.getCacheDir().getAbsolutePath();
        s.j(absolutePath2, "getAbsolutePath(...)");
        if (t.h0(absolutePath, absolutePath2, false, 2, null)) {
            fileCreateTempFile.deleteOnExit();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutputFile)) {
            return false;
        }
        OutputFile outputFile = (OutputFile) other;
        return s.f(this.context, outputFile.context) && s.f(this.directory, outputFile.directory) && s.f(this.extension, outputFile.extension);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.directory.hashCode()) * 31) + this.extension.hashCode();
    }

    public String toString() {
        return "OutputFile(context=" + this.context + ", directory=" + this.directory + ", extension=" + this.extension + ")";
    }
}
