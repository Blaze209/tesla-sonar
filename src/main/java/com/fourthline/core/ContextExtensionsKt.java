package com.fourthline.core;

import android.content.Context;
import com.fourthline.analytics.internal.CoreAnalytics;
import java.io.File;
import java.net.URI;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroid/content/Context;", "Ljn0/h0;", "deleteFourthlineFiles", "(Landroid/content/Context;)V", "Ljava/net/URI;", "getFourthlineDirectory", "(Landroid/content/Context;)Ljava/net/URI;", "fourthlineDirectory", "Ljava/io/File;", "getAssetsFourthlineDirectory", "(Landroid/content/Context;)Ljava/io/File;", "assetsFourthlineDirectory", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextExtensionsKt {
    public static final void deleteFourthlineFiles(Context context) {
        s.k(context, "<this>");
        CoreAnalytics coreAnalytics = CoreAnalytics.INSTANCE;
        coreAnalytics.onEnterDeleteFourthlineFolder();
        try {
            h.B(new File(getFourthlineDirectory(context)));
            coreAnalytics.onDeleteFourthlineFolderSuccess();
        } catch (Throwable th2) {
            CoreAnalytics.INSTANCE.onDeleteFourthlineFolderFail(th2);
        }
    }

    public static final File getAssetsFourthlineDirectory(Context context) {
        s.k(context, "<this>");
        File dir = context.getDir("fourthline_assets", 0);
        s.j(dir, "getDir(...)");
        return dir;
    }

    public static final URI getFourthlineDirectory(Context context) {
        s.k(context, "<this>");
        File file = new File(context.getCacheDir().getAbsolutePath() + "/fourthline");
        try {
            file.mkdirs();
        } catch (Throwable th2) {
            CoreAnalytics.INSTANCE.onCreateFourthlineFolderFail(th2);
        }
        URI uri = file.toURI();
        s.j(uri, "toURI(...)");
        return uri;
    }
}
