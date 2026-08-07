package com.fourthline.orca.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import com.fourthline.sdk.assets.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.fourthline.orca.internal.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3972w5 {
    public static /* synthetic */ void a(Context context, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        a(context, j11);
    }

    public static final boolean b(Context context, int i11) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        try {
            return j5.h.h(context, i11) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static final void a(Context context, long j11) {
        Vibrator defaultVibrator;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            defaultVibrator = io.a.a(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            p013kotlin.jvm.internal.s.i(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            defaultVibrator = (Vibrator) systemService2;
        }
        p013kotlin.jvm.internal.s.h(defaultVibrator);
        if (i11 >= 26) {
            defaultVibrator.vibrate(VibrationEffect.createOneShot(j11, -1));
        } else {
            defaultVibrator.vibrate(j11);
        }
    }

    public static final boolean b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        try {
            return !b(context, R.font.roboto_mono);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0045  */
    public static final Locale a(Context context, OrcaLocalization localization) {
        Locale locale;
        String strName;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(localization, "localization");
        Configuration configuration = context.getResources().getConfiguration();
        String strName2 = localization.getBaseLanguage().name();
        Locale locale2 = Locale.ROOT;
        String lowerCase = strName2.toLowerCase(locale2);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        Locale locale3 = new Locale(lowerCase);
        OrcaLocalization.LanguageType fixedLanguage = localization.getFixedLanguage();
        if (fixedLanguage == null || (strName = fixedLanguage.name()) == null) {
            locale = null;
        } else {
            String lowerCase2 = strName.toLowerCase(locale2);
            p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            if (lowerCase2 != null) {
                locale = new Locale(lowerCase2);
            } else {
                locale = null;
            }
        }
        OrcaLocalization.LanguageType[] languageTypeArrValues = OrcaLocalization.LanguageType.values();
        ArrayList arrayList = new ArrayList(languageTypeArrValues.length);
        for (OrcaLocalization.LanguageType languageType : languageTypeArrValues) {
            String lowerCase3 = languageType.name().toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase3, "toLowerCase(...)");
            arrayList.add(new Locale(lowerCase3));
        }
        Locale locale4 = configuration.getLocales().get(0);
        if (locale != null) {
            return locale;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (locale4.getLanguage().equals(((Locale) it.next()).getLanguage())) {
                    p013kotlin.jvm.internal.s.h(locale4);
                    return locale4;
                }
            }
        }
        return locale3;
    }

    public static final Resources a(Context context, Locale locale) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        try {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration).getResources();
        } catch (Throwable unused) {
            return context.getResources();
        }
    }

    public static final boolean a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean a(Context context, int i11) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        try {
            return j5.h.f(context.getResources(), i11, null) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ void a(Context context, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        a(context, str, z11);
    }

    public static final void a(Context context, String str, boolean z11) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        if (str == null || p013kotlin.text.t.y0(str)) {
            return;
        }
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(z11 ? 32 : 16384);
        accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
        accessibilityEventObtain.setPackageName(accessibilityEventObtain.getPackageName());
        accessibilityEventObtain.getText().add(str);
        accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    public static final boolean a(p020r2.l lVar, int i11) {
        lVar.o(-1500624390);
        if (p020r2.o.J()) {
            p020r2.o.S(-1500624390, i11, -1, "com.fourthline.orca.core.internal.extension.isTalkBackEnabled (ContextExtensions.kt:133)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        lVar.o(-1912207551);
        Object objI = lVar.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            Object systemService = context.getSystemService("accessibility");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            objI = (AccessibilityManager) systemService;
            lVar.B(objI);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objI;
        lVar.l();
        boolean z11 = accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return z11;
    }
}
