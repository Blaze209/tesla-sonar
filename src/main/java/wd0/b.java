package wd0;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/io/File;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "a", "(Ljava/io/File;Landroid/content/Context;)Landroid/net/Uri;", "report_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final Uri a(File file, Context context) {
        s.k(file, "<this>");
        s.k(context, "context");
        Uri uriForFile = FileProvider.getUriForFile(context, "com.teslamotors.tesla-fileprovider", file);
        s.j(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }
}
