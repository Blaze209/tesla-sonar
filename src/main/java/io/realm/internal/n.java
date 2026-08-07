package io.realm.internal;

import android.content.Context;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f79095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f79096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f79097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f79098d;

    static {
        String str = File.separator;
        f79095a = str;
        String str2 = File.pathSeparator;
        f79096b = str2;
        f79097c = "lib" + str2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + str + "lib";
        f79098d = false;
    }

    public static synchronized void a(Context context) {
        if (f79098d) {
            return;
        }
        wp.b.a(context, "realm-jni", "10.19.0");
        f79098d = true;
    }
}
