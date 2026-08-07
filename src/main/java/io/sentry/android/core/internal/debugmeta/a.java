package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.g1;
import io.sentry.b7;
import io.sentry.util.d;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f79427b;

    public a(Context context, ILogger iLogger) {
        this.f79426a = g1.g(context);
        this.f79427b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List<Properties> a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f79426a.getAssets().open(d.f81455a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.f79427b.c(b7.INFO, "%s file was not found.", d.f81455a);
            return null;
        } catch (IOException e11) {
            this.f79427b.a(b7.ERROR, "Error getting Proguard UUIDs.", e11);
            return null;
        } catch (RuntimeException e12) {
            this.f79427b.b(b7.ERROR, e12, "%s file is malformed.", d.f81455a);
            return null;
        }
    }
}
