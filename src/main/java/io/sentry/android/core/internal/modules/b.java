package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.g1;
import io.sentry.b7;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f79457e;

    public b(Context context, ILogger iLogger) {
        super(iLogger);
        this.f79457e = g1.g(context);
        new Thread(new Runnable() { // from class: io.sentry.android.core.internal.modules.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f79456a.a();
            }
        }).start();
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f79457e.getAssets().open("sentry-external-modules.txt");
            try {
                Map<String, String> mapC = c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return mapC;
                }
                inputStreamOpen.close();
                return mapC;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f80678a.c(b7.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e11) {
            this.f80678a.a(b7.ERROR, "Error extracting modules.", e11);
            return treeMap;
        }
    }
}
