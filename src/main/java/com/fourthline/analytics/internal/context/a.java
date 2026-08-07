package com.fourthline.analytics.internal.context;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AnalyticsContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super("accessibility");
        s.k(context, "context");
        this.f24029a = context;
        this.f24030b = "accessibility";
        this.f24031c = "iglu:com.fourthline.sdk/accessibility/jsonschema/1-0-0";
        boolean z11 = true;
        try {
            Object systemService = context.getSystemService("accessibility");
            s.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            set("enabled", Boolean.valueOf(accessibilityManager.isEnabled()));
            set("touch_exploration_enabled", Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            set("spoken_feedback", a(accessibilityManager, 1));
            set("haptic_feedback", a(accessibilityManager, 2));
            set("audio_feedback", a(accessibilityManager, 4));
            set("visual_feedback", a(accessibilityManager, 8));
            set("generic_feedback", a(accessibilityManager, 16));
            set("braille_feedback", a(accessibilityManager, 32));
        } catch (Exception unused) {
        }
        try {
            set("color_space_adjusted", Boolean.valueOf(Settings.Secure.getInt(this.f24029a.getContentResolver(), "accessibility_display_daltonizer_enabled") == 1));
        } catch (Exception unused2) {
            set("color_space_adjusted", Boolean.FALSE);
        }
        try {
            if (Settings.Secure.getInt(this.f24029a.getContentResolver(), "accessibility_display_inversion_enabled") != 1) {
                z11 = false;
            }
            set("color_inverted", Boolean.valueOf(z11));
        } catch (Exception unused3) {
            set("color_inverted", Boolean.FALSE);
        }
    }

    private final List a(AccessibilityManager accessibilityManager, int i11) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(i11);
        s.h(enabledAccessibilityServiceList);
        if (enabledAccessibilityServiceList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(v.y(enabledAccessibilityServiceList, 10));
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            Map mapC = v0.c();
            String id2 = accessibilityServiceInfo.getId();
            s.j(id2, "getId(...)");
            mapC.put("identifier", id2);
            String[] packageNames = accessibilityServiceInfo.packageNames;
            s.j(packageNames, "packageNames");
            mapC.put("packageName", packageNames);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                mapC.put("is_accessibility_tool", Boolean.valueOf(accessibilityServiceInfo.isAccessibilityTool()));
            }
            if (i12 >= 26) {
                CharSequence charSequenceLoadSummary = accessibilityServiceInfo.loadSummary(this.f24029a.getPackageManager());
                s.j(charSequenceLoadSummary, "loadSummary(...)");
                mapC.put("summary", charSequenceLoadSummary);
            }
            arrayList.add(v0.b(mapC));
        }
        return arrayList;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getIdentifier() {
        return this.f24030b;
    }

    @Override // com.fourthline.analytics.internal.AnalyticsContext
    public String getSchema() {
        return this.f24031c;
    }
}
