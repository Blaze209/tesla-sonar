package com.tesla.phonekeyauthengine;

import androidx.annotation.Keep;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import rd0.b;
import vc0.m;
import vc0.r;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/tesla/phonekeyauthengine/AuthorizationResult;", "", "<init>", "(Ljava/lang/String;I)V", "Lvc0/m;", "level", "Lvc0/r;", "getAuthenticationResponseIncludingIMUState", "(Lvc0/m;)Lvc0/r;", "getAuthenticationResponse", "", "getAnalyticsName", "()Ljava/lang/String;", "analyticsName", "PHONE_KEY_DISABLED", "REJECTION_FEATURE_DISABLED", "VEHICLE_NOT_SUPPORTED", "USER_PRESENT", "IS_MOVING_IMU", "IS_STATIONARY_IMU", "NO_MOTION_DATA", "STALE_MOTION_DATA", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AuthorizationResult {
    PHONE_KEY_DISABLED,
    REJECTION_FEATURE_DISABLED,
    VEHICLE_NOT_SUPPORTED,
    USER_PRESENT,
    IS_MOVING_IMU,
    IS_STATIONARY_IMU,
    NO_MOTION_DATA,
    STALE_MOTION_DATA;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56508a;

        static {
            int[] iArr = new int[AuthorizationResult.values().length];
            try {
                iArr[AuthorizationResult.PHONE_KEY_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorizationResult.IS_STATIONARY_IMU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthorizationResult.STALE_MOTION_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthorizationResult.USER_PRESENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AuthorizationResult.REJECTION_FEATURE_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AuthorizationResult.VEHICLE_NOT_SUPPORTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AuthorizationResult.IS_MOVING_IMU.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AuthorizationResult.NO_MOTION_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f56508a = iArr;
        }
    }

    public static EnumEntries<AuthorizationResult> getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsName() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final r getAuthenticationResponse(m level) {
        s.k(level, "level");
        switch (a.f56508a[ordinal()]) {
            case 1:
                return b.b();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new r(level, 0, null, null, 14, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final r getAuthenticationResponseIncludingIMUState(m level) {
        s.k(level, "level");
        switch (a.f56508a[ordinal()]) {
            case 1:
                return b.b();
            case 2:
                return b.a();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new r(level, 0, null, null, 14, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
