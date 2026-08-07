package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.x;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
public final class zzod {
    private final Map zza;

    zzod(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    private final Bundle zzf() {
        int iZzg;
        Map map = this.zza;
        if ("1".equals(map.get("GoogleConsent")) && (iZzg = zzg()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(zzjk.AD_STORAGE.zze, str.charAt(0) == '1' ? PermissionsResponse.GRANTED_KEY : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(zzjk.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? PermissionsResponse.GRANTED_KEY : "denied");
                }
                if (str.length() > 6 && iZzg >= 4) {
                    String str3 = zzjk.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = PermissionsResponse.GRANTED_KEY;
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int zzg() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return zza().equalsIgnoreCase(((zzod) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String zza() {
        StringBuilder sb2 = new StringBuilder();
        x xVar = zzof.zza;
        int size = xVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str = (String) xVar.get(i11);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    public final Bundle zzb() {
        Map map;
        Bundle bundle;
        boolean zEquals;
        String str;
        String str2;
        String str3;
        zzfx zzfxVar = zzfy.zzaZ;
        if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
            Map map2 = this.zza;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
                    return zzf();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzf();
                }
                if (zzg() >= 0) {
                    bundle = new Bundle();
                    String str4 = zzjk.AD_STORAGE.zze;
                    zEquals = Objects.equals(map.get("AuthorizePurpose1"), "1");
                    str = PermissionsResponse.GRANTED_KEY;
                    if (true != zEquals) {
                        str2 = "denied";
                    } else {
                        str2 = PermissionsResponse.GRANTED_KEY;
                    }
                    bundle.putString(str4, str2);
                    String str5 = zzjk.AD_PERSONALIZATION.zze;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1") || !Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str3 = "denied";
                    } else {
                        str3 = PermissionsResponse.GRANTED_KEY;
                    }
                    bundle.putString(str5, str3);
                    if (zzg() >= 4) {
                        String str6 = zzjk.AD_USER_DATA.zze;
                        if (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                            str = "denied";
                        }
                        bundle.putString(str6, str);
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.zza;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
                    return zzf();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzf();
                }
                if (zzg() >= 0) {
                    bundle = new Bundle();
                    String str7 = zzjk.AD_STORAGE.zze;
                    zEquals = Objects.equals(map.get("AuthorizePurpose1"), "1");
                    str = PermissionsResponse.GRANTED_KEY;
                    if (true != zEquals) {
                        str2 = "denied";
                    } else {
                        str2 = PermissionsResponse.GRANTED_KEY;
                    }
                    bundle.putString(str7, str2);
                    String str8 = zzjk.AD_PERSONALIZATION.zze;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str3 = "denied";
                    } else {
                        str3 = "denied";
                    }
                    bundle.putString(str8, str3);
                    if (zzg() >= 4) {
                        String str9 = zzjk.AD_USER_DATA.zze;
                        if (Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                            str = "denied";
                        } else {
                            str = "denied";
                        }
                        bundle.putString(str9, str);
                    }
                    return bundle;
                }
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzd(zzod zzodVar) {
        Map map = zzodVar.zza;
        boolean zIsEmpty = map.isEmpty();
        String str = WebrtcBuildVersion.maint_version;
        String str2 = (zIsEmpty || ((String) map.get("Version")) != null) ? WebrtcBuildVersion.maint_version : "1";
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzodVar.zzb();
        if (bundleZzb.size() != bundleZzb2.size() || !Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) || !Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) || !Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) {
            str = "1";
        }
        return str2.concat(str);
    }

    public final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i11 = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i11 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i11 < 0 || i11 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
        }
        int iZzg = zzg();
        if (iZzg < 0 || iZzg > 63) {
            sb2.append(WebrtcBuildVersion.maint_version);
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzg));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i12 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i13 = i12 | 4;
        if (zEquals) {
            i13 = i12 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
        return sb2.toString();
    }
}
