package hg0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.SdkAction;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0003\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0005\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019\"\u0018\u0010 \u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006!"}, d2 = {"Landroid/content/Context;", "", "j", "(Landroid/content/Context;)Z", "h", "()Z", "b", "a", "", "", "packages", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/util/List;)Z", "binName", "c", "(Ljava/lang/String;)Z", "f", "g", DateTokenConverter.CONVERTER_KEY, "k", "()Ljava/util/List;", "l", "command", "e", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/List;", "knownRootAppsPackages", "knownDangerousAppsPackages", "knownRootCloakingPackages", "binDirectories", "pathsThatShouldNotBeWritable", "Ljava/lang/Boolean;", "isDeviceRootedCachedValue", "device_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f72785a = v.p("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f72786b = v.p("com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f72787c = v.p("com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f72788d = v.p("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f72789e = v.p("/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Boolean f72790f;

    private static final boolean a(Context context) {
        return i(context, f72786b);
    }

    private static final boolean b(Context context) {
        return i(context, f72785a);
    }

    private static final boolean c(String str) {
        Iterator<String> it = f72788d.iterator();
        while (it.hasNext()) {
            if (new File(it.next(), str).exists()) {
                return true;
            }
        }
        return false;
    }

    private static final boolean d() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec((String[]) p013kotlin.text.t.f1("which su", new String[]{" "}, false, 0, 6, null).toArray(new String[0]));
            boolean z11 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z11;
        } catch (Exception unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }

    private static final List<String> e(String str) {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec(str).getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException unused2) {
            next = "";
        }
        String str2 = next;
        p013kotlin.jvm.internal.s.h(str2);
        List listF1 = p013kotlin.text.t.f1(str2, new String[]{"\n"}, false, 0, 6, null);
        if (!listF1.isEmpty()) {
            ListIterator listIterator = listF1.listIterator(listF1.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    return v.d1(listF1, listIterator.nextIndex() + 1);
                }
            }
        }
        return v.m();
    }

    private static final boolean f() {
        boolean z11 = false;
        boolean z12 = true;
        for (String str : l()) {
            if (p013kotlin.text.t.h0(str, "[ro.debuggable]", false, 2, null) && p013kotlin.text.t.h0(str, "[1]", false, 2, null)) {
                z11 = true;
            } else if (p013kotlin.text.t.h0(str, "[ro.secure]", false, 2, null) && p013kotlin.text.t.h0(str, "[0]", false, 2, null)) {
                z12 = false;
            }
        }
        return z11 && !z12;
    }

    private static final boolean g() {
        String str;
        String str2;
        Iterator<String> it = k().iterator();
        while (it.hasNext()) {
            List listF1 = p013kotlin.text.t.f1(it.next(), new String[]{" "}, false, 0, 6, null);
            if (listF1.size() == 6) {
                str = (String) listF1.get(2);
                str2 = (String) listF1.get(5);
            } else if (listF1.size() == 4) {
                str = (String) listF1.get(1);
                str2 = (String) listF1.get(3);
            } else {
                continue;
            }
            Iterator<String> it2 = f72789e.iterator();
            while (it2.hasNext()) {
                if (p013kotlin.text.t.M(str, it2.next(), true)) {
                    int length = str2.length() - 1;
                    int i11 = 0;
                    boolean z11 = false;
                    while (i11 <= length) {
                        char cCharAt = str2.charAt(!z11 ? i11 : length);
                        boolean z12 = p013kotlin.text.a.c(cCharAt) || cCharAt == '(' || cCharAt == ')';
                        if (z11) {
                            if (!z12) {
                                break;
                            }
                            length--;
                        } else if (z12) {
                            i11++;
                        } else {
                            z11 = true;
                        }
                    }
                    Iterator it3 = p013kotlin.text.t.f1(str2.subSequence(i11, length + 1).toString(), new String[]{","}, false, 0, 6, null).iterator();
                    while (it3.hasNext()) {
                        if (p013kotlin.text.t.M((String) it3.next(), "rw", true)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static final boolean h() {
        String str = Build.TAGS;
        String str2 = Build.FINGERPRINT;
        String str3 = Build.PRODUCT;
        String str4 = Build.HARDWARE;
        String str5 = Build.DISPLAY;
        if (str != null) {
            if (p013kotlin.text.t.h0(str, "test-keys", false, 2, null)) {
                return true;
            }
            p013kotlin.jvm.internal.s.h(str2);
            if (p013kotlin.text.t.h0(str2, "genric.*test-keys", false, 2, null)) {
                return true;
            }
            p013kotlin.jvm.internal.s.h(str3);
            if (p013kotlin.text.t.h0(str3, "generic", false, 2, null) || p013kotlin.text.t.h0(str3, SdkAction.ACTION_TYPE, false, 2, null)) {
                return true;
            }
            p013kotlin.jvm.internal.s.h(str4);
            if (p013kotlin.text.t.h0(str4, "goldfish", false, 2, null)) {
                return true;
            }
            p013kotlin.jvm.internal.s.h(str5);
            if (p013kotlin.text.t.h0(str5, ".*test-keys", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean i(Context context, List<String> list) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static final boolean j(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        Boolean bool = f72790f;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z11 = false;
        try {
            if (b(context) || a(context) || c("su") || c("magisk") || f() || g() || ((h() && !h.a()) || d())) {
                z11 = true;
            }
        } catch (Exception unused) {
        }
        f72790f = Boolean.valueOf(z11);
        return z11;
    }

    private static final List<String> k() {
        return e("mount");
    }

    private static final List<String> l() {
        return e("getprop");
    }
}
