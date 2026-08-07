package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tesla/domain/model/ReverseGeocodedObject;", "", "name", "", "city", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getCity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReverseGeocodedObject {

    @g(name = "city")
    private final String city;

    @g(name = "name")
    private final String name;

    public ReverseGeocodedObject(String str, String str2) {
        this.name = str;
        this.city = str2;
    }

    public static /* synthetic */ ReverseGeocodedObject copy$default(ReverseGeocodedObject reverseGeocodedObject, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reverseGeocodedObject.name;
        }
        if ((i11 & 2) != 0) {
            str2 = reverseGeocodedObject.city;
        }
        return reverseGeocodedObject.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final ReverseGeocodedObject copy(String name, String city) {
        return new ReverseGeocodedObject(name, city);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReverseGeocodedObject)) {
            return false;
        }
        ReverseGeocodedObject reverseGeocodedObject = (ReverseGeocodedObject) other;
        return s.f(this.name, reverseGeocodedObject.name) && s.f(this.city, reverseGeocodedObject.city);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ReverseGeocodedObject(name=" + this.name + ", city=" + this.city + ")";
    }
}
