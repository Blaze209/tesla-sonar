package com.fourthline.core;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.MissingResourceException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007\"\u0014\u0010\f\u001a\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "fallback", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "isDeviceRooted", "()Z", "b", "c", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "is02Language", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceMetadataKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(String str) {
        try {
            return Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    private static final boolean b() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/sbin/.magisk", "/data/adb/magisk", "/data/adb/magisk.img", "/data/adb/modules", "/data/adb/lite_modules", "/dev/zygisk", "/data/adb/zygisk", "/data/adb/lite_modules/zygisk"};
        for (int i11 = 0; i11 < 18; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static final boolean c() {
        Process processExec;
        boolean z11 = false;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            try {
                if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                    z11 = true;
                }
            } catch (Throwable unused) {
                if (processExec != null) {
                }
                return z11;
            }
        } catch (Throwable unused2) {
            processExec = null;
        }
        processExec.destroy();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d() {
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            s.h(language);
            return language;
        }
        s.h(language);
        return t.v0(language, "_", 0, false, 6, null) == 2 ? t.T1(language, 2) : "";
    }

    public static final boolean isDeviceRooted() {
        return a() || b() || c();
    }

    private static final boolean a() {
        String str = Build.TAGS;
        return str != null && t.h0(str, "test-keys", false, 2, null);
    }
}
