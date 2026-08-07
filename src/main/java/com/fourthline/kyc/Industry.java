package com.fourthline.kyc;

import ezvcard.property.Gender;
import jn0.e;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/fourthline/kyc/Industry;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "UNKNOWN", "AGRICULTURE_FORESTRY_FISHING", "MINING_QUARRYING", "MANUFACTURING", "ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY", "WATER_SUPPLY", "CONSTRUCTION", "WHOLESALE_RETAIL_TRADE", "TRANSPORTATION_STORAGE", "ACCOMMODATION_FOOD_SERVICE_ACTIVITIES", "INFORMATION_COMMUNICATION", "FINANCIAL_INSURANCE_ACTIVITIES", "REAL_ESTATE_ACTIVITIES", "PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES", "ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES", "PUBLIC_ADMINISTRATION_DEFENCE", "EDUCATION", "HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES", "ARTS_ENTERTAINMENT_RECREATION", "OTHER_SERVICE_ACTIVITIES", "ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS", "ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Industry {
    UNKNOWN(""),
    AGRICULTURE_FORESTRY_FISHING("A"),
    MINING_QUARRYING("B"),
    MANUFACTURING("C"),
    ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY("D"),
    WATER_SUPPLY("E"),
    CONSTRUCTION(Gender.FEMALE),
    WHOLESALE_RETAIL_TRADE("G"),
    TRANSPORTATION_STORAGE("H"),
    ACCOMMODATION_FOOD_SERVICE_ACTIVITIES("I"),
    INFORMATION_COMMUNICATION("J"),
    FINANCIAL_INSURANCE_ACTIVITIES("K"),
    REAL_ESTATE_ACTIVITIES("L"),
    PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES(Gender.MALE),
    ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES(Gender.NONE),
    PUBLIC_ADMINISTRATION_DEFENCE(Gender.OTHER),
    EDUCATION("P"),
    HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES("Q"),
    ARTS_ENTERTAINMENT_RECREATION("R"),
    OTHER_SERVICE_ACTIVITIES("S"),
    ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS("T"),
    ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES(Gender.UNKNOWN);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f24371c = a.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String code;

    Industry(String str) {
        this.code = str;
    }

    public static EnumEntries<Industry> getEntries() {
        return f24371c;
    }

    public final String getCode() {
        return this.code;
    }
}
