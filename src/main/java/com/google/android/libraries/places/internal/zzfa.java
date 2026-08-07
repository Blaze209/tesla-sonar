package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzfa {
    private zza[] addressComponents;
    private String businessStatus;
    private String formattedAddress;
    private zzb geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzc openingHours;
    private zzd[] photos;
    private String placeId;
    private zze plusCode;
    private Integer priceLevel;
    private Double rating;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;

    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        zza() {
        }

        final zziy zza() {
            String[] strArr = this.types;
            if (strArr != null) {
                return zziy.zzl(strArr);
            }
            return null;
        }

        final String zzb() {
            return this.longName;
        }

        final String zzc() {
            return this.shortName;
        }
    }

    class zzb {
        private zza location;
        private C0657zzb viewport;

        class zza {
            private Double lat;
            private Double lng;

            zza() {
            }

            final Double zza() {
                return this.lat;
            }

            final Double zzb() {
                return this.lng;
            }
        }

        /* JADX INFO: renamed from: com.google.android.libraries.places.internal.zzfa$zzb$zzb, reason: collision with other inner class name */
        class C0657zzb {
            private zza northeast;
            private zza southwest;

            C0657zzb() {
            }

            final zza zza() {
                return this.northeast;
            }

            final zza zzb() {
                return this.southwest;
            }
        }

        zzb() {
        }

        final zza zza() {
            return this.location;
        }

        final C0657zzb zzb() {
            return this.viewport;
        }
    }

    class zzc {
        private zza[] periods;
        private String[] weekdayText;

        class zza {
            private zzb close;
            private zzb open;

            zza() {
            }

            final zzb zza() {
                return this.close;
            }

            final zzb zzb() {
                return this.open;
            }
        }

        class zzb {
            private Integer day;
            private String time;

            zzb() {
            }

            final Integer zza() {
                return this.day;
            }

            final String zzb() {
                return this.time;
            }
        }

        zzc() {
        }

        final zziy zza() {
            zza[] zzaVarArr = this.periods;
            if (zzaVarArr != null) {
                return zziy.zzl(zzaVarArr);
            }
            return null;
        }

        final zziy zzb() {
            String[] strArr = this.weekdayText;
            if (strArr != null) {
                return zziy.zzl(strArr);
            }
            return null;
        }
    }

    class zzd {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        zzd() {
        }

        final zziy zza() {
            String[] strArr = this.htmlAttributions;
            if (strArr != null) {
                return zziy.zzl(strArr);
            }
            return null;
        }

        final Integer zzb() {
            return this.height;
        }

        final Integer zzc() {
            return this.width;
        }

        final String zzd() {
            return this.photoReference;
        }
    }

    class zze {
        private String compoundCode;
        private String globalCode;

        zze() {
        }

        final String zza() {
            return this.compoundCode;
        }

        final String zzb() {
            return this.globalCode;
        }
    }

    zzfa() {
    }

    final zzb zza() {
        return this.geometry;
    }

    final zzc zzb() {
        return this.openingHours;
    }

    final zze zzc() {
        return this.plusCode;
    }

    final zziy zzd() {
        zza[] zzaVarArr = this.addressComponents;
        if (zzaVarArr != null) {
            return zziy.zzl(zzaVarArr);
        }
        return null;
    }

    final zziy zze() {
        zzd[] zzdVarArr = this.photos;
        if (zzdVarArr != null) {
            return zziy.zzl(zzdVarArr);
        }
        return null;
    }

    final zziy zzf() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zziy.zzl(strArr);
        }
        return null;
    }

    final Double zzg() {
        return this.rating;
    }

    final Integer zzh() {
        return this.priceLevel;
    }

    final Integer zzi() {
        return this.userRatingsTotal;
    }

    final Integer zzj() {
        return this.utcOffset;
    }

    final String zzk() {
        return this.businessStatus;
    }

    final String zzl() {
        return this.formattedAddress;
    }

    final String zzm() {
        return this.iconBackgroundColor;
    }

    final String zzn() {
        return this.iconMaskBaseUri;
    }

    final String zzo() {
        return this.internationalPhoneNumber;
    }

    final String zzp() {
        return this.name;
    }

    final String zzq() {
        return this.placeId;
    }

    final String zzr() {
        return this.website;
    }
}
