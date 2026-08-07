package m50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e0;
import vo0.h;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: m50.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0005 %)\"\u0016BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010$\u001a\u0004\b%\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010$\u001a\u0004\b \u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010-\u0012\u0004\b/\u0010$\u001a\u0004\b)\u0010.¨\u00061"}, d2 = {"Lm50/e;", "", "", "seen1", "", "type", "Lm50/e$d;", "institutionSelected", "Lm50/e$c;", AnalyticsAttribute.Error, "Lm50/e$e;", "success", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lm50/e$d;Lm50/e$c;Lm50/e$e;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lm50/e;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "getType$annotations", "()V", "b", "Lm50/e$d;", "()Lm50/e$d;", "getInstitutionSelected$annotations", "c", "Lm50/e$c;", "()Lm50/e$c;", "getError$annotations", "Lm50/e$e;", "()Lm50/e$e;", "getSuccess$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class UserFacingEventResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InstitutionSelected institutionSelected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Error error;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Success success;

    /* JADX INFO: renamed from: m50.e$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse.$serializer", "Lvo0/e0;", "Lm50/e;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lm50/e;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lm50/e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<UserFacingEventResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91254a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f91254a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.UserFacingEventResponse", aVar, 4);
            m1Var.o("type", false);
            m1Var.o("institution_selected", true);
            m1Var.o(AnalyticsAttribute.Error, true);
            m1Var.o("success", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserFacingEventResponse deserialize(uo0.e decoder) {
            int i11;
            String str;
            InstitutionSelected institutionSelected;
            Error error;
            Success success;
            s.k(decoder, "decoder");
            f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                InstitutionSelected institutionSelected2 = (InstitutionSelected) cVarB.v(descriptor2, 1, InstitutionSelected.a.f91258a, null);
                Error error2 = (Error) cVarB.v(descriptor2, 2, Error.a.f91256a, null);
                str = strT2;
                success = (Success) cVarB.v(descriptor2, 3, Success.a.f91260a, null);
                error = error2;
                institutionSelected = institutionSelected2;
                i11 = 15;
            } else {
                boolean z11 = true;
                int i12 = 0;
                InstitutionSelected institutionSelected3 = null;
                Error error3 = null;
                Success success2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        institutionSelected3 = (InstitutionSelected) cVarB.v(descriptor2, 1, InstitutionSelected.a.f91258a, institutionSelected3);
                        i12 |= 2;
                    } else if (iA == 2) {
                        error3 = (Error) cVarB.v(descriptor2, 2, Error.a.f91256a, error3);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        success2 = (Success) cVarB.v(descriptor2, 3, Success.a.f91260a, success2);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT;
                institutionSelected = institutionSelected3;
                error = error3;
                success = success2;
            }
            cVarB.c(descriptor2);
            return new UserFacingEventResponse(i11, str, institutionSelected, error, success, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, UserFacingEventResponse value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            UserFacingEventResponse.e(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{z1.f119730a, so0.a.p(InstitutionSelected.a.f91258a), so0.a.p(Error.a.f91256a), so0.a.p(Success.a.f91260a)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: m50.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm50/e$b;", "", "<init>", "()V", "Lro0/d;", "Lm50/e;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<UserFacingEventResponse> serializer() {
            return a.f91254a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: m50.e$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001a\u0010B'\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÁ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"Lm50/e$c;", "", "", "seen1", "", "errorCode", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lm50/e$c;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getErrorCode$annotations", "()V", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class Error {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorCode;

        /* JADX INFO: renamed from: m50.e$c$a */
        @jn0.e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse.Error.$serializer", "Lvo0/e0;", "Lm50/e$c;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lm50/e$c;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lm50/e$c;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<Error> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f91256a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f91256a = aVar;
                m1 m1Var = new m1("com.stripe.android.financialconnections.model.UserFacingEventResponse.Error", aVar, 1);
                m1Var.o("error_code", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Error deserialize(uo0.e decoder) {
                String strT;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                int i11 = 1;
                v1 v1Var = null;
                if (cVarB.i()) {
                    strT = cVarB.t(descriptor2, 0);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    strT = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            strT = cVarB.t(descriptor2, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new Error(i11, strT, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, Error value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                Error.b(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                return new ro0.d[]{z1.f119730a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: m50.e$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm50/e$c$b;", "", "<init>", "()V", "Lro0/d;", "Lm50/e$c;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<Error> serializer() {
                return a.f91256a;
            }

            private Companion() {
            }
        }

        @jn0.e
        public /* synthetic */ Error(int i11, @o("error_code") String str, v1 v1Var) {
            if (1 != (i11 & 1)) {
                h1.b(i11, 1, a.f91256a.getDescriptor());
            }
            this.errorCode = str;
        }

        public static final /* synthetic */ void b(Error self, uo0.d output, f serialDesc) {
            output.e(serialDesc, 0, self.errorCode);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && s.f(this.errorCode, ((Error) other).errorCode);
        }

        public int hashCode() {
            return this.errorCode.hashCode();
        }

        public String toString() {
            return "Error(errorCode=" + this.errorCode + ")";
        }
    }

    /* JADX INFO: renamed from: m50.e$d, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001a\u0010B'\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÁ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"Lm50/e$d;", "", "", "seen1", "", "institutionName", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lm50/e$d;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInstitutionName$annotations", "()V", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class InstitutionSelected {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionName;

        /* JADX INFO: renamed from: m50.e$d$a */
        @jn0.e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse.InstitutionSelected.$serializer", "Lvo0/e0;", "Lm50/e$d;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lm50/e$d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lm50/e$d;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<InstitutionSelected> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f91258a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f91258a = aVar;
                m1 m1Var = new m1("com.stripe.android.financialconnections.model.UserFacingEventResponse.InstitutionSelected", aVar, 1);
                m1Var.o("institution_name", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InstitutionSelected deserialize(uo0.e decoder) {
                String strT;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                int i11 = 1;
                v1 v1Var = null;
                if (cVarB.i()) {
                    strT = cVarB.t(descriptor2, 0);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    strT = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            strT = cVarB.t(descriptor2, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new InstitutionSelected(i11, strT, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, InstitutionSelected value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                InstitutionSelected.b(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                return new ro0.d[]{z1.f119730a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: m50.e$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm50/e$d$b;", "", "<init>", "()V", "Lro0/d;", "Lm50/e$d;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<InstitutionSelected> serializer() {
                return a.f91258a;
            }

            private Companion() {
            }
        }

        @jn0.e
        public /* synthetic */ InstitutionSelected(int i11, @o("institution_name") String str, v1 v1Var) {
            if (1 != (i11 & 1)) {
                h1.b(i11, 1, a.f91258a.getDescriptor());
            }
            this.institutionName = str;
        }

        public static final /* synthetic */ void b(InstitutionSelected self, uo0.d output, f serialDesc) {
            output.e(serialDesc, 0, self.institutionName);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InstitutionSelected) && s.f(this.institutionName, ((InstitutionSelected) other).institutionName);
        }

        public int hashCode() {
            return this.institutionName.hashCode();
        }

        public String toString() {
            return "InstitutionSelected(institutionName=" + this.institutionName + ")";
        }
    }

    /* JADX INFO: renamed from: m50.e$e, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001a\u0010B%\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÁ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Lm50/e$e;", "", "", "seen1", "", "manualEntry", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(IZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lm50/e$e;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "getManualEntry$annotations", "()V", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class Success {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean manualEntry;

        /* JADX INFO: renamed from: m50.e$e$a */
        @jn0.e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse.Success.$serializer", "Lvo0/e0;", "Lm50/e$e;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lm50/e$e;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lm50/e$e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e0<Success> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f91260a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f91260a = aVar;
                m1 m1Var = new m1("com.stripe.android.financialconnections.model.UserFacingEventResponse.Success", aVar, 1);
                m1Var.o("manual_entry", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Success deserialize(uo0.e decoder) {
                boolean zW;
                s.k(decoder, "decoder");
                f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                int i11 = 1;
                if (cVarB.i()) {
                    zW = cVarB.w(descriptor2, 0);
                } else {
                    boolean z11 = true;
                    zW = false;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            zW = cVarB.w(descriptor2, 0);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new Success(i11, zW, null);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, Success value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                Success.b(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                return new ro0.d[]{h.f119620a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: m50.e$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm50/e$e$b;", "", "<init>", "()V", "Lro0/d;", "Lm50/e$e;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<Success> serializer() {
                return a.f91260a;
            }

            private Companion() {
            }
        }

        @jn0.e
        public /* synthetic */ Success(int i11, @o("manual_entry") boolean z11, v1 v1Var) {
            if (1 != (i11 & 1)) {
                h1.b(i11, 1, a.f91260a.getDescriptor());
            }
            this.manualEntry = z11;
        }

        public static final /* synthetic */ void b(Success self, uo0.d output, f serialDesc) {
            output.A(serialDesc, 0, self.manualEntry);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getManualEntry() {
            return this.manualEntry;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && this.manualEntry == ((Success) other).manualEntry;
        }

        public int hashCode() {
            return Boolean.hashCode(this.manualEntry);
        }

        public String toString() {
            return "Success(manualEntry=" + this.manualEntry + ")";
        }
    }

    @jn0.e
    public /* synthetic */ UserFacingEventResponse(int i11, @o("type") String str, @o("institution_selected") InstitutionSelected institutionSelected, @o(AnalyticsAttribute.Error) Error error, @o("success") Success success, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f91254a.getDescriptor());
        }
        this.type = str;
        if ((i11 & 2) == 0) {
            this.institutionSelected = null;
        } else {
            this.institutionSelected = institutionSelected;
        }
        if ((i11 & 4) == 0) {
            this.error = null;
        } else {
            this.error = error;
        }
        if ((i11 & 8) == 0) {
            this.success = null;
        } else {
            this.success = success;
        }
    }

    public static final /* synthetic */ void e(UserFacingEventResponse self, uo0.d output, f serialDesc) {
        output.e(serialDesc, 0, self.type);
        if (output.G(serialDesc, 1) || self.institutionSelected != null) {
            output.y(serialDesc, 1, InstitutionSelected.a.f91258a, self.institutionSelected);
        }
        if (output.G(serialDesc, 2) || self.error != null) {
            output.y(serialDesc, 2, Error.a.f91256a, self.error);
        }
        if (!output.G(serialDesc, 3) && self.success == null) {
            return;
        }
        output.y(serialDesc, 3, Success.a.f91260a, self.success);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InstitutionSelected getInstitutionSelected() {
        return this.institutionSelected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Success getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFacingEventResponse)) {
            return false;
        }
        UserFacingEventResponse userFacingEventResponse = (UserFacingEventResponse) other;
        return s.f(this.type, userFacingEventResponse.type) && s.f(this.institutionSelected, userFacingEventResponse.institutionSelected) && s.f(this.error, userFacingEventResponse.error) && s.f(this.success, userFacingEventResponse.success);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        InstitutionSelected institutionSelected = this.institutionSelected;
        int iHashCode2 = (iHashCode + (institutionSelected == null ? 0 : institutionSelected.hashCode())) * 31;
        Error error = this.error;
        int iHashCode3 = (iHashCode2 + (error == null ? 0 : error.hashCode())) * 31;
        Success success = this.success;
        return iHashCode3 + (success != null ? success.hashCode() : 0);
    }

    public String toString() {
        return "UserFacingEventResponse(type=" + this.type + ", institutionSelected=" + this.institutionSelected + ", error=" + this.error + ", success=" + this.success + ")";
    }
}
