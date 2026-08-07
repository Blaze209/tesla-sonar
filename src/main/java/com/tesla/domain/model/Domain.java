package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.i;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/domain/model/Domain;", "", "<init>", "(Ljava/lang/String;I)V", "VCSEC", "INFOTAINMENT", "AUTHD", "UNSUPPORTED", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Domain {
    VCSEC,
    INFOTAINMENT,
    AUTHD,
    UNSUPPORTED;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    public static EnumEntries<Domain> getEntries() {
        return $ENTRIES;
    }
}
