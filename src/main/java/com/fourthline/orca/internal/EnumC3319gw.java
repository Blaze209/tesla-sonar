package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/fourthline/orca/internal/gw;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public enum EnumC3319gw {
    NEW,
    PENDING,
    REJECTED,
    KYC_REQUIRED,
    SELFIE_REQUIRED,
    USER_CONSENT_REQUIRED,
    CONFIRMATION_REQUIRED,
    PENDING_VERIFICATION,
    INVALID_SIGNATURE,
    SIGNED,
    ERROR;


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f32113n = on0.a.a(a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f32100a = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: com.fourthline.orca.internal.p21
        @Override // wn0.a
        public final Object invoke() {
            return EnumC3319gw.b();
        }
    });

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gw$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) EnumC3319gw.f32100a.getValue();
        }

        public final ro0.d<EnumC3319gw> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ ro0.d b() {
        return vo0.a0.b("com.fourthline.orca.core.internal.backend.model.QesVerificationStatus", values());
    }
}
