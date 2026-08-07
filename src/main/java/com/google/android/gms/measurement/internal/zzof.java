package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.collect.b0;
import com.google.common.collect.x;
import com.google.common.collect.z;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
public final class zzof {
    static final x zza = x.x("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static final boolean zzc(com.google.android.gms.internal.measurement.zzkp zzkpVar, z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        int i16;
        int i17;
        b0 b0Var2;
        String str4;
        zzoe zzoeVar;
        char c11;
        int iZze = zze(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true);
        if (iZze > 0) {
            i17 = i13;
            if (i17 == 1) {
                i16 = i12;
                if (i16 != 1) {
                    i17 = 1;
                } else {
                    i16 = 1;
                    i17 = 1;
                }
            } else {
                i16 = i12;
            }
            cArr[iZze] = '2';
        } else {
            i16 = i12;
            i17 = i13;
        }
        if (zzi(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i15, str, str2, str3, z11, z12, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c11 = '3';
        } else {
            int i18 = i15;
            if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                b0Var2 = b0Var;
                str4 = str;
                if (i18 == 1) {
                    if (b0Var2.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i18 = 1;
                }
            } else {
                b0Var2 = b0Var;
                str4 = str;
            }
            if (zVar.containsKey(zzkpVar) && (zzoeVar = (zzoe) zVar.get(zzkpVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true) : zzg(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzkpVar, zVar, zVar2, b0Var2, cArr, i11, i16, i17, i14, i18, str4, str2, str3, z11, z12, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true) : zzh(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true);
                        }
                        c11 = '0';
                    } else if (zzi(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true);
                    }
                } else if (zzi(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i16, i17, i14, i18, str, str2, str3, z11, z12, true);
                }
                c11 = '8';
            } else {
                c11 = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c11;
        return false;
    }

    public static final Map zzd(z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        if (!z13) {
            return z.m();
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) zVar2.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) zVar2.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) zVar2.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) zVar2.get(zzkpVar4);
        return z.b().f("Version", "2").f("VendorConsent", true != z11 ? WebrtcBuildVersion.maint_version : "1").f("VendorLegitimateInterest", true != z12 ? WebrtcBuildVersion.maint_version : "1").f("gdprApplies", i13 != 1 ? WebrtcBuildVersion.maint_version : "1").f("EnableAdvertiserConsentMode", i12 != 1 ? WebrtcBuildVersion.maint_version : "1").f("PolicyVersion", String.valueOf(i14)).f("CmpSdkID", String.valueOf(i11)).f("PurposeOneTreatment", i15 != 1 ? WebrtcBuildVersion.maint_version : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(z.n("Purpose1", zzf(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true), "Purpose3", zzf(zzkpVar2, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true), "Purpose4", zzf(zzkpVar3, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true), "Purpose7", zzf(zzkpVar4, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true))).i(z.o("AuthorizePurpose1", true != zzc(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true) ? WebrtcBuildVersion.maint_version : "1", "AuthorizePurpose3", true != zzc(zzkpVar2, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true) ? WebrtcBuildVersion.maint_version : "1", "AuthorizePurpose4", true != zzc(zzkpVar3, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true) ? WebrtcBuildVersion.maint_version : "1", "AuthorizePurpose7", true != zzc(zzkpVar4, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true) ? WebrtcBuildVersion.maint_version : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String strValueOf = WebrtcBuildVersion.maint_version;
        String strValueOf2 = (zIsEmpty || str2.length() < zzkpVar.zza()) ? WebrtcBuildVersion.maint_version : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        char c11;
        int iZze = zze(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true);
        if (!z11) {
            c11 = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z14 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z14;
            }
            c11 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c11;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        char c11;
        int iZze = zze(zzkpVar, zVar, zVar2, b0Var, cArr, i11, i12, i13, i14, i15, str, str2, str3, z11, z12, true);
        if (!z12) {
            c11 = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z14 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z14;
            }
            c11 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c11;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, z zVar, z zVar2, b0 b0Var, char[] cArr, int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3, boolean z11, boolean z12, boolean z13) {
        return (com.google.android.gms.internal.measurement.zzkq) zVar2.getOrDefault(zzkpVar, com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
