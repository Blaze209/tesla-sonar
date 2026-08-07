package com.tesla.messagedecoding;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.sessionmanager.VehicleSessionInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import rc0.k;
import rc0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/messagedecoding/a;", "", "<init>", "()V", "Lrc0/k;", "info", "Lsc0/b;", "domain", "", "requestId", "Lcom/tesla/messagedecoding/a$a;", "a", "(Lrc0/k;Lsc0/b;Ljava/lang/String;)Lcom/tesla/messagedecoding/a$a;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56472a = new a();

    /* JADX INFO: renamed from: com.tesla.messagedecoding.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/tesla/messagedecoding/a$a;", "", "<init>", "()V", "c", "b", "a", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/messagedecoding/a$a$a;", "Lcom/tesla/messagedecoding/a$a$b;", "Lcom/tesla/messagedecoding/a$a$c;", "Lcom/tesla/messagedecoding/a$a$d;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractC1135a {

        /* JADX INFO: renamed from: com.tesla.messagedecoding.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/messagedecoding/a$a$a;", "Lcom/tesla/messagedecoding/a$a;", "Lsc0/b;", "domain", "<init>", "(Lsc0/b;)V", "a", "Lsc0/b;", "()Lsc0/b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1136a extends AbstractC1135a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final sc0.b domain;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1136a(sc0.b domain) {
                super(null);
                s.k(domain, "domain");
                this.domain = domain;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final sc0.b getDomain() {
                return this.domain;
            }
        }

        /* JADX INFO: renamed from: com.tesla.messagedecoding.a$a$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/messagedecoding/a$a$b;", "Lcom/tesla/messagedecoding/a$a;", "Lsc0/b;", "domain", "<init>", "(Lsc0/b;)V", "a", "Lsc0/b;", "()Lsc0/b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends AbstractC1135a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final sc0.b domain;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(sc0.b domain) {
                super(null);
                s.k(domain, "domain");
                this.domain = domain;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final sc0.b getDomain() {
                return this.domain;
            }
        }

        /* JADX INFO: renamed from: com.tesla.messagedecoding.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/tesla/messagedecoding/a$a$c;", "Lcom/tesla/messagedecoding/a$a;", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionInfo", "<init>", "(Lcom/tesla/sessionmanager/VehicleSessionInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "()Lcom/tesla/sessionmanager/VehicleSessionInfo;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends AbstractC1135a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final VehicleSessionInfo sessionInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(VehicleSessionInfo sessionInfo) {
                super(null);
                s.k(sessionInfo, "sessionInfo");
                this.sessionInfo = sessionInfo;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final VehicleSessionInfo getSessionInfo() {
                return this.sessionInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && s.f(this.sessionInfo, ((Success) other).sessionInfo);
            }

            public int hashCode() {
                return this.sessionInfo.hashCode();
            }

            public String toString() {
                return "Success(sessionInfo=" + this.sessionInfo + ")";
            }
        }

        /* JADX INFO: renamed from: com.tesla.messagedecoding.a$a$d, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/a$a$d;", "Lcom/tesla/messagedecoding/a$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ThrownError extends AbstractC1135a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrownError(Exception exception) {
                super(null);
                s.k(exception, "exception");
                this.exception = exception;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Exception getException() {
                return this.exception;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThrownError) && s.f(this.exception, ((ThrownError) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrownError(exception=" + this.exception + ")";
            }
        }

        public /* synthetic */ AbstractC1135a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1135a() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56477a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.SESSION_INFO_STATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.SESSION_INFO_STATUS_KEY_NOT_ON_WHITELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.SESSION_INFO_STATUS_INVALID_HANDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56477a = iArr;
        }
    }

    private a() {
    }

    public final AbstractC1135a a(k info, sc0.b domain, String requestId) {
        s.k(info, "info");
        s.k(domain, "domain");
        s.k(requestId, "requestId");
        try {
            int i11 = b.f56477a[info.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String().ordinal()];
            if (i11 == 1) {
                return new AbstractC1135a.Success(VehicleSessionInfo.INSTANCE.a(info, domain, requestId));
            }
            if (i11 == 2) {
                return new AbstractC1135a.b(domain);
            }
            if (i11 == 3) {
                return new AbstractC1135a.C1136a(domain);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e11) {
            return new AbstractC1135a.ThrownError(e11);
        }
    }
}
