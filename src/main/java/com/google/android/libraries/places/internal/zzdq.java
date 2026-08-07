package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzdq {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        zza() {
        }

        final zziy zza() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zziy.zzl(zzbVarArr);
            }
            return null;
        }

        final zziy zzb() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return zziy.zzl(zzbVarArr);
            }
            return null;
        }

        final String zzc() {
            return this.mainText;
        }

        final String zzd() {
            return this.secondaryText;
        }
    }

    class zzb {
        Integer length;
        Integer offset;

        zzb() {
        }
    }

    zzdq() {
    }

    final zza zza() {
        return this.structuredFormatting;
    }

    final zziy zzb() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        if (zzbVarArr != null) {
            return zziy.zzl(zzbVarArr);
        }
        return null;
    }

    final zziy zzc() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zziy.zzl(strArr);
        }
        return null;
    }

    final Integer zzd() {
        return this.distanceMeters;
    }

    final String zze() {
        return this.description;
    }

    final String zzf() {
        return this.placeId;
    }
}
